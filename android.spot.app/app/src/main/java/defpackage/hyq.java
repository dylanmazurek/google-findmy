package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyq {
    public final ftq a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final lim f;
    public final String g;

    public hyq() {
        throw null;
    }

    public final int a() {
        return this.f.d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyq) {
            hyq hyqVar = (hyq) obj;
            if (this.a.equals(hyqVar.a) && this.b == hyqVar.b && this.c == hyqVar.c && this.d == hyqVar.d && this.e == hyqVar.e && this.f.equals(hyqVar.f) && this.g.equals(hyqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 583896283) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        lim limVar = this.f;
        return "UwbConfig{uwbAddress=" + String.valueOf(this.a) + ", sessionId=" + this.b + ", selectedConfigId=" + this.c + ", selectedChannel=" + this.d + ", selectedPreambleIndex=" + this.e + ", selectedRangingIntervalMs=0, selectedSlotDurationMs=0, sessionKey=" + String.valueOf(limVar) + ", countryCode=" + this.g + "}";
    }

    public hyq(ftq ftqVar, int i, int i2, int i3, int i4, lim limVar, String str) {
        this.a = ftqVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = limVar;
        this.g = str;
    }
}
