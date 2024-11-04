package defpackage;

import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmk implements jzw {
    public final kmr a;
    public final kaf b;
    public final byte[] c;

    private kmk(kmr kmrVar, kaf kafVar, byte[] bArr) {
        this.a = kmrVar;
        this.b = kafVar;
        this.c = bArr;
    }

    public static jzw a(kao kaoVar) {
        klx klxVar = new klx(kaoVar.c.X(), kaoVar.a.c);
        String valueOf = String.valueOf(String.valueOf(kaoVar.a.f));
        return new kmk(klxVar, new kmw(new kmv("HMAC".concat(valueOf), new SecretKeySpec(kaoVar.d.X(), "HMAC")), kaoVar.a.d), kaoVar.b.c());
    }
}
