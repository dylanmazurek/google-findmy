package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxu extends bxt {
    private brq c;

    public bxu(bya byaVar, WindowInsets windowInsets) {
        super(byaVar, windowInsets);
        this.c = null;
    }

    @Override // defpackage.bxy
    public final brq j() {
        if (this.c == null) {
            WindowInsets windowInsets = this.a;
            this.c = brq.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.c;
    }

    @Override // defpackage.bxy
    public bya k() {
        return bya.m(this.a.consumeStableInsets());
    }

    @Override // defpackage.bxy
    public bya l() {
        return bya.m(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.bxy
    public void m(brq brqVar) {
        this.c = brqVar;
    }

    @Override // defpackage.bxy
    public boolean n() {
        return this.a.isConsumed();
    }
}
