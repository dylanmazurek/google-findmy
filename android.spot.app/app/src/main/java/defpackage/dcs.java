package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcs implements dcf {
    public final dbs a;
    public final dbs b;
    public final dbs c;
    public final boolean d;
    public final int e;

    public dcs(int i, dbs dbsVar, dbs dbsVar2, dbs dbsVar3, boolean z) {
        this.e = i;
        this.a = dbsVar;
        this.b = dbsVar2;
        this.c = dbsVar3;
        this.d = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czq(dcuVar, this);
    }

    public final String toString() {
        dbs dbsVar = this.c;
        dbs dbsVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(dbsVar2) + ", offset: " + String.valueOf(dbsVar) + "}";
    }
}
