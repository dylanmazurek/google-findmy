package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bsf {
    public bsf() {
    }

    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    public static Icon b(Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }

    public static /* synthetic */ String c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "AGGREGATED";
                        }
                        return "NON_OWNER";
                    }
                    return "OWNER";
                }
                return "LOCATION_HISTORY";
            }
            return "ANDROID_DEVICE_LIVE";
        }
        return "UNKNOWN";
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "FMD_DISABLED";
            case 3:
                return "DEVICE_LOCATION_OFF_IN_SYSTEM";
            case 4:
                return "USER_NOT_PRIVILEGED";
            case 5:
                return "SUPERVISED_LOCATION_SHARING_DISABLED";
            case 6:
                return "SUPERVISED_GOOGLE_LOCATION_ACCURACY_DISABLED";
            default:
                return "COULD_NOT_LOCATE";
        }
    }

    public static boolean e(lqc lqcVar) {
        lpt lptVar;
        if (lqcVar.b == 3) {
            lptVar = (lpt) lqcVar.c;
        } else {
            lptVar = lpt.C;
        }
        return new ljt(lptVar.n, lpt.o).contains(lqg.TOKEN_TYPE_CAR);
    }

    public static boolean f(lqc lqcVar) {
        lpt lptVar;
        if (g(lqcVar)) {
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            lpz lpzVar = lptVar.u;
            if (lpzVar == null) {
                lpzVar = lpz.e;
            }
            kyf kyfVar = lpzVar.b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            if (hqk.b(kyfVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean g(lqc lqcVar) {
        lpt lptVar;
        if (lqcVar.b == 3) {
            lptVar = (lpt) lqcVar.c;
        } else {
            lptVar = lpt.C;
        }
        if ((lptVar.a & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static boolean h(lqc lqcVar, lpk lpkVar) {
        return Collection.EL.stream(lqcVar.e).anyMatch(new ehc(lpkVar, 1));
    }

    public static boolean i(lqc lqcVar) {
        return h(lqcVar, lpk.ANDROID_LOCK_SCREEN);
    }

    public static boolean j(lqc lqcVar) {
        return h(lqcVar, lpk.ANDROID_SET_SCREEN_LOCK_PASSWORD);
    }

    public static boolean k(lqc lqcVar) {
        return h(lqcVar, lpk.ANDROID_WIPE);
    }

    public static lpz l(lqc lqcVar) {
        lpw lpwVar;
        if (m(lqcVar) && lqcVar != null) {
            if (lqcVar.b == 10) {
                lpwVar = (lpw) lqcVar.c;
            } else {
                lpwVar = lpw.i;
            }
            if (lpwVar != null) {
                lpz lpzVar = lpwVar.h;
                if (lpzVar == null) {
                    return lpz.e;
                }
                return lpzVar;
            }
            return null;
        }
        return null;
    }

    public static boolean m(lqc lqcVar) {
        lqd lqdVar;
        if (lqcVar != null) {
            lqdVar = lqcVar.d;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
        } else {
            lqdVar = null;
        }
        return n(lqdVar);
    }

    public static boolean n(lqd lqdVar) {
        lql lqlVar;
        if (lqdVar != null) {
            if (lqdVar.a == 5) {
                lqlVar = (lql) lqdVar.b;
            } else {
                lqlVar = lql.c;
            }
            if (lqlVar.a == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean o(lqc lqcVar, elo eloVar) {
        lpp lppVar;
        long h = eloVar.h();
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (lqdVar.a == 1) {
            lppVar = (lpp) lqdVar.b;
        } else {
            lppVar = lpp.d;
        }
        if (h == lppVar.b) {
            return true;
        }
        return false;
    }

    public bsf(byte[] bArr) {
        this();
    }
}
