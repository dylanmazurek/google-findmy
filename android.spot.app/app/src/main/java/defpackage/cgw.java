package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgw implements AutoCloseable, msw {
    private final mnb a;

    public cgw(mnb mnbVar) {
        mnbVar.getClass();
        this.a = mnbVar;
    }

    @Override // defpackage.msw
    public final mnb b() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mkm.aA(this.a, null);
    }
}
