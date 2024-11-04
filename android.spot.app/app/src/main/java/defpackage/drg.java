package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drg implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ drh b;

    public drg(drh drhVar, View view) {
        this.a = view;
        this.b = drhVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        dtq.h(new cui(this, (ViewTreeObserver.OnDrawListener) this, 5));
    }
}
