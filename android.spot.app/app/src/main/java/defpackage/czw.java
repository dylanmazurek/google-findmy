package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czw {
    protected dfe d;
    private final czt e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public czw(List list) {
        czt czuVar;
        czt cztVar;
        if (list.isEmpty()) {
            cztVar = new czs();
        } else {
            if (list.size() == 1) {
                czuVar = new czv(list);
            } else {
                czuVar = new czu(list);
            }
            cztVar = czuVar;
        }
        this.e = cztVar;
    }

    private final float l() {
        float f = this.g;
        if (f == -1.0f) {
            float b = this.e.b();
            this.g = b;
            return b;
        }
        return f;
    }

    public float a() {
        float f = this.h;
        if (f == -1.0f) {
            float a = this.e.a();
            this.h = a;
            return a;
        }
        return f;
    }

    public final float b() {
        dfc d = d();
        if (d != null && !d.e()) {
            return d.d.getInterpolation(c());
        }
        return 0.0f;
    }

    public final float c() {
        if (!this.b) {
            dfc d = d();
            if (!d.e()) {
                return (this.c - d.c()) / (d.b() - d.c());
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final dfc d() {
        dfc c = this.e.c();
        cxw.a();
        return c;
    }

    public Object e() {
        Object f;
        float c = c();
        if (this.d == null && this.e.d(c)) {
            return this.f;
        }
        dfc d = d();
        Interpolator interpolator = d.e;
        if (interpolator != null && d.f != null) {
            f = g(d, c, interpolator.getInterpolation(c), d.f.getInterpolation(c));
        } else {
            f = f(d, b());
        }
        this.f = f;
        return f;
    }

    public abstract Object f(dfc dfcVar, float f);

    protected Object g(dfc dfcVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(czr czrVar) {
        this.a.add(czrVar);
    }

    public void i() {
        for (int i = 0; i < this.a.size(); i++) {
            ((czr) this.a.get(i)).d();
        }
    }

    public void j(float f) {
        if (!this.e.e()) {
            if (f < l()) {
                f = l();
            } else if (f > a()) {
                f = a();
            }
            if (f != this.c) {
                this.c = f;
                if (this.e.f(f)) {
                    i();
                }
            }
        }
    }

    public final void k(dfe dfeVar) {
        dfe dfeVar2 = this.d;
        if (dfeVar2 != null) {
            dfeVar2.d = null;
        }
        this.d = dfeVar;
        if (dfeVar != null) {
            dfeVar.d = this;
        }
    }
}
