package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czc implements czj, czr, czh {
    private final String b;
    private final cym c;
    private final czw d;
    private final czw e;
    private final dce f;
    private boolean g;
    private final Path a = new Path();
    private final bet h = new bet((char[]) null);

    public czc(cym cymVar, dcu dcuVar, dce dceVar) {
        this.b = dceVar.a;
        this.c = cymVar;
        czw a = dceVar.c.a();
        this.d = a;
        czw a2 = dceVar.b.a();
        this.e = a2;
        this.f = dceVar;
        dcuVar.i(a);
        dcuVar.i(a2);
        a.h(this);
        a2.h(this);
    }

    @Override // defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        if (obj == cyq.k) {
            this.d.k(dfeVar);
        } else if (obj == cyq.n) {
            this.e.k(dfeVar);
        }
    }

    @Override // defpackage.czr
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.dbn
    public final void e(dbm dbmVar, int i, List list, dbm dbmVar2) {
        dew.d(dbmVar, i, list, dbmVar2, this);
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            cyz cyzVar = (cyz) list.get(i);
            if (cyzVar instanceof czq) {
                czq czqVar = (czq) cyzVar;
                if (czqVar.e == 1) {
                    this.h.m(czqVar);
                    czqVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.b;
    }

    @Override // defpackage.czj
    public final Path i() {
        if (this.g) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.g = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        this.a.reset();
        float f3 = f2 * 0.55228f;
        float f4 = -f;
        float f5 = -f3;
        float f6 = f3 + 0.0f;
        float f7 = 0.55228f * f;
        float f8 = -f7;
        float f9 = f7 + 0.0f;
        float f10 = -f2;
        if (this.f.d) {
            this.a.moveTo(0.0f, f10);
            this.a.cubicTo(f8, f10, f4, f5, f4, 0.0f);
            this.a.cubicTo(f4, f6, f8, f2, 0.0f, f2);
            this.a.cubicTo(f9, f2, f, f6, f, 0.0f);
            this.a.cubicTo(f, f5, f9, f10, 0.0f, f10);
        } else {
            this.a.moveTo(0.0f, f10);
            this.a.cubicTo(f9, f10, f, f5, f, 0.0f);
            this.a.cubicTo(f, f6, f9, f2, 0.0f, f2);
            this.a.cubicTo(f8, f2, f4, f6, f4, 0.0f);
            this.a.cubicTo(f4, f5, f8, f10, 0.0f, f10);
        }
        PointF pointF2 = (PointF) this.e.e();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.h.n(this.a);
        this.g = true;
        return this.a;
    }
}
