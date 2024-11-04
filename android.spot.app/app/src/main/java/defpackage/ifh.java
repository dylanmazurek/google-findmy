package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifh {
    public static final Duration a = Duration.ofMillis(100);
    public static final Duration b = Duration.ofSeconds(5);
    public final jer c;
    public final kyf d;
    public final kyh e;
    public final jzd f;
    public final Object g = new Object();
    public iff h;
    public jer i;
    public jer j;
    public jer k;
    public final Object l;
    public jer m;
    public final fma n;
    public final hnu o;
    public final hnu p;
    public final hot q;
    public final kuv r;
    private final buc s;

    public ifh(fma fmaVar, hot hotVar, hnu hnuVar, kuv kuvVar, jzd jzdVar, hnu hnuVar2, kyf kyfVar, kyh kyhVar, buc bucVar, jer jerVar) {
        jdl jdlVar = jdl.a;
        this.h = hqk.f(jdlVar, jdlVar, jdlVar, 1);
        jdl jdlVar2 = jdl.a;
        this.i = jdlVar2;
        this.j = jdlVar2;
        this.k = jdlVar2;
        this.l = new Object();
        this.m = jdlVar2;
        this.n = fmaVar;
        this.q = hotVar;
        this.o = hnuVar;
        this.c = jerVar;
        this.r = kuvVar;
        this.d = kyfVar;
        this.e = kyhVar;
        this.f = jzdVar;
        this.s = bucVar;
        this.p = hnuVar2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [jzb, java.lang.Object] */
    public final void a() {
        synchronized (this.l) {
            if (this.m.g()) {
                this.m.c().cancel(false);
                this.m = jdl.a;
            }
        }
    }

    public final void b() {
        if (this.j.g()) {
            ((hxz) this.j.c()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jyz] */
    public final void c() {
        if (this.k.g()) {
            this.k.c().cancel(false);
            this.k = jdl.a;
        }
    }

    public final void d(iff iffVar) {
        this.h = iffVar;
        this.s.a(iffVar);
    }
}
