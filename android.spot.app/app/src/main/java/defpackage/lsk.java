package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsk extends lse {
    public static final lsm b = lsi.b(Collections.emptyMap());

    public lsk(Map map) {
        super(map);
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map a() {
        LinkedHashMap B = iqg.B(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            B.put(entry.getKey(), ((lsm) entry.getValue()).a());
        }
        return DesugarCollections.unmodifiableMap(B);
    }
}
