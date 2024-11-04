package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture$PackageStatsCallback;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsy extends hrc implements hnl, hpg {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final hpd b;
    public final Context c;
    public final lqz d;
    public final htm e;
    private final hnq f;
    private final Executor g;

    public hsy(hpe hpeVar, Context context, hnq hnqVar, Executor executor, lqz lqzVar, htm htmVar, mko mkoVar) {
        this.b = hpeVar.a(executor, lqzVar, mkoVar);
        this.g = executor;
        this.c = context;
        this.d = lqzVar;
        this.e = htmVar;
        this.f = hnqVar;
    }

    @Override // defpackage.hpg
    public final void Y() {
        this.f.a(this);
    }

    @Override // defpackage.hnl
    public final void i(hmq hmqVar) {
        this.f.b(this);
        ivc.J(new jxc() { // from class: hsx
            /* JADX WARN: Type inference failed for: r2v48, types: [mko, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v33, types: [mko, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v43, types: [mko, java.lang.Object] */
            @Override // defpackage.jxc
            public final jyz a() {
                long j;
                hsy hsyVar = hsy.this;
                if (!gad.d(hsyVar.c)) {
                    ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 109, "StorageMetricServiceImpl.java")).r("Device locked.");
                    return jyv.a;
                }
                ijs.b();
                htm htmVar = hsyVar.e;
                long j2 = hsy.a;
                ijs.b();
                if (gad.d((Context) htmVar.a)) {
                    long j3 = -1;
                    if (gad.d((Context) htmVar.a)) {
                        j = ((SharedPreferences) htmVar.b.a()).getLong("primes.packageMetric.lastSendTime", -1L);
                    } else {
                        j = -1;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime < j) {
                        if (!((SharedPreferences) htmVar.b.a()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                            ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 51, "PersistentRateLimiting.java")).r("Failure storing timestamp to SharedPreferences");
                        }
                        j3 = -1;
                        j = -1;
                    }
                    if (j != j3 && elapsedRealtime <= j + j2) {
                        ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 113, "StorageMetricServiceImpl.java")).r("Ignoring storage metric request, storage metric collection occurred too recently.");
                        return jyv.a;
                    }
                }
                PackageStats packageStats = null;
                if (!hsyVar.b.c(null)) {
                    return jyv.a;
                }
                Context context = hsyVar.c;
                ijs.b();
                if (Build.VERSION.SDK_INT >= 26) {
                    packageStats = hsu.a(context);
                } else if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) != 0 && context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") != 0) {
                    ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStats", 213, "PackageStatsCapture.java")).u("%s required", "android.permission.GET_PACKAGE_SIZE");
                } else {
                    hri[] hriVarArr = hst.a;
                    if (!hst.a()) {
                        ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 165, "PackageStatsCapture.java")).r("Callback implementation stripped by proguard.");
                    } else {
                        PackageStatsCapture$PackageStatsCallback packageStatsCapture$PackageStatsCallback = new PackageStatsCapture$PackageStatsCallback();
                        try {
                            packageStatsCapture$PackageStatsCallback.a.acquire();
                            PackageManager packageManager = context.getPackageManager();
                            String packageName = context.getPackageName();
                            int myUid = Process.myUid();
                            int i = 0;
                            while (true) {
                                if (i < 3) {
                                    if (hriVarArr[i].f(packageManager, packageName, myUid, packageStatsCapture$PackageStatsCallback)) {
                                        ((jni) ((jni) hmz.a.e()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 176, "PackageStatsCapture.java")).r("Success invoking PackageStats capture.");
                                        if (packageStatsCapture$PackageStatsCallback.a.tryAcquire(15000L, TimeUnit.MILLISECONDS)) {
                                            packageStats = packageStatsCapture$PackageStatsCallback.b;
                                        } else {
                                            ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "waitForStats", 65, "PackageStatsCapture.java")).r("Timeout while waiting for PackageStats callback");
                                        }
                                    } else {
                                        i++;
                                    }
                                } else {
                                    ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 182, "PackageStatsCapture.java")).r("Couldn't capture PackageStats.");
                                    break;
                                }
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                        packageStats = null;
                    }
                }
                if (packageStats == null) {
                    return ivc.D(new IllegalStateException("PackageStats capture failed."));
                }
                ljh k = nfe.v.k();
                ljh k2 = nez.k.k();
                long j4 = packageStats.cacheSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar = (nez) k2.b;
                nezVar.a |= 1;
                nezVar.b = j4;
                long j5 = packageStats.codeSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar2 = (nez) k2.b;
                nezVar2.a |= 2;
                nezVar2.c = j5;
                long j6 = packageStats.dataSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar3 = (nez) k2.b;
                nezVar3.a |= 4;
                nezVar3.d = j6;
                long j7 = packageStats.externalCacheSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar4 = (nez) k2.b;
                nezVar4.a |= 8;
                nezVar4.e = j7;
                long j8 = packageStats.externalCodeSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar5 = (nez) k2.b;
                nezVar5.a |= 16;
                nezVar5.f = j8;
                long j9 = packageStats.externalDataSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar6 = (nez) k2.b;
                nezVar6.a |= 32;
                nezVar6.g = j9;
                long j10 = packageStats.externalMediaSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar7 = (nez) k2.b;
                nezVar7.a |= 64;
                nezVar7.h = j10;
                long j11 = packageStats.externalObbSize;
                if (!k2.b.y()) {
                    k2.t();
                }
                nez nezVar8 = (nez) k2.b;
                nezVar8.a |= 128;
                nezVar8.i = j11;
                nez nezVar9 = (nez) k2.q();
                ljh ljhVar = (ljh) nezVar9.z(5);
                ljhVar.w(nezVar9);
                jer jerVar = ((hsw) hsyVar.d.a()).a;
                if (!k.b.y()) {
                    k.t();
                }
                nfe nfeVar = (nfe) k.b;
                nez nezVar10 = (nez) ljhVar.q();
                nezVar10.getClass();
                nfeVar.h = nezVar10;
                nfeVar.a |= 128;
                htm htmVar2 = hsyVar.e;
                if (!gad.d((Context) htmVar2.a) || !((SharedPreferences) htmVar2.b.a()).edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
                    ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 146, "StorageMetricServiceImpl.java")).r("Failure storing timestamp persistently");
                }
                hpd hpdVar = hsyVar.b;
                hoy a2 = hoz.a();
                a2.e((nfe) k.q());
                return hpdVar.b(a2.a());
            }
        }, this.g);
    }

    @Override // defpackage.hnl
    public final /* synthetic */ void j(hmq hmqVar) {
    }
}
