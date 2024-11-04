package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class joj implements jnt {
    private final jnt a;
    private final Object b;

    public joj(jnt jntVar, Object obj) {
        jntVar.getClass();
        this.a = jntVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof joj)) {
            return false;
        }
        joj jojVar = (joj) obj;
        if (!this.a.equals(jojVar.a) || !this.b.equals(jojVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
