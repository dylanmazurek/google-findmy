package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class men implements mds {
    public final mds a;
    public volatile boolean b;
    public List c = new ArrayList();

    public men(mds mdsVar) {
        this.a = mdsVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.mds
    public final void a(mca mcaVar, mdr mdrVar, mbc mbcVar) {
        b(new bxi(this, mcaVar, mdrVar, mbcVar, 8));
    }

    @Override // defpackage.mds
    public final void c(mbc mbcVar) {
        b(new kvz(this, mbcVar, 13, null));
    }

    @Override // defpackage.mjv
    public final void d() {
        if (this.b) {
            this.a.d();
        } else {
            b(new meg(this, 11));
        }
    }

    @Override // defpackage.mjv
    public final void e(lrs lrsVar) {
        if (this.b) {
            this.a.e(lrsVar);
        } else {
            b(new kvz(this, lrsVar, 12));
        }
    }
}
