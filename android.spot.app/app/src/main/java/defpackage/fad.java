package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fad {
    public final Object a;
    private final fae b;

    public fad() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fad) {
            fad fadVar = (fad) obj;
            if (this.a.equals(fadVar.a) && this.b.equals(fadVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ (-721379959);
        a.N(1);
        return ((((hashCode * 1000003) ^ 1) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a.toString() + ", priority=DEFAULT, productData=" + this.b.toString() + ", eventContext=null}";
    }

    public fad(Object obj, fae faeVar) {
        this.a = obj;
        this.b = faeVar;
    }
}
