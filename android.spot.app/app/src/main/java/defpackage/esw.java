package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esw {
    public final eit a;

    public esw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esw) {
            return this.a.equals(((esw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SemanticLocationUiState{localDeviceComponentState=" + this.a.toString() + "}";
    }

    public esw(eit eitVar) {
        if (eitVar == null) {
            throw new NullPointerException("Null localDeviceComponentState");
        }
        this.a = eitVar;
    }
}
