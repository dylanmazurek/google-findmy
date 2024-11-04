package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jiy implements Map, Serializable, j$.util.Map {
    private static final long serialVersionUID = 912559;
    private transient jjr a;
    private transient jjr b;
    private transient jih c;

    public static jiu h(int i) {
        hwx.D(i, "expectedSize");
        return new jiu(i);
    }

    public static jiy i(Map map) {
        int i;
        if ((map instanceof jiy) && !(map instanceof SortedMap)) {
            jiy jiyVar = (jiy) map;
            jiyVar.c();
            return jiyVar;
        }
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        jiu jiuVar = new jiu(i);
        jiuVar.e(entrySet);
        return jiuVar.b();
    }

    public static jiy j(Object obj, Object obj2) {
        hwx.B(obj, obj2);
        return jmn.a(1, new Object[]{obj, obj2});
    }

    public static jiy k(Object obj, Object obj2, Object obj3, Object obj4) {
        hwx.B(obj, obj2);
        hwx.B(obj3, obj4);
        return jmn.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static jiy l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        hwx.B(obj, obj2);
        hwx.B(obj3, obj4);
        hwx.B(obj5, obj6);
        return jmn.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static jiy m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        hwx.B(obj, obj2);
        hwx.B(obj3, obj4);
        hwx.B(obj5, obj6);
        hwx.B(obj7, obj8);
        hwx.B(obj9, obj10);
        hwx.B(obj11, obj12);
        return jmn.a(6, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12});
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public jmw b() {
        throw null;
    }

    public abstract void c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract jih d();

    public abstract jjr e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return hzc.F(this, obj);
    }

    public abstract jjr f();

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final jih values() {
        jih jihVar = this.c;
        if (jihVar == null) {
            jih d = d();
            this.c = d;
            return d;
        }
        return jihVar;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return jql.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final jjr entrySet() {
        jjr jjrVar = this.a;
        if (jjrVar == null) {
            jjr e = e();
            this.a = e;
            return e;
        }
        return jjrVar;
    }

    @Override // java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final jjr keySet() {
        jjr jjrVar = this.b;
        if (jjrVar == null) {
            jjr f = f();
            this.b = f;
            return f;
        }
        return jjrVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        return hzc.D(this);
    }

    public Object writeReplace() {
        return new jix(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
