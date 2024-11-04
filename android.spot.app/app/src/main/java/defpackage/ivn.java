package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivn {
    private final ivv[] a = new ivv[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final ivv g = new ivv();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public ivn() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new ivv();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private final boolean c(Path path, int i) {
        this.k.reset();
        this.a[i].c(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    private static final float d(int i) {
        return ((i + 1) % 4) * 90;
    }

    private static final iva e(int i, ivl ivlVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return ivlVar.c;
                }
                return ivlVar.b;
            }
            return ivlVar.e;
        }
        return ivlVar.d;
    }

    public final void a(ivl ivlVar, RectF rectF, Path path) {
        b(ivlVar, ivf.p, 1.0f, rectF, null, path);
    }

    public final void b(ivl ivlVar, ivl ivlVar2, float f, RectF rectF, njz njzVar, Path path) {
        int i;
        char c;
        iuu iuuVar;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            c = 1;
            if (i2 >= 4) {
                break;
            }
            iva e = e(i2, ivlVar);
            iva e2 = e(i2, ivlVar2);
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        iuuVar = ivlVar.k;
                    } else {
                        iuuVar = ivlVar.j;
                    }
                } else {
                    iuuVar = ivlVar.m;
                }
            } else {
                iuuVar = ivlVar.l;
            }
            iuuVar.e(this.a[i2], f, e2.a(rectF), e.a(rectF));
            float d = d(i2);
            this.b[i2].reset();
            PointF pointF = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
            }
            Matrix matrix = this.b[i2];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[i2].preRotate(d);
            float[] fArr = this.h;
            ivv ivvVar = this.a[i2];
            fArr[0] = ivvVar.b;
            fArr[1] = ivvVar.c;
            this.b[i2].mapPoints(fArr);
            float d2 = d(i2);
            this.c[i2].reset();
            Matrix matrix2 = this.c[i2];
            float[] fArr2 = this.h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.c[i2].preRotate(d2);
            i2++;
        }
        int i3 = 0;
        while (i3 < i) {
            float[] fArr3 = this.h;
            ivv ivvVar2 = this.a[i3];
            fArr3[0] = 0.0f;
            fArr3[c] = ivvVar2.a;
            this.b[i3].mapPoints(fArr3);
            if (i3 == 0) {
                float[] fArr4 = this.h;
                path.moveTo(fArr4[0], fArr4[c]);
            } else {
                float[] fArr5 = this.h;
                path.lineTo(fArr5[0], fArr5[c]);
            }
            this.a[i3].c(this.b[i3], path);
            if (njzVar != null) {
                ivv ivvVar3 = this.a[i3];
                Matrix matrix3 = this.b[i3];
                ((ivf) njzVar.a).t.set(i3, false);
                ((ivf) njzVar.a).r[i3] = ivvVar3.a(matrix3);
            }
            int i4 = i3 + 1;
            float[] fArr6 = this.h;
            ivv ivvVar4 = this.a[i3];
            fArr6[0] = ivvVar4.b;
            fArr6[c] = ivvVar4.c;
            this.b[i3].mapPoints(fArr6);
            float[] fArr7 = this.i;
            int i5 = i4 % 4;
            ivv ivvVar5 = this.a[i5];
            fArr7[0] = 0.0f;
            fArr7[c] = ivvVar5.a;
            this.b[i5].mapPoints(fArr7);
            float f2 = this.h[0];
            float[] fArr8 = this.i;
            float max = Math.max(((float) Math.hypot(f2 - fArr8[0], r12[c] - fArr8[c])) - 0.001f, 0.0f);
            float[] fArr9 = this.h;
            ivv ivvVar6 = this.a[i3];
            fArr9[0] = ivvVar6.b;
            fArr9[1] = ivvVar6.c;
            this.b[i3].mapPoints(fArr9);
            if (i3 != 1 && i3 != 3) {
                Math.abs(rectF.centerY() - this.h[1]);
            } else {
                Math.abs(rectF.centerX() - this.h[0]);
            }
            this.g.e();
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ivc ivcVar = ivlVar.g;
                    } else {
                        ivc ivcVar2 = ivlVar.f;
                    }
                } else {
                    ivc ivcVar3 = ivlVar.i;
                }
            } else {
                ivc ivcVar4 = ivlVar.h;
            }
            this.g.d(max, 0.0f);
            this.j.reset();
            this.g.c(this.c[i3], this.j);
            if (this.l && (c(this.j, i3) || c(this.j, i5))) {
                Path path2 = this.j;
                path2.op(path2, this.f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.h;
                fArr10[0] = 0.0f;
                fArr10[1] = this.g.a;
                this.c[i3].mapPoints(fArr10);
                Path path3 = this.e;
                float[] fArr11 = this.h;
                path3.moveTo(fArr11[0], fArr11[1]);
                this.g.c(this.c[i3], this.e);
            } else {
                this.g.c(this.c[i3], path);
            }
            if (njzVar != null) {
                ivv ivvVar7 = this.g;
                Matrix matrix4 = this.c[i3];
                ((ivf) njzVar.a).t.set(i3 + 4, false);
                ((ivf) njzVar.a).s[i3] = ivvVar7.a(matrix4);
            }
            i3 = i4;
            i = 4;
            c = 1;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}
