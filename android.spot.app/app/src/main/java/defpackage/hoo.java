package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hoo {
    public abstract lkq a(String str, Object obj);

    public abstract lkq b(lkq lkqVar, lkq lkqVar2);

    public abstract String c(lkq lkqVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d(Map map) {
        lkq a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (a = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e(List list, List list2) {
        lkq lkqVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lkq lkqVar2 = (lkq) it.next();
            String c = c(lkqVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    lkqVar = (lkq) it2.next();
                    if (c.equals(c(lkqVar))) {
                        break;
                    }
                } else {
                    lkqVar = null;
                    break;
                }
            }
            lkq b = b(lkqVar2, lkqVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
