package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvd extends lyv {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public lyv c;
    final /* synthetic */ lyt d;
    final /* synthetic */ mbg e;
    final /* synthetic */ lys f;

    public kvd(lyt lytVar, mbg mbgVar, lys lysVar) {
        this.d = lytVar;
        this.e = mbgVar;
        this.f = lysVar;
        this.c = lytVar.a(mbgVar, lysVar);
    }

    @Override // defpackage.lyv
    public final void a(mjo mjoVar, mbc mbcVar) {
        synchronized (this.a) {
            mbc mbcVar2 = new mbc();
            mbcVar2.d(mbcVar);
            this.b.add(new hlt(this, mjoVar, mbcVar2, 16));
            b().a(new kvc(this, mjoVar), mbcVar);
        }
    }

    public final lyv b() {
        lyv lyvVar;
        synchronized (this.a) {
            lyvVar = this.c;
        }
        return lyvVar;
    }

    @Override // defpackage.lyv
    public final void c(String str, Throwable th) {
        synchronized (this.a) {
            this.b.add(new hlt(this, str, th, 15));
            b().c(str, th);
        }
    }

    @Override // defpackage.lyv
    public final void d() {
        synchronized (this.a) {
            this.b.add(new jxe(this, 12));
            b().d();
        }
    }

    @Override // defpackage.lyv
    public final void e(int i) {
        synchronized (this.a) {
            this.b.add(new bth(this, i, 5));
            b().e(i);
        }
    }

    @Override // defpackage.lyv
    public final void f(Object obj) {
        synchronized (this.a) {
            this.b.add(new koq(this, obj, 10));
            b().f(obj);
        }
    }
}
