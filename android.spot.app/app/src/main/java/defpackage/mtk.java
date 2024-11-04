package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mtk implements mtl {
    private final Future a;

    public mtk(Future future) {
        this.a = future;
    }

    @Override // defpackage.mtl
    public final void dc() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}
