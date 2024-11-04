package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkx implements Serializable {
    public final Throwable a;

    public mkx(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mkx) && amr.i(this.a, ((mkx) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ")";
    }
}
