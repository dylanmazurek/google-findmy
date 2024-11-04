package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cve {
    public final String a;
    public final int b;
    public final int c;

    public cve(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cve)) {
            return false;
        }
        cve cveVar = (cve) obj;
        if (amr.i(this.a, cveVar.a) && this.b == cveVar.b && this.c == cveVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
