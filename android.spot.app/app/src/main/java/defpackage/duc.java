package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duc implements Drawable.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public duc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.b != 0) {
            ((cnn) this.a).invalidateSelf();
            return;
        }
        drawable.getClass();
        dud dudVar = (dud) this.a;
        dudVar.b.h(Integer.valueOf(dudVar.g() + 1));
        dud dudVar2 = (dud) this.a;
        dudVar2.c.h(new aqn(due.a(dudVar2.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.b != 0) {
            ((cnn) this.a).scheduleSelf(runnable, j);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        due.b().postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.b != 0) {
            ((cnn) this.a).unscheduleSelf(runnable);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        due.b().removeCallbacks(runnable);
    }
}
