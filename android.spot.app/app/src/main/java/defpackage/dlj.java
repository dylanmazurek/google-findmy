package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlj implements djd {
    final /* synthetic */ dlk a;
    final /* synthetic */ bso b;

    public dlj(dlk dlkVar, bso bsoVar) {
        this.b = bsoVar;
        this.a = dlkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, dir] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, dje] */
    @Override // defpackage.djd
    public final void b(Object obj) {
        if (this.a.e(this.b)) {
            dlk dlkVar = this.a;
            bso bsoVar = this.b;
            dkp dkpVar = dlkVar.a.o;
            if (obj != null && dkpVar.c(bsoVar.c.g())) {
                dlkVar.c = obj;
                ((dkj) dlkVar.b).e(2);
            } else {
                dkf dkfVar = dlkVar.b;
                ?? r3 = bsoVar.a;
                ?? r4 = bsoVar.c;
                dkfVar.d(r3, obj, r4, r4.g(), dlkVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, dje] */
    @Override // defpackage.djd
    public final void e(Exception exc) {
        if (this.a.e(this.b)) {
            dlk dlkVar = this.a;
            bso bsoVar = this.b;
            dke dkeVar = dlkVar.d;
            ?? r1 = bsoVar.c;
            dlkVar.b.b(dkeVar, exc, r1, r1.g());
        }
    }
}
