package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxq extends bxs {
    final WindowInsets.Builder a;

    public bxq() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.bxs
    public bya a() {
        WindowInsets build;
        h();
        build = this.a.build();
        bya m = bya.m(build);
        m.p(this.b);
        return m;
    }

    @Override // defpackage.bxs
    public void b(brq brqVar) {
        this.a.setStableInsets(brqVar.a());
    }

    @Override // defpackage.bxs
    public void c(brq brqVar) {
        this.a.setSystemWindowInsets(brqVar.a());
    }

    @Override // defpackage.bxs
    public void d(brq brqVar) {
        this.a.setMandatorySystemGestureInsets(brqVar.a());
    }

    @Override // defpackage.bxs
    public void e(brq brqVar) {
        this.a.setSystemGestureInsets(brqVar.a());
    }

    @Override // defpackage.bxs
    public void f(brq brqVar) {
        this.a.setTappableElementInsets(brqVar.a());
    }

    public bxq(bya byaVar) {
        super(byaVar);
        WindowInsets.Builder builder;
        WindowInsets e = byaVar.e();
        if (e != null) {
            builder = new WindowInsets.Builder(e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
