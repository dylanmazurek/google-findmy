package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcq implements dcf {
    public final dby a;
    public final boolean b;
    private final String c;
    private final int d;

    public dcq(String str, int i, dby dbyVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = dbyVar;
        this.b = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        return new czo(cymVar, dcuVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + "}";
    }
}
