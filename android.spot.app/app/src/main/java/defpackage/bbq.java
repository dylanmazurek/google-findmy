package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbq extends mpe implements mol {
    final /* synthetic */ baw a;
    final /* synthetic */ mol b;
    final /* synthetic */ qz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbq(baw bawVar, qz qzVar, mol molVar) {
        super(2);
        this.a = bawVar;
        this.c = qzVar;
        this.b = molVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        abi abiVar = (abi) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && abiVar.G()) {
            abiVar.r();
        } else {
            bcg.b(this.a, this.c, this.b, abiVar, 0);
        }
        return mlh.a;
    }
}
