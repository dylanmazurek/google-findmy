package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfr {
    public static final kfr a = new kfr(DesugarCollections.unmodifiableMap(new HashMap()));
    public final Map b;

    public kfr(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kfr)) {
            return false;
        }
        return this.b.equals(((kfr) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
