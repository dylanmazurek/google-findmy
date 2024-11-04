package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyu {
    public final Optional a;
    public final Optional b;
    private final long c;

    public hyu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyu) {
            hyu hyuVar = (hyu) obj;
            if (this.a.equals(hyuVar.a) && this.b.equals(hyuVar.b) && this.c == hyuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Optional optional = this.b;
        return "PrecisionData{rangingData=" + String.valueOf(this.a) + ", fusionData=" + String.valueOf(optional) + ", timestamp=" + this.c + "}";
    }

    public hyu(Optional optional, Optional optional2, long j) {
        this.a = optional;
        this.b = optional2;
        this.c = j;
    }
}
