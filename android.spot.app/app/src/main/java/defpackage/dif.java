package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dif extends dic {
    public final Object a;
    private final dih b;

    public dif(dih dihVar, Object obj) {
        dihVar.getClass();
        this.b = dihVar;
        this.a = obj;
        int ordinal = dihVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new mku();
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.dic
    public final dih a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dif)) {
            return false;
        }
        dif difVar = (dif) obj;
        if (this.b == difVar.b && amr.i(this.a, difVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Resource(status=" + this.b + ", resource=" + this.a + ")";
    }
}
