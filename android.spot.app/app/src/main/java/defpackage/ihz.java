package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihz {
    public final kxv a;
    public final ihy b;

    public ihz() {
        throw null;
    }

    public static ihz a(String str, ihy ihyVar) {
        ljh k = kxv.b.k();
        if (!k.b.y()) {
            k.t();
        }
        kxv kxvVar = (kxv) k.b;
        str.getClass();
        kxvVar.a = str;
        return new ihz((kxv) k.q(), ihyVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihz) {
            ihz ihzVar = (ihz) obj;
            if (this.a.equals(ihzVar.a) && this.b.equals(ihzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        kxv kxvVar = this.a;
        if (kxvVar.y()) {
            i = kxvVar.i();
        } else {
            int i2 = kxvVar.y;
            if (i2 == 0) {
                i2 = kxvVar.i();
                kxvVar.y = i2;
            }
            i = i2;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ihy ihyVar = this.b;
        return "DeviceIdAndComponentSet{canonicDeviceId=" + this.a.toString() + ", componentSetOrComponentless=" + ihyVar.toString() + "}";
    }

    public ihz(kxv kxvVar, ihy ihyVar) {
        if (kxvVar == null) {
            throw new NullPointerException("Null canonicDeviceId");
        }
        this.a = kxvVar;
        if (ihyVar != null) {
            this.b = ihyVar;
            return;
        }
        throw new NullPointerException("Null componentSetOrComponentless");
    }
}
