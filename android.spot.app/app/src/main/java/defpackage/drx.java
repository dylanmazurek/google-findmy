package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drx implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public drx(Object obj, boolean z, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (this.a) {
                    met metVar = ((meq) this.b).a;
                    metVar.o = true;
                    if (metVar.l > 0) {
                        jfd jfdVar = metVar.n;
                        jfdVar.c();
                        jfdVar.d();
                    }
                }
                ((meq) this.b).a.q = false;
                return;
            }
            dtq.g();
            boolean z = this.a;
            drv drvVar = ((dru) this.b).a;
            boolean z2 = drvVar.a;
            drvVar.a = z;
            if (z2 != z) {
                drvVar.b.a(z);
                return;
            }
            return;
        }
        ((dry) this.b).c.a(this.a);
    }
}
