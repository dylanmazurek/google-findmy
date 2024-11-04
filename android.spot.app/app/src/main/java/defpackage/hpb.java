package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpb implements lsh {
    private final mko a;
    private final /* synthetic */ int b;

    public hpb(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        Object obj;
        Looper looper;
        Object obj2;
        switch (this.b) {
            case 0:
                return new hpa(lsg.c(this.a));
            case 1:
                return new hny(((lry) this.a).b());
            case 2:
                Context b = ((lry) this.a).b();
                PackageManager packageManager = b.getPackageManager();
                String packageName = b.getPackageName();
                try {
                    return packageManager.getPackageInfo(packageName, 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionName", 89, "PrimesCoreMetricDaggerModule.java")).u("Failed to get PackageInfo for: %s", packageName);
                    return null;
                }
            case 3:
                return new hpk((jfk) this.a.a());
            case 4:
                if (Build.VERSION.SDK_INT >= 30) {
                    obj = new jms((hpg) this.a.a());
                } else {
                    obj = jmo.a;
                }
                obj.getClass();
                return obj;
            case 5:
                jer jerVar = (jer) ((lsi) this.a).b;
                if (jerVar.g()) {
                    looper = (Looper) jerVar.c();
                } else {
                    HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                }
                return new Handler(looper);
            case 6:
                return new hsc(this.a);
            case 7:
                jer jerVar2 = (jer) ((lsi) this.a).b;
                jdl jdlVar = jdl.a;
                return (hsh) jerVar2.e(new hsh(jdlVar, jdlVar));
            case 8:
                if (a.g()) {
                    obj2 = new jms((hpg) this.a.a());
                } else {
                    obj2 = jmo.a;
                }
                obj2.getClass();
                return obj2;
            case 9:
                return new htl((Random) this.a.a());
            case 10:
                return new hzw(((lry) this.a).b());
            case 11:
                return new iyu(((lry) this.a).b());
            case 12:
                kuv kuvVar = (kuv) this.a.a();
                kuvVar.getClass();
                return kuvVar;
            case 13:
                return new jck(((lry) this.a).b(), (byte[]) null);
            default:
                return new ktf(((kui) this.a).a());
        }
    }
}
