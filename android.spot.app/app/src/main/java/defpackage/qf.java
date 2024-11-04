package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qf extends BiometricPrompt.AuthenticationCallback {
    final /* synthetic */ qi a;

    public qf(qi qiVar) {
        this.a = qiVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        this.a.b();
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject b;
        PresentationSession b2;
        IdentityCredential b3;
        qu quVar = null;
        if (authenticationResult != null && (b = qg.b(authenticationResult)) != null) {
            Cipher e = ra.e(b);
            if (e != null) {
                quVar = new qu(e);
            } else {
                Signature d = ra.d(b);
                if (d != null) {
                    quVar = new qu(d);
                } else {
                    Mac f = ra.f(b);
                    if (f != null) {
                        quVar = new qu(f);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b3 = rb.b(b)) != null) {
                        quVar = new qu(b3);
                    } else if (Build.VERSION.SDK_INT >= 33 && (b2 = rc.b(b)) != null) {
                        quVar = new qu(b2);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        long a = rd.a(b);
                        if (a != 0) {
                            quVar = new qu(a);
                        }
                    }
                }
            }
        }
        int i = -1;
        if (Build.VERSION.SDK_INT >= 30) {
            if (authenticationResult != null) {
                i = qh.a(authenticationResult);
            }
        } else if (Build.VERSION.SDK_INT != 29) {
            i = 2;
        }
        this.a.g(new kvw(quVar, i));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
