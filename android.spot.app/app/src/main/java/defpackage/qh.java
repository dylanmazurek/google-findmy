package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qh {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        int authenticationType;
        authenticationType = authenticationResult.getAuthenticationType();
        return authenticationType;
    }

    public static /* synthetic */ vu b(float f, Object obj, int i) {
        float f2;
        if (1 != (i & 1)) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        if ((i & 2) != 0) {
            f = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new vu(f2, f, obj);
    }

    public static /* synthetic */ wn c(int i, vg vgVar, int i2) {
        if ((i2 & 4) != 0) {
            vgVar = vi.a;
        }
        if (1 == (i2 & 1)) {
            i = 300;
        }
        return new wn(i, 0, vgVar);
    }

    public static final long d(float f, boolean z) {
        long j;
        long floatToIntBits = Float.floatToIntBits(f);
        if (true != z) {
            j = 0;
        } else {
            j = 1;
        }
        return j | (floatToIntBits << 32);
    }

    public static final void e(aya ayaVar) {
        if (ayaVar.bX().t) {
            qg.g(ayaVar, 1).ab();
        }
    }
}
