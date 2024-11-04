package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsz {
    public int a;
    public float b;
    public jer c;
    public byte d;
    public int e;

    public hsz() {
        throw null;
    }

    public final hta a() {
        int i;
        boolean z = true;
        if (this.d == 3 && (i = this.e) != 0) {
            hta htaVar = new hta(i, this.a, this.b, this.c);
            hwx.V(true, "Rate limit per second must be >= 0");
            float f = htaVar.a;
            if (f <= 0.0f || f > 1.0f) {
                z = false;
            }
            hwx.V(z, "Sampling Probability shall be > 0 and <= 1");
            return htaVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.e = i;
    }

    public final hpp c() {
        int i;
        boolean z = true;
        if (this.d == 3 && (i = this.a) != 0) {
            hpp hppVar = new hpp(i, this.b, this.e, this.c);
            float f = hppVar.a;
            if (f <= 0.0f || f > 100.0f) {
                z = false;
            }
            hwx.K(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return hppVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.d & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.a = i;
    }

    public hsz(byte[] bArr) {
        this.c = jdl.a;
    }
}
