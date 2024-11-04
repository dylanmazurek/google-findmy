package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eex implements exp {
    final /* synthetic */ lqz a;
    final /* synthetic */ efa b;

    public eex(efa efaVar, lqz lqzVar) {
        this.a = lqzVar;
        this.b = efaVar;
    }

    @Override // defpackage.exp
    public final void a() {
        ((bym) this.a.a()).l(dxq.RENAME_CANCELLED);
    }

    @Override // defpackage.exp
    public final void b(String str) {
        ((bym) this.a.a()).l(dxq.RENAME_ACCEPTED);
        efa efaVar = this.b;
        lqc i = efaVar.i();
        ljh ljhVar = (ljh) i.z(5);
        ljhVar.w(i);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lqc lqcVar = (lqc) ljhVar.b;
        str.getClass();
        lqcVar.a |= 2;
        lqcVar.g = str;
        efaVar.s.w(i, (lqc) ljhVar.q());
        ljh k = lpo.c.k();
        ljh k2 = lpd.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        lpd lpdVar = (lpd) k2.b;
        str.getClass();
        lpdVar.a |= 1;
        lpdVar.b = str;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lpd lpdVar2 = (lpd) k2.q();
        lpdVar2.getClass();
        lpoVar.b = lpdVar2;
        lpoVar.a = 7;
        efaVar.k.b(efaVar.q, (lpo) k.q());
    }

    @Override // defpackage.exp
    public final void c() {
        ((bym) this.a.a()).k(dxp.DEVICES);
    }

    @Override // defpackage.exp
    public final void d(ech echVar) {
        boolean z;
        efa efaVar = this.b;
        hwx.V(efaVar.e.g(), "UI not attached");
        if (efaVar.e.c() == echVar) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "detaching wrong UI");
        echVar.af = null;
        efaVar.e = jdl.a;
    }
}
