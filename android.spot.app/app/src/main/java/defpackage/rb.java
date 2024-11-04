package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rb {
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        identityCredential = cryptoObject.getIdentityCredential();
        return identityCredential;
    }

    public static boolean c(wc wcVar, Object obj, Object obj2) {
        if (amr.i(obj, wcVar.a()) && amr.i(obj2, wcVar.b())) {
            return true;
        }
        return false;
    }

    public static final String d(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        format.getClass();
        sb.append(format);
        return sb.toString();
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f3 * f8) - (f4 * f7);
        float f18 = (f9 * f14) - (f10 * f13);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f9 * f15) - (f11 * f13);
        float f21 = (f2 * f7) - (f3 * f6);
        float f22 = (f9 * f16) - (f12 * f13);
        float f23 = (f * f8) - (f4 * f5);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f * f7) - (f3 * f5);
        float f26 = (f10 * f16) - (f12 * f14);
        float f27 = (f * f6) - (f2 * f5);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f27 * f28) - (f25 * f26)) + (f23 * f24)) + (f21 * f22)) - (f19 * f20)) + (f17 * f18);
        if (f29 == 0.0f) {
            return false;
        }
        float f30 = 1.0f / f29;
        fArr2[0] = (((f6 * f28) - (f7 * f26)) + (f8 * f24)) * f30;
        fArr2[1] = ((((-f2) * f28) + (f3 * f26)) - (f4 * f24)) * f30;
        fArr2[2] = (((f14 * f17) - (f15 * f19)) + (f16 * f21)) * f30;
        fArr2[3] = ((((-f10) * f17) + (f11 * f19)) - (f12 * f21)) * f30;
        float f31 = -f5;
        fArr2[4] = (((f31 * f28) + (f7 * f22)) - (f8 * f20)) * f30;
        fArr2[5] = (((f28 * f) - (f3 * f22)) + (f4 * f20)) * f30;
        float f32 = -f13;
        fArr2[6] = (((f32 * f17) + (f15 * f23)) - (f16 * f25)) * f30;
        fArr2[7] = (((f17 * f9) - (f11 * f23)) + (f12 * f25)) * f30;
        fArr2[8] = (((f5 * f26) - (f6 * f22)) + (f8 * f18)) * f30;
        fArr2[9] = ((((-f) * f26) + (f22 * f2)) - (f4 * f18)) * f30;
        fArr2[10] = (((f13 * f19) - (f14 * f23)) + (f16 * f27)) * f30;
        fArr2[11] = ((((-f9) * f19) + (f23 * f10)) - (f12 * f27)) * f30;
        fArr2[12] = (((f31 * f24) + (f6 * f20)) - (f7 * f18)) * f30;
        fArr2[13] = (((f * f24) - (f2 * f20)) + (f3 * f18)) * f30;
        fArr2[14] = (((f32 * f21) + (f14 * f25)) - (f15 * f27)) * f30;
        fArr2[15] = (((f9 * f21) - (f10 * f25)) + (f11 * f27)) * f30;
        return true;
    }
}
