package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eon {
    public final kzq a;
    public final boolean b;

    public eon() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eon) {
            eon eonVar = (eon) obj;
            if (this.a.equals(eonVar.a) && this.b == eonVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        kzq kzqVar = this.a;
        if (kzqVar.y()) {
            i = kzqVar.i();
        } else {
            int i3 = kzqVar.y;
            if (i3 == 0) {
                i3 = kzqVar.i();
                kzqVar.y = i3;
            }
            i = i3;
        }
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        return "SharedOwnerState{owner=" + this.a.toString() + ", isRefreshing=" + this.b + "}";
    }

    public eon(kzq kzqVar, boolean z) {
        if (kzqVar == null) {
            throw new NullPointerException("Null owner");
        }
        this.a = kzqVar;
        this.b = z;
    }
}
