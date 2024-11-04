package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggc {
    public final ggd a;
    public final int b;

    public ggc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggc) {
            ggc ggcVar = (ggc) obj;
            if (this.a.equals(ggcVar.a)) {
                int i = this.b;
                int i2 = ggcVar.b;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.N(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "NOTIFY";
                }
            } else {
                str = "DROP";
            }
        } else {
            str = "UNKNOWN_PREFERENCE";
        }
        return "PreferenceEntry{preferenceKey=" + valueOf + ", preference=" + str + "}";
    }

    public ggc(ggd ggdVar, int i) {
        this.a = ggdVar;
        this.b = i;
    }
}
