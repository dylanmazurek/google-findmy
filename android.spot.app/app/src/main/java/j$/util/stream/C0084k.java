package j$.util.stream;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0084k extends AbstractSet {
    final /* synthetic */ C0086l a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0084k(C0086l c0086l) {
        this.a = c0086l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Boolean bool = Boolean.FALSE;
        C0086l c0086l = this.a;
        return j$.desugar.sun.nio.fs.g.b(new Object[]{new AbstractMap.SimpleImmutableEntry(bool, c0086l.b), new AbstractMap.SimpleImmutableEntry(Boolean.TRUE, c0086l.a)}).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 2;
    }
}
