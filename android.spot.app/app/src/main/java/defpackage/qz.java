package defpackage;

import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import javax.crypto.KeyGenerator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qz {
    public static KeyGenParameterSpec.Builder a(String str, int i) {
        return new KeyGenParameterSpec.Builder("androidxBiometric", 3);
    }

    public static KeyGenParameterSpec b(KeyGenParameterSpec.Builder builder) {
        KeyGenParameterSpec build;
        build = builder.build();
        return build;
    }

    public static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
        keyGenerator.init(keyGenParameterSpec);
    }

    public static void d(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }

    public static void e(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }

    public static final void f(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void g(String str) {
        throw new IllegalStateException(str);
    }

    public static final boolean h() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
