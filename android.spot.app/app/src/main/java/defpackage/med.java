package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class med implements Runnable {
    private final lzi a;

    /* JADX INFO: Access modifiers changed from: protected */
    public med(lzi lziVar) {
        this.a = lziVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        lzi a = this.a.a();
        try {
            a();
        } finally {
            this.a.c(a);
        }
    }
}
