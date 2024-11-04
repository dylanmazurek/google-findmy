package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddd extends dcu {
    private czw A;
    private czw B;
    private czw C;
    private czw D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final sl p;
    private final List q;
    private final dal r;
    private final cym s;
    private final cyb t;
    private czw u;
    private czw v;
    private czw w;
    private czw x;
    private czw y;
    private czw z;

    public ddd(cym cymVar, dcx dcxVar) {
        super(cymVar, dcxVar);
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new ddb(null);
        this.n = new ddb();
        this.o = new HashMap();
        this.p = new sl();
        this.q = new ArrayList();
        this.s = cymVar;
        this.t = dcxVar.b;
        dal a = dcxVar.p.a();
        this.r = a;
        a.h(this);
        i(a);
        eld eldVar = dcxVar.w;
        if (eldVar != null && (obj4 = eldVar.b) != null) {
            czw a2 = ((dbr) obj4).a();
            this.u = a2;
            a2.h(this);
            i(this.u);
        }
        if (eldVar != null && (obj3 = eldVar.a) != null) {
            czw a3 = ((dbr) obj3).a();
            this.w = a3;
            a3.h(this);
            i(this.w);
        }
        if (eldVar != null && (obj2 = eldVar.c) != null) {
            czw a4 = ((dbs) obj2).a();
            this.y = a4;
            a4.h(this);
            i(this.y);
        }
        if (eldVar != null && (obj = eldVar.d) != null) {
            czw a5 = ((dbs) obj).a();
            this.A = a5;
            a5.h(this);
            i(this.A);
        }
    }

    private final ddc s(int i) {
        for (int size = this.q.size(); size < i; size++) {
            this.q.add(new ddc());
        }
        return (ddc) this.q.get(i - 1);
    }

    private final List t(String str, float f, dbk dbkVar, float f2, float f3, boolean z) {
        int i;
        float measureText;
        int i2 = 0;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i5 = 0;
        float f6 = 0.0f;
        while (i2 < str.length()) {
            int i6 = i2 + 1;
            char charAt = str.charAt(i2);
            if (z) {
                dbl dblVar = (dbl) tc.a(this.t.e, dbl.a(charAt, dbkVar.a, dbkVar.c));
                if (dblVar != null) {
                    measureText = (((float) dblVar.b) * f2 * dfb.a()) + f3;
                    i = i2;
                } else {
                    i2 = i6;
                }
            } else {
                i = i2;
                measureText = this.m.measureText(str.substring(i, i6)) + f3;
            }
            if (charAt == ' ') {
                z2 = true;
                f6 = measureText;
            } else {
                if (z2) {
                    f5 = measureText;
                    i5 = i;
                } else {
                    f5 += measureText;
                }
                z2 = false;
            }
            f4 += measureText;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i3++;
                ddc s = s(i3);
                if (i5 == i4) {
                    s.a(str.substring(i4, i).trim(), (f4 - measureText) - ((r10.length() - r8.length()) * f6));
                    f4 = measureText;
                    f5 = f4;
                    i4 = i;
                    i5 = i4;
                } else {
                    s.a(str.substring(i4, i5 - 1).trim(), ((f4 - f5) - ((r3.length() - r4.length()) * f6)) - f6);
                    f4 = f5;
                    i4 = i5;
                }
            }
            i2 = i6;
        }
        if (f4 > 0.0f) {
            i3++;
            s(i3).a(str.substring(i4), f4);
        }
        return this.q.subList(0, i3);
    }

    private static final void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private static final void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private static final List w(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private static final void x(Canvas canvas, dbj dbjVar, int i, float f) {
        float f2;
        float f3;
        PointF pointF = dbjVar.k;
        PointF pointF2 = dbjVar.l;
        float a = dfb.a();
        float f4 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (dbjVar.e * a) + pointF.y;
        }
        float f5 = i * dbjVar.e * a;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = dbjVar.m;
        int i3 = i2 - 1;
        if (i2 != 0) {
            float f6 = f5 + f2;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                    canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f6);
                    return;
                }
                canvas.translate((f3 + f4) - f, f6);
                return;
            }
            canvas.translate(f3, f6);
            return;
        }
        throw null;
    }

    @Override // defpackage.dcu, defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        super.a(obj, dfeVar);
        if (obj == cyq.a) {
            czw czwVar = this.v;
            if (czwVar != null) {
                k(czwVar);
            }
            if (dfeVar == null) {
                this.v = null;
                return;
            }
            dan danVar = new dan(dfeVar);
            this.v = danVar;
            danVar.h(this);
            i(this.v);
            return;
        }
        if (obj == cyq.b) {
            czw czwVar2 = this.x;
            if (czwVar2 != null) {
                k(czwVar2);
            }
            if (dfeVar == null) {
                this.x = null;
                return;
            }
            dan danVar2 = new dan(dfeVar);
            this.x = danVar2;
            danVar2.h(this);
            i(this.x);
            return;
        }
        if (obj == cyq.s) {
            czw czwVar3 = this.z;
            if (czwVar3 != null) {
                k(czwVar3);
            }
            if (dfeVar == null) {
                this.z = null;
                return;
            }
            dan danVar3 = new dan(dfeVar);
            this.z = danVar3;
            danVar3.h(this);
            i(this.z);
            return;
        }
        if (obj == cyq.t) {
            czw czwVar4 = this.B;
            if (czwVar4 != null) {
                k(czwVar4);
            }
            if (dfeVar == null) {
                this.B = null;
                return;
            }
            dan danVar4 = new dan(dfeVar);
            this.B = danVar4;
            danVar4.h(this);
            i(this.B);
            return;
        }
        if (obj == cyq.F) {
            czw czwVar5 = this.C;
            if (czwVar5 != null) {
                k(czwVar5);
            }
            if (dfeVar == null) {
                this.C = null;
                return;
            }
            dan danVar5 = new dan(dfeVar);
            this.C = danVar5;
            danVar5.h(this);
            i(this.C);
            return;
        }
        if (obj == cyq.M) {
            czw czwVar6 = this.D;
            if (czwVar6 != null) {
                k(czwVar6);
            }
            if (dfeVar == null) {
                this.D = null;
                return;
            }
            dan danVar6 = new dan(dfeVar);
            this.D = danVar6;
            danVar6.h(this);
            i(this.D);
            return;
        }
        if (obj == cyq.O) {
            this.r.l(dfeVar);
        }
    }

    @Override // defpackage.dcu, defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.t.h.width(), this.t.h.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0371  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.dcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r24, android.graphics.Matrix r25, int r26) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddd.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
