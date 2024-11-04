package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hiy implements jfe {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hiy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [mko, java.lang.Object] */
    @Override // defpackage.jfe
    public final Object a() {
        Object i;
        Application application = null;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                kpb kpbVar = new kpb((Context) obj, "STREAMZ_ONEGOOGLE_ANDROID");
                if (obj instanceof Application) {
                    application = (Application) obj;
                }
                return new hpd(this.a, kpbVar, application);
            case 1:
                Object obj2 = ((bso) this.b).a;
                lqd lqdVar = (lqd) this.a;
                return ((ddg) obj2).h(lqdVar).b(lqdVar);
            case 2:
                hjz hjzVar = (hjz) this.a;
                Context applicationContext = hjzVar.a.getApplicationContext();
                ExecutorService executorService = hjzVar.b;
                applicationContext.getClass();
                executorService.getClass();
                fxf fxfVar = new fxf((byte[]) null);
                fxfVar.a = 641;
                fma.aG(true, "Must provide valid client application ID!");
                fvd fvdVar = new fvd(fxfVar);
                return new hld(new hkx(applicationContext, new fhq(applicationContext, fve.a, fvdVar, fhp.a), new fva(applicationContext, fvdVar), new fhq(applicationContext, fve.a, fvdVar, fhp.a), new hju(applicationContext, executorService), executorService, fgp.a), 2, (hri) this.b, applicationContext.getPackageName(), 0);
            case 3:
                Object obj3 = this.b;
                synchronized (this.a) {
                    String b = hoa.b();
                    String str = b + ".trace";
                    File file = new File(((Context) obj3).getFilesDir(), a.ao(b, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "lambda$new$0", 117, "CpuProfilingService.java")).r("Could not create directory");
                        i = jdl.a;
                    } else {
                        File file2 = new File(file, str);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (RuntimeException e) {
                            ((jni) ((jni) ((jni) hmz.a.c()).i(e)).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).r("Exception when clearing trace file.");
                        }
                        i = jer.i(file2);
                    }
                }
                return i;
            case 4:
                return hqw.b(this.a, (Context) this.b);
            case 5:
                int i2 = htc.a;
                return ((hot) this.b).b(((hta) this.a.a()).a);
            case 6:
                return new hot((Context) ((hot) this.a).a, (Account) this.b);
            default:
                return ((jtf) ((kpb) this.b).b).k(((lim) this.a).A());
        }
    }

    public /* synthetic */ hiy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
