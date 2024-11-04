package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jak {
    public final jzm c;
    public final jyl d;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = new jzl(jxv.a);

    public jak(jxc jxcVar, Executor executor) {
        jzm jzmVar = new jzm();
        this.c = jzmVar;
        jyl jylVar = new jyl(jxcVar, executor, 1);
        this.d = jylVar;
        jzmVar.c(jylVar, jxv.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final jyz c() {
        long j;
        final int a;
        jyz h;
        if (this.c.isDone()) {
            return this.c;
        }
        do {
            j = this.a.get();
            a = a(j);
        } while (!this.a.compareAndSet(j, b(a, ((int) j) + 1)));
        final jzm jzmVar = new jzm();
        jyz jyzVar = (jyz) this.e.getAndSet(jzmVar);
        if (jyzVar == null) {
            h = ivc.J(jbn.b(new jxc() { // from class: jaf
                @Override // defpackage.jxc
                public final jyz a() {
                    return jak.this.d(a);
                }
            }), jxv.a);
        } else {
            h = jwb.h(jyzVar, Throwable.class, jbn.c(new jxd() { // from class: jag
                @Override // defpackage.jxd
                public final jyz a(Object obj) {
                    return jak.this.d(a);
                }
            }), this.f);
        }
        jzmVar.o(h);
        final jai jaiVar = new jai(this, a);
        jzmVar.c(new Runnable() { // from class: jah
            @Override // java.lang.Runnable
            public final void run() {
                jai jaiVar2 = jaiVar;
                jzm jzmVar2 = jzmVar;
                try {
                    Object M = ivc.M(jzmVar2);
                    jak jakVar = jak.this;
                    jakVar.c.d(M);
                    jaiVar2.o(jakVar.c);
                } catch (Throwable unused) {
                    jaiVar2.o(jzmVar2);
                }
            }
        }, jxv.a);
        return jaiVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [jxc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final jyz d(int i) {
        jaj jajVar;
        if (a(this.a.get()) > i) {
            return ivc.C();
        }
        jaj jajVar2 = new jaj(i);
        do {
            jajVar = (jaj) this.b.get();
            if (jajVar != null && jajVar.a > i) {
                return ivc.C();
            }
        } while (!a.o(this.b, jajVar, jajVar2));
        if (a(this.a.get()) > i) {
            jajVar2.cancel(true);
            a.o(this.b, jajVar2, null);
            return jajVar2;
        }
        jyl jylVar = this.d;
        ?? r1 = jylVar.a;
        ?? r4 = jylVar.b;
        if (r1 != 0 && r4 != 0) {
            jajVar2.o(ivc.J(jbn.b(r1), r4));
        } else {
            jajVar2.o(this.c);
        }
        return jajVar2;
    }
}
