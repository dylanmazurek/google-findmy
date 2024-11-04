package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hlq implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hlq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (this.b != 0) {
            ((baw) this.a).B();
        } else {
            ((hls) this.a).a();
        }
    }
}
