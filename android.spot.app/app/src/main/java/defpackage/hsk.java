package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsk implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ hsm a;
    private final AtomicReference c;

    public hsk(hsm hsmVar, View view) {
        this.a = hsmVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                ijs.a().postAtFrontOfQueue(new hsi(this.a, 3));
                ijs.e(new hsi(this.a, 4));
                ijs.e(new hka(this, view, 5, (byte[]) null));
            } catch (RuntimeException unused) {
            }
        }
    }
}
