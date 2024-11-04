package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxp {
    public static final jyy a = new jyy(jxp.class);
    public final AtomicReference b;
    public final jxk c;
    public final jys d;

    public jxp(jyz jyzVar) {
        this(jyzVar, new jxk());
    }

    public static void d(AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new jxe(autoCloseable, 0));
            } catch (RejectedExecutionException e) {
                jyy jyyVar = a;
                if (jyyVar.a().isLoggable(Level.WARNING)) {
                    jyyVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                d(autoCloseable, jxv.a);
            }
        }
    }

    public final void a(jxk jxkVar) {
        b(jxn.OPEN, jxn.SUBSUMED);
        jxkVar.a(this.c, jxv.a);
    }

    public final void b(jxn jxnVar, jxn jxnVar2) {
        hwx.Y(e(jxnVar, jxnVar2), "Expected state to be %s, but it was %s", jxnVar, jxnVar2);
    }

    public final void c() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", this);
        this.c.close();
    }

    public final boolean e(jxn jxnVar, jxn jxnVar2) {
        return a.o(this.b, jxnVar, jxnVar2);
    }

    public final jxp f(jys jysVar) {
        jxp jxpVar = new jxp(jysVar);
        a(jxpVar.c);
        return jxpVar;
    }

    protected final void finalize() {
        if (((jxn) this.b.get()).equals(jxn.OPEN)) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            g();
        }
    }

    public final jys g() {
        if (e(jxn.OPEN, jxn.WILL_CLOSE)) {
            a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            this.d.c(new jxe(this, 2, null), jxv.a);
        } else {
            int ordinal = ((jxn) this.b.get()).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        if (ordinal == 5) {
                            throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                        }
                    } else {
                        throw new IllegalStateException("Cannot call finishToFuture() twice");
                    }
                } else {
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                }
            } else {
                throw new AssertionError();
            }
        }
        return this.d;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("state", this.b.get());
        q.a(this.d);
        return q.toString();
    }

    public jxp(jyz jyzVar, jxk jxkVar) {
        this.b = new AtomicReference(jxn.OPEN);
        this.d = jys.q(jyzVar);
        this.c = jxkVar;
    }
}
