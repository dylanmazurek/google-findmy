package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itg extends itz {
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private float m;

    public itg(itr itrVar) {
        super(itrVar);
    }

    private final int j() {
        itr itrVar = (itr) this.a;
        int i = itrVar.l;
        int i2 = itrVar.m;
        return i + i2 + i2;
    }

    private final void k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        float f8 = f7;
        if (this.m < 1.0f) {
            float f9 = f8 + f6;
            if (f9 > 1.0f) {
                k(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f / this.h);
        float f10 = (-0.99f) + f6;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f6 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float f12 = this.m;
        float i4 = hwx.i(1.0f - f12, 1.0f, f8);
        float i5 = hwx.i(0.0f, f12, f6);
        float degrees2 = (float) Math.toDegrees(i2 / this.h);
        float degrees3 = ((i5 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.h));
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z2 = false;
        if (((itr) this.a).b() && z && f3 > 0.0f) {
            z2 = true;
        }
        float f13 = (i4 * 360.0f) + degrees2;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.e);
        float f14 = this.f;
        float f15 = f14 + f14;
        float f16 = degrees + degrees;
        if (degrees3 < f16) {
            float f17 = degrees3 / f16;
            float f18 = f13 + (degrees * f17);
            lyn lynVar = new lyn((short[]) null);
            if (!z2) {
                lynVar.j(f18 + 90.0f);
                lynVar.h(-this.h);
            } else {
                this.d.getPosTan(((f18 / 360.0f) * this.d.getLength()) / 2.0f, (float[]) lynVar.a, (float[]) lynVar.b);
            }
            paint.setStyle(Paint.Style.FILL);
            m(canvas, paint, lynVar, f15, this.e, f17);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.l ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = degrees + f13;
        float f20 = degrees3 - f16;
        Pair pair = new Pair(new lyn((short[]) null), new lyn((short[]) null));
        if (!z2) {
            ((lyn) pair.first).j(f19 + 90.0f);
            ((lyn) pair.first).h(-this.h);
            ((lyn) pair.second).j(f19 + f20 + 90.0f);
            ((lyn) pair.second).h(-this.h);
            float f21 = this.h;
            float f22 = -f21;
            canvas.drawArc(new RectF(f22, f22, f21, f21), f19, f20, false, paint);
        } else {
            PathMeasure pathMeasure = this.d;
            Path path = this.c;
            float f23 = f19 / 360.0f;
            float f24 = f20 / 360.0f;
            float f25 = this.h;
            if (f25 != this.k || this.g * f3 != this.j) {
                this.j = this.g * f3;
                this.k = f25;
                g();
            }
            path.rewind();
            float d = bpv.d(f24, 0.0f, 1.0f);
            if (((itr) this.a).b()) {
                float f26 = f4 / ((float) ((this.h * 6.283185307179586d) / this.i));
                f23 += f26;
                f5 = -(f26 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f27 = f23 % 1.0f;
            float length = (pathMeasure.getLength() * f27) / 2.0f;
            float length2 = ((f27 + d) * pathMeasure.getLength()) / 2.0f;
            pathMeasure.getSegment(length, length2, path, true);
            lyn lynVar2 = new lyn((short[]) null);
            pathMeasure.getPosTan(length, (float[]) lynVar2.a, (float[]) lynVar2.b);
            lyn lynVar3 = new lyn((short[]) null);
            pathMeasure.getPosTan(length2, (float[]) lynVar3.a, (float[]) lynVar3.b);
            Matrix matrix = new Matrix();
            matrix.setRotate(f5);
            lynVar2.j(f5);
            lynVar3.j(f5);
            path.transform(matrix);
            pair = new Pair(lynVar2, lynVar3);
            canvas.drawPath(this.c, paint);
        }
        if (this.l || this.f <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        l(canvas, paint, (lyn) pair.first, f15, this.e);
        l(canvas, paint, (lyn) pair.second, f15, this.e);
    }

    private final void l(Canvas canvas, Paint paint, lyn lynVar, float f, float f2) {
        m(canvas, paint, lynVar, f, f2, 1.0f);
    }

    private final void m(Canvas canvas, Paint paint, lyn lynVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.e);
        float f4 = -f;
        float f5 = f / 2.0f;
        float min2 = Math.min(f5, (this.f * min) / this.e);
        RectF rectF = new RectF(f4 / 2.0f, (-min) / 2.0f, f5, min / 2.0f);
        canvas.save();
        float[] fArr = (float[]) lynVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i((float[]) lynVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    @Override // defpackage.itz
    public final int a() {
        return j();
    }

    @Override // defpackage.itz
    public final int b() {
        return j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:            if (r9.f == 3) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:            if (r9.f == 2) goto L32;     */
    @Override // defpackage.itz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r9, android.graphics.Rect r10, float r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itg.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.itz
    public final void e(Canvas canvas, Paint paint, ity ityVar, int i) {
        int b = iqg.b(ityVar.c, i);
        canvas.save();
        canvas.rotate(ityVar.g);
        float f = ityVar.a;
        float f2 = ityVar.b;
        int i2 = ityVar.d;
        k(canvas, paint, f, f2, b, i2, i2, ityVar.e, ityVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.itz
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        k(canvas, paint, f, f2, iqg.b(i, i2), i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.itz
    public final void g() {
        this.b.rewind();
        this.b.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            this.b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        Matrix matrix = new Matrix();
        float f = this.h;
        matrix.setScale(f, f);
        this.b.transform(matrix);
        if (((itr) this.a).b()) {
            this.d.setPath(this.b, false);
            PathMeasure pathMeasure = this.d;
            Path path = this.b;
            float f2 = this.j;
            path.rewind();
            itf itfVar = this.a;
            float length = pathMeasure.getLength();
            int max = Math.max(3, (int) ((length / ((itr) itfVar).h) / 2.0f));
            int i2 = max + max;
            this.i = length / i2;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                lyn lynVar = new lyn((short[]) null);
                float f3 = i3;
                pathMeasure.getPosTan(this.i * f3, (float[]) lynVar.a, (float[]) lynVar.b);
                lyn lynVar2 = new lyn((short[]) null);
                float f4 = this.i;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) lynVar2.a, (float[]) lynVar2.b);
                arrayList.add(lynVar);
                lynVar2.h(f2 + f2);
                arrayList.add(lynVar2);
            }
            arrayList.add((lyn) arrayList.get(0));
            lyn lynVar3 = (lyn) arrayList.get(0);
            float[] fArr = (float[]) lynVar3.a;
            path.moveTo(fArr[0], fArr[1]);
            int i4 = 1;
            while (i4 < arrayList.size()) {
                lyn lynVar4 = (lyn) arrayList.get(i4);
                float f5 = this.i / 2.0f;
                lyn lynVar5 = new lyn(lynVar3);
                lyn lynVar6 = new lyn(lynVar4);
                float f6 = f5 * 0.364f;
                lynVar5.i(f6);
                lynVar6.i(-f6);
                float[] fArr2 = (float[]) lynVar5.a;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) lynVar6.a;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) lynVar4.a;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i4++;
                lynVar3 = lynVar4;
            }
        }
        this.d.setPath(this.b, false);
    }

    @Override // defpackage.itz
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
    }
}
