package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koc {
    public final kon a;
    public final int b;
    private final int c;

    public koc(kon konVar, int i, int i2) {
        this.a = konVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean a() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof koc) {
            koc kocVar = (koc) obj;
            if (this.a.equals(kocVar.a) && this.b == kocVar.b && this.c == kocVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        if (this.c != 0) {
            str2 = "provider";
        } else {
            str2 = "direct";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public koc(Class cls, int i, int i2) {
        this(new kon(kom.class, cls), i, i2);
    }
}
