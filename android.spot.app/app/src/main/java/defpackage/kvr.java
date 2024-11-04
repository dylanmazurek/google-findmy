package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvr implements Executor {
    private volatile Executor a;

    public kvr(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = jxv.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
