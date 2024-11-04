package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyl {
    public final lim a;
    public final jis b;
    public final jis c;
    public final hyq d;

    public hyl() {
        throw null;
    }

    public final int a() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyl) {
            hyl hylVar = (hyl) obj;
            if (this.a.equals(hylVar.a) && hzc.L(this.b, hylVar.b) && hzc.L(this.c, hylVar.c)) {
                hyq hyqVar = this.d;
                hyq hyqVar2 = hylVar.d;
                if (hyqVar != null ? hyqVar.equals(hyqVar2) : hyqVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        hyq hyqVar = this.d;
        if (hyqVar == null) {
            hashCode = 0;
        } else {
            hashCode = hyqVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        hyq hyqVar = this.d;
        jis jisVar = this.c;
        jis jisVar2 = this.b;
        return "SetConfigurationMessage{vendorData=" + String.valueOf(this.a) + ", rangingTechnologiesSet=" + String.valueOf(jisVar2) + ", startRangingList=" + String.valueOf(jisVar) + ", uwbConfig=" + String.valueOf(hyqVar) + "}";
    }

    public hyl(lim limVar, jis jisVar, jis jisVar2, hyq hyqVar) {
        this.a = limVar;
        this.b = jisVar;
        this.c = jisVar2;
        this.d = hyqVar;
    }
}
