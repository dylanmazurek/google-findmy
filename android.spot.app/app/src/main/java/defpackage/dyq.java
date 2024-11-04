package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.adm.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyq extends dxu {
    private static final jnk l = jnk.l("com/google/android/apps/adm/controllers/MainController");
    public final evy b;
    public final ewc c;
    public final dyh d;
    public final dyo e;
    public final dyr f;
    public final lqz g;
    public final lqz h;
    public final lqz i;
    public final Activity j;
    public final AtomicBoolean k = new AtomicBoolean(false);
    private final dyt m;
    private final lqz n;
    private final lqz o;
    private final lqz p;
    private final eim q;
    private boolean r;
    private final dyw s;

    public dyq(evy evyVar, ewc ewcVar, dyh dyhVar, dyo dyoVar, dyt dytVar, dyr dyrVar, lqz lqzVar, lqz lqzVar2, lqz lqzVar3, lqz lqzVar4, lqz lqzVar5, lqz lqzVar6, dyw dywVar, Activity activity, eim eimVar) {
        this.b = evyVar;
        this.c = ewcVar;
        this.d = dyhVar;
        this.e = dyoVar;
        this.m = dytVar;
        this.f = dyrVar;
        this.g = lqzVar;
        this.n = lqzVar2;
        this.h = lqzVar3;
        this.o = lqzVar4;
        this.i = lqzVar5;
        this.p = lqzVar6;
        this.s = dywVar;
        this.j = activity;
        this.q = eimVar;
    }

    public static void h(dxu dxuVar) {
        if (dxuVar.a) {
            dxuVar.c();
        }
    }

    private static void j(dxu dxuVar) {
        if (!dxuVar.a) {
            dxuVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dxu, defpackage.dxv
    public final void b() {
        super.b();
        fzq fzqVar = new fzq(jdl.a);
        bsc bscVar = new bsc();
        fzs fzsVar = ((fzw) fzn.a.b).b;
        fzt fztVar = ((fzu) fzsVar).b[20];
        if (fztVar != null) {
            synchronized (fztVar) {
                jin jinVar = new jin();
                jmx it = ((fzu) fzsVar).b[20].a.iterator();
                while (it.hasNext()) {
                    fzr fzrVar = (fzr) it.next();
                    if (fzrVar.a.equals(fzqVar)) {
                        bsc bscVar2 = fzrVar.b;
                    } else {
                        jinVar.h(fzrVar);
                    }
                }
                jinVar.h(new fzr(fzqVar, bscVar));
                ((fzu) fzsVar).b[20].a = jinVar.g();
            }
        }
        this.m.g = new njz(this, null);
        this.d.i = new njz(this, null);
        this.e.i = new njz(this);
        int g = fgp.a.g((Context) ((bym) this.n.a()).a, 10000000);
        if (g == 0) {
            dul dulVar = (dul) this.p.a();
            dulVar.d = this;
            if (!dulVar.c()) {
                dulVar.a();
            }
            if (((dul) this.p.a()).c()) {
                this.r = true;
                d();
                this.s.c(new dyl(this, 2));
                g();
            } else {
                this.r = false;
            }
        } else {
            if (fhd.g(g)) {
                ebf ebfVar = (ebf) this.g.a();
                final njz njzVar = new njz(this);
                fhd.i(g, ebfVar.a, new DialogInterface.OnCancelListener() { // from class: ebe
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        ((dyq) njz.this.a).e();
                    }
                });
            } else {
                e();
            }
        }
        if (lua.j()) {
            ijp.a(this.q.d(), "Failed updating FMDN status.", new Object[0]);
        }
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void c() {
        ((dul) this.p.a()).d = null;
        h(this.m);
        h(this.d);
        h(this.e);
        h(this.f);
        dyw dywVar = this.s;
        synchronized (dywVar.d) {
            dywVar.h = jdl.a;
        }
        super.c();
    }

    public final void d() {
        j(this.m);
        if (!i()) {
            dyt dytVar = this.m;
            exl exlVar = dytVar.d;
            iuu.q(mpd.r(exlVar.c, new eau(exlVar, (mmx) null, 12)), new dup(dytVar, 3), dytVar.c);
        }
    }

    public final void e() {
        this.j.finish();
    }

    public final void f(boolean z) {
        if (z) {
            if (!this.r) {
                this.r = true;
                this.s.c(new dyl(this, 2));
                g();
                return;
            }
            return;
        }
        ((jni) ((jni) l.f()).j("com/google/android/apps/adm/controllers/MainController", "onOwnersLoaded", 160, "MainController.java")).r("Failure loading owners, finishing activity.");
        this.j.finish();
    }

    public final void g() {
        hwx.V(this.a, "Controller needs to be init'd to populate UI");
        if (i()) {
            ((ebf) this.g.a()).g();
            if (((ebf) this.g.a()).r()) {
                ((bym) this.h.a()).k(dxp.AUTH);
            }
            if (this.e.a || this.f.a) {
                ((Executor) this.o.a()).execute(new dzw(this, 1));
                return;
            }
            return;
        }
        ((ebf) this.g.a()).f();
        if (((ebf) this.g.a()).a().e(R.id.main_fragment) == null && ((ebf) this.g.a()).s()) {
            ((bym) this.h.a()).k(dxp.DEVICES);
        }
        if (this.a) {
            j(this.e);
            j(this.f);
        }
    }

    public final boolean i() {
        j(this.d);
        if (!this.d.l()) {
            return true;
        }
        return false;
    }
}
