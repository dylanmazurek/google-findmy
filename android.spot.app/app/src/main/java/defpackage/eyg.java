package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyg {
    private static final jnk a = jnk.l("com/google/android/apps/adm/util/EncryptedLocationUtils");

    public static jer a(lqr lqrVar, lim limVar) {
        lqh lqhVar;
        boolean z;
        boolean z2;
        if (lqrVar.b == 2) {
            lqhVar = (lqh) lqrVar.c;
        } else {
            lqhVar = lqh.c;
        }
        lim limVar2 = lqhVar.a;
        lim limVar3 = lqhVar.b;
        try {
            try {
                boolean z3 = true;
                if (limVar.d() == 16) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.J(z);
                if (limVar2.d() % 16 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hwx.J(z2);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                if (limVar2.d() <= 16) {
                    z3 = false;
                }
                hwx.J(z3);
                byte[] A = limVar.A();
                byte[] A2 = limVar2.A();
                cipher.init(2, new SecretKeySpec(A, "AES"), new IvParameterSpec(limVar3.A(), 0, limVar3.d()));
                lim t = lim.t(cipher.doFinal(A2, 0, A2.length));
                lja a2 = lja.a();
                lps lpsVar = lps.d;
                liq k = t.k();
                ljn l = lpsVar.l();
                try {
                    llg b = lkz.a.b(l);
                    b.l(l, lir.p(k), a2);
                    b.g(l);
                    try {
                        k.z(0);
                        ljn.A(l);
                        return jer.i((lps) l);
                    } catch (ljy e) {
                        throw e;
                    }
                } catch (ljy e2) {
                    if (e2.a) {
                        throw new ljy(e2);
                    }
                    throw e2;
                } catch (IOException e3) {
                    if (e3.getCause() instanceof ljy) {
                        throw ((ljy) e3.getCause());
                    }
                    throw new ljy(e3);
                } catch (llo e4) {
                    throw e4.a();
                } catch (RuntimeException e5) {
                    if (e5.getCause() instanceof ljy) {
                        throw ((ljy) e5.getCause());
                    }
                    throw e5;
                }
            } catch (GeneralSecurityException e6) {
                ((jni) ((jni) ((jni) a.f()).i(e6)).j("com/google/android/apps/adm/util/EncryptedLocationUtils", "getDecryptedLocation", '7', "EncryptedLocationUtils.java")).r("Could not decrypt location");
                return jdl.a;
            }
        } catch (ljy e7) {
            ((jni) ((jni) ((jni) a.f()).i(e7)).j("com/google/android/apps/adm/util/EncryptedLocationUtils", "getDecryptedLocation", ':', "EncryptedLocationUtils.java")).r("Cannot parse decrypted location as CleartextLocation");
            return jdl.a;
        }
    }

    public static lim b(Random random) {
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        return lim.t(bArr);
    }
}
