package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyr extends Drawable {
    final /* synthetic */ eys a;

    public eyr(eys eysVar) {
        this.a = eysVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a.b == null) {
            return;
        }
        int height = getBounds().height();
        canvas.clipRect(new Rect(0, height - this.a.b.e, getBounds().width(), height));
        canvas.drawColor(this.a.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
