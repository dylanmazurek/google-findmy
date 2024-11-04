package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhc implements drc {
    final /* synthetic */ dhd a;
    private final drq b;

    public dhc(dhd dhdVar, drq drqVar) {
        this.a = dhdVar;
        this.b = drqVar;
    }

    @Override // defpackage.drc
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                drq drqVar = this.b;
                for (dsi dsiVar : dtq.f(drqVar.a)) {
                    if (!dsiVar.l() && !dsiVar.k()) {
                        dsiVar.c();
                        if (!drqVar.c) {
                            dsiVar.b();
                        } else {
                            drqVar.b.add(dsiVar);
                        }
                    }
                }
            }
        }
    }
}
