package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjx implements gjn {
    private static final joo a = joo.m("GnpSdk");
    private static final jjr b = jjr.o(lde.SHOWN, lde.SHOWN_FORCED);
    private static final jjr c = jjr.r(lde.ACTION_CLICK, lde.CLICKED, lde.DISMISSED, lde.SHOWN, lde.SHOWN_FORCED);
    private final Context d;
    private final gnv e;
    private final jer f;
    private final gls g;
    private final jer h;
    private final gjm i;
    private final jer j;
    private final ddg k;
    private final hri l;

    public gjx(Context context, gnv gnvVar, jer jerVar, gls glsVar, jer jerVar2, hri hriVar, gjm gjmVar, jer jerVar3, ddg ddgVar) {
        this.d = context;
        this.e = gnvVar;
        this.f = jerVar;
        this.g = glsVar;
        this.h = jerVar2;
        this.l = hriVar;
        this.i = gjmVar;
        this.j = jerVar3;
        this.k = ddgVar;
    }

    private final String c() {
        try {
            String str = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "unknown";
        } catch (PackageManager.NameNotFoundException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/rpc/impl/RenderContextHelperImpl", "getAppVersion", (char) 313, "RenderContextHelperImpl.java")).r("Failed to get app version.");
            return "unknown";
        }
    }

    private final String d() {
        try {
            return fyo.b(this.d.getContentResolver(), "device_country", null);
        } catch (SecurityException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/rpc/impl/RenderContextHelperImpl", "getCountryCode", (char) 326, "RenderContextHelperImpl.java")).r("Exception reading GServices 'device_country' key.");
            return null;
        }
    }

    private final String e() {
        LocaleList locales;
        Locale locale;
        if (a.g()) {
            locales = this.d.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale.toLanguageTag();
        }
        return this.d.getResources().getConfiguration().locale.toLanguageTag();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023a  */
    @Override // defpackage.gjn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lcy a(defpackage.lde r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjx.a(lde, boolean):lcy");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0401 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.gjn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lfh b(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjx.b(java.lang.String):lfh");
    }
}
