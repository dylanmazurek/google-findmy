package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daz implements agt {
    public final agt a;
    private final agt d;
    private final msk e = new msk();
    private final adt b = new aee(null, agw.a);
    private final adt c = new aee(null, agw.a);

    public daz() {
        new ack(new ctm(this, 7));
        this.d = new ack(new ctm(this, 5));
        new ack(new ctm(this, 6));
        this.a = new ack(new ctm(this, 8));
    }

    @Override // defpackage.agt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cyb a() {
        return (cyb) this.b.a();
    }

    public final Throwable c() {
        return (Throwable) this.c.a();
    }

    public final synchronized void d(cyb cybVar) {
        cybVar.getClass();
        if (f()) {
            return;
        }
        this.b.h(cybVar);
        this.e.R(cybVar);
    }

    public final synchronized void e(Throwable th) {
        if (f()) {
            return;
        }
        this.c.h(th);
        this.e.e(th);
    }

    public final boolean f() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
