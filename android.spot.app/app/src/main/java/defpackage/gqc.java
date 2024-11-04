package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqc {
    public static final gqc a = a("Content-Encoding");
    public static final gqc b;
    public static final gqc c;
    public static final gqc d;
    public final String e;

    static {
        a("Content-Type");
        b = a("X-DFE-Device-Id");
        c = a("X-DFE-Debug-Overrides");
        d = a("X-Server-Token");
    }

    public gqc() {
        throw null;
    }

    public static gqc a(String str) {
        hwx.O(jdp.a.f(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new gqc(str.toLowerCase(Locale.US));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqc) {
            return this.e.equals(((gqc) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GnpHttpHeaderKey{key=" + this.e + "}";
    }

    public gqc(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.e = str;
    }
}
