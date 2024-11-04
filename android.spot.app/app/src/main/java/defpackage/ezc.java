package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezc {
    public final String a;
    public final int b;

    public ezc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ezc) {
            ezc ezcVar = (ezc) obj;
            if (this.a.equals(ezcVar.a)) {
                int i = this.b;
                int i2 = ezcVar.b;
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
        if (i != 1) {
            if (i != 2) {
                str = "null";
            } else {
                str = "PASSWORD_CONFIRMATION";
            }
        } else {
            str = "PASSWORD";
        }
        return "PasswordError{errorDescription=" + this.a + ", errorSource=" + str + "}";
    }

    public ezc(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
