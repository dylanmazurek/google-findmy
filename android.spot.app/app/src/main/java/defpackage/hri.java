package defpackage;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hri {
    public final Object a;
    public final Object b;

    public hri(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static final nej b(boolean z, hob hobVar) {
        jer jerVar;
        jer jerVar2;
        ljh k = nej.h.k();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        nej nejVar = (nej) ljnVar;
        nejVar.a |= 1;
        nejVar.b = elapsedCpuTime;
        if (!ljnVar.y()) {
            k.t();
        }
        nej nejVar2 = (nej) k.b;
        nejVar2.a |= 2;
        nejVar2.c = z;
        int activeCount = Thread.activeCount();
        if (!k.b.y()) {
            k.t();
        }
        nej nejVar3 = (nej) k.b;
        nejVar3.a |= 4;
        nejVar3.d = activeCount;
        final int myPid = Process.myPid();
        String format = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(myPid));
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(format, "r");
                try {
                    jerVar = jer.h(randomAccessFile.readLine()).b(new hkn(10));
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                jerVar = jdl.a;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            if (jerVar.g()) {
                int intValue = ((Integer) jerVar.c()).intValue();
                if (!k.b.y()) {
                    k.t();
                }
                nej nejVar4 = (nej) k.b;
                nejVar4.a |= 16;
                nejVar4.f = intValue;
            }
            if (!hobVar.a) {
                jerVar2 = jdl.a;
            } else {
                jerVar2 = (jer) hzc.U(hobVar.a(), new jet() { // from class: hnz
                    @Override // defpackage.jet
                    public final boolean a(Object obj) {
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                            return true;
                        }
                        return false;
                    }
                }).b(new hkn(7)).e(jdl.a);
            }
            if (jerVar2.g()) {
                String flattenToString = ((ComponentName) jerVar2.c()).flattenToString();
                if (!k.b.y()) {
                    k.t();
                }
                nej nejVar5 = (nej) k.b;
                flattenToString.getClass();
                nejVar5.a |= 32;
                nejVar5.g = flattenToString;
            }
            return (nej) k.q();
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th3;
        }
    }

    public static jyz e(fxs fxsVar) {
        final jzm jzmVar = new jzm();
        fxsVar.l(jxv.a, new fxm() { // from class: hvc
            @Override // defpackage.fxm
            public final void a(fxs fxsVar2) {
                boolean z = ((fxv) fxsVar2).c;
                jzm jzmVar2 = jzm.this;
                if (z) {
                    jzmVar2.cancel(false);
                    return;
                }
                if (fxsVar2.i()) {
                    jzmVar2.d(fxsVar2.e());
                    return;
                }
                Exception d = fxsVar2.d();
                if (d != null) {
                    jzmVar2.n(d);
                    return;
                }
                throw new IllegalStateException();
            }
        });
        return jzmVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [goj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [lqz, java.lang.Object] */
    public final goj A(gny gnyVar) {
        gnyVar.getClass();
        if (gnyVar.a()) {
            Object a = this.b.a();
            a.getClass();
            return (goj) a;
        }
        if (gnyVar.b()) {
            return this.a;
        }
        throw new IllegalStateException("Unsupported targetType for GnpAccountStorageProviderImpl");
    }

    public final nej a() {
        hob a = hoa.a((Context) this.b);
        return b(((apc) this.a).v(a), a);
    }

    public final jyz c(hko hkoVar, String str, int i) {
        jbx e = jbx.d(hkoVar.a(((hpd) this.a).d(new Account(str, "com.google")), new gfj(lwq.a.a().a((Context) this.b)), hog.E(i))).a(gfk.class, new hkn(1), jxv.a).b(fhn.class, new etl(6), jxv.a).b(IOException.class, new etl(7), jxv.a).e(new hkn(0), jxv.a);
        iuu.q(e, new ems(5), jxv.a);
        return e;
    }

    public final FacsCacheCallOptions d() {
        return new FacsCacheCallOptions((String) this.a, 1L);
    }

    public final boolean f(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        Object[] objArr;
        try {
            Method method = packageManager.getClass().getMethod((String) this.b, (Class[]) this.a);
            Object obj = this.a;
            if (((Class[]) obj).length == 2) {
                if (((Class[]) obj)[0] == String.class && ((Class[]) obj)[1] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, iPackageStatsObserver};
                    method.invoke(packageManager, objArr);
                    return true;
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
            }
            if (((Class[]) obj)[0] == String.class && ((Class[]) obj)[1] == Integer.TYPE && ((Class[]) this.a)[2] == IPackageStatsObserver.class) {
                objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                method.invoke(packageManager, objArr);
                return true;
            }
            throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
        } catch (Error e) {
            e = e;
            ((jni) ((jni) hmz.a.e()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 123, "PackageStatsCapture.java")).z("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.b, Arrays.asList((Object[]) this.a));
            return false;
        } catch (NoSuchMethodException e2) {
            ((jni) ((jni) ((jni) hmz.a.c()).i(e2)).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 'u', "PackageStatsCapture.java")).r("PackageStats getter not found");
            return false;
        } catch (Exception e3) {
            e = e3;
            ((jni) ((jni) hmz.a.e()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 123, "PackageStatsCapture.java")).z("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.b, Arrays.asList((Object[]) this.a));
            return false;
        }
    }

    public final void g(String str, String str2) {
        m(new hlt(this, str, str2, 1));
    }

    public final void h(String str, String str2, String str3, String str4, boolean z) {
        m(new min(this, str, str2, str3, str4, z, 1));
    }

    public final void i(final String str, final String str2, final int i, final String str3, final boolean z) {
        m(new Runnable() { // from class: hja
            /* JADX WARN: Type inference failed for: r0v1, types: [jfe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [jfe, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((imq) ((hpd) hri.this.a.a()).g.a()).b(str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void j(final String str, final boolean z, final boolean z2, final boolean z3, final int i, final String str2) {
        m(new Runnable() { // from class: hjd
            /* JADX WARN: Type inference failed for: r0v1, types: [jfe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [jfe, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((imq) ((hpd) hri.this.a.a()).c.a()).b(str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), str2);
            }
        });
    }

    public final void k(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        m(new Runnable() { // from class: hjb
            /* JADX WARN: Type inference failed for: r0v1, types: [jfe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [jfe, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((imn) ((hpd) hri.this.a.a()).h.a()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void l(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        m(new Runnable() { // from class: hjc
            /* JADX WARN: Type inference failed for: r0v1, types: [jfe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [jfe, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((imn) ((hpd) hri.this.a.a()).d.a()).b(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final void m(Runnable runnable) {
        Object obj = this.b;
        hiz hizVar = (hiz) obj;
        if (hizVar.a) {
            hizVar.b.schedule(new gno(runnable, obj, 18, null), 5L, TimeUnit.SECONDS).getClass();
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Queue] */
    public final void n() {
        ijs.c();
        while (!this.a.isEmpty()) {
            ((Runnable) this.a.remove()).run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hgx, java.lang.Object] */
    public final void o() {
        hwx.V(this.b.b(), "Object was not initialized");
        hog.H(new hep(this, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hgx, java.lang.Object] */
    public final void p(Runnable runnable) {
        ijs.c();
        this.a.add(runnable);
        if (this.b.b()) {
            n();
        }
    }

    public final /* synthetic */ gyl q(goa goaVar, leh lehVar) {
        Object n;
        lehVar.getClass();
        n = mpp.n(mnc.a, new gyk(this, goaVar, lehVar, (mmx) null, 4));
        return (gyl) n;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [msw, java.lang.Object] */
    public final jyz r(gwf gwfVar) {
        return mpd.r(this.a, new dzk(this, gwfVar, (mmx) null, 17));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [msw, java.lang.Object] */
    public final jyz s(gwf gwfVar) {
        return mpd.r(this.a, new dzk(this, gwfVar, (mmx) null, 18, (byte[]) null));
    }

    public final lgj t() {
        Set set = (Set) ((lsi) this.b).b;
        if (set.isEmpty()) {
            return lgj.b;
        }
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((lbu) it.next()).g));
        }
        ljh k = lgj.b.k();
        Iterator it2 = arrayList.iterator();
        int i = 1;
        while (it2.hasNext()) {
            i = Math.max((((Integer) it2.next()).intValue() / 64) + 1, i);
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(Collections.nCopies(i, 0L));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int intValue = ((Integer) it3.next()).intValue();
            int i2 = intValue / 64;
            arrayList2.set(i2, Long.valueOf(((Long) arrayList2.get(i2)).longValue() | (1 << (intValue % 64))));
        }
        k.H(arrayList2);
        return (lgj) k.q();
    }

    public final lgs u() {
        ljh k = lgs.f.k();
        Iterator it = ((lsp) this.a).a().iterator();
        while (it.hasNext()) {
            k.w((lgs) it.next());
        }
        return (lgs) k.q();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [mnb, java.lang.Object] */
    public final Object v(Map map, gst gstVar, gny gnyVar, mmx mmxVar) {
        return mpp.l(this.b, new gtv(map, gstVar, this, gnyVar, (mmx) null, 0), mmxVar);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [gqz, java.lang.Object] */
    public final void w(Map map, gna gnaVar) {
        lcr lcrVar;
        map.getClass();
        gnaVar.getClass();
        if (gnaVar instanceof gnc) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                x((goa) it.next());
            }
            return;
        }
        if (gnaVar instanceof gmx) {
            gmx gmxVar = (gmx) gnaVar;
            int i = 2;
            if (!(gmxVar instanceof guh) && !(gmxVar instanceof guf)) {
                i = 4;
                if (!(gmxVar instanceof gun) && !(gmxVar instanceof gul)) {
                    i = gmxVar instanceof gsu ? 3 : 1;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                gwf gwfVar = (gwf) entry.getKey();
                goa goaVar = (goa) entry.getValue();
                gwfVar.getClass();
                if (gmxVar instanceof gug) {
                    if (amr.i(((gug) gmxVar).i(), gwfVar)) {
                        lcrVar = lcr.FAILED_TO_REGISTER;
                    } else {
                        lcrVar = lcr.FAILED_TO_REGISTER_OTHER_ACCOUNT;
                    }
                } else if ((gmxVar instanceof guo) && !((guo) gmxVar).a.contains(gwfVar)) {
                    lcrVar = null;
                } else {
                    lcrVar = lcr.FAILED_TO_REGISTER;
                }
                if (lcrVar != null) {
                    ?? r3 = this.a;
                    grb j = ((ktn) this.b).j(lcrVar);
                    j.b(goaVar);
                    j.r = i;
                    String simpleName = gmxVar.a().getClass().getSimpleName();
                    simpleName.getClass();
                    j.o = simpleName;
                    r3.a(j);
                } else {
                    x(goaVar);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gqz, java.lang.Object] */
    public final void x(goa goaVar) {
        goaVar.getClass();
        grb k = ((ktn) this.b).k(lde.TARGET_REGISTERED);
        k.b(goaVar);
        this.a.a(k);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [msw, java.lang.Object] */
    public final jyz y(gry gryVar, gwf gwfVar, Bundle bundle, Long l) {
        gryVar.getClass();
        return mpd.r(this.a, new gsc(this, gryVar, gwfVar, bundle, l, (mmx) null, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [grt, java.lang.Object] */
    public final gna z(String str, String str2) {
        str.getClass();
        return this.b.a(str, str2);
    }

    public hri(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public hri(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public hri(Object obj, msw mswVar) {
        this.b = obj;
        this.a = mswVar;
    }

    public hri(Context context) {
        this.a = new hok();
        this.b = context;
    }

    public hri(fng fngVar, String str) {
        this.b = fngVar;
        str.getClass();
        this.a = str;
    }

    public hri(goj gojVar, lqz lqzVar) {
        lqzVar.getClass();
        this.a = gojVar;
        this.b = lqzVar;
    }

    public hri(hgx hgxVar) {
        this.a = new ArrayDeque();
        this.b = hgxVar;
    }

    public hri(Context context, ScheduledExecutorService scheduledExecutorService) {
        context.getClass();
        scheduledExecutorService.getClass();
        this.a = hwx.H(new hiy(scheduledExecutorService, context, 0));
        this.b = new hiz(scheduledExecutorService);
    }

    public hri(fma fmaVar, gph gphVar, gwb gwbVar) {
        fmaVar.getClass();
        gphVar.getClass();
        this.a = gphVar;
        this.b = gwbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [mko, java.lang.Object] */
    public hri(lim limVar, kyf kyfVar, ktn ktnVar) {
        this.b = kyfVar;
        hot a = ((icw) ktnVar.a).a();
        Object a2 = ktnVar.c.a();
        hot a3 = ((ifb) ktnVar.d).a();
        jzd jzdVar = (jzd) ktnVar.b.a();
        jzdVar.getClass();
        this.a = new nca(limVar, a, (kuv) a2, a3, jzdVar);
    }

    public hri(mko mkoVar, mko mkoVar2) {
        this.a = mkoVar;
        mkoVar2.getClass();
        this.b = mkoVar2;
    }

    public hri(grt grtVar, msw mswVar) {
        grtVar.getClass();
        this.b = grtVar;
        this.a = mswVar;
    }

    public hri(gqz gqzVar, ktn ktnVar) {
        gqzVar.getClass();
        ktnVar.getClass();
        this.a = gqzVar;
        this.b = ktnVar;
    }
}
