package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cys extends FutureTask {
    final /* synthetic */ cyt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cys(cyt cytVar, Callable callable) {
        super(callable);
        this.a = cytVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((cyr) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new cyr(e));
        }
    }
}
