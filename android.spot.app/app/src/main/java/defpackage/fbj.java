package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbj extends ThreadPoolExecutor {
    final /* synthetic */ fbm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbj(fbm fbmVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.a = fbmVar;
        setThreadFactory(new fbk());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new fbi(this, runnable, obj);
    }
}
