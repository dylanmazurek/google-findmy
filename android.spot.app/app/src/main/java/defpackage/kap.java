package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kap implements kge {
    private final /* synthetic */ int a;

    @Override // defpackage.kge
    public final Object a(ivc ivcVar) {
        byte[] c;
        byte[] bArr;
        byte[] c2;
        kmh kmhVar;
        switch (this.a) {
            case 0:
                return kmk.a((kao) ivcVar);
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
                kjr kjrVar = W.e;
                int ordinal = kjrVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(kjrVar))));
                            }
                        } else {
                            c = kgb.a.c();
                        }
                    }
                    c = kgb.a(kfpVar.V().intValue()).c();
                } else {
                    c = kgb.b(kfpVar.V().intValue()).c();
                }
                return new kcz(c);
            case 2:
                kau kauVar = (kau) ivcVar;
                int i = kma.a;
                if (iuu.y(1)) {
                    kay kayVar = kauVar.a;
                    ktd ktdVar = kauVar.c;
                    knb knbVar = kauVar.b;
                    byte[] X = ktdVar.X();
                    knbVar.c();
                    return new kma(X, kayVar.b);
                }
                throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
            case 3:
                kaz kazVar = (kaz) ivcVar;
                return new kcz(kazVar.b.X(), kazVar.a);
            case 4:
                kbe kbeVar = (kbe) ivcVar;
                ktd ktdVar2 = kbeVar.b;
                knb knbVar2 = kbeVar.a;
                byte[] X2 = ktdVar2.X();
                knbVar2.c();
                return new kdc(X2);
            case 5:
                kbi kbiVar = (kbi) ivcVar;
                kgf kgfVar = kbj.a;
                if (kcq.b()) {
                    ktd ktdVar3 = kbiVar.b;
                    knb knbVar3 = kbiVar.a;
                    byte[] X3 = ktdVar3.X();
                    knbVar3.c();
                    return new kcq(X3);
                }
                ktd ktdVar4 = kbiVar.b;
                knb knbVar4 = kbiVar.a;
                byte[] X4 = ktdVar4.X();
                knbVar4.c();
                return new kcz(X4, (char[]) null);
            case 6:
                kbp kbpVar = (kbp) ivcVar;
                kbr kbrVar = kbpVar.a;
                kgf kgfVar2 = kbm.a;
                kae.a(kbrVar.a).b();
                return kcz.a(kbpVar.b);
            case 7:
                kbt kbtVar = (kbt) ivcVar;
                kbw kbwVar = kbtVar.a;
                kft kftVar = kbo.a;
                kae.a(kbwVar.b).b();
                int i2 = kbn.a;
                try {
                    byte[] w = ivc.w(kbwVar.c);
                    lja ljaVar = lja.a;
                    lkz lkzVar = lkz.a;
                    ljn m = ljn.m(kji.d, w, 0, w.length, lja.a);
                    ljn.A(m);
                    new kbn((kji) m);
                    return kcz.a(kbtVar.b);
                } catch (ljy e) {
                    throw new GeneralSecurityException(e);
                }
            case 8:
                kcd kcdVar = (kcd) ivcVar;
                kgf kgfVar3 = kce.a;
                if (kcz.b()) {
                    ktd ktdVar5 = kcdVar.b;
                    knb knbVar5 = kcdVar.a;
                    byte[] X5 = ktdVar5.X();
                    knbVar5.c();
                    return new kcz(X5, (byte[]) null);
                }
                ktd ktdVar6 = kcdVar.b;
                knb knbVar6 = kcdVar.a;
                byte[] X6 = ktdVar6.X();
                knbVar6.c();
                return new kcz(X6, (short[]) null);
            case 9:
                kde kdeVar = (kde) ivcVar;
                kdh kdhVar = kdeVar.a;
                kgf kgfVar4 = kdf.a;
                int i3 = kdhVar.a;
                if (i3 == 64) {
                    return kmc.a(kdeVar);
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + i3 + ". Valid keys must have 64 bytes.");
            case 10:
                kfp kfpVar2 = (kfp) ivcVar;
                kgk W2 = kfpVar2.W();
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
                kjr kjrVar2 = W2.e;
                int ordinal2 = kjrVar2.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                throw new GeneralSecurityException(der.g(kjrVar2, "unknown output prefix type "));
                            }
                        } else {
                            kgb.a.c();
                        }
                    }
                    kgb.a(kfpVar2.V().intValue()).c();
                } else {
                    kgb.b(kfpVar2.V().intValue()).c();
                }
                return new kdm();
            case 11:
                kdu kduVar = (kdu) ivcVar;
                jql.w((kmh) kme.a.o(kduVar.V().b), iuu.v((BigInteger) kduVar.a.a));
                if (kduVar.V().g != null) {
                    kduVar.V().g.c();
                }
                kme.b(kduVar.V().c);
                ker.a(kduVar.V());
                kduVar.Y().c();
                return new kew();
            case 12:
                kdv kdvVar = (kdv) ivcVar;
                ECPublicKey y = jql.y((kmh) kme.a.o(kdvVar.a.b), kdvVar.b.getAffineX().toByteArray(), kdvVar.b.getAffineY().toByteArray());
                knb knbVar7 = kdvVar.a.g;
                byte[] bArr2 = new byte[0];
                if (knbVar7 != null) {
                    bArr = knbVar7.c();
                } else {
                    bArr = bArr2;
                }
                return new kme(y, bArr, kme.b(kdvVar.a.c), (kmj) kme.b.o(kdvVar.a.d), ker.a(kdvVar.a), kdvVar.d.c());
            case 13:
                kfp kfpVar3 = (kfp) ivcVar;
                kgk W3 = kfpVar3.W();
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
                kjr kjrVar3 = W3.e;
                int ordinal3 = kjrVar3.ordinal();
                if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        if (ordinal3 != 3) {
                            if (ordinal3 != 4) {
                                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(kjrVar3))));
                            }
                        } else {
                            kgb.a.c();
                        }
                    }
                    kgb.a(kfpVar3.V().intValue()).c();
                } else {
                    kgb.b(kfpVar3.V().intValue()).c();
                }
                return new kew();
            case 14:
                kfp kfpVar4 = (kfp) ivcVar;
                kgk W4 = kfpVar4.W();
                ljh k4 = kjh.d.k();
                String str4 = W4.a;
                if (!k4.b.y()) {
                    k4.t();
                }
                ljn ljnVar7 = k4.b;
                str4.getClass();
                ((kjh) ljnVar7).a = str4;
                lim limVar4 = W4.c;
                if (!ljnVar7.y()) {
                    k4.t();
                }
                ljn ljnVar8 = k4.b;
                limVar4.getClass();
                ((kjh) ljnVar8).b = limVar4;
                kjg kjgVar4 = W4.d;
                if (!ljnVar8.y()) {
                    k4.t();
                }
                ((kjh) k4.b).c = kjgVar4.a();
                kaa kaaVar = (kaa) kaj.b((kjh) k4.q(), kaa.class);
                kjr kjrVar4 = W4.e;
                int ordinal4 = kjrVar4.ordinal();
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        if (ordinal4 != 3) {
                            if (ordinal4 != 4) {
                                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(kjrVar4))));
                            }
                        } else {
                            c2 = kgb.a.c();
                        }
                    }
                    c2 = kgb.a(kfpVar4.V().intValue()).c();
                } else {
                    c2 = kgb.b(kfpVar4.V().intValue()).c();
                }
                return new kfb(kaaVar, c2);
            case 15:
                kec kecVar = (kec) ivcVar;
                keb V = kecVar.V();
                kex.c(V.a);
                kex.d(V.b);
                kex.b(V.c);
                kdz kdzVar = V.a;
                if (!kdzVar.equals(kdz.f) && !kdzVar.equals(kdz.a) && !kdzVar.equals(kdz.b) && !kdzVar.equals(kdz.c)) {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                kdz kdzVar2 = kecVar.V().a;
                if (kdzVar2.equals(kdz.f)) {
                    byte[] X7 = kecVar.b.X();
                    byte[] b = kne.b(X7);
                    knb.b(X7);
                    knb.b(b);
                } else {
                    if (!kdzVar2.equals(kdz.a) && !kdzVar2.equals(kdz.b) && !kdzVar2.equals(kdz.c)) {
                        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    }
                    ktd ktdVar7 = kecVar.b;
                    kef kefVar = kecVar.a;
                    byte[] X8 = ktdVar7.X();
                    byte[] c3 = kefVar.b.c();
                    if (kdzVar2.equals(kdz.a)) {
                        kmhVar = kmh.NIST_P256;
                    } else if (kdzVar2.equals(kdz.b)) {
                        kmhVar = kmh.NIST_P384;
                    } else if (kdzVar2.equals(kdz.c)) {
                        kmhVar = kmh.NIST_P521;
                    } else {
                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                    ECPublicKey x = jql.x(kmhVar, kmj.UNCOMPRESSED, c3);
                    ECPrivateKey w2 = jql.w(kmhVar, X8);
                    jql.C(x, w2);
                    kfk.f(x.getW(), w2.getParams().getCurve());
                    knb.b(X8);
                    knb.b(c3);
                }
                return new kew(kecVar.Y());
            case 16:
                kef kefVar2 = (kef) ivcVar;
                keb kebVar = kefVar2.a;
                return new kex(kefVar2.b, kex.c(kebVar.a), kex.d(kebVar.b), kex.b(kebVar.c), kefVar2.c);
            case 17:
                kgv.a(((kgu) ivcVar).a);
                return new khj();
            case 18:
                kgu kguVar = (kgu) ivcVar;
                kgv.a(kguVar.a);
                return new kmw(kguVar);
            case 19:
                return new khj((char[]) null);
            default:
                return new kmw((kha) ivcVar);
        }
    }
}
