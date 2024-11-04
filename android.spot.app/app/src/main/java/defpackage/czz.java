package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czz implements czr {
    private final czr a;
    private final czw b;
    private final czw c;
    private final czw d;
    private final czw e;
    private final czw f;
    private boolean g = true;

    public czz(czr czrVar, dcu dcuVar, nca ncaVar) {
        this.a = czrVar;
        czw a = ((dbr) ncaVar.c).a();
        this.b = a;
        a.h(this);
        dcuVar.i(a);
        czw a2 = ((dbs) ncaVar.d).a();
        this.c = a2;
        a2.h(this);
        dcuVar.i(a2);
        czw a3 = ((dbs) ncaVar.e).a();
        this.d = a3;
        a3.h(this);
        dcuVar.i(a3);
        czw a4 = ((dbs) ncaVar.a).a();
        this.e = a4;
        a4.h(this);
        dcuVar.i(a4);
        czw a5 = ((dbs) ncaVar.b).a();
        this.f = a5;
        a5.h(this);
        dcuVar.i(a5);
    }

    public final void a(Paint paint) {
        if (!this.g) {
            return;
        }
        this.g = false;
        double floatValue = ((Float) this.d.e()).floatValue();
        float floatValue2 = ((Float) this.e.e()).floatValue();
        double d = floatValue * 0.017453292519943295d;
        float sin = ((float) Math.sin(d)) * floatValue2;
        float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.b.e()).intValue();
        paint.setShadowLayer(((Float) this.f.e()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public final void b(dfe dfeVar) {
        this.b.k(dfeVar);
    }

    public final void c(dfe dfeVar) {
        this.d.k(dfeVar);
    }

    @Override // defpackage.czr
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(dfe dfeVar) {
        this.e.k(dfeVar);
    }

    public final void f(dfe dfeVar) {
        if (dfeVar == null) {
            this.c.k(null);
        } else {
            this.c.k(new czy(dfeVar));
        }
    }

    public final void g(dfe dfeVar) {
        this.f.k(dfeVar);
    }
}
