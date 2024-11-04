package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ixm extends ivf {
    public ixk a;

    public ixm(ixk ixkVar) {
        super(ixkVar);
        this.a = ixkVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.a.x.left && f2 == this.a.x.top && f3 == this.a.x.right && f4 == this.a.x.bottom) {
            return;
        }
        this.a.x.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new ixk(this.a);
        return this;
    }
}
