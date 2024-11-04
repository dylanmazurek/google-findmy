package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekw {
    public final lqc a;
    public final eiv b;
    public final kyh c;
    public final Map d;
    public final mkt e;

    public ekw(lqc lqcVar, eiv eivVar, kyh kyhVar, Map map) {
        kyhVar.getClass();
        this.a = lqcVar;
        this.b = eivVar;
        this.c = kyhVar;
        this.d = map;
        this.e = new mla(new ctm(this, 12));
    }

    public final ekv a(kyh kyhVar) {
        kyhVar.getClass();
        return (ekv) this.d.get(kyhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekw)) {
            return false;
        }
        ekw ekwVar = (ekw) obj;
        if (amr.i(this.a, ekwVar.a) && amr.i(this.b, ekwVar.b) && this.c == ekwVar.c && amr.i(this.d, ekwVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lqc lqcVar = this.a;
        if (lqcVar.y()) {
            i = lqcVar.i();
        } else {
            int i2 = lqcVar.y;
            if (i2 == 0) {
                i2 = lqcVar.i();
                lqcVar.y = i2;
            }
            i = i2;
        }
        return (((((i * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SpotDeviceUiState(device=" + this.a + ", localState=" + this.b + ", selectedComponent=" + this.c + ", componentStates=" + this.d + ")";
    }
}
