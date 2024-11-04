package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.adm.R;
import defpackage.a;
import defpackage.abh;
import defpackage.abi;
import defpackage.abp;
import defpackage.acb;
import defpackage.acr;
import defpackage.act;
import defpackage.adt;
import defpackage.aee;
import defpackage.aep;
import defpackage.aeq;
import defpackage.aeu;
import defpackage.afv;
import defpackage.agu;
import defpackage.agw;
import defpackage.alg;
import defpackage.ame;
import defpackage.amg;
import defpackage.ap;
import defpackage.bas;
import defpackage.baw;
import defpackage.bbi;
import defpackage.bbq;
import defpackage.bbr;
import defpackage.bbs;
import defpackage.bcg;
import defpackage.bci;
import defpackage.bcj;
import defpackage.bck;
import defpackage.bco;
import defpackage.bet;
import defpackage.bfi;
import defpackage.bym;
import defpackage.cgr;
import defpackage.cjy;
import defpackage.mlh;
import defpackage.moh;
import defpackage.mol;
import defpackage.qz;
import defpackage.tn;
import defpackage.xb;
import defpackage.zc;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final aep a = new acr(agw.a, bbi.c);
    public static final aep b = new agu(bbi.d);
    private static final aep c = new agu(bbi.e);
    private static final aep d = new agu(bbi.f);
    private static final aep e = new agu(bbi.g);
    private static final aep f = new agu(bbi.h);

    /* JADX WARN: Type inference failed for: r12v3, types: [cjz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, agt] */
    public static final void a(baw bawVar, mol molVar, abi abiVar, int i) {
        int i2;
        boolean z;
        bet betVar;
        String str;
        LinkedHashMap linkedHashMap;
        boolean z2;
        int i3;
        int i4;
        int i5 = i & 6;
        abi b2 = abiVar.b(1396852028);
        int i6 = 4;
        if (i5 == 0) {
            if (true != b2.D(bawVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b2.D(molVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && b2.G()) {
            b2.r();
        } else {
            Context context = bawVar.getContext();
            abp abpVar = (abp) b2;
            Object P = abpVar.P();
            if (P == abh.a) {
                aee aeeVar = new aee(new Configuration(context.getResources().getConfiguration()), agw.a);
                abpVar.Z(aeeVar);
                P = aeeVar;
            }
            adt adtVar = (adt) P;
            Object P2 = abpVar.P();
            if (P2 == abh.a) {
                P2 = new zc(adtVar, 20);
                abpVar.Z(P2);
            }
            bawVar.j = (moh) P2;
            Object P3 = abpVar.P();
            if (P3 == abh.a) {
                P3 = new qz();
                abpVar.Z(P3);
            }
            qz qzVar = (qz) P3;
            bfi I = bawVar.I();
            if (I != null) {
                Object P4 = abpVar.P();
                if (P4 == abh.a) {
                    ?? r12 = I.a;
                    int i7 = bck.a;
                    Object parent = bawVar.getParent();
                    parent.getClass();
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    String str2 = "amc:" + str;
                    cjy R = r12.R();
                    Bundle a2 = R.a(str2);
                    if (a2 != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str3 : a2.keySet()) {
                            ArrayList parcelableArrayList = a2.getParcelableArrayList(str3);
                            parcelableArrayList.getClass();
                            linkedHashMap.put(str3, parcelableArrayList);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    ame ameVar = new ame(linkedHashMap, bas.g);
                    try {
                        R.b(str2, new ap(ameVar, i6));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                        z2 = false;
                    }
                    bci bciVar = new bci(ameVar, new bcj(z2, R, str2));
                    abpVar.Z(bciVar);
                    P4 = bciVar;
                }
                bci bciVar2 = (bci) P4;
                mlh mlhVar = mlh.a;
                boolean D = b2.D(bciVar2);
                Object P5 = abpVar.P();
                if (D || P5 == abh.a) {
                    P5 = new bco(bciVar2, 1);
                    abpVar.Z(P5);
                }
                act.c(mlhVar, (moh) P5, b2);
                Configuration c2 = c(adtVar);
                Object P6 = abpVar.P();
                if (P6 == abh.a) {
                    P6 = new bet((byte[]) null);
                    abpVar.Z(P6);
                }
                bet betVar2 = (bet) P6;
                Object P7 = abpVar.P();
                Object obj = P7;
                if (P7 == abh.a) {
                    Configuration configuration = new Configuration();
                    if (c2 != null) {
                        configuration.setTo(c2);
                    }
                    abpVar.Z(configuration);
                    obj = configuration;
                }
                Configuration configuration2 = (Configuration) obj;
                Object P8 = abpVar.P();
                if (P8 == abh.a) {
                    P8 = new bbr(configuration2, betVar2);
                    abpVar.Z(P8);
                }
                bbr bbrVar = (bbr) P8;
                boolean D2 = b2.D(context);
                Object P9 = abpVar.P();
                if (D2 || P9 == abh.a) {
                    P9 = new tn(context, bbrVar, 12);
                    abpVar.Z(P9);
                }
                act.c(betVar2, (moh) P9, b2);
                Object P10 = abpVar.P();
                if (P10 == abh.a) {
                    P10 = new bym((byte[]) null, (byte[]) null);
                    abpVar.Z(P10);
                }
                bym bymVar = (bym) P10;
                Object P11 = abpVar.P();
                if (P11 == abh.a) {
                    P11 = new bbs(bymVar, 0);
                    abpVar.Z(P11);
                }
                bbs bbsVar = (bbs) P11;
                boolean D3 = b2.D(context);
                Object P12 = abpVar.P();
                if (D3 || P12 == abh.a) {
                    P12 = new tn(context, bbsVar, 13);
                    abpVar.Z(P12);
                }
                act.c(bymVar, (moh) P12, b2);
                boolean booleanValue = ((Boolean) b2.f(bcg.f)).booleanValue();
                if (Build.VERSION.SDK_INT >= 31 && (betVar = bawVar.z) != null) {
                    z = ((Boolean) betVar.a.a()).booleanValue();
                } else {
                    z = false;
                }
                acb.b(new aeq[]{a.b(c(adtVar)), b.b(context), cgr.a.b(I.b), e.b(I.a), amg.a.b(bciVar2), f.b(bawVar), c.b(betVar2), d.b(bymVar), bcg.f.b(Boolean.valueOf(booleanValue | z))}, alg.e(1471621628, new bbq(bawVar, qzVar, molVar), b2), b2, 56);
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        }
        afv d2 = b2.d();
        if (d2 != null) {
            ((aeu) d2).d = new xb(bawVar, molVar, i, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.ag(str, "CompositionLocal ", " not present"));
    }

    private static final Configuration c(adt adtVar) {
        return (Configuration) adtVar.a();
    }
}
