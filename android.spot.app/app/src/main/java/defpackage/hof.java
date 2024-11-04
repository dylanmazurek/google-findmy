package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hof implements hoc {
    private final int a;
    private final hog b;

    public hof() {
        throw null;
    }

    public static final hsv c() {
        hsv hsvVar = new hsv((char[]) null);
        hsvVar.c = new hog((char[]) null);
        hsvVar.b = 1;
        hsvVar.a = (byte) 1;
        return hsvVar;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        if (this.a == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hof)) {
            return false;
        }
        hof hofVar = (hof) obj;
        int i = this.a;
        int i2 = hofVar.a;
        if (i != 0) {
            if (i == i2 && this.b.equals(hofVar.b)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.N(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + hod.a(this.a) + ", chargeCounterEnabled=false, metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }

    public hof(int i, hog hogVar) {
        this.a = i;
        this.b = hogVar;
    }
}
