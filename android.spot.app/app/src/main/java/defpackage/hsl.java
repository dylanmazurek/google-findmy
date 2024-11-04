package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsl implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ hsm a;
    private final AtomicReference b;

    public hsl(hsm hsmVar, View view) {
        this.a = hsmVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view != null) {
            try {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                ijs.a().postAtFrontOfQueue(new hsi(this.a, 5));
                ijs.e(new hsi(this.a, 6));
                return true;
            } catch (RuntimeException unused) {
                return true;
            }
        }
        return true;
    }
}
