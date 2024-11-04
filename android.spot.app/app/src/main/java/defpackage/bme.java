package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bme implements jyz {
    static final blv b;
    private static final Object d;
    volatile blz listeners;
    public volatile Object value;
    volatile bmd waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(bme.class.getName());

    static {
        blv bmcVar;
        try {
            bmcVar = new bma(AtomicReferenceFieldUpdater.newUpdater(bmd.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(bmd.class, bmd.class, "next"), AtomicReferenceFieldUpdater.newUpdater(bme.class, bmd.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(bme.class, blz.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(bme.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            bmcVar = new bmc();
        }
        b = bmcVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    static Object a(jyz jyzVar) {
        if (jyzVar instanceof bme) {
            Object obj = ((bme) jyzVar).value;
            if (obj instanceof blw) {
                blw blwVar = (blw) obj;
                if (blwVar.c) {
                    Throwable th = blwVar.d;
                    if (th != null) {
                        return new blw(false, th);
                    }
                    return blw.b;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = jyzVar.isCancelled();
        if (!((!a) & isCancelled)) {
            try {
                Object f = amr.f(jyzVar);
                if (f == null) {
                    return d;
                }
                return f;
            } catch (CancellationException e) {
                if (!isCancelled) {
                    Objects.toString(jyzVar);
                    return new bly(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(jyzVar)), e));
                }
                return new blw(false, e);
            } catch (ExecutionException e2) {
                return new bly(e2.getCause());
            } catch (Throwable th2) {
                return new bly(th2);
            }
        }
        return blw.b;
    }

    static void e(bme bmeVar) {
        blz blzVar;
        blz blzVar2;
        blz blzVar3 = null;
        while (true) {
            bmd bmdVar = bmeVar.waiters;
            if (b.e(bmeVar, bmdVar, bmd.a)) {
                while (bmdVar != null) {
                    Thread thread = bmdVar.thread;
                    if (thread != null) {
                        bmdVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    bmdVar = bmdVar.next;
                }
                bmeVar.d();
                do {
                    blzVar = bmeVar.listeners;
                } while (!b.c(bmeVar, blzVar, blz.a));
                while (true) {
                    blzVar2 = blzVar3;
                    blzVar3 = blzVar;
                    if (blzVar3 == null) {
                        break;
                    }
                    blzVar = blzVar3.next;
                    blzVar3.next = blzVar2;
                }
                while (blzVar2 != null) {
                    Runnable runnable = blzVar2.b;
                    blz blzVar4 = blzVar2.next;
                    if (runnable instanceof bmb) {
                        bmb bmbVar = (bmb) runnable;
                        bmeVar = bmbVar.a;
                        if (bmeVar.value == bmbVar) {
                            if (b.d(bmeVar, bmbVar, a(bmbVar.b))) {
                                blzVar3 = blzVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        k(runnable, blzVar2.c);
                    }
                    blzVar2 = blzVar4;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Object obj) {
        obj.getClass();
    }

    private final String i(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    private final void j(StringBuilder sb) {
        try {
            Object f = amr.f(this);
            sb.append("SUCCESS, result=[");
            sb.append(i(f));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            c.log(Level.SEVERE, a.ah(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }

    private final void l(bmd bmdVar) {
        bmdVar.thread = null;
        while (true) {
            bmd bmdVar2 = this.waiters;
            if (bmdVar2 != bmd.a) {
                bmd bmdVar3 = null;
                while (bmdVar2 != null) {
                    bmd bmdVar4 = bmdVar2.next;
                    if (bmdVar2.thread != null) {
                        bmdVar3 = bmdVar2;
                    } else if (bmdVar3 != null) {
                        bmdVar3.next = bmdVar4;
                        if (bmdVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, bmdVar2, bmdVar4)) {
                        break;
                    }
                    bmdVar2 = bmdVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object m(Object obj) {
        if (!(obj instanceof blw)) {
            if (!(obj instanceof bly)) {
                if (obj == d) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((bly) obj).b);
        }
        Throwable th = ((blw) obj).d;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof bmb) {
            return "setFuture=[" + i(((bmb) obj).b) + "]";
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // defpackage.jyz
    public final void c(Runnable runnable, Executor executor) {
        h(executor);
        blz blzVar = this.listeners;
        if (blzVar != blz.a) {
            blz blzVar2 = new blz(runnable, executor);
            do {
                blzVar2.next = blzVar;
                if (b.c(this, blzVar, blzVar2)) {
                    return;
                } else {
                    blzVar = this.listeners;
                }
            } while (blzVar != blz.a);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        blw blwVar;
        boolean z3;
        Object obj = this.value;
        boolean z4 = obj instanceof bmb;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z4 | z2)) {
            return false;
        }
        if (a) {
            blwVar = new blw(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            blwVar = blw.a;
        } else {
            blwVar = blw.b;
        }
        boolean z5 = false;
        bme bmeVar = this;
        while (true) {
            if (b.d(bmeVar, obj, blwVar)) {
                e(bmeVar);
                if (!(obj instanceof bmb)) {
                    break;
                }
                jyz jyzVar = ((bmb) obj).b;
                if (jyzVar instanceof bme) {
                    bmeVar = (bme) jyzVar;
                    obj = bmeVar.value;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof bmb)) {
                        break;
                    }
                    z5 = true;
                } else {
                    jyzVar.cancel(z);
                    break;
                }
            } else {
                obj = bmeVar.value;
                if (!(obj instanceof bmb)) {
                    return z5;
                }
            }
        }
        return true;
    }

    public boolean f(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (b.d(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    public final boolean g(Throwable th) {
        h(th);
        if (b.d(this, null, new bly(th))) {
            e(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof bmb))) {
                return m(obj2);
            }
            bmd bmdVar = this.waiters;
            if (bmdVar != bmd.a) {
                bmd bmdVar2 = new bmd();
                do {
                    bmdVar2.a(bmdVar);
                    if (b.e(this, bmdVar, bmdVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                l(bmdVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof bmb))));
                        return m(obj);
                    }
                    bmdVar = this.waiters;
                } while (bmdVar != bmd.a);
            }
            return m(this.value);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof blw;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.value;
        boolean z2 = obj instanceof bmb;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return z & (!z2);
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            j(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e) {
                Class<?> cls = e.getClass();
                Objects.toString(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                j(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof bmb))) {
                return m(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                bmd bmdVar = this.waiters;
                if (bmdVar != bmd.a) {
                    bmd bmdVar2 = new bmd();
                    do {
                        bmdVar2.a(bmdVar);
                        if (b.e(this, bmdVar, bmdVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof bmb))) {
                                        return m(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    l(bmdVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            l(bmdVar2);
                        } else {
                            bmdVar = this.waiters;
                        }
                    } while (bmdVar != bmd.a);
                }
                return m(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof bmb))) {
                    return m(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bmeVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(a.an(bmeVar, str, " for "));
        }
        throw new InterruptedException();
    }

    protected void d() {
    }
}
