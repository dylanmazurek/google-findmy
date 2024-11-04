package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bil {
    private final bio a;
    private final Object b = null;

    public bil(bio bioVar) {
        this.a = bioVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bil)) {
            return false;
        }
        bil bilVar = (bil) obj;
        if (!amr.i(this.a, bilVar.a)) {
            return false;
        }
        Object obj2 = bilVar.b;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
