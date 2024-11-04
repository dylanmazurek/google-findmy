package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mab {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final jtf b = mbc.c;

    public static maz a(String str, maa maaVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return new mba(str, z, maaVar);
    }
}
