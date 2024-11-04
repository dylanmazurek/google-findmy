package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqs {
    public Paint a;
    public int b;
    public ji c;

    public aqs(Paint paint) {
        this.a = paint;
        this.b = 3;
    }

    public final int a() {
        if (!this.a.isFilterBitmap()) {
            return 0;
        }
        return 1;
    }

    public final long b() {
        return jw.e(this.a.getColor());
    }

    public final void c(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void d(int i) {
        if (!a.m(this.b, i)) {
            this.b = i;
            Paint paint = this.a;
            if (Build.VERSION.SDK_INT >= 29) {
                arp.a.a(paint, i);
            } else {
                paint.setXfermode(new PorterDuffXfermode(aqq.c(i)));
            }
        }
    }

    public final void e(long j) {
        this.a.setColor(jw.d(j));
    }

    public final void f(int i) {
        Paint.Style style;
        Paint paint = this.a;
        if (a.m(i, 1)) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public final void g() {
        this.a.setStrokeWidth(1.0f);
    }

    public final void h() {
        this.a.setFilterBitmap(!a.m(1, 0));
    }

    public final void i(ji jiVar) {
        this.c = jiVar;
        Paint paint = this.a;
        if (jiVar == null) {
            paint.setColorFilter(null);
            return;
        }
        throw null;
    }

    public aqs() {
        this(new Paint(7));
    }
}
