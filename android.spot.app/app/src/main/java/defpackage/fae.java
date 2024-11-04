package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fae {
    private final Integer a;

    public fae() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fae) {
            return this.a.equals(((fae) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }

    public fae(Integer num) {
        this.a = num;
    }
}
