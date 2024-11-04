package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpq extends jpr {
    private final Map a;

    public jpq(jpa jpaVar, jpa jpaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, jpaVar);
        d(linkedHashMap, jpaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((joa) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void d(Map map, jpa jpaVar) {
        for (int i = 0; i < jpaVar.b(); i++) {
            joa c = jpaVar.c(i);
            Object obj = map.get(c);
            if (c.b) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.c(jpaVar.e(i)));
            } else {
                map.put(c, c.c(jpaVar.e(i)));
            }
        }
    }

    @Override // defpackage.jpr
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.jpr
    public final Set b() {
        return this.a.keySet();
    }

    @Override // defpackage.jpr
    public final void c(jph jphVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            joa joaVar = (joa) entry.getKey();
            Object value = entry.getValue();
            if (joaVar.b) {
                jphVar.b(joaVar, ((List) value).iterator(), obj);
            } else {
                jphVar.a(joaVar, value, obj);
            }
        }
    }
}
