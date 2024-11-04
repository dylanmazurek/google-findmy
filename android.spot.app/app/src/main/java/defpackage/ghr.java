package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghr {
    public final lct a;
    public final jls b;
    public final jls c;
    public final boolean d;

    public ghr() {
        this(null, null, null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghr)) {
            return false;
        }
        ghr ghrVar = (ghr) obj;
        if (this.a == ghrVar.a && amr.i(this.b, ghrVar.b) && amr.i(this.c, ghrVar.c) && this.d == ghrVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        lct lctVar = this.a;
        int i = 0;
        if (lctVar == null) {
            hashCode = 0;
        } else {
            hashCode = lctVar.hashCode();
        }
        jls jlsVar = this.b;
        if (jlsVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = jlsVar.hashCode();
        }
        int i2 = hashCode * 31;
        jls jlsVar2 = this.c;
        if (jlsVar2 != null) {
            i = jlsVar2.hashCode();
        }
        return ((((i2 + hashCode2) * 31) + i) * 31) + a.i(this.d);
    }

    public final String toString() {
        return "RemovalInfo(removeReason=" + this.a + ", removeReasonToThreadIds=" + this.b + ", reachedLimitMap=" + this.c + ", dueToAnotherAccountAction=" + this.d + ")";
    }

    public /* synthetic */ ghr(lct lctVar, jls jlsVar, jls jlsVar2, boolean z, int i) {
        this.a = 1 == (i & 1) ? null : lctVar;
        this.b = (i & 2) != 0 ? null : jlsVar;
        this.c = (i & 4) != 0 ? null : jlsVar2;
        this.d = ((i & 8) == 0) & z;
    }
}
