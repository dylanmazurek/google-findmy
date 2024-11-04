package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icl {
    public final boolean a;
    private final boolean b;
    private final jer c;
    private final jer d;

    public icl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icl) {
            icl iclVar = (icl) obj;
            if (this.a == iclVar.a && this.b == iclVar.b && this.c.equals(iclVar.c) && this.d.equals(iclVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.b) {
            i2 = 1231;
        }
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        jer jerVar = this.d;
        return "BeaconProvisioningState{provisioned=" + this.a + ", usingOwnerAccountKey=" + this.b + ", eid=" + this.c.toString() + ", componentSet=" + jerVar.toString() + "}";
    }

    public icl(boolean z, boolean z2, jer jerVar, jer jerVar2) {
        this.a = z;
        this.b = z2;
        this.c = jerVar;
        this.d = jerVar2;
    }
}
