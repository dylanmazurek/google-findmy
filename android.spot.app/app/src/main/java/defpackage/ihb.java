package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihb {
    public final kyf a;
    public final jis b;

    public ihb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihb) {
            ihb ihbVar = (ihb) obj;
            if (this.a.equals(ihbVar.a) && hzc.L(this.b, ihbVar.b)) {
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
        return "InformationBeforeApplying{device=" + this.a.toString() + ", sharedOwners=" + jisVar.toString() + "}";
    }

    public ihb(kyf kyfVar, jis jisVar) {
        if (kyfVar == null) {
            throw new NullPointerException("Null device");
        }
        this.a = kyfVar;
        if (jisVar != null) {
            this.b = jisVar;
            return;
        }
        throw new NullPointerException("Null sharedOwners");
    }
}
