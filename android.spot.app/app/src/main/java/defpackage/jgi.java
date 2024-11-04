package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class jgi implements jmh {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jmh) {
            return a().equals(((jmh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
