package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dth implements Executor {
    private final /* synthetic */ int a;

    public dth(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                runnable.run();
                return;
            } else {
                dtq.h(runnable);
                return;
            }
        }
        runnable.run();
    }
}
