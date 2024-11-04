package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dku implements Runnable {
    final /* synthetic */ dkx a;
    private final dso b;
    private final /* synthetic */ int c;

    public dku(dkx dkxVar, dso dsoVar, int i) {
        this.c = i;
        this.a = dkxVar;
        this.b = dsoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dkc dkcVar;
        if (this.c != 0) {
            synchronized (this.b.a()) {
                synchronized (this.a) {
                    if (this.a.a.d(this.b)) {
                        dkx dkxVar = this.a;
                        try {
                            this.b.d(dkxVar.f);
                        } finally {
                        }
                    }
                    this.a.b();
                }
            }
            return;
        }
        synchronized (this.b.a()) {
            synchronized (this.a) {
                if (this.a.a.d(this.b)) {
                    this.a.h.d();
                    dkx dkxVar2 = this.a;
                    try {
                        this.b.g(dkxVar2.h, dkxVar2.j);
                        this.a.h(this.b);
                    } finally {
                    }
                }
                this.a.b();
            }
        }
    }
}
