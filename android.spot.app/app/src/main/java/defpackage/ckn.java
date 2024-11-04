package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ckn extends RuntimeException {
    public final Throwable a;
    public final int b;

    public ckn(int i, Throwable th) {
        super(th);
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
