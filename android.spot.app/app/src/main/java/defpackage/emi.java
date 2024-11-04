package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emi {
    public final lqd a;
    public final ifa b;
    public final jer c;

    public emi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emi) {
            emi emiVar = (emi) obj;
            if (this.a.equals(emiVar.a) && this.b.equals(emiVar.b) && this.c.equals(emiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lqd lqdVar = this.a;
        if (lqdVar.y()) {
            i = lqdVar.i();
        } else {
            int i2 = lqdVar.y;
            if (i2 == 0) {
                i2 = lqdVar.i();
                lqdVar.y = i2;
            }
            i = i2;
        }
        return ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        jer jerVar = this.c;
        ifa ifaVar = this.b;
        return "DeviceTrackingState{deviceIdentifier=" + this.a.toString() + ", trackingCloseable=" + ifaVar.toString() + ", connectedComponent=" + jerVar.toString() + "}";
    }

    public emi(lqd lqdVar, ifa ifaVar, jer jerVar) {
        if (lqdVar == null) {
            throw new NullPointerException("Null deviceIdentifier");
        }
        this.a = lqdVar;
        this.b = ifaVar;
        this.c = jerVar;
    }
}
