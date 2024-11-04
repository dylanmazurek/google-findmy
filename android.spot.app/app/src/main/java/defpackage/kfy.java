package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfy {
    public static final kfy a = new kfy();
    private final Map b = new HashMap();

    public final synchronized void a(String str, kag kagVar) {
        if (this.b.containsKey(str)) {
            if (((kag) this.b.get(str)).equals(kagVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.b.get(str)) + "), cannot insert " + String.valueOf(kagVar));
        }
        this.b.put(str, kagVar);
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (kag) entry.getValue());
        }
    }
}
