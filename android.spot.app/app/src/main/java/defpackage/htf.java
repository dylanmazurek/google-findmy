package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htf implements hoc {
    private final int a;
    private final jer b;
    private final boolean c;
    private final int d;
    private final int e;
    private final hog f;

    public htf() {
        throw null;
    }

    @Override // defpackage.hoc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof htf)) {
            return false;
        }
        htf htfVar = (htf) obj;
        int i = this.d;
        int i2 = htfVar.d;
        if (i != 0) {
            if (i == i2 && this.a == htfVar.a && this.f.equals(htfVar.f) && this.b.equals(htfVar.b) && this.c == htfVar.c) {
                int i3 = this.e;
                int i4 = htfVar.e;
                if (i3 != 0) {
                    if (i4 == 1) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = this.d;
        a.N(i2);
        int hashCode = ((((i2 ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.f.hashCode();
        a.N(this.e);
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ i) * 1000003) ^ 1237) * 1000003) ^ 1;
    }

    public final String toString() {
        String str;
        int i = this.e;
        jer jerVar = this.b;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(jerVar);
        if (i != 1) {
            str = "null";
        } else {
            str = "DEFAULT";
        }
        int i2 = this.d;
        boolean z = this.c;
        return "TikTokTraceConfigurations{enablement=" + hod.a(i2) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + valueOf + ", traceMetricExtensionProvider=" + valueOf2 + ", recordTimerDuration=" + z + ", sendEmptyTraces=false, traceFormat=" + str + "}";
    }

    public htf(hog hogVar, jer jerVar) {
        this.d = 2;
        this.a = 10;
        this.f = hogVar;
        this.b = jerVar;
        this.c = true;
        this.e = 1;
    }
}
