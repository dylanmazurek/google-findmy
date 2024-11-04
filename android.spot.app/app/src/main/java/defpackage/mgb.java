package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mgb extends maq {
    final /* synthetic */ Throwable a;
    private final mam b;

    public mgb(Throwable th) {
        this.a = th;
        mca c = mca.h.d("Panic! This is a bug!").c(th);
        mam mamVar = mam.a;
        hwx.K(!c.f(), "drop status shouldn't be OK");
        this.b = new mam(null, c, true);
    }

    @Override // defpackage.maq
    public final mam a() {
        return this.b;
    }

    public final String toString() {
        jeq p = ivc.p(mgb.class);
        p.b("panicPickResult", this.b);
        return p.toString();
    }
}
