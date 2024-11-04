package defpackage;

import android.app.Activity;
import com.google.android.apps.adm.activities.MainActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwf implements hcm, lrc, lrq, lsb {
    public lsm a;
    public lsm b;
    public lsm c;
    public lsm d;
    public lsm e;
    public lsm f;
    public lsm g;
    public lsm h;
    public lsm i;
    public lsm j;
    public lsm k;
    public lsm l;
    public final dwj m;
    private final Activity n;
    private lsm o;
    private lsm p;
    private lsm q;
    private lsm r;
    private lsm s;
    private lsm t;
    private lsm u;
    private lsm v;
    private lsm w;
    private final dwf x;

    public dwf() {
        throw null;
    }

    public final Activity a() {
        Activity activity = this.n;
        iqg.F(activity);
        return activity;
    }

    public final pk b() {
        return dvk.c(c());
    }

    public final MainActivity c() {
        return (MainActivity) a();
    }

    @Override // defpackage.lrq
    public final ksr e() {
        return new ksr(this.m, this.x);
    }

    @Override // defpackage.lrc
    public final mrx f() {
        jiu h = jiy.h(24);
        h.d("edv", true);
        h.d("efm", true);
        h.d("efs", true);
        h.d("efw", true);
        h.d("eqb", true);
        h.d("duz", true);
        h.d("eia", true);
        h.d("dzx", true);
        h.d("eoz", true);
        h.d("euu", true);
        h.d("eqo", true);
        h.d("eui", true);
        h.d("eqv", true);
        h.d("ecz", true);
        h.d("ehk", true);
        h.d("esx", true);
        h.d("dvi", true);
        h.d("etz", true);
        h.d("etq", true);
        h.d("etu", true);
        h.d("euf", true);
        h.d("eod", true);
        h.d("ekx", true);
        h.d("esr", true);
        return new mrx(new lsj(h.b()), new dvy(this.m));
    }

    public dwf(dwj dwjVar, Activity activity) {
        this.x = this;
        this.m = dwjVar;
        this.n = activity;
        lsi lsiVar = activity == null ? lsi.a : new lsi(activity);
        this.o = lsiVar;
        lrw lrwVar = new lrw(lsiVar);
        this.a = lrwVar;
        dvl dvlVar = new dvl(lrwVar);
        this.p = dvlVar;
        dvk dvkVar = new dvk(dvlVar);
        this.q = dvkVar;
        this.b = lsg.d(new dws(dvkVar, lrwVar, 2, null));
        this.r = new duk(dwjVar.g, dwjVar.h, dwjVar.l, dwjVar.W, dwjVar.j);
        this.c = lsg.d(new dys(this.a, dwjVar.ab, dwjVar.ac, 3));
        this.d = lsg.d(new dyp((mko) dwjVar.c, (mko) dwjVar.g, (mko) this.q, (mko) dwjVar.W, (mko) dwjVar.Y, (mko) this.r, (mko) dwjVar.Z, (mko) dwjVar.j, (mko) this.c, (mko) dwjVar.V, (mko) dwjVar.ad, 1, (byte[]) null));
        lsm lsmVar = lsk.b;
        ktf ktfVar = new ktf(2);
        ktfVar.g(lqf.FASTPAIR_DEVICE, dwjVar.ae);
        ktfVar.g(lqf.SPOT_DEVICE, dwjVar.ag);
        this.s = iqg.J(ktfVar);
        ktf ktfVar2 = new ktf(3);
        ktfVar2.g(lqf.ANDROID_DEVICE, dwjVar.aj);
        ktfVar2.g(lqf.SUPERVISED_ANDROID_DEVICE, dwjVar.aj);
        ktfVar2.g(lqf.SPOT_DEVICE, dwjVar.al);
        this.t = iqg.J(ktfVar2);
        this.e = lsg.d(new dxi(this.a, this.c, dwjVar.i, this.t, 7));
        this.u = lsg.d(new dyp(dwjVar.g, this.q, dwjVar.h, dwjVar.i, this.s, this.c, dwjVar.ah, dwjVar.ai, this.e, dwjVar.an, dwjVar.x, 0));
        this.f = lsg.d(new dys(dwjVar.V, dwjVar.ao, dwjVar.x, 2));
        this.g = lsg.d(new dys(dwjVar.h, dwjVar.i, this.c, 0));
        this.h = lsg.d(new gmf(dwjVar.g, dwjVar.h, this.d, this.u, this.f, this.g, this.c, dwjVar.ap, dwjVar.V, dwjVar.x, dwjVar.l, dwjVar.Y, dwjVar.ah, this.a, dwjVar.r, 1, null));
        this.i = new dvv(dwjVar.aq, 1, null);
        this.j = lsg.d(new eky(dwjVar.g, dwjVar.V, this.i, dwjVar.c, dwjVar.ar, dwjVar.as, dwjVar.l, dwjVar.at, this.a, 6, (float[]) null));
        this.k = lsg.d(new dxi((mko) dwjVar.i, (mko) dwjVar.h, (mko) this.c, (mko) dwjVar.m, 14, (int[]) null));
        this.v = lsg.d(new emb(this.a, 9));
        eva evaVar = new eva(dwjVar.c, this.v);
        this.w = evaVar;
        this.l = lsg.d(new dws(this.a, evaVar, 18));
    }

    @Override // defpackage.hcm
    public final void d() {
    }
}
