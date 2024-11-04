package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ale extends mpe implements mol {
    final /* synthetic */ alf a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(alf alfVar, Object obj, Object obj2, int i) {
        super(2);
        this.a = alfVar;
        this.b = obj;
        this.c = obj2;
        this.d = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = aev.a(this.d) | 1;
        this.a.d(this.b, this.c, (abi) obj, a);
        return mlh.a;
    }
}
