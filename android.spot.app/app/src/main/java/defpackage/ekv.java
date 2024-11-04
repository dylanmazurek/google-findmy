package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekv {
    public final eit a;
    public final eis b;

    public ekv(eit eitVar, eis eisVar) {
        this.a = eitVar;
        this.b = eisVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekv)) {
            return false;
        }
        ekv ekvVar = (ekv) obj;
        if (amr.i(this.a, ekvVar.a) && this.b == ekvVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SpotComponentUiState(localState=" + this.a + ", proximityState=" + this.b + ")";
    }
}
