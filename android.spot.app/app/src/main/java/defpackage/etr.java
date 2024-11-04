package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etr {
    public final kyf a;
    public final jis b;

    public etr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof etr) {
            etr etrVar = (etr) obj;
            if (this.a.equals(etrVar.a) && hzc.L(this.b, etrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        kyf kyfVar = this.a;
        if (kyfVar.y()) {
            i = kyfVar.i();
        } else {
            int i2 = kyfVar.y;
            if (i2 == 0) {
                i2 = kyfVar.i();
                kyfVar.y = i2;
            }
            i = i2;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        jis jisVar = this.b;
        return "DeviceDetails{device=" + this.a.toString() + ", owners=" + jisVar.toString() + "}";
    }

    public etr(kyf kyfVar, jis jisVar) {
        this.a = kyfVar;
        if (jisVar == null) {
            throw new NullPointerException("Null owners");
        }
        this.b = jisVar;
    }
}
