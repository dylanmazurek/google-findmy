package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbk implements Runnable {
    final /* synthetic */ jbf a;
    final /* synthetic */ Runnable b;

    public jbk(jbf jbfVar, Runnable runnable) {
        this.a = jbfVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [jbe, jbf] */
    @Override // java.lang.Runnable
    public final void run() {
        jbe e = jbu.e(jbu.f(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
