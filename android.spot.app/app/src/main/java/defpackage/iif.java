package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iif {
    public final kym a;
    public final lln b;

    public iif() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iif) {
            iif iifVar = (iif) obj;
            if (this.a.equals(iifVar.a) && this.b.equals(iifVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        kym kymVar = this.a;
        if (kymVar.y()) {
            i = kymVar.i();
        } else {
            int i3 = kymVar.y;
            if (i3 == 0) {
                i3 = kymVar.i();
                kymVar.y = i3;
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
        return "LocationAndTime{location=" + this.a.toString() + ", time=" + llnVar.toString() + "}";
    }

    public iif(kym kymVar, lln llnVar) {
        if (kymVar == null) {
            throw new NullPointerException("Null location");
        }
        this.a = kymVar;
        if (llnVar != null) {
            this.b = llnVar;
            return;
        }
        throw new NullPointerException("Null time");
    }
}
