package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyk {
    public final jis a;
    public final hyo b;
    private final int c;
    private final lim d;

    public hyk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyk) {
            hyk hykVar = (hyk) obj;
            if (this.c == hykVar.c && this.d.equals(hykVar.d) && hzc.L(this.a, hykVar.a)) {
                hyo hyoVar = this.b;
                hyo hyoVar2 = hykVar.b;
                if (hyoVar != null ? hyoVar.equals(hyoVar2) : hyoVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.c ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode();
        hyo hyoVar = this.b;
        if (hyoVar == null) {
            hashCode = 0;
        } else {
            hashCode = hyoVar.hashCode();
        }
        return ((hashCode2 * 1000003) ^ hashCode) * 1000003;
    }

    public final String toString() {
        hyo hyoVar = this.b;
        jis jisVar = this.a;
        return "CapabilityResponseMessage{supportedProtocolVersion=" + this.c + ", vendorData=" + String.valueOf(this.d) + ", rangingTechnologiesPriority=" + String.valueOf(jisVar) + ", uwbCapabilities=" + String.valueOf(hyoVar) + ", csCapabilities=null}";
    }

    public hyk(int i, lim limVar, jis jisVar, hyo hyoVar) {
        this.c = i;
        this.d = limVar;
        this.a = jisVar;
        this.b = hyoVar;
    }
}
