package defpackage;

/* compiled from: PG */
@mkp
/* loaded from: classes.dex */
public final class zs {
    private final boolean a = true;
    private final float b = Float.NaN;
    private final agt c;

    public zs(agt agtVar) {
        this.c = agtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs)) {
            return false;
        }
        zs zsVar = (zs) obj;
        boolean z = zsVar.a;
        float f = zsVar.b;
        if (blh.b(Float.NaN, Float.NaN) && amr.i(this.c, zsVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(Float.NaN) + 38161) * 31) + this.c.hashCode();
    }
}
