package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nbu extends mtv {
    private final String a;
    private final nbr b;

    public nbu(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new nbr(i, i2, j, str);
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        nbr.e(this.b, runnable, false, 6);
    }

    public void close() {
        this.b.close();
    }

    public final void e(Runnable runnable, nbw nbwVar, boolean z) {
        this.b.d(runnable, nbwVar, z);
    }

    @Override // defpackage.mst
    public final void f(mnb mnbVar, Runnable runnable) {
        nbr.e(this.b, runnable, true, 2);
    }
}
