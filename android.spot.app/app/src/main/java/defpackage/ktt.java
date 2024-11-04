package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktt {
    public static final lyr a = new lyr("com.google.frameworks.client.data.android.auth.AuthContext", null);
    public final String b;
    private final String c;

    public ktt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktt) {
            ktt kttVar = (ktt) obj;
            String str = this.c;
            if (str != null ? str.equals(kttVar.c) : kttVar.c == null) {
                if (this.b.equals(kttVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AuthContext{identifier=" + this.c + ", type=" + this.b + "}";
    }

    public ktt(String str) {
        this.c = str;
        this.b = "google";
    }
}
