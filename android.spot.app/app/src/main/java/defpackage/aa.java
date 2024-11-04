package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aa implements qe {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [pl, an] */
    @Override // defpackage.qe
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            ag agVar = (ag) this.a;
            ?? r1 = agVar.B;
            if (r1 instanceof pl) {
                return r1.d();
            }
            return agVar.F().h;
        }
        return this.a;
    }
}
