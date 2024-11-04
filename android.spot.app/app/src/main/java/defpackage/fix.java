package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fix extends fir {
    public final rz e;
    private final fje g;

    public fix(fjk fjkVar, fje fjeVar) {
        super(fjkVar, fgp.a);
        this.e = new rz();
        this.g = fjeVar;
        this.f.b(this);
    }

    @Override // defpackage.fir
    protected final void e(ConnectionResult connectionResult, int i) {
        this.g.d(connectionResult, i);
    }

    @Override // defpackage.fir
    protected final void f() {
        this.g.e();
    }

    @Override // defpackage.fjj
    public final void h() {
        k();
    }

    @Override // defpackage.fjj
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.fjj
    public final void j() {
        this.a = false;
        Object obj = fje.c;
        fje fjeVar = this.g;
        synchronized (obj) {
            if (fjeVar.l == this) {
                fjeVar.l = null;
                fjeVar.m.clear();
            }
        }
    }

    public final void k() {
        if (!this.e.isEmpty()) {
            this.g.f(this);
        }
    }
}
