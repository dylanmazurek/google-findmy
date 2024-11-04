package defpackage;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class db implements fh {
    final /* synthetic */ dn a;
    private final fh b;

    public db(dn dnVar, fh fhVar) {
        this.a = dnVar;
        this.b = fhVar;
    }

    @Override // defpackage.fh
    public final void a(fi fiVar) {
        fk fkVar = (fk) this.b;
        fkVar.a.onDestroyActionMode(fkVar.e(fiVar));
        dn dnVar = this.a;
        if (dnVar.s != null) {
            dnVar.l.getDecorView().removeCallbacks(this.a.t);
        }
        dn dnVar2 = this.a;
        if (dnVar2.r != null) {
            dnVar2.C();
            dn dnVar3 = this.a;
            bet w = bwn.w(dnVar3.r);
            w.g(0.0f);
            dnVar3.M = w;
            this.a.M.i(new da(this));
        }
        dn dnVar4 = this.a;
        dnVar4.q = null;
        bvz.c(dnVar4.w);
        this.a.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fh
    public final boolean b(fi fiVar, MenuItem menuItem) {
        fk fkVar = (fk) this.b;
        return fkVar.a.onActionItemClicked(fkVar.e(fiVar), new go(fkVar.b, menuItem));
    }

    @Override // defpackage.fh
    public final boolean c(fi fiVar, Menu menu) {
        fk fkVar = (fk) this.b;
        return fkVar.a.onCreateActionMode(fkVar.e(fiVar), fkVar.f(menu));
    }

    @Override // defpackage.fh
    public final void d(fi fiVar, Menu menu) {
        bvz.c(this.a.w);
        fk fkVar = (fk) this.b;
        fkVar.a.onPrepareActionMode(fkVar.e(fiVar), fkVar.f(menu));
    }
}
