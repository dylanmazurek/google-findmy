package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class art implements arz {
    private final /* synthetic */ int a;

    public /* synthetic */ art(int i) {
        this.a = i;
    }

    @Override // defpackage.arz
    public final double a(double d) {
        double d2;
        double d3;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return d;
            }
            if (d < 0.0d) {
                d3 = -d;
            } else {
                d3 = d;
            }
            return Math.copySign(kk.f(d3, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (d < 0.0d) {
            d2 = -d;
        } else {
            d2 = d;
        }
        return Math.copySign(kk.g(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
    }
}
