package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcg implements dcf {
    public final Path.FillType a;
    public final dbt b;
    public final dbu c;
    public final dbw d;
    public final dbw e;
    public final String f;
    public final boolean g;
    public final int h;

    public dcg(String str, int i, Path.FillType fillType, dbt dbtVar, dbu dbuVar, dbw dbwVar, dbw dbwVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = dbtVar;
        this.c = dbuVar;
        this.d = dbwVar;
        this.e = dbwVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new cze(cymVar, cybVar, dcuVar, this);
    }
}
