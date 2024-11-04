package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jwg {
    static final jwg a = new jwg();
    final Runnable b;
    final Executor c;
    jwg next;

    public jwg() {
        this.b = null;
        this.c = null;
    }

    public jwg(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
