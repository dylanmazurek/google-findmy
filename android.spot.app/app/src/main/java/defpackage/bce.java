package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bce extends mpe implements mol {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bce(Object obj, int i, int i2) {
        super(2);
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, aox] */
    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((Number) obj2).intValue();
                            fma.bS(this.b, (abi) obj, aev.a(this.a | 1));
                            return mlh.a;
                        }
                        ((Number) obj2).intValue();
                        int i2 = this.a;
                        ert.d((wi) this.b, (abi) obj, aev.a(i2 | 1));
                        return mlh.a;
                    }
                    ((Number) obj2).intValue();
                    int i3 = this.a;
                    ert.b(this.b, (abi) obj, aev.a(i3 | 1));
                    return mlh.a;
                }
                ((Number) obj2).intValue();
                int i4 = this.a;
                ert.a((equ) this.b, (abi) obj, aev.a(i4 | 1));
                return mlh.a;
            }
            ((Number) obj2).intValue();
            xt.a(this.b, (abi) obj, aev.a(this.a | 1));
            return mlh.a;
        }
        ((Number) obj2).intValue();
        ((ComposeView) this.b).a((abi) obj, aev.a(this.a | 1));
        return mlh.a;
    }
}
