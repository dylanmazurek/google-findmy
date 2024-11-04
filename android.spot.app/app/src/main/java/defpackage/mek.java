package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mek extends lyv {
    private static final lyv c;
    public final lzi a;
    public lyv b;
    private final ScheduledFuture d;
    private final Executor e;
    private volatile boolean f;
    private mca g;
    private List h = new ArrayList();
    private mej i;
    private mjo j;

    static {
        Logger.getLogger(mek.class.getName());
        c = new meh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public mek(Executor executor, ScheduledExecutorService scheduledExecutorService, lzj lzjVar) {
        ScheduledFuture<?> schedule;
        executor.getClass();
        this.e = executor;
        scheduledExecutorService.getClass();
        this.a = lzi.b();
        if (lzjVar == null) {
            schedule = null;
        } else {
            long b = lzjVar.b(TimeUnit.NANOSECONDS);
            long abs = Math.abs(b) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(b) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (b < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(abs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            schedule = scheduledExecutorService.schedule(new kvz(this, sb, 2), b, TimeUnit.NANOSECONDS);
        }
        this.d = schedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (!this.f) {
                this.h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.lyv
    public final void a(mjo mjoVar, mbc mbcVar) {
        boolean z;
        mca mcaVar;
        boolean z2;
        if (this.j == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "already started");
        synchronized (this) {
            mjoVar.getClass();
            this.j = mjoVar;
            mcaVar = this.g;
            z2 = this.f;
            if (!z2) {
                mej mejVar = new mej(mjoVar);
                this.i = mejVar;
                mjoVar = mejVar;
            }
        }
        if (mcaVar != null) {
            this.e.execute(new mei(this, mjoVar, mcaVar));
        } else if (z2) {
            this.b.a(mjoVar, mbcVar);
        } else {
            j(new kvo(this, mjoVar, mbcVar, 3));
        }
    }

    @Override // defpackage.lyv
    public final void c(String str, Throwable th) {
        mca d;
        mca mcaVar = mca.c;
        if (str != null) {
            d = mcaVar.d(str);
        } else {
            d = mcaVar.d("Call cancelled without message");
        }
        if (th != null) {
            d = d.c(th);
        }
        g(d, false);
    }

    @Override // defpackage.lyv
    public final void d() {
        j(new meg(this, 0));
    }

    @Override // defpackage.lyv
    public final void e(int i) {
        if (this.f) {
            this.b.e(i);
        } else {
            j(new bth(this, i, 9, null));
        }
    }

    @Override // defpackage.lyv
    public final void f(Object obj) {
        if (this.f) {
            this.b.f(obj);
        } else {
            j(new kvz(this, obj, 4));
        }
    }

    public final void g(mca mcaVar, boolean z) {
        boolean z2;
        mjo mjoVar;
        synchronized (this) {
            if (this.b == null) {
                i(c);
                mjoVar = this.j;
                this.g = mcaVar;
                z2 = false;
            } else if (!z) {
                z2 = true;
                mjoVar = null;
            } else {
                return;
            }
            if (z2) {
                j(new kvz(this, mcaVar, 3, null));
            } else {
                if (mjoVar != null) {
                    this.e.execute(new mei(this, mjoVar, mcaVar));
                }
                h();
            }
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:            if (r0.hasNext() == false) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:            ((java.lang.Runnable) r0.next()).run();     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:            r0 = r1.iterator();     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f = r0     // Catch: java.lang.Throwable -> L42
            mej r0 = r3.i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.e
            mef r2 = new mef
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mek.h():void");
    }

    public final void i(lyv lyvVar) {
        boolean z;
        lyv lyvVar2 = this.b;
        if (lyvVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.X(z, "realCall already set to %s", lyvVar2);
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = lyvVar;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("realCall", this.b);
        return q.toString();
    }

    protected void b() {
    }
}
