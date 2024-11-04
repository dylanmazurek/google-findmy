package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kkk implements kge {
    private final /* synthetic */ int a;

    public /* synthetic */ kkk(int i) {
        this.a = i;
    }

    @Override // defpackage.kge
    public final Object a(ivc ivcVar) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.a) {
            case 0:
                return kmx.b((kki) ivcVar);
            case 1:
                kfp kfpVar = (kfp) ivcVar;
                kgk W = kfpVar.W();
                ljh k = kjh.d.k();
                String str = W.a;
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                str.getClass();
                ((kjh) ljnVar).a = str;
                lim limVar = W.c;
                if (!ljnVar.y()) {
                    k.t();
                }
                ljn ljnVar2 = k.b;
                limVar.getClass();
                ((kjh) ljnVar2).b = limVar;
                kjg kjgVar = W.d;
                if (!ljnVar2.y()) {
                    k.t();
                }
                ((kjh) k.b).c = kjgVar.a();
                int ordinal = W.e.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            kgb.a.c();
                        }
                    }
                    kgb.a(kfpVar.V().intValue()).c();
                } else {
                    kgb.b(kfpVar.V().intValue()).c();
                }
                return new khl();
            case 2:
                return kmd.b((kkj) ivcVar);
            case 3:
                kko kkoVar = (kko) ivcVar;
                byte[] X = kkoVar.b.X();
                kkoVar.X().c();
                kkoVar.a.a.a.equals(kkm.c);
                return new kmf(X);
            case 4:
                kkq kkqVar = (kkq) ivcVar;
                if (iuu.y(1)) {
                    knb knbVar = kkqVar.b;
                    knb knbVar2 = kkqVar.c;
                    kkm kkmVar = kkqVar.a.a;
                    byte[] c = knbVar.c();
                    byte[] c2 = knbVar2.c();
                    if (kkmVar.equals(kkm.c)) {
                        bArr = new byte[]{0};
                    } else {
                        bArr = new byte[0];
                    }
                    return new kmg(c, c2, bArr, 0);
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 5:
                kgk W2 = ((kfp) ivcVar).W();
                ljh k2 = kjh.d.k();
                String str2 = W2.a;
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar3 = k2.b;
                str2.getClass();
                ((kjh) ljnVar3).a = str2;
                lim limVar2 = W2.c;
                if (!ljnVar3.y()) {
                    k2.t();
                }
                ljn ljnVar4 = k2.b;
                limVar2.getClass();
                ((kjh) ljnVar4).b = limVar2;
                kjg kjgVar2 = W2.d;
                if (!ljnVar4.y()) {
                    k2.t();
                }
                ((kjh) k2.b).c = kjgVar2.a();
                kmg.c(W2);
                kmg.b(W2);
                return new klr();
            case 6:
                kgk W3 = ((kfp) ivcVar).W();
                ljh k3 = kjh.d.k();
                String str3 = W3.a;
                if (!k3.b.y()) {
                    k3.t();
                }
                ljn ljnVar5 = k3.b;
                str3.getClass();
                ((kjh) ljnVar5).a = str3;
                lim limVar3 = W3.c;
                if (!ljnVar5.y()) {
                    k3.t();
                }
                ljn ljnVar6 = k3.b;
                limVar3.getClass();
                ((kjh) ljnVar6).b = limVar3;
                kjg kjgVar3 = W3.d;
                if (!ljnVar6.y()) {
                    k3.t();
                }
                ((kjh) k3.b).c = kjgVar3.a();
                return new kmg((kai) kaj.b((kjh) k3.q(), kai.class), kmg.c(W3), kmg.b(W3), 1);
            case 7:
                return kmx.a((kla) ivcVar);
            case 8:
                return kmy.b((klb) ivcVar);
            case 9:
                klh klhVar = (klh) ivcVar;
                KeyFactory keyFactory = (KeyFactory) kmn.g.a("RSA");
                kli kliVar = klhVar.a;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(kliVar.b, klhVar.V().c, (BigInteger) klhVar.b.a, (BigInteger) klhVar.c.a, (BigInteger) klhVar.d.a, (BigInteger) klhVar.e.a, (BigInteger) klhVar.f.a, (BigInteger) klhVar.g.a));
                klg V = klhVar.V();
                kmq kmqVar = (kmq) kmz.a.o(V.e);
                klhVar.X().c();
                klhVar.V().d.equals(klf.c);
                return new klr(rSAPrivateCrtKey, kmqVar);
            default:
                kli kliVar2 = (kli) ivcVar;
                kuv kuvVar = kmz.a;
                RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) kmn.g.a("RSA")).generatePublic(new RSAPublicKeySpec(kliVar2.b, kliVar2.a.c));
                klg klgVar = kliVar2.a;
                kmq kmqVar2 = (kmq) kmz.a.o(klgVar.e);
                kmq kmqVar3 = (kmq) kmz.a.o(klgVar.f);
                knb knbVar3 = kliVar2.c;
                klf klfVar = kliVar2.a.d;
                byte[] c3 = knbVar3.c();
                if (klfVar.equals(klf.c)) {
                    bArr2 = new byte[]{0};
                } else {
                    bArr2 = new byte[0];
                }
                return new kmz(rSAPublicKey, kmqVar2, kmqVar3, klgVar.g, c3, bArr2);
        }
    }
}
