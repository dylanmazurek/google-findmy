package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcf {
    final Map a = new HashMap();

    public final Map a(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            String valueOf = String.valueOf((String) entry.getKey());
            hashMap.put(str.concat(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public final String toString() {
        return fbf.b(this.a);
    }
}
