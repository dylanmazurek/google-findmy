package defpackage;

import android.graphics.Outline;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcx {
    public boolean a;
    private boolean b = true;
    private final Outline c;
    private arf d;
    private arg e;
    private boolean f;
    private float g;
    private long h;
    private long i;
    private boolean j;

    public bcx() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        this.h = 0L;
        this.i = 0L;
    }

    private final void g() {
        if (this.a) {
            this.h = 0L;
            this.g = 0.0f;
            this.e = null;
            this.a = false;
            this.f = false;
            arf arfVar = this.d;
            if (arfVar != null && this.j && aqn.b(this.i) > 0.0f && aqn.a(this.i) > 0.0f) {
                this.b = true;
                aql aqlVar = ((ard) arfVar).a;
                this.h = a.k(aqlVar.b, aqlVar.c);
                this.i = a.k(aqlVar.b(), aqlVar.a());
                Outline outline = this.c;
                float f = aqlVar.e;
                float f2 = aqlVar.d;
                outline.setRect(Math.round(aqlVar.b), Math.round(aqlVar.c), Math.round(f2), Math.round(f));
                return;
            }
            this.c.setEmpty();
        }
    }

    public final Outline a() {
        g();
        if (this.j && this.b) {
            return this.c;
        }
        return null;
    }

    public final arg b() {
        g();
        return null;
    }

    public final void c(aqv aqvVar) {
        b();
        aqvVar.j(aqk.b(this.h), aqk.c(this.h), aqk.b(this.h) + aqn.b(this.i), aqk.c(this.h) + aqn.a(this.i));
    }

    public final boolean d() {
        return true;
    }

    public final boolean e(long j) {
        arf arfVar;
        if (this.j && (arfVar = this.d) != null) {
            return rc.e(arfVar, aqk.b(j), aqk.c(j));
        }
        return true;
    }

    public final boolean f(arf arfVar, float f, boolean z, long j) {
        this.c.setAlpha(f);
        boolean i = amr.i(this.d, arfVar);
        boolean z2 = !i;
        if (!i) {
            this.d = arfVar;
            this.a = true;
        }
        this.i = j;
        boolean z3 = false;
        if (arfVar != null && z) {
            z3 = true;
        }
        if (this.j != z3) {
            this.j = z3;
            this.a = true;
        }
        return z2;
    }
}
