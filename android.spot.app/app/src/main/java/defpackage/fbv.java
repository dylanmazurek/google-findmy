package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbv extends fbf {
    public final Map a = new HashMap(4);

    @Override // defpackage.fbf
    public final /* bridge */ /* synthetic */ void c(fbf fbfVar) {
        ((fbv) fbfVar).a.putAll(this.a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            String valueOf = String.valueOf(String.valueOf(entry.getKey()));
            hashMap.put("metric".concat(valueOf), entry.getValue());
        }
        return a(hashMap);
    }
}
