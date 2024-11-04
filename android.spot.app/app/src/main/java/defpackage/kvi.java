package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvi extends lyv {
    public mjo d;
    private final jyz e;
    private final Executor f = new jzl(jxv.a);
    public final Queue a = new ArrayDeque();
    public lyv b = null;
    public boolean c = false;

    public kvi(jyz jyzVar) {
        this.e = jyzVar;
    }

    private final void b(Runnable runnable) {
        this.f.execute(jbn.f(new koq(this, runnable, 11)));
    }

    @Override // defpackage.lyv
    public final void a(mjo mjoVar, mbc mbcVar) {
        this.d = mjoVar;
        iuu.q(this.e, new elj(this, mjoVar, 5), this.f);
        b(new hlt(this, mjoVar, mbcVar, 18));
    }

    @Override // defpackage.lyv
    public final void c(String str, Throwable th) {
        b(new hlt(this, str, th, 17));
    }

    @Override // defpackage.lyv
    public final void d() {
        b(new jxe(this, 13));
    }

    @Override // defpackage.lyv
    public final void e(int i) {
        b(new bth(this, i, 6));
    }

    @Override // defpackage.lyv
    public final void f(Object obj) {
        b(new koq(this, obj, 12));
    }

    public final String toString() {
        return super.toString() + "delegate=[" + String.valueOf(this.b) + "]";
    }
}
