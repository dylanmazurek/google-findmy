package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mej extends mjo {
    public volatile boolean a;
    public List b;
    public final mjo c;

    public mej(mjo mjoVar) {
        super(null);
        this.b = new ArrayList();
        this.c = mjoVar;
    }

    private final void i(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.b.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.mjo
    public final void S(mbc mbcVar) {
        if (this.a) {
            this.c.S(mbcVar);
        } else {
            i(new kvz(this, mbcVar, 5, null));
        }
    }

    @Override // defpackage.mjo
    public final void a(mca mcaVar, mbc mbcVar) {
        i(new kvo((Object) this, (Object) mcaVar, (Object) mbcVar, 4));
    }

    @Override // defpackage.mjo
    public final void f(Object obj) {
        if (this.a) {
            this.c.f(obj);
        } else {
            i(new kvz(this, obj, 6));
        }
    }

    @Override // defpackage.mjo
    public final void g() {
        if (this.a) {
            this.c.g();
        } else {
            i(new meg(this, 2));
        }
    }
}
