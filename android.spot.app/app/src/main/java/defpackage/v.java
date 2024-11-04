package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class v extends ag implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler af;
    private boolean al;
    private boolean an;
    private boolean ao;
    private boolean ap;
    public Dialog d;
    private final Runnable ag = new w(this, 1, null);
    private final DialogInterface.OnCancelListener ah = new s(this);
    public final DialogInterface.OnDismissListener a = new t(this);
    private int ai = 0;
    public int b = 0;
    private boolean aj = true;
    public boolean c = true;
    private int ak = -1;
    private final cfo am = new re(this, 1);
    public boolean e = false;

    private final void aF(boolean z, boolean z2) {
        if (this.ao) {
            return;
        }
        this.ao = true;
        this.ap = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.af.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.af.post(this.ag);
                }
            }
        }
        this.an = true;
        if (this.ak >= 0) {
            be H = H();
            int i = this.ak;
            if (i >= 0) {
                H.G(new bc(H, i, 1), z);
                this.ak = -1;
                return;
            }
            throw new IllegalArgumentException(a.ae(i, "Bad id: "));
        }
        f fVar = new f(H());
        fVar.v();
        fVar.k(this);
        if (z) {
            fVar.i();
        } else {
            fVar.h();
        }
    }

    public Dialog a(Bundle bundle) {
        if (be.Z(3)) {
            toString();
        }
        return new od(y(), this.b);
    }

    @Override // defpackage.ag
    public LayoutInflater cO(Bundle bundle) {
        LayoutInflater aA = aA();
        if (this.c && !this.al) {
            if (!this.e) {
                try {
                    this.al = true;
                    Dialog a = a(bundle);
                    this.d = a;
                    if (this.c) {
                        p(a, this.ai);
                        Context x = x();
                        if (x instanceof Activity) {
                            this.d.setOwnerActivity((Activity) x);
                        }
                        this.d.setCancelable(this.aj);
                        this.d.setOnCancelListener(this.ah);
                        this.d.setOnDismissListener(this.a);
                        this.e = true;
                    } else {
                        this.d = null;
                    }
                } finally {
                    this.al = false;
                }
            }
            if (be.Z(2)) {
                toString();
            }
            Dialog dialog = this.d;
            if (dialog != null) {
                return aA.cloneInContext(dialog.getContext());
            }
        } else if (be.Z(2)) {
            toString();
        }
        return aA;
    }

    public final void cs(be beVar, String str) {
        this.ao = false;
        this.ap = true;
        f fVar = new f(beVar);
        fVar.v();
        fVar.q(this, str);
        fVar.b();
    }

    @Override // defpackage.ag
    public final void ct() {
        super.ct();
        if (!this.ap && !this.ao) {
            this.ao = true;
        }
        this.Z.j(this.am);
    }

    @Override // defpackage.ag
    public final al cw() {
        return new u(this, new z(this));
    }

    public void d() {
        aF(false, false);
    }

    public final void e() {
        aF(true, false);
    }

    @Override // defpackage.ag
    public void f(Context context) {
        super.f(context);
        this.Z.h(this.am);
        if (!this.ap) {
            this.ao = false;
        }
    }

    @Override // defpackage.ag
    public void g(Bundle bundle) {
        boolean z;
        super.g(bundle);
        this.af = new Handler();
        if (this.F == 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (bundle != null) {
            this.ai = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.aj = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.ak = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.ag
    public void h() {
        super.h();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.an = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.ao) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    @Override // defpackage.ag
    public void j(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.ai;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.aj) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.ak;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.ag
    public void k() {
        super.k();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.an = false;
            dialog.show();
            View decorView = this.d.getWindow().getDecorView();
            bty.e(decorView, this);
            buu.g(decorView, this);
            bza.d(decorView, this);
        }
    }

    @Override // defpackage.ag
    public void l() {
        super.l();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.ag
    public final void m(Bundle bundle) {
        Bundle bundle2;
        super.m(bundle);
        if (this.d != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.d.onRestoreInstanceState(bundle2);
        }
    }

    @Override // defpackage.ag
    public final void n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.n(layoutInflater, viewGroup, bundle);
        if (this.P == null && this.d != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.d.onRestoreInstanceState(bundle2);
        }
    }

    public final void o(int i, int i2) {
        if (be.Z(2)) {
            toString();
        }
        this.ai = i;
        this.b = i2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.an) {
            if (be.Z(3)) {
                toString();
            }
            aF(true, true);
        }
    }

    public void p(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void q(be beVar, String str) {
        this.ao = false;
        this.ap = true;
        f fVar = new f(beVar);
        fVar.v();
        fVar.q(this, str);
        fVar.h();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
