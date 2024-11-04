package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dba {
    public final int a;

    public final boolean equals(Object obj) {
        if ((obj instanceof dba) && this.a == ((dba) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "RawRes(resId=" + this.a + ")";
    }
}
