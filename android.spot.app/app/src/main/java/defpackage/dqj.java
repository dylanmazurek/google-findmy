package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqj extends dqi {
    private dqj(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dlf g(Drawable drawable) {
        if (drawable != null) {
            return new dqj(drawable);
        }
        return null;
    }

    @Override // defpackage.dlf
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.dlf
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.dlf
    public final void e() {
    }
}
