package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jtf {
    public static final jtf d = new jsz("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final jtf e = new jsz("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final jtf f;

    static {
        new jte("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new jte("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f = new jsy(new jsx("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract jtf e();

    public abstract InputStream f(Reader reader);

    public abstract OutputStream g(Writer writer);

    public CharSequence h(CharSequence charSequence) {
        throw null;
    }

    public abstract jtf i();

    public final String k(byte[] bArr) {
        int length = bArr.length;
        hwx.T(0, length, length);
        StringBuilder sb = new StringBuilder(d(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] l(CharSequence charSequence) {
        try {
            CharSequence h = h(charSequence);
            int m = m(h.length());
            byte[] bArr = new byte[m];
            int a = a(bArr, h);
            if (a != m) {
                byte[] bArr2 = new byte[a];
                System.arraycopy(bArr, 0, bArr2, 0, a);
                return bArr2;
            }
            return bArr;
        } catch (jta e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int m(int i);
}
