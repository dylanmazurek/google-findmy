package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgv {
    public static final kft a = new kav();
    public static final kgf b = new kgf((Object) kgu.class, kgy.class, (Object) new kap(17));
    public static final kgf c = new kgf((Object) kgu.class, kaf.class, (Object) new kap(18));
    public static final kpb d;

    static {
        kjg kjgVar = kjg.SYMMETRIC;
        d = new kpb("type.googleapis.com/google.crypto.tink.AesCmacKey", kaf.class, kjgVar);
    }

    public static void a(kgx kgxVar) {
        if (kgxVar.a == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
