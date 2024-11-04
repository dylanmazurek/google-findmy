package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoq implements aon {
    private final float b;
    private final float c;

    public aoq(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.aon
    public final long a(long j, long j2, bln blnVar) {
        float f;
        if (blnVar == bln.Ltr) {
            f = this.b;
        } else {
            f = -this.b;
        }
        int a = blm.a(j);
        int a2 = blm.a(j2);
        int b = blm.b(j);
        return bee.c(Math.round(((blm.b(j2) - b) / 2.0f) * (f + 1.0f)), Math.round(((a2 - a) / 2.0f) * (this.c + 1.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoq)) {
            return false;
        }
        aoq aoqVar = (aoq) obj;
        if (Float.compare(this.b, aoqVar.b) == 0 && Float.compare(this.c, aoqVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}
