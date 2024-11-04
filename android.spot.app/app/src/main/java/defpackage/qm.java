package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.Builder a(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt b(BiometricPrompt.Builder builder) {
        BiometricPrompt build;
        build = builder.build();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
    }

    static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static final float[] i() {
        float[] fArr = vc.a;
        if (fArr != null) {
            return fArr;
        }
        vc.a = new float[91];
        float[] fArr2 = vc.a;
        fArr2.getClass();
        return fArr2;
    }

    public static final void j(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    public static final void k(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
