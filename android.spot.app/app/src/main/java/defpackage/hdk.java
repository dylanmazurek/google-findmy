package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdk {
    public final hdp a;
    public final hdf b;
    public final jer c;
    public final hdi d;

    public hdk() {
        throw null;
    }

    public static lzt a() {
        lzt lztVar = new lzt(null, null, null, null, null);
        hdh hdhVar = new hdh();
        hdhVar.b(105607);
        hdhVar.c(105606);
        hdhVar.d(105606);
        lztVar.b = hdhVar.a();
        return lztVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdk) {
            hdk hdkVar = (hdk) obj;
            if (this.a.equals(hdkVar.a) && this.b.equals(hdkVar.b) && this.c.equals(hdkVar.c) && this.d.equals(hdkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        hdi hdiVar = this.d;
        jer jerVar = this.c;
        hdf hdfVar = this.b;
        return "TextualCardInitialData{cardIcon=" + String.valueOf(this.a) + ", titleData=" + String.valueOf(hdfVar) + ", highlightId=" + String.valueOf(jerVar) + ", visualElementsInfo=" + String.valueOf(hdiVar) + "}";
    }

    public hdk(hdp hdpVar, hdf hdfVar, jer jerVar, hdi hdiVar) {
        this.a = hdpVar;
        this.b = hdfVar;
        this.c = jerVar;
        this.d = hdiVar;
    }
}
