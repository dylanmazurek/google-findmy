package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggi {
    private final Long a;
    private final String b;
    private final String c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final int g;
    private final Long h;
    private final String i;
    private final String j;
    private final int k;

    public ggi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggi) {
            ggi ggiVar = (ggi) obj;
            Long l = this.a;
            if (l != null ? l.equals(ggiVar.a) : ggiVar.a == null) {
                if (this.b.equals(ggiVar.b) && ((str = this.c) != null ? str.equals(ggiVar.c) : ggiVar.c == null) && this.d.equals(ggiVar.d) && this.e.equals(ggiVar.e)) {
                    int i = this.k;
                    int i2 = ggiVar.k;
                    if (i != 0) {
                        if (i == i2 && this.f.equals(ggiVar.f) && this.g == ggiVar.g && this.h.equals(ggiVar.h) && this.i.equals(ggiVar.i) && this.j.equals(ggiVar.j)) {
                            return true;
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.a;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode3 = ((((((hashCode2 * 1000003) ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i2 = this.k;
        a.V(i2);
        return ((((((((((hashCode3 ^ i2) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("name", frx.aN(this.b));
        return q.toString();
    }

    public ggi(Long l, String str, String str2, Long l2, Long l3, int i, Long l4, int i2, Long l5, String str3, String str4) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.k = i;
        this.f = l4;
        this.g = i2;
        this.h = l5;
        this.i = str3;
        this.j = str4;
    }
}
