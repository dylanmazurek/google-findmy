package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjv extends jis {
    final /* synthetic */ jjw a;

    public jjv(jjw jjwVar) {
        this.a = jjwVar;
    }

    @Override // defpackage.jih
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.h(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.jis, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
