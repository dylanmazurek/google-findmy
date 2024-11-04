package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbs {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kuv d;
    private static final knb e;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        e = b2;
        a = new kgf((Object) kbr.class, kgl.class, (Object) new kbx(1));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(1));
        d = new kuv(kbp.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b2, kgk.class, (Object) new kbz(1));
    }

    public static kbq a(kjr kjrVar) {
        int ordinal = kjrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return kbq.b;
            }
            throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
        }
        return kbq.a;
    }
}
