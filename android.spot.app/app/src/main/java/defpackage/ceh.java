package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class ceh {
    final Map a = new HashMap();
    final Map b;

    public ceh(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            cev cevVar = (cev) entry.getValue();
            List list = (List) this.a.get(cevVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(cevVar, list);
            }
            list.add((cei) entry.getKey());
        }
    }

    public static void a(List list, cfc cfcVar, cev cevVar, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    cei ceiVar = (cei) list.get(size);
                    try {
                        int i = ceiVar.a;
                        if (i != 0) {
                            if (i != 1) {
                                ceiVar.b.invoke(obj, cfcVar, cevVar);
                            } else {
                                ceiVar.b.invoke(obj, cfcVar);
                            }
                        } else {
                            ceiVar.b.invoke(obj, null);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                } else {
                    return;
                }
            }
        }
    }
}
