package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hne {
    public final neu a;

    public hne() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hne) {
            return this.a.equals(((hne) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        neu neuVar = this.a;
        if (neuVar.y()) {
            i = neuVar.i();
        } else {
            int i2 = neuVar.y;
            if (i2 == 0) {
                i2 = neuVar.i();
                neuVar.y = i2;
            }
            i = i2;
        }
        return i ^ 1000003;
    }

    public final String toString() {
        return "Snapshot{debugLogs=" + this.a.toString() + "}";
    }

    public hne(neu neuVar) {
        if (neuVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = neuVar;
    }
}
