package defpackage;

import android.graphics.drawable.Icon;
import android.net.Uri;
import com.google.android.apps.adm.R;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsh {
    public static Icon a(Uri uri) {
        Icon createWithAdaptiveBitmapContentUri;
        createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
        return createWithAdaptiveBitmapContentUri;
    }

    public static float b(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = f - (min * 0.005f);
        float f3 = fArr[min];
        return f3 + ((f2 / 0.005f) * (fArr[min + 1] - f3));
    }

    public static /* synthetic */ float c(agt agtVar) {
        return ((Number) agtVar.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [vj, java.lang.Object] */
    public static final agt d(wi wiVar, abi abiVar, int i) {
        double doubleValue;
        abiVar.u(-2042049840);
        vu b = qh.b(50.0f, null, 5);
        abiVar.u(1168296739);
        adq adqVar = (adq) aly.b(new Object[0], null, bcf.q, abiVar, 3080, 6);
        Object d = wiVar.d();
        Object e = wiVar.e();
        abiVar.u(1694778725);
        int i2 = i & 14;
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !abiVar.B(wiVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean B = abiVar.B(adqVar) | z;
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (B || P == abh.a) {
            P = new era(wiVar, adqVar, (mmx) null, 0);
            abpVar.Z(P);
        }
        abpVar.U();
        act.d(d, e, (mol) P, abiVar);
        abpVar.U();
        dht dhtVar = new dht(b, 2);
        int i3 = (i2 | 384) & 14;
        atk atkVar = wp.a;
        equ equVar = (equ) wiVar.d();
        abiVar.u(842753900);
        double d2 = 0.0d;
        if (bsn.l(equVar)) {
            doubleValue = 0.0d;
        } else {
            doubleValue = ((Number) equVar.c.e(Double.valueOf(0.0d))).doubleValue();
        }
        int g = g(adqVar);
        float degrees = (float) Math.toDegrees(((g + g) * 3.141592653589793d) + doubleValue);
        abpVar.U();
        Float valueOf = Float.valueOf(-degrees);
        equ equVar2 = (equ) wiVar.e();
        abiVar.u(842753900);
        if (!bsn.l(equVar2)) {
            d2 = ((Number) equVar2.c.e(Double.valueOf(0.0d))).doubleValue();
        }
        int g2 = g(adqVar);
        float degrees2 = (float) Math.toDegrees(((g2 + g2) * 3.141592653589793d) + d2);
        abpVar.U();
        agt b2 = wl.b(wiVar, valueOf, Float.valueOf(-degrees2), dhtVar.a(wiVar.c(), abiVar, 0), atkVar, abiVar, ((i3 | 3072) & 14) | ImageMetadata.EDGE_MODE);
        abpVar.U();
        return b2;
    }

    public static final eoe e(kyj kyjVar) {
        int i;
        kyjVar.getClass();
        int a = eku.a(kyjVar);
        int ordinal = kyjVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 11) {
                                if (ordinal != 12) {
                                    if (ordinal != 19) {
                                        if (ordinal != 21) {
                                            return null;
                                        }
                                        i = R.string.device_category_tablet;
                                    } else {
                                        i = R.string.device_category_phone;
                                    }
                                } else {
                                    i = R.string.device_category_camera;
                                }
                            } else {
                                return new eoe(kyjVar, R.string.device_category_bike, a, true);
                            }
                        } else {
                            i = R.string.device_category_bag;
                        }
                    } else {
                        i = R.string.device_category_wallet;
                    }
                } else {
                    i = R.string.device_category_keys;
                }
            } else {
                i = R.string.device_category_headphones;
            }
        } else {
            i = R.string.device_category_other;
        }
        return new eoe(kyjVar, i, a, false);
    }

    public static ljh f(lpz lpzVar, lpz lpzVar2) {
        ljh ljhVar = (ljh) lpzVar2.z(5);
        ljhVar.w(lpzVar2);
        int h = h(lpzVar2);
        if (h != 0) {
            if (h == 4) {
                int h2 = h(lpzVar);
                if (h2 != 0) {
                    if (h2 == 4) {
                        kyf kyfVar = lpzVar2.b;
                        if (kyfVar == null) {
                            kyfVar = kyf.r;
                        }
                        ljh ljhVar2 = (ljh) kyfVar.z(5);
                        ljhVar2.w(kyfVar);
                        kyf kyfVar2 = lpzVar.b;
                        if (kyfVar2 == null) {
                            kyfVar2 = kyf.r;
                        }
                        kyq kyqVar = kyfVar2.f;
                        if (kyqVar == null) {
                            kyqVar = kyq.g;
                        }
                        if (!ljhVar2.b.y()) {
                            ljhVar2.t();
                        }
                        kyf kyfVar3 = (kyf) ljhVar2.b;
                        kyqVar.getClass();
                        kyfVar3.f = kyqVar;
                        kyfVar3.a |= 8;
                        kyf kyfVar4 = (kyf) ljhVar2.q();
                        if (!ljhVar.b.y()) {
                            ljhVar.t();
                        }
                        lpz lpzVar3 = (lpz) ljhVar.b;
                        kyfVar4.getClass();
                        lpzVar3.b = kyfVar4;
                        lpzVar3.a |= 1;
                    }
                } else {
                    throw null;
                }
            }
            return ljhVar;
        }
        throw null;
    }

    private static final int g(agt agtVar) {
        return ((Number) agtVar.a()).intValue();
    }

    private static int h(lpz lpzVar) {
        kyf kyfVar = lpzVar.b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyq kyqVar = kyfVar.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        return kzv.e(kyqVar.b);
    }
}
