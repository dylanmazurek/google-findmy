package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czl implements czr, czh, czj {
    private final String c;
    private final boolean d;
    private final cym e;
    private final czw f;
    private final czw g;
    private final czw h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final bet k = new bet((char[]) null);
    private czw i = null;

    public czl(cym cymVar, dcu dcuVar, dck dckVar) {
        this.c = dckVar.a;
        this.d = dckVar.e;
        this.e = cymVar;
        czw a = dckVar.b.a();
        this.f = a;
        czw a2 = dckVar.c.a();
        this.g = a2;
        czw a3 = dckVar.d.a();
        this.h = a3;
        dcuVar.i(a);
        dcuVar.i(a2);
        dcuVar.i(a3);
        a.h(this);
        a2.h(this);
        a3.h(this);
    }

    @Override // defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        if (obj == cyq.l) {
            this.g.k(dfeVar);
        } else if (obj == cyq.n) {
            this.f.k(dfeVar);
        } else if (obj == cyq.m) {
            this.h.k(dfeVar);
        }
    }

    @Override // defpackage.czr
    public final void d() {
        this.j = false;
        this.e.invalidateSelf();
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
                    this.k.m(czqVar);
                    czqVar.a(this);
                }
            }
            if (cyzVar instanceof czn) {
                this.i = ((czn) cyzVar).a;
            }
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.c;
    }

    @Override // defpackage.czj
    public final Path i() {
        czw czwVar;
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float l = ((daa) this.h).l();
        if (l == 0.0f && (czwVar = this.i) != null) {
            l = Math.min(((Float) czwVar.e()).floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (l > min) {
            l = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + l);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - l);
        if (l > 0.0f) {
            float f3 = l + l;
            this.b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + l, pointF2.y + f2);
        if (l > 0.0f) {
            float f4 = l + l;
            this.b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + l);
        if (l > 0.0f) {
            float f5 = l + l;
            this.b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - l, pointF2.y - f2);
        if (l > 0.0f) {
            float f6 = l + l;
            this.b.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.k.n(this.a);
        this.j = true;
        return this.a;
    }
}
