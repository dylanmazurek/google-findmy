package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmi {
    public static final gmi a = new gmi(0, null);
    public final int b;
    public final String c;

    public gmi(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmi)) {
            return false;
        }
        gmi gmiVar = (gmi) obj;
        if (this.b == gmiVar.b && amr.i(this.c, gmiVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (this.b * 31) + hashCode;
    }

    public final String toString() {
        return "TrayIdentifier(id=" + this.b + ", tag=" + this.c + ")";
    }
}
