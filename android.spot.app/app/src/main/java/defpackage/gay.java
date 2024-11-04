package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gay {
    public final String a;
    public final int b;

    public gay(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static gay a(String str) {
        str.getClass();
        return new gay(1, str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gay) {
            gay gayVar = (gay) obj;
            if (gayVar.b - 1 == this.b - 1 && amr.g(gayVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (this.b - 1) + (hashCode * 31);
    }
}
