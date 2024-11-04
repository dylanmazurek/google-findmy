package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czf extends cyy {
    private final String d;
    private final boolean e;
    private final sl f;
    private final sl g;
    private final RectF h;
    private final int i;
    private final czw j;
    private final czw k;
    private final czw l;
    private dan m;
    private final int n;

    public czf(cym cymVar, dcu dcuVar, dch dchVar) {
        super(cymVar, dcuVar, bpt.p(dchVar.l), bpu.m(dchVar.m), dchVar.g, dchVar.c, dchVar.f, dchVar.h, dchVar.i);
        this.f = new sl();
        this.g = new sl();
        this.h = new RectF();
        this.d = dchVar.a;
        this.n = dchVar.k;
        this.e = dchVar.j;
        this.i = (int) (cymVar.a.a() / 32.0f);
        czw a = dchVar.b.a();
        this.j = a;
        a.h(this);
        dcuVar.i(a);
        czw a2 = dchVar.d.a();
        this.k = a2;
        a2.h(this);
        dcuVar.i(a2);
        czw a3 = dchVar.e.a();
        this.l = a3;
        a3.h(this);
        dcuVar.i(a3);
    }

    private final int h() {
        int i;
        float f = this.k.c;
        float f2 = this.i;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.l.c * f2);
        int round3 = Math.round(this.j.c * this.i);
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    private final int[] i(int[] iArr) {
        dan danVar = this.m;
        if (danVar != null) {
            Integer[] numArr = (Integer[]) danVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.cyy, defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        super.a(obj, dfeVar);
        if (obj == cyq.L) {
            dan danVar = this.m;
            if (danVar != null) {
                this.a.k(danVar);
            }
            if (dfeVar == null) {
                this.m = null;
                return;
            }
            dan danVar2 = new dan(dfeVar);
            this.m = danVar2;
            danVar2.h(this);
            this.a.i(this.m);
        }
    }

    @Override // defpackage.cyy, defpackage.czb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            long h = h();
            shader = (LinearGradient) this.f.e(h);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                elo eloVar = (elo) this.j.e();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i((int[]) eloVar.b), (float[]) eloVar.a, Shader.TileMode.CLAMP);
                this.f.j(h, shader);
            }
        } else {
            long h2 = h();
            shader = (RadialGradient) this.g.e(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.k.e();
                PointF pointF4 = (PointF) this.l.e();
                elo eloVar2 = (elo) this.j.e();
                int[] i2 = i((int[]) eloVar2.b);
                Object obj = eloVar2.a;
                shader = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r9, pointF4.y - r10), i2, (float[]) obj, Shader.TileMode.CLAMP);
                this.g.j(h2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.d;
    }
}
