package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jhz extends jic implements Map {
    protected abstract Map a();

    @Override // java.util.Map
    public final void clear() {
        a().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return a().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this && !a().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jic
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return a().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return a().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return a().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        a().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return a().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return a().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return a().values();
    }
}
