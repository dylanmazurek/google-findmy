package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyl implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public jyl(jyz jyzVar, Future future, int i) {
        this.c = i;
        this.a = jyzVar;
        this.b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ivc.O(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public jyl(jxc jxcVar, Executor executor, int i) {
        this.c = i;
        this.a = jxcVar;
        executor.getClass();
        this.b = executor;
    }
}
