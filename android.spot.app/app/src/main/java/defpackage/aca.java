package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aca extends mpe implements mol {
    final /* synthetic */ aeq a;
    final /* synthetic */ mol b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aca(aeq aeqVar, mol molVar, int i) {
        super(2);
        this.a = aeqVar;
        this.b = molVar;
        this.c = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = aev.a(this.c | 1);
        acb.a(this.a, this.b, (abi) obj, a);
        return mlh.a;
    }
}
