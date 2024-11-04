package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmj extends jis {
    final /* synthetic */ jmk a;

    public jmj(jmk jmkVar) {
        this.a = jmkVar;
    }

    @Override // defpackage.jih
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        hwx.Z(i, this.a.b);
        Object[] objArr = this.a.a;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b;
    }

    @Override // defpackage.jis, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
