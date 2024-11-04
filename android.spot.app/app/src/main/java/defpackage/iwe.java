package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwe implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    private final WeakReference b;

    public iwe(iwh iwhVar, View view) {
        this.b = new WeakReference(iwhVar);
        this.a = new WeakReference(view);
    }

    private final boolean b() {
        if (this.b.get() == null) {
            a();
            return true;
        }
        return false;
    }

    public final void a() {
        if (this.a.get() != null) {
            ((View) this.a.get()).removeOnAttachStateChangeListener(this);
            hwx.n((View) this.a.get(), this);
        }
        this.a.clear();
        this.b.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!b()) {
            iwh iwhVar = (iwh) this.b.get();
            String str = iwh.b;
            if (iwhVar.m) {
                ((iwh) this.b.get()).h();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (b()) {
            return;
        }
        hwx.l(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (b()) {
            return;
        }
        hwx.n(view, this);
    }
}
