package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjd extends jmw {
    final jmw a;
    final /* synthetic */ jjg b;

    public jjd(jjg jjgVar) {
        this.b = jjgVar;
        this.a = jjgVar.a.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
