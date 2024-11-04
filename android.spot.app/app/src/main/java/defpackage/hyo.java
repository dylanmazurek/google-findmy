package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyo {
    public final ftq a;
    public final jis b;
    public final jis c;
    private final jis d;
    private final int e;
    private final int f;

    public hyo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyo) {
            hyo hyoVar = (hyo) obj;
            if (this.a.equals(hyoVar.a) && hzc.L(this.b, hyoVar.b) && hzc.L(this.d, hyoVar.d) && hzc.L(this.c, hyoVar.c) && this.e == hyoVar.e && this.f == hyoVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        jis jisVar = this.c;
        jis jisVar2 = this.d;
        jis jisVar3 = this.b;
        return "UwbCapabilities{uwbAddress=" + String.valueOf(this.a) + ", supportedChannels=" + String.valueOf(jisVar3) + ", supportedPreambleIndexes=" + String.valueOf(jisVar2) + ", supportedConfigIds=" + String.valueOf(jisVar) + ", minimumRangingIntervalMs=" + this.e + ", minimumSlotDurationMs=" + this.f + "}";
    }

    public hyo(ftq ftqVar, jis jisVar, jis jisVar2, jis jisVar3, int i, int i2) {
        this.a = ftqVar;
        this.b = jisVar;
        this.d = jisVar2;
        this.c = jisVar3;
        this.e = i;
        this.f = i2;
    }
}
