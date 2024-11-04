package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jir extends jis {
    final transient int a;
    final transient int b;
    final /* synthetic */ jis c;

    public jir(jis jisVar, int i, int i2) {
        this.c = jisVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.jih
    public final int b() {
        return this.c.c() + this.a + this.b;
    }

    @Override // defpackage.jih
    public final int c() {
        return this.c.c() + this.a;
    }

    @Override // defpackage.jih
    public final boolean f() {
        return true;
    }

    @Override // defpackage.jih
    public final Object[] g() {
        return this.c.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        hwx.Z(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.jis
    /* renamed from: i */
    public final jis subList(int i, int i2) {
        hwx.T(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.jis, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.jis, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
