package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jzh extends jwl implements Runnable {
    private final Runnable a;

    public jzh(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            n(th);
            throw th;
        }
    }
}
