package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class exn implements bzt {
    public final /* synthetic */ View a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public exn(View view, View view2, int i) {
        this.c = i;
        this.b = view;
        this.a = view2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.bzt
    public final void a(NestedScrollView nestedScrollView) {
        if (this.c != 0) {
            co.a(nestedScrollView, (View) this.b, this.a);
        } else {
            NestedScrollView nestedScrollView2 = (NestedScrollView) this.a;
            if (fma.bT(nestedScrollView2)) {
                return;
            }
            ?? r0 = this.b;
            nestedScrollView2.d = null;
            r0.run();
        }
    }

    public /* synthetic */ exn(NestedScrollView nestedScrollView, Runnable runnable, int i) {
        this.c = i;
        this.a = nestedScrollView;
        this.b = runnable;
    }
}
