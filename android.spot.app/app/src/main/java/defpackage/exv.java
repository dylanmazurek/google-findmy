package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exv {
    public final int a;
    public final String b;
    public final jer c;

    public exv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exv) {
            exv exvVar = (exv) obj;
            if (this.a == exvVar.a && this.b.equals(exvVar.b) && this.c.equals(exvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PermissionDialogData{titleId=" + this.a + ", message=" + this.b + ", iconId=" + String.valueOf(this.c) + "}";
    }

    public exv(int i, String str, jer jerVar) {
        this.a = i;
        this.b = str;
        this.c = jerVar;
    }
}
