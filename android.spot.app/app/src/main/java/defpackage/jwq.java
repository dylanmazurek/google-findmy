package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jwq extends jzv implements jyz {
    private static final Object a;
    static final boolean i;
    static final jyy j;
    public static final jwc k;
    public volatile jwg listeners;
    public volatile Object value;
    public volatile jwp waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        jwc jwjVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        i = z;
        j = new jyy(jwq.class);
        try {
            jwjVar = new jwo();
            th2 = null;
            th = null;
        } catch (Error | Exception e) {
            try {
                th = null;
                th2 = e;
                jwjVar = new jwh(AtomicReferenceFieldUpdater.newUpdater(jwp.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(jwp.class, jwp.class, "next"), AtomicReferenceFieldUpdater.newUpdater(jwq.class, jwp.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(jwq.class, jwg.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(jwq.class, Object.class, "value"));
            } catch (Error | Exception e2) {
                th = e2;
                th2 = e;
                jwjVar = new jwj();
            }
        }
        k = jwjVar;
        if (th != null) {
            jyy jyyVar = j;
            jyyVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            jyyVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        a = new Object();
    }

    private final void e(StringBuilder sb) {
        try {
            Object f = amr.f(this);
            sb.append("SUCCESS, result=[");
            if (f == null) {
                sb.append("null");
            } else if (f == this) {
                sb.append("this future");
            } else {
                sb.append(f.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void f(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof jwi) {
            sb.append(", setFuture=[");
            g(sb, ((jwi) obj).b);
            sb.append("]");
        } else {
            try {
                concat = ivc.m(a());
            } catch (Exception | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e.getClass())));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            e(sb);
        }
    }

    private final void g(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            j.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(jyz jyzVar) {
        Throwable j2;
        if (jyzVar instanceof jwk) {
            Object obj = ((jwq) jyzVar).value;
            if (obj instanceof jwd) {
                jwd jwdVar = (jwd) obj;
                if (jwdVar.c) {
                    Throwable th = jwdVar.d;
                    obj = th != null ? new jwd(false, th) : jwd.b;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((jyzVar instanceof jzv) && (j2 = ((jzv) jyzVar).j()) != null) {
            return new jwf(j2);
        }
        boolean isCancelled = jyzVar.isCancelled();
        if (!((!i) & isCancelled)) {
            try {
                Object f = amr.f(jyzVar);
                if (isCancelled) {
                    return new jwd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(jyzVar)));
                }
                if (f == null) {
                    return a;
                }
                return f;
            } catch (Error e) {
                e = e;
                return new jwf(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new jwf(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(jyzVar))), e2));
                }
                return new jwd(false, e2);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new jwd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(jyzVar))), e3));
                }
                return new jwf(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new jwf(e);
            }
        }
        jwd jwdVar2 = jwd.b;
        jwdVar2.getClass();
        return jwdVar2;
    }

    public static void k(jwq jwqVar, boolean z) {
        jwg jwgVar = null;
        while (true) {
            for (jwp b = k.b(jwqVar, jwp.a); b != null; b = b.next) {
                Thread thread = b.thread;
                if (thread != null) {
                    b.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                jwqVar.l();
            }
            jwqVar.b();
            jwg jwgVar2 = jwgVar;
            jwg a2 = k.a(jwqVar, jwg.a);
            jwg jwgVar3 = jwgVar2;
            while (a2 != null) {
                jwg jwgVar4 = a2.next;
                a2.next = jwgVar3;
                jwgVar3 = a2;
                a2 = jwgVar4;
            }
            while (jwgVar3 != null) {
                jwgVar = jwgVar3.next;
                Runnable runnable = jwgVar3.b;
                runnable.getClass();
                if (runnable instanceof jwi) {
                    jwi jwiVar = (jwi) runnable;
                    jwqVar = jwiVar.a;
                    if (jwqVar.value == jwiVar) {
                        if (k.f(jwqVar, jwiVar, i(jwiVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = jwgVar3.c;
                    executor.getClass();
                    h(runnable, executor);
                }
                jwgVar3 = jwgVar;
            }
            return;
            z = false;
        }
    }

    private final void q(jwp jwpVar) {
        jwpVar.thread = null;
        while (true) {
            jwp jwpVar2 = this.waiters;
            if (jwpVar2 != jwp.a) {
                jwp jwpVar3 = null;
                while (jwpVar2 != null) {
                    jwp jwpVar4 = jwpVar2.next;
                    if (jwpVar2.thread != null) {
                        jwpVar3 = jwpVar2;
                    } else if (jwpVar3 != null) {
                        jwpVar3.next = jwpVar4;
                        if (jwpVar3.thread == null) {
                            break;
                        }
                    } else if (!k.g(this, jwpVar2, jwpVar4)) {
                        break;
                    }
                    jwpVar2 = jwpVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object r(Object obj) {
        if (!(obj instanceof jwd)) {
            if (!(obj instanceof jwf)) {
                if (obj == a) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((jwf) obj).b);
        }
        Throwable th = ((jwd) obj).d;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // defpackage.jyz
    public void c(Runnable runnable, Executor executor) {
        jwg jwgVar;
        executor.getClass();
        if (!isDone() && (jwgVar = this.listeners) != jwg.a) {
            jwg jwgVar2 = new jwg(runnable, executor);
            do {
                jwgVar2.next = jwgVar;
                if (k.e(this, jwgVar, jwgVar2)) {
                    return;
                } else {
                    jwgVar = this.listeners;
                }
            } while (jwgVar != jwg.a);
        }
        h(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:            return true;     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof defpackage.jwi
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = defpackage.jwq.i
            if (r1 == 0) goto L1f
            jwd r1 = new jwd
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            jwd r1 = defpackage.jwd.a
            goto L26
        L24:
            jwd r1 = defpackage.jwd.b
        L26:
            r1.getClass()
        L29:
            r5 = 0
            r4 = r7
        L2b:
            jwc r6 = defpackage.jwq.k
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L58
            k(r4, r8)
            boolean r4 = r0 instanceof defpackage.jwi
            if (r4 == 0) goto L56
            jwi r0 = (defpackage.jwi) r0
            jyz r0 = r0.b
            boolean r4 = r0 instanceof defpackage.jwk
            if (r4 == 0) goto L53
            r4 = r0
            jwq r4 = (defpackage.jwq) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r6 = r0 instanceof defpackage.jwi
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = 1
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = 1
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof defpackage.jwi
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwq.cancel(boolean):boolean");
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = a;
        }
        if (!k.f(this, null, obj)) {
            return false;
        }
        k(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof jwi))) {
                return r(obj2);
            }
            jwp jwpVar = this.waiters;
            if (jwpVar != jwp.a) {
                jwp jwpVar2 = new jwp();
                do {
                    jwpVar2.a(jwpVar);
                    if (k.g(this, jwpVar, jwpVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                q(jwpVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof jwi))));
                        return r(obj);
                    }
                    jwpVar = this.waiters;
                } while (jwpVar != jwp.a);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return r(obj3);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof jwd;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        Object obj = this.value;
        boolean z2 = obj instanceof jwi;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return z & (!z2);
    }

    @Override // defpackage.jzv
    public final Throwable j() {
        if (this instanceof jwk) {
            Object obj = this.value;
            if (obj instanceof jwf) {
                return ((jwf) obj).b;
            }
            return null;
        }
        return null;
    }

    public final void m(Future future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(p());
        }
    }

    public final boolean n(Throwable th) {
        th.getClass();
        if (!k.f(this, null, new jwf(th))) {
            return false;
        }
        k(this, false);
        return true;
    }

    public final boolean o(jyz jyzVar) {
        jwf jwfVar;
        jyzVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (jyzVar.isDone()) {
                if (!k.f(this, null, i(jyzVar))) {
                    return false;
                }
                k(this, false);
                return true;
            }
            jwi jwiVar = new jwi(this, jyzVar);
            if (k.f(this, null, jwiVar)) {
                try {
                    jyzVar.c(jwiVar, jxv.a);
                } catch (Throwable th) {
                    try {
                        jwfVar = new jwf(th);
                    } catch (Error | Exception unused) {
                        jwfVar = jwf.a;
                    }
                    k.f(this, jwiVar, jwfVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof jwd) {
            jyzVar.cancel(((jwd) obj).c);
        }
        return false;
    }

    public final boolean p() {
        Object obj = this.value;
        if ((obj instanceof jwd) && ((jwd) obj).c) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            f(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof jwi))) {
                return r(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                jwp jwpVar = this.waiters;
                if (jwpVar != jwp.a) {
                    jwp jwpVar2 = new jwp();
                    do {
                        jwpVar2.a(jwpVar);
                        if (k.g(this, jwpVar, jwpVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof jwi))) {
                                        return r(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    q(jwpVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            q(jwpVar2);
                        } else {
                            jwpVar = this.waiters;
                        }
                    } while (jwpVar != jwp.a);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return r(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof jwi))) {
                    return r(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String jwqVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(a.an(jwqVar, str, " for "));
        }
        throw new InterruptedException();
    }

    protected void l() {
    }
}
