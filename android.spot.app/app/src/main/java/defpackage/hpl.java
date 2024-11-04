package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpl implements hoc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public hpl() {
        throw null;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hpl)) {
            return false;
        }
        hpl hplVar = (hpl) obj;
        int i = this.f;
        int i2 = hplVar.f;
        if (i != 0) {
            if (i2 == 1 && this.a == hplVar.a && this.b == hplVar.b && this.c == hplVar.c && this.d == hplVar.d) {
                if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(hplVar.e)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        a.N(this.f);
        return ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)));
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + hod.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + "}";
    }

    public hpl(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }
}
