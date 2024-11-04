package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcd implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public mcd(mcf mcfVar, mce mceVar, Runnable runnable, int i) {
        this.d = i;
        this.a = mceVar;
        this.b = runnable;
        this.c = mcfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            if (((jbv) ((mpn) this.b).a) == null) {
                ?? r0 = this.a;
                ?? r1 = this.c;
                jbe e = jbu.e(jbu.f(), r0);
                try {
                    r1.run();
                } finally {
                }
            } else {
                throw null;
            }
        } else {
            ((mcf) this.c).execute(this.a);
        }
    }

    public final String toString() {
        if (this.d != 0) {
            return "propagating=[" + this.c + "]";
        }
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }

    public mcd(mpn mpnVar, jbe jbeVar, Runnable runnable, int i) {
        this.d = i;
        this.b = mpnVar;
        this.a = jbeVar;
        this.c = runnable;
    }
}
