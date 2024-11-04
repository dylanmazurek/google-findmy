package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czd implements czb, czr, czh {
    float a;
    private final Path b;
    private final Paint c;
    private final dcu d;
    private final String e;
    private final boolean f;
    private final List g;
    private final czw h;
    private final czw i;
    private czw j;
    private final cym k;
    private czw l;
    private czz m;

    public czd(cym cymVar, dcu dcuVar, dco dcoVar) {
        Path path = new Path();
        this.b = path;
        this.c = new cyx(1);
        this.g = new ArrayList();
        this.d = dcuVar;
        this.e = dcoVar.b;
        this.f = dcoVar.e;
        this.k = cymVar;
        if (dcuVar.q() != null) {
            czw a = ((dbs) dcuVar.q().a).a();
            this.l = a;
            a.h(this);
            dcuVar.i(this.l);
        }
        if (dcuVar.r() != null) {
            this.m = new czz(this, dcuVar, dcuVar.r());
        }
        if (dcoVar.c != null) {
            path.setFillType(dcoVar.a);
            czw a2 = dcoVar.c.a();
            this.h = a2;
            a2.h(this);
            dcuVar.i(a2);
            czw a3 = dcoVar.d.a();
            this.i = a3;
            a3.h(this);
            dcuVar.i(a3);
            return;
        }
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        czz czzVar;
        czz czzVar2;
        czz czzVar3;
        czz czzVar4;
        czz czzVar5;
        if (obj == cyq.a) {
            this.h.k(dfeVar);
            return;
        }
        if (obj == cyq.d) {
            this.i.k(dfeVar);
            return;
        }
        if (obj == cyq.K) {
            czw czwVar = this.j;
            if (czwVar != null) {
                this.d.k(czwVar);
            }
            if (dfeVar == null) {
                this.j = null;
                return;
            }
            dan danVar = new dan(dfeVar);
            this.j = danVar;
            danVar.h(this);
            this.d.i(this.j);
            return;
        }
        if (obj == cyq.j) {
            czw czwVar2 = this.l;
            if (czwVar2 != null) {
                czwVar2.k(dfeVar);
                return;
            }
            dan danVar2 = new dan(dfeVar);
            this.l = danVar2;
            danVar2.h(this);
            this.d.i(this.l);
            return;
        }
        if (obj == cyq.e && (czzVar5 = this.m) != null) {
            czzVar5.b(dfeVar);
            return;
        }
        if (obj == cyq.G && (czzVar4 = this.m) != null) {
            czzVar4.f(dfeVar);
            return;
        }
        if (obj == cyq.H && (czzVar3 = this.m) != null) {
            czzVar3.c(dfeVar);
            return;
        }
        if (obj == cyq.I && (czzVar2 = this.m) != null) {
            czzVar2.e(dfeVar);
        } else if (obj == cyq.J && (czzVar = this.m) != null) {
            czzVar.g(dfeVar);
        }
    }

    @Override // defpackage.czb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        czw czwVar = this.h;
        czw czwVar2 = this.i;
        this.c.setColor((dew.e((int) ((((i / 255.0f) * ((Integer) czwVar2.e()).intValue()) / 100.0f) * 255.0f)) << 24) | (((czx) czwVar).l() & 16777215));
        czw czwVar3 = this.j;
        if (czwVar3 != null) {
            this.c.setColorFilter((ColorFilter) czwVar3.e());
        }
        czw czwVar4 = this.l;
        if (czwVar4 != null) {
            float floatValue = ((Float) czwVar4.e()).floatValue();
            if (floatValue == 0.0f) {
                this.c.setMaskFilter(null);
            } else if (floatValue != this.a) {
                this.c.setMaskFilter(this.d.h(floatValue));
            }
            this.a = floatValue;
        }
        czz czzVar = this.m;
        if (czzVar != null) {
            czzVar.a(this.c);
        }
        this.b.reset();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.b.addPath(((czj) this.g.get(i2)).i(), matrix);
        }
        canvas.drawPath(this.b, this.c);
        cxw.a();
    }

    @Override // defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            this.b.addPath(((czj) this.g.get(i)).i(), matrix);
        }
        this.b.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.czr
    public final void d() {
        this.k.invalidateSelf();
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
                this.g.add((czj) cyzVar);
            }
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.e;
    }
}
