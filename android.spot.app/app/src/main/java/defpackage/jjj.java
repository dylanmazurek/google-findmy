package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjj extends jih {
    private static final long serialVersionUID = 0;
    final jjm a;

    public jjj(jjm jjmVar) {
        this.a = jjmVar;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.s(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return new jjh(this.a);
    }

    @Override // defpackage.jih
    public final boolean f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
