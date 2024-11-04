package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjm {
    private final Object a;
    private final String b;

    public fjm(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjm)) {
            return false;
        }
        fjm fjmVar = (fjm) obj;
        if (this.a == fjmVar.a && this.b.equals(fjmVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
