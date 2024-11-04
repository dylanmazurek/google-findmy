package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijn {
    static {
        jtf.f.i();
    }

    public static String a(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase.length() == 4) {
            return a.ag(lowerCase, "0000", "-0000-1000-8000-00805f9b34fb");
        }
        return lowerCase;
    }
}
