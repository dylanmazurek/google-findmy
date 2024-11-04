package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixk extends ive {
    public final RectF x;

    public ixk(ivl ivlVar, RectF rectF) {
        super(ivlVar);
        this.x = rectF;
    }

    @Override // defpackage.ive, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ixl ixlVar = new ixl(this);
        ixlVar.invalidateSelf();
        return ixlVar;
    }

    public ixk(ixk ixkVar) {
        super(ixkVar);
        this.x = ixkVar.x;
    }
}
