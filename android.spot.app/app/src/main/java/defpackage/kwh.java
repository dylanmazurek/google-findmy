package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwh implements kvm {
    private static final joo a = joo.m("xRPC");
    private mbf b;
    private long c;
    private kwd d;

    @Override // defpackage.kvm
    public final /* synthetic */ kvy a() {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy b() {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final void e(ktf ktfVar) {
        boolean z;
        boolean z2;
        try {
            if (((mca) ktfVar.b).f()) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
                boolean z3 = true;
                if (this.b.equals(mbf.UNARY)) {
                    if (elapsedRealtime <= 2147483647L) {
                        kwd kwdVar = this.d;
                        int i = (int) elapsedRealtime;
                        if (i >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hwx.K(z2, "Cannot record negative latency.");
                        if (kwdVar.i.getAndSet(i) != -1) {
                            z3 = false;
                        }
                        hwx.V(z3, "Already recorded latency.");
                    } else {
                        ((jol) ((jol) a.f()).j("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 52, "NetworkLatencyInterceptor.java")).r("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                    }
                } else {
                    kwd kwdVar2 = this.d;
                    if (elapsedRealtime >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hwx.K(z, "Cannot record negative stream duration.");
                    if (kwdVar2.l.getAndSet(elapsedRealtime) != -1) {
                        z3 = false;
                    }
                    hwx.V(z3, "Already recorded stream duration.");
                }
            }
            this.d.f.incrementAndGet();
        } catch (Throwable th) {
            ((jol) ((jol) ((jol) a.f()).i(th)).j("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", '>', "NetworkLatencyInterceptor.java")).r("Failed to record network latency");
        }
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy f(nqe nqeVar) {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final kvy g(nqe nqeVar) {
        this.b = ((mbg) nqeVar.b).a;
        kwd kwdVar = (kwd) ((lys) nqeVar.d).e(kwd.b);
        kwdVar.getClass();
        this.d = kwdVar;
        fma fmaVar = ((ktl) ((lys) nqeVar.d).e(ktm.a)).o;
        this.c = SystemClock.elapsedRealtime();
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void d() {
    }
}
