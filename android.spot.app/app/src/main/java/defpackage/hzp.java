package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzp {
    public final String a;
    private final List b;

    public hzp() {
        throw null;
    }

    public final String[] a() {
        return (String[]) this.b.toArray(new String[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzp) {
            hzp hzpVar = (hzp) obj;
            if (this.a.equals(hzpVar.a) && this.b.equals(hzpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SafeSql{query=" + this.a + ", queryArgs=" + this.b.toString() + "}";
    }

    public hzp(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
