package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hab extends haj {
    private static final int[][] a = {new int[]{-279548, 155, 50}, new int[]{-1490379, 205, 105}, new int[]{-12417548, 310, 100}, new int[]{-13326253, 50, 105}};
    private final Paint b;
    private final RectF c = new RectF();
    private final njz d;

    public hab(njz njzVar) {
        this.d = njzVar;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int[][] iArr = a;
        for (int i = 0; i < 4; i++) {
            this.b.setColor(iArr[i][0]);
            canvas.drawArc(this.c, r3[1], r3[2], false, this.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        boolean z;
        super.onBoundsChange(rect);
        boolean z2 = false;
        if (rect.width() == rect.height()) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "Width and height for G1RingDrawable bounds must be equal.");
        int round = Math.round(((haf) this.d.a).a(rect.width()));
        if (rect.width() == rect.height()) {
            z2 = true;
        }
        hwx.K(z2, "Width and height for ring bounds must be equal.");
        RectF rectF = new RectF(rect);
        float f = (round + 1) / 2.0f;
        rectF.inset(f, f);
        this.c.set(rectF);
        this.b.setStrokeWidth(round);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
