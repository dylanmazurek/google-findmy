package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hya {
    public final jis a;
    public final Duration b;
    public final Duration c;
    public final Duration d;
    public final Duration e;
    public final Duration f;
    public final Duration g;
    public final float h;
    public final float i;
    private final boolean j;

    public hya() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hya) {
            hya hyaVar = (hya) obj;
            if (this.j == hyaVar.j && hzc.L(this.a, hyaVar.a) && this.b.equals(hyaVar.b) && this.c.equals(hyaVar.c) && this.d.equals(hyaVar.d) && this.e.equals(hyaVar.e) && this.f.equals(hyaVar.f) && this.g.equals(hyaVar.g)) {
                if (Float.floatToIntBits(this.h) == Float.floatToIntBits(hyaVar.h)) {
                    if (Float.floatToIntBits(this.i) == Float.floatToIntBits(hyaVar.i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.j) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((((((((((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i);
    }

    public final String toString() {
        Duration duration = this.g;
        Duration duration2 = this.f;
        Duration duration3 = this.e;
        Duration duration4 = this.d;
        Duration duration5 = this.c;
        Duration duration6 = this.b;
        return "PrecisionFindingConfig{rangeWithAllAvailableTechnologies=" + this.j + ", rangeWithSelectedTechnologies=" + String.valueOf(this.a) + ", initialEstimateLevelConvergenceDuration=" + String.valueOf(duration6) + ", driftTimeout=" + String.valueOf(duration5) + ", estimateLevelRecalculationDuration=" + String.valueOf(duration4) + ", maxUpdateInterval=" + String.valueOf(duration3) + ", noUpdateTimeout=" + String.valueOf(duration2) + ", initTimeout=" + String.valueOf(duration) + ", precisionFindingErrorThresholdForOutputM=" + this.h + ", precisionFindingErrorThresholdForOutputRad=" + this.i + "}";
    }

    public hya(boolean z, jis jisVar, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, Duration duration6, float f, float f2) {
        this.j = true;
        this.a = jisVar;
        this.b = duration;
        this.c = duration2;
        this.d = duration3;
        this.e = duration4;
        this.f = duration5;
        this.g = duration6;
        this.h = f;
        this.i = f2;
    }
}
