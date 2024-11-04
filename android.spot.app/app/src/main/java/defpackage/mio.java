package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mio implements mit {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mio(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [lzb, java.lang.Object] */
    @Override // defpackage.mit
    public final void a(mja mjaVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                mjaVar.a.k((lzm) this.a);
                return;
            } else {
                mjaVar.a.u(this.a);
                return;
            }
        }
        mjaVar.a.j((lzj) this.a);
    }
}
