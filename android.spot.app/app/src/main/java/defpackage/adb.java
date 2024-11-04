package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adb {
    private final Object a;
    private final Object b;

    public adb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adb)) {
            return false;
        }
        adb adbVar = (adb) obj;
        if (amr.i(this.a, adbVar.a) && amr.i(this.b, adbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
