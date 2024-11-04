package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class liz {
    private final Object a;
    private final int b;

    public liz(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof liz)) {
            return false;
        }
        liz lizVar = (liz) obj;
        if (this.a != lizVar.a || this.b != lizVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
