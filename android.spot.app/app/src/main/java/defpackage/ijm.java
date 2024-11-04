package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijm {
    public static final /* synthetic */ int a = 0;
    private static final jjr b = jjr.p(16, 24, 32);
    private static final MessageDigest c;
    private static final Mac d;

    static {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            c = messageDigest;
            messageDigest.reset();
            d = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("System missing SHA-256 implementation.", e);
        }
    }

    public static lim a(lim limVar, lim limVar2) {
        boolean z;
        hwx.J(b.contains(Integer.valueOf(limVar.d())));
        boolean z2 = true;
        if (limVar2.d() % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            if (limVar2.d() <= 16) {
                z2 = false;
            }
            hwx.J(z2);
            byte[] A = limVar.A();
            byte[] A2 = limVar2.A();
            cipher.init(2, new SecretKeySpec(A, "AES"), new IvParameterSpec(A2, 0, 16));
            return lim.t(cipher.doFinal(A2, 16, A2.length - 16));
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }

    public static lim b(lim limVar, lim limVar2, lim limVar3) {
        try {
            byte[] A = limVar.A();
            if (A != null && A.length != 0) {
                nca h = nca.h(new SecretKeySpec(A, "AES"));
                byte[] A2 = limVar3.A();
                byte[] A3 = limVar2.A();
                if (A2 != null && A3 != null) {
                    int length = A3.length;
                    if (length >= 16) {
                        int i = length - 16;
                        byte[] copyOf = Arrays.copyOf(A3, i);
                        byte[] copyOfRange = Arrays.copyOfRange(A3, i, length);
                        byte[] f = h.f(0, A2);
                        byte[] f2 = h.f(1, new byte[0]);
                        byte[] f3 = h.f(2, copyOf);
                        byte b2 = 0;
                        for (int i2 = 0; i2 < 16; i2++) {
                            b2 = (byte) (b2 | (((copyOfRange[i2] ^ f[i2]) ^ f2[i2]) ^ f3[i2]));
                        }
                        if (b2 == 0) {
                            return lim.t(h.e(f, copyOf));
                        }
                        throw new jdg("The authentication tag is invalid.");
                    }
                    throw new jdg("cipherAndTag is too short.");
                }
                throw new IllegalArgumentException("Nonce and ciphertextAndTag must not be null.");
            }
            throw new InvalidKeyException("The secret key cannot be empty.");
        } catch (InvalidKeyException e) {
            e = e;
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (jdg e3) {
            throw new ijl(e3);
        }
    }

    public static lim c(lim limVar, lim limVar2) {
        return d(limVar, limVar2, 1);
    }

    public static lim d(lim limVar, lim limVar2, int i) {
        boolean z;
        hwx.J(b.contains(Integer.valueOf(limVar.d())));
        boolean z2 = true;
        if (limVar2.d() % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(i, new SecretKeySpec(limVar.A(), "AES"));
            ByteBuffer allocate = ByteBuffer.allocate(limVar2.d());
            if (cipher.doFinal(limVar2.m(), allocate) != limVar2.d()) {
                z2 = false;
            }
            hwx.U(z2);
            allocate.rewind();
            int remaining = allocate.remaining();
            lim.p(0, remaining, allocate.remaining());
            byte[] bArr = new byte[remaining];
            allocate.get(bArr);
            return new lik(bArr);
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }

    public static lim e(lim limVar, lim limVar2) {
        boolean z;
        hwx.J(b.contains(Integer.valueOf(limVar.d())));
        if (limVar2.d() > 12) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] A = limVar.A();
            byte[] A2 = limVar2.A();
            cipher.init(2, new SecretKeySpec(A, "AES"), new GCMParameterSpec(128, A2, 0, 12));
            return lim.t(cipher.doFinal(A2, 12, A2.length - 12));
        } catch (GeneralSecurityException e) {
            if (e instanceof AEADBadTagException) {
                throw new ijl(e);
            }
            throw new AssertionError(e);
        }
    }

    public static lim f(lim limVar, lim limVar2) {
        hwx.J(b.contains(Integer.valueOf(limVar.d())));
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            cipher.init(1, new SecretKeySpec(limVar.A(), "AES"), new GCMParameterSpec(128, bArr));
            return lim.t(bArr).r(lim.t(cipher.doFinal(limVar2.A())));
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }

    public static lim g(lim limVar, lim limVar2) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            keyAgreement.init(m(limVar));
            keyAgreement.doPhase(n(limVar2), true);
            return lim.t(keyAgreement.generateSecret());
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }

    public static synchronized lim h(lim limVar, lim limVar2) {
        lim t;
        synchronized (ijm.class) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(limVar.A(), "HmacSHA256");
            try {
                Mac mac = d;
                mac.init(secretKeySpec);
                mac.update(limVar2.m());
                t = lim.t(mac.doFinal());
            } catch (InvalidKeyException e) {
                throw new AssertionError(e);
            }
        }
        return t;
    }

    public static synchronized lim i(lim limVar) {
        lim t;
        synchronized (ijm.class) {
            MessageDigest messageDigest = c;
            messageDigest.update(limVar.m());
            t = lim.t(messageDigest.digest());
        }
        return t;
    }

    public static void j(Cipher cipher, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        boolean z;
        boolean z2 = true;
        hwx.J(true);
        if (byteBuffer2.hasArray() && byteBuffer2.array().length == 32) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        try {
            byteBuffer2.rewind();
            if (cipher.doFinal(byteBuffer, byteBuffer2) != 32) {
                z2 = false;
            }
            hwx.U(z2);
            byteBuffer2.rewind();
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }

    public static ijk k() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(256);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            lyn lynVar = new lyn((byte[]) null);
            lynVar.p(lim.t(generateKeyPair.getPrivate().getEncoded()));
            lynVar.q(lim.t(generateKeyPair.getPublic().getEncoded()));
            return lynVar.o();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("System missing RSA implementation.", e);
        }
    }

    public static Cipher l(lim limVar) {
        hwx.J(b.contains(Integer.valueOf(limVar.d())));
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(1, new SecretKeySpec(limVar.A(), "AES"));
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }

    private static Key m(lim limVar) {
        try {
            return KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(limVar.A()));
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }

    private static Key n(lim limVar) {
        try {
            return KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(limVar.A()));
        } catch (GeneralSecurityException e) {
            throw new AssertionError(e);
        }
    }
}
