package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzs {
    public final lqc a;
    public final boolean b;
    public final boolean c;
    public final jer d;
    public final boolean e;

    public dzs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzs) {
            dzs dzsVar = (dzs) obj;
            if (this.a.equals(dzsVar.a) && this.b == dzsVar.b && this.c == dzsVar.c && this.d.equals(dzsVar.d) && this.e == dzsVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        lqc lqcVar = this.a;
        if (lqcVar.y()) {
            i = lqcVar.i();
        } else {
            int i4 = lqcVar.y;
            if (i4 == 0) {
                i4 = lqcVar.i();
                lqcVar.y = i4;
            }
            i = i4;
        }
        int i5 = 1237;
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i6 = i ^ 1000003;
        if (true != this.c) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int hashCode = ((((((i6 * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (true == this.e) {
            i5 = 1231;
        }
        return hashCode ^ i5;
    }

    public final String toString() {
        jer jerVar = this.d;
        return "DeviceItemState{device=" + String.valueOf(this.a) + ", deviceInHand=" + this.b + ", deviceInProximity=" + this.c + ", sharingValidationCode=" + String.valueOf(jerVar) + ", isLost=" + this.e + "}";
    }

    public dzs(lqc lqcVar, boolean z, boolean z2, jer jerVar, boolean z3) {
        this.a = lqcVar;
        this.b = z;
        this.c = z2;
        this.d = jerVar;
        this.e = z3;
    }
}
