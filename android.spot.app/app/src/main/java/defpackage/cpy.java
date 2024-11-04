package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpy extends boy {
    public final cpn a = cpn.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((cpy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3060692 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
