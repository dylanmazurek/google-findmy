package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.logging.Level;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jql {
    public static ECPoint A(EllipticCurve ellipticCurve, kmj kmjVar, byte[] bArr) {
        int t = t(ellipticCurve);
        int ordinal = kmjVar.ordinal();
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int i = t + t;
                    int length = bArr.length;
                    if (length == i) {
                        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, t)), new BigInteger(1, Arrays.copyOfRange(bArr, t, length)));
                        kfk.f(eCPoint, ellipticCurve);
                        return eCPoint;
                    }
                    throw new GeneralSecurityException("invalid point size");
                }
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(kmjVar))));
            }
            int i2 = t + 1;
            BigInteger d = kfk.d(ellipticCurve);
            int length2 = bArr.length;
            if (length2 == i2) {
                byte b = bArr[0];
                if (b != 2) {
                    if (b == 3) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(d) < 0) {
                    return new ECPoint(bigInteger, u(bigInteger, z, ellipticCurve));
                }
                throw new GeneralSecurityException("x is out of range");
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        int length3 = bArr.length;
        if (length3 == t + t + 1) {
            if (bArr[0] == 4) {
                int i3 = t + 1;
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i3)), new BigInteger(1, Arrays.copyOfRange(bArr, i3, length3)));
                kfk.f(eCPoint2, ellipticCurve);
                return eCPoint2;
            }
            throw new GeneralSecurityException("invalid point format");
        }
        throw new GeneralSecurityException("invalid point size");
    }

    public static void B(ECPublicKey eCPublicKey) {
        kfk.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static void C(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            if (kfk.g(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static boolean D(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = bArr.length;
        if (length < 8 || bArr[0] != 48) {
            return false;
        }
        int i6 = bArr[1] & 255;
        if (i6 == 129) {
            i6 = bArr[2] & 255;
            if (i6 < 128) {
                return false;
            }
            i = 2;
        } else {
            if (i6 == 128 || i6 > 129) {
                return false;
            }
            i = 1;
        }
        if (i6 != (length - 1) - i || bArr[i + 1] != 2 || (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) >= length || i2 == 0) {
            return false;
        }
        byte b = bArr[i3];
        if ((b & 255) >= 128) {
            return false;
        }
        if ((i2 > 1 && b == 0 && (bArr[i + 4] & 255) < 128) || bArr[i4] != 2) {
            return false;
        }
        int i7 = bArr[i5] & 255;
        if (i4 + 2 + i7 != length || i7 == 0) {
            return false;
        }
        byte b2 = bArr[i + 5 + i2];
        if ((b2 & 255) >= 128) {
            return false;
        }
        if (i7 > 1 && b2 == 0 && (bArr[i + 6 + i2] & 255) < 128) {
            return false;
        }
        return true;
    }

    public static byte[] E(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        C(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        kfk.f(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) kmn.g.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) kmn.e.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(kfk.d(curve)) < 0) {
                u(bigInteger, true, curve);
                return generateSecret;
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] F(EllipticCurve ellipticCurve, kmj kmjVar, ECPoint eCPoint) {
        kfk.f(eCPoint, ellipticCurve);
        int t = t(ellipticCurve);
        int ordinal = kmjVar.ordinal();
        if (ordinal != 0) {
            byte b = 2;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int i = t + t;
                    byte[] bArr = new byte[i];
                    byte[] v = iuu.v(eCPoint.getAffineX());
                    int length = v.length;
                    if (length > t) {
                        v = Arrays.copyOfRange(v, length - t, length);
                    }
                    byte[] v2 = iuu.v(eCPoint.getAffineY());
                    int length2 = v2.length;
                    if (length2 > t) {
                        v2 = Arrays.copyOfRange(v2, length2 - t, length2);
                    }
                    int length3 = v2.length;
                    System.arraycopy(v2, 0, bArr, i - length3, length3);
                    int length4 = v.length;
                    System.arraycopy(v, 0, bArr, t - length4, length4);
                    return bArr;
                }
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(kmjVar))));
            }
            int i2 = t + 1;
            byte[] bArr2 = new byte[i2];
            byte[] v3 = iuu.v(eCPoint.getAffineX());
            int length5 = v3.length;
            System.arraycopy(v3, 0, bArr2, i2 - length5, length5);
            if (true == eCPoint.getAffineY().testBit(0)) {
                b = 3;
            }
            bArr2[0] = b;
            return bArr2;
        }
        int i3 = t + 1;
        int i4 = t + t + 1;
        byte[] bArr3 = new byte[i4];
        byte[] v4 = iuu.v(eCPoint.getAffineX());
        byte[] v5 = iuu.v(eCPoint.getAffineY());
        int length6 = v5.length;
        System.arraycopy(v5, 0, bArr3, i4 - length6, length6);
        int length7 = v4.length;
        System.arraycopy(v4, 0, bArr3, i3 - length7, length7);
        bArr3[0] = 4;
        return bArr3;
    }

    public static byte[] G(byte[] bArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length || bArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2 = length - 1;
        }
        if ((bArr[i2] & 128) == 128) {
            i = 1;
        }
        int i3 = length - i2;
        byte[] bArr2 = new byte[i3 + i];
        System.arraycopy(bArr, i2, bArr2, i, i3);
        return bArr2;
    }

    public static void H(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i >= 0 && byteBuffer2.remaining() >= i && byteBuffer3.remaining() >= i && byteBuffer.remaining() >= i) {
            for (int i2 = 0; i2 < i; i2++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] I(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < bArr.length) {
                int length = bArr[i].length;
                if (i2 <= Integer.MAX_VALUE - length) {
                    i2 += length;
                    i++;
                } else {
                    throw new GeneralSecurityException("exceeded size limit");
                }
            } else {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length2);
                    i3 += length2;
                }
                return bArr2;
            }
        }
    }

    public static byte[] J(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return K(bArr, 0, bArr2, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static byte[] K(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr.length - i2 >= i && bArr2.length - i2 >= 0) {
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static kli L(klg klgVar, BigInteger bigInteger, Integer num) {
        knb a;
        int bitLength = bigInteger.bitLength();
        int i = klgVar.b;
        if (bitLength == i) {
            if (klgVar.a() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!klgVar.a() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            klf klfVar = klgVar.d;
            if (klfVar == klf.d) {
                a = kgb.a;
            } else if (klfVar != klf.c && klfVar != klf.b) {
                if (klfVar == klf.a) {
                    a = kgb.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(String.valueOf(klfVar))));
                }
            } else {
                a = kgb.a(num.intValue());
            }
            return new kli(klgVar, bigInteger, a);
        }
        throw new GeneralSecurityException(a.ad(i, bitLength, "Got modulus size ", ", but parameters requires modulus size "));
    }

    public static klb M(kkz kkzVar, BigInteger bigInteger, Integer num) {
        knb a;
        int bitLength = bigInteger.bitLength();
        int i = kkzVar.b;
        if (bitLength == i) {
            if (kkzVar.a() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!kkzVar.a() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            kky kkyVar = kkzVar.d;
            if (kkyVar == kky.d) {
                a = kgb.a;
            } else if (kkyVar != kky.c && kkyVar != kky.b) {
                if (kkyVar == kky.a) {
                    a = kgb.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(String.valueOf(kkyVar))));
                }
            } else {
                a = kgb.a(num.intValue());
            }
            return new klb(kkzVar, bigInteger, a);
        }
        throw new GeneralSecurityException(a.ad(i, bitLength, "Got modulus size ", ", but parameters requires modulus size "));
    }

    public static kkj N(kkh kkhVar, ECPoint eCPoint, Integer num) {
        knb a;
        kfk.f(eCPoint, kkhVar.b.e.getCurve());
        if (kkhVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!kkhVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        kkg kkgVar = kkhVar.d;
        if (kkgVar == kkg.d) {
            a = kgb.a;
        } else if (kkgVar != kkg.c && kkgVar != kkg.b) {
            if (kkgVar == kkg.a) {
                a = kgb.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(kkgVar.e));
            }
        } else {
            a = kgb.a(num.intValue());
        }
        return new kkj(kkhVar, eCPoint, a);
    }

    public static kkh O(kkf kkfVar, kkd kkdVar, kke kkeVar, kkg kkgVar) {
        if (kkdVar != null) {
            if (kkdVar == kkd.a && kkeVar != kke.a) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (kkdVar == kkd.b && kkeVar != kke.b && kkeVar != kke.c) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (kkdVar == kkd.c && kkeVar != kke.c) {
                throw new GeneralSecurityException("NIST_P521 requires SHA512");
            }
            return new kkh(kkfVar, kkdVar, kkeVar, kkgVar);
        }
        throw new GeneralSecurityException("EC curve type is not set");
    }

    public static byte[] P(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] Q(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            int i = 0;
            while (i < 16) {
                int i2 = i + 1;
                byte b = bArr[i];
                byte b2 = (byte) ((b + b) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b2);
                }
                i = i2;
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static int d(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }

    public static String e(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(String.valueOf(str));
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static void f(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean g(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean h(int i, jns jnsVar, StringBuilder sb) {
        if (i - 1 != 0 || jnsVar == jns.a) {
            return false;
        }
        sb.append(jnsVar.b());
        sb.append('.');
        sb.append(jnsVar.d());
        sb.append(':');
        sb.append(jnsVar.a());
        return true;
    }

    public static char[] i(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    public static boolean j(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = jmb.a;
            }
        } else if (iterable instanceof jmt) {
            comparator2 = ((jmt) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }

    public static int k(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static jjr l(Enum r0, Enum... enumArr) {
        return jim.h(EnumSet.of(r0, enumArr));
    }

    public static HashSet m(int i) {
        int i2;
        if (i < 3) {
            hwx.D(i, "expectedSize");
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) Math.ceil(i / 0.75d);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new HashSet(i2);
    }

    public static Set n() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean o(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean p(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof jma) {
            collection = ((jma) collection).a();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return hzc.S(set.iterator(), collection);
        }
        return q(set, collection.iterator());
    }

    public static boolean q(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static String r(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }

    public static byte[] s(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i] = (byte) ((digit * 16) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static int t(EllipticCurve ellipticCurve) {
        return (kfk.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger u(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger d = kfk.d(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(d);
        if (d.signum() == 1) {
            BigInteger mod2 = mod.mod(d);
            if (mod2.equals(BigInteger.ZERO)) {
                bigInteger3 = BigInteger.ZERO;
            } else {
                if (d.testBit(0) && d.testBit(1)) {
                    bigInteger2 = mod2.modPow(d.add(BigInteger.ONE).shiftRight(2), d);
                } else {
                    bigInteger2 = null;
                    if (d.testBit(0) && !d.testBit(1)) {
                        BigInteger bigInteger4 = BigInteger.ONE;
                        BigInteger shiftRight = d.subtract(BigInteger.ONE).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(d);
                            if (!mod3.equals(BigInteger.ZERO)) {
                                BigInteger modPow = mod3.modPow(shiftRight, d);
                                if (modPow.add(BigInteger.ONE).equals(d)) {
                                    BigInteger shiftRight2 = d.add(BigInteger.ONE).shiftRight(1);
                                    BigInteger bigInteger5 = BigInteger.ONE;
                                    BigInteger bigInteger6 = bigInteger4;
                                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                        BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                        BigInteger mod4 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(d).multiply(mod3)).mod(d);
                                        BigInteger mod5 = multiply.add(multiply).mod(d);
                                        if (shiftRight2.testBit(bitLength)) {
                                            BigInteger mod6 = mod4.multiply(bigInteger4).add(mod5.multiply(mod3)).mod(d);
                                            bigInteger5 = bigInteger4.multiply(mod5).add(mod4).mod(d);
                                            bigInteger6 = mod6;
                                        } else {
                                            bigInteger6 = mod4;
                                            bigInteger5 = mod5;
                                        }
                                    }
                                    bigInteger2 = bigInteger6;
                                } else if (modPow.equals(BigInteger.ONE)) {
                                    bigInteger4 = bigInteger4.add(BigInteger.ONE);
                                    i++;
                                    if (i == 128 && !d.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                bigInteger3 = bigInteger4;
                                break;
                            }
                        }
                    }
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(d).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger3 = bigInteger2;
            }
            if (z != bigInteger3.testBit(0)) {
                return d.subtract(bigInteger3).mod(d);
            }
            return bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static KeyPair v(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) kmn.f.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKey w(kmh kmhVar, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) kmn.g.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), z(kmhVar)));
    }

    public static ECPublicKey x(kmh kmhVar, kmj kmjVar, byte[] bArr) {
        ECParameterSpec z = z(kmhVar);
        return (ECPublicKey) ((KeyFactory) kmn.g.a("EC")).generatePublic(new ECPublicKeySpec(A(z.getCurve(), kmjVar, bArr), z));
    }

    public static ECPublicKey y(kmh kmhVar, byte[] bArr, byte[] bArr2) {
        ECParameterSpec z = z(kmhVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        kfk.f(eCPoint, z.getCurve());
        return (ECPublicKey) ((KeyFactory) kmn.g.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, z));
    }

    public static ECParameterSpec z(kmh kmhVar) {
        int ordinal = kmhVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return kfk.c;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(String.valueOf(kmhVar))));
            }
            return kfk.b;
        }
        return kfk.a;
    }

    public jpa a() {
        return joz.a;
    }

    public jqs b() {
        return jqs.b;
    }

    public void c(String str, Level level, boolean z) {
    }
}
