package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbx extends nbv {
    public final Runnable a;

    public nbx(Runnable runnable, long j, nbw nbwVar) {
        super(j, nbwVar);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        return "Task[" + msz.a(runnable) + "@" + msz.b(runnable) + ", " + this.g + ", " + this.h + "]";
    }
}
