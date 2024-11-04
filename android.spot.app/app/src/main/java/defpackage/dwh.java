package defpackage;

import android.content.Context;
import android.text.BidiFormatter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwh implements hcn, lrd, lsb {
    public final ag a;
    public lsm b;
    public lsm c;
    public lsm d;
    public lsm e;
    public lsm f;
    public lsm g;
    public lsm h;
    public final dwj i;
    public final dwf j;
    private lsm k;
    private bso l;
    private bso m;

    public dwh() {
        throw null;
    }

    public final ewq a() {
        ebf ebfVar = (ebf) this.j.c.a();
        BidiFormatter b = dwb.b();
        Object b2 = b();
        ewg ewgVar = (ewg) this.i.h.a();
        dwf dwfVar = this.j;
        nca ncaVar = new nca((evy) dwfVar.m.g.a(), (ewg) dwfVar.m.h.a(), lsg.b(dwfVar.m.l), lsg.b(dwfVar.m.W), lsg.b(dwfVar.m.j));
        ele eleVar = (ele) this.i.m.a();
        efy efyVar = (efy) this.i.B.a();
        ejo ejoVar = (ejo) this.i.D.a();
        emx emxVar = (emx) this.i.P.a();
        gml gmlVar = (gml) this.j.k.a();
        dwj dwjVar = this.i;
        ehm a = dwjVar.a();
        cfk cfkVar = (cfk) dwjVar.aA.a();
        exa exaVar = (exa) this.i.aB.a();
        ewv ewvVar = new ewv((Context) this.i.aS.b, this.a, ebfVar, b, (emm) b2, ewgVar, ncaVar, eleVar, efyVar, ejoVar, emxVar, gmlVar, a, cfkVar, exaVar);
        dwj dwjVar2 = this.i;
        return new ewq(ewvVar, (Context) dwjVar2.aS.b, (dxf) dwjVar2.w.a());
    }

    public final Object b() {
        return new emm((exx) this.k.a(), (emx) this.i.P.a());
    }

    public final void c() {
    }

    @Override // defpackage.lrd
    public final mrx e() {
        return this.j.f();
    }

    public dwh(dwj dwjVar, dwf dwfVar, ag agVar) {
        this.i = dwjVar;
        this.j = dwfVar;
        this.a = agVar;
        lsh b = lsi.b(agVar);
        this.b = b;
        bso bsoVar = new bso(b, dwfVar.c, dwjVar.au);
        this.l = bsoVar;
        this.c = lsi.b(new dhx(bsoVar));
        bso bsoVar2 = new bso(this.b, dwfVar.c, dwjVar.au);
        this.m = bsoVar2;
        this.d = lsi.b(new dhx(bsoVar2));
        this.e = lsg.d(new dvj((mko) dwjVar.b, (mko) dwjVar.am, (mko) dwfVar.a, (mko) dwjVar.V, (mko) dwjVar.i, 2, (char[]) null));
        this.f = lsg.d(new eml((mko) this.b, (mko) dwjVar.g, (mko) dwfVar.d, (mko) dwjVar.aw, (mko) dwjVar.ax, (mko) dwfVar.i, (mko) dwfVar.j, (mko) dwjVar.W, (mko) dwjVar.V, (mko) dwjVar.am, 1, (byte[]) null));
        this.k = lsg.d(new dws(this.b, dwfVar.c, 20));
        this.g = lsg.d(new emb(this.b, 18));
        this.h = lsg.d(new emb(this.b, 7));
    }

    @Override // defpackage.hcm
    public final void d() {
    }
}
