package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jia extends jic implements Map.Entry {
    protected abstract Map.Entry a();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    @Override // defpackage.jic
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return a().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return a().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        return a().setValue(obj);
    }
}
