package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zd extends aow implements ayj, aya, baa {
    public String a;
    public bgm b;
    public int c;
    public boolean d;
    public int e;
    public int f = 1;
    public moh g;
    public zb h;
    public dkr i;
    private Map j;
    private yt u;

    public zd(String str, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2) {
        this.a = str;
        this.b = bgmVar;
        this.i = dkrVar;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    private final yt u(ble bleVar) {
        yt ytVar;
        zb zbVar = this.h;
        if (zbVar != null && zbVar.b && (ytVar = zbVar.c) != null) {
            ytVar.a(bleVar);
            return ytVar;
        }
        yt c = c();
        c.a(bleVar);
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:            if (defpackage.blm.a(r10) < r4.b()) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:            if (defpackage.blm.a(r1) < r4.b()) goto L46;     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014e  */
    @Override // defpackage.ayj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.awi a(defpackage.awj r19, defpackage.awg r20, long r21) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd.a(awj, awg, long):awi");
    }

    public final yt c() {
        if (this.u == null) {
            this.u = new yt(this.a, this.b, this.i, this.c, this.d, this.e);
        }
        yt ytVar = this.u;
        ytVar.getClass();
        return ytVar;
    }

    @Override // defpackage.aya
    public final void ca(ayt aytVar) {
        if (this.t) {
            yt u = u(aytVar);
            bfp bfpVar = u.l;
            if (bfpVar != null) {
                aqv b = aytVar.n().b();
                boolean z = u.g;
                if (z) {
                    long j = u.h;
                    int b2 = blm.b(j);
                    int a = blm.a(j);
                    b.e();
                    b.j(0.0f, 0.0f, b2, a);
                }
                try {
                    bkv p = this.b.p();
                    if (p == null) {
                        p = bkv.a;
                    }
                    bkv bkvVar = p;
                    arl i = this.b.i();
                    if (i == null) {
                        i = arl.a;
                    }
                    arl arlVar = i;
                    kv x = this.b.x();
                    if (x == null) {
                        x = asp.a;
                    }
                    kv kvVar = x;
                    this.b.w();
                    long j2 = aqx.e;
                    if (j2 == 16) {
                        if (this.b.e() != 16) {
                            j2 = this.b.e();
                        } else {
                            j2 = aqx.a;
                        }
                    }
                    bfpVar.j(b, j2, arlVar, bkvVar, kvVar);
                    if (z) {
                        b.d();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z) {
                        b.d();
                    }
                    throw th;
                }
            }
            throw new IllegalArgumentException("no paragraph (layoutCache=" + this.u + ", textSubstitution=" + this.h + ')');
        }
    }

    public final void f() {
        this.h = null;
    }

    public final void g() {
        qs.g(this);
        qi.d(this);
        qh.e(this);
    }

    @Override // defpackage.baa
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.baa
    public final void i(bfe bfeVar) {
        moh mohVar = this.g;
        if (mohVar == null) {
            mohVar = new oq(this, 19);
            this.g = mohVar;
        }
        bfl.b(bfeVar, new bfs(this.a));
        zb zbVar = this.h;
        if (zbVar != null) {
            bfl.a(bfeVar, zbVar.b);
            bfl.c(bfeVar, new bfs(zbVar.a));
        }
        bfl.f(bfeVar, new oq(this, 20));
        bfl.g(bfeVar, new zc(this, 1));
        bfl.d(bfeVar, new ob(this, 12));
        bfl.e(bfeVar, mohVar);
    }

    @Override // defpackage.aya
    public final /* synthetic */ void d() {
    }
}
