package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erl {
    public static final long a = mpd.l(1250, mrn.c);

    public static final void a(aox aoxVar, wi wiVar, abi abiVar, int i) {
        aox aoxVar2;
        int i2;
        int i3;
        wiVar.getClass();
        int i4 = i & 112;
        int i5 = i | 6;
        abi b = abiVar.b(91065581);
        boolean z = true;
        if (i4 == 0) {
            if (true != b.B(wiVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i5 |= i3;
        }
        if ((i & 896) == 0) {
            if (true != b.z(R.raw.inner_star)) {
                i2 = 128;
            } else {
                i2 = 256;
            }
            i5 |= i2;
        }
        if ((i5 & 731) == 146 && b.G()) {
            b.r();
            aoxVar2 = aoxVar;
        } else {
            aou aouVar = aox.d;
            float floatValue = ((Number) ((equ) wiVar.e()).a.e(Float.valueOf(0.0f))).floatValue();
            b.u(1521605037);
            adp adpVar = (adp) aly.b(new Object[0], null, bcf.r, b, 3080, 6);
            b.u(-1388520911);
            abp abpVar = (abp) b;
            Object P = abpVar.P();
            if (P == abh.a) {
                P = up.a(0.0f);
                abpVar.Z(P);
            }
            gga ggaVar = (gga) P;
            abpVar.U();
            if (floatValue >= adpVar.b()) {
                b.u(-94394617);
                Float valueOf = Float.valueOf(floatValue);
                b.u(-1388515740);
                boolean B = b.B(adpVar) | b.y(floatValue);
                Object P2 = abpVar.P();
                if (B || P2 == abh.a) {
                    P2 = new erk(adpVar, floatValue, null);
                    abpVar.Z(P2);
                }
                abpVar.U();
                act.e(valueOf, (mol) P2, b);
                abpVar.U();
            } else {
                b.u(-94094940);
                act.e(mlh.a, new eau(ggaVar, (mmx) null, 8), b);
                abpVar.U();
            }
            erz erzVar = new erz(adpVar, ggaVar);
            abpVar.U();
            b.u(-647363415);
            Integer num = cyq.a;
            num.getClass();
            bso f = bpp.f(num, Integer.valueOf(jw.d(dd.h(b).b)), new String[]{"**"}, b);
            abpVar.U();
            gga e = bpp.e(new bso[]{f}, b);
            daz t = bpt.t(new dba(R.raw.inner_star), b);
            dat o = bsn.o(new erm(t.a(), "04 finding", null, 0, 0, 92), b);
            ern ernVar = (ern) bsn.n(wiVar);
            if (ernVar.b != erv.c || ernVar.a == erv.b) {
                z = false;
            }
            nq.e(z, null, ue.e(null, 3), ue.f(null, 3), null, alg.e(170666949, new erj(o, aouVar, e, t, erzVar, 0), b), b, 200064);
            aoxVar2 = aouVar;
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new xb(aoxVar2, wiVar, i, 7, null);
        }
    }
}
