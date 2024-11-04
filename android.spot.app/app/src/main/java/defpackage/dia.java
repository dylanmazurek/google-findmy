package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dia extends dgq {
    public final moh a;

    public dia(moh mohVar) {
        super(null);
        this.a = mohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dia) && amr.i(this.a, ((dia) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AsyncGlideSize(asyncSize=" + this.a + ")";
    }
}
