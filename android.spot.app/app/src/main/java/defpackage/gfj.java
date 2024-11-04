package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfj {
    public final boolean a;

    public gfj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof gfj) && this.a == ((gfj) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ 1000003;
    }

    public final String toString() {
        return "PhotoOptions{allowDefaultImage=" + this.a + "}";
    }

    public gfj(boolean z) {
        this.a = z;
    }
}
