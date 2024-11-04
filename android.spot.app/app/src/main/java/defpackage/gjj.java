package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjj {
    public final lkq a;
    public final lkq b;
    public final Throwable c;
    public final boolean d;

    public gjj() {
        throw null;
    }

    public static gjj a(lkq lkqVar, gyl gylVar) {
        gji c = c();
        c.c = lkqVar;
        c.d = gylVar.b;
        c.e = gylVar.c;
        c.b(gylVar.d);
        return c.a();
    }

    public static gji c() {
        gji gjiVar = new gji();
        gjiVar.b(true);
        return gjiVar;
    }

    public final boolean b() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjj) {
            gjj gjjVar = (gjj) obj;
            lkq lkqVar = this.a;
            if (lkqVar != null ? lkqVar.equals(gjjVar.a) : gjjVar.a == null) {
                lkq lkqVar2 = this.b;
                if (lkqVar2 != null ? lkqVar2.equals(gjjVar.b) : gjjVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(gjjVar.c) : gjjVar.c == null) {
                        if (this.d == gjjVar.d) {
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
        lkq lkqVar = this.a;
        int i2 = 0;
        if (lkqVar == null) {
            hashCode = 0;
        } else {
            hashCode = lkqVar.hashCode();
        }
        lkq lkqVar2 = this.b;
        if (lkqVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lkqVar2.hashCode();
        }
        int i3 = hashCode ^ 1000003;
        Throwable th = this.c;
        if (th != null) {
            i2 = th.hashCode();
        }
        int i4 = ((((i3 * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i4 ^ i;
    }

    public final String toString() {
        Throwable th = this.c;
        lkq lkqVar = this.b;
        return "ChimeRpc{request=" + String.valueOf(this.a) + ", response=" + String.valueOf(lkqVar) + ", error=" + String.valueOf(th) + ", isRetryableError=" + this.d + "}";
    }

    public gjj(lkq lkqVar, lkq lkqVar2, Throwable th, boolean z) {
        this.a = lkqVar;
        this.b = lkqVar2;
        this.c = th;
        this.d = z;
    }
}
