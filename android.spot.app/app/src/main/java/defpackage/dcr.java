package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcr implements dcf {
    public final String a;
    public final dbs b;
    public final List c;
    public final dbr d;
    public final dbu e;
    public final dbs f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public dcr(String str, dbs dbsVar, List list, dbr dbrVar, dbu dbuVar, dbs dbsVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = dbsVar;
        this.c = list;
        this.d = dbrVar;
        this.e = dbuVar;
        this.f = dbsVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czp(cymVar, dcuVar, this);
    }
}
