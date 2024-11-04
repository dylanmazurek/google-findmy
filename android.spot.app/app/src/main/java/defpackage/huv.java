package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huv {
    public final lhl a;
    public final lhg b;

    public huv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof huv) {
            huv huvVar = (huv) obj;
            if (this.a.equals(huvVar.a) && this.b.equals(huvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lhl lhlVar = this.a;
        if (lhlVar.y()) {
            i = lhlVar.i();
        } else {
            int i2 = lhlVar.y;
            if (i2 == 0) {
                i2 = lhlVar.i();
                lhlVar.y = i2;
            }
            i = i2;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        lhg lhgVar = this.b;
        return "GetActivityControlsSettingsResponseWithOrigin{response=" + this.a.toString() + ", origin=" + lhgVar.toString() + "}";
    }

    public huv(lhl lhlVar, lhg lhgVar) {
        if (lhlVar == null) {
            throw new NullPointerException("Null response");
        }
        this.a = lhlVar;
        if (lhgVar != null) {
            this.b = lhgVar;
            return;
        }
        throw new NullPointerException("Null origin");
    }
}
