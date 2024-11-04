package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kbx implements kgd {
    private final /* synthetic */ int a;

    public /* synthetic */ kbx(int i) {
        this.a = i;
    }

    @Override // defpackage.kgd
    public final kgo a(kag kagVar) {
        kjr kjrVar;
        kjr kjrVar2;
        kjr kjrVar3;
        kjr kjrVar4;
        kjr kjrVar5;
        kjr kjrVar6;
        kjr kjrVar7;
        kjr kjrVar8;
        switch (this.a) {
            case 0:
                kbw kbwVar = (kbw) kagVar;
                kgf kgfVar = kca.a;
                ljh k = kji.d.k();
                if (!k.b.y()) {
                    k.t();
                }
                ((kji) k.b).a = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                byte[] w = ivc.w(kbwVar.c);
                try {
                    lja ljaVar = lja.a;
                    lkz lkzVar = lkz.a;
                    ljn m = ljn.m(kji.d, w, 0, w.length, lja.a);
                    ljn.A(m);
                    kji kjiVar = (kji) m;
                    ljh k2 = kjq.d.k();
                    String str = kbwVar.b;
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    ljn ljnVar = k2.b;
                    ((kjq) ljnVar).b = str;
                    if (!ljnVar.y()) {
                        k2.t();
                    }
                    kjq kjqVar = (kjq) k2.b;
                    kjiVar.getClass();
                    kjqVar.c = kjiVar;
                    kjqVar.a |= 1;
                    lim e = ((kjq) k2.q()).e();
                    if (!k.b.y()) {
                        k.t();
                    }
                    ((kji) k.b).b = e;
                    kbv kbvVar = kbwVar.a;
                    if (kbv.a.equals(kbvVar)) {
                        kjrVar = kjr.TINK;
                    } else if (kbv.b.equals(kbvVar)) {
                        kjrVar = kjr.RAW;
                    } else {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(kbvVar.c));
                    }
                    if (!k.b.y()) {
                        k.t();
                    }
                    ((kji) k.b).c = kjrVar.a();
                    return kgl.a((kji) k.q());
                } catch (ljy e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            case 1:
                kbr kbrVar = (kbr) kagVar;
                kgf kgfVar2 = kbs.a;
                ljh k3 = kji.d.k();
                if (!k3.b.y()) {
                    k3.t();
                }
                ((kji) k3.b).a = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                ljh k4 = kjo.b.k();
                String str2 = kbrVar.a;
                if (!k4.b.y()) {
                    k4.t();
                }
                kjo kjoVar = (kjo) k4.b;
                str2.getClass();
                kjoVar.a = str2;
                lim e3 = ((kjo) k4.q()).e();
                if (!k3.b.y()) {
                    k3.t();
                }
                ((kji) k3.b).b = e3;
                kbq kbqVar = kbrVar.b;
                if (kbq.a.equals(kbqVar)) {
                    kjrVar2 = kjr.TINK;
                } else if (kbq.b.equals(kbqVar)) {
                    kjrVar2 = kjr.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(kbqVar.c));
                }
                if (!k3.b.y()) {
                    k3.t();
                }
                ((kji) k3.b).c = kjrVar2.a();
                return kgl.a((kji) k3.q());
            case 2:
                kay kayVar = (kay) kagVar;
                kgf kgfVar3 = kck.a;
                ljh k5 = kji.d.k();
                if (!k5.b.y()) {
                    k5.t();
                }
                ((kji) k5.b).a = "type.googleapis.com/google.crypto.tink.AesEaxKey";
                ljh k6 = khw.d.k();
                int i = kayVar.c;
                ljh k7 = khx.b.k();
                int i2 = kayVar.b;
                if (!k7.b.y()) {
                    k7.t();
                }
                ((khx) k7.b).a = i2;
                khx khxVar = (khx) k7.q();
                if (!k6.b.y()) {
                    k6.t();
                }
                ljn ljnVar2 = k6.b;
                khw khwVar = (khw) ljnVar2;
                khxVar.getClass();
                khwVar.b = khxVar;
                khwVar.a |= 1;
                int i3 = kayVar.a;
                if (!ljnVar2.y()) {
                    k6.t();
                }
                ((khw) k6.b).c = i3;
                lim e4 = ((khw) k6.q()).e();
                if (!k5.b.y()) {
                    k5.t();
                }
                ((kji) k5.b).b = e4;
                kax kaxVar = kayVar.d;
                if (kax.a.equals(kaxVar)) {
                    kjrVar3 = kjr.TINK;
                } else if (kax.b.equals(kaxVar)) {
                    kjrVar3 = kjr.CRUNCHY;
                } else if (kax.c.equals(kaxVar)) {
                    kjrVar3 = kjr.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(kaxVar))));
                }
                if (!k5.b.y()) {
                    k5.t();
                }
                ((kji) k5.b).c = kjrVar3.a();
                return kgl.a((kji) k5.q());
            case 3:
                kbd kbdVar = (kbd) kagVar;
                int i4 = kbdVar.c;
                int i5 = kbdVar.b;
                kgf kgfVar4 = kcn.a;
                ljh k8 = kji.d.k();
                if (!k8.b.y()) {
                    k8.t();
                }
                ((kji) k8.b).a = "type.googleapis.com/google.crypto.tink.AesGcmKey";
                ljh k9 = khz.c.k();
                int i6 = kbdVar.a;
                if (!k9.b.y()) {
                    k9.t();
                }
                ((khz) k9.b).a = i6;
                lim e5 = ((khz) k9.q()).e();
                if (!k8.b.y()) {
                    k8.t();
                }
                ((kji) k8.b).b = e5;
                kbc kbcVar = kbdVar.d;
                if (kbc.a.equals(kbcVar)) {
                    kjrVar4 = kjr.TINK;
                } else if (kbc.b.equals(kbcVar)) {
                    kjrVar4 = kjr.CRUNCHY;
                } else if (kbc.c.equals(kbcVar)) {
                    kjrVar4 = kjr.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(kbcVar))));
                }
                if (!k8.b.y()) {
                    k8.t();
                }
                ((kji) k8.b).c = kjrVar4.a();
                return kgl.a((kji) k8.q());
            case 4:
                kbh kbhVar = (kbh) kagVar;
                kgf kgfVar5 = kco.a;
                ljh k10 = kji.d.k();
                if (!k10.b.y()) {
                    k10.t();
                }
                ((kji) k10.b).a = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                ljh k11 = kib.c.k();
                int i7 = kbhVar.a;
                if (!k11.b.y()) {
                    k11.t();
                }
                ((kib) k11.b).a = i7;
                lim e6 = ((kib) k11.q()).e();
                if (!k10.b.y()) {
                    k10.t();
                }
                ((kji) k10.b).b = e6;
                kbg kbgVar = kbhVar.b;
                if (kbg.a.equals(kbgVar)) {
                    kjrVar5 = kjr.TINK;
                } else if (kbg.b.equals(kbgVar)) {
                    kjrVar5 = kjr.CRUNCHY;
                } else if (kbg.c.equals(kbgVar)) {
                    kjrVar5 = kjr.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(kbgVar))));
                }
                if (!k10.b.y()) {
                    k10.t();
                }
                ((kji) k10.b).c = kjrVar5.a();
                return kgl.a((kji) k10.q());
            case 5:
                kbl kblVar = (kbl) kagVar;
                kgf kgfVar6 = kcr.a;
                ljh k12 = kji.d.k();
                if (!k12.b.y()) {
                    k12.t();
                }
                ((kji) k12.b).a = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                lim e7 = kif.a.e();
                if (!k12.b.y()) {
                    k12.t();
                }
                ((kji) k12.b).b = e7;
                kbk kbkVar = kblVar.a;
                if (kbk.a.equals(kbkVar)) {
                    kjrVar6 = kjr.TINK;
                } else if (kbk.b.equals(kbkVar)) {
                    kjrVar6 = kjr.CRUNCHY;
                } else if (kbk.c.equals(kbkVar)) {
                    kjrVar6 = kjr.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(kbkVar.d));
                }
                if (!k12.b.y()) {
                    k12.t();
                }
                ((kji) k12.b).c = kjrVar6.a();
                return kgl.a((kji) k12.q());
            case 6:
                kcg kcgVar = (kcg) kagVar;
                kgf kgfVar7 = kda.a;
                ljh k13 = kji.d.k();
                if (!k13.b.y()) {
                    k13.t();
                }
                ((kji) k13.b).a = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                lim e8 = kkc.b.e();
                if (!k13.b.y()) {
                    k13.t();
                }
                ((kji) k13.b).b = e8;
                kcf kcfVar = kcgVar.a;
                if (kcf.a.equals(kcfVar)) {
                    kjrVar7 = kjr.TINK;
                } else if (kcf.b.equals(kcfVar)) {
                    kjrVar7 = kjr.CRUNCHY;
                } else if (kcf.c.equals(kcfVar)) {
                    kjrVar7 = kjr.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(kcfVar.d));
                }
                if (!k13.b.y()) {
                    k13.t();
                }
                ((kji) k13.b).c = kjrVar7.a();
                return kgl.a((kji) k13.q());
            case 7:
                kdh kdhVar = (kdh) kagVar;
                Map map = kdl.a;
                ljh k14 = kji.d.k();
                if (!k14.b.y()) {
                    k14.t();
                }
                ((kji) k14.b).a = "type.googleapis.com/google.crypto.tink.AesSivKey";
                ljh k15 = kid.c.k();
                int i8 = kdhVar.a;
                if (!k15.b.y()) {
                    k15.t();
                }
                ((kid) k15.b).a = i8;
                lim e9 = ((kid) k15.q()).e();
                if (!k14.b.y()) {
                    k14.t();
                }
                ((kji) k14.b).b = e9;
                kdg kdgVar = kdhVar.b;
                if (kdl.a.containsKey(kdgVar)) {
                    kjr kjrVar9 = (kjr) kdl.a.get(kdgVar);
                    if (!k14.b.y()) {
                        k14.t();
                    }
                    ((kji) k14.b).c = kjrVar9.a();
                    return kgl.a((kji) k14.q());
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(kdgVar))));
            case 8:
                keb kebVar = (keb) kagVar;
                kgf kgfVar8 = kee.a;
                ljh k16 = kji.d.k();
                if (!k16.b.y()) {
                    k16.t();
                }
                ((kji) k16.b).a = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
                ljh k17 = kjc.c.k();
                ljh k18 = kjd.d.k();
                kjb kjbVar = (kjb) kee.h.o(kebVar.a);
                if (!k18.b.y()) {
                    k18.t();
                }
                ((kjd) k18.b).a = kjbVar.a();
                kja kjaVar = (kja) kee.i.o(kebVar.b);
                if (!k18.b.y()) {
                    k18.t();
                }
                ((kjd) k18.b).b = kjaVar.a();
                kiz kizVar = (kiz) kee.j.o(kebVar.c);
                if (!k18.b.y()) {
                    k18.t();
                }
                ((kjd) k18.b).c = kizVar.a();
                kjd kjdVar = (kjd) k18.q();
                if (!k17.b.y()) {
                    k17.t();
                }
                kjc kjcVar = (kjc) k17.b;
                kjdVar.getClass();
                kjcVar.b = kjdVar;
                kjcVar.a |= 1;
                lim e10 = ((kjc) k17.q()).e();
                if (!k16.b.y()) {
                    k16.t();
                }
                ((kji) k16.b).b = e10;
                kjr kjrVar10 = (kjr) kee.g.o(kebVar.d);
                if (!k16.b.y()) {
                    k16.t();
                }
                ((kji) k16.b).c = kjrVar10.a();
                return kgl.a((kji) k16.q());
            case 9:
                kgx kgxVar = (kgx) kagVar;
                kgf kgfVar9 = khi.a;
                ljh k19 = kji.d.k();
                if (!k19.b.y()) {
                    k19.t();
                }
                ((kji) k19.b).a = "type.googleapis.com/google.crypto.tink.AesCmacKey";
                ljh k20 = kho.d.k();
                ljh k21 = khp.b.k();
                int i9 = kgxVar.b;
                if (!k21.b.y()) {
                    k21.t();
                }
                ((khp) k21.b).a = i9;
                khp khpVar = (khp) k21.q();
                if (!k20.b.y()) {
                    k20.t();
                }
                ljn ljnVar3 = k20.b;
                kho khoVar = (kho) ljnVar3;
                khpVar.getClass();
                khoVar.c = khpVar;
                khoVar.a |= 1;
                int i10 = kgxVar.a;
                if (!ljnVar3.y()) {
                    k20.t();
                }
                ((kho) k20.b).b = i10;
                lim e11 = ((kho) k20.q()).e();
                if (!k19.b.y()) {
                    k19.t();
                }
                ((kji) k19.b).b = e11;
                kgw kgwVar = kgxVar.c;
                if (kgw.a.equals(kgwVar)) {
                    kjrVar8 = kjr.TINK;
                } else if (kgw.b.equals(kgwVar)) {
                    kjrVar8 = kjr.CRUNCHY;
                } else if (kgw.d.equals(kgwVar)) {
                    kjrVar8 = kjr.RAW;
                } else if (kgw.c.equals(kgwVar)) {
                    kjrVar8 = kjr.LEGACY;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(kgwVar))));
                }
                if (!k19.b.y()) {
                    k19.t();
                }
                ((kji) k19.b).c = kjrVar8.a();
                return kgl.a((kji) k19.q());
            case 10:
                khe kheVar = (khe) kagVar;
                kgf kgfVar10 = khk.a;
                ljh k22 = kji.d.k();
                if (!k22.b.y()) {
                    k22.t();
                }
                ((kji) k22.b).a = "type.googleapis.com/google.crypto.tink.HmacKey";
                ljh k23 = kix.e.k();
                ljh k24 = kiy.c.k();
                int i11 = kheVar.b;
                if (!k24.b.y()) {
                    k24.t();
                }
                ((kiy) k24.b).b = i11;
                kiv kivVar = (kiv) khk.f.o(kheVar.d);
                if (!k24.b.y()) {
                    k24.t();
                }
                ((kiy) k24.b).a = kivVar.a();
                kiy kiyVar = (kiy) k24.q();
                if (!k23.b.y()) {
                    k23.t();
                }
                ljn ljnVar4 = k23.b;
                kix kixVar = (kix) ljnVar4;
                kiyVar.getClass();
                kixVar.b = kiyVar;
                kixVar.a |= 1;
                int i12 = kheVar.a;
                if (!ljnVar4.y()) {
                    k23.t();
                }
                ((kix) k23.b).c = i12;
                lim e12 = ((kix) k23.q()).e();
                if (!k22.b.y()) {
                    k22.t();
                }
                ((kji) k22.b).b = e12;
                kjr kjrVar11 = (kjr) khk.e.o(kheVar.c);
                if (!k22.b.y()) {
                    k22.t();
                }
                ((kji) k22.b).c = kjrVar11.a();
                return kgl.a((kji) k22.q());
            case 11:
                kkn kknVar = (kkn) kagVar;
                kgf kgfVar11 = klq.a;
                ljh k25 = kji.d.k();
                if (!k25.b.y()) {
                    k25.t();
                }
                ((kji) k25.b).a = "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
                lim e13 = kir.b.e();
                if (!k25.b.y()) {
                    k25.t();
                }
                ((kji) k25.b).b = e13;
                kjr kjrVar12 = (kjr) klq.g.o(kknVar.a);
                if (!k25.b.y()) {
                    k25.t();
                }
                ((kji) k25.b).c = kjrVar12.a();
                return kgl.a((kji) k25.q());
            case 12:
                kkz kkzVar = (kkz) kagVar;
                kgf kgfVar12 = klt.a;
                ljh k26 = kji.d.k();
                if (!k26.b.y()) {
                    k26.t();
                }
                ((kji) k26.b).a = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
                ljh k27 = kjt.e.k();
                ljh k28 = kju.b.k();
                kiv kivVar2 = (kiv) klt.h.o(kkzVar.e);
                if (!k28.b.y()) {
                    k28.t();
                }
                ((kju) k28.b).a = kivVar2.a();
                kju kjuVar = (kju) k28.q();
                if (!k27.b.y()) {
                    k27.t();
                }
                ljn ljnVar5 = k27.b;
                kjt kjtVar = (kjt) ljnVar5;
                kjuVar.getClass();
                kjtVar.b = kjuVar;
                kjtVar.a |= 1;
                int i13 = kkzVar.b;
                if (!ljnVar5.y()) {
                    k27.t();
                }
                ((kjt) k27.b).c = i13;
                lim t = lim.t(iuu.v(kkzVar.c));
                if (!k27.b.y()) {
                    k27.t();
                }
                ((kjt) k27.b).d = t;
                lim e14 = ((kjt) k27.q()).e();
                if (!k26.b.y()) {
                    k26.t();
                }
                ((kji) k26.b).b = e14;
                kjr kjrVar13 = (kjr) klt.g.o(kkzVar.d);
                if (!k26.b.y()) {
                    k26.t();
                }
                ((kji) k26.b).c = kjrVar13.a();
                return kgl.a((kji) k26.q());
            default:
                klg klgVar = (klg) kagVar;
                kgf kgfVar13 = klv.a;
                ljh k29 = kji.d.k();
                if (!k29.b.y()) {
                    k29.t();
                }
                ((kji) k29.b).a = "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
                ljh k30 = kjx.e.k();
                ljh k31 = kjy.d.k();
                kiv kivVar3 = (kiv) klv.h.o(klgVar.e);
                if (!k31.b.y()) {
                    k31.t();
                }
                ((kjy) k31.b).a = kivVar3.a();
                kiv kivVar4 = (kiv) klv.h.o(klgVar.f);
                if (!k31.b.y()) {
                    k31.t();
                }
                ((kjy) k31.b).b = kivVar4.a();
                int i14 = klgVar.g;
                if (!k31.b.y()) {
                    k31.t();
                }
                ((kjy) k31.b).c = i14;
                kjy kjyVar = (kjy) k31.q();
                if (!k30.b.y()) {
                    k30.t();
                }
                ljn ljnVar6 = k30.b;
                kjx kjxVar = (kjx) ljnVar6;
                kjyVar.getClass();
                kjxVar.b = kjyVar;
                kjxVar.a |= 1;
                int i15 = klgVar.b;
                if (!ljnVar6.y()) {
                    k30.t();
                }
                ((kjx) k30.b).c = i15;
                lim t2 = lim.t(iuu.v(klgVar.c));
                if (!k30.b.y()) {
                    k30.t();
                }
                ((kjx) k30.b).d = t2;
                lim e15 = ((kjx) k30.q()).e();
                if (!k29.b.y()) {
                    k29.t();
                }
                ((kji) k29.b).b = e15;
                kjr kjrVar14 = (kjr) klv.g.o(klgVar.d);
                if (!k29.b.y()) {
                    k29.t();
                }
                ((kji) k29.b).c = kjrVar14.a();
                return kgl.a((kji) k29.q());
        }
    }
}
