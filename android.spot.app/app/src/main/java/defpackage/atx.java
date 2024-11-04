package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atx implements auj {
    public final int a;

    public atx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!amr.i(cls2, cls)) {
            return false;
        }
        obj.getClass();
        if (this.a == ((atx) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidPointerIcon(type=" + this.a + ')';
    }
}
