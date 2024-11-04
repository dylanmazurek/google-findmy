package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eqn implements cfo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eqn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object, haw] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.cfo
    public final void d(Object obj) {
        switch (this.c) {
            case 0:
                eqo eqoVar = (eqo) this.a;
                Object c = eqoVar.b.c();
                eqg eqgVar = (eqg) ((cfk) this.b).d();
                eqgVar.getClass();
                ((cfn) c).l(eqoVar.a((jer) obj, eqgVar));
                return;
            case 1:
                Boolean bool = (Boolean) ((cfk) this.b).d();
                eop eopVar = (eop) this.a;
                eopVar.a.l(eopVar.c(bool));
                return;
            case 2:
                eqo eqoVar2 = (eqo) this.a;
                Object c2 = eqoVar2.b.c();
                jer jerVar = (jer) ((cfk) this.b).d();
                jerVar.getClass();
                ((cfn) c2).l(eqoVar2.a(jerVar, (eqg) obj));
                return;
            case 3:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 4:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 5:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 6:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 7:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 8:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 9:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 10:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 11:
                ((exa) this.a).b((ewz) this.b);
                return;
            case 12:
                jer jerVar2 = (jer) obj;
                ijs.c();
                boolean g = jerVar2.g();
                Object obj2 = this.b;
                Object obj3 = this.a;
                if (g) {
                    ((hac) obj3).b.put(obj2, (gzo) jerVar2.c());
                } else {
                    ((hac) obj3).b.remove(obj2);
                }
                ((hac) obj3).b();
                return;
            case 13:
                jer jerVar3 = (jer) obj;
                Object obj4 = this.b;
                Object obj5 = this.a;
                if (obj4 != null && jerVar3.g()) {
                    hdx hdxVar = (hdx) jerVar3.c();
                    ier a = hdl.a();
                    a.a = jer.i(new hdf(hdxVar.b(), hdxVar.a()));
                    a.c(true);
                    ((hdj) obj5).k(jer.i(a.b()));
                    return;
                }
                ((hdj) obj5).k(jdl.a);
                return;
            case 14:
                jis jisVar = (jis) obj;
                jisVar.getClass();
                hcy hcyVar = (hcy) this.a;
                hcyVar.a = jisVar;
                hcyVar.c(this.b.a());
                return;
            default:
                jin jinVar = new jin();
                lyn lynVar = (lyn) this.a;
                jinVar.j(lynVar.a);
                jinVar.j((jis) obj);
                jinVar.j(lynVar.b);
                ((cfn) this.b).l(jinVar.g());
                return;
        }
    }
}
