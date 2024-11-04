package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atq {
    private float a = 1.0f;
    private bln b = bln.Ltr;
    private ji c;

    public abstract long a();

    protected abstract void b(asn asnVar);

    protected void d(ji jiVar) {
        throw null;
    }

    public final void f(asn asnVar, long j, float f, ji jiVar) {
        if (this.a != f) {
            j(f);
            this.a = f;
        }
        if (!amr.i(this.c, jiVar)) {
            d(jiVar);
            this.c = jiVar;
        }
        bln m = asnVar.m();
        if (this.b != m) {
            e(m);
            this.b = m;
        }
        float b = aqn.b(asnVar.l()) - aqn.b(j);
        float a = aqn.a(asnVar.l()) - aqn.a(j);
        asnVar.n().c.v(b, a);
        float f2 = -b;
        float f3 = -a;
        if (f > 0.0f) {
            try {
                if (aqn.b(j) > 0.0f && aqn.a(j) > 0.0f) {
                    b(asnVar);
                }
            } finally {
                asnVar.n().c.v(f2, f3);
            }
        }
    }

    protected void j(float f) {
        throw null;
    }

    protected void e(bln blnVar) {
    }
}
