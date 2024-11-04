package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbl {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public lbl(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d3;
        this.c = d2;
        this.d = d4;
        this.e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public final boolean a(double d, double d2) {
        if (this.a <= d && d <= this.c && this.b <= d2 && d2 <= this.d) {
            return true;
        }
        return false;
    }
}
