package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clb extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new ced();
    private static final int[] g = {-16777216};
    public final cla a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public clb(Context context) {
        bqd.n(context);
        this.b = context.getResources();
        cla claVar = new cla();
        this.a = claVar;
        claVar.i = g;
        claVar.g();
        claVar.d(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new hhn(this, claVar, 1));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new ckz(this, claVar));
        this.i = ofFloat;
    }

    public static final void e(float f2, cla claVar) {
        if (f2 > 0.75f) {
            int a = claVar.a();
            int[] iArr = claVar.i;
            claVar.f();
            int i = iArr[0];
            int i2 = a >> 24;
            int i3 = a >> 16;
            int i4 = a >> 8;
            int i5 = i >> 16;
            int i6 = i >> 8;
            float f3 = (f2 - 0.75f) / 0.25f;
            int i7 = (i4 & 255) + ((int) (((i6 & 255) - r4) * f3));
            int i8 = (i3 & 255) + ((int) (((i5 & 255) - r3) * f3));
            int i9 = i2 & 255;
            claVar.t = ((i9 + ((int) (f3 * (((i >> 24) & 255) - i9)))) << 24) | (i8 << 16) | (i7 << 8) | ((a & 255) + ((int) (((i & 255) - r0) * f3)));
            return;
        }
        claVar.t = claVar.a();
    }

    public final void a(float f2, cla claVar, boolean z) {
        float interpolation;
        float f3;
        if (this.d) {
            e(f2, claVar);
            double floor = Math.floor(claVar.l / 0.8f) + 1.0d;
            float f4 = claVar.j;
            float f5 = claVar.k;
            claVar.e = f4 + ((((-0.01f) + f5) - f4) * f2);
            claVar.f = f5;
            float f6 = claVar.l;
            claVar.g = f6 + ((((float) floor) - f6) * f2);
            return;
        }
        if (f2 == 1.0f && !z) {
            return;
        }
        float f7 = claVar.l;
        if (f2 < 0.5f) {
            interpolation = claVar.j;
            f3 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
        } else {
            float f8 = claVar.j + 0.79f;
            interpolation = f8 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
            f3 = f8;
        }
        float f9 = f7 + (0.20999998f * f2);
        float f10 = f2 + this.c;
        claVar.e = interpolation;
        claVar.f = f3;
        claVar.g = f9;
        this.h = f10 * 216.0f;
    }

    public final void b(boolean z) {
        this.a.c(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        cla claVar = this.a;
        if (f2 != claVar.o) {
            claVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        cla claVar = this.a;
        claVar.e = 0.0f;
        claVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        cla claVar = this.a;
        float f2 = claVar.p;
        float f3 = (claVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((claVar.q * claVar.o) / 2.0f, claVar.h / 2.0f);
        }
        RectF rectF = claVar.a;
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = claVar.e;
        float f5 = claVar.g;
        float f6 = f4 + f5;
        float f7 = claVar.f + f5;
        claVar.b.setColor(claVar.t);
        claVar.b.setAlpha(claVar.s);
        float f8 = claVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, claVar.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        float f10 = f6 * 360.0f;
        float f11 = (f7 * 360.0f) - f10;
        canvas.drawArc(rectF, f10, f11, false, claVar.b);
        if (claVar.m) {
            Path path = claVar.n;
            if (path == null) {
                claVar.n = new Path();
                claVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f12 = (claVar.q * claVar.o) / 2.0f;
            claVar.n.moveTo(0.0f, 0.0f);
            claVar.n.lineTo(claVar.q * claVar.o, 0.0f);
            Path path2 = claVar.n;
            float f13 = claVar.q;
            float f14 = claVar.o;
            path2.lineTo((f13 * f14) / 2.0f, claVar.r * f14);
            claVar.n.offset((min + rectF.centerX()) - f12, rectF.centerY() + (claVar.h / 2.0f));
            claVar.n.close();
            claVar.c.setColor(claVar.t);
            claVar.c.setAlpha(claVar.s);
            canvas.save();
            canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
            canvas.drawPath(claVar.n, claVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        this.a.e();
        cla claVar = this.a;
        if (claVar.f != claVar.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
        } else {
            claVar.g();
            this.a.b();
            this.i.setDuration(1332L);
            this.i.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.c(false);
        this.a.g();
        this.a.b();
        invalidateSelf();
    }
}
