package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yc extends aow implements ayj {
    public float a;
    public int b;

    public yc(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        int d;
        int b;
        int a;
        int i;
        awi cd;
        if (bld.h(j) && this.b != 1) {
            d = moz.ae(Math.round(bld.b(j) * this.a), bld.d(j), bld.b(j));
            b = d;
        } else {
            d = bld.d(j);
            b = bld.b(j);
        }
        if (bld.g(j) && this.b != 2) {
            i = moz.ae(Math.round(bld.a(j) * this.a), bld.c(j), bld.a(j));
            a = i;
        } else {
            int c = bld.c(j);
            a = bld.a(j);
            i = c;
        }
        awr l = awgVar.l(bbc.l(d, b, i, a));
        cd = awjVar.cd(l.a, l.b, mly.a, new oq(l, 13));
        return cd;
    }
}
