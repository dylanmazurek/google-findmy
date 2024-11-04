package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nau implements Runnable {
    final /* synthetic */ nav a;
    private Runnable b;

    public nau(nav navVar, Runnable runnable) {
        this.a = navVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        do {
            try {
                this.b.run();
            } catch (Throwable th) {
                msz.r(mnc.a, th);
            }
            Runnable e = this.a.e();
            if (e == null) {
                return;
            }
            this.b = e;
            i++;
        } while (i < 16);
        nav navVar = this.a;
        navVar.a.a(navVar, this);
    }
}
