package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epk {
    public static final epk a;
    public final jer b;
    public final jer c;
    public final jer d;

    static {
        jdl jdlVar = jdl.a;
        a = new epk(jdlVar, jdlVar, jdlVar);
    }

    public epk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof epk) {
            epk epkVar = (epk) obj;
            if (this.b.equals(epkVar.b) && this.c.equals(epkVar.c) && this.d.equals(epkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        jer jerVar = this.d;
        jer jerVar2 = this.c;
        return "ProximityData{signalStrength=" + String.valueOf(this.b) + ", rangeMeters=" + String.valueOf(jerVar2) + ", bearingRads=" + String.valueOf(jerVar) + "}";
    }

    public epk(jer jerVar, jer jerVar2, jer jerVar3) {
        this.b = jerVar;
        this.c = jerVar2;
        this.d = jerVar3;
    }
}
