package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aac {
    private final boolean a = true;
    private final float b = Float.NaN;
    private final aqy c = null;
    private final long d;

    public aac(long j) {
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aac)) {
            return false;
        }
        aac aacVar = (aac) obj;
        boolean z = aacVar.a;
        float f = aacVar.b;
        if (!blh.b(Float.NaN, Float.NaN)) {
            return false;
        }
        aqy aqyVar = aacVar.c;
        if (!amr.i(null, null)) {
            return false;
        }
        return a.n(this.d, aacVar.d);
    }

    public final int hashCode() {
        return (((a.i(true) * 31) + Float.floatToIntBits(Float.NaN)) * 961) + a.l(this.d);
    }
}
