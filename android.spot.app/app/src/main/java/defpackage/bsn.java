package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import com.google.android.apps.adm.R;
import com.google.ar.core.ImageMetadata;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsn {
    public static FingerprintManager.CryptoObject a(Object obj) {
        FingerprintManager.CryptoObject cryptoObject;
        cryptoObject = fr$$ExternalSyntheticApiModelOutline0.m104m(obj).getCryptoObject();
        return cryptoObject;
    }

    public static FingerprintManager.CryptoObject b(bso bsoVar) {
        if (bsoVar != null) {
            Object obj = bsoVar.b;
            if (obj == null) {
                Object obj2 = bsoVar.a;
                if (obj2 == null) {
                    Object obj3 = bsoVar.c;
                    if (obj3 != null) {
                        return new FingerprintManager.CryptoObject((Mac) obj3);
                    }
                    return null;
                }
                return new FingerprintManager.CryptoObject((Signature) obj2);
            }
            return new FingerprintManager.CryptoObject((Cipher) obj);
        }
        return null;
    }

    public static FingerprintManager c(Context context) {
        Object systemService;
        Object systemService2;
        if (Build.VERSION.SDK_INT != 23) {
            if (Build.VERSION.SDK_INT <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            systemService = context.getSystemService((Class<Object>) fr$$ExternalSyntheticApiModelOutline0.m110m());
            return fr$$ExternalSyntheticApiModelOutline0.m106m(systemService);
        }
        systemService2 = context.getSystemService((Class<Object>) fr$$ExternalSyntheticApiModelOutline0.m110m());
        return fr$$ExternalSyntheticApiModelOutline0.m106m(systemService2);
    }

    public static bso d(Object obj) {
        Cipher cipher;
        Signature signature;
        Mac mac;
        Mac mac2;
        Signature signature2;
        Cipher cipher2;
        FingerprintManager.CryptoObject m105m = fr$$ExternalSyntheticApiModelOutline0.m105m(obj);
        if (m105m != null) {
            cipher = m105m.getCipher();
            if (cipher == null) {
                signature = m105m.getSignature();
                if (signature != null) {
                    signature2 = m105m.getSignature();
                    return new bso(signature2);
                }
                mac = m105m.getMac();
                if (mac != null) {
                    mac2 = m105m.getMac();
                    return new bso(mac2);
                }
                return null;
            }
            cipher2 = m105m.getCipher();
            return new bso(cipher2);
        }
        return null;
    }

    public static void e(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
        fr$$ExternalSyntheticApiModelOutline0.m106m(obj).authenticate(fr$$ExternalSyntheticApiModelOutline0.m105m(obj2), cancellationSignal, i, fr$$ExternalSyntheticApiModelOutline0.m103m(obj3), handler);
    }

    public static boolean f(Object obj) {
        boolean hasEnrolledFingerprints;
        hasEnrolledFingerprints = fr$$ExternalSyntheticApiModelOutline0.m106m(obj).hasEnrolledFingerprints();
        return hasEnrolledFingerprints;
    }

    public static boolean g(Object obj) {
        boolean isHardwareDetected;
        isHardwareDetected = fr$$ExternalSyntheticApiModelOutline0.m106m(obj).isHardwareDetected();
        return isHardwareDetected;
    }

    public static final mwv h(cfk cfkVar) {
        return moz.al(new mwq(new cbk(cfkVar, (mmx) null, 3)));
    }

    public static /* synthetic */ cfk i(mwv mwvVar) {
        cel celVar = new cel(mnc.a, new ceq(mwvVar, (mmx) null, 0));
        if (mwvVar instanceof mys) {
            if (pu.g().h()) {
                celVar.l(((mys) mwvVar).c());
            } else {
                celVar.i(((mys) mwvVar).c());
            }
        }
        return celVar;
    }

    public static final void j(aox aoxVar, agt agtVar, eru eruVar, abi abiVar, int i) {
        aoxVar.getClass();
        agtVar.getClass();
        abi b = abiVar.b(-441588853);
        int i2 = aon.a;
        awh d = xt.d(aom.e);
        int a = abd.a(b);
        abp abpVar = (abp) b;
        aek L = abpVar.L();
        aox e = de.e(b, aoxVar);
        int i3 = axu.a;
        mnw mnwVar = axt.a;
        b.v();
        if (abpVar.x) {
            b.k(mnwVar);
        } else {
            b.x();
        }
        agx.a(b, d, axt.d);
        agx.a(b, L, axt.c);
        mol molVar = axt.e;
        if (abpVar.x || !amr.i(abpVar.P(), Integer.valueOf(a))) {
            Integer valueOf = Integer.valueOf(a);
            abpVar.Z(valueOf);
            b.i(valueOf, molVar);
        }
        agx.a(b, e, axt.b);
        wi a2 = eqz.a(agtVar, "ProximityUi", b, ((i >> 3) & 14) | 48);
        err.a(null, a2, eruVar.a, b, 0);
        b.u(1598077533);
        eruVar.d.intValue();
        erh.a(null, a2, b, 0);
        abpVar.U();
        erl.a(null, a2, b, 0);
        ble bleVar = (ble) b.f(bcg.a);
        b.u(1598093855);
        Object P = abpVar.P();
        if (P == abh.a) {
            aee aeeVar = new aee(new blh(0.0f), agw.a);
            abpVar.Z(aeeVar);
            P = aeeVar;
        }
        adt adtVar = (adt) P;
        abpVar.U();
        b.u(1598097257);
        boolean B = b.B(bleVar);
        Object P2 = abpVar.P();
        if (B || P2 == abh.a) {
            P2 = new erg((Object) bleVar, (Object) adtVar, 4);
            abpVar.Z(P2);
        }
        abpVar.U();
        q(new OnGloballyPositionedElement((moh) P2), a2, eruVar.b, eruVar.c, b, 0);
        b.u(1598107663);
        if (((equ) a2.e()).b.g()) {
            ery.a(null, a2, r(adtVar), r(adtVar), b, 0);
        }
        abpVar.U();
        b.u(1598114751);
        if (eruVar.e != null) {
            int i4 = yh.a;
            erf.a(yh.a(new FillElement(1, 0.2f), 0.2f), a2, eruVar.e, b, 518);
        }
        abpVar.U();
        b.n();
        afv d2 = b.d();
        if (d2 != null) {
            ((aeu) d2).d = new awy(aoxVar, agtVar, eruVar, i, 6);
        }
    }

    public static final boolean k(equ equVar) {
        equVar.getClass();
        if (equVar.d != 4 && !equVar.b.g()) {
            return false;
        }
        return true;
    }

    public static final boolean l(equ equVar) {
        equVar.getClass();
        if (((Number) equVar.b.e(Double.valueOf(Double.POSITIVE_INFINITY))).doubleValue() <= 0.5d) {
            return true;
        }
        if (!lua.l() && ((Number) equVar.a.e(Float.valueOf(0.0f))).floatValue() >= 0.95f) {
            return true;
        }
        return false;
    }

    public static final wc m(equ equVar, equ equVar2) {
        equVar.getClass();
        equVar2.getClass();
        return new ern(s(equVar), s(equVar2));
    }

    public static final wc n(wi wiVar) {
        return m((equ) wiVar.d(), (equ) wiVar.e());
    }

    public static final dat o(erm ermVar, abi abiVar) {
        abiVar.u(1553681834);
        abiVar.u(2024497114);
        abiVar.u(-1736573089);
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (P == abh.a) {
            P = new dat();
            abpVar.Z(P);
        }
        dat datVar = (dat) P;
        abpVar.U();
        abpVar.U();
        act.e(ermVar, new dzk(datVar, ermVar, (mmx) null, 5), abiVar);
        abpVar.U();
        return datVar;
    }

    public static final vj p() {
        return qh.c(750, vi.a, 2);
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [vj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [vj, java.lang.Object] */
    public static final void q(aox aoxVar, wi wiVar, Integer num, Integer num2, abi abiVar, int i) {
        int i2;
        float floatValue;
        float floatValue2;
        float floatValue3;
        erm ermVar;
        abi abiVar2;
        wiVar.getClass();
        int i3 = i & 14;
        abi b = abiVar.b(1607018035);
        if (i3 == 0) {
            i2 = (true != b.B(aoxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= true != b.B(wiVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i2 |= true != b.z(R.raw.inner_star) ? 128 : 256;
        }
        if ((i & 7168) == 0) {
            i2 |= true != b.B(num) ? 1024 : 2048;
        }
        if ((57344 & i) == 0) {
            i2 |= true != b.B(num2) ? 8192 : 16384;
        }
        if ((46811 & i2) == 9362 && b.G()) {
            b.r();
            abiVar2 = b;
        } else {
            bso[] bsoVarArr = new bso[1];
            b.u(182095552);
            int i4 = (i2 >> 3) & 14;
            eri eriVar = eri.a;
            equ equVar = (equ) wiVar.e();
            b.u(1214403601);
            if (l(equVar)) {
                floatValue = 1.0f;
            } else {
                floatValue = equVar.c.g() ? 0.0f : ((Number) equVar.a.e(Float.valueOf(0.0f))).floatValue();
            }
            long h = jw.h(dd.h(b).a, dd.h(b).b, floatValue);
            abp abpVar = (abp) b;
            abpVar.U();
            ars f = aqx.f(h);
            boolean B = b.B(f);
            Object P = abpVar.P();
            if (B || P == abh.a) {
                P = tz.a.a(f);
                abpVar.Z(P);
            }
            int i5 = (((i4 | 384) & 14) | 3072) & 14;
            atk atkVar = (atk) P;
            equ equVar2 = (equ) wiVar.d();
            b.u(1214403601);
            if (l(equVar2)) {
                floatValue2 = 1.0f;
            } else {
                floatValue2 = equVar2.c.g() ? 0.0f : ((Number) equVar2.a.e(Float.valueOf(0.0f))).floatValue();
            }
            long h2 = jw.h(dd.h(b).a, dd.h(b).b, floatValue2);
            abpVar.U();
            aqx aqxVar = new aqx(h2);
            equ equVar3 = (equ) wiVar.e();
            b.u(1214403601);
            if (l(equVar3)) {
                floatValue3 = 1.0f;
            } else {
                floatValue3 = equVar3.c.g() ? 0.0f : ((Number) equVar3.a.e(Float.valueOf(0.0f))).floatValue();
            }
            long h3 = jw.h(dd.h(b).a, dd.h(b).b, floatValue3);
            abpVar.U();
            aqx aqxVar2 = new aqx(h3);
            ?? a = eriVar.a(wiVar.c(), b, 0);
            int i6 = i5 | ImageMetadata.EDGE_MODE;
            agt b2 = wl.b(wiVar, aqxVar, aqxVar2, a, atkVar, b, i6);
            Integer num3 = cyq.a;
            num3.getClass();
            bso f2 = bpp.f(num3, Integer.valueOf(jw.d(((aqx) b2.a()).f)), new String[]{"**"}, b);
            abpVar.U();
            bsoVarArr[0] = f2;
            gga e = bpp.e(bsoVarArr, b);
            b.u(978205483);
            eri eriVar2 = eri.c;
            atk atkVar2 = wp.a;
            equ equVar4 = (equ) wiVar.d();
            b.u(-6106097);
            float max = equVar4.c.g() ? 1.0f : Math.max(((Number) equVar4.a.e(Float.valueOf(0.0f))).floatValue(), 0.3f);
            abpVar.U();
            Float valueOf = Float.valueOf(max);
            equ equVar5 = (equ) wiVar.e();
            b.u(-6106097);
            float max2 = equVar5.c.g() ? 1.0f : Math.max(((Number) equVar5.a.e(Float.valueOf(0.0f))).floatValue(), 0.3f);
            abpVar.U();
            agt b3 = wl.b(wiVar, valueOf, Float.valueOf(max2), eriVar2.a(wiVar.c(), b, 0), atkVar2, b, i6);
            abpVar.U();
            agt d = bsh.d(wiVar, b, i4 | 48);
            wc n = n(wiVar);
            b.u(1609611361);
            daz t = bpt.t(new dba(R.raw.inner_star), b);
            b.u(79774787);
            daz t2 = bpt.t(new dba(num.intValue()), b);
            abpVar.U();
            b.u(79779277);
            daz t3 = bpt.t(new dba(num2.intValue()), b);
            abpVar.U();
            erv ervVar = erv.a;
            if (rb.c(n, ervVar, ervVar)) {
                ermVar = new erm(t.a(), "celebrate-hold", null, 1, 0, 116);
            } else if (rb.c(n, erv.a, erv.b)) {
                ermVar = new erm(t3 != null ? t3.a() : null, "reverse", null, 1, 2, 52);
            } else if (!rb.c(n, erv.a, erv.c) && !rb.c(n, erv.a, erv.d)) {
                if (rb.c(n, erv.b, erv.a)) {
                    ermVar = new erm(t3 != null ? t3.a() : null, "celebration", null, 1, 2, 52);
                } else {
                    erv ervVar2 = erv.b;
                    if (rb.c(n, ervVar2, ervVar2)) {
                        ermVar = new erm(t2 != null ? t2.a() : null, "hold", null, 1, 0, 116);
                    } else if (!rb.c(n, erv.b, erv.c) && !rb.c(n, erv.b, erv.d)) {
                        if (!rb.c(n, erv.c, erv.a) && !rb.c(n, erv.d, erv.a)) {
                            if (!rb.c(n, erv.c, erv.b) && !rb.c(n, erv.d, erv.b)) {
                                erv ervVar3 = erv.c;
                                if (!rb.c(n, ervVar3, ervVar3) && !rb.c(n, erv.d, erv.c) && !rb.c(n, erv.c, erv.d)) {
                                    erv ervVar4 = erv.d;
                                    if (!rb.c(n, ervVar4, ervVar4)) {
                                        ermVar = new erm(t.a(), "04 finding", null, 0, 0, 92);
                                    }
                                }
                                ermVar = new erm(t.a(), "04 finding", null, 0, 0, 124);
                            } else {
                                ermVar = new erm(t2 != null ? t2.a() : null, "in", null, 1, 0, 116);
                            }
                        } else {
                            ermVar = new erm(t.a(), "05 found", "07 reverse", 1, 2, 48);
                        }
                    } else {
                        ermVar = new erm(t2 != null ? t2.a() : null, "out", null, 1, 0, 116);
                    }
                }
            } else {
                ermVar = new erm(t.a(), "07 reverse", null, 1, 2, 52);
            }
            dat o = o(ermVar, b);
            abpVar.U();
            boolean k = k((equ) wiVar.e());
            uf a2 = ue.e(new wn(200, 200, vi.b), 2).a(ue.g(new wn(400, 100, vi.a), 0.16f));
            ug f3 = ue.f(null, 3);
            alb e2 = alg.e(413135627, new erj(o, aoxVar, b3, d, e, 1), b);
            abiVar2 = b;
            nq.e(k, null, a2, f3, null, e2, b, 199680);
        }
        afv d2 = abiVar2.d();
        if (d2 != null) {
            ((aeu) d2).d = new aaa(aoxVar, wiVar, num, num2, i, 2);
        }
    }

    private static final float r(adt adtVar) {
        return ((blh) adtVar.a()).a;
    }

    private static final erv s(equ equVar) {
        if (l(equVar)) {
            return erv.a;
        }
        if (equVar.c.g()) {
            return erv.b;
        }
        if (k(equVar)) {
            return erv.c;
        }
        return erv.d;
    }
}
