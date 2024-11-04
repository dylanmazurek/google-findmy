package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtm {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public dtm(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Object f(Object obj) {
        kvw kvwVar = (kvw) this.a.get(obj);
        if (kvwVar != null) {
            return kvwVar.b;
        }
        return null;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        kvw kvwVar;
        int a = a(obj2);
        long j = a;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        Map map = this.a;
        if (obj2 == null) {
            kvwVar = null;
        } else {
            kvwVar = new kvw(obj2, a);
        }
        kvw kvwVar2 = (kvw) map.put(obj, kvwVar);
        if (kvwVar2 != null) {
            this.c -= kvwVar2.a;
            if (!kvwVar2.b.equals(obj2)) {
                c(obj, kvwVar2.b);
            }
        }
        j(this.b);
        if (kvwVar2 == null) {
            return null;
        }
        return kvwVar2.b;
    }

    public final synchronized Object h(Object obj) {
        kvw kvwVar = (kvw) this.a.remove(obj);
        if (kvwVar == null) {
            return null;
        }
        this.c -= kvwVar.a;
        return kvwVar.b;
    }

    public final void i() {
        j(0L);
    }

    public final synchronized void j(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            kvw kvwVar = (kvw) entry.getValue();
            this.c -= kvwVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, kvwVar.b);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
