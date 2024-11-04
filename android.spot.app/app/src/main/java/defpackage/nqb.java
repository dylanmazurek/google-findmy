package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqb extends nnx implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final nnz b;

    private nqb(nnz nnzVar) {
        this.b = nnzVar;
    }

    public static synchronized nqb h(nnz nnzVar) {
        nqb nqbVar;
        synchronized (nqb.class) {
            HashMap hashMap = a;
            if (hashMap == null) {
                a = new HashMap(7);
                nqbVar = null;
            } else {
                nqbVar = (nqb) hashMap.get(nnzVar);
            }
            if (nqbVar == null) {
                nqb nqbVar2 = new nqb(nnzVar);
                a.put(nnzVar, nqbVar2);
                return nqbVar2;
            }
            return nqbVar;
        }
    }

    private final UnsupportedOperationException i() {
        return new UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return h(this.b);
    }

    @Override // defpackage.nnx
    public final long a(long j, int i) {
        throw i();
    }

    @Override // defpackage.nnx
    public final long b(long j, long j2) {
        throw i();
    }

    @Override // defpackage.nnx
    public final long c() {
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // defpackage.nnx
    public final nnz d() {
        return this.b;
    }

    @Override // defpackage.nnx
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nqb) {
            nqb nqbVar = (nqb) obj;
            nqbVar.g();
            return nqbVar.g().equals(g());
        }
        return false;
    }

    @Override // defpackage.nnx
    public final boolean f() {
        return false;
    }

    public final String g() {
        return this.b.m;
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return "UnsupportedDurationField[" + g() + "]";
    }
}
