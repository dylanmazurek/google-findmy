package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czm implements czb, czj, czg, czr, czh {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final cym c;
    private final dcu d;
    private final String e;
    private final boolean f;
    private final czw g;
    private final czw h;
    private final dam i;
    private cza j;

    public czm(cym cymVar, dcu dcuVar, dcl dclVar) {
        this.c = cymVar;
        this.d = dcuVar;
        this.e = dclVar.a;
        this.f = dclVar.e;
        czw a = dclVar.b.a();
        this.g = a;
        dcuVar.i(a);
        a.h(this);
        czw a2 = dclVar.c.a();
        this.h = a2;
        dcuVar.i(a2);
        a2.h(this);
        dam damVar = new dam(dclVar.d);
        this.i = damVar;
        damVar.c(dcuVar);
        damVar.d(this);
    }

    @Override // defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        if (!this.i.e(obj, dfeVar)) {
            if (obj == cyq.u) {
                this.g.k(dfeVar);
            } else if (obj == cyq.v) {
                this.h.k(dfeVar);
            }
        }
    }

    @Override // defpackage.czb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        float floatValue3 = ((Float) this.i.h.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.e()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(matrix);
                float f = i2;
                this.a.preConcat(this.i.b(f + floatValue2));
                PointF pointF = dew.a;
                this.j.b(canvas, this.a, (int) (i * (((f / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
            } else {
                return;
            }
        }
    }

    @Override // defpackage.czb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.czr
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.dbn
    public final void e(dbm dbmVar, int i, List list, dbm dbmVar2) {
        dew.d(dbmVar, i, list, dbmVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            cyz cyzVar = (cyz) this.j.a.get(i2);
            if (cyzVar instanceof czh) {
                dew.d(dbmVar, i, list, dbmVar2, (czh) cyzVar);
            }
        }
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.e;
    }

    @Override // defpackage.czg
    public final void h(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((cyz) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new cza(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.czj
    public final Path i() {
        Path i = this.j.i();
        this.b.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(this.i.b(i2 + floatValue2));
                this.b.addPath(i, this.a);
            } else {
                return this.b;
            }
        }
    }
}
