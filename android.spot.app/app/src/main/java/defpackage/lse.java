package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lse implements lsh {
    public final Map a;

    public lse(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }
}
