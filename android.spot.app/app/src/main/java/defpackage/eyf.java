package defpackage;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Collection;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyf {
    public static final /* synthetic */ int a = 0;
    private static final jnk b = jnk.l("com/google/android/apps/adm/util/DeviceUtils");

    static {
        jen jenVar = lhq.a;
    }

    public static int a(int i, int i2, boolean z) {
        if (z && i2 >= 0 && i >= 0 && i <= i2) {
            return Math.round((i * 100.0f) / i2);
        }
        return -1;
    }

    public static jer b(List list, lqd lqdVar) {
        if (list == null) {
            return jdl.a;
        }
        return (jer) Collection.EL.stream(list).filter(new ehc(lqdVar, 9)).findFirst().map(new evl(4)).orElseGet(new jgn(1));
    }

    public static jer c(List list, String str) {
        if (list != null) {
            try {
                lim o = kzy.o(str, jtf.e);
                lja a2 = lja.a();
                lqd lqdVar = lqd.d;
                liq k = o.k();
                ljn l = lqdVar.l();
                try {
                    llg b2 = lkz.a.b(l);
                    b2.l(l, lir.p(k), a2);
                    b2.g(l);
                    try {
                        k.z(0);
                        ljn.A(l);
                        return b(list, (lqd) l);
                    } catch (ljy e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof ljy) {
                        throw ((ljy) e2.getCause());
                    }
                    throw new ljy(e2);
                } catch (llo e3) {
                    throw e3.a();
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof ljy) {
                        throw ((ljy) e4.getCause());
                    }
                    throw e4;
                } catch (ljy e5) {
                    if (e5.a) {
                        throw new ljy(e5);
                    }
                    throw e5;
                }
            } catch (jta | ljy unused) {
                ((jni) ((jni) b.g()).j("com/google/android/apps/adm/util/DeviceUtils", "findDeviceById", 103, "DeviceUtils.java")).r("Couldn't find device by ID.");
                return jdl.a;
            }
        }
        return jdl.a;
    }

    public static jer d(Bundle bundle) {
        if (!bundle.containsKey("device_utils_device_identifier")) {
            return jdl.a;
        }
        return jer.i(g(bundle));
    }

    public static kye e(lqc lqcVar) {
        lpz lpzVar;
        if (lqcVar.b == 4) {
            lpzVar = (lpz) lqcVar.c;
        } else {
            lpzVar = lpz.e;
        }
        kyf kyfVar = lpzVar.b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kye b2 = kye.b(kyfVar.k);
        if (b2 == null) {
            return kye.UNRECOGNIZED;
        }
        return b2;
    }

    public static lqc f(List list, lqc lqcVar) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lqc lqcVar2 = (lqc) it.next();
            if (p(lqcVar2, lqcVar)) {
                return lqcVar2;
            }
        }
        return null;
    }

    public static lqd g(Bundle bundle) {
        return (lqd) kzy.k(bundle, "device_utils_device_identifier", lqd.d, lja.a());
    }

    public static lqd h(cfz cfzVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        lqd lqdVar = lqd.d;
        lja a2 = lja.a();
        try {
            Parcelable parcelable = (Parcelable) cfzVar.a("device_utils_device_identifier");
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                bundle.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle.getParcelable("protoparsers");
            } else {
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
            }
            return (lqd) kzy.i(protoParsers$InternalDontUse, lqdVar, a2);
        } catch (ljy e) {
            throw new RuntimeException(e);
        }
    }

    public static lqf i(lqc lqcVar) {
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqf b2 = lqf.b(lqdVar.c);
        if (b2 == null) {
            return lqf.UNRECOGNIZED;
        }
        return b2;
    }

    public static String j(lqc lqcVar) {
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        return kzy.p(lqdVar.e(), jtf.e);
    }

    public static HashMap k(lqc lqcVar) {
        HashMap hashMap = new HashMap();
        for (lqi lqiVar : lqcVar.e) {
            lpo lpoVar = lqiVar.b;
            if (lpoVar == null) {
                lpoVar = lpo.c;
            }
            hashMap.put(lpk.a(lpoVar.a), lqiVar);
        }
        return hashMap;
    }

    public static void l(lqc lqcVar, ImageView imageView) {
        ezr eznVar;
        ezr ezoVar;
        lqcVar.getClass();
        imageView.getClass();
        int i = lqcVar.a;
        if ((i & 4) != 0) {
            lpx lpxVar = lqcVar.h;
            if (lpxVar == null) {
                lpxVar = lpx.e;
            }
            String str = lpxVar.b;
            if (str.isEmpty()) {
                eznVar = new ezn();
            } else {
                Uri parse = Uri.parse(str);
                hwx.J(true);
                String uri = parse.toString();
                if (uri != null) {
                    if (lhu.a.matcher(uri).find()) {
                        ezoVar = new ezo(str, 0);
                    } else {
                        ezoVar = new ezo((Object) str, 2);
                    }
                    eznVar = ezoVar;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if ((i & 8) != 0) {
            ezoVar = new ezo(lqcVar.i, 1);
            eznVar = ezoVar;
        } else {
            ((jni) ((jni) b.g()).j("com/google/android/apps/adm/util/DeviceUtils", "getDeviceImageGlideImageSource", 179, "DeviceUtils.java")).r("Device doesn't contain an image");
            eznVar = new ezn();
        }
        eznVar.b(imageView);
    }

    public static void m(lqd lqdVar, Bundle bundle) {
        kzy.m(bundle, "device_utils_device_identifier", lqdVar);
    }

    @Deprecated
    public static void n(ImageView imageView, TextView textView, String str, int i, boolean z, String str2) {
        Object obj;
        Object obj2;
        int i2;
        hdo hdoVar = new hdo((char[]) null);
        hdoVar.d(false);
        if (str != null) {
            hdoVar.e = str;
            hdoVar.a = i;
            hdoVar.c = (byte) (hdoVar.c | 1);
            if (str2 != null) {
                hdoVar.d = str2;
                hdoVar.d(z);
                if (hdoVar.c == 3 && (obj = hdoVar.e) != null && (obj2 = hdoVar.d) != null) {
                    eak eakVar = (eak) ((jeu) jer.i(new eak((String) obj, hdoVar.a, (String) obj2, hdoVar.b))).a;
                    if (true != eakVar.d) {
                        i2 = R.attr.colorOnSurfaceVariant;
                    } else {
                        i2 = R.attr.colorError;
                    }
                    int c = iqg.c(textView, i2);
                    imageView.setVisibility(0);
                    imageView.setImageResource(eakVar.b);
                    imageView.setImageTintList(ColorStateList.valueOf(c));
                    textView.setVisibility(0);
                    textView.setText(eakVar.a);
                    textView.setTextColor(c);
                    textView.setContentDescription(eakVar.c);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (hdoVar.e == null) {
                    sb.append(" batteryLevelText");
                }
                if ((hdoVar.c & 1) == 0) {
                    sb.append(" batteryImageResourceId");
                }
                if (hdoVar.d == null) {
                    sb.append(" batteryLevelDescription");
                }
                if ((hdoVar.c & 2) == 0) {
                    sb.append(" errorColor");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new NullPointerException("Null batteryLevelDescription");
        }
        throw new NullPointerException("Null batteryLevelText");
    }

    public static boolean o(lqc lqcVar) {
        lpt lptVar;
        if (lqcVar.b == 3) {
            lptVar = (lpt) lqcVar.c;
        } else {
            lptVar = lpt.C;
        }
        return lptVar.l;
    }

    public static boolean p(lqc lqcVar, lqc lqcVar2) {
        boolean z;
        boolean z2;
        if (lqcVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (lqcVar2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (lqcVar == null) {
            return true;
        }
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqd lqdVar2 = lqcVar2.d;
        if (lqdVar2 == null) {
            lqdVar2 = lqd.d;
        }
        return lqdVar.equals(lqdVar2);
    }

    public static boolean q(lqc lqcVar) {
        if (lqcVar == null) {
            return false;
        }
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqf b2 = lqf.b(lqdVar.c);
        if (b2 == null) {
            b2 = lqf.UNRECOGNIZED;
        }
        if (b2 != lqf.ANDROID_DEVICE) {
            lqd lqdVar2 = lqcVar.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            lqf b3 = lqf.b(lqdVar2.c);
            if (b3 == null) {
                b3 = lqf.UNRECOGNIZED;
            }
            if (b3 != lqf.SUPERVISED_ANDROID_DEVICE) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean r(lqc lqcVar, long j) {
        lpp lppVar;
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqf b2 = lqf.b(lqdVar.c);
        if (b2 == null) {
            b2 = lqf.UNRECOGNIZED;
        }
        if (b2 == lqf.ANDROID_DEVICE) {
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            if (lppVar.b == j) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean s(lqc lqcVar) {
        lpt lptVar;
        if (lqcVar == null) {
            return false;
        }
        if (lqcVar.b == 3) {
            lptVar = (lpt) lqcVar.c;
        } else {
            lptVar = lpt.C;
        }
        lnx lnxVar = lptVar.h;
        if (lnxVar == null) {
            lnxVar = lnx.b;
        }
        int D = a.D(lnxVar.a);
        if (D == 0 || D != 3) {
            return false;
        }
        return true;
    }

    public static boolean t(lqc lqcVar) {
        if (e(lqcVar) == kye.SHARED_WITH_ME_PENDING) {
            return true;
        }
        return false;
    }

    public static boolean u(lqc lqcVar) {
        lpt lptVar;
        if (!ltu.c()) {
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            return lptVar.k;
        }
        return false;
    }

    public static boolean v(lqc lqcVar) {
        lpt lptVar;
        if (!ltu.c() && !ltu.d()) {
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            return lptVar.m;
        }
        return false;
    }

    public static boolean w(lqc lqcVar) {
        lpt lptVar;
        if (lqcVar == null) {
            return false;
        }
        if (s(lqcVar)) {
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            if (lptVar.i <= 28) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int x(lqc lqcVar) {
        if (lqcVar == null) {
            return 1;
        }
        int an = hzc.an(lqcVar.f);
        if (an == 0) {
            an = 1;
        }
        switch (an - 2) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 7;
            case 5:
                return 5;
            case 6:
            default:
                return 1;
            case 7:
            case 8:
            case 9:
            case 11:
                return 8;
            case 10:
                return 9;
        }
    }
}
