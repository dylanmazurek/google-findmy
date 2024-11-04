package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kx implements AbsListView.OnScrollListener {
    final /* synthetic */ ky a;

    public kx(ky kyVar) {
        this.a = kyVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.u() && this.a.q.getContentView() != null) {
            ky kyVar = this.a;
            kyVar.o.removeCallbacks(kyVar.r);
            this.a.r.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
