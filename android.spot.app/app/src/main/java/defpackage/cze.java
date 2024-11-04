package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cze implements czb, czr, czh {
    float a;
    private final String b;
    private final boolean c;
    private final dcu d;
    private final sl e = new sl();
    private final sl f = new sl();
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final czw k;
    private final czw l;
    private final czw m;
    private final czw n;
    private czw o;
    private dan p;
    private final cym q;
    private final int r;
    private czw s;
    private czz t;
    private final int u;

    public cze(cym cymVar, cyb cybVar, dcu dcuVar, dcg dcgVar) {
        Path path = new Path();
        this.g = path;
        this.h = new cyx(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = 0.0f;
        this.d = dcuVar;
        this.b = dcgVar.f;
        this.c = dcgVar.g;
        this.q = cymVar;
        this.u = dcgVar.h;
        path.setFillType(dcgVar.a);
        this.r = (int) (cybVar.a() / 32.0f);
        czw a = dcgVar.b.a();
        this.k = a;
        a.h(this);
        dcuVar.i(a);
        czw a2 = dcgVar.c.a();
        this.l = a2;
        a2.h(this);
        dcuVar.i(a2);
        czw a3 = dcgVar.d.a();
        this.m = a3;
        a3.h(this);
        dcuVar.i(a3);
        czw a4 = dcgVar.e.a();
        this.n = a4;
        a4.h(this);
        dcuVar.i(a4);
        if (dcuVar.q() != null) {
            czw a5 = ((dbs) dcuVar.q().a).a();
            this.s = a5;
            a5.h(this);
            dcuVar.i(this.s);
        }
        if (dcuVar.r() != null) {
            this.t = new czz(this, dcuVar, dcuVar.r());
        }
    }

    private final int h() {
        int i;
        float f = this.m.c;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.c * f2);
        int round3 = Math.round(this.k.c * this.r);
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
        dan danVar = this.p;
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

    @Override // defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        czz czzVar;
        czz czzVar2;
        czz czzVar3;
        czz czzVar4;
        czz czzVar5;
        if (obj == cyq.d) {
            this.l.k(dfeVar);
            return;
        }
        if (obj == cyq.K) {
            czw czwVar = this.o;
            if (czwVar != null) {
                this.d.k(czwVar);
            }
            if (dfeVar == null) {
                this.o = null;
                return;
            }
            dan danVar = new dan(dfeVar);
            this.o = danVar;
            danVar.h(this);
            this.d.i(this.o);
            return;
        }
        if (obj == cyq.L) {
            dan danVar2 = this.p;
            if (danVar2 != null) {
                this.d.k(danVar2);
            }
            if (dfeVar == null) {
                this.p = null;
                return;
            }
            this.e.i();
            this.f.i();
            dan danVar3 = new dan(dfeVar);
            this.p = danVar3;
            danVar3.h(this);
            this.d.i(this.p);
            return;
        }
        if (obj == cyq.j) {
            czw czwVar2 = this.s;
            if (czwVar2 != null) {
                czwVar2.k(dfeVar);
                return;
            }
            dan danVar4 = new dan(dfeVar);
            this.s = danVar4;
            danVar4.h(this);
            this.d.i(this.s);
            return;
        }
        if (obj == cyq.e && (czzVar5 = this.t) != null) {
            czzVar5.b(dfeVar);
            return;
        }
        if (obj == cyq.G && (czzVar4 = this.t) != null) {
            czzVar4.f(dfeVar);
            return;
        }
        if (obj == cyq.H && (czzVar3 = this.t) != null) {
            czzVar3.c(dfeVar);
            return;
        }
        if (obj == cyq.I && (czzVar2 = this.t) != null) {
            czzVar2.e(dfeVar);
        } else if (obj == cyq.J && (czzVar = this.t) != null) {
            czzVar.g(dfeVar);
        }
    }

    @Override // defpackage.czb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        float f;
        if (this.c) {
            return;
        }
        this.g.reset();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.g.addPath(((czj) this.j.get(i2)).i(), matrix);
        }
        this.g.computeBounds(this.i, false);
        if (this.u == 1) {
            long h = h();
            shader = (LinearGradient) this.e.e(h);
            if (shader == null) {
                PointF pointF = (PointF) this.m.e();
                PointF pointF2 = (PointF) this.n.e();
                elo eloVar = (elo) this.k.e();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i((int[]) eloVar.b), (float[]) eloVar.a, Shader.TileMode.CLAMP);
                this.e.j(h, linearGradient);
                shader = linearGradient;
            }
        } else {
            long h2 = h();
            shader = (RadialGradient) this.f.e(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.m.e();
                PointF pointF4 = (PointF) this.n.e();
                elo eloVar2 = (elo) this.k.e();
                int[] i3 = i((int[]) eloVar2.b);
                Object obj = eloVar2.a;
                float f2 = pointF3.x;
                float f3 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f2, pointF4.y - f3);
                if (hypot <= 0.0f) {
                    f = 0.001f;
                } else {
                    f = hypot;
                }
                shader = new RadialGradient(f2, f3, f, i3, (float[]) obj, Shader.TileMode.CLAMP);
                this.f.j(h2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.h.setShader(shader);
        czw czwVar = this.o;
        if (czwVar != null) {
            this.h.setColorFilter((ColorFilter) czwVar.e());
        }
        czw czwVar2 = this.s;
        if (czwVar2 != null) {
            float floatValue = ((Float) czwVar2.e()).floatValue();
            if (floatValue == 0.0f) {
                this.h.setMaskFilter(null);
            } else if (floatValue != this.a) {
                this.h.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.a = floatValue;
        }
        czz czzVar = this.t;
        if (czzVar != null) {
            czzVar.a(this.h);
        }
        this.h.setAlpha(dew.e((int) ((((i / 255.0f) * ((Integer) this.l.e()).intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.g, this.h);
        cxw.a();
    }

    @Override // defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.g.reset();
        for (int i = 0; i < this.j.size(); i++) {
            this.g.addPath(((czj) this.j.get(i)).i(), matrix);
        }
        this.g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.czr
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.dbn
    public final void e(dbm dbmVar, int i, List list, dbm dbmVar2) {
        dew.d(dbmVar, i, list, dbmVar2, this);
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            cyz cyzVar = (cyz) list2.get(i);
            if (cyzVar instanceof czj) {
                this.j.add((czj) cyzVar);
            }
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.b;
    }
}
