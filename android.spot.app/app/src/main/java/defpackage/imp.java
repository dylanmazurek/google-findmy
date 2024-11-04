package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imp {
    public final String a;
    public final Class b;

    public imp(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imp) {
            imp impVar = (imp) obj;
            if (this.b == impVar.b && this.a.equals(impVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
