package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qn {
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }

    public static /* synthetic */ int c(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public static final void d(aow aowVar, mnw mnwVar) {
        azs azsVar = aowVar.p;
        if (azsVar == null) {
            azsVar = new azs((aqh) aowVar);
            aowVar.p = azsVar;
        }
        qg.i(aowVar).l.d(azsVar, azs.a, mnwVar);
    }

    public static final aow e(axw axwVar, int i) {
        aow aowVar = axwVar.bX().o;
        if (aowVar != null && (aowVar.m & i) != 0) {
            while (aowVar != null) {
                int i2 = aowVar.l;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) == 0) {
                    aowVar = aowVar.o;
                } else {
                    return aowVar;
                }
            }
        }
        return null;
    }
}
