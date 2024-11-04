package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyv {
    public final jis a;
    public final boolean b;
    public final Duration c;
    public final Duration d;
    public final Duration e;
    public final Duration f;
    public final Optional g;

    public hyv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyv) {
            hyv hyvVar = (hyv) obj;
            if (hzc.L(this.a, hyvVar.a) && this.b == hyvVar.b && this.c.equals(hyvVar.c) && this.d.equals(hyvVar.d) && this.e.equals(hyvVar.e) && this.f.equals(hyvVar.f) && this.g.equals(hyvVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        Optional optional = this.g;
        Duration duration = this.f;
        Duration duration2 = this.e;
        Duration duration3 = this.d;
        Duration duration4 = this.c;
        return "PrecisionRangingConfig{rangingTechnologiesToRangeWith=" + String.valueOf(this.a) + ", useFusingAlgorithm=" + this.b + ", maxUpdateInterval=" + String.valueOf(duration4) + ", initTimeout=" + String.valueOf(duration3) + ", fusionAlgorithmDriftTimeout=" + String.valueOf(duration2) + ", noUpdateTimeout=" + String.valueOf(duration) + ", fusionAlgorithmConfig=" + String.valueOf(optional) + "}";
    }

    public hyv(jis jisVar, Duration duration, Duration duration2, Duration duration3, Duration duration4, Optional optional) {
        this.a = jisVar;
        this.b = true;
        this.c = duration;
        this.d = duration2;
        this.e = duration3;
        this.f = duration4;
        this.g = optional;
    }
}
