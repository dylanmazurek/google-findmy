package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lat implements Runnable {
    final /* synthetic */ lau a;
    private final int b;

    public lat(lau lauVar, int i) {
        this.a = lauVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
        } catch (InterruptedException unused) {
        }
        this.a.c(this.b);
    }
}
