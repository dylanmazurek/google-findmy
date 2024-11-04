package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkq implements dtt {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dkq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [buf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [buf, java.lang.Object] */
    @Override // defpackage.dtt
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            kvu kvuVar = (kvu) this.a;
            return new dkj((dks) kvuVar.c, kvuVar.a);
        }
        dkr dkrVar = (dkr) this.a;
        Object obj = dkrVar.a;
        Object obj2 = dkrVar.b;
        Object obj3 = dkrVar.c;
        Object obj4 = dkrVar.e;
        dkt dktVar = (dkt) obj4;
        dmm dmmVar = (dmm) obj3;
        dmm dmmVar2 = (dmm) obj2;
        return new dkx((dmm) obj, dmmVar2, dmmVar, dktVar, (dkt) dkrVar.f, dkrVar.d);
    }
}
