package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btx {
    public static String a(Locale locale) {
        return locale.getScript();
    }

    public static cgk b(cgn cgnVar, mql mqlVar, cgu cguVar) {
        return cgnVar.b(moz.a(mqlVar), cguVar);
    }

    public static cgk c() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static cgk d(cgn cgnVar, Class cls) {
        return cgnVar.a(cls);
    }
}
