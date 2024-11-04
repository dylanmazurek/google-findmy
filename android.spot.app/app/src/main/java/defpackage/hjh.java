package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ apc a;
    private final frx b;

    public hjh(apc apcVar, View view, int i) {
        this.a = apcVar;
        this.b = new hjg(this, view, i);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, haw] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, haw] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.b.d(this.b);
        ?? r2 = this.a.b;
        if (r2.c()) {
            this.b.a(r2.a());
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, haw] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b.e(this.b);
    }
}
