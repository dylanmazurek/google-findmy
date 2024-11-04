package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftl {
    public final jis a;
    public final jis b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final jis h;
    private final jis i;
    private final jis j;
    private final boolean k;

    static {
        jis.t(1, 2, 3, 1000, 1001);
        jis.q(2);
        jis.r(1, 2);
    }

    public ftl(boolean z, boolean z2, boolean z3, boolean z4, int i, jis jisVar, jis jisVar2, jis jisVar3, jis jisVar4, jis jisVar5, boolean z5) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = i;
        this.a = jisVar;
        this.h = jisVar2;
        this.b = jisVar3;
        this.i = jisVar4;
        this.j = jisVar5;
        this.k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftl)) {
            return false;
        }
        ftl ftlVar = (ftl) obj;
        if (this.c == ftlVar.c && this.d == ftlVar.d && this.e == ftlVar.e && this.f == ftlVar.f && this.g == ftlVar.g && amr.g(this.a, ftlVar.a) && amr.g(this.h, ftlVar.h) && amr.g(this.b, ftlVar.b) && amr.g(this.i, ftlVar.i) && amr.g(this.j, ftlVar.j) && this.k == ftlVar.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g), this.a, this.h, this.b, this.i, this.j, Boolean.valueOf(this.k)});
    }

    public final String toString() {
        jis jisVar = this.j;
        jis jisVar2 = this.i;
        jis jisVar3 = this.b;
        jis jisVar4 = this.h;
        return "RangingCapabilities{supportsDistance=" + this.c + ", supportsAzimuthalAngle=" + this.d + ", supportsElevationAngle=" + this.e + ", supportsRangingIntervalReconfigure=" + this.f + ", minRangingInterval=" + this.g + ", supportedChannels=" + String.valueOf(this.a) + ", supportedNtfConfigs=" + String.valueOf(jisVar4) + ", supportedConfigIds=" + String.valueOf(jisVar3) + ", supportedSlotDurations=" + String.valueOf(jisVar2) + ", supportedRangingUpdateRates=" + String.valueOf(jisVar) + "}";
    }
}
