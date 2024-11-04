package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajy extends mlr implements Map, j$.util.Map, mps {
    public akz a = new akz();
    public akn b;
    public Object c;
    public int d;
    public int e;
    private ajw f;

    public ajy(ajw ajwVar) {
        this.f = ajwVar;
        ajw ajwVar2 = this.f;
        this.b = ajwVar2.b;
        this.e = ajwVar2.d();
    }

    @Override // defpackage.mlr
    public final int a() {
        return this.e;
    }

    public ajw b() {
        akn aknVar = this.b;
        ajw ajwVar = this.f;
        if (aknVar != ajwVar.b) {
            this.a = new akz();
            ajwVar = new ajw(aknVar, a());
        }
        this.f = ajwVar;
        return ajwVar;
    }

    @Override // defpackage.mlr
    public final Collection c() {
        return new ake(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = akn.a;
        f(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        akn aknVar = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return aknVar.l(i, obj, 0);
    }

    @Override // defpackage.mlr
    public final Set d() {
        return new aka(this);
    }

    @Override // defpackage.mlr
    public final Set e() {
        return new akc(this);
    }

    public final void f(int i) {
        this.e = i;
        this.d++;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        akn aknVar = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return aknVar.k(i, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.c = null;
        akn aknVar = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.b = aknVar.e(i, obj, obj2, 0, this);
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        ajw ajwVar;
        ajy ajyVar;
        if (map instanceof ajw) {
            ajwVar = (ajw) map;
        } else {
            ajwVar = null;
        }
        if (ajwVar == null) {
            if (map instanceof ajy) {
                ajyVar = (ajy) map;
            } else {
                ajyVar = null;
            }
            if (ajyVar != null) {
                ajwVar = ajyVar.b();
            } else {
                ajwVar = null;
            }
        }
        if (ajwVar != null) {
            akx akxVar = new akx(null);
            int a = a();
            akn aknVar = this.b;
            akn aknVar2 = ajwVar.b;
            aknVar2.getClass();
            this.b = aknVar.f(aknVar2, 0, akxVar, this);
            int d = (ajwVar.d() + a) - akxVar.a;
            if (a != d) {
                f(d);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.c = null;
        akn g = this.b.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (g == null) {
            g = akn.a;
        }
        this.b = g;
        return this.c;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int a = a();
        akn h = this.b.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (h == null) {
            h = akn.a;
        }
        this.b = h;
        return a != a();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
