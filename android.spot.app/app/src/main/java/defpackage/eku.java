package defpackage;

import android.os.Bundle;
import com.google.android.apps.adm.R;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eku {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/SpotDeviceUtil");
    public static final jiy b;

    static {
        jiu jiuVar = new jiu();
        jiuVar.d(kyj.DEVICE_TYPE_HEADPHONES, 127911);
        jiuVar.d(kyj.DEVICE_TYPE_KEYS, 128273);
        jiuVar.d(kyj.DEVICE_TYPE_WATCH, 8986);
        jiuVar.d(kyj.DEVICE_TYPE_WALLET, 128179);
        jiuVar.d(kyj.DEVICE_TYPE_BAG, 128092);
        jiuVar.d(kyj.DEVICE_TYPE_LAPTOP, 128187);
        jiuVar.d(kyj.DEVICE_TYPE_CAR, 128663);
        jiuVar.d(kyj.DEVICE_TYPE_REMOTE_CONTROL, 9889);
        jiuVar.d(kyj.DEVICE_TYPE_BADGE, 129706);
        jiuVar.d(kyj.DEVICE_TYPE_BIKE, 128690);
        jiuVar.d(kyj.DEVICE_TYPE_CAMERA, 128247);
        jiuVar.d(kyj.DEVICE_TYPE_CAT, 128049);
        jiuVar.d(kyj.DEVICE_TYPE_CHARGER, 9889);
        jiuVar.d(kyj.DEVICE_TYPE_CLOTHING, 128085);
        jiuVar.d(kyj.DEVICE_TYPE_DOG, 128054);
        jiuVar.d(kyj.DEVICE_TYPE_NOTEBOOK, 128211);
        jiuVar.d(kyj.DEVICE_TYPE_PASSPORT, 129706);
        jiuVar.d(kyj.DEVICE_TYPE_PHONE, 128241);
        jiuVar.d(kyj.DEVICE_TYPE_SPEAKER, 127925);
        jiuVar.d(kyj.DEVICE_TYPE_TABLET, 128241);
        jiuVar.d(kyj.DEVICE_TYPE_TOY, 129302);
        jiuVar.d(kyj.DEVICE_TYPE_UMBRELLA, 9730);
        b = jiuVar.b();
    }

    public static int a(kyj kyjVar) {
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
                                            if (ordinal != 24) {
                                                if (ordinal != 25) {
                                                    return R.drawable.gs_nest_tag_vd_theme_24;
                                                }
                                                return R.drawable.gs_tws_buds_vd_theme_24;
                                            }
                                            return R.drawable.gs_stylus_vd_theme_24;
                                        }
                                        return R.drawable.gs_tablet_vd_theme_24;
                                    }
                                    return R.drawable.gs_smartphone_vd_theme_24;
                                }
                                return R.drawable.gs_photo_camera_vd_theme_24;
                            }
                            return R.drawable.gs_directions_bike_vd_theme_24;
                        }
                        return R.drawable.gs_luggage_vd_theme_24;
                    }
                    return R.drawable.gs_wallet_vd_theme_24;
                }
                return R.drawable.gs_key_vd_theme_24;
            }
            return R.drawable.gs_headphones_vd_theme_24;
        }
        return R.drawable.gs_category_vd_theme_24;
    }

    public static dya b(kzb kzbVar, kyj kyjVar, jer jerVar) {
        kyu kyuVar;
        int i;
        dxz dxzVar;
        kym kymVar = kzbVar.b;
        if (kymVar == null) {
            kymVar = kym.f;
        }
        if (kymVar.b == 9) {
            kyuVar = (kyu) kymVar.c;
        } else {
            kyuVar = kyu.d;
        }
        double d = kyuVar.a;
        double d2 = kyuVar.b;
        dxw a2 = dya.a();
        kyh b2 = kyh.b(kzbVar.h);
        if (b2 == null) {
            b2 = kyh.UNRECOGNIZED;
        }
        int ordinal = b2.ordinal();
        boolean z = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    i = a(kyjVar);
                } else {
                    i = R.drawable.gs_tws_case_vd_theme_24;
                }
            } else {
                i = R.drawable.gs_tws_left_bud_vd_theme_24;
            }
        } else {
            i = R.drawable.gs_tws_right_bud_vd_theme_24;
        }
        a2.a = new dxs(i);
        ljh k = lps.d.k();
        ljh k2 = lnr.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar = k2.b;
        ((lnr) ljnVar).a = d / 1.0E7d;
        if (!ljnVar.y()) {
            k2.t();
        }
        ((lnr) k2.b).b = d2 / 1.0E7d;
        lnr lnrVar = (lnr) k2.q();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        lps lpsVar = (lps) ljnVar2;
        lnrVar.getClass();
        lpsVar.b = lnrVar;
        lpsVar.a |= 1;
        float f = kyuVar.c;
        if (!ljnVar2.y()) {
            k.t();
        }
        ((lps) k.b).c = f;
        a2.c((lps) k.q());
        lln llnVar = kzbVar.c;
        if (llnVar == null) {
            llnVar = lln.c;
        }
        a2.b = jer.i(hzc.au(llnVar));
        kyh b3 = kyh.b(kzbVar.h);
        if (b3 == null) {
            b3 = kyh.UNRECOGNIZED;
        }
        int ordinal2 = b3.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                dxzVar = dxz.CENTER;
            } else {
                dxzVar = dxz.LEFT;
            }
        } else {
            dxzVar = dxz.RIGHT;
        }
        a2.d(dxzVar);
        if (jerVar.g()) {
            kyh b4 = kyh.b(kzbVar.h);
            if (b4 == null) {
                b4 = kyh.UNRECOGNIZED;
            }
            if (b4 != jerVar.c()) {
                z = false;
            }
            a2.b(z);
        }
        return a2.a();
    }

    public static ezr c(kyf kyfVar) {
        kyk kykVar;
        lim limVar;
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        int i = kylVar.b;
        int h = kzv.h(i);
        if (h != 0) {
            int i2 = h - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/SpotDeviceUtil", "getDeviceIconGlideImageSource", 76, "SpotDeviceUtil.java")).r("Device doesn't contain an image");
                    return new ezn();
                }
                if (i == 10) {
                    limVar = (lim) kylVar.c;
                } else {
                    limVar = lim.b;
                }
                return new ezo(limVar, 1);
            }
            if (i == 9) {
                kykVar = (kyk) kylVar.c;
            } else {
                kykVar = kyk.c;
            }
            return d(kykVar);
        }
        throw null;
    }

    public static ezr d(kyk kykVar) {
        String str = kykVar.a;
        if (!str.isEmpty()) {
            if (kykVar.b) {
                return new ezo(str, 0);
            }
            return new ezo((Object) str, 2);
        }
        return new ezn();
    }

    public static jer e(List list) {
        return hzc.U(list, new eja(3));
    }

    public static jer f(cfz cfzVar) {
        Object a2 = cfzVar.a("spot_device_utils_device_component");
        if (!(a2 instanceof Integer)) {
            return jdl.a;
        }
        return jer.h(kyh.b(((Integer) a2).intValue()));
    }

    public static jis g(lqc lqcVar, ele eleVar) {
        if (!eleVar.b(lqcVar)) {
            int i = jis.d;
            return jmi.a;
        }
        lpz a2 = eleVar.a(lqcVar);
        kyf kyfVar = a2.b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kye b2 = kye.b(kyfVar.k);
        if (b2 == null) {
            b2 = kye.UNRECOGNIZED;
        }
        if (b2 != kye.SHARED_BY_ME) {
            int i2 = jis.d;
            return jmi.a;
        }
        Stream filter = Collection.EL.stream(a2.c).filter(new eju(4));
        int i3 = jis.d;
        return (jis) filter.collect(jgr.a);
    }

    public static void h(kyh kyhVar, Bundle bundle) {
        bundle.putInt("spot_device_utils_device_component", kyhVar.a());
    }

    public static boolean i(lqc lqcVar, ele eleVar, boolean z) {
        if (!eleVar.b(lqcVar) || !z) {
            return false;
        }
        lpz a2 = eleVar.a(lqcVar);
        long m = lua.a.a().m();
        kyf kyfVar = a2.b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        if (!m(kyfVar)) {
            return false;
        }
        if (m > 0 && a2.c.size() >= m) {
            return false;
        }
        return true;
    }

    public static boolean j(lqc lqcVar, ele eleVar) {
        if (!eleVar.b(lqcVar)) {
            return false;
        }
        kyf kyfVar = eleVar.a(lqcVar).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        return hqk.b(kyfVar);
    }

    public static boolean k(kzc kzcVar) {
        int x = a.x(kzcVar.a);
        if (x == 0) {
            x = 1;
        }
        int i = x - 2;
        if (i != -1 && i != 0) {
            return true;
        }
        return false;
    }

    public static boolean l(kyf kyfVar) {
        kye b2 = kye.b(kyfVar.k);
        if (b2 == null) {
            b2 = kye.UNRECOGNIZED;
        }
        if (b2 == kye.SHARED_WITH_ME_PENDING) {
            return true;
        }
        return false;
    }

    public static boolean m(kyf kyfVar) {
        int i = kyfVar.k;
        kye b2 = kye.b(i);
        if (b2 == null) {
            b2 = kye.UNRECOGNIZED;
        }
        if (b2 != kye.SHARED_BY_ME) {
            kye b3 = kye.b(i);
            if (b3 == null) {
                b3 = kye.UNRECOGNIZED;
            }
            if (b3 != kye.DEFAULT_NOT_SHARED) {
                return false;
            }
            return true;
        }
        return true;
    }
}
