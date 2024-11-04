package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daj extends czw {
    protected dfe e;
    protected dfe f;
    private final PointF g;
    private final PointF h;
    private final czw i;
    private final czw j;

    public daj(czw czwVar, czw czwVar2) {
        super(Collections.emptyList());
        this.g = new PointF();
        this.h = new PointF();
        this.i = czwVar;
        this.j = czwVar2;
        j(this.c);
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object e() {
        return l(0.0f);
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        return l(f);
    }

    @Override // defpackage.czw
    public final void j(float f) {
        this.i.j(f);
        this.j.j(f);
        this.g.set(((Float) this.i.e()).floatValue(), ((Float) this.j.e()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((czr) this.a.get(i)).d();
        }
    }

    final PointF l(float f) {
        Float f2;
        dfc d;
        float floatValue;
        dfc d2;
        float floatValue2;
        Float f3 = null;
        if (this.e != null && (d2 = this.i.d()) != null) {
            float b = this.i.b();
            Float f4 = d2.h;
            dfe dfeVar = this.e;
            if (f4 == null) {
                floatValue2 = d2.g;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = (Float) dfeVar.b(d2.g, floatValue2, (Float) d2.b, (Float) d2.c, f, f, b);
        } else {
            f2 = null;
        }
        if (this.f != null && (d = this.j.d()) != null) {
            float b2 = this.j.b();
            Float f5 = d.h;
            dfe dfeVar2 = this.f;
            if (f5 == null) {
                floatValue = d.g;
            } else {
                floatValue = f5.floatValue();
            }
            f3 = (Float) dfeVar2.b(d.g, floatValue, (Float) d.b, (Float) d.c, f, f, b2);
        }
        if (f2 == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.h;
    }
}
