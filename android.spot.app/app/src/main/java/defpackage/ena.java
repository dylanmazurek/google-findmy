package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ena implements cem {
    private final emg a;
    private final ele b;
    private final ewg c;
    private lqd d;

    public ena(emg emgVar, ele eleVar, ewg ewgVar) {
        emgVar.getClass();
        eleVar.getClass();
        ewgVar.getClass();
        this.a = emgVar;
        this.b = eleVar;
        this.c = ewgVar;
    }

    @Override // defpackage.cem
    public final void cT(cfc cfcVar) {
        lqd lqdVar = this.d;
        if (lqdVar == null) {
            mpd.b("deviceIdentifier");
            lqdVar = null;
        }
        this.a.a(lqdVar);
    }

    @Override // defpackage.cem
    public final void f() {
        lqd lqdVar = this.d;
        if (lqdVar == null) {
            mpd.b("deviceIdentifier");
            lqdVar = null;
        }
        this.a.b(lqdVar);
    }

    public final void g(cex cexVar, lqd lqdVar) {
        Object obj;
        cexVar.getClass();
        lqdVar.getClass();
        this.d = lqdVar;
        jis c = this.c.c();
        if (c != null) {
            Iterator<E> it = c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    lqd lqdVar2 = ((lqc) obj).d;
                    if (lqdVar2 == null) {
                        lqdVar2 = lqd.d;
                    }
                    if (amr.i(lqdVar2, lqdVar)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lqc lqcVar = (lqc) obj;
            if (lqcVar != null) {
                kyf kyfVar = this.b.a(lqcVar).b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kyfVar.getClass();
                if (hqk.b(kyfVar)) {
                    cexVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cem
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void e() {
    }
}
