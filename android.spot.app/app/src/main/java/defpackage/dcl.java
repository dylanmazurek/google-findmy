package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcl implements dcf {
    public final String a;
    public final dbs b;
    public final dbs c;
    public final dcb d;
    public final boolean e;

    public dcl(String str, dbs dbsVar, dbs dbsVar2, dcb dcbVar, boolean z) {
        this.a = str;
        this.b = dbsVar;
        this.c = dbsVar2;
        this.d = dcbVar;
        this.e = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czm(cymVar, dcuVar, this);
    }
}
