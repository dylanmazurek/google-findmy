package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyl {
    public final Integer a;
    public final lkq b;
    public final Throwable c;
    public final boolean d;
    public final boolean e;

    public gyl() {
        throw null;
    }

    public static gyj b() {
        gyj gyjVar = new gyj();
        gyjVar.c(true);
        gyjVar.b(false);
        return gyjVar;
    }

    public final boolean a() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gyl) {
            gyl gylVar = (gyl) obj;
            Integer num = this.a;
            if (num != null ? num.equals(gylVar.a) : gylVar.a == null) {
                lkq lkqVar = this.b;
                if (lkqVar != null ? lkqVar.equals(gylVar.b) : gylVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(gylVar.c) : gylVar.c == null) {
                        if (this.d == gylVar.d && this.e == gylVar.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        Integer num = this.a;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        lkq lkqVar = this.b;
        if (lkqVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lkqVar.hashCode();
        }
        int i3 = hashCode ^ 1000003;
        Throwable th = this.c;
        if (th != null) {
            i2 = th.hashCode();
        }
        int i4 = ((((i3 * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003;
        int i5 = 1237;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i6 = (i4 ^ i) * 1000003;
        if (true == this.e) {
            i5 = 1231;
        }
        return i6 ^ i5;
    }

    public final String toString() {
        Throwable th = this.c;
        return "ChimeRpcResponse{statusCode=" + this.a + ", response=" + String.valueOf(this.b) + ", error=" + String.valueOf(th) + ", isRetryableError=" + this.d + ", isAuthError=" + this.e + "}";
    }

    public gyl(Integer num, lkq lkqVar, Throwable th, boolean z, boolean z2) {
        this.a = num;
        this.b = lkqVar;
        this.c = th;
        this.d = z;
        this.e = z2;
    }
}
