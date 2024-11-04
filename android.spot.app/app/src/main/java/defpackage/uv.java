package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uv implements agt {
    public va a;
    public long b;
    public long c;
    public boolean d;
    public final atk e;
    private final adt f;

    public uv(atk atkVar, Object obj, va vaVar, long j, boolean z) {
        va f;
        this.e = atkVar;
        this.f = new aee(obj, agw.a);
        if (vaVar != null) {
            f = ql.b(vaVar);
        } else {
            f = qi.f(atkVar, obj);
        }
        this.a = f;
        this.b = j;
        this.c = Long.MIN_VALUE;
        this.d = z;
    }

    @Override // defpackage.agt
    public final Object a() {
        return this.f.a();
    }

    public final void b(Object obj) {
        this.f.h(obj);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [moh, java.lang.Object] */
    public final String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + this.e.a.a(this.a) + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ')';
    }
}
