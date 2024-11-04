package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhu {
    public static final /* synthetic */ mqr[] a;
    public static final bfn b;

    static {
        mpg mpgVar = new mpg(dhu.class, "displayedDrawable", "getDisplayedDrawable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/runtime/MutableState;", 1);
        int i = mpo.a;
        a = new mqr[]{mpgVar};
        b = new bfn("DisplayedDrawable");
    }

    public static final void a(Object obj, aox aoxVar, abi abiVar, int i) {
        boolean z;
        boolean z2;
        abi b2 = abiVar.b(-496196496);
        int i2 = aon.a;
        aon aonVar = aom.e;
        int i3 = avo.a;
        avo avoVar = avn.b;
        cka ckaVar = cka.f;
        b2.u(2062132209);
        Context context = (Context) b2.f(AndroidCompositionLocals_androidKt.b);
        b2.u(-102500440);
        boolean B = b2.B(context);
        abp abpVar = (abp) b2;
        Object P = abpVar.P();
        if (B || P == abh.a) {
            P = dgo.c(context);
            P.getClass();
            abpVar.Z(P);
        }
        dhd dhdVar = (dhd) P;
        abpVar.U();
        abpVar.U();
        dhdVar.getClass();
        int i4 = i >> 3;
        b2.u(1761561633);
        b2.u(-994116819);
        boolean B2 = b2.B(obj) | b2.B(dhdVar);
        int i5 = ((i >> 21) & 896) | 72 | (i4 & 7168);
        boolean z3 = true;
        if ((((i5 & 896) ^ 384) > 256 && b2.B(ckaVar)) || (i5 & 384) == 256) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = B2 | z;
        if ((((i5 & 7168) ^ 3072) > 2048 && b2.B(avoVar)) || (i5 & 3072) == 2048) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z4;
        Object P2 = abpVar.P();
        if (z5 || P2 == abh.a) {
            dhb d = dhdVar.d(obj);
            if (amr.i(avoVar, avn.a)) {
                d = (dhb) d.m();
            } else if (amr.i(avoVar, avn.c) || amr.i(avoVar, avn.b)) {
                d = (dhb) d.n();
            }
            P2 = ckaVar.a(d);
            abpVar.Z(P2);
        }
        dhb dhbVar = (dhb) P2;
        abpVar.U();
        abpVar.U();
        dhbVar.getClass();
        dig digVar = null;
        if (dtq.k(dhbVar.k)) {
            int i6 = dhbVar.j;
            if (dtq.k(i6)) {
                digVar = new dig(dhbVar.k, i6);
            }
        }
        int i7 = i4 & 112;
        b2.u(-1879820411);
        b2.u(2072400658);
        boolean B3 = b2.B(digVar);
        int i8 = i7 | 8;
        if ((((i8 & 112) ^ 48) <= 32 || !b2.B(aoxVar)) && (i8 & 48) != 32) {
            z3 = false;
        }
        boolean z6 = B3 | z3;
        Object P3 = abpVar.P();
        if (z6 || P3 == abh.a) {
            if (digVar != null) {
                P3 = new dhw(new did(digVar), aoxVar);
            } else {
                dhx dhxVar = new dhx();
                P3 = new dhw(new dia(new dhs(dhxVar, 0)), nk.e(aoxVar, new dht(dhxVar, 0)));
            }
            abpVar.Z(P3);
        }
        dhw dhwVar = (dhw) P3;
        abpVar.U();
        abpVar.U();
        dgq dgqVar = dhwVar.b;
        aox aoxVar2 = dhwVar.a;
        b2.u(2062152683);
        ((Boolean) b2.f(bct.a)).booleanValue();
        abpVar.U();
        int i9 = i << 3;
        b(dhbVar, dgqVar, aoxVar2, aonVar, avoVar, b2, ((i << 6) & 7168) | 72 | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128));
        afv d2 = b2.d();
        if (d2 != null) {
            ((aeu) d2).d = new xb(obj, aoxVar, i, 5, null);
        }
    }

    public static final void b(dhb dhbVar, dgq dgqVar, aox aoxVar, aon aonVar, avo avoVar, abi abiVar, int i) {
        abi b2 = abiVar.b(-1979801521);
        b2.u(-38500790);
        abp abpVar = (abp) b2;
        Object P = abpVar.P();
        if (P == abh.a) {
            acf acfVar = new acf(act.a(mnc.a, b2));
            abpVar.Z(acfVar);
            P = acfVar;
        }
        msw mswVar = ((acf) P).a;
        b2.u(-1917399629);
        boolean B = b2.B(dhbVar) | b2.B(dgqVar);
        Object P2 = abpVar.P();
        if (B || P2 == abh.a) {
            P2 = new dhv(dhbVar, dgqVar, mswVar);
            abpVar.Z(P2);
        }
        dhv dhvVar = (dhv) P2;
        abpVar.U();
        abpVar.U();
        b2.u(877917030);
        b2.u(-110219596);
        boolean B2 = b2.B(dhvVar);
        Object P3 = abpVar.P();
        if (B2 || P3 == abh.a) {
            P3 = new bco(dhvVar, 15);
            abpVar.Z(P3);
        }
        abpVar.U();
        int i2 = bff.a;
        int i3 = i >> 3;
        ri.b(dhvVar, aoxVar.a(new AppendedSemanticsElement((moh) P3)), aonVar, avoVar, b2, ((i >> 6) & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016));
        abpVar.U();
        afv d = b2.d();
        if (d != null) {
            ((aeu) d).d = new dhr(dhbVar, dgqVar, aoxVar, aonVar, avoVar, i);
        }
    }
}
