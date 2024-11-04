package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkc {
    public final lgz a;
    public final String b;
    public final int c;
    public final int d;

    public gkc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gkc) {
            gkc gkcVar = (gkc) obj;
            if (this.a.equals(gkcVar.a) && this.b.equals(gkcVar.b) && this.c == gkcVar.c && this.d == gkcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lgz lgzVar = this.a;
        if (lgzVar.y()) {
            i = lgzVar.i();
        } else {
            int i2 = lgzVar.y;
            if (i2 == 0) {
                i2 = lgzVar.i();
                lgzVar.y = i2;
            }
            i = i2;
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i3 = this.c;
        a.V(i3);
        int i4 = (hashCode ^ i3) * 1000003;
        int i5 = this.d;
        a.V(i5);
        return i4 ^ i5;
    }

    public final String toString() {
        int s = a.s(this.d);
        int s2 = a.s(this.c);
        return "SdkBatchUpdateKey{threadStateUpdate=" + this.a.toString() + ", actionId=" + this.b + ", eventSource=" + Integer.toString(s2) + ", updateThreadReason=" + Integer.toString(s) + "}";
    }

    public gkc(lgz lgzVar, String str, int i, int i2) {
        if (lgzVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.a = lgzVar;
        if (str != null) {
            this.b = str;
            this.c = i;
            this.d = i2;
            return;
        }
        throw new NullPointerException("Null actionId");
    }
}
