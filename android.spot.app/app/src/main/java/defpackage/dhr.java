package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhr extends mpe implements mol {
    final /* synthetic */ dhb a;
    final /* synthetic */ aox b;
    final /* synthetic */ aon c;
    final /* synthetic */ avo d;
    final /* synthetic */ int e;
    final /* synthetic */ dgq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhr(dhb dhbVar, dgq dgqVar, aox aoxVar, aon aonVar, avo avoVar, int i) {
        super(2);
        this.a = dhbVar;
        this.f = dgqVar;
        this.b = aoxVar;
        this.c = aonVar;
        this.d = avoVar;
        this.e = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dhu.b(this.a, this.f, this.b, this.c, this.d, (abi) obj, aev.a(this.e | 1));
        return mlh.a;
    }
}
