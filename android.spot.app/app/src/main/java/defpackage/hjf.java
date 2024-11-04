package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjf {
    public final String a;
    public final int b;

    public hjf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hjf) {
            hjf hjfVar = (hjf) obj;
            if (this.b == hjfVar.b) {
                String str = this.a;
                String str2 = hjfVar.a;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.b;
        a.N(i);
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ hashCode;
    }

    public final String toString() {
        String str;
        if (this.b != 1) {
            str = "ANONYMOUS";
        } else {
            str = "GAIA";
        }
        return "AuthChannel{type=" + str + ", account=" + this.a + "}";
    }

    public hjf(int i, String str) {
        this.b = i;
        this.a = str;
    }
}
