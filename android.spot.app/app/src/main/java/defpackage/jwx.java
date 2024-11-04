package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jwx extends jxb {
    private static final jyy b = new jyy(jwx.class);
    private jih c;
    private final boolean d;
    private final boolean e;

    public jwx(jih jihVar, boolean z, boolean z2) {
        super(jihVar.size());
        jihVar.getClass();
        this.c = jihVar;
        this.d = z;
        this.e = z2;
    }

    private final void t(int i, Future future) {
        try {
            f(i, amr.f(future));
        } catch (ExecutionException e) {
            u(e.getCause());
        } catch (Throwable th) {
            u(th);
        }
    }

    private final void u(Throwable th) {
        th.getClass();
        if (this.d && !n(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                e(newSetFromMap);
                jxb.a.b(this, newSetFromMap);
                set = this.seenExceptions;
                set.getClass();
            }
            if (w(set, th)) {
                v(th);
                return;
            }
        }
        if (th instanceof Error) {
            v(th);
        }
    }

    private static void v(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    private static boolean w(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        jih jihVar = this.c;
        if (jihVar != null) {
            return "futures=".concat(jihVar.toString());
        }
        return super.a();
    }

    @Override // defpackage.jwq
    protected final void b() {
        jih jihVar = this.c;
        boolean z = true;
        s(1);
        boolean isCancelled = isCancelled();
        if (jihVar == null) {
            z = false;
        }
        if (z & isCancelled) {
            boolean p = p();
            jmw listIterator = jihVar.listIterator();
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(p);
            }
        }
    }

    @Override // defpackage.jxb
    public final void e(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable j = j();
            j.getClass();
            w(set, j);
        }
    }

    public abstract void f(int i, Object obj);

    public final void g(jih jihVar) {
        boolean z;
        int a = jxb.a.a(this);
        int i = 0;
        if (a >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Less than 0 remaining futures");
        if (a == 0) {
            if (jihVar != null) {
                jmw listIterator = jihVar.listIterator();
                while (listIterator.hasNext()) {
                    Future future = (Future) listIterator.next();
                    if (!future.isCancelled()) {
                        t(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            h();
            s(2);
        }
    }

    public abstract void h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        final jih jihVar;
        jih jihVar2 = this.c;
        jihVar2.getClass();
        if (jihVar2.isEmpty()) {
            h();
            return;
        }
        if (this.d) {
            jmw listIterator = this.c.listIterator();
            final int i = 0;
            while (listIterator.hasNext()) {
                final jyz jyzVar = (jyz) listIterator.next();
                int i2 = i + 1;
                if (jyzVar.isDone()) {
                    r(i, jyzVar);
                } else {
                    jyzVar.c(new Runnable() { // from class: jwv
                        @Override // java.lang.Runnable
                        public final void run() {
                            jwx.this.r(i, jyzVar);
                        }
                    }, jxv.a);
                }
                i = i2;
            }
            return;
        }
        if (this.e) {
            jihVar = this.c;
        } else {
            jihVar = null;
        }
        Runnable runnable = new Runnable() { // from class: jww
            @Override // java.lang.Runnable
            public final void run() {
                jwx.this.g(jihVar);
            }
        };
        jmw listIterator2 = this.c.listIterator();
        while (listIterator2.hasNext()) {
            jyz jyzVar2 = (jyz) listIterator2.next();
            if (jyzVar2.isDone()) {
                g(jihVar);
            } else {
                jyzVar2.c(runnable, jxv.a);
            }
        }
    }

    public final void r(int i, jyz jyzVar) {
        try {
            if (jyzVar.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                t(i, jyzVar);
            }
        } finally {
            g(null);
        }
    }

    public void s(int i) {
        this.c = null;
    }
}
