package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yl extends aow implements ayj {
    public mol a;
    public int b = 1;

    public yl(mol molVar) {
        this.a = molVar;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        int d;
        awi cd;
        if (this.b != 1) {
            d = 0;
        } else {
            d = bld.d(j);
        }
        awr l = awgVar.l(bbc.l(d, bld.b(j), 0, bld.a(j)));
        int ae = moz.ae(l.a, bld.d(j), bld.b(j));
        int ae2 = moz.ae(l.b, bld.c(j), bld.a(j));
        cd = awjVar.cd(ae, ae2, mly.a, new yk(this, ae, l, ae2, awjVar));
        return cd;
    }
}
