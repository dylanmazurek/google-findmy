package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yi extends aow implements ayj {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    public yi(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        int i;
        int i2;
        int i3;
        int ad;
        int ac;
        int ad2;
        int ac2;
        long l;
        awi cd;
        int ac3;
        int i4 = 0;
        if (!blh.b(this.c, Float.NaN)) {
            i = moz.ac(awjVar.cj(this.c), 0);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!blh.b(this.d, Float.NaN)) {
            i2 = moz.ac(awjVar.cj(this.d), 0);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (blh.b(this.a, Float.NaN) || (i3 = moz.ac(moz.ad(awjVar.cj(this.a), i), 0)) == Integer.MAX_VALUE) {
            i3 = 0;
        }
        if (!blh.b(this.b, Float.NaN) && (ac3 = moz.ac(moz.ad(awjVar.cj(this.b), i2), 0)) != Integer.MAX_VALUE) {
            i4 = ac3;
        }
        long l2 = bbc.l(i3, i, i4, i2);
        if (this.e) {
            l = bbc.l(moz.ae(bld.d(l2), bld.d(j), bld.b(j)), moz.ae(bld.b(l2), bld.d(j), bld.b(j)), moz.ae(bld.c(l2), bld.c(j), bld.a(j)), moz.ae(bld.a(l2), bld.c(j), bld.a(j)));
        } else {
            if (!blh.b(this.a, Float.NaN)) {
                ad = bld.d(l2);
            } else {
                ad = moz.ad(bld.d(j), bld.b(l2));
            }
            if (!blh.b(this.c, Float.NaN)) {
                ac = bld.b(l2);
            } else {
                ac = moz.ac(bld.b(j), bld.d(l2));
            }
            if (!blh.b(this.b, Float.NaN)) {
                ad2 = bld.c(l2);
            } else {
                ad2 = moz.ad(bld.c(j), bld.a(l2));
            }
            if (!blh.b(this.d, Float.NaN)) {
                ac2 = bld.a(l2);
            } else {
                ac2 = moz.ac(bld.a(j), bld.c(l2));
            }
            l = bbc.l(ad, ac, ad2, ac2);
        }
        awr l3 = awgVar.l(l);
        cd = awjVar.cd(l3.a, l3.b, mly.a, new oq(l3, 14));
        return cd;
    }
}
