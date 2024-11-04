package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvm {
    public final lqj a;
    public final jer b;
    public final long c;

    public dvm() {
        throw null;
    }

    public static dvm a(lqj lqjVar, jer jerVar, long j) {
        boolean z;
        boolean z2 = false;
        if (j == 0) {
            z = false;
        } else {
            z = true;
        }
        if (jerVar.g() == z) {
            z2 = true;
        }
        hwx.J(z2);
        return new dvm(lqjVar, jerVar, j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvm) {
            dvm dvmVar = (dvm) obj;
            if (this.a.equals(dvmVar.a) && this.b.equals(dvmVar.b) && this.c == dvmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lqj lqjVar = this.a;
        if (lqjVar.y()) {
            i = lqjVar.i();
        } else {
            int i2 = lqjVar.y;
            if (i2 == 0) {
                i2 = lqjVar.i();
                lqjVar.y = i2;
            }
            i = i2;
        }
        int hashCode = ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        jer jerVar = this.b;
        return "ActionData{request=" + this.a.toString() + ", timeoutRunnable=" + jerVar.toString() + ", timeoutEndMillis=" + this.c + "}";
    }

    public dvm(lqj lqjVar, jer jerVar, long j) {
        if (lqjVar == null) {
            throw new NullPointerException("Null request");
        }
        this.a = lqjVar;
        this.b = jerVar;
        this.c = j;
    }
}
