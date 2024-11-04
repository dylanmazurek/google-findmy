package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khk {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kuv d;
    public static final kuv e;
    public static final kuv f;
    private static final knb g;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.HmacKey");
        g = b2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kjr.RAW, khd.d, hashMap, hashMap2);
        iuu.u(kjr.TINK, khd.a, hashMap, hashMap2);
        iuu.u(kjr.LEGACY, khd.c, hashMap, hashMap2);
        iuu.u(kjr.CRUNCHY, khd.b, hashMap, hashMap2);
        e = iuu.G(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        iuu.u(kiv.SHA1, khc.a, hashMap3, hashMap4);
        iuu.u(kiv.SHA224, khc.b, hashMap3, hashMap4);
        iuu.u(kiv.SHA256, khc.c, hashMap3, hashMap4);
        iuu.u(kiv.SHA384, khc.d, hashMap3, hashMap4);
        iuu.u(kiv.SHA512, khc.e, hashMap3, hashMap4);
        f = iuu.G(hashMap3, hashMap4);
        a = new kgf((Object) khe.class, kgl.class, (Object) new kbx(10));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(12));
        d = new kuv(kha.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b2, kgk.class, (Object) new kbz(12));
    }
}
