package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvc extends mbs {
    final /* synthetic */ kvd a;
    private mbc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvc(kvd kvdVar, mjo mjoVar) {
        super(mjoVar);
        this.a = kvdVar;
    }

    @Override // defpackage.mbs, defpackage.mjo
    public final void S(mbc mbcVar) {
        this.b = mbcVar;
    }

    @Override // defpackage.mjo
    public final void a(mca mcaVar, mbc mbcVar) {
        mbx mbxVar = mcaVar.l;
        if (!mbxVar.equals(mbx.UNAUTHENTICATED) && !mbxVar.equals(mbx.PERMISSION_DENIED)) {
            mbc mbcVar2 = this.b;
            if (mbcVar2 != null) {
                this.f.S(mbcVar2);
                this.b = null;
            }
            this.f.a(mcaVar, mbcVar);
            return;
        }
        kvd kvdVar = this.a;
        synchronized (kvdVar.a) {
            kvdVar.c = kvdVar.d.a(kvdVar.e, kvdVar.f.d(ktu.a, true));
            Iterator it = kvdVar.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.mbs, defpackage.mjo
    public final void f(Object obj) {
        mbc mbcVar = this.b;
        if (mbcVar != null) {
            this.f.S(mbcVar);
            this.b = null;
        }
        this.f.f(obj);
    }
}
