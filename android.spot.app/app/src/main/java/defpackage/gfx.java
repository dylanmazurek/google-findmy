package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfx {
    public static final gfx a = new gfx(1, null);
    public final Throwable b;
    public final int c;

    public gfx() {
        throw null;
    }

    public static final gfx a(Throwable th) {
        return new gfx(3, th);
    }

    public static final gfx b(Throwable th) {
        return new gfx(2, th);
    }

    public final String c() {
        int i = this.c;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    return "PERMANENT_FAILURE";
                }
                return "TRANSIENT_FAILURE";
            }
            return "SUCCESS";
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gfx)) {
            return false;
        }
        gfx gfxVar = (gfx) obj;
        int i = this.c;
        int i2 = gfxVar.c;
        if (i != 0) {
            if (i == i2) {
                Throwable th = this.b;
                Throwable th2 = gfxVar.b;
                if (th != null ? th.equals(th2) : th2 == null) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.c;
        a.N(i);
        Throwable th = this.b;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ hashCode;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "PERMANENT_FAILURE";
                }
            } else {
                str = "TRANSIENT_FAILURE";
            }
        } else {
            str = "SUCCESS";
        }
        return "Result{code=" + str + ", error=" + String.valueOf(this.b) + "}";
    }

    public gfx(int i, Throwable th) {
        this.c = i;
        this.b = th;
    }
}
