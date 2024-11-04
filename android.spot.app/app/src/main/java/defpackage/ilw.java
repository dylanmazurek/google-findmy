package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilw extends imd {
    public final ilk a;

    public ilw() {
        throw null;
    }

    @Override // defpackage.imd
    public final String a() {
        return "signal";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilw) {
            return this.a.equals(((ilw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SignallingConfig{service=" + this.a.toString() + "}";
    }

    public ilw(ilk ilkVar) {
        this.a = ilkVar;
    }
}
