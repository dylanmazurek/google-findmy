package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dco implements dcf {
    public final Path.FillType a;
    public final String b;
    public final dbr c;
    public final dbu d;
    public final boolean e;
    private final boolean f;

    public dco(String str, boolean z, Path.FillType fillType, dbr dbrVar, dbu dbuVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = dbrVar;
        this.d = dbuVar;
        this.e = z2;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czd(cymVar, dcuVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}
