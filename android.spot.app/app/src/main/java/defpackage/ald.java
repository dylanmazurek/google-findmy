package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ald extends mpe implements mol {
    final /* synthetic */ alf a;
    final /* synthetic */ Object b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ald(alf alfVar, Object obj, int i) {
        super(2);
        this.a = alfVar;
        this.b = obj;
        this.c = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = aev.a(this.c) | 1;
        this.a.c(this.b, (abi) obj, a);
        return mlh.a;
    }
}
