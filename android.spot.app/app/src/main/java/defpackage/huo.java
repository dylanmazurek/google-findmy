package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class huo implements hup {
    private final /* synthetic */ int a;

    public huo(int i) {
        this.a = i;
    }

    @Override // defpackage.hup
    public final /* synthetic */ String a(lkp lkpVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return ((nee) ((ljj) lkpVar).b).b;
            }
            return ((nfe) ((ljh) lkpVar).b).d;
        }
        return ((ndg) ((ljh) lkpVar).b).e;
    }

    @Override // defpackage.hup
    public final /* synthetic */ String b(lkp lkpVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return ((nee) ((ljj) lkpVar).b).d;
            }
            return ((nfe) ((ljh) lkpVar).b).c;
        }
        return ((ndg) ((ljh) lkpVar).b).d;
    }

    @Override // defpackage.hup
    public final /* synthetic */ void c(lkp lkpVar, Long l) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ljj ljjVar = (ljj) lkpVar;
                if (l == null) {
                    if (!ljjVar.b.y()) {
                        ljjVar.t();
                    }
                    nee neeVar = (nee) ljjVar.b;
                    nee neeVar2 = nee.e;
                    neeVar.a &= -3;
                    neeVar.c = 0L;
                    return;
                }
                long longValue = l.longValue();
                if (!ljjVar.b.y()) {
                    ljjVar.t();
                }
                nee neeVar3 = (nee) ljjVar.b;
                nee neeVar4 = nee.e;
                neeVar3.a |= 2;
                neeVar3.c = longValue;
                return;
            }
            if (l != null) {
                long longValue2 = l.longValue();
                ljh ljhVar = (ljh) lkpVar;
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                nfe nfeVar = (nfe) ljhVar.b;
                nfe nfeVar2 = nfe.v;
                nfeVar.a |= 1;
                nfeVar.b = longValue2;
                return;
            }
            ljh ljhVar2 = (ljh) lkpVar;
            if (!ljhVar2.b.y()) {
                ljhVar2.t();
            }
            nfe nfeVar3 = (nfe) ljhVar2.b;
            nfe nfeVar4 = nfe.v;
            nfeVar3.a &= -2;
            nfeVar3.b = 0L;
            return;
        }
        if (l != null) {
            long longValue3 = l.longValue();
            ljh ljhVar3 = (ljh) lkpVar;
            if (!ljhVar3.b.y()) {
                ljhVar3.t();
            }
            ndg ndgVar = (ndg) ljhVar3.b;
            ndg ndgVar2 = ndg.l;
            ndgVar.a |= 2;
            ndgVar.c = longValue3;
            return;
        }
        ljh ljhVar4 = (ljh) lkpVar;
        if (!ljhVar4.b.y()) {
            ljhVar4.t();
        }
        ndg ndgVar3 = (ndg) ljhVar4.b;
        ndg ndgVar4 = ndg.l;
        ndgVar3.a &= -3;
        ndgVar3.c = 0L;
    }

    @Override // defpackage.hup
    public final /* synthetic */ void d(lkp lkpVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ljj ljjVar = (ljj) lkpVar;
                if (!ljjVar.b.y()) {
                    ljjVar.t();
                }
                nee neeVar = (nee) ljjVar.b;
                nee neeVar2 = nee.e;
                neeVar.a &= -5;
                neeVar.d = nee.e.d;
                return;
            }
            ljh ljhVar = (ljh) lkpVar;
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            nfe nfeVar = (nfe) ljhVar.b;
            nfe nfeVar2 = nfe.v;
            nfeVar.a &= -3;
            nfeVar.c = nfe.v.c;
            return;
        }
        ljh ljhVar2 = (ljh) lkpVar;
        if (!ljhVar2.b.y()) {
            ljhVar2.t();
        }
        ndg ndgVar = (ndg) ljhVar2.b;
        ndg ndgVar2 = ndg.l;
        ndgVar.a &= -5;
        ndgVar.d = ndg.l.d;
    }
}
