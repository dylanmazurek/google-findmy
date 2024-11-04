package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrl implements hoc {
    public final jer a;
    public final boolean b;
    private final int c;
    private final int d;

    public hrl() {
        throw null;
    }

    public static hrk c() {
        hrk hrkVar = new hrk(null);
        hrkVar.a = 3;
        hrkVar.b = jdl.a;
        hrkVar.c = true;
        hrkVar.e = 1;
        hrkVar.d = Byte.MAX_VALUE;
        return hrkVar;
    }

    @Override // defpackage.hoc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        if (this.d != 2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hrl)) {
            return false;
        }
        hrl hrlVar = (hrl) obj;
        int i = this.d;
        int i2 = hrlVar.d;
        if (i != 0) {
            if (i == i2 && this.c == hrlVar.c && this.a.equals(hrlVar.a) && this.b == hrlVar.b) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = this.d;
        a.N(i2);
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((((((((((((i2 ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ i) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + hod.a(this.d) + ", rateLimitPerSecond=" + this.c + ", recordMetricPerProcess=false, metricExtensionProvider=" + String.valueOf(this.a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.b + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    public hrl(int i, int i2, jer jerVar, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = jerVar;
        this.b = z;
    }
}
