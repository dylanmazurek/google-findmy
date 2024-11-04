package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mlm extends mln implements RandomAccess {
    private final mln a;
    private final int b;
    private final int c;

    public mlm(mln mlnVar, int i, int i2) {
        this.a = mlnVar;
        this.b = i;
        a.v(i, i2, mlnVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.mln, java.util.List
    public final Object get(int i) {
        a.t(i, this.c);
        return this.a.get(this.b + i);
    }
}
