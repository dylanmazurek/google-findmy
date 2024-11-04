package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vt {
    public boolean c;
    private double e;
    private double f;
    private double g;
    public float a = 1.0f;
    public double b = Math.sqrt(50.0d);
    public float d = 1.0f;

    public final float a() {
        double d = this.b;
        return (float) (d * d);
    }

    public final long b(float f, float f2, long j) {
        double d;
        double d2;
        if (!this.c) {
            if (this.a != Float.MAX_VALUE) {
                float f3 = this.d;
                double d3 = f3;
                double d4 = d3 * d3;
                if (f3 > 1.0f) {
                    double d5 = this.b;
                    double d6 = d4 - 1.0d;
                    this.e = ((-f3) * d5) + (d5 * Math.sqrt(d6));
                    float f4 = -this.d;
                    double d7 = this.b;
                    this.f = (f4 * d7) - (d7 * Math.sqrt(d6));
                } else if (f3 >= 0.0f && f3 < 1.0f) {
                    this.g = this.b * Math.sqrt(1.0d - d4);
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d8 = f2;
        float f5 = f - this.a;
        float f6 = this.d;
        double d9 = f5;
        double d10 = j / 1000.0d;
        if (f6 > 1.0f) {
            double d11 = this.f;
            double d12 = ((d11 * d9) - d8) / (d11 - this.e);
            double d13 = d9 - d12;
            double exp = Math.exp(d11 * d10) * d13;
            double exp2 = Math.exp(this.e * d10) * d12;
            double d14 = this.f;
            double exp3 = d13 * d14 * Math.exp(d14 * d10);
            double d15 = this.e;
            d2 = exp3 + (d12 * d15 * Math.exp(d15 * d10));
            d = exp + exp2;
        } else if (f6 == 1.0f) {
            double d16 = this.b;
            double d17 = d8 + (d16 * d9);
            double d18 = d9 + (d17 * d10);
            d = Math.exp((-d16) * d10) * d18;
            double exp4 = d18 * Math.exp((-this.b) * d10);
            double d19 = -this.b;
            d2 = (exp4 * d19) + (d17 * Math.exp(d10 * d19));
        } else {
            double d20 = 1.0d / this.g;
            double d21 = this.b;
            double d22 = d20 * ((f6 * d21 * d9) + d8);
            double exp5 = Math.exp((-f6) * d21 * d10) * ((Math.cos(this.g * d10) * d9) + (Math.sin(this.g * d10) * d22));
            double d23 = this.b;
            double d24 = -d23;
            double d25 = this.d;
            double exp6 = Math.exp((-r13) * d23 * d10);
            double d26 = this.g;
            double sin = (-d26) * d9 * Math.sin(d26 * d10);
            double d27 = this.g;
            double cos = exp6 * (sin + (d22 * d27 * Math.cos(d27 * d10)));
            d = exp5;
            d2 = (d * d24 * d25) + cos;
        }
        return a.k((float) (d + this.a), (float) d2);
    }
}
