package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaf {
    private static final gaj c = new gaj();
    public final gaj a;
    public final gak b;
    private final gae d;

    public gaf(String str) {
        gaj gajVar = c;
        gak gakVar = new gak(str);
        gae gaeVar = new gae();
        this.b = gakVar;
        this.a = gajVar;
        this.d = gaeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gaf) {
            gaf gafVar = (gaf) obj;
            if (this.b.equals(gafVar.b) && this.a.equals(gafVar.a) && this.d.equals(gafVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return dtq.d(this.b, dtq.d(this.a, this.d.hashCode()));
    }

    public final String toString() {
        gae gaeVar = this.d;
        gaj gajVar = this.a;
        return "FifeModel{fifeUrl='" + this.b.toString() + "', fifeUrlOptions='" + String.valueOf(gajVar) + "', accountInfo='" + gaeVar.toString() + "'}";
    }
}
