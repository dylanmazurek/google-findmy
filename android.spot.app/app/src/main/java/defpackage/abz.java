package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abz extends mpe implements mol {
    final /* synthetic */ aeq[] a;
    final /* synthetic */ mol b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abz(aeq[] aeqVarArr, mol molVar, int i) {
        super(2);
        this.a = aeqVarArr;
        this.b = molVar;
        this.c = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        aeq[] aeqVarArr = this.a;
        aeq[] aeqVarArr2 = (aeq[]) Arrays.copyOf(aeqVarArr, aeqVarArr.length);
        int a = aev.a(this.c | 1);
        acb.b(aeqVarArr2, this.b, (abi) obj, a);
        return mlh.a;
    }
}
