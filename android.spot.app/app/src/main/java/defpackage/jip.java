package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jip extends jis {
    private final transient jis a;

    public jip(jis jisVar) {
        this.a = jisVar;
    }

    private final int x(int i) {
        return (size() - 1) - i;
    }

    private final int y(int i) {
        return size() - i;
    }

    @Override // defpackage.jis, defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.jih
    public final boolean f() {
        return this.a.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        hwx.Z(i, size());
        return this.a.get(x(i));
    }

    @Override // defpackage.jis
    public final jis h() {
        return this.a;
    }

    @Override // defpackage.jis
    /* renamed from: i */
    public final jis subList(int i, int i2) {
        hwx.T(i, i2, size());
        return this.a.subList(y(i2), y(i)).h();
    }

    @Override // defpackage.jis, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return x(lastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.jis, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return x(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
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
