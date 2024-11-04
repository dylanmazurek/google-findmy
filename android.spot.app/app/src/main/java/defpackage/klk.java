package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klk {
    static {
        kjs kjsVar = kjs.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        kfz.a.b(kkt.a);
        kfz.a.a(kkt.b);
        kfz.a.b(kkv.a);
        kfz.a.a(kkv.b);
        if (iuu.y(kkl.d)) {
            kgf kgfVar = klp.a;
            kga kgaVar = kga.a;
            kgaVar.a(klp.a);
            kgaVar.b(klp.b);
            kgaVar.d(klp.e);
            kgaVar.c(klp.c);
            kgaVar.d(klp.f);
            kgaVar.c(klp.d);
            kfy kfyVar = kfy.a;
            HashMap hashMap = new HashMap();
            hashMap.put("ECDSA_P256", kks.a);
            hashMap.put("ECDSA_P256_IEEE_P1363", kks.d);
            kke kkeVar = kke.a;
            hashMap.put("ECDSA_P256_RAW", jql.O(kkf.a, kkd.a, kkeVar, kkg.d));
            hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", kks.f);
            hashMap.put("ECDSA_P384", kks.b);
            hashMap.put("ECDSA_P384_IEEE_P1363", kks.e);
            kke kkeVar2 = kke.c;
            hashMap.put("ECDSA_P384_SHA512", jql.O(kkf.b, kkd.b, kkeVar2, kkg.a));
            kke kkeVar3 = kke.b;
            hashMap.put("ECDSA_P384_SHA384", jql.O(kkf.b, kkd.b, kkeVar3, kkg.a));
            hashMap.put("ECDSA_P521", kks.c);
            hashMap.put("ECDSA_P521_IEEE_P1363", kks.g);
            kfyVar.b(DesugarCollections.unmodifiableMap(hashMap));
            kfz.a.a(kkl.a);
            kfz.a.a(kkl.b);
            kfu.a.a(kkl.c, kkh.class);
            kfm.a.c(kkl.e, kkl.d, true);
            kfm.a.c(kkl.f, kkl.d, false);
            if (iuu.y(klc.d)) {
                kgf kgfVar2 = klt.a;
                kga kgaVar2 = kga.a;
                kgaVar2.a(klt.a);
                kgaVar2.b(klt.b);
                kgaVar2.d(klt.e);
                kgaVar2.c(klt.c);
                kgaVar2.d(klt.f);
                kgaVar2.c(klt.d);
                kfy kfyVar2 = kfy.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", kks.h);
                BigInteger bigInteger = kkz.a;
                kkw kkwVar = new kkw();
                kkwVar.b = kkx.a;
                kkwVar.b(3072);
                kkwVar.a = kkz.a;
                kkwVar.c = kky.d;
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", kkwVar.a());
                hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", kks.i);
                hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", kks.j);
                kkw kkwVar2 = new kkw();
                kkwVar2.b = kkx.c;
                kkwVar2.b(4096);
                kkwVar2.a = kkz.a;
                kkwVar2.c = kky.d;
                hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", kkwVar2.a());
                kfyVar2.b(hashMap2);
                kfz.a.a(klc.a);
                kfz.a.a(klc.b);
                kfu.a.a(klc.c, kkz.class);
                kfm.a.c(klc.e, klc.d, true);
                kfm.a.c(klc.f, klc.d, false);
                if (kdd.a()) {
                    return;
                }
                kgf kgfVar3 = klj.a;
                if (iuu.y(1)) {
                    kgf kgfVar4 = klv.a;
                    kga kgaVar3 = kga.a;
                    kgaVar3.a(klv.a);
                    kgaVar3.b(klv.b);
                    kgaVar3.d(klv.e);
                    kgaVar3.c(klv.c);
                    kgaVar3.d(klv.f);
                    kgaVar3.c(klv.d);
                    kfy kfyVar3 = kfy.a;
                    HashMap hashMap3 = new HashMap();
                    BigInteger bigInteger2 = klg.a;
                    kld kldVar = new kld();
                    kle kleVar = kle.a;
                    kldVar.b = kleVar;
                    kldVar.c = kleVar;
                    kldVar.c(32);
                    kldVar.b(3072);
                    kldVar.a = klg.a;
                    kldVar.d = klf.a;
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", kldVar.a());
                    kld kldVar2 = new kld();
                    kle kleVar2 = kle.a;
                    kldVar2.b = kleVar2;
                    kldVar2.c = kleVar2;
                    kldVar2.c(32);
                    kldVar2.b(3072);
                    kldVar2.a = klg.a;
                    kldVar2.d = klf.d;
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", kldVar2.a());
                    hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", kks.k);
                    kld kldVar3 = new kld();
                    kle kleVar3 = kle.c;
                    kldVar3.b = kleVar3;
                    kldVar3.c = kleVar3;
                    kldVar3.c(64);
                    kldVar3.b(4096);
                    kldVar3.a = klg.a;
                    kldVar3.d = klf.a;
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", kldVar3.a());
                    kld kldVar4 = new kld();
                    kle kleVar4 = kle.c;
                    kldVar4.b = kleVar4;
                    kldVar4.c = kleVar4;
                    kldVar4.c(64);
                    kldVar4.b(4096);
                    kldVar4.a = klg.a;
                    kldVar4.d = klf.d;
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", kldVar4.a());
                    hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", kks.l);
                    kfyVar3.b(DesugarCollections.unmodifiableMap(hashMap3));
                    kfz.a.a(klj.a);
                    kfz.a.a(klj.b);
                    kfu.a.a(klj.c, klg.class);
                    kfm.a.b(klj.d, true);
                    kfm.a.b(klj.e, false);
                    kgf kgfVar5 = kkp.a;
                    if (iuu.y(1)) {
                        kgf kgfVar6 = klq.a;
                        kga kgaVar4 = kga.a;
                        kgaVar4.a(klq.a);
                        kgaVar4.b(klq.b);
                        kgaVar4.d(klq.e);
                        kgaVar4.c(klq.c);
                        kgaVar4.d(klq.f);
                        kgaVar4.c(klq.d);
                        kfy kfyVar4 = kfy.a;
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("ED25519", new kkn(kkm.a));
                        hashMap4.put("ED25519_RAW", new kkn(kkm.d));
                        hashMap4.put("ED25519WithRawOutput", new kkn(kkm.d));
                        kfyVar4.b(DesugarCollections.unmodifiableMap(hashMap4));
                        kfu.a.a(kkp.d, kkn.class);
                        kfw.a.a(kkp.c, kkn.class);
                        kfz.a.a(kkp.a);
                        kfz.a.a(kkp.b);
                        kfm.a.b(kkp.e, true);
                        kfm.a.b(kkp.f, false);
                        return;
                    }
                    throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
                }
                throw new GeneralSecurityException("Registering RSA SSA PSS is not supported in FIPS mode");
            }
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
    }
}
