package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mky implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof mkx) {
            return ((mkx) obj).a;
        }
        return null;
    }

    public static final boolean b(Object obj) {
        if (!(obj instanceof mkx)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mky) && amr.i(this.a, ((mky) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof mkx) {
            return obj.toString();
        }
        return a.af(obj, "Success(", ")");
    }
}
