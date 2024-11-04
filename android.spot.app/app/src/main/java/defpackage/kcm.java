package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcm {
    private static final ThreadLocal a = new kcl();

    public static AlgorithmParameterSpec a(byte[] bArr) {
        Integer valueOf;
        if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        }
        if (valueOf != null) {
            valueOf.intValue();
        }
        return new GCMParameterSpec(128, bArr, 0, bArr.length);
    }

    public static Cipher b() {
        return (Cipher) a.get();
    }

    public static SecretKey c(byte[] bArr) {
        kna.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
