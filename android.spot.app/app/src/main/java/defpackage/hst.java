package defpackage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture$PackageStatsCallback;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hst {
    static final hri[] a = {new hri("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}, (char[]) null), new hri("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}, (char[]) null), new hri("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}, (char[]) null)};

    public static boolean a() {
        try {
            if (Modifier.isAbstract(PackageStatsCapture$PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers())) {
                return false;
            }
            return true;
        } catch (Error | Exception e) {
            ((jni) ((jni) ((jni) hmz.a.c()).i(e)).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "isCallbackPresent", (char) 155, "PackageStatsCapture.java")).r("failure");
            return false;
        }
    }
}
