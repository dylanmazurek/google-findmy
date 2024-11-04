package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ut {
    public final long a;
    public final mnw b;
    public final adt c;
    public va d;
    public long e;
    public long f = Long.MIN_VALUE;
    private final adt g = new aee(true, agw.a);

    public ut(Object obj, va vaVar, long j, long j2, mnw mnwVar) {
        this.a = j2;
        this.b = mnwVar;
        this.c = new aee(obj, agw.a);
        this.d = ql.b(vaVar);
        this.e = j;
    }

    public final Object a() {
        return this.c.a();
    }

    public final boolean b() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    public final void c() {
        this.g.h(false);
    }
}
