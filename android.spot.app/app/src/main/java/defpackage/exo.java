package defpackage;

import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exo implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ NestedScrollView a;
    final /* synthetic */ Runnable b;

    public exo(NestedScrollView nestedScrollView, Runnable runnable) {
        this.a = nestedScrollView;
        this.b = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!fma.bT(this.a)) {
            this.b.run();
        } else {
            NestedScrollView nestedScrollView = this.a;
            nestedScrollView.d = new exn(nestedScrollView, this.b, 0);
        }
    }
}
