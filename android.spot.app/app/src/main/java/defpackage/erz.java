package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erz {
    public final agt a;
    public final gga b;

    public erz(agt agtVar, gga ggaVar) {
        agtVar.getClass();
        ggaVar.getClass();
        this.a = agtVar;
        this.b = ggaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erz)) {
            return false;
        }
        erz erzVar = (erz) obj;
        if (amr.i(this.a, erzVar.a) && amr.i(this.b, erzVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "WatermarkProperties(scale=" + this.a + ", alpha=" + this.b + ")";
    }
}
