package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class blz {
    static final blz a = new blz(null, null);
    final Runnable b;
    final Executor c;
    blz next;

    public blz(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
