package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faz extends fck implements fbo {
    private static DecimalFormat a;
    private final fcn b;
    private final String d;
    private final Uri e;

    public faz(fcn fcnVar, String str) {
        super(fcnVar);
        fma.aP(str);
        this.b = fcnVar;
        this.d = str;
        this.e = a(str);
    }

    private static void H(Map map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, c(d));
        }
    }

    private static void I(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void J(Map map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    private static void K(Map map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            map.put(str, i + "x" + i2);
        }
    }

    public static Uri a(String str) {
        fma.aP(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    static String c(double d) {
        if (a == null) {
            a = new DecimalFormat("0.######");
        }
        return a.format(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:            if (android.text.TextUtils.isEmpty(r6) != false) goto L9;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map d(defpackage.fbd r13) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faz.d(fbd):java.util.Map");
    }

    @Override // defpackage.fbo
    public final Uri b() {
        return this.e;
    }

    @Override // defpackage.fbo
    public final void e(fbd fbdVar) {
        fma.aG(fbdVar.b, "Can't deliver not submitted measurement");
        fma.aM("deliver should be called on worker thread");
        fbd fbdVar2 = new fbd(fbdVar);
        fcb fcbVar = (fcb) fbdVar2.a(fcb.class);
        if (!TextUtils.isEmpty(fcbVar.a)) {
            if (TextUtils.isEmpty(fcbVar.b)) {
                n().c(d(fbdVar2), "Ignoring measurement without client id");
                return;
            }
            boolean z = this.b.a().f;
            if (fma.bm(0.0d, fcbVar.b)) {
                s("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map d = d(fbdVar2);
            d.put("v", "1");
            d.put("_v", fcm.b);
            d.put("tid", this.d);
            if (this.b.a().e) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : d.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                x("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            fma.bj(hashMap, "uid", fcbVar.c);
            fbs fbsVar = (fbs) fbdVar.b(fbs.class);
            if (fbsVar != null) {
                fma.bj(hashMap, "an", fbsVar.a);
                fma.bj(hashMap, "aid", fbsVar.c);
                fma.bj(hashMap, "av", fbsVar.b);
                fma.bj(hashMap, "aiid", fbsVar.d);
            }
            d.put("_s", String.valueOf(i().b(new fco(fcbVar.b, this.d, !TextUtils.isEmpty(fcbVar.d), hashMap))));
            i().d(new fdj(n(), d, fbdVar.c, true));
            return;
        }
        n().c(d(fbdVar2), "Ignoring measurement without type");
    }
}
