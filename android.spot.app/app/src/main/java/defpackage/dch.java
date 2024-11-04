package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dch implements dcf {
    public final String a;
    public final dbt b;
    public final dbu c;
    public final dbw d;
    public final dbw e;
    public final dbs f;
    public final float g;
    public final List h;
    public final dbs i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public dch(String str, int i, dbt dbtVar, dbu dbuVar, dbw dbwVar, dbw dbwVar2, dbs dbsVar, int i2, int i3, float f, List list, dbs dbsVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = dbtVar;
        this.c = dbuVar;
        this.d = dbwVar;
        this.e = dbwVar2;
        this.f = dbsVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = dbsVar2;
        this.j = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czf(cymVar, dcuVar, this);
    }
}
