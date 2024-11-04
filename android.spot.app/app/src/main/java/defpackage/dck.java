package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dck implements dcf {
    public final String a;
    public final dcc b;
    public final dcc c;
    public final dbs d;
    public final boolean e;

    public dck(String str, dcc dccVar, dcc dccVar2, dbs dbsVar, boolean z) {
        this.a = str;
        this.b = dccVar;
        this.c = dccVar2;
        this.d = dbsVar;
        this.e = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czl(cymVar, dcuVar, this);
    }

    public final String toString() {
        dcc dccVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + ", size=" + String.valueOf(dccVar) + "}";
    }
}
