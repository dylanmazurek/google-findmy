package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dce implements dcf {
    public final String a;
    public final dcc b;
    public final dbw c;
    public final boolean d;
    public final boolean e;

    public dce(String str, dcc dccVar, dbw dbwVar, boolean z, boolean z2) {
        this.a = str;
        this.b = dccVar;
        this.c = dbwVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czc(cymVar, dcuVar, this);
    }
}
