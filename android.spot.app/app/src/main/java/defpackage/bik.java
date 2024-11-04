package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bik {
    public final Object a;

    public final boolean equals(Object obj) {
        if ((obj instanceof bik) && amr.i(this.a, ((bik) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
