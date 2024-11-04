package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hta implements hoc {
    public final float a;
    private final int b;
    private final jer c;
    private final int d;

    public hta() {
        throw null;
    }

    public static final hsz c() {
        hsz hszVar = new hsz(null);
        hszVar.a = 10;
        hszVar.b = 1.0f;
        hszVar.d = (byte) 3;
        hszVar.c = jdl.a;
        hszVar.e = 1;
        return hszVar;
    }

    @Override // defpackage.hoc
    public final int a() {
        return this.b;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        if (this.d == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hta)) {
            return false;
        }
        hta htaVar = (hta) obj;
        int i = this.d;
        int i2 = htaVar.d;
        if (i != 0) {
            if (i == i2 && this.b == htaVar.b) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(htaVar.a) && this.c.equals(htaVar.c)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.N(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + hod.a(this.d) + ", rateLimitPerSecond=" + this.b + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + String.valueOf(this.c) + "}";
    }

    public hta(int i, int i2, float f, jer jerVar) {
        this.d = i;
        this.b = i2;
        this.a = f;
        this.c = jerVar;
    }
}
