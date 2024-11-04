package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grz {
    public static final joo a = joo.m("GnpSdk");
    public static final grz b = new grz(1, null);
    public final Throwable c;
    public final String d;
    public final int e;

    public grz(int i, Throwable th) {
        String str;
        this.e = i;
        this.c = th;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                str = "TRANSIENT_FAILURE";
            } else {
                str = "PERMANENT_FAILURE";
            }
        } else {
            str = "SUCCESS";
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grz)) {
            return false;
        }
        grz grzVar = (grz) obj;
        if (this.e == grzVar.e && amr.i(this.c, grzVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.e;
        a.V(i);
        Throwable th = this.c;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return (i * 31) + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("GnpJobResult(status=");
        int i = this.e;
        if (i != 1) {
            if (i != 2) {
                str = "PERMANENT_FAILURE";
            } else {
                str = "TRANSIENT_FAILURE";
            }
        } else {
            str = "SUCCESS";
        }
        sb.append((Object) str);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
