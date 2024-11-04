package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaf implements dzp {
    public final ezk a;

    public eaf(ezk ezkVar) {
        this.a = ezkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof eaf) && amr.i(this.a, ((eaf) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ezk ezkVar = this.a;
        if (ezkVar == null) {
            return 0;
        }
        return ezkVar.hashCode();
    }

    public final String toString() {
        return "WorkProfileExplanationItem(switchProfileButtonIconAndText=" + this.a + ")";
    }
}
