package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class keg {
    static {
        kjs kjsVar = kjs.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        kfz.a.b(keh.a);
        kfz.a.a(keh.b);
        kfz.a.b(kej.a);
        kfz.a.a(kej.b);
        kam.a();
        kdi.a();
        if (kdd.a()) {
            return;
        }
        kgf kgfVar = kdn.a;
        if (iuu.y(1)) {
            kgf kgfVar2 = ket.a;
            kga kgaVar = kga.a;
            kgaVar.a(ket.a);
            kgaVar.b(ket.b);
            kgaVar.d(ket.e);
            kgaVar.c(ket.c);
            kgaVar.d(ket.f);
            kgaVar.c(ket.d);
            kfy kfyVar = kfy.a;
            HashMap hashMap = new HashMap();
            kdo kdoVar = new kdo();
            kdoVar.a = kdp.a;
            kdoVar.b = kdq.c;
            kdoVar.c = kdr.b;
            kdoVar.e = kds.a;
            lzt lztVar = new lzt((byte[]) null, (byte[]) null);
            lztVar.j();
            lztVar.k(16);
            lztVar.l();
            lztVar.a = kbc.c;
            kdoVar.b(lztVar.i());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", kdoVar.a());
            kdo kdoVar2 = new kdo();
            kdoVar2.a = kdp.a;
            kdoVar2.b = kdq.c;
            kdoVar2.c = kdr.b;
            kdoVar2.e = kds.c;
            lzt lztVar2 = new lzt((byte[]) null, (byte[]) null);
            lztVar2.j();
            lztVar2.k(16);
            lztVar2.l();
            lztVar2.a = kbc.c;
            kdoVar2.b(lztVar2.i());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", kdoVar2.a());
            kdo kdoVar3 = new kdo();
            kdoVar3.a = kdp.a;
            kdoVar3.b = kdq.c;
            kdoVar3.c = kdr.a;
            kdoVar3.e = kds.a;
            lzt lztVar3 = new lzt((byte[]) null, (byte[]) null);
            lztVar3.j();
            lztVar3.k(16);
            lztVar3.l();
            lztVar3.a = kbc.c;
            kdoVar3.b(lztVar3.i());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", kdoVar3.a());
            kdo kdoVar4 = new kdo();
            kdoVar4.a = kdp.a;
            kdoVar4.b = kdq.c;
            kdoVar4.c = kdr.a;
            kdoVar4.e = kds.c;
            lzt lztVar4 = new lzt((byte[]) null, (byte[]) null);
            lztVar4.j();
            lztVar4.k(16);
            lztVar4.l();
            lztVar4.a = kbc.c;
            kdoVar4.b(lztVar4.i());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", kdoVar4.a());
            kdo kdoVar5 = new kdo();
            kdoVar5.a = kdp.a;
            kdoVar5.b = kdq.c;
            kdoVar5.c = kdr.a;
            kdoVar5.e = kds.c;
            lzt lztVar5 = new lzt((byte[]) null, (byte[]) null);
            lztVar5.j();
            lztVar5.k(16);
            lztVar5.l();
            lztVar5.a = kbc.c;
            kdoVar5.b(lztVar5.i());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", kdoVar5.a());
            kdo kdoVar6 = new kdo();
            kdoVar6.a = kdp.a;
            kdoVar6.b = kdq.c;
            kdoVar6.c = kdr.b;
            kdoVar6.e = kds.a;
            kdo kdoVar7 = new kdo((byte[]) null);
            kdoVar7.d(16);
            kdoVar7.e(32);
            kdoVar7.g(16);
            kdoVar7.f(16);
            kdoVar7.d = kar.c;
            kdoVar7.a = kas.c;
            kdoVar6.b(kdoVar7.c());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", kdoVar6.a());
            kdo kdoVar8 = new kdo();
            kdoVar8.a = kdp.a;
            kdoVar8.b = kdq.c;
            kdoVar8.c = kdr.b;
            kdoVar8.e = kds.c;
            kdo kdoVar9 = new kdo((byte[]) null);
            kdoVar9.d(16);
            kdoVar9.e(32);
            kdoVar9.g(16);
            kdoVar9.f(16);
            kdoVar9.d = kar.c;
            kdoVar9.a = kas.c;
            kdoVar8.b(kdoVar9.c());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", kdoVar8.a());
            kdo kdoVar10 = new kdo();
            kdoVar10.a = kdp.a;
            kdoVar10.b = kdq.c;
            kdoVar10.c = kdr.a;
            kdoVar10.e = kds.a;
            kdo kdoVar11 = new kdo((byte[]) null);
            kdoVar11.d(16);
            kdoVar11.e(32);
            kdoVar11.g(16);
            kdoVar11.f(16);
            kdoVar11.d = kar.c;
            kdoVar11.a = kas.c;
            kdoVar10.b(kdoVar11.c());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", kdoVar10.a());
            kdo kdoVar12 = new kdo();
            kdoVar12.a = kdp.a;
            kdoVar12.b = kdq.c;
            kdoVar12.c = kdr.a;
            kdoVar12.e = kds.c;
            kdo kdoVar13 = new kdo((byte[]) null);
            kdoVar13.d(16);
            kdoVar13.e(32);
            kdoVar13.g(16);
            kdoVar13.f(16);
            kdoVar13.d = kar.c;
            kdoVar13.a = kas.c;
            kdoVar12.b(kdoVar13.c());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", kdoVar12.a());
            kfyVar.b(DesugarCollections.unmodifiableMap(hashMap));
            kfz.a.a(kdn.a);
            kfz.a.a(kdn.b);
            kfu.a.a(kdn.c, kdt.class);
            kfm.a.b(kdn.d, true);
            kfm.a.b(kdn.e, false);
            kgf kgfVar3 = kez.a;
            if (iuu.y(1)) {
                kgf kgfVar4 = kee.a;
                kga kgaVar2 = kga.a;
                kgaVar2.a(kee.a);
                kgaVar2.b(kee.b);
                kgaVar2.d(kee.e);
                kgaVar2.c(kee.c);
                kgaVar2.d(kee.f);
                kgaVar2.c(kee.d);
                kfy kfyVar2 = kfy.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new keb(kdz.f, kdy.a, kdw.a, kea.a));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new keb(kdz.f, kdy.a, kdw.a, kea.c));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new keb(kdz.f, kdy.a, kdw.b, kea.a));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new keb(kdz.f, kdy.a, kdw.b, kea.c));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", new keb(kdz.f, kdy.a, kdw.c, kea.a));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", new keb(kdz.f, kdy.a, kdw.c, kea.c));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new keb(kdz.a, kdy.a, kdw.a, kea.a));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new keb(kdz.a, kdy.a, kdw.a, kea.c));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new keb(kdz.a, kdy.a, kdw.b, kea.a));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new keb(kdz.a, kdy.a, kdw.b, kea.c));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", new keb(kdz.b, kdy.b, kdw.a, kea.a));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", new keb(kdz.b, kdy.b, kdw.a, kea.c));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", new keb(kdz.b, kdy.b, kdw.b, kea.a));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", new keb(kdz.b, kdy.b, kdw.b, kea.c));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", new keb(kdz.c, kdy.c, kdw.a, kea.a));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", new keb(kdz.c, kdy.c, kdw.a, kea.c));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", new keb(kdz.c, kdy.c, kdw.b, kea.a));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", new keb(kdz.c, kdy.c, kdw.b, kea.c));
                kfyVar2.b(DesugarCollections.unmodifiableMap(hashMap2));
                kfz.a.a(kez.a);
                kfz.a.a(kez.b);
                kfu.a.a(kez.c, keb.class);
                kfm.a.b(kez.d, true);
                kfm.a.b(kez.e, false);
                return;
            }
            throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        }
        throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
    }
}
