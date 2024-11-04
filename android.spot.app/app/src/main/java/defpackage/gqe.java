package defpackage;

import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqe {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final int e;

    public gqe() {
        throw null;
    }

    public static gqd a() {
        gqd gqdVar = new gqd();
        gqdVar.c = 1;
        gqdVar.a = new HashMap();
        return gqdVar;
    }

    public final gqd b() {
        gqd gqdVar = new gqd(this);
        gqdVar.a = new HashMap(this.c);
        return gqdVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqe) {
            gqe gqeVar = (gqe) obj;
            if (this.a.equals(gqeVar.a) && ((str = this.b) != null ? str.equals(gqeVar.b) : gqeVar.b == null) && this.c.equals(gqeVar.c)) {
                boolean z = gqeVar instanceof gqe;
                if (Arrays.equals(this.d, gqeVar.d)) {
                    int i = this.e;
                    int i2 = gqeVar.e;
                    if (i != 0) {
                        if (i == i2) {
                            return true;
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = ((((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        int i = this.e;
        a.N(i);
        return hashCode3 ^ i;
    }

    public final String toString() {
        byte[] bArr = this.d;
        Map map = this.c;
        return "GnpHttpRequest{url=" + String.valueOf(this.a) + ", contentType=" + this.b + ", headers=" + String.valueOf(map) + ", body=" + Arrays.toString(bArr) + ", purpose=" + fzo.u(this.e) + "}";
    }

    public gqe(URL url, String str, Map map, byte[] bArr, int i) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = i;
    }
}
