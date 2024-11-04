package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmc {
    public final hmg a;
    public final hmf b;
    public final hme c;
    public final hjp d;
    public final hhf e;
    public final int f;

    public hmc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hmc) {
            hmc hmcVar = (hmc) obj;
            if (this.a.equals(hmcVar.a) && this.b.equals(hmcVar.b) && this.c.equals(hmcVar.c) && this.d.equals(hmcVar.d)) {
                int i = this.f;
                int i2 = hmcVar.f;
                if (i != 0) {
                    if (i2 == 1 && this.e.equals(hmcVar.e)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        a.N(this.f);
        return (((((hashCode * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        hhf hhfVar = this.e;
        hjp hjpVar = this.d;
        hme hmeVar = this.c;
        hmf hmfVar = this.b;
        return "Configuration{onViewCreatedCallback=" + String.valueOf(this.a) + ", onDismissCallback=" + String.valueOf(hmfVar) + ", onDestroyCallback=" + String.valueOf(hmeVar) + ", visualElements=" + String.valueOf(hjpVar) + ", isExperimental=false, largeScreenDialogAlignment=" + hog.y(this.f) + ", materialVersion=" + String.valueOf(hhfVar) + "}";
    }

    public hmc(hmg hmgVar, hmf hmfVar, hme hmeVar, hjp hjpVar, hhf hhfVar) {
        this.a = hmgVar;
        this.b = hmfVar;
        this.c = hmeVar;
        this.d = hjpVar;
        this.f = 1;
        this.e = hhfVar;
    }
}
