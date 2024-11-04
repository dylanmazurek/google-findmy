package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ifw implements ifa {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ifw(emk emkVar, ibh ibhVar, lqd lqdVar, int i) {
        this.d = i;
        this.c = emkVar;
        this.a = ibhVar;
        this.b = lqdVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ibh] */
    @Override // defpackage.ifa, java.lang.AutoCloseable
    public final void close() {
        if (this.d != 0) {
            this.a.close();
            ((emk) this.c).f((lqd) this.b);
        } else {
            Object obj = this.c;
            Object obj2 = this.b;
            Object obj3 = this.a;
            synchronized (((igh) obj3).c) {
                ((igh) obj3).e.u(obj2, obj);
            }
        }
    }

    public /* synthetic */ ifw(igh ighVar, String str, njz njzVar, int i) {
        this.d = i;
        this.a = ighVar;
        this.b = str;
        this.c = njzVar;
    }
}
