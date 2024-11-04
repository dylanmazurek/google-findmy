package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcj {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kuv d;
    private static final knb e;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        e = b2;
        a = new kgf((Object) kat.class, kgl.class, (Object) new kgd() { // from class: kch
            @Override // defpackage.kgd
            public final kgo a(kag kagVar) {
                kiv kivVar;
                kjr kjrVar;
                kat katVar = (kat) kagVar;
                kgf kgfVar = kcj.a;
                ljh k = kji.d.k();
                if (!k.b.y()) {
                    k.t();
                }
                ((kji) k.b).a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                ljh k2 = khr.d.k();
                ljh k3 = kht.d.k();
                ljh k4 = khu.b.k();
                int i = katVar.c;
                if (!k4.b.y()) {
                    k4.t();
                }
                ((khu) k4.b).a = i;
                khu khuVar = (khu) k4.q();
                if (!k3.b.y()) {
                    k3.t();
                }
                ljn ljnVar = k3.b;
                kht khtVar = (kht) ljnVar;
                khuVar.getClass();
                khtVar.b = khuVar;
                khtVar.a |= 1;
                int i2 = katVar.a;
                if (!ljnVar.y()) {
                    k3.t();
                }
                ((kht) k3.b).c = i2;
                kht khtVar2 = (kht) k3.q();
                if (!k2.b.y()) {
                    k2.t();
                }
                khr khrVar = (khr) k2.b;
                khtVar2.getClass();
                khrVar.b = khtVar2;
                khrVar.a |= 1;
                ljh k5 = kix.e.k();
                ljh k6 = kiy.c.k();
                int i3 = katVar.d;
                if (!k6.b.y()) {
                    k6.t();
                }
                ((kiy) k6.b).b = i3;
                kar karVar = katVar.f;
                if (kar.a.equals(karVar)) {
                    kivVar = kiv.SHA1;
                } else if (kar.b.equals(karVar)) {
                    kivVar = kiv.SHA224;
                } else if (kar.c.equals(karVar)) {
                    kivVar = kiv.SHA256;
                } else if (kar.d.equals(karVar)) {
                    kivVar = kiv.SHA384;
                } else if (kar.e.equals(karVar)) {
                    kivVar = kiv.SHA512;
                } else {
                    throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(karVar))));
                }
                if (!k6.b.y()) {
                    k6.t();
                }
                ((kiy) k6.b).a = kivVar.a();
                kiy kiyVar = (kiy) k6.q();
                if (!k5.b.y()) {
                    k5.t();
                }
                ljn ljnVar2 = k5.b;
                kix kixVar = (kix) ljnVar2;
                kiyVar.getClass();
                kixVar.b = kiyVar;
                kixVar.a |= 1;
                int i4 = katVar.b;
                if (!ljnVar2.y()) {
                    k5.t();
                }
                ((kix) k5.b).c = i4;
                kix kixVar2 = (kix) k5.q();
                if (!k2.b.y()) {
                    k2.t();
                }
                khr khrVar2 = (khr) k2.b;
                kixVar2.getClass();
                khrVar2.c = kixVar2;
                khrVar2.a |= 2;
                lim e2 = ((khr) k2.q()).e();
                if (!k.b.y()) {
                    k.t();
                }
                ((kji) k.b).b = e2;
                kas kasVar = katVar.e;
                if (kas.a.equals(kasVar)) {
                    kjrVar = kjr.TINK;
                } else if (kas.b.equals(kasVar)) {
                    kjrVar = kjr.CRUNCHY;
                } else if (kas.c.equals(kasVar)) {
                    kjrVar = kjr.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(kasVar))));
                }
                if (!k.b.y()) {
                    k.t();
                }
                ((kji) k.b).c = kjrVar.a();
                return kgl.a((kji) k.q());
            }
        });
        b = new kgf((Object) b2, kgl.class, (Object) new kby(2));
        d = new kuv(kao.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b2, kgk.class, (Object) new kfn() { // from class: kci
            @Override // defpackage.kfn
            public final ivc a(kgo kgoVar) {
                kgf kgfVar = kcj.a;
                if (((kgk) kgoVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        lim limVar = ((kgk) kgoVar).c;
                        lja ljaVar = lja.a;
                        lkz lkzVar = lkz.a;
                        lja ljaVar2 = lja.a;
                        khq khqVar = khq.d;
                        liq k = limVar.k();
                        ljn l = khqVar.l();
                        try {
                            try {
                                try {
                                    llg b3 = lkz.a.b(l);
                                    b3.l(l, lir.p(k), ljaVar2);
                                    b3.g(l);
                                    try {
                                        k.z(0);
                                        ljn.A(l);
                                        khq khqVar2 = (khq) l;
                                        if (khqVar2.a == 0) {
                                            khs khsVar = khqVar2.b;
                                            if (khsVar == null) {
                                                khsVar = khs.d;
                                            }
                                            if (khsVar.a == 0) {
                                                kiw kiwVar = khqVar2.c;
                                                if (kiwVar == null) {
                                                    kiwVar = kiw.d;
                                                }
                                                if (kiwVar.a == 0) {
                                                    kdo kdoVar = new kdo((byte[]) null);
                                                    khs khsVar2 = khqVar2.b;
                                                    if (khsVar2 == null) {
                                                        khsVar2 = khs.d;
                                                    }
                                                    kdoVar.d(khsVar2.c.d());
                                                    kiw kiwVar2 = khqVar2.c;
                                                    if (kiwVar2 == null) {
                                                        kiwVar2 = kiw.d;
                                                    }
                                                    kdoVar.e(kiwVar2.c.d());
                                                    khs khsVar3 = khqVar2.b;
                                                    if (khsVar3 == null) {
                                                        khsVar3 = khs.d;
                                                    }
                                                    khu khuVar = khsVar3.b;
                                                    if (khuVar == null) {
                                                        khuVar = khu.b;
                                                    }
                                                    kdoVar.f(khuVar.a);
                                                    kiw kiwVar3 = khqVar2.c;
                                                    if (kiwVar3 == null) {
                                                        kiwVar3 = kiw.d;
                                                    }
                                                    kiy kiyVar = kiwVar3.b;
                                                    if (kiyVar == null) {
                                                        kiyVar = kiy.c;
                                                    }
                                                    kdoVar.g(kiyVar.b);
                                                    kiw kiwVar4 = khqVar2.c;
                                                    if (kiwVar4 == null) {
                                                        kiwVar4 = kiw.d;
                                                    }
                                                    kiy kiyVar2 = kiwVar4.b;
                                                    if (kiyVar2 == null) {
                                                        kiyVar2 = kiy.c;
                                                    }
                                                    kiv b4 = kiv.b(kiyVar2.a);
                                                    if (b4 == null) {
                                                        b4 = kiv.UNRECOGNIZED;
                                                    }
                                                    kdoVar.d = kcj.a(b4);
                                                    kdoVar.a = kcj.b(((kgk) kgoVar).e);
                                                    kat c2 = kdoVar.c();
                                                    khs khsVar4 = khqVar2.b;
                                                    if (khsVar4 == null) {
                                                        khsVar4 = khs.d;
                                                    }
                                                    ktd ad = ktd.ad(khsVar4.c.A());
                                                    kiw kiwVar5 = khqVar2.c;
                                                    if (kiwVar5 == null) {
                                                        kiwVar5 = kiw.d;
                                                    }
                                                    return ivc.U(c2, ad, ktd.ad(kiwVar5.c.A()), ((kgk) kgoVar).f);
                                                }
                                                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                                            }
                                            throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                                        }
                                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                                    } catch (ljy e2) {
                                        throw e2;
                                    }
                                } catch (IOException e3) {
                                    if (e3.getCause() instanceof ljy) {
                                        throw ((ljy) e3.getCause());
                                    }
                                    throw new ljy(e3);
                                } catch (llo e4) {
                                    throw e4.a();
                                }
                            } catch (ljy e5) {
                                if (e5.a) {
                                    throw new ljy(e5);
                                }
                                throw e5;
                            }
                        } catch (RuntimeException e6) {
                            if (e6.getCause() instanceof ljy) {
                                throw ((ljy) e6.getCause());
                            }
                            throw e6;
                        }
                    } catch (ljy unused) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            }
        });
    }

    public static kar a(kiv kivVar) {
        int ordinal = kivVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return kar.b;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + kivVar.a());
                    }
                    return kar.e;
                }
                return kar.c;
            }
            return kar.d;
        }
        return kar.a;
    }

    public static kas b(kjr kjrVar) {
        int ordinal = kjrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
                    }
                } else {
                    return kas.c;
                }
            }
            return kas.b;
        }
        return kas.a;
    }
}
