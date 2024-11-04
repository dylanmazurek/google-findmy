package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dqi implements dlf, dlc {
    protected final Drawable a;

    public dqi(Drawable drawable) {
        bsc.q(drawable);
        this.a = drawable;
    }

    @Override // defpackage.dlc
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof dqo) {
            ((dqo) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.dlf
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        if (constantState == null) {
            return this.a;
        }
        return constantState.newDrawable();
    }
}
