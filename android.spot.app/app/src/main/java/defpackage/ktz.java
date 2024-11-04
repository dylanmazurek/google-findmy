package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktz {
    public final jer a;
    public final jjr b;

    public ktz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktz) {
            ktz ktzVar = (ktz) obj;
            if (this.a.equals(ktzVar.a) && this.b.equals(ktzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((jmo) this.b).c ^ 2097800333;
    }

    public final String toString() {
        jjr jjrVar = this.b;
        return "Options{customScopes=" + String.valueOf(this.a) + ", fallbackOptions=" + String.valueOf(jjrVar) + "}";
    }

    public ktz(jer jerVar, jjr jjrVar) {
        this.a = jerVar;
        this.b = jjrVar;
    }
}
