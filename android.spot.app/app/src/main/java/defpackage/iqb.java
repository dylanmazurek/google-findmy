package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;
import com.google.android.apps.adm.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqb {
    public static final int[] a = {R.attr.dynamicColorThemeOverlay};
    private static final iqa b;
    private static final iqa c;
    private static final Map d;
    private static final Map e;

    static {
        ipy ipyVar = new ipy();
        b = ipyVar;
        ipz ipzVar = new ipz();
        c = ipzVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", ipyVar);
        hashMap.put("google", ipyVar);
        hashMap.put("hmd global", ipyVar);
        hashMap.put("infinix", ipyVar);
        hashMap.put("infinix mobility limited", ipyVar);
        hashMap.put("itel", ipyVar);
        hashMap.put("kyocera", ipyVar);
        hashMap.put("lenovo", ipyVar);
        hashMap.put("lge", ipyVar);
        hashMap.put("meizu", ipyVar);
        hashMap.put("motorola", ipyVar);
        hashMap.put("nothing", ipyVar);
        hashMap.put("oneplus", ipyVar);
        hashMap.put("oppo", ipyVar);
        hashMap.put("realme", ipyVar);
        hashMap.put("robolectric", ipyVar);
        hashMap.put("samsung", ipzVar);
        hashMap.put("sharp", ipyVar);
        hashMap.put("shift", ipyVar);
        hashMap.put("sony", ipyVar);
        hashMap.put("tcl", ipyVar);
        hashMap.put("tecno", ipyVar);
        hashMap.put("tecno mobile limited", ipyVar);
        hashMap.put("vivo", ipyVar);
        hashMap.put("wingtech", ipyVar);
        hashMap.put("xiaomi", ipyVar);
        d = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", ipyVar);
        hashMap2.put("jio", ipyVar);
        e = DesugarCollections.unmodifiableMap(hashMap2);
    }

    private iqb() {
    }

    public static int a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void b(Activity activity) {
        View peekDecorView;
        Context context;
        if (c()) {
            int a2 = a(activity, a);
            activity.getTheme().applyStyle(a2, true);
            Window window = activity.getWindow();
            Resources.Theme theme = null;
            if (window != null && (peekDecorView = window.peekDecorView()) != null && (context = peekDecorView.getContext()) != null) {
                theme = context.getTheme();
            }
            if (theme != null) {
                theme.applyStyle(a2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:            if (defpackage.bss.a("Tiramisu", r0) == false) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r3 = 1
            if (r0 >= r1) goto L4e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L22
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r1 = "Tiramisu"
            boolean r0 = defpackage.bss.a(r1, r0)
            if (r0 != 0) goto L4e
        L22:
            java.util.Map r0 = defpackage.iqb.d
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r1)
            iqa r0 = (defpackage.iqa) r0
            if (r0 != 0) goto L44
            java.util.Map r0 = defpackage.iqb.e
            java.lang.String r1 = android.os.Build.BRAND
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r1)
            iqa r0 = (defpackage.iqa) r0
        L44:
            if (r0 == 0) goto L4d
            boolean r0 = r0.a()
            if (r0 == 0) goto L4d
            return r3
        L4d:
            return r2
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqb.c():boolean");
    }
}
