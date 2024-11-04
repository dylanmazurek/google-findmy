package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ija {
    public final kyu a;
    public final lln b;
    public final jro c;

    public ija() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ija) {
            ija ijaVar = (ija) obj;
            if (this.a.equals(ijaVar.a) && this.b.equals(ijaVar.b) && this.c.equals(ijaVar.c)) {
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
        return ((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        jro jroVar = this.c;
        lln llnVar = this.b;
        return "LocationPoint{location=" + this.a.toString() + ", timestamp=" + llnVar.toString() + ", point=" + jroVar.toString() + "}";
    }

    public ija(kyu kyuVar, lln llnVar, jro jroVar) {
        this.a = kyuVar;
        this.b = llnVar;
        this.c = jroVar;
    }
}
