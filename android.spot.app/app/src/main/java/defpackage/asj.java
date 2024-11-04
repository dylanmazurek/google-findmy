package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asj {
    public ble a;
    public bln b;
    public aqv c;
    public long d = 0;

    public asj(ble bleVar, bln blnVar, aqv aqvVar) {
        this.a = bleVar;
        this.b = blnVar;
        this.c = aqvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asj)) {
            return false;
        }
        asj asjVar = (asj) obj;
        if (amr.i(this.a, asjVar.a) && this.b == asjVar.b && amr.i(this.c, asjVar.c) && a.n(this.d, asjVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.l(this.d);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) aqn.c(this.d)) + ')';
    }
}
