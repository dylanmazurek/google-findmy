package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wa {
    public final wq a;
    public final Object b;
    public final Object c;
    public final atk d;
    private final va e;
    private final va f;
    private final va g;
    private long h;
    private va i;

    /* JADX WARN: Type inference failed for: r1v2, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [moh, java.lang.Object] */
    public wa(uu uuVar, atk atkVar, Object obj, Object obj2, va vaVar) {
        va c;
        this.a = uuVar.a(atkVar);
        this.d = atkVar;
        this.b = obj2;
        this.c = obj;
        this.e = (va) atkVar.b.a(obj);
        this.f = (va) atkVar.b.a(obj2);
        if (vaVar != null) {
            c = ql.b(vaVar);
        } else {
            c = ((va) atkVar.b.a(obj)).c();
        }
        this.g = c;
        this.h = -1L;
    }

    public final long a() {
        long j = this.h;
        if (j < 0) {
            long a = this.a.a(this.e, this.f, this.g);
            this.h = a;
            return a;
        }
        return j;
    }

    public final va b(long j) {
        if (!qg.c(this, j)) {
            return this.a.d(j, this.e, this.f, this.g);
        }
        va vaVar = this.i;
        if (vaVar == null) {
            va b = this.a.b(this.e, this.f, this.g);
            this.i = b;
            return b;
        }
        return vaVar;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [moh, java.lang.Object] */
    public final Object c(long j) {
        if (!qg.c(this, j)) {
            va c = this.a.c(j, this.e, this.f, this.g);
            int b = c.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(c.a(i))) {
                    qz.g("AnimationVector cannot contain a NaN. " + c + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.d.a.a(c);
        }
        return this.b;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.c + " -> " + this.b + ",initial velocity: " + this.g + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
