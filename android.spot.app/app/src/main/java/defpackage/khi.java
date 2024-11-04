package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khi {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kuv d;
    private static final knb e;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        e = b2;
        a = new kgf((Object) kgx.class, kgl.class, (Object) new kbx(9));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(11));
        d = new kuv(kgu.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b2, kgk.class, (Object) new kbz(11));
    }

    public static kgw a(kjr kjrVar) {
        int ordinal = kjrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return kgw.b;
                    }
                    throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
                }
                return kgw.d;
            }
            return kgw.c;
        }
        return kgw.a;
    }
}
