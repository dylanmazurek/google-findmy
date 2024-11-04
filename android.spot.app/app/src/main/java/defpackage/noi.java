package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class noi implements nog {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nog nogVar = (nog) obj;
        if (this == nogVar) {
            return 0;
        }
        long a = nogVar.a();
        long a2 = a();
        if (a2 == a) {
            return 0;
        }
        if (a2 < a) {
            return -1;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nog)) {
            return false;
        }
        nog nogVar = (nog) obj;
        if (a() == nogVar.a() && moz.az(b(), nogVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((int) (a() ^ (a() >>> 32))) + b().hashCode();
    }

    public final String toString() {
        return nqz.b.a(this);
    }
}
