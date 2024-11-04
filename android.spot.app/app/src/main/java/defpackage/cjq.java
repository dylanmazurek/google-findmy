package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjq {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public cjq(String str, String str2, boolean z, int i, String str3, int i2) {
        int i3;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (moz.t(upperCase, "INT")) {
            i3 = 3;
        } else if (!moz.t(upperCase, "CHAR") && !moz.t(upperCase, "CLOB") && !moz.t(upperCase, "TEXT")) {
            if (moz.t(upperCase, "BLOB")) {
                i3 = 5;
            } else if (!moz.t(upperCase, "REAL") && !moz.t(upperCase, "FLOA") && !moz.t(upperCase, "DOUB")) {
                i3 = 1;
            } else {
                i3 = 4;
            }
        } else {
            i3 = 2;
        }
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof cjq) {
            cjq cjqVar = (cjq) obj;
            cjqVar.getClass();
            if (this.d == cjqVar.d && amr.i(this.a, cjqVar.a) && this.c == cjqVar.c && ((this.f != 1 || cjqVar.f != 2 || (str3 = this.e) == null || byl.q(str3, cjqVar.e)) && ((this.f != 2 || cjqVar.f != 1 || (str2 = cjqVar.e) == null || byl.q(str2, this.e)) && ((this.f != cjqVar.f || ((str = this.e) == null ? cjqVar.e == null : byl.q(str, cjqVar.e))) && this.g == cjqVar.g)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((hashCode + this.g) * 31) + i) * 31) + this.d;
    }

    public final String toString() {
        String X;
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        X = moz.X(new mrg(moz.p(moz.K(sb.toString())), (moh) new eeo(15, (byte[]) null), 0), "\n");
        return X;
    }
}
