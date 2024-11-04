package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dcu implements czb, czr, dbn {
    final Matrix a;
    final cym b;
    final dcx c;
    public daa d;
    public dcu e;
    public dcu f;
    final dam g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new cyx(1);
    private final Paint n = new cyx(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new cyx(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private List w;
    private final List x;
    private boolean y;
    private apc z;

    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.List, java.lang.Object] */
    public dcu(cym cymVar, dcx dcxVar) {
        cyx cyxVar = new cyx(1);
        this.p = cyxVar;
        this.q = new cyx(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.x = new ArrayList();
        this.y = true;
        this.h = 0.0f;
        this.b = cymVar;
        this.c = dcxVar;
        String str = dcxVar.c;
        if (dcxVar.u == 3) {
            cyxVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            cyxVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        dam damVar = new dam(dcxVar.h);
        this.g = damVar;
        damVar.d(this);
        List list = dcxVar.g;
        if (list != null && !list.isEmpty()) {
            apc apcVar = new apc(dcxVar.g);
            this.z = apcVar;
            Iterator it = apcVar.c.iterator();
            while (it.hasNext()) {
                ((czw) it.next()).h(this);
            }
            for (czw czwVar : this.z.a) {
                i(czwVar);
                czwVar.h(this);
            }
        }
        if (!this.c.r.isEmpty()) {
            daa daaVar = new daa(this.c.r);
            this.d = daaVar;
            daaVar.b = true;
            daaVar.h(new czr() { // from class: dct
                @Override // defpackage.czr
                public final void d() {
                    boolean z;
                    dcu dcuVar = dcu.this;
                    if (dcuVar.d.l() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dcuVar.n(z);
                }
            });
            n(((Float) this.d.e()).floatValue() == 1.0f);
            i(this.d);
            return;
        }
        n(true);
    }

    private final void s() {
        if (this.w == null) {
            if (this.f == null) {
                this.w = Collections.emptyList();
                return;
            }
            this.w = new ArrayList();
            for (dcu dcuVar = this.f; dcuVar != null; dcuVar = dcuVar.f) {
                this.w.add(dcuVar);
            }
        }
    }

    private final void t(Canvas canvas) {
        canvas.drawRect(this.r.left - 1.0f, this.r.top - 1.0f, this.r.right + 1.0f, this.r.bottom + 1.0f, this.q);
        cxw.a();
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        cww cwwVar = this.b.a.n;
        String str = this.c.c;
    }

    @Override // defpackage.dbn
    public void a(Object obj, dfe dfeVar) {
        this.g.e(obj, dfeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0131  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v40, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v58, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.czb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcu.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.czb
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.a.set(matrix);
        if (z) {
            List list = this.w;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.a.preConcat(((dcu) this.w.get(size)).g.a());
                    }
                }
            } else {
                dcu dcuVar = this.f;
                if (dcuVar != null) {
                    this.a.preConcat(dcuVar.g.a());
                }
            }
        }
        this.a.preConcat(this.g.a());
    }

    @Override // defpackage.czr
    public final void d() {
        u();
    }

    @Override // defpackage.dbn
    public final void e(dbm dbmVar, int i, List list, dbm dbmVar2) {
        dcu dcuVar = this.e;
        if (dcuVar != null) {
            dbm b = dbmVar2.b(dcuVar.g());
            if (dbmVar.d(this.e.g(), i)) {
                list.add(b.c(this.e));
            }
            if (dbmVar.f(g(), i)) {
                this.e.l(dbmVar, dbmVar.a(this.e.g(), i) + i, list, b);
            }
        }
        if (dbmVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                dbmVar2 = dbmVar2.b(g());
                if (dbmVar.d(g(), i)) {
                    list.add(dbmVar2.c(this));
                }
            }
            if (dbmVar.f(g(), i)) {
                l(dbmVar, i + dbmVar.a(g(), i), list, dbmVar2);
            }
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.c.c;
    }

    public final BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public final void i(czw czwVar) {
        if (czwVar == null) {
            return;
        }
        this.x.add(czwVar);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public final void k(czw czwVar) {
        this.x.remove(czwVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    public void m(float f) {
        dam damVar = this.g;
        czw czwVar = damVar.e;
        if (czwVar != null) {
            czwVar.j(f);
        }
        czw czwVar2 = damVar.h;
        if (czwVar2 != null) {
            czwVar2.j(f);
        }
        czw czwVar3 = damVar.i;
        if (czwVar3 != null) {
            czwVar3.j(f);
        }
        czw czwVar4 = damVar.a;
        if (czwVar4 != null) {
            czwVar4.j(f);
        }
        czw czwVar5 = damVar.b;
        if (czwVar5 != null) {
            czwVar5.j(f);
        }
        czw czwVar6 = damVar.c;
        if (czwVar6 != null) {
            czwVar6.j(f);
        }
        czw czwVar7 = damVar.d;
        if (czwVar7 != null) {
            czwVar7.j(f);
        }
        daa daaVar = damVar.f;
        if (daaVar != null) {
            daaVar.j(f);
        }
        daa daaVar2 = damVar.g;
        if (daaVar2 != null) {
            daaVar2.j(f);
        }
        if (this.z != null) {
            for (int i = 0; i < this.z.c.size(); i++) {
                ((czw) this.z.c.get(i)).j(f);
            }
        }
        daa daaVar3 = this.d;
        if (daaVar3 != null) {
            daaVar3.j(f);
        }
        dcu dcuVar = this.e;
        if (dcuVar != null) {
            dcuVar.m(f);
        }
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            ((czw) this.x.get(i2)).j(f);
        }
    }

    public final void n(boolean z) {
        if (z != this.y) {
            this.y = z;
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    final boolean o() {
        apc apcVar = this.z;
        if (apcVar != null && !apcVar.c.isEmpty()) {
            return true;
        }
        return false;
    }

    final boolean p() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public ddg q() {
        return this.c.v;
    }

    public nca r() {
        return this.c.x;
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
    }

    public void l(dbm dbmVar, int i, List list, dbm dbmVar2) {
    }
}
