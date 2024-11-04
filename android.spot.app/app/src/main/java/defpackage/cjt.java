package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjt {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public cjt(String str, Map map, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    @mkp
    public static final cjt a(ckd ckdVar, String str) {
        return byk.k(new ddh(ckdVar, (byte[]) null), str);
    }

    public final boolean equals(Object obj) {
        return byl.r(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return byl.n(this);
    }
}
