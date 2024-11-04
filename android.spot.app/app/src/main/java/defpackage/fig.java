package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fig extends fie {
    public final apc b;

    public fig(apc apcVar, bym bymVar) {
        super(3, bymVar);
        this.b = apcVar;
    }

    @Override // defpackage.fid
    public final boolean a(fjb fjbVar) {
        return ((fjs) this.b.c).c;
    }

    @Override // defpackage.fid
    public final Feature[] b(fjb fjbVar) {
        return ((fjs) this.b.c).b;
    }

    @Override // defpackage.fie
    public final void c(fjb fjbVar) {
        ((fjs) this.b.c).b(fjbVar.b, this.a);
        fjm a = ((fjs) this.b.c).a();
        if (a != null) {
            fjbVar.e.put(a, this.b);
        }
    }

    @Override // defpackage.fie, defpackage.fij
    public final /* bridge */ /* synthetic */ void g(gok gokVar, boolean z) {
    }
}
