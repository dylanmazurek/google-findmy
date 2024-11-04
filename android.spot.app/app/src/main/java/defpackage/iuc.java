package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuc extends itz {
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private float k;

    public iuc(iuk iukVar) {
        super(iukVar);
        this.e = 300.0f;
    }

    private final void j(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        boolean z2;
        Paint.Cap cap;
        float f5 = 1.0f - this.k;
        float i4 = hwx.i(f5, 1.0f, bpv.d(f, 0.0f, 1.0f));
        float f6 = this.e;
        float f7 = i4 * f6;
        float i5 = hwx.i(f5, 1.0f, bpv.d(f2, 0.0f, 1.0f)) * f6;
        float f8 = -f6;
        if (((iuk) this.a).b() && z && f3 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d = i5 - ((int) ((i3 * (1.0f - bpv.d(r2, 0.99f, 1.0f))) / 0.01f));
        int d2 = (int) (f7 + ((int) ((i2 * bpv.d(i4, 0.0f, 0.01f)) / 0.01f)));
        int i6 = (int) d;
        if (d2 <= i6) {
            float f9 = f8 / 2.0f;
            float f10 = this.g;
            float f11 = d2 + f10;
            float f12 = i6 - f10;
            float f13 = f10 + f10;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f);
            Pair pair = new Pair(new lyn((short[]) null), new lyn((short[]) null));
            ((lyn) pair.first).l(f11 + f9);
            ((lyn) pair.second).l(f9 + f12);
            if (f11 >= f12) {
                l(canvas, paint, (lyn) pair.first, (lyn) pair.second, f13, this.f);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (this.j) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            if (!z2) {
                canvas.drawLine(((float[]) ((lyn) pair.first).a)[0], ((float[]) ((lyn) pair.first).a)[1], ((float[]) ((lyn) pair.second).a)[0], ((float[]) ((lyn) pair.second).a)[1], paint);
            } else {
                PathMeasure pathMeasure = this.d;
                Path path = this.c;
                float f14 = this.e;
                float f15 = f11 / f14;
                float f16 = f12 / f14;
                path.rewind();
                float f17 = (-this.e) / 2.0f;
                if (((iuk) this.a).b()) {
                    float f18 = this.e;
                    float f19 = this.i;
                    float f20 = f18 / f19;
                    float f21 = f4 / f20;
                    f17 -= f19 * f4;
                    float f22 = f20 / (f20 + 1.0f);
                    f16 = (f16 + f21) * f22;
                    f15 = (f15 + f21) * f22;
                }
                float length = f15 * pathMeasure.getLength();
                float length2 = f16 * pathMeasure.getLength();
                pathMeasure.getSegment(length, length2, path, true);
                lyn lynVar = new lyn((short[]) null);
                pathMeasure.getPosTan(length, (float[]) lynVar.a, (float[]) lynVar.b);
                lyn lynVar2 = new lyn((short[]) null);
                pathMeasure.getPosTan(length2, (float[]) lynVar2.a, (float[]) lynVar2.b);
                Matrix matrix = new Matrix();
                matrix.setTranslate(f17, 0.0f);
                lynVar.l(f17);
                lynVar2.l(f17);
                if (((iuk) this.a).b()) {
                    float f23 = this.h * f3;
                    matrix.postScale(1.0f, f23);
                    lynVar.k(f23);
                    lynVar2.k(f23);
                }
                path.transform(matrix);
                pair = new Pair(lynVar, lynVar2);
                canvas.drawPath(this.c, paint);
            }
            if (!this.j && this.g > 0.0f) {
                if (f11 > 0.0f) {
                    k(canvas, paint, (lyn) pair.first, f13, this.f);
                }
                if (f12 < this.e) {
                    k(canvas, paint, (lyn) pair.second, f13, this.f);
                }
            }
        }
    }

    private final void k(Canvas canvas, Paint paint, lyn lynVar, float f, float f2) {
        l(canvas, paint, lynVar, null, f, f2);
    }

    private final void l(Canvas canvas, Paint paint, lyn lynVar, lyn lynVar2, float f, float f2) {
        float min = Math.min(f2, this.f);
        float f3 = -f;
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.g * min) / this.f);
        RectF rectF = new RectF(f3 / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (lynVar2 != null) {
            float[] fArr = (float[]) lynVar2.a;
            canvas.translate(fArr[0], fArr[1]);
            canvas.rotate(i((float[]) lynVar2.b));
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i((float[]) lynVar2.b));
            float[] fArr2 = (float[]) lynVar2.a;
            canvas.translate(-fArr2[0], -fArr2[1]);
        }
        float[] fArr3 = (float[]) lynVar.a;
        canvas.translate(fArr3[0], fArr3[1]);
        canvas.rotate(i((float[]) lynVar.b));
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    @Override // defpackage.itz
    public final int a() {
        iuk iukVar = (iuk) this.a;
        int i = iukVar.a;
        int i2 = iukVar.i;
        return i + i2 + i2;
    }

    @Override // defpackage.itz
    public final int b() {
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:            if (((defpackage.iuk) r8.a).f == 3) goto L33;     */
    @Override // defpackage.itz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r9, android.graphics.Rect r10, float r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuc.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.itz
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
        int b = iqg.b(i, i2);
        if (((iuk) this.a).n > 0 && b != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(b);
            lyn lynVar = new lyn(new float[]{(this.e / 2.0f) - (this.f / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
            float f = ((iuk) this.a).n;
            k(canvas, paint, lynVar, f, f);
        }
    }

    @Override // defpackage.itz
    public final void e(Canvas canvas, Paint paint, ity ityVar, int i) {
        int b = iqg.b(ityVar.c, i);
        float f = ityVar.a;
        float f2 = ityVar.b;
        int i2 = ityVar.d;
        j(canvas, paint, f, f2, b, i2, i2, ityVar.e, ityVar.f, true);
    }

    @Override // defpackage.itz
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        j(canvas, paint, f, f2, iqg.b(i, i2), i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.itz
    public final void g() {
        this.b.rewind();
        if (((iuk) this.a).b()) {
            float f = this.e;
            int i = (int) (f / ((iuk) this.a).h);
            this.i = f / i;
            for (int i2 = 0; i2 <= i; i2++) {
                int i3 = i2 + i2;
                float f2 = i3 + 1;
                this.b.cubicTo(i3 + 0.364f, 0.0f, f2 - 0.364f, 1.0f, f2, 1.0f);
                float f3 = i3 + 2;
                this.b.cubicTo(f2 + 0.364f, 1.0f, f3 - 0.364f, 0.0f, f3, 0.0f);
            }
            Matrix matrix = new Matrix();
            matrix.setScale(this.i / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            this.b.transform(matrix);
        } else {
            this.b.lineTo(this.e, 0.0f);
        }
        this.d.setPath(this.b, false);
    }
}
