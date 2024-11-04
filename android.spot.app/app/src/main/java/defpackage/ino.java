package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ino implements Runnable {
    final /* synthetic */ inp a;
    private final CoordinatorLayout b;
    private final View c;

    public ino(inp inpVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = inpVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c != null && (overScroller = this.a.b) != null) {
            if (overScroller.computeScrollOffset()) {
                inp inpVar = this.a;
                inpVar.F(this.b, this.c, inpVar.b.getCurrY());
                this.c.postOnAnimation(this);
                return;
            }
            this.a.z(this.b, this.c);
        }
    }
}
