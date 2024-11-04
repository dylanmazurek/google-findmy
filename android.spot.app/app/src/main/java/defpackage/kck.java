package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kck {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kuv d;
    private static final knb e;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        e = b2;
        a = new kgf((Object) kay.class, kgl.class, (Object) new kbx(2));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(3));
        d = new kuv(kau.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b2, kgk.class, (Object) new kbz(2));
    }

    public static kax a(kjr kjrVar) {
        int ordinal = kjrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return kax.c;
                }
            }
            return kax.b;
        }
        return kax.a;
    }
}
