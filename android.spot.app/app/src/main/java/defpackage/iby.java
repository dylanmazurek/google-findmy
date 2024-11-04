package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iby implements jxm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iby(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jxm] */
    @Override // defpackage.jxm
    public final Object a(jck jckVar, Object obj) {
        int i = this.c;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                ?? r0 = this.a;
                int i3 = jbn.a;
                jckVar.getClass();
                jbe e = jbu.e(jbu.f(), r0);
                try {
                    return this.b.a(jckVar, obj);
                } finally {
                }
            } else {
                hot hotVar = (hot) obj;
                lqd lqdVar = ((lqc) this.b).d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                ((emz) this.a).m.a(lqdVar);
                return hotVar;
            }
        } else {
            idt idtVar = (idt) obj;
            Object obj2 = this.b;
            Object obj3 = this.a;
            ici iciVar = (ici) obj3;
            iciVar.e.add(obj2);
            jckVar.e(new icc(obj3, obj2, i2), iciVar.c);
            return idtVar;
        }
    }
}
