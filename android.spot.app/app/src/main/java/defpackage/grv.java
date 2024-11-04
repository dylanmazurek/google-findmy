package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grv {
    public final String a;
    public final long b;
    public final Long c;

    public grv(String str, long j, Long l) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grv)) {
            return false;
        }
        grv grvVar = (grv) obj;
        if (amr.i(this.a, grvVar.a) && this.b == grvVar.b && amr.i(this.c, grvVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Long l = this.c;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return ((hashCode2 + a.l(this.b)) * 31) + hashCode;
    }

    public final String toString() {
        return "AuthToken(token=" + this.a + ", authTimeMillis=" + this.b + ", expirationTimeSecs=" + this.c + ")";
    }
}
