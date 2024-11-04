package defpackage;

import androidx.compose.foundation.layout.PaddingElement;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ert {
    public static final aaj a = fzo.h();
    public static final long b;
    public static final float c;

    static {
        long j = mrl.a;
        b = mpd.l(5000, mrn.c);
        c = 24.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(equ equVar, abi abiVar, int i) {
        boolean z;
        float f;
        float floatValue;
        aox c2;
        abi b2 = abiVar.b(458412689);
        adt adtVar = (adt) aly.b(new Object[0], null, ers.b, b2, 3080, 6);
        if (!((Boolean) adtVar.a()).booleanValue() && equVar.d == 4 && !bsn.l(equVar)) {
            z = true;
        } else {
            z = false;
        }
        b2.u(1116491109);
        if (z || bsn.l(equVar)) {
            mlh mlhVar = mlh.a;
            b2.u(1116495445);
            boolean B = b2.B(adtVar);
            abp abpVar = (abp) b2;
            Object P = abpVar.P();
            if (B || P == abh.a) {
                P = new eau(adtVar, (mmx) null, 9);
                abpVar.Z(P);
            }
            abpVar.U();
            act.e(mlhVar, (mol) P, b2);
        }
        abp abpVar2 = (abp) b2;
        abpVar2.U();
        if (true != z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        Object c3 = qh.c(250, vi.b, 2);
        vu vuVar = ur.a;
        b2.u(313403102);
        if (c3 == ur.a) {
            boolean y = b2.y(0.01f);
            Object P2 = abpVar2.P();
            if (y || P2 == abh.a) {
                P2 = qh.b(0.0f, Float.valueOf(0.01f), 3);
                abpVar2.Z(P2);
            }
            c3 = (vu) P2;
        }
        abpVar2.U();
        Float valueOf = Float.valueOf(f);
        atk atkVar = wp.a;
        Float valueOf2 = Float.valueOf(0.01f);
        Object P3 = abpVar2.P();
        if (P3 == abh.a) {
            aee aeeVar = new aee(null, agw.a);
            abpVar2.Z(aeeVar);
            P3 = aeeVar;
        }
        adt adtVar2 = (adt) P3;
        Object P4 = abpVar2.P();
        if (P4 == abh.a) {
            P4 = new gga(valueOf, atkVar);
            abpVar2.Z(P4);
        }
        gga ggaVar = (gga) P4;
        agt a2 = agq.a(null, b2);
        if (c3 instanceof vu) {
            vu vuVar2 = (vu) c3;
            if (!amr.i(vuVar2.c, valueOf2)) {
                c3 = new vu(vuVar2.a, vuVar2.b, valueOf2);
            }
        }
        agt a3 = agq.a(c3, b2);
        Object P5 = abpVar2.P();
        if (P5 == abh.a) {
            P5 = moz.at(-1, 0, 6);
            abpVar2.Z(P5);
        }
        mvy mvyVar = (mvy) P5;
        boolean D = b2.D(mvyVar) | b2.D(valueOf);
        Object P6 = abpVar2.P();
        if (D || P6 == abh.a) {
            P6 = new aqg(mvyVar, valueOf, 1);
            abpVar2.Z(P6);
        }
        act.f((mnw) P6, b2);
        boolean D2 = b2.D(mvyVar) | b2.D(ggaVar) | b2.B(a3) | b2.B(a2);
        Object P7 = abpVar2.P();
        if (D2 || P7 == abh.a) {
            P7 = new uq(mvyVar, ggaVar, a3, a2, null);
            abpVar2.Z(P7);
        }
        act.e(mvyVar, (mol) P7, b2);
        agt agtVar = (agt) adtVar2.a();
        agt agtVar2 = agtVar;
        if (agtVar == null) {
            agtVar2 = ggaVar.g;
        }
        String g = bef.g(R.string.spot_device_nearby_instruction, b2);
        aou aouVar = aox.d;
        aox a4 = aot.a(new PaddingElement(0.0f, c, 0.0f), new PaddingElement(12.0f, 0.0f, 12.0f));
        floatValue = ((Number) agtVar2.a()).floatValue();
        if (floatValue == 1.0f) {
            c2 = a4;
        } else {
            c2 = jw.c(a4, 0.0f, 0.0f, floatValue, true, 126971);
        }
        aox aoxVar = c2;
        aah.b(g, aoxVar, dd.h(b2).c, 0L, 0L, new bku(), 0L, 0, false, 0, 0, a.a, b2, 0, 0, 65016);
        afv d = b2.d();
        if (d != null) {
            ((aeu) d).d = new bce(equVar, i, 2);
        }
    }

    public static final void b(mnw mnwVar, abi abiVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        abi b2 = abiVar.b(1830615201);
        if (i4 == 0) {
            if (true != b2.D(mnwVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && b2.G()) {
            b2.r();
        } else {
            mlh mlhVar = mlh.a;
            b2.u(-839600573);
            int i5 = i2 & 14;
            abp abpVar = (abp) b2;
            Object P = abpVar.P();
            if (i5 == 4 || P == abh.a) {
                P = new eau(mnwVar, (mmx) null, 10);
                abpVar.Z(P);
            }
            abpVar.U();
            act.e(mlhVar, (mol) P, b2);
        }
        afv d = b2.d();
        if (d != null) {
            ((aeu) d).d = new bce(mnwVar, i, 3);
        }
    }

    public static final void c(aox aoxVar, agt agtVar, abi abiVar, int i) {
        int i2;
        Object obj;
        int i3;
        int i4;
        agtVar.getClass();
        int i5 = i & 14;
        abi b2 = abiVar.b(-895919892);
        if (i5 == 0) {
            if (true != b2.B(aoxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != b2.B(agtVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && b2.G()) {
            b2.r();
        } else {
            int i6 = aon.a;
            aoo aooVar = aom.m;
            xn xnVar = xp.b;
            awh awhVar = xz.a;
            b2.u(-1789960183);
            if (amr.i(xnVar, xp.a) && amr.i(aooVar, aom.l)) {
                obj = xz.a;
            } else {
                abp abpVar = (abp) b2;
                Object P = abpVar.P();
                if (P == abh.a) {
                    P = new yb(xnVar, aooVar);
                    abpVar.Z(P);
                }
                obj = (yb) P;
            }
            abp abpVar2 = (abp) b2;
            abpVar2.U();
            int a2 = abd.a(b2);
            aek L = abpVar2.L();
            aox e = de.e(b2, aoxVar);
            int i7 = axu.a;
            mnw mnwVar = axt.a;
            b2.v();
            if (abpVar2.x) {
                b2.k(mnwVar);
            } else {
                b2.x();
            }
            agx.a(b2, obj, axt.d);
            agx.a(b2, L, axt.c);
            mol molVar = axt.e;
            if (abpVar2.x || !amr.i(abpVar2.P(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                abpVar2.Z(valueOf);
                b2.i(valueOf, molVar);
            }
            agx.a(b2, e, axt.b);
            wi a3 = eqz.a(agtVar, "ProximityUiStatusText", b2, ((i2 >> 3) & 14) | 48);
            d(a3, b2, 0);
            rl.b(null, null, alg.e(58049440, new dht(a3, 3), b2), b2, 3072);
            b2.n();
        }
        afv d = b2.d();
        if (d != null) {
            ((aeu) d).d = new xb(aoxVar, agtVar, i, 8, null);
        }
    }

    public static final void d(wi wiVar, abi abiVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        abi b2 = abiVar.b(1263223560);
        if (i5 == 0) {
            if (true != b2.B(wiVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && b2.G()) {
            b2.r();
        } else {
            equ equVar = (equ) wiVar.e();
            b2.u(1623579312);
            adt adtVar = (adt) aly.b(new Object[0], null, ers.a, b2, 3080, 6);
            if (bsn.l(equVar)) {
                b2.u(-1216260206);
                b2.u(237861514);
                boolean B = b2.B(adtVar);
                abp abpVar = (abp) b2;
                Object P = abpVar.P();
                if (B || P == abh.a) {
                    P = new ctm(adtVar, 19);
                    abpVar.Z(P);
                }
                abpVar.U();
                b((mnw) P, b2, 0);
                abpVar.U();
                i3 = R.string.spot_found_device;
            } else {
                b2.u(-1216136857);
                int i6 = equVar.d;
                if (i6 == 4) {
                    if (!((Boolean) adtVar.a()).booleanValue()) {
                        b2.u(237868170);
                        boolean B2 = b2.B(adtVar);
                        abp abpVar2 = (abp) b2;
                        Object P2 = abpVar2.P();
                        if (B2 || P2 == abh.a) {
                            P2 = new ctm(adtVar, 20);
                            abpVar2.Z(P2);
                        }
                        abpVar2.U();
                        b((mnw) P2, b2, 0);
                        abpVar2.U();
                        abpVar2.U();
                        i3 = R.string.spot_connected_to_device;
                    } else {
                        Float f = (Float) equVar.a.e(Float.valueOf(0.0f));
                        float floatValue = f.floatValue();
                        if (floatValue >= 0.0f && floatValue <= 0.4f) {
                            i3 = R.string.spot_device_far_away;
                        } else {
                            float floatValue2 = f.floatValue();
                            if (floatValue2 >= 0.4f && floatValue2 <= 0.7f) {
                                i3 = R.string.spot_device_close;
                            } else {
                                i3 = R.string.spot_device_very_close;
                            }
                        }
                        abp abpVar3 = (abp) b2;
                        abpVar3.U();
                        abpVar3.U();
                    }
                    nk.c(Integer.valueOf(i3), null, cka.k, null, null, erc.a, b2, 1597824);
                } else {
                    if (i6 == 3 || i6 == 1 || i6 == 0) {
                        i3 = R.string.spot_connecting_to_device;
                    } else if (i6 == 2) {
                        i3 = R.string.spot_device_no_longer_in_range;
                    } else {
                        throw new mku();
                    }
                    ((abp) b2).U();
                }
            }
            ((abp) b2).U();
            nk.c(Integer.valueOf(i3), null, cka.k, null, null, erc.a, b2, 1597824);
        }
        afv d = b2.d();
        if (d != null) {
            ((aeu) d).d = new bce(wiVar, i, 4);
        }
    }
}
