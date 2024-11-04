package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zb {
    public String a;
    public boolean b = false;
    public yt c = null;
    private final String d;

    public zb(String str, String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        if (amr.i(this.d, zbVar.d) && amr.i(this.a, zbVar.a) && this.b == zbVar.b && amr.i(this.c, zbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() * 31) + this.a.hashCode();
        int i = a.i(this.b);
        yt ytVar = this.c;
        if (ytVar == null) {
            hashCode = 0;
        } else {
            hashCode = ytVar.hashCode();
        }
        return (((hashCode2 * 31) + i) * 31) + hashCode;
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ')';
    }
}
