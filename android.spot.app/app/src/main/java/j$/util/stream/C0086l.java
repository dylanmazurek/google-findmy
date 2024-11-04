package j$.util.stream;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0086l extends AbstractMap implements Map {
    final Object a;
    final Object b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0086l(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C0084k(this);
    }
}
