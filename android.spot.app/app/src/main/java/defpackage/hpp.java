package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpp implements hoc {
    public final float a;
    public final int b;
    public final jer c;
    private final int d;

    public hpp() {
        throw null;
    }

    public static final hsz c() {
        hsz hszVar = new hsz(null);
        hszVar.b = 100.0f;
        hszVar.a = 1;
        hszVar.e = 100;
        hszVar.d = (byte) 3;
        return hszVar;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        int i = this.d;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hpp)) {
            return false;
        }
        hpp hppVar = (hpp) obj;
        int i = this.d;
        int i2 = hppVar.d;
        if (i != 0) {
            if (i == i2) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hppVar.a) && this.b == hppVar.b && this.c.equals(hppVar.c)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.N(i);
        return ((((((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ this.b) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + hod.a(this.d) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", metricExtensionProvider=null, crashLoopListener=" + String.valueOf(this.c) + "}";
    }

    public hpp(int i, float f, int i2, jer jerVar) {
        this.d = i;
        this.a = f;
        this.b = i2;
        this.c = jerVar;
    }
}
