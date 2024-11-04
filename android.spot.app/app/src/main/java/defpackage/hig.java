package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hig {
    public final hik a;
    public final njz b;

    public hig() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hig) {
            hig higVar = (hig) obj;
            if (this.b.equals(higVar.b) && this.a.equals(higVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        hik hikVar = this.a;
        return "ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=" + String.valueOf(this.b) + ", features=" + String.valueOf(hikVar) + "}";
    }

    public hig(njz njzVar, hik hikVar) {
        this.b = njzVar;
        this.a = hikVar;
    }
}
