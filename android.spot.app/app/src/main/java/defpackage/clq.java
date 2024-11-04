package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clq extends cme {
    boolean a = false;
    final ViewGroup b;

    public clq(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.cme, defpackage.cma
    public final void a(cmd cmdVar) {
        cmp.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.cme, defpackage.cma
    public final void b(cmd cmdVar) {
        if (!this.a) {
            cmp.a(this.b, false);
        }
        cmdVar.B(this);
    }

    @Override // defpackage.cme, defpackage.cma
    public final void c() {
        cmp.a(this.b, false);
    }

    @Override // defpackage.cme, defpackage.cma
    public final void d() {
        cmp.a(this.b, true);
    }
}
