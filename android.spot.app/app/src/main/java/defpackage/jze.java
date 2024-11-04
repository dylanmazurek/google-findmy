package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jze implements Executor {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jze(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    try {
                        this.b.execute(runnable);
                        return;
                    } catch (RejectedExecutionException e) {
                        ((nmp) this.a).g(e);
                        return;
                    }
                }
                this.a.execute(new koq(this.b, runnable, 16));
                return;
            }
            try {
                this.a.execute(runnable);
                return;
            } catch (RejectedExecutionException e2) {
                ((jwq) this.b).n(e2);
                return;
            }
        }
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e3) {
            ((jwq) this.b).n(e3);
        }
    }

    public jze(jub jubVar, Executor executor, int i) {
        this.c = i;
        this.a = executor;
        this.b = jubVar;
    }

    public /* synthetic */ jze(kvt kvtVar, Executor executor, int i) {
        this.c = i;
        this.b = kvtVar;
        this.a = executor;
    }
}
