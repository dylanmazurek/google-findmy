package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edz implements eeb {
    public final lps a;
    public final lqc b;
    public final boolean c;

    public edz(lps lpsVar, lqc lqcVar, boolean z) {
        this.a = lpsVar;
        this.b = lqcVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edz)) {
            return false;
        }
        edz edzVar = (edz) obj;
        if (amr.i(this.a, edzVar.a) && amr.i(this.b, edzVar.b) && this.c == edzVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lps lpsVar = this.a;
        int i2 = 0;
        if (lpsVar == null) {
            i = 0;
        } else if (lpsVar.y()) {
            i = lpsVar.i();
        } else {
            int i3 = lpsVar.y;
            if (i3 == 0) {
                i3 = lpsVar.i();
                lpsVar.y = i3;
            }
            i = i3;
        }
        lqc lqcVar = this.b;
        if (lqcVar != null) {
            if (lqcVar.y()) {
                i2 = lqcVar.i();
            } else {
                i2 = lqcVar.y;
                if (i2 == 0) {
                    i2 = lqcVar.i();
                    lqcVar.y = i2;
                }
            }
        }
        return (((i * 31) + i2) * 31) + a.i(this.c);
    }

    public final String toString() {
        return "LocationHistoryLocation(location=" + this.a + ", connectedDevice=" + this.b + ", isConnectedToThisAndroid=" + this.c + ")";
    }
}
