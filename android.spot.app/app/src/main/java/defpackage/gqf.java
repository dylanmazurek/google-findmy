package defpackage;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqf {
    public final Integer a;
    public final byte[] b;
    private final String c;
    private final Map d;
    private final byte[] e;
    private final Exception f;

    public gqf() {
        throw null;
    }

    public static kdo d() {
        kdo kdoVar = new kdo((char[]) null);
        kdoVar.f = new HashMap();
        return kdoVar;
    }

    public final Throwable a() {
        Integer num;
        if (this.f == null && (num = this.a) != null && num.intValue() != 200) {
            return new gqg(this.a.intValue());
        }
        return this.f;
    }

    public final boolean b() {
        if (a() != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        Throwable a = a();
        if (a == null) {
            return false;
        }
        if ((a instanceof SocketException) || (a instanceof UnknownHostException) || (a instanceof SSLException)) {
            return true;
        }
        if (!(a instanceof gqg) || ((gqg) a).a != 401) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqf) {
            gqf gqfVar = (gqf) obj;
            Integer num = this.a;
            if (num != null ? num.equals(gqfVar.a) : gqfVar.a == null) {
                String str = this.c;
                if (str != null ? str.equals(gqfVar.c) : gqfVar.c == null) {
                    if (this.d.equals(gqfVar.d)) {
                        byte[] bArr3 = this.e;
                        boolean z = gqfVar instanceof gqf;
                        if (z) {
                            bArr = gqfVar.e;
                        } else {
                            bArr = gqfVar.e;
                        }
                        if (Arrays.equals(bArr3, bArr)) {
                            byte[] bArr4 = this.b;
                            if (z) {
                                bArr2 = gqfVar.b;
                            } else {
                                bArr2 = gqfVar.b;
                            }
                            if (Arrays.equals(bArr4, bArr2)) {
                                Exception exc = this.f;
                                Exception exc2 = gqfVar.f;
                                if (exc != null ? exc.equals(exc2) : exc2 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode3 = ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003) ^ Arrays.hashCode(this.b);
        Exception exc = this.f;
        if (exc != null) {
            i = exc.hashCode();
        }
        return (hashCode3 * 1000003) ^ i;
    }

    public final String toString() {
        Exception exc = this.f;
        byte[] bArr = this.b;
        byte[] bArr2 = this.e;
        return "GnpHttpResponse{statusCode=" + this.a + ", statusMessage=" + this.c + ", headers=" + String.valueOf(this.d) + ", rawBody=" + Arrays.toString(bArr2) + ", body=" + Arrays.toString(bArr) + ", exception=" + String.valueOf(exc) + "}";
    }

    public gqf(Integer num, String str, Map map, byte[] bArr, byte[] bArr2, Exception exc) {
        this.a = num;
        this.c = str;
        this.d = map;
        this.e = bArr;
        this.b = bArr2;
        this.f = exc;
    }
}
