package defpackage;

import j$.net.URLDecoder;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvv extends jhy implements Cloneable, Serializable {
    private static final long serialVersionUID = -3053773769157973706L;
    public final jkt b;
    private static final Charset c = Charset.forName("ISO-8859-1");
    public static final jvv a = new jvv(jhn.a);

    public jvv(jkt jktVar) {
        this.b = new jvq(jktVar);
    }

    public static String f(String str, int i, int i2, Charset charset, boolean z) {
        try {
            if (z) {
                return new String(URLDecoder.decode(str.substring(i, i2), "ISO-8859-1").getBytes(c), charset);
            }
            return URLDecoder.decode(str.substring(i, i2), charset.name());
        } catch (UnsupportedEncodingException unused) {
            return str.substring(i, i2);
        } catch (IllegalArgumentException unused2) {
            return str.substring(i, i2);
        }
    }

    @Override // defpackage.jhy
    protected final jkt a() {
        return this.b;
    }

    @Override // defpackage.jhy, defpackage.jib
    /* renamed from: c */
    protected final /* synthetic */ jls g() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new jvv(new jks(this.b));
    }

    @Override // defpackage.jib, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.b;
    }

    @Override // defpackage.jic
    public final String toString() {
        Charset charset = jvu.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = p().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((CharSequence) jvu.a((String) entry.getKey(), charset));
                if (!"".equals(entry.getValue())) {
                    sb.append('=').append(jvu.a((String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public jvv() {
        this(new jks(12));
    }
}
