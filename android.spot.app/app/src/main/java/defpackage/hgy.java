package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hgy implements ThreadFactory {
    private final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
            }
            return new btr(runnable);
        }
        return new Thread(runnable);
    }
}
