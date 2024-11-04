package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzq {
    private final jer a;

    public fzq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fzq) {
            return this.a.equals(((fzq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "CollectionBasisResolverConditions{accountNames=" + String.valueOf(this.a) + "}";
    }

    public fzq(jer jerVar) {
        this.a = jerVar;
    }
}
