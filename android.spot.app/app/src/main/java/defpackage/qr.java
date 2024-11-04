package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.adm.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qr extends ag {
    public qy a;
    public final Handler b = new Handler(Looper.getMainLooper());

    private final void aJ() {
        this.a.f = false;
        if (au()) {
            be H = H();
            rg rgVar = (rg) H.f("androidx.biometric.FingerprintDialogFragment");
            if (rgVar != null) {
                if (rgVar.au()) {
                    rgVar.e();
                    return;
                }
                f fVar = new f(H);
                fVar.k(rgVar);
                fVar.i();
            }
        }
    }

    private final boolean aK() {
        return this.m.getBoolean("host_activity", true);
    }

    @Override // defpackage.ag
    public final void Y(int i, int i2, Intent intent) {
        super.Y(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            qy qyVar = this.a;
            qyVar.h = false;
            if (i2 == -1) {
                if (qyVar.k) {
                    qyVar.k = false;
                    i3 = -1;
                }
                aI(new kvw((Object) null, i3));
                return;
            }
            o(10, T(R.string.generic_error_user_canceled));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        if (i == 3 || !this.a.j) {
            if (aG()) {
                this.a.e = i;
                if (i == 1) {
                    ku.b(x(), 10);
                    aH();
                }
            }
            maf n = this.a.n();
            Object obj = n.a;
            if (obj != null) {
                try {
                    ((CancellationSignal) obj).cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                n.a = null;
            }
            Object obj2 = n.c;
            if (obj2 != null) {
                try {
                    synchronized (obj2) {
                        if (!((bsu) obj2).a) {
                            ((bsu) obj2).a = true;
                            Object obj3 = ((bsu) obj2).b;
                            if (obj3 != null) {
                                try {
                                    ((CancellationSignal) obj3).cancel();
                                } catch (Throwable th) {
                                    synchronized (obj2) {
                                        obj2.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (obj2) {
                                obj2.notifyAll();
                            }
                        }
                    }
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                n.c = null;
            }
        }
    }

    public final boolean aF() {
        if (Build.VERSION.SDK_INT <= 28 && ja.b(this.a.a())) {
            return true;
        }
        return false;
    }

    public final boolean aG() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (x() != null) {
                qu quVar = this.a.a;
            }
            if (Build.VERSION.SDK_INT != 28 || r()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void aH() {
        qy qyVar = this.a;
        if (qyVar.h) {
            return;
        }
        if (!qyVar.g) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            qyVar.g = false;
            new nna(1).execute(new nl(this, 8));
        }
    }

    public final void aI(kvw kvwVar) {
        qy qyVar = this.a;
        if (!qyVar.g) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            qyVar.g = false;
            new nna(1).execute(new nl(this, 10));
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        aJ();
        qy qyVar = this.a;
        qyVar.f = false;
        if (!qyVar.h && au()) {
            f fVar = new f(H());
            fVar.k(this);
            fVar.i();
        }
        Context x = x();
        if (x != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && kk.b(x, str, R.array.delay_showing_prompt_models)) {
                qy qyVar2 = this.a;
                qyVar2.i = true;
                this.b.postDelayed(new qq(qyVar2, 0), 600L);
            }
        }
    }

    public final void e() {
        KeyguardManager keyguardManager;
        Context x = x();
        if (x != null) {
            keyguardManager = kv.c(x);
        } else {
            keyguardManager = null;
        }
        if (keyguardManager == null) {
            o(12, T(R.string.generic_error_no_keyguard));
            return;
        }
        Intent a = ql.a(keyguardManager, this.a.d(), null);
        if (a == null) {
            o(14, T(R.string.generic_error_no_device_credential));
            return;
        }
        this.a.h = true;
        if (aG()) {
            aJ();
        }
        a.setFlags(134742016);
        startActivityForResult(a, 1);
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (this.a == null) {
            this.a = ji.c(this, aK());
        }
        new WeakReference(E());
        qy qyVar = this.a;
        if (qyVar.l == null) {
            qyVar.l = new cfn();
        }
        qyVar.l.g(this, new qk(this, 0));
        qy qyVar2 = this.a;
        if (qyVar2.m == null) {
            qyVar2.m = new cfn();
        }
        qyVar2.m.g(this, new qk(this, 2));
        qy qyVar3 = this.a;
        if (qyVar3.n == null) {
            qyVar3.n = new cfn();
        }
        qyVar3.n.g(this, new qk(this, 3));
        qy qyVar4 = this.a;
        if (qyVar4.o == null) {
            qyVar4.o = new cfn();
        }
        qyVar4.o.g(this, new qk(this, 4));
        qy qyVar5 = this.a;
        if (qyVar5.p == null) {
            qyVar5.p = new cfn();
        }
        qyVar5.p.g(this, new qk(this, 5));
        qy qyVar6 = this.a;
        if (qyVar6.q == null) {
            qyVar6.q = new cfn();
        }
        qyVar6.q.g(this, new qk(this, 6));
        qy qyVar7 = this.a;
        if (qyVar7.s == null) {
            qyVar7.s = new cfn();
        }
        qyVar7.s.g(this, new qk(this, 1));
    }

    @Override // defpackage.ag
    public final void k() {
        super.k();
        if (Build.VERSION.SDK_INT == 29 && ja.b(this.a.a())) {
            qy qyVar = this.a;
            qyVar.j = true;
            this.b.postDelayed(new qq(qyVar, 2, null), 250L);
        }
    }

    @Override // defpackage.ag
    public final void l() {
        super.l();
        if (Build.VERSION.SDK_INT < 29 && !this.a.h) {
            aj E = E();
            if (E == null || !E.isChangingConfigurations()) {
                a(0);
            }
        }
    }

    public final void o(int i, CharSequence charSequence) {
        aH();
        d();
    }

    public final void p(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = T(R.string.default_error_msg);
        }
        this.a.i(2);
        this.a.h(charSequence);
    }

    public final void q() {
        String str;
        int i;
        Object obj;
        FingerprintManager c;
        qy qyVar = this.a;
        if (!qyVar.f) {
            if (x() == null) {
                Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
                return;
            }
            qyVar.f = true;
            qyVar.g = true;
            Context x = x();
            if (x != null) {
                String str2 = Build.MANUFACTURER;
                if (Build.VERSION.SDK_INT == 29 && !kk.d(x, str2, R.array.keyguard_biometric_and_credential_exclude_vendors)) {
                    int a = this.a.a();
                    if (ja.d(a) && ja.b(a)) {
                        this.a.k = true;
                        e();
                        return;
                    }
                }
            }
            if (aG()) {
                Context applicationContext = y().getApplicationContext();
                buw buwVar = new buw(applicationContext);
                if (!buwVar.d()) {
                    i = 12;
                } else if (!buwVar.c()) {
                    i = 11;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    o(i, ku.b(applicationContext, i));
                    return;
                }
                if (au()) {
                    this.a.r = true;
                    if (!kk.e(applicationContext, Build.MODEL)) {
                        this.b.postDelayed(new nl(this, 9), 500L);
                        boolean aK = aK();
                        rg rgVar = new rg();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("host_activity", aK);
                        rgVar.ak(bundle);
                        rgVar.q(H(), "androidx.biometric.FingerprintDialogFragment");
                    }
                    qy qyVar2 = this.a;
                    qyVar2.e = 0;
                    qu quVar = qyVar2.a;
                    maf n = this.a.n();
                    if (n.c == null) {
                        Object obj2 = n.b;
                        n.c = new bsu();
                    }
                    Object obj3 = n.c;
                    maf o = this.a.o();
                    if (o.c == null) {
                        o.c = new njz(o, null);
                    }
                    Object obj4 = o.c;
                    if (obj3 != null) {
                        try {
                            synchronized (obj3) {
                                if (((bsu) obj3).b == null) {
                                    ((bsu) obj3).b = new CancellationSignal();
                                    if (((bsu) obj3).a) {
                                        ((CancellationSignal) ((bsu) obj3).b).cancel();
                                    }
                                }
                                obj = ((bsu) obj3).b;
                            }
                        } catch (NullPointerException e) {
                            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                            o(1, ku.b(applicationContext, 1));
                            return;
                        }
                    } else {
                        obj = null;
                    }
                    if (Build.VERSION.SDK_INT >= 23 && (c = bsn.c((Context) buwVar.a)) != null) {
                        bsn.e(c, bsn.b(null), (CancellationSignal) obj, 0, new bsm((njz) obj4), null);
                        return;
                    }
                    return;
                }
                return;
            }
            BiometricPrompt.Builder a2 = qm.a(y().getApplicationContext());
            CharSequence d = this.a.d();
            if (d != null) {
                qm.h(a2, d);
            }
            CharSequence b = this.a.b();
            if (!TextUtils.isEmpty(b)) {
                nna nnaVar = new nna(1);
                qy qyVar3 = this.a;
                if (qyVar3.b == null) {
                    qyVar3.b = new qx(qyVar3, 0);
                }
                qm.f(a2, b, nnaVar, qyVar3.b);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                bet betVar = this.a.x;
                qn.a(a2, true);
            }
            int a3 = this.a.a();
            if (Build.VERSION.SDK_INT >= 30) {
                qo.a(a2, a3);
            } else if (Build.VERSION.SDK_INT >= 29) {
                qn.b(a2, ja.b(a3));
            }
            if (Build.VERSION.SDK_INT >= 35) {
                bet betVar2 = this.a.x;
                new nna(1);
                qy qyVar4 = this.a;
                if (qyVar4.c == null) {
                    qyVar4.c = new qx(qyVar4, 1, null);
                }
                DialogInterface.OnClickListener onClickListener = qyVar4.c;
            }
            BiometricPrompt b2 = qm.b(a2);
            Context x2 = x();
            qu quVar2 = this.a.a;
            BiometricPrompt.CryptoObject c2 = jy.c(null);
            maf n2 = this.a.n();
            if (n2.a == null) {
                Object obj5 = n2.b;
                n2.a = new CancellationSignal();
            }
            Object obj6 = n2.a;
            qp qpVar = new qp(0);
            maf o2 = this.a.o();
            if (o2.a == null) {
                o2.a = qg.a((qi) o2.b);
            }
            Object obj7 = o2.a;
            try {
                if (c2 == null) {
                    qm.c(b2, (CancellationSignal) obj6, qpVar, he$$ExternalSyntheticApiModelOutline0.m126m(obj7));
                } else {
                    qm.d(b2, c2, (CancellationSignal) obj6, qpVar, he$$ExternalSyntheticApiModelOutline0.m126m(obj7));
                }
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                if (x2 != null) {
                    str = x2.getString(R.string.default_error_msg);
                } else {
                    str = "";
                }
                o(1, str);
            }
        }
    }

    public final boolean r() {
        return this.m.getBoolean("has_fingerprint", la.c(x()));
    }
}
