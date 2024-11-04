package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czn implements czr, cyz {
    public final czw a;
    public dcn b;
    private final cym c;

    public czn(cym cymVar, dcu dcuVar, dcm dcmVar) {
        this.c = cymVar;
        czw a = dcmVar.a.a();
        this.a = a;
        dcuVar.i(a);
        a.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.czr
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.cyz
    public final String g() {
        throw null;
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
    }
}
