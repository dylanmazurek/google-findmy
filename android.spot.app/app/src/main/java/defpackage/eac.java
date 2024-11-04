package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eac implements dzp {
    public final String a;
    public final int b;

    public eac(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eac)) {
            return false;
        }
        eac eacVar = (eac) obj;
        if (amr.i(this.a, eacVar.a) && this.b == eacVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SupervisedAccountHeaderItem(name=" + this.a + ", deviceCount=" + this.b + ")";
    }
}
