package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kby implements kgc {
    private final /* synthetic */ int a;

    @Override // defpackage.kgc
    public final kag a(kgo kgoVar) {
        switch (this.a) {
            case 0:
                kgf kgfVar = kca.a;
                kgl kglVar = (kgl) kgoVar;
                if (kglVar.b.a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    try {
                        lim limVar = ((kgl) kgoVar).b.b;
                        lja ljaVar = lja.a;
                        lkz lkzVar = lkz.a;
                        lja ljaVar2 = lja.a;
                        kjq kjqVar = kjq.d;
                        liq k = limVar.k();
                        ljn l = kjqVar.l();
                        try {
                            try {
                                try {
                                    try {
                                        llg b = lkz.a.b(l);
                                        b.l(l, lir.p(k), ljaVar2);
                                        b.g(l);
                                        try {
                                            k.z(0);
                                            ljn.A(l);
                                            kjq kjqVar2 = (kjq) l;
                                            kjr b2 = kjr.b(kglVar.b.c);
                                            if (b2 == null) {
                                                b2 = kjr.UNRECOGNIZED;
                                            }
                                            return kca.a(kjqVar2, b2);
                                        } catch (ljy e) {
                                            throw e;
                                        }
                                    } catch (IOException e2) {
                                        if (e2.getCause() instanceof ljy) {
                                            throw ((ljy) e2.getCause());
                                        }
                                        throw new ljy(e2);
                                    }
                                } catch (llo e3) {
                                    throw e3.a();
                                }
                            } catch (RuntimeException e4) {
                                if (e4.getCause() instanceof ljy) {
                                    throw ((ljy) e4.getCause());
                                }
                                throw e4;
                            }
                        } catch (ljy e5) {
                            if (e5.a) {
                                throw new ljy(e5);
                            }
                            throw e5;
                        }
                    } catch (ljy e6) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar.b.a)));
            case 1:
                kgf kgfVar2 = kbs.a;
                kgl kglVar2 = (kgl) kgoVar;
                if (kglVar2.b.a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        lim limVar2 = ((kgl) kgoVar).b.b;
                        lja ljaVar3 = lja.a;
                        lkz lkzVar2 = lkz.a;
                        lja ljaVar4 = lja.a;
                        kjo kjoVar = kjo.b;
                        liq k2 = limVar2.k();
                        ljn l2 = kjoVar.l();
                        try {
                            try {
                                try {
                                    llg b3 = lkz.a.b(l2);
                                    b3.l(l2, lir.p(k2), ljaVar4);
                                    b3.g(l2);
                                    try {
                                        k2.z(0);
                                        ljn.A(l2);
                                        String str = ((kjo) l2).a;
                                        kjr b4 = kjr.b(kglVar2.b.c);
                                        if (b4 == null) {
                                            b4 = kjr.UNRECOGNIZED;
                                        }
                                        return new kbr(str, kbs.a(b4));
                                    } catch (ljy e7) {
                                        throw e7;
                                    }
                                } catch (IOException e8) {
                                    if (e8.getCause() instanceof ljy) {
                                        throw ((ljy) e8.getCause());
                                    }
                                    throw new ljy(e8);
                                } catch (llo e9) {
                                    throw e9.a();
                                }
                            } catch (ljy e10) {
                                if (e10.a) {
                                    throw new ljy(e10);
                                }
                                throw e10;
                            }
                        } catch (RuntimeException e11) {
                            if (e11.getCause() instanceof ljy) {
                                throw ((ljy) e11.getCause());
                            }
                            throw e11;
                        }
                    } catch (ljy e12) {
                        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e12);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar2.b.a)));
            case 2:
                kgf kgfVar3 = kcj.a;
                kgl kglVar3 = (kgl) kgoVar;
                if (kglVar3.b.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        lim limVar3 = ((kgl) kgoVar).b.b;
                        lja ljaVar5 = lja.a;
                        lkz lkzVar3 = lkz.a;
                        lja ljaVar6 = lja.a;
                        khr khrVar = khr.d;
                        liq k3 = limVar3.k();
                        ljn l3 = khrVar.l();
                        try {
                            try {
                                try {
                                    llg b5 = lkz.a.b(l3);
                                    b5.l(l3, lir.p(k3), ljaVar6);
                                    b5.g(l3);
                                    try {
                                        k3.z(0);
                                        ljn.A(l3);
                                        khr khrVar2 = (khr) l3;
                                        kix kixVar = khrVar2.c;
                                        if (kixVar == null) {
                                            kixVar = kix.e;
                                        }
                                        if (kixVar.d == 0) {
                                            kdo kdoVar = new kdo((byte[]) null);
                                            kht khtVar = khrVar2.b;
                                            if (khtVar == null) {
                                                khtVar = kht.d;
                                            }
                                            kdoVar.d(khtVar.c);
                                            kix kixVar2 = khrVar2.c;
                                            if (kixVar2 == null) {
                                                kixVar2 = kix.e;
                                            }
                                            kdoVar.e(kixVar2.c);
                                            kht khtVar2 = khrVar2.b;
                                            if (khtVar2 == null) {
                                                khtVar2 = kht.d;
                                            }
                                            khu khuVar = khtVar2.b;
                                            if (khuVar == null) {
                                                khuVar = khu.b;
                                            }
                                            kdoVar.f(khuVar.a);
                                            kix kixVar3 = khrVar2.c;
                                            if (kixVar3 == null) {
                                                kixVar3 = kix.e;
                                            }
                                            kiy kiyVar = kixVar3.b;
                                            if (kiyVar == null) {
                                                kiyVar = kiy.c;
                                            }
                                            kdoVar.g(kiyVar.b);
                                            kix kixVar4 = khrVar2.c;
                                            if (kixVar4 == null) {
                                                kixVar4 = kix.e;
                                            }
                                            kiy kiyVar2 = kixVar4.b;
                                            if (kiyVar2 == null) {
                                                kiyVar2 = kiy.c;
                                            }
                                            kiv b6 = kiv.b(kiyVar2.a);
                                            if (b6 == null) {
                                                b6 = kiv.UNRECOGNIZED;
                                            }
                                            kdoVar.d = kcj.a(b6);
                                            kjr b7 = kjr.b(kglVar3.b.c);
                                            if (b7 == null) {
                                                b7 = kjr.UNRECOGNIZED;
                                            }
                                            kdoVar.a = kcj.b(b7);
                                            return kdoVar.c();
                                        }
                                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                                    } catch (ljy e13) {
                                        throw e13;
                                    }
                                } catch (IOException e14) {
                                    if (e14.getCause() instanceof ljy) {
                                        throw ((ljy) e14.getCause());
                                    }
                                    throw new ljy(e14);
                                } catch (RuntimeException e15) {
                                    if (e15.getCause() instanceof ljy) {
                                        throw ((ljy) e15.getCause());
                                    }
                                    throw e15;
                                }
                            } catch (llo e16) {
                                throw e16.a();
                            }
                        } catch (ljy e17) {
                            if (e17.a) {
                                throw new ljy(e17);
                            }
                            throw e17;
                        }
                    } catch (ljy e18) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e18);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar3.b.a)));
            case 3:
                kgf kgfVar4 = kck.a;
                kgl kglVar4 = (kgl) kgoVar;
                if (kglVar4.b.a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        lim limVar4 = ((kgl) kgoVar).b.b;
                        lja ljaVar7 = lja.a;
                        lkz lkzVar4 = lkz.a;
                        lja ljaVar8 = lja.a;
                        khw khwVar = khw.d;
                        liq k4 = limVar4.k();
                        ljn l4 = khwVar.l();
                        try {
                            try {
                                try {
                                    llg b8 = lkz.a.b(l4);
                                    b8.l(l4, lir.p(k4), ljaVar8);
                                    b8.g(l4);
                                    try {
                                        k4.z(0);
                                        ljn.A(l4);
                                        khw khwVar2 = (khw) l4;
                                        lzt lztVar = new lzt((char[]) null, (byte[]) null);
                                        lztVar.o(khwVar2.c);
                                        khx khxVar = khwVar2.b;
                                        if (khxVar == null) {
                                            khxVar = khx.b;
                                        }
                                        lztVar.n(khxVar.a);
                                        lztVar.p();
                                        kjr b9 = kjr.b(kglVar4.b.c);
                                        if (b9 == null) {
                                            b9 = kjr.UNRECOGNIZED;
                                        }
                                        lztVar.c = kck.a(b9);
                                        return lztVar.m();
                                    } catch (ljy e19) {
                                        throw e19;
                                    }
                                } catch (ljy e20) {
                                    if (e20.a) {
                                        throw new ljy(e20);
                                    }
                                    throw e20;
                                } catch (IOException e21) {
                                    if (e21.getCause() instanceof ljy) {
                                        throw ((ljy) e21.getCause());
                                    }
                                    throw new ljy(e21);
                                }
                            } catch (RuntimeException e22) {
                                if (e22.getCause() instanceof ljy) {
                                    throw ((ljy) e22.getCause());
                                }
                                throw e22;
                            }
                        } catch (llo e23) {
                            throw e23.a();
                        }
                    } catch (ljy e24) {
                        throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e24);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar4.b.a)));
            case 4:
                kgf kgfVar5 = kcn.a;
                kgl kglVar5 = (kgl) kgoVar;
                if (kglVar5.b.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        lim limVar5 = ((kgl) kgoVar).b.b;
                        lja ljaVar9 = lja.a;
                        lkz lkzVar5 = lkz.a;
                        lja ljaVar10 = lja.a;
                        khz khzVar = khz.c;
                        liq k5 = limVar5.k();
                        ljn l5 = khzVar.l();
                        try {
                            try {
                                try {
                                    llg b10 = lkz.a.b(l5);
                                    b10.l(l5, lir.p(k5), ljaVar10);
                                    b10.g(l5);
                                    try {
                                        k5.z(0);
                                        ljn.A(l5);
                                        khz khzVar2 = (khz) l5;
                                        if (khzVar2.b == 0) {
                                            lzt lztVar2 = new lzt((byte[]) null, (byte[]) null);
                                            lztVar2.k(khzVar2.a);
                                            lztVar2.j();
                                            lztVar2.l();
                                            kjr b11 = kjr.b(kglVar5.b.c);
                                            if (b11 == null) {
                                                b11 = kjr.UNRECOGNIZED;
                                            }
                                            lztVar2.a = kcn.a(b11);
                                            return lztVar2.i();
                                        }
                                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                                    } catch (ljy e25) {
                                        throw e25;
                                    }
                                } catch (IOException e26) {
                                    if (e26.getCause() instanceof ljy) {
                                        throw ((ljy) e26.getCause());
                                    }
                                    throw new ljy(e26);
                                } catch (RuntimeException e27) {
                                    if (e27.getCause() instanceof ljy) {
                                        throw ((ljy) e27.getCause());
                                    }
                                    throw e27;
                                }
                            } catch (llo e28) {
                                throw e28.a();
                            }
                        } catch (ljy e29) {
                            if (e29.a) {
                                throw new ljy(e29);
                            }
                            throw e29;
                        }
                    } catch (ljy e30) {
                        throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e30);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar5.b.a)));
            case 5:
                kgf kgfVar6 = kco.a;
                kgl kglVar6 = (kgl) kgoVar;
                if (kglVar6.b.a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        lim limVar6 = ((kgl) kgoVar).b.b;
                        lja ljaVar11 = lja.a;
                        lkz lkzVar6 = lkz.a;
                        lja ljaVar12 = lja.a;
                        kib kibVar = kib.c;
                        liq k6 = limVar6.k();
                        ljn l6 = kibVar.l();
                        try {
                            try {
                                try {
                                    llg b12 = lkz.a.b(l6);
                                    b12.l(l6, lir.p(k6), ljaVar12);
                                    b12.g(l6);
                                    try {
                                        k6.z(0);
                                        ljn.A(l6);
                                        kib kibVar2 = (kib) l6;
                                        if (kibVar2.b == 0) {
                                            lyn lynVar = new lyn((byte[]) null, (byte[]) null);
                                            lynVar.g(kibVar2.a);
                                            kjr b13 = kjr.b(kglVar6.b.c);
                                            if (b13 == null) {
                                                b13 = kjr.UNRECOGNIZED;
                                            }
                                            lynVar.b = kco.a(b13);
                                            return lynVar.f();
                                        }
                                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                                    } catch (ljy e31) {
                                        throw e31;
                                    }
                                } catch (RuntimeException e32) {
                                    if (e32.getCause() instanceof ljy) {
                                        throw ((ljy) e32.getCause());
                                    }
                                    throw e32;
                                } catch (ljy e33) {
                                    if (e33.a) {
                                        throw new ljy(e33);
                                    }
                                    throw e33;
                                }
                            } catch (IOException e34) {
                                if (e34.getCause() instanceof ljy) {
                                    throw ((ljy) e34.getCause());
                                }
                                throw new ljy(e34);
                            }
                        } catch (llo e35) {
                            throw e35.a();
                        }
                    } catch (ljy e36) {
                        throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e36);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar6.b.a)));
            case 6:
                kgf kgfVar7 = kcr.a;
                kgl kglVar7 = (kgl) kgoVar;
                if (kglVar7.b.a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        lim limVar7 = ((kgl) kgoVar).b.b;
                        lja ljaVar13 = lja.a;
                        lkz lkzVar7 = lkz.a;
                        lja ljaVar14 = lja.a;
                        kif kifVar = kif.a;
                        liq k7 = limVar7.k();
                        ljn l7 = kifVar.l();
                        try {
                            try {
                                llg b14 = lkz.a.b(l7);
                                b14.l(l7, lir.p(k7), ljaVar14);
                                b14.g(l7);
                                try {
                                    k7.z(0);
                                    ljn.A(l7);
                                    kjr b15 = kjr.b(kglVar7.b.c);
                                    if (b15 == null) {
                                        b15 = kjr.UNRECOGNIZED;
                                    }
                                    return new kbl(kcr.a(b15));
                                } catch (ljy e37) {
                                    throw e37;
                                }
                            } catch (ljy e38) {
                                if (e38.a) {
                                    throw new ljy(e38);
                                }
                                throw e38;
                            } catch (IOException e39) {
                                if (e39.getCause() instanceof ljy) {
                                    throw ((ljy) e39.getCause());
                                }
                                throw new ljy(e39);
                            }
                        } catch (llo e40) {
                            throw e40.a();
                        } catch (RuntimeException e41) {
                            if (e41.getCause() instanceof ljy) {
                                throw ((ljy) e41.getCause());
                            }
                            throw e41;
                        }
                    } catch (ljy e42) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e42);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar7.b.a)));
            case 7:
                kgf kgfVar8 = kda.a;
                kgl kglVar8 = (kgl) kgoVar;
                if (kglVar8.b.a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        lim limVar8 = ((kgl) kgoVar).b.b;
                        lja ljaVar15 = lja.a;
                        lkz lkzVar8 = lkz.a;
                        lja ljaVar16 = lja.a;
                        kkc kkcVar = kkc.b;
                        liq k8 = limVar8.k();
                        ljn l8 = kkcVar.l();
                        try {
                            try {
                                try {
                                    llg b16 = lkz.a.b(l8);
                                    b16.l(l8, lir.p(k8), ljaVar16);
                                    b16.g(l8);
                                    try {
                                        k8.z(0);
                                        ljn.A(l8);
                                        if (((kkc) l8).a == 0) {
                                            kjr b17 = kjr.b(kglVar8.b.c);
                                            if (b17 == null) {
                                                b17 = kjr.UNRECOGNIZED;
                                            }
                                            return new kcg(kda.a(b17));
                                        }
                                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                                    } catch (ljy e43) {
                                        throw e43;
                                    }
                                } catch (ljy e44) {
                                    if (e44.a) {
                                        throw new ljy(e44);
                                    }
                                    throw e44;
                                } catch (IOException e45) {
                                    if (e45.getCause() instanceof ljy) {
                                        throw ((ljy) e45.getCause());
                                    }
                                    throw new ljy(e45);
                                }
                            } catch (RuntimeException e46) {
                                if (e46.getCause() instanceof ljy) {
                                    throw ((ljy) e46.getCause());
                                }
                                throw e46;
                            }
                        } catch (llo e47) {
                            throw e47.a();
                        }
                    } catch (ljy e48) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e48);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar8.b.a)));
            case 8:
                Map map = kdl.a;
                kgl kglVar9 = (kgl) kgoVar;
                if (kglVar9.b.a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    try {
                        lim limVar9 = ((kgl) kgoVar).b.b;
                        lja ljaVar17 = lja.a;
                        lkz lkzVar9 = lkz.a;
                        lja ljaVar18 = lja.a;
                        kid kidVar = kid.c;
                        liq k9 = limVar9.k();
                        ljn l9 = kidVar.l();
                        try {
                            try {
                                try {
                                    llg b18 = lkz.a.b(l9);
                                    b18.l(l9, lir.p(k9), ljaVar18);
                                    b18.g(l9);
                                    try {
                                        k9.z(0);
                                        ljn.A(l9);
                                        kid kidVar2 = (kid) l9;
                                        if (kidVar2.b == 0) {
                                            lyn lynVar2 = new lyn((char[]) null);
                                            lynVar2.e(kidVar2.a);
                                            kjr b19 = kjr.b(kglVar9.b.c);
                                            if (b19 == null) {
                                                b19 = kjr.UNRECOGNIZED;
                                            }
                                            lynVar2.b = kdl.a(b19);
                                            return lynVar2.d();
                                        }
                                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                                    } catch (ljy e49) {
                                        throw e49;
                                    }
                                } catch (RuntimeException e50) {
                                    if (e50.getCause() instanceof ljy) {
                                        throw ((ljy) e50.getCause());
                                    }
                                    throw e50;
                                } catch (ljy e51) {
                                    if (e51.a) {
                                        throw new ljy(e51);
                                    }
                                    throw e51;
                                }
                            } catch (llo e52) {
                                throw e52.a();
                            }
                        } catch (IOException e53) {
                            if (e53.getCause() instanceof ljy) {
                                throw ((ljy) e53.getCause());
                            }
                            throw new ljy(e53);
                        }
                    } catch (ljy e54) {
                        throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e54);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(String.valueOf(kglVar9.b.a)));
            case 9:
                kgf kgfVar9 = kee.a;
                kgl kglVar10 = (kgl) kgoVar;
                if (kglVar10.b.a.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    try {
                        lim limVar10 = ((kgl) kgoVar).b.b;
                        lja ljaVar19 = lja.a;
                        lkz lkzVar10 = lkz.a;
                        lja ljaVar20 = lja.a;
                        kjc kjcVar = kjc.c;
                        liq k10 = limVar10.k();
                        ljn l10 = kjcVar.l();
                        try {
                            try {
                                llg b20 = lkz.a.b(l10);
                                b20.l(l10, lir.p(k10), ljaVar20);
                                b20.g(l10);
                                try {
                                    k10.z(0);
                                    ljn.A(l10);
                                    kjc kjcVar2 = (kjc) l10;
                                    kjr b21 = kjr.b(kglVar10.b.c);
                                    if (b21 == null) {
                                        b21 = kjr.UNRECOGNIZED;
                                    }
                                    kjd kjdVar = kjcVar2.b;
                                    if (kjdVar == null) {
                                        kjdVar = kjd.d;
                                    }
                                    return kee.a(b21, kjdVar);
                                } catch (ljy e55) {
                                    throw e55;
                                }
                            } catch (RuntimeException e56) {
                                if (e56.getCause() instanceof ljy) {
                                    throw ((ljy) e56.getCause());
                                }
                                throw e56;
                            } catch (ljy e57) {
                                if (e57.a) {
                                    throw new ljy(e57);
                                }
                                throw e57;
                            }
                        } catch (IOException e58) {
                            if (e58.getCause() instanceof ljy) {
                                throw ((ljy) e58.getCause());
                            }
                            throw new ljy(e58);
                        } catch (llo e59) {
                            throw e59.a();
                        }
                    } catch (ljy e60) {
                        throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e60);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar10.b.a)));
            case 10:
                kgf kgfVar10 = ket.a;
                kgl kglVar11 = (kgl) kgoVar;
                if (kglVar11.b.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    try {
                        lim limVar11 = ((kgl) kgoVar).b.b;
                        lja ljaVar21 = lja.a;
                        lkz lkzVar11 = lkz.a;
                        lja ljaVar22 = lja.a;
                        kim kimVar = kim.c;
                        liq k11 = limVar11.k();
                        ljn l11 = kimVar.l();
                        try {
                            try {
                                try {
                                    try {
                                        llg b22 = lkz.a.b(l11);
                                        b22.l(l11, lir.p(k11), ljaVar22);
                                        b22.g(l11);
                                        try {
                                            k11.z(0);
                                            ljn.A(l11);
                                            kim kimVar2 = (kim) l11;
                                            kjr b23 = kjr.b(kglVar11.b.c);
                                            if (b23 == null) {
                                                b23 = kjr.UNRECOGNIZED;
                                            }
                                            kin kinVar = kimVar2.b;
                                            if (kinVar == null) {
                                                kinVar = kin.e;
                                            }
                                            return ket.a(b23, kinVar);
                                        } catch (ljy e61) {
                                            throw e61;
                                        }
                                    } catch (RuntimeException e62) {
                                        if (e62.getCause() instanceof ljy) {
                                            throw ((ljy) e62.getCause());
                                        }
                                        throw e62;
                                    }
                                } catch (llo e63) {
                                    throw e63.a();
                                }
                            } catch (IOException e64) {
                                if (e64.getCause() instanceof ljy) {
                                    throw ((ljy) e64.getCause());
                                }
                                throw new ljy(e64);
                            }
                        } catch (ljy e65) {
                            if (e65.a) {
                                throw new ljy(e65);
                            }
                            throw e65;
                        }
                    } catch (ljy e66) {
                        throw new GeneralSecurityException("Parsing EciesParameters failed: ", e66);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar11.b.a)));
            case 11:
                kgf kgfVar11 = khi.a;
                kgl kglVar12 = (kgl) kgoVar;
                if (kglVar12.b.a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        lim limVar12 = ((kgl) kgoVar).b.b;
                        lja ljaVar23 = lja.a;
                        lkz lkzVar12 = lkz.a;
                        lja ljaVar24 = lja.a;
                        kho khoVar = kho.d;
                        liq k12 = limVar12.k();
                        ljn l12 = khoVar.l();
                        try {
                            try {
                                try {
                                    llg b24 = lkz.a.b(l12);
                                    b24.l(l12, lir.p(k12), ljaVar24);
                                    b24.g(l12);
                                    try {
                                        k12.z(0);
                                        ljn.A(l12);
                                        kho khoVar2 = (kho) l12;
                                        mep mepVar = new mep(null);
                                        mepVar.b(khoVar2.b);
                                        khp khpVar = khoVar2.c;
                                        if (khpVar == null) {
                                            khpVar = khp.b;
                                        }
                                        mepVar.c(khpVar.a);
                                        kjr b25 = kjr.b(kglVar12.b.c);
                                        if (b25 == null) {
                                            b25 = kjr.UNRECOGNIZED;
                                        }
                                        mepVar.c = khi.a(b25);
                                        return mepVar.a();
                                    } catch (ljy e67) {
                                        throw e67;
                                    }
                                } catch (IOException e68) {
                                    if (e68.getCause() instanceof ljy) {
                                        throw ((ljy) e68.getCause());
                                    }
                                    throw new ljy(e68);
                                } catch (RuntimeException e69) {
                                    if (e69.getCause() instanceof ljy) {
                                        throw ((ljy) e69.getCause());
                                    }
                                    throw e69;
                                }
                            } catch (llo e70) {
                                throw e70.a();
                            }
                        } catch (ljy e71) {
                            if (e71.a) {
                                throw new ljy(e71);
                            }
                            throw e71;
                        }
                    } catch (ljy e72) {
                        throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e72);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar12.b.a)));
            case 12:
                kgf kgfVar12 = khk.a;
                kgl kglVar13 = (kgl) kgoVar;
                if (kglVar13.b.a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        lim limVar13 = ((kgl) kgoVar).b.b;
                        lja ljaVar25 = lja.a;
                        lkz lkzVar13 = lkz.a;
                        lja ljaVar26 = lja.a;
                        kix kixVar5 = kix.e;
                        liq k13 = limVar13.k();
                        ljn l13 = kixVar5.l();
                        try {
                            try {
                                try {
                                    llg b26 = lkz.a.b(l13);
                                    b26.l(l13, lir.p(k13), ljaVar26);
                                    b26.g(l13);
                                    try {
                                        k13.z(0);
                                        ljn.A(l13);
                                        kix kixVar6 = (kix) l13;
                                        if (kixVar6.d == 0) {
                                            lzt lztVar3 = new lzt(null);
                                            lztVar3.g(kixVar6.c);
                                            kiy kiyVar3 = kixVar6.b;
                                            if (kiyVar3 == null) {
                                                kiyVar3 = kiy.c;
                                            }
                                            lztVar3.h(kiyVar3.b);
                                            kuv kuvVar = khk.f;
                                            kiy kiyVar4 = kixVar6.b;
                                            if (kiyVar4 == null) {
                                                kiyVar4 = kiy.c;
                                            }
                                            kiv b27 = kiv.b(kiyVar4.a);
                                            if (b27 == null) {
                                                b27 = kiv.UNRECOGNIZED;
                                            }
                                            lztVar3.a = (khc) kuvVar.p(b27);
                                            kuv kuvVar2 = khk.e;
                                            kjr b28 = kjr.b(kglVar13.b.c);
                                            if (b28 == null) {
                                                b28 = kjr.UNRECOGNIZED;
                                            }
                                            lztVar3.c = (khd) kuvVar2.p(b28);
                                            return lztVar3.f();
                                        }
                                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + kixVar6.d);
                                    } catch (ljy e73) {
                                        throw e73;
                                    }
                                } catch (RuntimeException e74) {
                                    if (e74.getCause() instanceof ljy) {
                                        throw ((ljy) e74.getCause());
                                    }
                                    throw e74;
                                } catch (ljy e75) {
                                    if (e75.a) {
                                        throw new ljy(e75);
                                    }
                                    throw e75;
                                }
                            } catch (IOException e76) {
                                if (e76.getCause() instanceof ljy) {
                                    throw ((ljy) e76.getCause());
                                }
                                throw new ljy(e76);
                            }
                        } catch (llo e77) {
                            throw e77.a();
                        }
                    } catch (ljy e78) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: ", e78);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar13.b.a)));
            case 13:
                kgl kglVar14 = (kgl) kgoVar;
                kji kjiVar = kglVar14.b;
                kgf kgfVar13 = klp.a;
                if (kjiVar.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    try {
                        lim limVar14 = ((kgl) kgoVar).b.b;
                        lja ljaVar27 = lja.a;
                        lkz lkzVar14 = lkz.a;
                        lja ljaVar28 = lja.a;
                        kih kihVar = kih.c;
                        liq k14 = limVar14.k();
                        ljn l14 = kihVar.l();
                        try {
                            try {
                                try {
                                    llg b29 = lkz.a.b(l14);
                                    b29.l(l14, lir.p(k14), ljaVar28);
                                    b29.g(l14);
                                    try {
                                        k14.z(0);
                                        ljn.A(l14);
                                        kih kihVar2 = (kih) l14;
                                        kii kiiVar = kihVar2.b;
                                        if (kiiVar == null) {
                                            kiiVar = kii.d;
                                        }
                                        kiv b30 = kiv.b(kiiVar.a);
                                        if (b30 == null) {
                                            b30 = kiv.UNRECOGNIZED;
                                        }
                                        kke b31 = klp.b(b30);
                                        kii kiiVar2 = kihVar2.b;
                                        if (kiiVar2 == null) {
                                            kiiVar2 = kii.d;
                                        }
                                        int x = a.x(kiiVar2.c);
                                        if (x == 0) {
                                            x = 1;
                                        }
                                        kkf d = klp.d(x);
                                        kii kiiVar3 = kihVar2.b;
                                        if (kiiVar3 == null) {
                                            kiiVar3 = kii.d;
                                        }
                                        kiu b32 = kiu.b(kiiVar3.b);
                                        if (b32 == null) {
                                            b32 = kiu.UNRECOGNIZED;
                                        }
                                        kkd a = klp.a(b32);
                                        kjr b33 = kjr.b(kglVar14.b.c);
                                        if (b33 == null) {
                                            b33 = kjr.UNRECOGNIZED;
                                        }
                                        return jql.O(d, a, b31, klp.c(b33));
                                    } catch (ljy e79) {
                                        throw e79;
                                    }
                                } catch (RuntimeException e80) {
                                    if (e80.getCause() instanceof ljy) {
                                        throw ((ljy) e80.getCause());
                                    }
                                    throw e80;
                                } catch (ljy e81) {
                                    if (e81.a) {
                                        throw new ljy(e81);
                                    }
                                    throw e81;
                                }
                            } catch (IOException e82) {
                                if (e82.getCause() instanceof ljy) {
                                    throw ((ljy) e82.getCause());
                                }
                                throw new ljy(e82);
                            }
                        } catch (llo e83) {
                            throw e83.a();
                        }
                    } catch (ljy e84) {
                        throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e84);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar14.b.a)));
            case 14:
                kgf kgfVar14 = klq.a;
                kgl kglVar15 = (kgl) kgoVar;
                if (kglVar15.b.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    try {
                        lim limVar15 = ((kgl) kgoVar).b.b;
                        lja ljaVar29 = lja.a;
                        lkz lkzVar15 = lkz.a;
                        lja ljaVar30 = lja.a;
                        kir kirVar = kir.b;
                        liq k15 = limVar15.k();
                        ljn l15 = kirVar.l();
                        try {
                            try {
                                llg b34 = lkz.a.b(l15);
                                b34.l(l15, lir.p(k15), ljaVar30);
                                b34.g(l15);
                                try {
                                    k15.z(0);
                                    ljn.A(l15);
                                    if (((kir) l15).a == 0) {
                                        kuv kuvVar3 = klq.g;
                                        kjr b35 = kjr.b(kglVar15.b.c);
                                        if (b35 == null) {
                                            b35 = kjr.UNRECOGNIZED;
                                        }
                                        return new kkn((kkm) kuvVar3.p(b35));
                                    }
                                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                                } catch (ljy e85) {
                                    throw e85;
                                }
                            } catch (llo e86) {
                                throw e86.a();
                            } catch (RuntimeException e87) {
                                if (e87.getCause() instanceof ljy) {
                                    throw ((ljy) e87.getCause());
                                }
                                throw e87;
                            }
                        } catch (ljy e88) {
                            if (e88.a) {
                                throw new ljy(e88);
                            }
                            throw e88;
                        } catch (IOException e89) {
                            if (e89.getCause() instanceof ljy) {
                                throw ((ljy) e89.getCause());
                            }
                            throw new ljy(e89);
                        }
                    } catch (ljy e90) {
                        throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e90);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar15.b.a)));
            case 15:
                kgf kgfVar15 = klt.a;
                kgl kglVar16 = (kgl) kgoVar;
                if (kglVar16.b.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    try {
                        lim limVar16 = ((kgl) kgoVar).b.b;
                        lja ljaVar31 = lja.a;
                        lkz lkzVar16 = lkz.a;
                        lja ljaVar32 = lja.a;
                        kjt kjtVar = kjt.e;
                        liq k16 = limVar16.k();
                        ljn l16 = kjtVar.l();
                        try {
                            try {
                                try {
                                    try {
                                        llg b36 = lkz.a.b(l16);
                                        b36.l(l16, lir.p(k16), ljaVar32);
                                        b36.g(l16);
                                        try {
                                            k16.z(0);
                                            ljn.A(l16);
                                            kjt kjtVar2 = (kjt) l16;
                                            BigInteger bigInteger = kkz.a;
                                            kkw kkwVar = new kkw();
                                            kuv kuvVar4 = klt.h;
                                            kju kjuVar = kjtVar2.b;
                                            if (kjuVar == null) {
                                                kjuVar = kju.b;
                                            }
                                            kiv b37 = kiv.b(kjuVar.a);
                                            if (b37 == null) {
                                                b37 = kiv.UNRECOGNIZED;
                                            }
                                            kkwVar.b = (kkx) kuvVar4.p(b37);
                                            kkwVar.a = klt.a(kjtVar2.d);
                                            kkwVar.b(kjtVar2.c);
                                            kuv kuvVar5 = klt.g;
                                            kjr b38 = kjr.b(kglVar16.b.c);
                                            if (b38 == null) {
                                                b38 = kjr.UNRECOGNIZED;
                                            }
                                            kkwVar.c = (kky) kuvVar5.p(b38);
                                            return kkwVar.a();
                                        } catch (ljy e91) {
                                            throw e91;
                                        }
                                    } catch (ljy e92) {
                                        if (e92.a) {
                                            throw new ljy(e92);
                                        }
                                        throw e92;
                                    }
                                } catch (RuntimeException e93) {
                                    if (e93.getCause() instanceof ljy) {
                                        throw ((ljy) e93.getCause());
                                    }
                                    throw e93;
                                }
                            } catch (llo e94) {
                                throw e94.a();
                            }
                        } catch (IOException e95) {
                            if (e95.getCause() instanceof ljy) {
                                throw ((ljy) e95.getCause());
                            }
                            throw new ljy(e95);
                        }
                    } catch (ljy e96) {
                        throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e96);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar16.b.a)));
            default:
                kgf kgfVar16 = klv.a;
                kgl kglVar17 = (kgl) kgoVar;
                if (kglVar17.b.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    try {
                        lim limVar17 = ((kgl) kgoVar).b.b;
                        lja ljaVar33 = lja.a;
                        lkz lkzVar17 = lkz.a;
                        lja ljaVar34 = lja.a;
                        kjx kjxVar = kjx.e;
                        liq k17 = limVar17.k();
                        ljn l17 = kjxVar.l();
                        try {
                            try {
                                try {
                                    llg b39 = lkz.a.b(l17);
                                    b39.l(l17, lir.p(k17), ljaVar34);
                                    b39.g(l17);
                                    try {
                                        k17.z(0);
                                        ljn.A(l17);
                                        kjx kjxVar2 = (kjx) l17;
                                        BigInteger bigInteger2 = klg.a;
                                        kld kldVar = new kld();
                                        kuv kuvVar6 = klv.h;
                                        kjy kjyVar = kjxVar2.b;
                                        if (kjyVar == null) {
                                            kjyVar = kjy.d;
                                        }
                                        kiv b40 = kiv.b(kjyVar.a);
                                        if (b40 == null) {
                                            b40 = kiv.UNRECOGNIZED;
                                        }
                                        kldVar.b = (kle) kuvVar6.p(b40);
                                        kuv kuvVar7 = klv.h;
                                        kjy kjyVar2 = kjxVar2.b;
                                        if (kjyVar2 == null) {
                                            kjyVar2 = kjy.d;
                                        }
                                        kiv b41 = kiv.b(kjyVar2.b);
                                        if (b41 == null) {
                                            b41 = kiv.UNRECOGNIZED;
                                        }
                                        kldVar.c = (kle) kuvVar7.p(b41);
                                        kldVar.a = klv.a(kjxVar2.d);
                                        kldVar.b(kjxVar2.c);
                                        kjy kjyVar3 = kjxVar2.b;
                                        if (kjyVar3 == null) {
                                            kjyVar3 = kjy.d;
                                        }
                                        kldVar.c(kjyVar3.c);
                                        kuv kuvVar8 = klv.g;
                                        kjr b42 = kjr.b(kglVar17.b.c);
                                        if (b42 == null) {
                                            b42 = kjr.UNRECOGNIZED;
                                        }
                                        kldVar.d = (klf) kuvVar8.p(b42);
                                        return kldVar.a();
                                    } catch (ljy e97) {
                                        throw e97;
                                    }
                                } catch (RuntimeException e98) {
                                    if (e98.getCause() instanceof ljy) {
                                        throw ((ljy) e98.getCause());
                                    }
                                    throw e98;
                                } catch (ljy e99) {
                                    if (e99.a) {
                                        throw new ljy(e99);
                                    }
                                    throw e99;
                                }
                            } catch (IOException e100) {
                                if (e100.getCause() instanceof ljy) {
                                    throw ((ljy) e100.getCause());
                                }
                                throw new ljy(e100);
                            }
                        } catch (llo e101) {
                            throw e101.a();
                        }
                    } catch (ljy e102) {
                        throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e102);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(kglVar17.b.a)));
        }
    }
}
