package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kme implements kaa {
    public static final kuv a;
    public static final kuv b;
    private final String c;
    private final byte[] d;
    private final kmj e;
    private final keq f;
    private final byte[] g;
    private final ktd h;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kmh.NIST_P256, kdp.a, hashMap, hashMap2);
        iuu.u(kmh.NIST_P384, kdp.b, hashMap, hashMap2);
        iuu.u(kmh.NIST_P521, kdp.c, hashMap, hashMap2);
        a = iuu.G(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        iuu.u(kmj.UNCOMPRESSED, kdr.b, hashMap3, hashMap4);
        iuu.u(kmj.COMPRESSED, kdr.a, hashMap3, hashMap4);
        iuu.u(kmj.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, kdr.c, hashMap3, hashMap4);
        b = iuu.G(hashMap3, hashMap4);
    }

    public kme(ECPublicKey eCPublicKey, byte[] bArr, String str, kmj kmjVar, keq keqVar, byte[] bArr2) {
        jql.B(eCPublicKey);
        this.h = new ktd(eCPublicKey);
        this.d = bArr;
        this.c = str;
        this.e = kmjVar;
        this.f = keqVar;
        this.g = bArr2;
    }

    public static final String b(kdq kdqVar) {
        if (kdqVar.equals(kdq.a)) {
            return "HmacSha1";
        }
        if (kdqVar.equals(kdq.b)) {
            return "HmacSha224";
        }
        if (kdqVar.equals(kdq.c)) {
            return "HmacSha256";
        }
        if (kdqVar.equals(kdq.d)) {
            return "HmacSha384";
        }
        if (kdqVar.equals(kdq.e)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(String.valueOf(kdqVar))));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.interfaces.ECPublicKey] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.security.interfaces.ECPublicKey] */
    @Override // defpackage.kaa
    public final byte[] a(byte[] bArr) {
        ktd ktdVar = this.h;
        ?? r1 = ktdVar.a;
        int a2 = this.f.a();
        KeyPair v = jql.v(r1.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) v.getPublic();
        byte[] E = jql.E((ECPrivateKey) v.getPrivate(), ktdVar.a);
        byte[] F = jql.F(eCPublicKey.getParams().getCurve(), this.e, eCPublicKey.getW());
        byte[] e = kne.e(this.c, jql.I(F, E), this.d, null, a2);
        knb b2 = knb.b(F);
        return this.f.b(knb.b(e).c(), this.g, b2.c(), bArr);
    }
}
