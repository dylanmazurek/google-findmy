package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nod extends nol implements Serializable, noh {
    private static final Set b;
    private static final long serialVersionUID = -8775358157899L;
    public final nno a;
    private final long c;
    private transient int d;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add(nnz.g);
        hashSet.add(nnz.f);
        hashSet.add(nnz.e);
        hashSet.add(nnz.c);
        hashSet.add(nnz.d);
        hashSet.add(nnz.b);
        hashSet.add(nnz.a);
    }

    public nod() {
        this(nnt.a(), npg.O());
    }

    private Object readResolve() {
        nno nnoVar = this.a;
        if (nnoVar == null) {
            return new nod(this.c, npg.o);
        }
        if (!nnw.a.equals(nnoVar.z())) {
            return new nod(this.c, this.a.a());
        }
        return this;
    }

    @Override // defpackage.noj
    /* renamed from: a */
    public final int compareTo(noh nohVar) {
        if (this == nohVar) {
            return 0;
        }
        if (nohVar instanceof nod) {
            nod nodVar = (nod) nohVar;
            if (this.a.equals(nodVar.a)) {
                long j = this.c;
                long j2 = nodVar.c;
                if (j >= j2) {
                    if (j == j2) {
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
        }
        if (this == nohVar) {
            return 0;
        }
        nohVar.g();
        for (int i = 0; i < 3; i++) {
            if (h(i) != nohVar.h(i)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (c(i2) > nohVar.c(i2)) {
                return 1;
            }
            if (c(i2) < nohVar.c(i2)) {
                return -1;
            }
        }
        return 0;
    }

    @Override // defpackage.noj, defpackage.noh
    public final int b(nns nnsVar) {
        if (f(nnsVar)) {
            return nnsVar.a(this.a).a(this.c);
        }
        throw new IllegalArgumentException("Field '" + nnsVar.y + "' is not supported");
    }

    @Override // defpackage.noh
    public final int c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    nno nnoVar = this.a;
                    return nnoVar.f().a(this.c);
                }
                throw new IndexOutOfBoundsException(a.ae(i, "Invalid index: "));
            }
            nno nnoVar2 = this.a;
            return nnoVar2.q().a(this.c);
        }
        nno nnoVar3 = this.a;
        return nnoVar3.w().a(this.c);
    }

    @Override // defpackage.noj, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((noh) obj);
    }

    @Override // defpackage.noh
    public final nno d() {
        return this.a;
    }

    @Override // defpackage.noj
    protected final nnq e(int i, nno nnoVar) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return nnoVar.f();
                }
                throw new IndexOutOfBoundsException(a.ae(i, "Invalid index: "));
            }
            return nnoVar.q();
        }
        return nnoVar.w();
    }

    @Override // defpackage.noj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nod) {
            nod nodVar = (nod) obj;
            if (this.a.equals(nodVar.a)) {
                if (this.c == nodVar.c) {
                    return true;
                }
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof noh) {
            noh nohVar = (noh) obj;
            nohVar.g();
            for (int i = 0; i < 3; i++) {
                if (c(i) == nohVar.c(i) && h(i) == nohVar.h(i)) {
                }
            }
            return moz.az(this.a, nohVar.d());
        }
        return false;
    }

    @Override // defpackage.noj, defpackage.noh
    public final boolean f(nns nnsVar) {
        Set set = b;
        nnz nnzVar = ((nnr) nnsVar).a;
        if (!set.contains(nnzVar) && nnzVar.a(this.a).c() < this.a.B().c()) {
            return false;
        }
        return nnsVar.a(this.a).w();
    }

    @Override // defpackage.noj
    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int i2 = 157;
            for (int i3 = 0; i3 < 3; i3++) {
                i2 = (((i2 * 23) + c(i3)) * 23) + h(i3).hashCode();
            }
            int hashCode = i2 + this.a.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        nqe nqeVar = nqz.a;
        StringBuilder sb = new StringBuilder(nqeVar.d().b());
        try {
            nqeVar.d().d(sb, this, null);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public nod(long j) {
        this(j, npg.O());
    }

    public nod(long j, nno nnoVar) {
        nno c = nnt.c(nnoVar);
        nnw z = c.z();
        nnw nnwVar = nnw.a;
        j = nnwVar != z ? nnwVar.m(z.d(j), j) : j;
        nno a = c.a();
        this.c = a.f().g(j);
        this.a = a;
    }

    @Override // defpackage.noh
    public final void g() {
    }
}
