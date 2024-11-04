package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwl implements Comparable {
    public final long a;
    final String b;
    final int c;
    final long d;
    final Object e;

    public hwl(long j, String str, int i, long j2, Object obj) {
        boolean z;
        boolean z2;
        if (j != 0) {
            z = false;
        } else {
            z = true;
        }
        if (str == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        hwx.J(z == z2);
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
    }

    public final Object a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Object obj = this.e;
                                obj.getClass();
                                if (obj instanceof byte[]) {
                                    return (byte[]) obj;
                                }
                                return ((lim) obj).A();
                            }
                            throw new AssertionError("Impossible, this was validated when parsed or created");
                        }
                        Object obj2 = this.e;
                        obj2.getClass();
                        return obj2;
                    }
                    return Double.valueOf(Double.longBitsToDouble(this.d));
                }
                return Long.valueOf(this.d);
            }
            return true;
        }
        return false;
    }

    public final String b() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return Long.toString(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hwl hwlVar = (hwl) obj;
        int compare = Long.compare(this.a, hwlVar.a);
        if (compare == 0) {
            if (this.a != 0) {
                return 0;
            }
            String str = this.b;
            str.getClass();
            String str2 = hwlVar.b;
            str2.getClass();
            return str.compareTo(str2);
        }
        return compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwl)) {
            return false;
        }
        hwl hwlVar = (hwl) obj;
        if (this.a == hwlVar.a && Objects.equals(this.b, hwlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        return b() + ":" + String.valueOf(a());
    }
}
