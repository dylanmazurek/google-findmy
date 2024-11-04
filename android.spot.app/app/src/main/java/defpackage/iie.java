package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iie {
    public final kyu a;
    public final lln b;

    public iie() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iie) {
            iie iieVar = (iie) obj;
            if (this.a.equals(iieVar.a) && this.b.equals(iieVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        kyu kyuVar = this.a;
        if (kyuVar.y()) {
            i = kyuVar.i();
        } else {
            int i3 = kyuVar.y;
            if (i3 == 0) {
                i3 = kyuVar.i();
                kyuVar.y = i3;
            }
            i = i3;
        }
        lln llnVar = this.b;
        if (llnVar.y()) {
            i2 = llnVar.i();
        } else {
            int i4 = llnVar.y;
            if (i4 == 0) {
                i4 = llnVar.i();
                llnVar.y = i4;
            }
            i2 = i4;
        }
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        lln llnVar = this.b;
        return "GeoLocationAndTime{location=" + this.a.toString() + ", time=" + llnVar.toString() + "}";
    }

    public iie(kyu kyuVar, lln llnVar) {
        if (kyuVar == null) {
            throw new NullPointerException("Null location");
        }
        this.a = kyuVar;
        if (llnVar != null) {
            this.b = llnVar;
            return;
        }
        throw new NullPointerException("Null time");
    }
}
