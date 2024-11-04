package defpackage;

import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nai implements muv {
    public final mrr a = new mrr(null, mrs.a);
    public final long b;
    private final mrr c;
    private final mrp d;

    public nai(long j, nai naiVar, int i) {
        mrs mrsVar = mrs.a;
        this.c = new mrr(naiVar, mrsVar);
        this.b = j;
        this.d = new mrp(i << 16, mrsVar);
    }

    public abstract int a();

    public abstract void l(int i);

    public final Object m() {
        return this.a.a;
    }

    public final nai n() {
        Object m = m();
        if (m == nah.a) {
            return null;
        }
        return (nai) m;
    }

    public final nai o() {
        return (nai) this.c.a;
    }

    public final void p() {
        this.c.b(null);
    }

    public final void q() {
        Object obj;
        nai naiVar;
        nai n;
        boolean z = msy.a;
        if (r()) {
            return;
        }
        while (true) {
            nai o = o();
            while (o != null && o.u()) {
                o = (nai) o.c.a;
            }
            nai n2 = n();
            n2.getClass();
            while (n2.u() && (n = n2.n()) != null) {
                n2 = n;
            }
            mrr mrrVar = n2.c;
            do {
                obj = mrrVar.a;
                if (((nai) obj) == null) {
                    naiVar = null;
                } else {
                    naiVar = o;
                }
            } while (!mrrVar.d(obj, naiVar));
            if (o != null) {
                o.a.c(n2);
            }
            if (!n2.u() || n2.r()) {
                if (o == null || !o.u()) {
                    return;
                }
            }
        }
    }

    public final boolean r() {
        if (n() == null) {
            return true;
        }
        return false;
    }

    public final void s() {
        if (this.d.b() == a()) {
            q();
        }
    }

    public final boolean t() {
        if (mrp.a.addAndGet(this.d, -65536) == a() && !r()) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (this.d.b == a() && !r()) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        mrp mrpVar;
        int i;
        do {
            mrpVar = this.d;
            i = mrpVar.b;
            if (i == a() && !r()) {
                return false;
            }
        } while (!mrpVar.c(i, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i));
        return true;
    }
}
