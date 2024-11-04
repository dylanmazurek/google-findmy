package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fby extends fbf {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();

    @Override // defpackage.fbf
    public final /* bridge */ /* synthetic */ void c(fbf fbfVar) {
        String str;
        fby fbyVar = (fby) fbfVar;
        fbyVar.a.addAll(this.a);
        fbyVar.b.addAll(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str2 = (String) entry.getKey();
            for (fcf fcfVar : (List) entry.getValue()) {
                if (fcfVar != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!fbyVar.c.containsKey(str)) {
                        fbyVar.c.put(str, new ArrayList());
                    }
                    ((List) fbyVar.c.get(str)).add(fcfVar);
                }
            }
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.a.isEmpty()) {
            hashMap.put("products", this.a);
        }
        if (!this.b.isEmpty()) {
            hashMap.put("promotions", this.b);
        }
        if (!this.c.isEmpty()) {
            hashMap.put("impressions", this.c);
        }
        hashMap.put("productAction", null);
        return a(hashMap);
    }
}
