package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jec {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b;

    static {
        Charset.forName("ISO-8859-1");
        b = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
