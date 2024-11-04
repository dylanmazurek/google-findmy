package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lor {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final Map b;
    public final String c;
    public final hzc d;
    private final low f;

    static {
        new jvs("_-!.~'()*", false);
    }

    public lor(low lowVar, String str, hzc hzcVar, Map map, String str2) {
        this.f = lowVar;
        this.a = str;
        this.d = hzcVar;
        this.b = map;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lor)) {
            return false;
        }
        lor lorVar = (lor) obj;
        if (this.f == lorVar.f && amr.i(this.a, lorVar.a) && amr.i(this.d, lorVar.d) && amr.i(this.b, lorVar.b) && amr.i(this.c, lorVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f.hashCode() * 31;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        hzc hzcVar = this.d;
        if (hzcVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hzcVar.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.b.hashCode()) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "DeepLinkData(deepLinkType=" + this.f + ", account=" + this.a + ", deviceIdentifier=" + this.d + ", queryParameters=" + this.b + ", fragment=" + this.c + ")";
    }
}
