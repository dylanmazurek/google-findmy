package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class erx extends mpe implements mol {
    final /* synthetic */ aox a;
    final /* synthetic */ wi b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erx(aox aoxVar, wi wiVar, float f, float f2, int i) {
        super(2);
        this.a = aoxVar;
        this.b = wiVar;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ery.a(this.a, this.b, this.c, this.d, (abi) obj, aev.a(this.e | 1));
        return mlh.a;
    }
}
