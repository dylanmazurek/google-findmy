package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hgg implements hbg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hgg(hia hiaVar, hid hidVar, int i) {
        this.c = i;
        this.b = hiaVar;
        this.a = hidVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [hgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, hbg] */
    @Override // defpackage.hbg
    public final void a(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((hid) this.a).b.h(obj);
                    Object obj2 = this.b;
                    ((hia) obj2).post(new hep(obj2, 10));
                    return;
                }
                int i2 = hgp.s;
                this.a.a().run();
                hcc hccVar = (hcc) this.b;
                Runnable runnable = hccVar.d.p;
                hccVar.b.h(obj);
                return;
            }
            ((hbk) this.a).f = true;
            this.b.a(obj);
            return;
        }
        this.a.a().run();
        ((hcc) this.b).b.h(obj);
    }

    public /* synthetic */ hgg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
