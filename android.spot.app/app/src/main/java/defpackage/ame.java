package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ame implements amc {
    public final Map a;
    public final Map b;
    private final moh c;

    public ame(Map map, moh mohVar) {
        LinkedHashMap linkedHashMap;
        this.c = mohVar;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.amc
    public final amb a(String str, mnw mnwVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!moz.M(str.charAt(i))) {
                Map map = this.b;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    map.put(str, obj);
                }
                ((List) obj).add(mnwVar);
                return new amd(this, str, mnwVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // defpackage.amc
    public final Object b(String str) {
        List list = (List) this.a.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            this.a.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // defpackage.amc
    public final boolean c(Object obj) {
        return ((Boolean) this.c.a(obj)).booleanValue();
    }
}
