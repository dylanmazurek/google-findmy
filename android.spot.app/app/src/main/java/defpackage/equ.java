package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class equ {
    public final jer a;
    public final jer b;
    public final jer c;
    public final int d;

    public equ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof equ)) {
            return false;
        }
        equ equVar = (equ) obj;
        int i = this.d;
        int i2 = equVar.d;
        if (i != 0) {
            if (i == i2 && this.a.equals(equVar.a) && this.b.equals(equVar.b) && this.c.equals(equVar.c)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.N(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "CONNECTED";
                    }
                } else {
                    str = "CONNECTING";
                }
            } else {
                str = "NO_LONGER_IN_RANGE";
            }
        } else {
            str = "NOT_IN_RANGE";
        }
        jer jerVar = this.a;
        jer jerVar2 = this.b;
        jer jerVar3 = this.c;
        return "ProximityUiState{bleState=" + str + ", signalStrength=" + String.valueOf(jerVar) + ", rangeMeters=" + String.valueOf(jerVar2) + ", bearingRads=" + String.valueOf(jerVar3) + "}";
    }

    public equ(int i, jer jerVar, jer jerVar2, jer jerVar3) {
        this.d = i;
        this.a = jerVar;
        this.b = jerVar2;
        this.c = jerVar3;
    }
}
