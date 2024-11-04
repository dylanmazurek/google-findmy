package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhw {
    public final aox a;
    public final dgq b;

    public dhw(dgq dgqVar, aox aoxVar) {
        aoxVar.getClass();
        this.b = dgqVar;
        this.a = aoxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhw)) {
            return false;
        }
        dhw dhwVar = (dhw) obj;
        if (amr.i(this.b, dhwVar.b) && amr.i(this.a, dhwVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SizeAndModifier(size=" + this.b + ", modifier=" + this.a + ")";
    }
}
