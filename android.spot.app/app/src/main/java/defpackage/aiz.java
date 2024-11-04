package defpackage;

import j$.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiz extends mln implements List, aja {
    private final aja a;
    private final int b;
    private final int c;
    private final int d;

    public aiz(aja ajaVar, int i, int i2) {
        this.a = ajaVar;
        this.b = i;
        this.c = i2;
        a.v(i, i2, ajaVar.size());
        this.d = i2 - i;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.d;
    }

    @Override // defpackage.mln, java.util.List
    public final Object get(int i) {
        a.t(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.mln, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        a.v(i, i2, this.d);
        aja ajaVar = this.a;
        int i3 = this.b;
        return new aiz(ajaVar, i + i3, i3 + i2);
    }
}
