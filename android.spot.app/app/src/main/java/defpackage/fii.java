package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fii extends fie {
    public final fjm b;

    public fii(fjm fjmVar, bym bymVar) {
        super(4, bymVar);
        this.b = fjmVar;
    }

    @Override // defpackage.fid
    public final boolean a(fjb fjbVar) {
        apc apcVar = (apc) fjbVar.e.get(this.b);
        if (apcVar != null && ((fjs) apcVar.c).c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fid
    public final Feature[] b(fjb fjbVar) {
        apc apcVar = (apc) fjbVar.e.get(this.b);
        if (apcVar == null) {
            return null;
        }
        return ((fjs) apcVar.c).b;
    }

    @Override // defpackage.fie
    public final void c(fjb fjbVar) {
        apc apcVar = (apc) fjbVar.e.remove(this.b);
        if (apcVar != null) {
            ((fjt) ((njz) apcVar.b).a).b.a(fjbVar.b, this.a);
            ((fjs) apcVar.c).a.a();
            return;
        }
        this.a.u(false);
    }

    @Override // defpackage.fie, defpackage.fij
    public final /* bridge */ /* synthetic */ void g(gok gokVar, boolean z) {
    }
}
