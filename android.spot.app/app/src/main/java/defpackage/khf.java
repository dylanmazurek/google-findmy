package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khf {
    static {
        kjs kjsVar = kjs.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        kfz.a.b(khg.a);
        kfz.a.a(khg.b);
        kfz.a.b(kgz.a);
        if (iuu.y(khb.e)) {
            kgf kgfVar = khk.a;
            kga kgaVar = kga.a;
            kgaVar.a(khk.a);
            kgaVar.b(khk.b);
            kgaVar.d(khk.d);
            kgaVar.c(khk.c);
            kfz.a.a(khb.a);
            kfz.a.a(khb.b);
            kfy kfyVar = kfy.a;
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", khh.a);
            lzt lztVar = new lzt(null);
            lztVar.g(32);
            lztVar.h(16);
            lztVar.c = khd.d;
            lztVar.a = khc.c;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", lztVar.f());
            lzt lztVar2 = new lzt(null);
            lztVar2.g(32);
            lztVar2.h(32);
            lztVar2.c = khd.a;
            lztVar2.a = khc.c;
            hashMap.put("HMAC_SHA256_256BITTAG", lztVar2.f());
            lzt lztVar3 = new lzt(null);
            lztVar3.g(32);
            lztVar3.h(32);
            lztVar3.c = khd.d;
            lztVar3.a = khc.c;
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", lztVar3.f());
            lzt lztVar4 = new lzt(null);
            lztVar4.g(64);
            lztVar4.h(16);
            lztVar4.c = khd.a;
            lztVar4.a = khc.e;
            hashMap.put("HMAC_SHA512_128BITTAG", lztVar4.f());
            lzt lztVar5 = new lzt(null);
            lztVar5.g(64);
            lztVar5.h(16);
            lztVar5.c = khd.d;
            lztVar5.a = khc.e;
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", lztVar5.f());
            lzt lztVar6 = new lzt(null);
            lztVar6.g(64);
            lztVar6.h(32);
            lztVar6.c = khd.a;
            lztVar6.a = khc.e;
            hashMap.put("HMAC_SHA512_256BITTAG", lztVar6.f());
            lzt lztVar7 = new lzt(null);
            lztVar7.g(64);
            lztVar7.h(32);
            lztVar7.c = khd.d;
            lztVar7.a = khc.e;
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", lztVar7.f());
            hashMap.put("HMAC_SHA512_512BITTAG", khh.b);
            lzt lztVar8 = new lzt(null);
            lztVar8.g(64);
            lztVar8.h(64);
            lztVar8.c = khd.d;
            lztVar8.a = khc.e;
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", lztVar8.f());
            kfyVar.b(DesugarCollections.unmodifiableMap(hashMap));
            kfu.a.a(khb.d, khe.class);
            kfw.a.a(khb.c, khe.class);
            kfm.a.c(khb.f, khb.e, true);
            if (kdd.a()) {
                return;
            }
            kft kftVar = kgv.a;
            if (iuu.y(1)) {
                kgf kgfVar2 = khi.a;
                kga kgaVar2 = kga.a;
                kgaVar2.a(khi.a);
                kgaVar2.b(khi.b);
                kgaVar2.d(khi.d);
                kgaVar2.c(khi.c);
                kfu.a.a(kgv.a, kgx.class);
                kfz.a.a(kgv.b);
                kfz.a.a(kgv.c);
                kfy kfyVar2 = kfy.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES_CMAC", khh.c);
                hashMap2.put("AES256_CMAC", khh.c);
                mep mepVar = new mep(null);
                mepVar.b(32);
                mepVar.c(16);
                mepVar.c = kgw.d;
                hashMap2.put("AES256_CMAC_RAW", mepVar.a());
                kfyVar2.b(DesugarCollections.unmodifiableMap(hashMap2));
                kfm.a.b(kgv.d, true);
                return;
            }
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
