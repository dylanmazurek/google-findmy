package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzr {
    public final fzq a;
    public final bsc b;

    public fzr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fzr) {
            fzr fzrVar = (fzr) obj;
            if (this.a.equals(fzrVar.a) && this.b.equals(fzrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1923371780;
    }

    public final String toString() {
        bsc bscVar = this.b;
        return "CollectionBasisResolverHolder{conditions=" + this.a.toString() + ", resolver=" + bscVar.toString() + "}";
    }

    public fzr(fzq fzqVar, bsc bscVar) {
        this.a = fzqVar;
        this.b = bscVar;
    }
}
