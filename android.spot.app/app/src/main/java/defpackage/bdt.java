package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdt implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bdt(View view, Object obj, int i) {
        this.c = i;
        this.a = view;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.c != 0) {
            View view2 = this.a;
            cfc d = bty.d(view2);
            if (d != null) {
                bah bahVar = (bah) view2;
                ((mpn) this.b).a = rd.e(bahVar, d.N());
                ((bah) this.a).removeOnAttachStateChangeListener(this);
                return;
            }
            ll.h(a.af(view2, "View tree for ", " has no ViewTreeLifecycleOwner"));
            throw new mks();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.c != 0) {
            return;
        }
        this.a.removeOnAttachStateChangeListener(this);
        ((afn) this.b).u();
    }
}
