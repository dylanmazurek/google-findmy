package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ket {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kgf d;
    public static final kuv e;
    public static final kuv f;
    public static final kuv g;
    public static final kuv h;
    public static final kuv i;
    public static final kuv j;
    private static final knb k;
    private static final knb l;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        k = b2;
        knb b3 = kgt.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        l = b3;
        a = new kgf((Object) kdt.class, kgl.class, (Object) new kgd() { // from class: kes
            @Override // defpackage.kgd
            public final kgo a(kag kagVar) {
                kdt kdtVar = (kdt) kagVar;
                kgf kgfVar = ket.a;
                ljh k2 = kji.d.k();
                if (!k2.b.y()) {
                    k2.t();
                }
                ((kji) k2.b).a = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
                ljh k3 = kim.c.k();
                ljh k4 = kiq.d.k();
                kiu kiuVar = (kiu) ket.i.o(kdtVar.b);
                if (!k4.b.y()) {
                    k4.t();
                }
                ((kiq) k4.b).a = kiuVar.a();
                kiv kivVar = (kiv) ket.h.o(kdtVar.c);
                if (!k4.b.y()) {
                    k4.t();
                }
                ((kiq) k4.b).b = kivVar.a();
                knb knbVar = kdtVar.g;
                if (knbVar != null && knbVar.a() > 0) {
                    lim t = lim.t(knbVar.c());
                    if (!k4.b.y()) {
                        k4.t();
                    }
                    ((kiq) k4.b).c = t;
                }
                kiq kiqVar = (kiq) k4.q();
                try {
                    byte[] w = ivc.w(kdtVar.f);
                    lja ljaVar = lja.a;
                    lkz lkzVar = lkz.a;
                    ljn m = ljn.m(kji.d, w, 0, w.length, lja.a);
                    ljn.A(m);
                    kji kjiVar = (kji) m;
                    ljh k5 = kil.c.k();
                    ljh k6 = kji.d.k();
                    String str = kjiVar.a;
                    if (!k6.b.y()) {
                        k6.t();
                    }
                    ljn ljnVar = k6.b;
                    str.getClass();
                    ((kji) ljnVar).a = str;
                    kjr kjrVar = kjr.TINK;
                    if (!ljnVar.y()) {
                        k6.t();
                    }
                    ((kji) k6.b).c = kjrVar.a();
                    lim limVar = kjiVar.b;
                    if (!k6.b.y()) {
                        k6.t();
                    }
                    kji kjiVar2 = (kji) k6.b;
                    limVar.getClass();
                    kjiVar2.b = limVar;
                    kji kjiVar3 = (kji) k6.q();
                    if (!k5.b.y()) {
                        k5.t();
                    }
                    kil kilVar = (kil) k5.b;
                    kjiVar3.getClass();
                    kilVar.b = kjiVar3;
                    kilVar.a |= 1;
                    kil kilVar2 = (kil) k5.q();
                    kdr kdrVar = kdtVar.d;
                    if (kdrVar == null) {
                        kdrVar = kdr.a;
                    }
                    ljh k7 = kin.e.k();
                    if (!k7.b.y()) {
                        k7.t();
                    }
                    ljn ljnVar2 = k7.b;
                    kin kinVar = (kin) ljnVar2;
                    kiqVar.getClass();
                    kinVar.b = kiqVar;
                    kinVar.a |= 1;
                    if (!ljnVar2.y()) {
                        k7.t();
                    }
                    kin kinVar2 = (kin) k7.b;
                    kilVar2.getClass();
                    kinVar2.c = kilVar2;
                    kinVar2.a |= 2;
                    kig kigVar = (kig) ket.j.o(kdrVar);
                    if (!k7.b.y()) {
                        k7.t();
                    }
                    ((kin) k7.b).d = kigVar.a();
                    kin kinVar3 = (kin) k7.q();
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    kim kimVar = (kim) k3.b;
                    kinVar3.getClass();
                    kimVar.b = kinVar3;
                    kimVar.a |= 1;
                    lim e2 = ((kim) k3.q()).e();
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    ((kji) k2.b).b = e2;
                    kjr kjrVar2 = (kjr) ket.g.o(kdtVar.e);
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    ((kji) k2.b).c = kjrVar2.a();
                    return kgl.a((kji) k2.q());
                } catch (ljy e3) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e3);
                }
            }
        });
        b = new kgf((Object) b2, kgl.class, (Object) new kby(10));
        e = new kuv(kdv.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b3, kgk.class, (Object) new kbz(9));
        f = new kuv(kdu.class, kgk.class, (byte[]) null);
        d = new kgf((Object) b2, kgk.class, (Object) new kbz(10));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kjr.RAW, kds.c, hashMap, hashMap2);
        iuu.u(kjr.TINK, kds.a, hashMap, hashMap2);
        iuu.u(kjr.LEGACY, kds.b, hashMap, hashMap2);
        iuu.u(kjr.CRUNCHY, kds.b, hashMap, hashMap2);
        g = iuu.G(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        iuu.u(kiv.SHA1, kdq.a, hashMap3, hashMap4);
        iuu.u(kiv.SHA224, kdq.b, hashMap3, hashMap4);
        iuu.u(kiv.SHA256, kdq.c, hashMap3, hashMap4);
        iuu.u(kiv.SHA384, kdq.d, hashMap3, hashMap4);
        iuu.u(kiv.SHA512, kdq.e, hashMap3, hashMap4);
        h = iuu.G(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        iuu.u(kiu.NIST_P256, kdp.a, hashMap5, hashMap6);
        iuu.u(kiu.NIST_P384, kdp.b, hashMap5, hashMap6);
        iuu.u(kiu.NIST_P521, kdp.c, hashMap5, hashMap6);
        iuu.u(kiu.CURVE25519, kdp.d, hashMap5, hashMap6);
        i = iuu.G(hashMap5, hashMap6);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        iuu.u(kig.UNCOMPRESSED, kdr.b, hashMap7, hashMap8);
        iuu.u(kig.COMPRESSED, kdr.a, hashMap7, hashMap8);
        iuu.u(kig.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, kdr.c, hashMap7, hashMap8);
        j = iuu.G(hashMap7, hashMap8);
    }

    public static kdt a(kjr kjrVar, kin kinVar) {
        ljh k2 = kji.d.k();
        kil kilVar = kinVar.c;
        if (kilVar == null) {
            kilVar = kil.c;
        }
        kji kjiVar = kilVar.b;
        if (kjiVar == null) {
            kjiVar = kji.d;
        }
        String str = kjiVar.a;
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar = k2.b;
        str.getClass();
        ((kji) ljnVar).a = str;
        kjr kjrVar2 = kjr.RAW;
        if (!ljnVar.y()) {
            k2.t();
        }
        ((kji) k2.b).c = kjrVar2.a();
        kil kilVar2 = kinVar.c;
        if (kilVar2 == null) {
            kilVar2 = kil.c;
        }
        kji kjiVar2 = kilVar2.b;
        if (kjiVar2 == null) {
            kjiVar2 = kji.d;
        }
        lim limVar = kjiVar2.b;
        if (!k2.b.y()) {
            k2.t();
        }
        kji kjiVar3 = (kji) k2.b;
        limVar.getClass();
        kjiVar3.b = limVar;
        kji kjiVar4 = (kji) k2.q();
        kdo kdoVar = new kdo();
        kdoVar.e = (kds) g.p(kjrVar);
        kuv kuvVar = i;
        kiq kiqVar = kinVar.b;
        if (kiqVar == null) {
            kiqVar = kiq.d;
        }
        kiu b2 = kiu.b(kiqVar.a);
        if (b2 == null) {
            b2 = kiu.UNRECOGNIZED;
        }
        kdoVar.a = (kdp) kuvVar.p(b2);
        kuv kuvVar2 = h;
        kiq kiqVar2 = kinVar.b;
        if (kiqVar2 == null) {
            kiqVar2 = kiq.d;
        }
        kiv b3 = kiv.b(kiqVar2.b);
        if (b3 == null) {
            b3 = kiv.UNRECOGNIZED;
        }
        kdoVar.b = (kdq) kuvVar2.p(b3);
        kdoVar.b(ivc.v(kjiVar4.g()));
        kiq kiqVar3 = kinVar.b;
        if (kiqVar3 == null) {
            kiqVar3 = kiq.d;
        }
        knb b4 = knb.b(kiqVar3.c.A());
        if (b4.a() == 0) {
            kdoVar.f = null;
        } else {
            kdoVar.f = b4;
        }
        kiq kiqVar4 = kinVar.b;
        if (kiqVar4 == null) {
            kiqVar4 = kiq.d;
        }
        kiu b5 = kiu.b(kiqVar4.a);
        if (b5 == null) {
            b5 = kiu.UNRECOGNIZED;
        }
        if (!b5.equals(kiu.CURVE25519)) {
            kuv kuvVar3 = j;
            kig b6 = kig.b(kinVar.d);
            if (b6 == null) {
                b6 = kig.UNRECOGNIZED;
            }
            kdoVar.c = (kdr) kuvVar3.p(b6);
        } else {
            kig b7 = kig.b(kinVar.d);
            if (b7 == null) {
                b7 = kig.UNRECOGNIZED;
            }
            if (!b7.equals(kig.COMPRESSED)) {
                throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
            }
        }
        return kdoVar.a();
    }
}
