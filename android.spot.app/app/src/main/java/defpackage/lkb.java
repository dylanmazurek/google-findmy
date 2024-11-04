package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkb implements Map.Entry {
    public final Map.Entry a;

    public lkb(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((lkd) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof lkq) {
            lkd lkdVar = (lkd) this.a.getValue();
            lkq lkqVar = lkdVar.a;
            lkdVar.b = null;
            lkdVar.a = (lkq) obj;
            return lkqVar;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
