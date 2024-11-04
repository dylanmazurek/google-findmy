package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqa extends boy {
    public final cpn a;

    public cqa(cpn cpnVar) {
        this.a = cpnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((cqa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3060909 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public cqa() {
        this(cpn.a);
    }
}
