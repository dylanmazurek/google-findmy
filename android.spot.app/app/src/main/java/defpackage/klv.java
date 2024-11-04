package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klv {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kgf d;
    public static final kuv e;
    public static final kuv f;
    public static final kuv g;
    public static final kuv h;
    private static final knb i;
    private static final knb j;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        i = b2;
        knb b3 = kgt.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        j = b3;
        a = new kgf((Object) klg.class, kgl.class, (Object) new kbx(13));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(16));
        e = new kuv(kli.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b3, kgk.class, (Object) new kbz(18));
        f = new kuv(klh.class, kgk.class, (byte[]) null);
        d = new kgf((Object) b2, kgk.class, (Object) new kfn() { // from class: klu
            @Override // defpackage.kfn
            public final ivc a(kgo kgoVar) {
                kgf kgfVar = klv.a;
                kgk kgkVar = (kgk) kgoVar;
                if (kgkVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    try {
                        lim limVar = ((kgk) kgoVar).c;
                        lja ljaVar = lja.a;
                        lkz lkzVar = lkz.a;
                        lja ljaVar2 = lja.a;
                        kjz kjzVar = kjz.i;
                        liq k = limVar.k();
                        ljn l = kjzVar.l();
                        try {
                            llg b4 = lkz.a.b(l);
                            b4.l(l, lir.p(k), ljaVar2);
                            b4.g(l);
                            try {
                                k.z(0);
                                ljn.A(l);
                                kjz kjzVar2 = (kjz) l;
                                if (kjzVar2.a == 0) {
                                    kka kkaVar = kjzVar2.b;
                                    if (kkaVar == null) {
                                        kkaVar = kka.e;
                                    }
                                    BigInteger a2 = klv.a(kkaVar.c);
                                    int bitLength = a2.bitLength();
                                    BigInteger a3 = klv.a(kkaVar.d);
                                    BigInteger bigInteger = klg.a;
                                    kld kldVar = new kld();
                                    kuv kuvVar = klv.h;
                                    kjy kjyVar = kkaVar.b;
                                    if (kjyVar == null) {
                                        kjyVar = kjy.d;
                                    }
                                    kiv b5 = kiv.b(kjyVar.a);
                                    if (b5 == null) {
                                        b5 = kiv.UNRECOGNIZED;
                                    }
                                    kldVar.b = (kle) kuvVar.p(b5);
                                    kuv kuvVar2 = klv.h;
                                    kjy kjyVar2 = kkaVar.b;
                                    if (kjyVar2 == null) {
                                        kjyVar2 = kjy.d;
                                    }
                                    kiv b6 = kiv.b(kjyVar2.b);
                                    if (b6 == null) {
                                        b6 = kiv.UNRECOGNIZED;
                                    }
                                    kldVar.c = (kle) kuvVar2.p(b6);
                                    kldVar.a = a3;
                                    kldVar.b(bitLength);
                                    kjy kjyVar3 = kkaVar.b;
                                    if (kjyVar3 == null) {
                                        kjyVar3 = kjy.d;
                                    }
                                    kldVar.c(kjyVar3.c);
                                    kldVar.d = (klf) klv.g.p(((kgk) kgoVar).e);
                                    kli L = jql.L(kldVar.a(), a2, ((kgk) kgoVar).f);
                                    ktd b7 = klv.b(kjzVar2.d);
                                    ktd b8 = klv.b(kjzVar2.e);
                                    ktd b9 = klv.b(kjzVar2.c);
                                    ktd b10 = klv.b(kjzVar2.f);
                                    ktd b11 = klv.b(kjzVar2.g);
                                    ktd b12 = klv.b(kjzVar2.h);
                                    BigInteger bigInteger2 = L.a.c;
                                    BigInteger bigInteger3 = L.b;
                                    Object obj = b7.a;
                                    Object obj2 = b8.a;
                                    Object obj3 = b9.a;
                                    Object obj4 = b10.a;
                                    Object obj5 = b11.a;
                                    Object obj6 = b12.a;
                                    if (((BigInteger) obj).isProbablePrime(10)) {
                                        if (((BigInteger) obj2).isProbablePrime(10)) {
                                            if (((BigInteger) obj).multiply((BigInteger) obj2).equals(bigInteger3)) {
                                                BigInteger subtract = ((BigInteger) obj).subtract(BigInteger.ONE);
                                                BigInteger subtract2 = ((BigInteger) obj2).subtract(BigInteger.ONE);
                                                if (bigInteger2.multiply((BigInteger) obj3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(BigInteger.ONE)) {
                                                    if (bigInteger2.multiply((BigInteger) obj4).mod(subtract).equals(BigInteger.ONE)) {
                                                        if (bigInteger2.multiply((BigInteger) obj5).mod(subtract2).equals(BigInteger.ONE)) {
                                                            if (((BigInteger) obj2).multiply((BigInteger) obj6).mod((BigInteger) obj).equals(BigInteger.ONE)) {
                                                                return new klh(L, b7, b8, b9, b10, b11, b12);
                                                            }
                                                            throw new GeneralSecurityException("qInv is invalid.");
                                                        }
                                                        throw new GeneralSecurityException("dQ is invalid.");
                                                    }
                                                    throw new GeneralSecurityException("dP is invalid.");
                                                }
                                                throw new GeneralSecurityException("D is invalid.");
                                            }
                                            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
                                        }
                                        throw new GeneralSecurityException("q is not a prime");
                                    }
                                    throw new GeneralSecurityException("p is not a prime");
                                }
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            } catch (ljy e2) {
                                throw e2;
                            }
                        } catch (IOException e3) {
                            if (e3.getCause() instanceof ljy) {
                                throw ((ljy) e3.getCause());
                            }
                            throw new ljy(e3);
                        } catch (RuntimeException e4) {
                            if (e4.getCause() instanceof ljy) {
                                throw ((ljy) e4.getCause());
                            }
                            throw e4;
                        } catch (ljy e5) {
                            if (e5.a) {
                                throw new ljy(e5);
                            }
                            throw e5;
                        } catch (llo e6) {
                            throw e6.a();
                        }
                    } catch (IllegalArgumentException | ljy unused) {
                        throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(kgkVar.a)));
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kjr.RAW, klf.d, hashMap, hashMap2);
        iuu.u(kjr.TINK, klf.a, hashMap, hashMap2);
        iuu.u(kjr.CRUNCHY, klf.b, hashMap, hashMap2);
        iuu.u(kjr.LEGACY, klf.c, hashMap, hashMap2);
        g = iuu.G(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        iuu.u(kiv.SHA256, kle.a, hashMap3, hashMap4);
        iuu.u(kiv.SHA384, kle.b, hashMap3, hashMap4);
        iuu.u(kiv.SHA512, kle.c, hashMap3, hashMap4);
        h = iuu.G(hashMap3, hashMap4);
    }

    public static BigInteger a(lim limVar) {
        return new BigInteger(1, limVar.A());
    }

    public static ktd b(lim limVar) {
        return new ktd(new BigInteger(1, limVar.A()));
    }
}
