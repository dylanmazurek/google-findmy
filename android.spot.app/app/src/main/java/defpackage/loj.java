package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loj {
    public static final loj a;
    public final String b = "FPOP_CLIENT";

    static {
        int i = loe.a;
        int i2 = lof.a;
        loj lojVar = log.a;
        a = log.a;
        int i3 = loh.a;
        int i4 = loi.a;
    }

    public /* synthetic */ loj(String str) {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof loj)) {
            return false;
        }
        return this.b.equals(((loj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " name=" + this.b + '>';
    }
}
