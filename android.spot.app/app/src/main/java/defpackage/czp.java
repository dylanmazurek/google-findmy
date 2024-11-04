package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czp extends cyy {
    private final dcu d;
    private final String e;
    private final boolean f;
    private final czw g;
    private czw h;

    public czp(cym cymVar, dcu dcuVar, dcr dcrVar) {
        super(cymVar, dcuVar, bpt.p(dcrVar.i), bpu.m(dcrVar.j), dcrVar.g, dcrVar.e, dcrVar.f, dcrVar.c, dcrVar.b);
        this.d = dcuVar;
        this.e = dcrVar.a;
        this.f = dcrVar.h;
        czw a = dcrVar.d.a();
        this.g = a;
        a.h(this);
        dcuVar.i(a);
    }

    @Override // defpackage.cyy, defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        super.a(obj, dfeVar);
        if (obj == cyq.b) {
            this.g.k(dfeVar);
            return;
        }
        if (obj == cyq.K) {
            czw czwVar = this.h;
            if (czwVar != null) {
                this.d.k(czwVar);
            }
            if (dfeVar == null) {
                this.h = null;
                return;
            }
            dan danVar = new dan(dfeVar);
            this.h = danVar;
            danVar.h(this);
            this.d.i(this.g);
        }
    }

    @Override // defpackage.cyy, defpackage.czb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        this.b.setColor(((czx) this.g).l());
        czw czwVar = this.h;
        if (czwVar != null) {
            this.b.setColorFilter((ColorFilter) czwVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.e;
    }
}
