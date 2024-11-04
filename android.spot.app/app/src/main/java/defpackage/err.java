package defpackage;

import com.google.android.apps.adm.R;
import com.google.ar.core.ImageMetadata;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class err {
    public static final long a = mpd.l(750, mrn.c);
    private static final long c = mpd.l(500, mrn.c);
    public static final ve b = new ve(0.44f, 0.69f, 0.64f, 1.0f);

    /* JADX WARN: Type inference failed for: r8v1, types: [vj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [vj, java.lang.Object] */
    public static final void a(aox aoxVar, wi wiVar, Integer num, abi abiVar, int i) {
        aox aoxVar2;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        float f;
        erm ermVar;
        erm ermVar2;
        int i2;
        int i3;
        int i4;
        wiVar.getClass();
        int i5 = i & 112;
        int i6 = i | 6;
        abi b2 = abiVar.b(1611192432);
        if (i5 == 0) {
            if (true != b2.B(wiVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i6 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != b2.z(R.raw.outer_star)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i6 |= i3;
        }
        if ((i & 7168) == 0) {
            if (true != b2.B(num)) {
                i2 = 1024;
            } else {
                i2 = 2048;
            }
            i6 |= i2;
        }
        if ((i6 & 5851) == 1170 && b2.G()) {
            b2.r();
            aoxVar2 = aoxVar;
        } else {
            int i7 = i6 >> 3;
            aoxVar2 = aox.d;
            b2.u(1418153027);
            eri eriVar = eri.d;
            equ equVar = (equ) wiVar.e();
            b2.u(-802663249);
            if (bsn.k(equVar)) {
                b2.u(1070232852);
                j = dd.h(b2).b;
            } else {
                b2.u(1070234000);
                j = dd.h(b2).d;
            }
            ((abp) b2).U();
            abp abpVar = (abp) b2;
            abpVar.U();
            ars f2 = aqx.f(j);
            boolean B = b2.B(f2);
            Object P = abpVar.P();
            if (B || P == abh.a) {
                P = tz.a.a(f2);
                abpVar.Z(P);
            }
            int i8 = ((((i7 & 14) | 384) & 14) | 3072) & 14;
            atk atkVar = (atk) P;
            equ equVar2 = (equ) wiVar.d();
            b2.u(-802663249);
            if (bsn.k(equVar2)) {
                b2.u(1070232852);
                j2 = dd.h(b2).b;
            } else {
                b2.u(1070234000);
                j2 = dd.h(b2).d;
            }
            abpVar.U();
            abpVar.U();
            aqx aqxVar = new aqx(j2);
            equ equVar3 = (equ) wiVar.e();
            b2.u(-802663249);
            if (bsn.k(equVar3)) {
                b2.u(1070232852);
                j3 = dd.h(b2).b;
            } else {
                b2.u(1070234000);
                j3 = dd.h(b2).d;
            }
            abpVar.U();
            abpVar.U();
            aqx aqxVar2 = new aqx(j3);
            ?? a2 = eriVar.a(wiVar.c(), b2, 0);
            int i9 = i8 | ImageMetadata.EDGE_MODE;
            agt b3 = wl.b(wiVar, aqxVar, aqxVar2, a2, atkVar, b2, i9);
            Integer num2 = cyq.b;
            num2.getClass();
            Integer num3 = cyq.a;
            num3.getClass();
            List P2 = mkm.P(bpp.f(num2, Integer.valueOf(jw.d(d(b3))), new String[]{"**"}, b2), bpp.f(num3, Integer.valueOf(jw.d(d(b3))), new String[]{"**"}, b2));
            abpVar.U();
            bso[] bsoVarArr = (bso[]) P2.toArray(new bso[0]);
            gga e = bpp.e((bso[]) Arrays.copyOf(bsoVarArr, bsoVarArr.length), b2);
            wc n = bsn.n(wiVar);
            b2.u(-1259894126);
            b2.u(475705721);
            Object P3 = abpVar.P();
            if (P3 == abh.a) {
                P3 = up.a(0.0f);
                abpVar.Z(P3);
            }
            gga ggaVar = (gga) P3;
            abpVar.U();
            Object P4 = abpVar.P();
            if (P4 == abh.a) {
                acf acfVar = new acf(act.a(mnc.a, b2));
                abpVar.Z(acfVar);
                P4 = acfVar;
            }
            msw mswVar = ((acf) P4).a;
            erv ervVar = ((ern) n).b;
            if (ervVar == erv.d) {
                z = true;
            } else {
                z = false;
            }
            if (ervVar == erv.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            act.d(Boolean.valueOf(z), Boolean.valueOf(z2), new erp(mswVar, z, ggaVar, z2, null), b2);
            abpVar.U();
            b2.u(-935084575);
            eri eriVar2 = eri.e;
            atk atkVar2 = wp.a;
            equ equVar4 = (equ) wiVar.d();
            b2.u(-1919396155);
            float f3 = 0.5f;
            if (true != bsn.k(equVar4)) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            abpVar.U();
            Float valueOf = Float.valueOf(f);
            equ equVar5 = (equ) wiVar.e();
            b2.u(-1919396155);
            if (true == bsn.k(equVar5)) {
                f3 = 1.0f;
            }
            abpVar.U();
            agt b4 = wl.b(wiVar, valueOf, Float.valueOf(f3), eriVar2.a(wiVar.c(), b2, 0), atkVar2, b2, i9);
            abpVar.U();
            b2.u(-1955011201);
            daz t = bpt.t(new dba(R.raw.outer_star), b2);
            b2.u(233678952);
            num.intValue();
            num.intValue();
            daz t2 = bpt.t(new dba(R.raw.outer_star_with_dial), b2);
            abpVar.U();
            erv ervVar2 = erv.a;
            if (rb.c(n, ervVar2, ervVar2)) {
                ermVar2 = new erm(t.a(), "hold", null, 1, 0, 116);
            } else {
                cyb cybVar = null;
                if (!rb.c(n, erv.a, erv.b) && !rb.c(n, erv.b, erv.a)) {
                    erv ervVar3 = erv.b;
                    if (!rb.c(n, ervVar3, ervVar3)) {
                        if (!rb.c(n, erv.a, erv.c) && !rb.c(n, erv.a, erv.d) && !rb.c(n, erv.c, erv.a)) {
                            erv ervVar4 = erv.c;
                            if (!rb.c(n, ervVar4, ervVar4) && !rb.c(n, erv.c, erv.d)) {
                                erv ervVar5 = erv.d;
                                if (!rb.c(n, ervVar5, ervVar5)) {
                                    if (!rb.c(n, erv.b, erv.d) && !rb.c(n, erv.b, erv.c)) {
                                        if (!rb.c(n, erv.c, erv.b) && !rb.c(n, erv.d, erv.b)) {
                                            if (!rb.c(n, erv.d, erv.c) && !rb.c(n, erv.d, erv.a)) {
                                                ermVar2 = new erm(t.a(), "hold", null, 1, 0, 116);
                                            } else {
                                                ermVar2 = new erm(t.a(), "03 connected", null, 1, 0, 116);
                                            }
                                        } else {
                                            if (t2 != null) {
                                                cybVar = t2.a();
                                            }
                                            ermVar = new erm(cybVar, "in", null, 1, 2, 52);
                                        }
                                    } else {
                                        if (t2 != null) {
                                            cybVar = t2.a();
                                        }
                                        ermVar = new erm(cybVar, "out", null, 1, 2, 52);
                                    }
                                    ermVar2 = ermVar;
                                }
                            }
                        }
                        ermVar2 = new erm(t.a(), "hold", null, 1, 0, 116);
                    }
                }
                if (t2 != null) {
                    cybVar = t2.a();
                }
                ermVar = new erm(cybVar, "hold", null, 1, 0, 116);
                ermVar2 = ermVar;
            }
            dat o = bsn.o(ermVar2, b2);
            abpVar.U();
            nq.e(!bsn.l((equ) wiVar.e()), null, ue.e(qh.c(250, vi.b, 2), 2), ue.f(qh.c(250, vi.b, 2), 2), null, alg.e(-1388850872, new erj(o, aoxVar2, e, ggaVar, b4, 2), b2), b2, ImageMetadata.EDGE_MODE);
        }
        afv d = b2.d();
        if (d != null) {
            ((aeu) d).d = new awy(aoxVar2, wiVar, num, i, 5);
        }
    }

    public static final Object b(gga ggaVar, boolean z, mmx mmxVar) {
        int i;
        float floatValue = ((Number) ggaVar.c()).floatValue();
        if (true != z) {
            i = 36;
        } else {
            i = 180;
        }
        float f = i;
        float f2 = f - (floatValue % f);
        if (f2 < 36.0f) {
            f2 += f;
        }
        Object h = gga.h(ggaVar, new Float(((Number) ggaVar.c()).floatValue() + f2), qh.c((int) mrl.a(a), b, 2), mmxVar);
        if (h == mne.a) {
            return h;
        }
        return mlh.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:            if (defpackage.gga.h(r5, r6, r3, r0) != r1) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:            if (r5.d(r6, r0) != r1) goto L18;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.gga r5, defpackage.mmx r6) {
        /*
            boolean r0 = r6 instanceof defpackage.erq
            if (r0 == 0) goto L13
            r0 = r6
            erq r0 = (defpackage.erq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            erq r0 = new erq
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.mjo.o(r6)
            goto L70
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            gga r5 = r0.c
            defpackage.mjo.o(r6)
            goto L4b
        L38:
            defpackage.mjo.o(r6)
            java.lang.Float r6 = new java.lang.Float
            r2 = 0
            r6.<init>(r2)
            r0.c = r5
            r0.b = r3
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 == r1) goto L73
        L4b:
            java.lang.Float r6 = new java.lang.Float
            r2 = 1108344832(0x42100000, float:36.0)
            r6.<init>(r2)
            long r2 = defpackage.err.c
            long r2 = defpackage.mrl.a(r2)
            int r3 = (int) r2
            vg r2 = defpackage.vi.b
            wn r2 = defpackage.qh.c(r3, r2, r4)
            vn r3 = new vn
            r3.<init>(r2)
            r2 = 0
            r0.c = r2
            r0.b = r4
            java.lang.Object r5 = defpackage.gga.h(r5, r6, r3, r0)
            if (r5 != r1) goto L70
            goto L73
        L70:
            mlh r5 = defpackage.mlh.a
            return r5
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.err.c(gga, mmx):java.lang.Object");
    }

    private static final long d(agt agtVar) {
        return ((aqx) agtVar.a()).f;
    }
}
