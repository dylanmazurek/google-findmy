package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyc {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public dyc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyc) {
            dyc dycVar = (dyc) obj;
            if (this.a.equals(dycVar.a) && this.b == dycVar.b && this.c == dycVar.c) {
                int i = this.d;
                int i2 = dycVar.d;
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
        int i = this.d;
        a.N(i);
        return (((((hashCode * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        switch (this.d) {
            case 1:
                str = "IMPORTANCE_UNSPECIFIED";
                break;
            case 2:
                str = "IMPORTANCE_NONE";
                break;
            case 3:
                str = "IMPORTANCE_MIN";
                break;
            case 4:
                str = "IMPORTANCE_LOW";
                break;
            case 5:
                str = "IMPORTANCE_DEFAULT";
                break;
            case 6:
                str = "IMPORTANCE_HIGH";
                break;
            default:
                str = "null";
                break;
        }
        int i = this.c;
        int i2 = this.b;
        return "NotificationChannelDescription{id=" + this.a + ", name=" + i2 + ", description=" + i + ", importance=" + str + "}";
    }

    public dyc(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
