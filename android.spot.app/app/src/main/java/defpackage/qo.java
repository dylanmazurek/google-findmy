package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }

    public static final vd b(double d) {
        if (d < 0.0d) {
            return new vd(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new vd(Math.sqrt(d), 0.0d);
    }

    public static void c(azz azzVar) {
        azzVar.bR();
    }

    public static void d(azz azzVar) {
        azzVar.bR();
    }
}
