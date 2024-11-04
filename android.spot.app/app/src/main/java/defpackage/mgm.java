package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgm extends mbk {
    public final mgk a;
    final mbn b;
    public final /* synthetic */ mgu c;

    public mgm(mgu mguVar, mgk mgkVar, mbn mbnVar) {
        this.c = mguVar;
        this.a = mgkVar;
        mbnVar.getClass();
        this.b = mbnVar;
    }

    @Override // defpackage.mbk
    public final void a(mca mcaVar) {
        hwx.K(!mcaVar.f(), "the error status must not be OK");
        this.c.m.execute(new kvz(this, mcaVar, 18, null));
    }

    @Override // defpackage.mbk
    public final void b(mbl mblVar) {
        this.c.m.execute(new mgl(this, mblVar));
    }
}
