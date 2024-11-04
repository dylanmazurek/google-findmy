package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mcp implements Runnable {
    final mco a;
    final /* synthetic */ String b;
    final /* synthetic */ mbc c;
    final /* synthetic */ mbg d;
    final /* synthetic */ mjt e;
    final /* synthetic */ lys f;
    final /* synthetic */ mcq g;

    public mcp(mcq mcqVar, String str, mbc mbcVar, mbg mbgVar, mjt mjtVar, lys lysVar) {
        this.b = str;
        this.c = mbcVar;
        this.d = mbgVar;
        this.e = mjtVar;
        this.f = lysVar;
        this.g = mcqVar;
        this.a = new mco(str, mcqVar.a, mcqVar.e, mbcVar, mcqVar, this, mcqVar.c, mcqVar.f, mbgVar, mjtVar, lysVar, mcqVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.c) {
            mcq mcqVar = this.g;
            if (mcqVar.j) {
                this.a.p.e(mcqVar.k, true, new mbc());
            } else if (mcqVar.l) {
                mco mcoVar = this.a;
                mcqVar.d.add(mcoVar);
                mcoVar.p.A.o = mcqVar.i;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
