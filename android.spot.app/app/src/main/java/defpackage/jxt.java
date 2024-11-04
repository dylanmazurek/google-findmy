package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jxt extends jyx {
    private final Executor a;
    final /* synthetic */ jxu b;

    public jxt(jxu jxuVar, Executor executor) {
        this.b = jxuVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.jyx
    public final void d(Throwable th) {
        this.b.b = null;
        if (th instanceof ExecutionException) {
            this.b.n(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.n(th);
        }
    }

    @Override // defpackage.jyx
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.n(e);
        }
    }

    @Override // defpackage.jyx
    public final boolean g() {
        return this.b.isDone();
    }
}
