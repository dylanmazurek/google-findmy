package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class did extends dgq {
    public final dig a;

    public did(dig digVar) {
        super(null);
        this.a = digVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof did) && amr.i(this.a, ((did) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImmediateGlideSize(size=" + this.a + ")";
    }
}
