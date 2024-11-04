package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clf implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;
    private final /* synthetic */ int b;

    public clf(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.b = i;
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        njz njzVar;
        if (this.b != 0) {
            SwipeRefreshLayout swipeRefreshLayout = this.a;
            if (swipeRefreshLayout.a) {
                swipeRefreshLayout.g.setAlpha(255);
                this.a.g.start();
                SwipeRefreshLayout swipeRefreshLayout2 = this.a;
                if (swipeRefreshLayout2.h && (njzVar = swipeRefreshLayout2.j) != null) {
                    ((dzx) njzVar.a).f();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = this.a;
                swipeRefreshLayout3.b = swipeRefreshLayout3.c.getTop();
                return;
            }
            swipeRefreshLayout.b();
            return;
        }
        this.a.k(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
