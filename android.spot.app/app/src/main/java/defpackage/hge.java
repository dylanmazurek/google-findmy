package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hge {
    public final cfk a;
    public final cfk b;

    public hge() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hge) {
            hge hgeVar = (hge) obj;
            cfk cfkVar = this.a;
            if (cfkVar != null ? cfkVar.equals(hgeVar.a) : hgeVar.a == null) {
                cfk cfkVar2 = this.b;
                cfk cfkVar3 = hgeVar.b;
                if (cfkVar2 != null ? cfkVar2.equals(cfkVar3) : cfkVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        cfk cfkVar = this.a;
        int i = 0;
        if (cfkVar == null) {
            hashCode = 0;
        } else {
            hashCode = cfkVar.hashCode();
        }
        cfk cfkVar2 = this.b;
        if (cfkVar2 != null) {
            i = cfkVar2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        cfk cfkVar = this.b;
        return "CardsLiveDatas{importantCards=" + String.valueOf(this.a) + ", commonActions=" + String.valueOf(cfkVar) + "}";
    }

    public hge(cfk cfkVar, cfk cfkVar2) {
        this.a = cfkVar;
        this.b = cfkVar2;
    }
}
