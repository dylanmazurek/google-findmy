package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eea implements eeb {
    public final eiv a;

    public eea(eiv eivVar) {
        this.a = eivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof eea) && amr.i(this.a, ((eea) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SpotLocation(spotState=" + this.a + ")";
    }
}
