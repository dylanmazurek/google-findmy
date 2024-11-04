package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hra implements hoc {
    private final int a;
    private final int b;

    public hra() {
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
        if (!(obj instanceof hra)) {
            return false;
        }
        hra hraVar = (hra) obj;
        int i = this.b;
        int i2 = hraVar.b;
        if (i != 0) {
            if (i == i2 && this.a == hraVar.a) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.N(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + hod.a(this.b) + ", rateLimitPerSecond=" + this.a + "}";
    }

    public hra(byte[] bArr) {
        this.b = 2;
        this.a = 10;
    }
}
