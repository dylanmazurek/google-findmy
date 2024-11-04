package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ibx implements jxm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ibx(emz emzVar, kyf kyfVar, lqc lqcVar, int i) {
        this.d = i;
        this.c = emzVar;
        this.a = kyfVar;
        this.b = lqcVar;
    }

    @Override // defpackage.jxm
    public final Object a(jck jckVar, Object obj) {
        if (this.d != 0) {
            hot hotVar = (hot) obj;
            final kyf kyfVar = (kyf) this.a;
            kxv kxvVar = kyfVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            Object obj2 = this.c;
            Object obj3 = this.b;
            final lqc lqcVar = (lqc) obj3;
            final emz emzVar = (emz) obj2;
            ibh c = emzVar.l.c(kxvVar.a, hotVar, new icj() { // from class: emy
                @Override // defpackage.icj
                public final void a(ick ickVar) {
                    lqd lqdVar = lqcVar.d;
                    if (lqdVar == null) {
                        lqdVar = lqd.d;
                    }
                    emz emzVar2 = emz.this;
                    emzVar2.m.b(kyfVar, lqdVar, ickVar);
                }
            });
            c.a();
            jckVar.e(new ibc(c, 1), emzVar.d);
            return null;
        }
        ift iftVar = (ift) this.b;
        iftVar.c.g();
        jer jerVar = iftVar.c;
        Object obj4 = this.c;
        ibv ibvVar = (ibv) obj4;
        ihz a = ihz.a((String) jerVar.c(), ibvVar.a);
        Object obj5 = this.a;
        ici iciVar = (ici) obj5;
        iciVar.e.add(a);
        jckVar.e(new icc(obj5, a, 0), iciVar.c);
        return new ibu((idt) obj, ibvVar.a);
    }

    public /* synthetic */ ibx(ici iciVar, ift iftVar, ibv ibvVar, int i) {
        this.d = i;
        this.a = iciVar;
        this.b = iftVar;
        this.c = ibvVar;
    }
}
