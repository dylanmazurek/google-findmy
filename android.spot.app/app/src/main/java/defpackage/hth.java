package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hth implements hoc {
    public final float a;
    private final int b;

    public hth() {
        throw null;
    }

    public static final htg c() {
        htg htgVar = new htg();
        htgVar.a = 0.5f;
        htgVar.b = (byte) 1;
        htgVar.c = 1;
        return htgVar;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        if (this.b == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hth)) {
            return false;
        }
        hth hthVar = (hth) obj;
        int i = this.b;
        int i2 = hthVar.b;
        if (i != 0) {
            if (i == i2) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hthVar.a)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.N(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + hod.a(this.b) + ", samplingProbability=" + this.a + "}";
    }

    public hth(int i, float f) {
        this.b = i;
        this.a = f;
    }
}
