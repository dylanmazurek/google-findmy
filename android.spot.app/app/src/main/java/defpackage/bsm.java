package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsm extends FingerprintManager.AuthenticationCallback {
    final /* synthetic */ njz a;

    public bsm(njz njzVar) {
        this.a = njzVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((qi) ((maf) this.a.a).b).a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        ((qi) ((maf) this.a.a).b).b();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        qw qwVar = (qw) ((maf) this.a.a).b;
        if (qwVar.a.get() != null) {
            qy qyVar = (qy) qwVar.a.get();
            if (qyVar.n == null) {
                qyVar.n = new cfn();
            }
            qy.l(qyVar.n, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        bso d = bsn.d(bsn.a(authenticationResult));
        qu quVar = null;
        if (d != null) {
            Object obj = d.b;
            if (obj != null) {
                quVar = new qu((Cipher) obj);
            } else {
                Object obj2 = d.a;
                if (obj2 != null) {
                    quVar = new qu((Signature) obj2);
                } else {
                    Object obj3 = d.c;
                    if (obj3 != null) {
                        quVar = new qu((Mac) obj3);
                    }
                }
            }
        }
        njz njzVar = this.a;
        ((qi) ((maf) njzVar.a).b).g(new kvw(quVar, 2));
    }
}
