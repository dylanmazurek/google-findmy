package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ly extends eu {
    final /* synthetic */ RecyclerView a;

    public ly(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.eu
    public final void d() {
        this.a.r(null);
        RecyclerView recyclerView = this.a;
        recyclerView.M.f = true;
        recyclerView.P(true);
        if (!this.a.g.k()) {
            this.a.requestLayout();
        }
    }

    @Override // defpackage.eu
    public final void e(int i, int i2) {
        this.a.r(null);
        hu huVar = this.a.g;
        if (i2 > 0) {
            huVar.a.add(huVar.l(1, i, i2));
            huVar.c |= 1;
            if (huVar.a.size() == 1) {
                l();
            }
        }
    }

    @Override // defpackage.eu
    public final void f(int i, int i2) {
        this.a.r(null);
        hu huVar = this.a.g;
        if (i2 > 0) {
            huVar.a.add(huVar.l(2, i, i2));
            huVar.c |= 2;
            if (huVar.a.size() == 1) {
                l();
            }
        }
    }

    @Override // defpackage.eu
    public final void h(int i, int i2) {
        this.a.r(null);
        hu huVar = this.a.g;
        if (i2 > 0) {
            huVar.a.add(huVar.l(4, i, i2));
            huVar.c |= 4;
            if (huVar.a.size() == 1) {
                l();
            }
        }
    }

    @Override // defpackage.eu
    public final void i(int i, int i2) {
        this.a.r(null);
        hu huVar = this.a.g;
        if (i != i2) {
            huVar.a.add(huVar.l(8, i, i2));
            huVar.c |= 8;
            if (huVar.a.size() == 1) {
                l();
            }
        }
    }

    final void l() {
        RecyclerView recyclerView = this.a;
        recyclerView.v = true;
        recyclerView.requestLayout();
    }
}
