package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdc implements jzw {
    private static final byte[] a = jql.s("7a806c");
    private static final byte[] b = jql.s("46bb91c3c5");
    private static final byte[] c = jql.s("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] d = jql.s("bae8e37fc83441b16034566b");
    private static final byte[] e = jql.s("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    static {
        new kdb();
    }

    public kdc(byte[] bArr) {
        kna.a(bArr.length);
        new SecretKeySpec(bArr, "AES");
    }

    public static boolean a(Cipher cipher) {
        try {
            byte[] bArr = d;
            cipher.init(2, new SecretKeySpec(c, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(b);
            byte[] bArr2 = e;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), a);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
