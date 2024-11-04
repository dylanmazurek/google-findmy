package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iod implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public iod(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        njz njzVar;
        cai caiVar = this.a.a;
        if (caiVar != null && caiVar.l()) {
            this.b.postOnAnimation(this);
        } else if (this.c && (njzVar = this.a.f) != null) {
            njzVar.i(this.b);
        }
    }
}
