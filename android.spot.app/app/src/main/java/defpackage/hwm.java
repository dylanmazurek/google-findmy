package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwm {
    public static final hwm a = new hwm(jmp.c);
    public final jju b;

    public hwm(jju jjuVar) {
        this.b = jjuVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hwm) {
            return this.b.equals(((hwm) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return jql.k(this.b);
    }
}
