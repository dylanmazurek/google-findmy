package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgg extends lzq {
    public final lzi a;
    private final lzx b;
    private final lyt c;
    private final Executor d;
    private final mbg e;
    private lys f;
    private lyv g;

    public mgg(lzx lzxVar, lyt lytVar, Executor executor, mbg mbgVar, lys lysVar) {
        this.b = lzxVar;
        this.c = lytVar;
        this.e = mbgVar;
        Executor executor2 = lysVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        lyq a = lys.a(lysVar);
        a.b = executor;
        this.f = new lys(a);
        this.a = lzi.b();
    }

    @Override // defpackage.lzq, defpackage.lyv
    public final void a(mjo mjoVar, mbc mbcVar) {
        new man(this.e, mbcVar, this.f, mgu.f);
        mrx a = this.b.a();
        mca mcaVar = (mca) a.b;
        if (mcaVar.f()) {
            mhb b = ((mhd) a.a).b(this.e);
            if (b != null) {
                this.f = this.f.d(mhb.a, b);
            }
            lyv a2 = this.c.a(this.e, this.f);
            this.g = a2;
            a2.a(mjoVar, mbcVar);
            return;
        }
        this.d.execute(new mgf(this, mjoVar, mfh.b(mcaVar)));
        this.g = mgu.g;
    }

    @Override // defpackage.lzq, defpackage.mbr
    protected final lyv b() {
        return this.g;
    }

    @Override // defpackage.mbr, defpackage.lyv
    public final void c(String str, Throwable th) {
        lyv lyvVar = this.g;
        if (lyvVar != null) {
            lyvVar.c(str, th);
        }
    }
}
