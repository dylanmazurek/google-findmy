package defpackage;

import j$.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejz implements exp {
    final /* synthetic */ lqz a;
    final /* synthetic */ lqd b;
    final /* synthetic */ elk c;
    final /* synthetic */ ekc d;
    final /* synthetic */ dxf e;

    public ejz(ekc ekcVar, lqz lqzVar, dxf dxfVar, lqd lqdVar, elk elkVar) {
        this.a = lqzVar;
        this.e = dxfVar;
        this.b = lqdVar;
        this.c = elkVar;
        this.d = ekcVar;
    }

    @Override // defpackage.exp
    public final void a() {
        this.e.c(lnb.DEVICE_RENAME_CANCELED, jdl.a, this.b);
        ((bym) this.a.a()).l(dxq.RENAME_CANCELLED);
    }

    @Override // defpackage.exp
    public final void b(String str) {
        jyz f;
        ((bym) this.a.a()).l(dxq.RENAME_ACCEPTED);
        this.e.c(lnb.DEVICE_RENAME_REQUESTED, jdl.a, this.b);
        ekc ekcVar = this.d;
        elk elkVar = this.c;
        ele eleVar = elkVar.b;
        lqc i = ekcVar.i();
        kyf kyfVar = eleVar.a(i).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        if (kylVar.d.equals(str)) {
            return;
        }
        hnu hnuVar = elkVar.g;
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        ksr ksrVar = new ksr(kxvVar);
        kyl kylVar2 = kyfVar.c;
        if (kylVar2 == null) {
            kylVar2 = kyl.j;
        }
        ljh ljhVar = (ljh) kylVar2.z(5);
        ljhVar.w(kylVar2);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        kyl kylVar3 = (kyl) ljhVar.b;
        str.getClass();
        kylVar3.d = str;
        ksrVar.e((kyl) ljhVar.q());
        jyz m = hnuVar.m(ksrVar.G());
        kyq kyqVar = kyfVar.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        if (kyqVar.e.z()) {
            f = jyv.a;
        } else {
            kuv kuvVar = elkVar.h;
            kyq kyqVar2 = kyfVar.f;
            if (kyqVar2 == null) {
                kyqVar2 = kyq.g;
            }
            f = jbx.d(kuvVar.s(kyqVar2)).f(new ejc(elkVar, str, 3), elkVar.d);
            ijp.b(f, "Failed renaming device in FastPair");
        }
        lqd lqdVar = i.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        synchronized (elkVar.e) {
            Map.EL.putIfAbsent(elkVar.e, lqdVar, new cfn(true));
            cfn cfnVar = (cfn) elkVar.e.get(lqdVar);
            cfnVar.getClass();
            cfnVar.i(true);
        }
        new jck(iuu.E(m, f), (byte[]) null).h(new eli(m, 0), jxv.a).i(new elj(elkVar, i, 0), elkVar.c);
    }

    @Override // defpackage.exp
    public final void d(ech echVar) {
        boolean z;
        boolean z2 = true;
        if (this.d.h != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI not attached");
        if (this.d.h != echVar) {
            z2 = false;
        }
        hwx.K(z2, "detaching wrong UI");
        echVar.af = null;
        this.d.h = null;
    }

    @Override // defpackage.exp
    public final void c() {
    }
}
