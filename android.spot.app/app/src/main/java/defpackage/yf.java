package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yf extends aow implements ayj {
    public float a;
    public float b;
    public float c;
    public boolean d = true;

    public yf(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        awi cd;
        int cj = awjVar.cj(this.a) + awjVar.cj(this.c);
        int cj2 = awjVar.cj(this.b) + awjVar.cj(0.0f);
        int a = bld.a(j);
        int i = -cj2;
        int i2 = -cj;
        awr l = awgVar.l(bbc.l(moz.ac(bld.d(j) + i2, 0), bbc.i(bld.b(j), i2), moz.ac(bld.c(j) + i, 0), bbc.i(a, i)));
        cd = awjVar.cd(bbc.k(j, l.a + cj), bbc.j(j, l.b + cj2), mly.a, new ud((aow) this, l, awjVar, 5));
        return cd;
    }
}
