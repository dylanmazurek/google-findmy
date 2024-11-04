package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kco {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kuv d;
    private static final knb e;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        e = b2;
        a = new kgf((Object) kbh.class, kgl.class, (Object) new kbx(4));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(5));
        d = new kuv(kbe.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b2, kgk.class, (Object) new kbz(4));
    }

    public static kbg a(kjr kjrVar) {
        int ordinal = kjrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return kbg.c;
                }
            }
            return kbg.b;
        }
        return kbg.a;
    }
}
