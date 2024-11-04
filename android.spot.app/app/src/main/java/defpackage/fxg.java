package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxg {
    public final Object a;
    public int b;
    fqr c;
    public final String d;
    private final PowerManager.WakeLock i;
    private Future j;
    private long k;
    private final Set l;
    private boolean m;
    private int n;
    private WorkSource o;
    private final Map p;
    private AtomicInteger q;
    private final ScheduledExecutorService r;
    private static final long f = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService g = null;
    private static final Object h = new Object();
    public static volatile fma e = new fma();

    public fxg(Context context, String str) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.l = new HashSet();
        this.m = true;
        this.p = new HashMap();
        this.q = new AtomicInteger(0);
        fma.aS(context, "WakeLock: context must not be null");
        fma.aQ(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.c = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.d = "*gcore*:".concat(str);
        } else {
            this.d = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        hwx.G(powerManager);
        this.i = powerManager.newWakeLock(1, str);
        if (fmc.a(context)) {
            packageName = fmb.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo x = fme.b(context).x(packageName, 0);
                    if (x == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i = x.uid;
                        workSource = new WorkSource();
                        Method method = fmc.b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i), packageName);
                            } catch (Exception e2) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                            }
                        } else {
                            Method method2 = fmc.a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i));
                                } catch (Exception e3) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.o = workSource;
            if (workSource != null) {
                g(this.i, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorService = g;
        if (scheduledExecutorService == null) {
            synchronized (h) {
                scheduledExecutorService = g;
                if (scheduledExecutorService == null) {
                    frx frxVar = fqv.a;
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    g = scheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorService;
    }

    private static void g(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
            Log.wtf("WakeLock", e2.toString());
        }
    }

    private final void h() {
        if (this.m) {
            TextUtils.isEmpty(null);
        }
    }

    public final void a(long j) {
        this.q.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.a) {
            if (!e()) {
                this.c = fqr.a;
                this.i.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.n++;
            h();
            fxf fxfVar = (fxf) this.p.get(null);
            if (fxfVar == null) {
                fxfVar = new fxf();
                this.p.put(null, fxfVar);
            }
            fxfVar.a++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Long.MAX_VALUE - elapsedRealtime > max) {
                j2 = elapsedRealtime + max;
            }
            if (j2 > this.k) {
                this.k = j2;
                Future future = this.j;
                if (future != null) {
                    future.cancel(false);
                }
                this.j = this.r.schedule(new eta(this, 16), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        if (this.q.decrementAndGet() < 0) {
            fma.s("%s release without a matched acquire!", this.d);
        }
        synchronized (this.a) {
            h();
            if (this.p.containsKey(null)) {
                fxf fxfVar = (fxf) this.p.get(null);
                if (fxfVar != null) {
                    int i = fxfVar.a - 1;
                    fxfVar.a = i;
                    if (i == 0) {
                        this.p.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", this.d + " counter does not exist");
            }
            f();
        }
    }

    public final void c() {
        if (!this.l.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.l);
            this.l.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            throw null;
        }
    }

    public final void d(boolean z) {
        synchronized (this.a) {
            this.m = z;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            if (this.b > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void f() {
        synchronized (this.a) {
            if (!e()) {
                return;
            }
            if (this.m) {
                int i = this.b - 1;
                this.b = i;
                if (i > 0) {
                    return;
                }
            } else {
                this.b = 0;
            }
            c();
            Iterator it = this.p.values().iterator();
            while (it.hasNext()) {
                ((fxf) it.next()).a = 0;
            }
            this.p.clear();
            Future future = this.j;
            if (future != null) {
                future.cancel(false);
                this.j = null;
                this.k = 0L;
            }
            this.n = 0;
            try {
                if (this.i.isHeld()) {
                    try {
                        this.i.release();
                        if (this.c != null) {
                            this.c = null;
                        }
                    } catch (RuntimeException e2) {
                        if (e2.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.format("%s failed to release!", this.d), e2);
                            if (this.c != null) {
                                this.c = null;
                            }
                        } else {
                            throw e2;
                        }
                    }
                } else {
                    fma.s("%s should be held!", this.d);
                }
            } catch (Throwable th) {
                if (this.c != null) {
                    this.c = null;
                }
                throw th;
            }
        }
    }
}
