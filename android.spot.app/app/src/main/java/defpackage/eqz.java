package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqz {
    public static final long a = mpd.l(1250, mrn.c);
    private static final long b = mpd.l(7000, mrn.c);
    private static final long c = mpd.l(1000, mrn.c);
    private static final long d = mpd.l(1000, mrn.c);

    public static final wi a(agt agtVar, String str, abi abiVar, int i) {
        abiVar.u(-226851121);
        abiVar.u(2087884069);
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (P == abh.a) {
            P = new wm(agtVar.a());
            abpVar.Z(P);
        }
        wm wmVar = (wm) P;
        abpVar.U();
        abiVar.u(2087888568);
        Object P2 = abpVar.P();
        if (P2 == abh.a) {
            aee aeeVar = new aee(true, agw.a);
            abpVar.Z(aeeVar);
            P2 = aeeVar;
        }
        adt adtVar = (adt) P2;
        abpVar.U();
        abiVar.u(2087890378);
        if (((Boolean) adtVar.a()).booleanValue()) {
            abiVar.u(2087894163);
            Object P3 = abpVar.P();
            if (P3 == abh.a) {
                P3 = new ctm(adtVar, 14);
                abpVar.Z(P3);
            }
            abpVar.U();
            d(wmVar, agtVar, (mnw) P3, abiVar, ((i << 3) & 112) | 384);
        } else if (b(bsn.m((equ) wmVar.c(), (equ) agtVar.a())) != null) {
            c(adtVar, true);
        } else {
            wmVar.e(agtVar.a());
        }
        abpVar.U();
        int i2 = wl.a;
        boolean B = abiVar.B(wmVar);
        Object P4 = abpVar.P();
        if (B || P4 == abh.a) {
            P4 = new wi(wmVar, null, str);
            abpVar.Z(P4);
        }
        wi wiVar = (wi) P4;
        abiVar.u(1030636991);
        wiVar.f(wmVar.c(), abiVar, 0);
        boolean B2 = abiVar.B(wiVar);
        Object P5 = abpVar.P();
        if (B2 || P5 == abh.a) {
            P5 = new oq(wiVar, 11);
            abpVar.Z(P5);
        }
        act.c(wiVar, (moh) P5, abiVar);
        abpVar.U();
        abpVar.U();
        return wiVar;
    }

    public static final mrl b(wc wcVar) {
        if (!rb.c(wcVar, erv.d, erv.a) && !rb.c(wcVar, erv.c, erv.a) && !rb.c(wcVar, erv.b, erv.a)) {
            ern ernVar = (ern) wcVar;
            erv ervVar = ernVar.a;
            erv ervVar2 = erv.b;
            if ((ervVar != ervVar2 && ernVar.b == ervVar2) || (ervVar == ervVar2 && ernVar.b != ervVar2)) {
                return new mrl(c);
            }
            if (!rb.c(wcVar, erv.a, ervVar2) && !rb.c(wcVar, erv.a, erv.c)) {
                if (!rb.c(wcVar, erv.d, erv.c)) {
                    erv ervVar3 = erv.c;
                    if (!rb.c(wcVar, ervVar3, ervVar3)) {
                        return null;
                    }
                }
                return new mrl(a);
            }
            return new mrl(d);
        }
        return new mrl(b);
    }

    public static final void c(adt adtVar, boolean z) {
        adtVar.h(Boolean.valueOf(z));
    }

    public static final void d(wm wmVar, agt agtVar, mnw mnwVar, abi abiVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        abi b2 = abiVar.b(1258724038);
        if (i6 == 0) {
            if (true != b2.B(wmVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != b2.B(agtVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != b2.D(mnwVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && b2.G()) {
            b2.r();
        } else {
            act.e(mlh.a, new eqy(wmVar, agtVar, mnwVar, null), b2);
        }
        afv d2 = b2.d();
        if (d2 != null) {
            ((aeu) d2).d = new awy(wmVar, agtVar, mnwVar, i, 3, null);
        }
    }
}
