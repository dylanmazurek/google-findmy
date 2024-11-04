package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kam {
    static {
        kjs kjsVar = kjs.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        kfz.a.b(kan.a);
        kfz.a.a(kan.b);
        khf.a();
        if (iuu.y(kaq.d)) {
            kgf kgfVar = kcj.a;
            kga kgaVar = kga.a;
            kgaVar.a(kcj.a);
            kgaVar.b(kcj.b);
            kgaVar.d(kcj.d);
            kgaVar.c(kcj.c);
            kfz.a.a(kaq.a);
            kfy kfyVar = kfy.a;
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", kcc.e);
            kdo kdoVar = new kdo((byte[]) null);
            kdoVar.d(16);
            kdoVar.e(32);
            kdoVar.g(16);
            kdoVar.f(16);
            kdoVar.d = kar.c;
            kdoVar.a = kas.c;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", kdoVar.c());
            hashMap.put("AES256_CTR_HMAC_SHA256", kcc.f);
            kdo kdoVar2 = new kdo((byte[]) null);
            kdoVar2.d(32);
            kdoVar2.e(32);
            kdoVar2.g(32);
            kdoVar2.f(16);
            kdoVar2.d = kar.c;
            kdoVar2.a = kas.c;
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", kdoVar2.c());
            kfyVar.b(DesugarCollections.unmodifiableMap(hashMap));
            kfw.a.a(kaq.b, kat.class);
            kfu.a.a(kaq.c, kat.class);
            kfm.a.c(kaq.e, kaq.d, true);
            if (iuu.y(kbb.d)) {
                kgf kgfVar2 = kcn.a;
                kga kgaVar2 = kga.a;
                kgaVar2.a(kcn.a);
                kgaVar2.b(kcn.b);
                kgaVar2.d(kcn.d);
                kgaVar2.c(kcn.c);
                kfz.a.a(kbb.a);
                kfy kfyVar2 = kfy.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM", kcc.a);
                lzt lztVar = new lzt((byte[]) null, (byte[]) null);
                lztVar.j();
                lztVar.k(16);
                lztVar.l();
                lztVar.a = kbc.c;
                hashMap2.put("AES128_GCM_RAW", lztVar.i());
                hashMap2.put("AES256_GCM", kcc.b);
                lzt lztVar2 = new lzt((byte[]) null, (byte[]) null);
                lztVar2.j();
                lztVar2.k(32);
                lztVar2.l();
                lztVar2.a = kbc.c;
                hashMap2.put("AES256_GCM_RAW", lztVar2.i());
                kfyVar2.b(DesugarCollections.unmodifiableMap(hashMap2));
                kfw.a.a(kbb.b, kbd.class);
                kfu.a.a(kbb.c, kbd.class);
                kfm.a.c(kbb.e, kbb.d, true);
                if (kdd.a()) {
                    return;
                }
                kgf kgfVar3 = kaw.a;
                if (iuu.y(1)) {
                    kgf kgfVar4 = kck.a;
                    kga kgaVar3 = kga.a;
                    kgaVar3.a(kck.a);
                    kgaVar3.b(kck.b);
                    kgaVar3.d(kck.d);
                    kgaVar3.c(kck.c);
                    kfz.a.a(kaw.a);
                    kfy kfyVar3 = kfy.a;
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("AES128_EAX", kcc.c);
                    lzt lztVar3 = new lzt((char[]) null, (byte[]) null);
                    lztVar3.n(16);
                    lztVar3.o(16);
                    lztVar3.p();
                    lztVar3.c = kax.c;
                    hashMap3.put("AES128_EAX_RAW", lztVar3.m());
                    hashMap3.put("AES256_EAX", kcc.d);
                    lzt lztVar4 = new lzt((char[]) null, (byte[]) null);
                    lztVar4.n(16);
                    lztVar4.o(32);
                    lztVar4.p();
                    lztVar4.c = kax.c;
                    hashMap3.put("AES256_EAX_RAW", lztVar4.m());
                    kfyVar3.b(DesugarCollections.unmodifiableMap(hashMap3));
                    kfu.a.a(kaw.b, kay.class);
                    kfm.a.b(kaw.c, true);
                    kgf kgfVar5 = kbf.a;
                    if (iuu.y(1)) {
                        kgf kgfVar6 = kco.a;
                        kga kgaVar4 = kga.a;
                        kgaVar4.a(kco.a);
                        kgaVar4.b(kco.b);
                        kgaVar4.d(kco.d);
                        kgaVar4.c(kco.c);
                        if (kbf.a()) {
                            kfz.a.a(kbf.a);
                            kfy kfyVar4 = kfy.a;
                            HashMap hashMap4 = new HashMap();
                            lyn lynVar = new lyn((byte[]) null, (byte[]) null);
                            lynVar.g(16);
                            lynVar.b = kbg.a;
                            hashMap4.put("AES128_GCM_SIV", lynVar.f());
                            lyn lynVar2 = new lyn((byte[]) null, (byte[]) null);
                            lynVar2.g(16);
                            lynVar2.b = kbg.c;
                            hashMap4.put("AES128_GCM_SIV_RAW", lynVar2.f());
                            lyn lynVar3 = new lyn((byte[]) null, (byte[]) null);
                            lynVar3.g(32);
                            lynVar3.b = kbg.a;
                            hashMap4.put("AES256_GCM_SIV", lynVar3.f());
                            lyn lynVar4 = new lyn((byte[]) null, (byte[]) null);
                            lynVar4.g(32);
                            lynVar4.b = kbg.c;
                            hashMap4.put("AES256_GCM_SIV_RAW", lynVar4.f());
                            kfyVar4.b(DesugarCollections.unmodifiableMap(hashMap4));
                            kfw.a.a(kbf.c, kbh.class);
                            kfu.a.a(kbf.b, kbh.class);
                            kfm.a.b(kbf.d, true);
                        }
                        kgf kgfVar7 = kbj.a;
                        if (iuu.y(1)) {
                            kgf kgfVar8 = kcr.a;
                            kga kgaVar5 = kga.a;
                            kgaVar5.a(kcr.a);
                            kgaVar5.b(kcr.b);
                            kgaVar5.d(kcr.d);
                            kgaVar5.c(kcr.c);
                            kfz.a.a(kbj.a);
                            kfu.a.a(kbj.b, kbl.class);
                            kfy kfyVar5 = kfy.a;
                            HashMap hashMap5 = new HashMap();
                            hashMap5.put("CHACHA20_POLY1305", new kbl(kbk.a));
                            hashMap5.put("CHACHA20_POLY1305_RAW", new kbl(kbk.c));
                            kfyVar5.b(DesugarCollections.unmodifiableMap(hashMap5));
                            kfm.a.b(kbj.c, true);
                            kgf kgfVar9 = kbm.a;
                            if (iuu.y(1)) {
                                kgf kgfVar10 = kbs.a;
                                kga kgaVar6 = kga.a;
                                kgaVar6.a(kbs.a);
                                kgaVar6.b(kbs.b);
                                kgaVar6.d(kbs.d);
                                kgaVar6.c(kbs.c);
                                kfz.a.a(kbm.a);
                                kfu.a.a(kbm.b, kbr.class);
                                kfm.a.b(kbm.c, true);
                                kft kftVar = kbo.a;
                                if (iuu.y(1)) {
                                    kgf kgfVar11 = kca.a;
                                    kga kgaVar7 = kga.a;
                                    kgaVar7.a(kca.a);
                                    kgaVar7.b(kca.b);
                                    kgaVar7.d(kca.d);
                                    kgaVar7.c(kca.c);
                                    kfu.a.a(kbo.a, kbw.class);
                                    kfz.a.a(kbo.b);
                                    kfm.a.b(kbo.c, true);
                                    kgf kgfVar12 = kce.a;
                                    if (iuu.y(1)) {
                                        kgf kgfVar13 = kda.a;
                                        kga kgaVar8 = kga.a;
                                        kgaVar8.a(kda.a);
                                        kgaVar8.b(kda.b);
                                        kgaVar8.d(kda.d);
                                        kgaVar8.c(kda.c);
                                        kfz.a.a(kce.a);
                                        kfy kfyVar6 = kfy.a;
                                        HashMap hashMap6 = new HashMap();
                                        hashMap6.put("XCHACHA20_POLY1305", new kcg(kcf.a));
                                        hashMap6.put("XCHACHA20_POLY1305_RAW", new kcg(kcf.c));
                                        kfyVar6.b(DesugarCollections.unmodifiableMap(hashMap6));
                                        kfu.a.a(kce.c, kcg.class);
                                        kfw.a.a(kce.b, kcg.class);
                                        kfm.a.b(kce.d, true);
                                        return;
                                    }
                                    throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
                                }
                                throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
                            }
                            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
                        }
                        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
                    }
                    throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
                }
                throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
            }
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
