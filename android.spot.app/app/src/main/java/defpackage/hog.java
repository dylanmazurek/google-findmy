package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.google.android.apps.adm.R;
import com.google.android.gms.common.api.Status;
import com.google.ar.core.ImageMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hog {
    public hog() {
    }

    public static void A(fhz fhzVar) {
        if (fhzVar instanceof fhx) {
            ((fhx) fhzVar).a();
        }
    }

    public static void B(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        hjv a = hjw.a();
        a.b(str);
        map.put(str, a);
    }

    public static /* synthetic */ String C(int i) {
        if (i != 1) {
            return "MENAGERIE";
        }
        return "MDI";
    }

    public static /* synthetic */ String D(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "FALSE";
            }
            return "TRUE";
        }
        return "UNKNOWN";
    }

    public static int E(int i) {
        if (i != 0) {
            if (i != 32) {
                if (i != 48) {
                    if (i != 120) {
                        if (i != 240) {
                            return 2;
                        }
                        return 5;
                    }
                    return 3;
                }
                return 1;
            }
            return 0;
        }
        throw null;
    }

    public static jer F(ImageView imageView) {
        Object tag = imageView.getTag(R.id.og_avatar_size_hint);
        if (tag instanceof Integer) {
            return jer.i((Integer) tag);
        }
        return jdl.a;
    }

    public static void G(View view, boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (z) {
                view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
                if (z2) {
                    view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
                    return;
                }
                return;
            }
            view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
        }
    }

    public static void H(Runnable runnable) {
        if (ijs.g()) {
            runnable.run();
        } else {
            ijs.e(runnable);
        }
    }

    public static boolean I(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void J(RecyclerView recyclerView, lj ljVar) {
        hck hckVar = new hck(recyclerView, ljVar, 3);
        int[] iArr = bwn.a;
        if (recyclerView.isAttachedToWindow()) {
            hckVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(hckVar);
    }

    public static float K(DisplayMetrics displayMetrics, int i) {
        return i * displayMetrics.density;
    }

    public static int L(DisplayMetrics displayMetrics, int i) {
        return (int) K(displayMetrics, i);
    }

    public static boolean M(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterialTheme, R.attr.colorPrimaryGoogle});
        boolean z = false;
        try {
            if (obtainStyledAttributes.getBoolean(0, false)) {
                if (obtainStyledAttributes.hasValue(1)) {
                    z = true;
                }
            }
            return z;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable N(Drawable drawable, int i) {
        boolean z = true;
        if (!ijs.g() && drawable.getCallback() != null) {
            z = false;
        }
        hwx.V(z, "Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        Drawable i2 = bpu.i(drawable);
        bsc.f(i2.mutate(), i);
        return i2;
    }

    public static Drawable O(Context context, int i, int i2) {
        return N(cu.c(context, i), i2);
    }

    public static int P(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarItemBackground});
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ThreadFactory Q() {
        lzt lztVar = new lzt(null, null, null);
        lztVar.s("OneGoogle #%d");
        lztVar.r(false);
        hwx.P(true, "Thread priority (%s) must be >= %s", 5, 1);
        hwx.P(true, "Thread priority (%s) must be <= %s", 5, 10);
        lztVar.b = 5;
        lztVar.a = new hgy(0);
        return lzt.z(lztVar);
    }

    public static void R(cfn cfnVar, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cfnVar.l(obj);
        } else {
            cfnVar.i(obj);
        }
    }

    public static String S(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        if (simpleName.endsWith("Exception")) {
            if (simpleName.contains("$")) {
                return simpleName.substring(simpleName.lastIndexOf(36) + 1);
            }
            return simpleName;
        }
        if (th instanceof fhn) {
            return "ApiException";
        }
        return "ObfuscatedException";
    }

    public static Throwable T(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        if (th.getClass().equals(cls)) {
            return th;
        }
        return T(th.getCause(), cls);
    }

    public static Object U(Context context, Class cls) {
        context.getClass();
        for (int i = 0; i < 1000; i++) {
            if (cls.isInstance(context)) {
                return cls.cast(context);
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return null;
            }
        }
        return null;
    }

    public static long k(HealthStats healthStats, int i) {
        boolean hasMeasurement;
        long measurement;
        if (healthStats != null) {
            hasMeasurement = healthStats.hasMeasurement(i);
            if (hasMeasurement) {
                measurement = healthStats.getMeasurement(i);
                return measurement;
            }
            return 0L;
        }
        return 0L;
    }

    public static List l(HealthStats healthStats, int i) {
        boolean hasTimers;
        Map timers;
        if (healthStats != null) {
            hasTimers = healthStats.hasTimers(i);
            if (hasTimers) {
                hoq hoqVar = hoq.a;
                timers = healthStats.getTimers(i);
                return hoqVar.d(timers);
            }
        }
        return Collections.emptyList();
    }

    public static Map m(HealthStats healthStats, int i) {
        boolean hasStats;
        Map stats;
        if (healthStats != null) {
            hasStats = healthStats.hasStats(i);
            if (hasStats) {
                stats = healthStats.getStats(i);
                return stats;
            }
        }
        return Collections.emptyMap();
    }

    public static ndj n(String str) {
        ljh k = ndj.d.k();
        if (!k.b.y()) {
            k.t();
        }
        ndj ndjVar = (ndj) k.b;
        ndjVar.a |= 2;
        ndjVar.c = str;
        return (ndj) k.q();
    }

    public static ndo o(HealthStats healthStats, int i) {
        boolean hasTimer;
        TimerStat timer;
        if (healthStats != null) {
            hasTimer = healthStats.hasTimer(i);
            if (hasTimer) {
                timer = healthStats.getTimer(i);
                return q(null, timer);
            }
        }
        return null;
    }

    public static ndo p(ndo ndoVar, ndo ndoVar2) {
        if (ndoVar != null && ndoVar2 != null) {
            int i = ndoVar.b - ndoVar2.b;
            long j = ndoVar.c - ndoVar2.c;
            if (i == 0) {
                if (j != 0) {
                    i = 0;
                } else {
                    return null;
                }
            }
            ljh k = ndo.e.k();
            if ((ndoVar.a & 4) != 0) {
                ndj ndjVar = ndoVar.d;
                if (ndjVar == null) {
                    ndjVar = ndj.d;
                }
                if (!k.b.y()) {
                    k.t();
                }
                ndo ndoVar3 = (ndo) k.b;
                ndjVar.getClass();
                ndoVar3.d = ndjVar;
                ndoVar3.a |= 4;
            }
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            ndo ndoVar4 = (ndo) ljnVar;
            ndoVar4.a |= 1;
            ndoVar4.b = i;
            if (!ljnVar.y()) {
                k.t();
            }
            ndo ndoVar5 = (ndo) k.b;
            ndoVar5.a |= 2;
            ndoVar5.c = j;
            return (ndo) k.q();
        }
        return ndoVar;
    }

    public static ndo q(String str, TimerStat timerStat) {
        int count;
        long time;
        ljh k = ndo.e.k();
        count = timerStat.getCount();
        if (!k.b.y()) {
            k.t();
        }
        ndo ndoVar = (ndo) k.b;
        ndoVar.a |= 1;
        ndoVar.b = count;
        time = timerStat.getTime();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        ndo ndoVar2 = (ndo) ljnVar;
        ndoVar2.a |= 2;
        ndoVar2.c = time;
        if (ndoVar2.b < 0) {
            if (!ljnVar.y()) {
                k.t();
            }
            ndo ndoVar3 = (ndo) k.b;
            ndoVar3.a |= 1;
            ndoVar3.b = 0;
        }
        if (str != null) {
            ndj n = n(str);
            if (!k.b.y()) {
                k.t();
            }
            ndo ndoVar4 = (ndo) k.b;
            n.getClass();
            ndoVar4.d = n;
            ndoVar4.a |= 4;
        }
        ndo ndoVar5 = (ndo) k.b;
        if (ndoVar5.b == 0 && ndoVar5.c == 0) {
            return null;
        }
        return (ndo) k.q();
    }

    public static ndp r(ndp ndpVar, ndp ndpVar2) {
        ndo ndoVar;
        ndo ndoVar2;
        ndo ndoVar3;
        ndo ndoVar4;
        ndo ndoVar5;
        ndo ndoVar6;
        ndo ndoVar7;
        ndo ndoVar8;
        ndo ndoVar9;
        ndo ndoVar10;
        ndo ndoVar11;
        ndo ndoVar12;
        ndo ndoVar13;
        ndo ndoVar14;
        ndo ndoVar15;
        ndo ndoVar16;
        ndo ndoVar17;
        ndo ndoVar18;
        ndo ndoVar19;
        ndo ndoVar20;
        ndo ndoVar21;
        ndo ndoVar22;
        ndo ndoVar23;
        ndo ndoVar24;
        ndo ndoVar25;
        ndo ndoVar26;
        ndo ndoVar27;
        ndo ndoVar28;
        ndo ndoVar29;
        ndo ndoVar30;
        ndo ndoVar31;
        ndo ndoVar32;
        if (ndpVar != null && ndpVar2 != null) {
            ljh k = ndp.ar.k();
            if ((ndpVar.a & 1) != 0) {
                long j = ndpVar.c - ndpVar2.c;
                if (j != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar3 = (ndp) k.b;
                    ndpVar3.a |= 1;
                    ndpVar3.c = j;
                }
            }
            if ((ndpVar.a & 2) != 0) {
                long j2 = ndpVar.d - ndpVar2.d;
                if (j2 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar4 = (ndp) k.b;
                    ndpVar4.a |= 2;
                    ndpVar4.d = j2;
                }
            }
            if ((ndpVar.a & 4) != 0) {
                long j3 = ndpVar.e - ndpVar2.e;
                if (j3 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar5 = (ndp) k.b;
                    ndpVar5.a |= 4;
                    ndpVar5.e = j3;
                }
            }
            if ((ndpVar.a & 8) != 0) {
                long j4 = ndpVar.f - ndpVar2.f;
                if (j4 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar6 = (ndp) k.b;
                    ndpVar6.a |= 8;
                    ndpVar6.f = j4;
                }
            }
            k.aa(hoq.a.e(ndpVar.g, ndpVar2.g));
            k.ab(hoq.a.e(ndpVar.h, ndpVar2.h));
            k.ac(hoq.a.e(ndpVar.i, ndpVar2.i));
            k.Z(hoq.a.e(ndpVar.j, ndpVar2.j));
            k.Y(hoq.a.e(ndpVar.k, ndpVar2.k));
            k.U(hoq.a.e(ndpVar.l, ndpVar2.l));
            if ((ndpVar.a & 16) != 0) {
                ndoVar = ndpVar.m;
                if (ndoVar == null) {
                    ndoVar = ndo.e;
                }
            } else {
                ndoVar = null;
            }
            if ((ndpVar2.a & 16) != 0) {
                ndoVar2 = ndpVar2.m;
                if (ndoVar2 == null) {
                    ndoVar2 = ndo.e;
                }
            } else {
                ndoVar2 = null;
            }
            ndo p = p(ndoVar, ndoVar2);
            if (p != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar7 = (ndp) k.b;
                ndpVar7.m = p;
                ndpVar7.a |= 16;
            }
            k.V(hoq.a.e(ndpVar.n, ndpVar2.n));
            k.X(hon.a.e(ndpVar.p, ndpVar2.p));
            k.W(hom.a.e(ndpVar.q, ndpVar2.q));
            if ((ndpVar.a & 32) != 0) {
                long j5 = ndpVar.r - ndpVar2.r;
                if (j5 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar8 = (ndp) k.b;
                    ndpVar8.a |= 32;
                    ndpVar8.r = j5;
                }
            }
            if ((ndpVar.a & 64) != 0) {
                long j6 = ndpVar.s - ndpVar2.s;
                if (j6 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar9 = (ndp) k.b;
                    ndpVar9.a |= 64;
                    ndpVar9.s = j6;
                }
            }
            if ((ndpVar.a & 128) != 0) {
                long j7 = ndpVar.t - ndpVar2.t;
                if (j7 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar10 = (ndp) k.b;
                    ndpVar10.a |= 128;
                    ndpVar10.t = j7;
                }
            }
            if ((ndpVar.a & 256) != 0) {
                long j8 = ndpVar.u - ndpVar2.u;
                if (j8 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar11 = (ndp) k.b;
                    ndpVar11.a |= 256;
                    ndpVar11.u = j8;
                }
            }
            if ((ndpVar.a & 512) != 0) {
                long j9 = ndpVar.v - ndpVar2.v;
                if (j9 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar12 = (ndp) k.b;
                    ndpVar12.a |= 512;
                    ndpVar12.v = j9;
                }
            }
            if ((ndpVar.a & 1024) != 0) {
                long j10 = ndpVar.w - ndpVar2.w;
                if (j10 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar13 = (ndp) k.b;
                    ndpVar13.a |= 1024;
                    ndpVar13.w = j10;
                }
            }
            if ((ndpVar.a & 2048) != 0) {
                long j11 = ndpVar.x - ndpVar2.x;
                if (j11 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar14 = (ndp) k.b;
                    ndpVar14.a |= 2048;
                    ndpVar14.x = j11;
                }
            }
            if ((ndpVar.a & 4096) != 0) {
                long j12 = ndpVar.C - ndpVar2.C;
                if (j12 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar15 = (ndp) k.b;
                    ndpVar15.a |= 4096;
                    ndpVar15.C = j12;
                }
            }
            if ((ndpVar.a & 8192) != 0) {
                long j13 = ndpVar.D - ndpVar2.D;
                if (j13 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar16 = (ndp) k.b;
                    ndpVar16.a |= 8192;
                    ndpVar16.D = j13;
                }
            }
            if ((ndpVar.a & 16384) != 0) {
                long j14 = ndpVar.E - ndpVar2.E;
                if (j14 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar17 = (ndp) k.b;
                    ndpVar17.a |= 16384;
                    ndpVar17.E = j14;
                }
            }
            if ((ndpVar.a & 32768) != 0) {
                long j15 = ndpVar.F - ndpVar2.F;
                if (j15 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar18 = (ndp) k.b;
                    ndpVar18.a |= 32768;
                    ndpVar18.F = j15;
                }
            }
            if ((ndpVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                long j16 = ndpVar.G - ndpVar2.G;
                if (j16 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar19 = (ndp) k.b;
                    ndpVar19.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                    ndpVar19.G = j16;
                }
            }
            if ((ndpVar.a & 131072) != 0) {
                long j17 = ndpVar.H - ndpVar2.H;
                if (j17 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar20 = (ndp) k.b;
                    ndpVar20.a |= 131072;
                    ndpVar20.H = j17;
                }
            }
            if ((ndpVar.a & 262144) != 0) {
                long j18 = ndpVar.I - ndpVar2.I;
                if (j18 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar21 = (ndp) k.b;
                    ndpVar21.a |= 262144;
                    ndpVar21.I = j18;
                }
            }
            if ((ndpVar.a & ImageMetadata.LENS_APERTURE) != 0) {
                ndoVar3 = ndpVar.J;
                if (ndoVar3 == null) {
                    ndoVar3 = ndo.e;
                }
            } else {
                ndoVar3 = null;
            }
            if ((ndpVar2.a & ImageMetadata.LENS_APERTURE) != 0) {
                ndoVar4 = ndpVar2.J;
                if (ndoVar4 == null) {
                    ndoVar4 = ndo.e;
                }
            } else {
                ndoVar4 = null;
            }
            ndo p2 = p(ndoVar3, ndoVar4);
            if (p2 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar22 = (ndp) k.b;
                ndpVar22.J = p2;
                ndpVar22.a |= ImageMetadata.LENS_APERTURE;
            }
            if ((ndpVar.a & ImageMetadata.SHADING_MODE) != 0) {
                long j19 = ndpVar.K - ndpVar2.K;
                if (j19 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar23 = (ndp) k.b;
                    ndpVar23.a |= ImageMetadata.SHADING_MODE;
                    ndpVar23.K = j19;
                }
            }
            if ((ndpVar.a & 2097152) != 0) {
                ndoVar5 = ndpVar.L;
                if (ndoVar5 == null) {
                    ndoVar5 = ndo.e;
                }
            } else {
                ndoVar5 = null;
            }
            if ((ndpVar2.a & 2097152) != 0) {
                ndoVar6 = ndpVar2.L;
                if (ndoVar6 == null) {
                    ndoVar6 = ndo.e;
                }
            } else {
                ndoVar6 = null;
            }
            ndo p3 = p(ndoVar5, ndoVar6);
            if (p3 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar24 = (ndp) k.b;
                ndpVar24.L = p3;
                ndpVar24.a |= 2097152;
            }
            if ((ndpVar.a & 4194304) != 0) {
                ndoVar7 = ndpVar.M;
                if (ndoVar7 == null) {
                    ndoVar7 = ndo.e;
                }
            } else {
                ndoVar7 = null;
            }
            if ((ndpVar2.a & 4194304) != 0) {
                ndoVar8 = ndpVar2.M;
                if (ndoVar8 == null) {
                    ndoVar8 = ndo.e;
                }
            } else {
                ndoVar8 = null;
            }
            ndo p4 = p(ndoVar7, ndoVar8);
            if (p4 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar25 = (ndp) k.b;
                ndpVar25.M = p4;
                ndpVar25.a |= 4194304;
            }
            if ((ndpVar.a & 8388608) != 0) {
                ndoVar9 = ndpVar.N;
                if (ndoVar9 == null) {
                    ndoVar9 = ndo.e;
                }
            } else {
                ndoVar9 = null;
            }
            if ((ndpVar2.a & 8388608) != 0) {
                ndoVar10 = ndpVar2.N;
                if (ndoVar10 == null) {
                    ndoVar10 = ndo.e;
                }
            } else {
                ndoVar10 = null;
            }
            ndo p5 = p(ndoVar9, ndoVar10);
            if (p5 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar26 = (ndp) k.b;
                ndpVar26.N = p5;
                ndpVar26.a |= 8388608;
            }
            if ((ndpVar.a & 16777216) != 0) {
                ndoVar11 = ndpVar.O;
                if (ndoVar11 == null) {
                    ndoVar11 = ndo.e;
                }
            } else {
                ndoVar11 = null;
            }
            if ((ndpVar2.a & 16777216) != 0) {
                ndoVar12 = ndpVar2.O;
                if (ndoVar12 == null) {
                    ndoVar12 = ndo.e;
                }
            } else {
                ndoVar12 = null;
            }
            ndo p6 = p(ndoVar11, ndoVar12);
            if (p6 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar27 = (ndp) k.b;
                ndpVar27.O = p6;
                ndpVar27.a |= 16777216;
            }
            if ((ndpVar.a & 33554432) != 0) {
                ndoVar13 = ndpVar.P;
                if (ndoVar13 == null) {
                    ndoVar13 = ndo.e;
                }
            } else {
                ndoVar13 = null;
            }
            if ((ndpVar2.a & 33554432) != 0) {
                ndoVar14 = ndpVar2.P;
                if (ndoVar14 == null) {
                    ndoVar14 = ndo.e;
                }
            } else {
                ndoVar14 = null;
            }
            ndo p7 = p(ndoVar13, ndoVar14);
            if (p7 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar28 = (ndp) k.b;
                ndpVar28.P = p7;
                ndpVar28.a |= 33554432;
            }
            if ((ndpVar.a & 67108864) != 0) {
                ndoVar15 = ndpVar.Q;
                if (ndoVar15 == null) {
                    ndoVar15 = ndo.e;
                }
            } else {
                ndoVar15 = null;
            }
            if ((ndpVar2.a & 67108864) != 0) {
                ndoVar16 = ndpVar2.Q;
                if (ndoVar16 == null) {
                    ndoVar16 = ndo.e;
                }
            } else {
                ndoVar16 = null;
            }
            ndo p8 = p(ndoVar15, ndoVar16);
            if (p8 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar29 = (ndp) k.b;
                ndpVar29.Q = p8;
                ndpVar29.a |= 67108864;
            }
            if ((ndpVar.a & 134217728) != 0) {
                ndoVar17 = ndpVar.R;
                if (ndoVar17 == null) {
                    ndoVar17 = ndo.e;
                }
            } else {
                ndoVar17 = null;
            }
            if ((ndpVar2.a & 134217728) != 0) {
                ndoVar18 = ndpVar2.R;
                if (ndoVar18 == null) {
                    ndoVar18 = ndo.e;
                }
            } else {
                ndoVar18 = null;
            }
            ndo p9 = p(ndoVar17, ndoVar18);
            if (p9 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar30 = (ndp) k.b;
                ndpVar30.R = p9;
                ndpVar30.a |= 134217728;
            }
            if ((ndpVar.a & 268435456) != 0) {
                ndoVar19 = ndpVar.S;
                if (ndoVar19 == null) {
                    ndoVar19 = ndo.e;
                }
            } else {
                ndoVar19 = null;
            }
            if ((ndpVar2.a & 268435456) != 0) {
                ndoVar20 = ndpVar2.S;
                if (ndoVar20 == null) {
                    ndoVar20 = ndo.e;
                }
            } else {
                ndoVar20 = null;
            }
            ndo p10 = p(ndoVar19, ndoVar20);
            if (p10 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar31 = (ndp) k.b;
                ndpVar31.S = p10;
                ndpVar31.a |= 268435456;
            }
            if ((ndpVar.a & 536870912) != 0) {
                ndoVar21 = ndpVar.T;
                if (ndoVar21 == null) {
                    ndoVar21 = ndo.e;
                }
            } else {
                ndoVar21 = null;
            }
            if ((ndpVar2.a & 536870912) != 0) {
                ndoVar22 = ndpVar2.T;
                if (ndoVar22 == null) {
                    ndoVar22 = ndo.e;
                }
            } else {
                ndoVar22 = null;
            }
            ndo p11 = p(ndoVar21, ndoVar22);
            if (p11 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar32 = (ndp) k.b;
                ndpVar32.T = p11;
                ndpVar32.a |= 536870912;
            }
            if ((ndpVar.a & 1073741824) != 0) {
                ndoVar23 = ndpVar.U;
                if (ndoVar23 == null) {
                    ndoVar23 = ndo.e;
                }
            } else {
                ndoVar23 = null;
            }
            if ((ndpVar2.a & 1073741824) != 0) {
                ndoVar24 = ndpVar2.U;
                if (ndoVar24 == null) {
                    ndoVar24 = ndo.e;
                }
            } else {
                ndoVar24 = null;
            }
            ndo p12 = p(ndoVar23, ndoVar24);
            if (p12 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar33 = (ndp) k.b;
                ndpVar33.U = p12;
                ndpVar33.a |= 1073741824;
            }
            if ((ndpVar.a & Integer.MIN_VALUE) != 0) {
                ndoVar25 = ndpVar.V;
                if (ndoVar25 == null) {
                    ndoVar25 = ndo.e;
                }
            } else {
                ndoVar25 = null;
            }
            if ((ndpVar2.a & Integer.MIN_VALUE) != 0) {
                ndoVar26 = ndpVar2.V;
                if (ndoVar26 == null) {
                    ndoVar26 = ndo.e;
                }
            } else {
                ndoVar26 = null;
            }
            ndo p13 = p(ndoVar25, ndoVar26);
            if (p13 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar34 = (ndp) k.b;
                ndpVar34.V = p13;
                ndpVar34.a |= Integer.MIN_VALUE;
            }
            if ((ndpVar.b & 1) != 0) {
                ndoVar27 = ndpVar.W;
                if (ndoVar27 == null) {
                    ndoVar27 = ndo.e;
                }
            } else {
                ndoVar27 = null;
            }
            if ((ndpVar2.b & 1) != 0) {
                ndoVar28 = ndpVar2.W;
                if (ndoVar28 == null) {
                    ndoVar28 = ndo.e;
                }
            } else {
                ndoVar28 = null;
            }
            ndo p14 = p(ndoVar27, ndoVar28);
            if (p14 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar35 = (ndp) k.b;
                ndpVar35.W = p14;
                ndpVar35.b |= 1;
            }
            if ((ndpVar.b & 2) != 0) {
                ndoVar29 = ndpVar.X;
                if (ndoVar29 == null) {
                    ndoVar29 = ndo.e;
                }
            } else {
                ndoVar29 = null;
            }
            if ((ndpVar2.b & 2) != 0) {
                ndoVar30 = ndpVar2.X;
                if (ndoVar30 == null) {
                    ndoVar30 = ndo.e;
                }
            } else {
                ndoVar30 = null;
            }
            ndo p15 = p(ndoVar29, ndoVar30);
            if (p15 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar36 = (ndp) k.b;
                ndpVar36.X = p15;
                ndpVar36.b |= 2;
            }
            if ((ndpVar.b & 4) != 0) {
                long j20 = ndpVar.Y - ndpVar2.Y;
                if (j20 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar37 = (ndp) k.b;
                    ndpVar37.b |= 4;
                    ndpVar37.Y = j20;
                }
            }
            if ((ndpVar.b & 8) != 0) {
                long j21 = ndpVar.Z - ndpVar2.Z;
                if (j21 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar38 = (ndp) k.b;
                    ndpVar38.b |= 8;
                    ndpVar38.Z = j21;
                }
            }
            if ((ndpVar.b & 16) != 0) {
                long j22 = ndpVar.aa - ndpVar2.aa;
                if (j22 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar39 = (ndp) k.b;
                    ndpVar39.b |= 16;
                    ndpVar39.aa = j22;
                }
            }
            if ((ndpVar.b & 32) != 0) {
                long j23 = ndpVar.ab - ndpVar2.ab;
                if (j23 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar40 = (ndp) k.b;
                    ndpVar40.b |= 32;
                    ndpVar40.ab = j23;
                }
            }
            if ((ndpVar.b & 64) != 0) {
                long j24 = ndpVar.ac - ndpVar2.ac;
                if (j24 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar41 = (ndp) k.b;
                    ndpVar41.b |= 64;
                    ndpVar41.ac = j24;
                }
            }
            if ((ndpVar.b & 128) != 0) {
                long j25 = ndpVar.ad - ndpVar2.ad;
                if (j25 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar42 = (ndp) k.b;
                    ndpVar42.b |= 128;
                    ndpVar42.ad = j25;
                }
            }
            if ((ndpVar.b & 256) != 0) {
                long j26 = ndpVar.ae - ndpVar2.ae;
                if (j26 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar43 = (ndp) k.b;
                    ndpVar43.b |= 256;
                    ndpVar43.ae = j26;
                }
            }
            if ((ndpVar.b & 512) != 0) {
                long j27 = ndpVar.af - ndpVar2.af;
                if (j27 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar44 = (ndp) k.b;
                    ndpVar44.b |= 512;
                    ndpVar44.af = j27;
                }
            }
            if ((ndpVar.b & 1024) != 0) {
                long j28 = ndpVar.ag - ndpVar2.ag;
                if (j28 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar45 = (ndp) k.b;
                    ndpVar45.b |= 1024;
                    ndpVar45.ag = j28;
                }
            }
            if ((ndpVar.b & 2048) != 0) {
                long j29 = ndpVar.ah - ndpVar2.ah;
                if (j29 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar46 = (ndp) k.b;
                    ndpVar46.b |= 2048;
                    ndpVar46.ah = j29;
                }
            }
            if ((ndpVar.b & 4096) != 0) {
                long j30 = ndpVar.ai - ndpVar2.ai;
                if (j30 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar47 = (ndp) k.b;
                    ndpVar47.b |= 4096;
                    ndpVar47.ai = j30;
                }
            }
            if ((ndpVar.b & 8192) != 0) {
                long j31 = ndpVar.aj - ndpVar2.aj;
                if (j31 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar48 = (ndp) k.b;
                    ndpVar48.b |= 8192;
                    ndpVar48.aj = j31;
                }
            }
            if ((ndpVar.b & 16384) != 0) {
                long j32 = ndpVar.ak - ndpVar2.ak;
                if (j32 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar49 = (ndp) k.b;
                    ndpVar49.b |= 16384;
                    ndpVar49.ak = j32;
                }
            }
            if ((ndpVar.b & 32768) != 0) {
                long j33 = ndpVar.al - ndpVar2.al;
                if (j33 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar50 = (ndp) k.b;
                    ndpVar50.b = 32768 | ndpVar50.b;
                    ndpVar50.al = j33;
                }
            }
            if ((ndpVar.b & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                long j34 = ndpVar.am - ndpVar2.am;
                if (j34 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar51 = (ndp) k.b;
                    ndpVar51.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                    ndpVar51.am = j34;
                }
            }
            if ((ndpVar.b & 131072) != 0) {
                ndoVar31 = ndpVar.an;
                if (ndoVar31 == null) {
                    ndoVar31 = ndo.e;
                }
            } else {
                ndoVar31 = null;
            }
            if ((ndpVar2.b & 131072) != 0) {
                ndoVar32 = ndpVar2.an;
                if (ndoVar32 == null) {
                    ndoVar32 = ndo.e;
                }
            } else {
                ndoVar32 = null;
            }
            ndo p16 = p(ndoVar31, ndoVar32);
            if (p16 != null) {
                if (!k.b.y()) {
                    k.t();
                }
                ndp ndpVar52 = (ndp) k.b;
                ndpVar52.an = p16;
                ndpVar52.b |= 131072;
            }
            if ((ndpVar.b & 262144) != 0) {
                long j35 = ndpVar.ao - ndpVar2.ao;
                if (j35 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar53 = (ndp) k.b;
                    ndpVar53.b |= 262144;
                    ndpVar53.ao = j35;
                }
            }
            if ((ndpVar.b & ImageMetadata.LENS_APERTURE) != 0) {
                long j36 = ndpVar.ap - ndpVar2.ap;
                if (j36 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar54 = (ndp) k.b;
                    ndpVar54.b |= ImageMetadata.LENS_APERTURE;
                    ndpVar54.ap = j36;
                }
            }
            if ((ndpVar.b & ImageMetadata.SHADING_MODE) != 0) {
                long j37 = ndpVar.aq - ndpVar2.aq;
                if (j37 != 0) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    ndp ndpVar55 = (ndp) k.b;
                    ndpVar55.b |= ImageMetadata.SHADING_MODE;
                    ndpVar55.aq = j37;
                }
            }
            ndpVar = (ndp) k.q();
            if (v(ndpVar)) {
                return null;
            }
        }
        return ndpVar;
    }

    public static boolean s(ndk ndkVar) {
        if (ndkVar == null) {
            return true;
        }
        if (ndkVar.b.size() == 0 && ndkVar.c.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean t(ndm ndmVar) {
        if (ndmVar == null) {
            return true;
        }
        if (ndmVar.b <= 0 && ndmVar.c <= 0 && ndmVar.d <= 0 && ndmVar.e <= 0 && ndmVar.f <= 0 && ndmVar.g <= 0) {
            return true;
        }
        return false;
    }

    public static boolean u(ndn ndnVar) {
        if (ndnVar == null) {
            return true;
        }
        if (ndnVar.b <= 0 && ndnVar.c <= 0) {
            return true;
        }
        return false;
    }

    static boolean v(ndp ndpVar) {
        if (ndpVar == null) {
            return true;
        }
        if (ndpVar.c <= 0 && ndpVar.d <= 0 && ndpVar.e <= 0 && ndpVar.f <= 0 && ndpVar.g.size() == 0 && ndpVar.h.size() == 0 && ndpVar.i.size() == 0 && ndpVar.j.size() == 0 && ndpVar.k.size() == 0 && ndpVar.l.size() == 0 && ndpVar.n.size() == 0 && ndpVar.o.size() == 0 && ndpVar.p.size() == 0 && ndpVar.q.size() == 0 && ndpVar.r <= 0 && ndpVar.s <= 0 && ndpVar.t <= 0 && ndpVar.u <= 0 && ndpVar.v <= 0 && ndpVar.w <= 0 && ndpVar.x <= 0 && ndpVar.C <= 0 && ndpVar.D <= 0 && ndpVar.E <= 0 && ndpVar.F <= 0 && ndpVar.G <= 0 && ndpVar.H <= 0 && ndpVar.I <= 0 && ndpVar.K <= 0 && ndpVar.Y <= 0 && ndpVar.Z <= 0 && ndpVar.aa <= 0 && ndpVar.ab <= 0 && ndpVar.ac <= 0 && ndpVar.ad <= 0 && ndpVar.ae <= 0 && ndpVar.af <= 0 && ndpVar.ag <= 0 && ndpVar.ah <= 0 && ndpVar.ai <= 0 && ndpVar.aj <= 0 && ndpVar.ak <= 0 && ndpVar.al <= 0 && ndpVar.am <= 0 && ndpVar.ao <= 0 && ndpVar.ap <= 0 && ndpVar.aq <= 0) {
            return true;
        }
        return false;
    }

    public static hos w(Long l, Long l2, HealthStats healthStats, ndf ndfVar, hoe hoeVar) {
        Object obj;
        ljh k = ndp.ar.k();
        long k2 = k(healthStats, 10001);
        if (k2 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar = (ndp) k.b;
            ndpVar.a |= 1;
            ndpVar.c = k2;
        }
        long k3 = k(healthStats, 10002);
        if (k3 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar2 = (ndp) k.b;
            ndpVar2.a |= 2;
            ndpVar2.d = k3;
        }
        long k4 = k(healthStats, 10003);
        if (k4 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar3 = (ndp) k.b;
            ndpVar3.a |= 4;
            ndpVar3.e = k4;
        }
        long k5 = k(healthStats, 10004);
        if (k5 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar4 = (ndp) k.b;
            ndpVar4.a |= 8;
            ndpVar4.f = k5;
        }
        k.aa(l(healthStats, 10005));
        k.ab(l(healthStats, 10006));
        k.ac(l(healthStats, 10007));
        k.Z(l(healthStats, 10008));
        k.Y(l(healthStats, 10009));
        k.U(l(healthStats, 10010));
        ndo o = o(healthStats, 10011);
        if (o != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar5 = (ndp) k.b;
            ndpVar5.m = o;
            ndpVar5.a |= 16;
        }
        k.V(l(healthStats, 10012));
        k.X(hon.a.d(m(healthStats, 10014)));
        k.W(hom.a.d(m(healthStats, 10015)));
        long k6 = k(healthStats, 10016);
        if (k6 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar6 = (ndp) k.b;
            ndpVar6.a |= 32;
            ndpVar6.r = k6;
        }
        long k7 = k(healthStats, 10017);
        if (k7 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar7 = (ndp) k.b;
            ndpVar7.a |= 64;
            ndpVar7.s = k7;
        }
        long k8 = k(healthStats, 10018);
        if (k8 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar8 = (ndp) k.b;
            ndpVar8.a |= 128;
            ndpVar8.t = k8;
        }
        long k9 = k(healthStats, 10019);
        if (k9 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar9 = (ndp) k.b;
            ndpVar9.a |= 256;
            ndpVar9.u = k9;
        }
        long k10 = k(healthStats, 10020);
        if (k10 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar10 = (ndp) k.b;
            ndpVar10.a |= 512;
            ndpVar10.v = k10;
        }
        long k11 = k(healthStats, 10021);
        if (k11 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar11 = (ndp) k.b;
            ndpVar11.a |= 1024;
            ndpVar11.w = k11;
        }
        long k12 = k(healthStats, 10022);
        if (k12 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar12 = (ndp) k.b;
            ndpVar12.a |= 2048;
            ndpVar12.x = k12;
        }
        long k13 = k(healthStats, 10023);
        if (k13 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar13 = (ndp) k.b;
            ndpVar13.a |= 4096;
            ndpVar13.C = k13;
        }
        long k14 = k(healthStats, 10024);
        if (k14 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar14 = (ndp) k.b;
            ndpVar14.a |= 8192;
            ndpVar14.D = k14;
        }
        long k15 = k(healthStats, 10025);
        if (k15 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar15 = (ndp) k.b;
            ndpVar15.a |= 16384;
            ndpVar15.E = k15;
        }
        long k16 = k(healthStats, 10026);
        if (k16 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar16 = (ndp) k.b;
            ndpVar16.a |= 32768;
            ndpVar16.F = k16;
        }
        long k17 = k(healthStats, 10027);
        if (k17 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar17 = (ndp) k.b;
            ndpVar17.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            ndpVar17.G = k17;
        }
        long k18 = k(healthStats, 10028);
        if (k18 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar18 = (ndp) k.b;
            ndpVar18.a |= 131072;
            ndpVar18.H = k18;
        }
        long k19 = k(healthStats, 10029);
        if (k19 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar19 = (ndp) k.b;
            ndpVar19.a |= 262144;
            ndpVar19.I = k19;
        }
        ndo o2 = o(healthStats, 10030);
        if (o2 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar20 = (ndp) k.b;
            ndpVar20.J = o2;
            ndpVar20.a |= ImageMetadata.LENS_APERTURE;
        }
        long k20 = k(healthStats, 10031);
        if (k20 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar21 = (ndp) k.b;
            ndpVar21.a |= ImageMetadata.SHADING_MODE;
            ndpVar21.K = k20;
        }
        ndo o3 = o(healthStats, 10032);
        if (o3 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar22 = (ndp) k.b;
            ndpVar22.L = o3;
            ndpVar22.a |= 2097152;
        }
        ndo o4 = o(healthStats, 10033);
        if (o4 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar23 = (ndp) k.b;
            ndpVar23.M = o4;
            ndpVar23.a |= 4194304;
        }
        ndo o5 = o(healthStats, 10034);
        if (o5 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar24 = (ndp) k.b;
            ndpVar24.N = o5;
            ndpVar24.a |= 8388608;
        }
        ndo o6 = o(healthStats, 10035);
        if (o6 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar25 = (ndp) k.b;
            ndpVar25.O = o6;
            ndpVar25.a |= 16777216;
        }
        ndo o7 = o(healthStats, 10036);
        if (o7 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar26 = (ndp) k.b;
            ndpVar26.P = o7;
            ndpVar26.a |= 33554432;
        }
        ndo o8 = o(healthStats, 10037);
        if (o8 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar27 = (ndp) k.b;
            ndpVar27.Q = o8;
            ndpVar27.a |= 67108864;
        }
        ndo o9 = o(healthStats, 10038);
        if (o9 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar28 = (ndp) k.b;
            ndpVar28.R = o9;
            ndpVar28.a |= 134217728;
        }
        ndo o10 = o(healthStats, 10039);
        if (o10 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar29 = (ndp) k.b;
            ndpVar29.S = o10;
            ndpVar29.a |= 268435456;
        }
        ndo o11 = o(healthStats, 10040);
        if (o11 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar30 = (ndp) k.b;
            ndpVar30.T = o11;
            ndpVar30.a |= 536870912;
        }
        ndo o12 = o(healthStats, 10041);
        if (o12 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar31 = (ndp) k.b;
            ndpVar31.U = o12;
            ndpVar31.a |= 1073741824;
        }
        ndo o13 = o(healthStats, 10042);
        if (o13 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar32 = (ndp) k.b;
            ndpVar32.V = o13;
            ndpVar32.a |= Integer.MIN_VALUE;
        }
        ndo o14 = o(healthStats, 10043);
        if (o14 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar33 = (ndp) k.b;
            ndpVar33.W = o14;
            ndpVar33.b |= 1;
        }
        ndo o15 = o(healthStats, 10044);
        if (o15 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar34 = (ndp) k.b;
            ndpVar34.X = o15;
            ndpVar34.b |= 2;
        }
        long k21 = k(healthStats, 10045);
        if (k21 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar35 = (ndp) k.b;
            ndpVar35.b |= 4;
            ndpVar35.Y = k21;
        }
        long k22 = k(healthStats, 10046);
        if (k22 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar36 = (ndp) k.b;
            ndpVar36.b |= 8;
            ndpVar36.Z = k22;
        }
        long k23 = k(healthStats, 10047);
        if (k23 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar37 = (ndp) k.b;
            ndpVar37.b |= 16;
            ndpVar37.aa = k23;
        }
        long k24 = k(healthStats, 10048);
        if (k24 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar38 = (ndp) k.b;
            ndpVar38.b |= 32;
            ndpVar38.ab = k24;
        }
        long k25 = k(healthStats, 10049);
        if (k25 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar39 = (ndp) k.b;
            ndpVar39.b |= 64;
            ndpVar39.ac = k25;
        }
        long k26 = k(healthStats, 10050);
        if (k26 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar40 = (ndp) k.b;
            ndpVar40.b |= 128;
            ndpVar40.ad = k26;
        }
        long k27 = k(healthStats, 10051);
        if (k27 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar41 = (ndp) k.b;
            ndpVar41.b |= 256;
            ndpVar41.ae = k27;
        }
        long k28 = k(healthStats, 10052);
        if (k28 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar42 = (ndp) k.b;
            ndpVar42.b |= 512;
            ndpVar42.af = k28;
        }
        long k29 = k(healthStats, 10053);
        if (k29 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar43 = (ndp) k.b;
            ndpVar43.b |= 1024;
            ndpVar43.ag = k29;
        }
        long k30 = k(healthStats, 10054);
        if (k30 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar44 = (ndp) k.b;
            ndpVar44.b |= 2048;
            ndpVar44.ah = k30;
        }
        long k31 = k(healthStats, 10055);
        if (k31 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar45 = (ndp) k.b;
            ndpVar45.b |= 4096;
            ndpVar45.ai = k31;
        }
        long k32 = k(healthStats, 10056);
        if (k32 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar46 = (ndp) k.b;
            ndpVar46.b |= 8192;
            ndpVar46.aj = k32;
        }
        long k33 = k(healthStats, 10057);
        if (k33 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar47 = (ndp) k.b;
            ndpVar47.b |= 16384;
            ndpVar47.ak = k33;
        }
        long k34 = k(healthStats, 10058);
        if (k34 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar48 = (ndp) k.b;
            ndpVar48.b = 32768 | ndpVar48.b;
            ndpVar48.al = k34;
        }
        long k35 = k(healthStats, 10059);
        if (k35 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar49 = (ndp) k.b;
            ndpVar49.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            ndpVar49.am = k35;
        }
        ndo o16 = o(healthStats, 10061);
        if (o16 != null) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar50 = (ndp) k.b;
            ndpVar50.an = o16;
            ndpVar50.b |= 131072;
        }
        long k36 = k(healthStats, 10062);
        if (k36 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar51 = (ndp) k.b;
            ndpVar51.b |= 262144;
            ndpVar51.ao = k36;
        }
        long k37 = k(healthStats, 10063);
        if (k37 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar52 = (ndp) k.b;
            ndpVar52.b = 524288 | ndpVar52.b;
            ndpVar52.ap = k37;
        }
        long k38 = k(healthStats, 10064);
        if (k38 != 0) {
            if (!k.b.y()) {
                k.t();
            }
            ndp ndpVar53 = (ndp) k.b;
            ndpVar53.b |= ImageMetadata.SHADING_MODE;
            ndpVar53.aq = k38;
        }
        ndp ndpVar54 = (ndp) k.q();
        ljh ljhVar = (ljh) ndpVar54.z(5);
        ljhVar.w(ndpVar54);
        Collections.unmodifiableList(((ndp) ljhVar.b).g);
        int i = 0;
        while (true) {
            hri hriVar = hoeVar.c;
            int size = ((ndp) ljhVar.b).g.size();
            obj = hriVar.a;
            if (i >= size) {
                break;
            }
            ljhVar.ah(i, ((hok) obj).b(hoj.WAKELOCK, ljhVar.N(i)));
            i++;
        }
        Collections.unmodifiableList(((ndp) ljhVar.b).h);
        for (int i2 = 0; i2 < ((ndp) ljhVar.b).h.size(); i2++) {
            ljhVar.ai(i2, ((hok) obj).b(hoj.WAKELOCK, ljhVar.O(i2)));
        }
        Collections.unmodifiableList(((ndp) ljhVar.b).i);
        for (int i3 = 0; i3 < ((ndp) ljhVar.b).i.size(); i3++) {
            ljhVar.aj(i3, ((hok) obj).b(hoj.WAKELOCK, ljhVar.P(i3)));
        }
        Collections.unmodifiableList(((ndp) ljhVar.b).j);
        for (int i4 = 0; i4 < ((ndp) ljhVar.b).j.size(); i4++) {
            ljhVar.ag(i4, ((hok) obj).b(hoj.WAKELOCK, ljhVar.Q(i4)));
        }
        Collections.unmodifiableList(((ndp) ljhVar.b).k);
        for (int i5 = 0; i5 < ((ndp) ljhVar.b).k.size(); i5++) {
            ljhVar.af(i5, ((hok) obj).b(hoj.SYNC, ljhVar.R(i5)));
        }
        Collections.unmodifiableList(((ndp) ljhVar.b).l);
        for (int i6 = 0; i6 < ((ndp) ljhVar.b).l.size(); i6++) {
            ljhVar.ad(i6, ((hok) obj).b(hoj.JOB, ljhVar.S(i6)));
        }
        Collections.unmodifiableList(((ndp) ljhVar.b).n);
        for (int i7 = 0; i7 < ((ndp) ljhVar.b).n.size(); i7++) {
            ljhVar.ae(i7, ((hok) obj).b(hoj.SENSOR, ljhVar.T(i7)));
        }
        return new hos((ndp) ljhVar.q(), l, l2, 647465502L, Long.valueOf(hoeVar.a != null ? r0.hashCode() : 0L), ndfVar, null, null, null);
    }

    public static hoc x(jer jerVar, mko mkoVar) {
        return (hoc) ((mko) jerVar.e(mkoVar)).a();
    }

    public static /* synthetic */ String y(int i) {
        if (i != 1) {
            return "null";
        }
        return "ALIGN_CENTER";
    }

    public static jyz z(final fhw fhwVar, final jei jeiVar, final Executor executor) {
        final jzm jzmVar = new jzm();
        fhwVar.h(new fia() { // from class: hkz
            @Override // defpackage.fia
            public final void a(final fhz fhzVar) {
                Status b = fhzVar.b();
                if (b.g != 14) {
                    final jzm jzmVar2 = jzm.this;
                    if (!b.a()) {
                        jzmVar2.n(new hkv(fhzVar, b));
                        hog.A(fhzVar);
                        return;
                    } else {
                        final jei jeiVar2 = jeiVar;
                        executor.execute(new Runnable() { // from class: hlb
                            @Override // java.lang.Runnable
                            public final void run() {
                                jei jeiVar3 = jeiVar2;
                                jzm jzmVar3 = jzm.this;
                                fhz fhzVar2 = fhzVar;
                                try {
                                    try {
                                        jzmVar3.d(jeiVar3.a(fhzVar2));
                                    } catch (RuntimeException e) {
                                        jzmVar3.n(e);
                                    }
                                } finally {
                                    hog.A(fhzVar2);
                                }
                            }
                        });
                        return;
                    }
                }
                throw new AssertionError("We never use the blocking API for these calls: ".concat(String.valueOf(String.valueOf(fhzVar))));
            }
        }, TimeUnit.SECONDS);
        jzmVar.c(jbn.f(new Runnable() { // from class: hla
            @Override // java.lang.Runnable
            public final void run() {
                if (jzm.this.isCancelled()) {
                    fhwVar.e();
                }
            }
        }), jxv.a);
        return jzmVar;
    }

    public hog(byte[] bArr) {
    }

    public /* synthetic */ hog(char[] cArr) {
    }
}
