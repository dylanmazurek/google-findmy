package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klq {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kgf d;
    public static final kuv e;
    public static final kuv f;
    public static final kuv g;
    private static final knb h;
    private static final knb i;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        h = b2;
        knb b3 = kgt.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        i = b3;
        a = new kgf((Object) kkn.class, kgl.class, (Object) new kbx(11));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(14));
        e = new kuv(kkq.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b3, kgk.class, (Object) new kbz(15));
        f = new kuv(kko.class, kgk.class, (byte[]) null);
        d = new kgf((Object) b2, kgk.class, (Object) new kbz(16));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kjr.RAW, kkm.d, hashMap, hashMap2);
        iuu.u(kjr.TINK, kkm.a, hashMap, hashMap2);
        iuu.u(kjr.CRUNCHY, kkm.b, hashMap, hashMap2);
        iuu.u(kjr.LEGACY, kkm.c, hashMap, hashMap2);
        g = iuu.G(hashMap, hashMap2);
    }
}
