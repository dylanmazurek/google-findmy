package defpackage;

import com.google.android.gms.findmydevice.spot.StartFinderAdvertisingRequest;
import j$.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqv extends cgk {
    public final jzd c;
    public final cfo d;
    public final lqc e;
    public final kyh f;
    public jer h;
    public final Object i;
    public jer j;
    public final epl k;
    public final emx l;
    public final apc m;
    private final Executor o;
    private final cfm p;
    private final fos r;
    private static final jnk n = jnk.l("com/google/android/apps/adm/integrations/spot/nearby/ProximityUiViewModel");
    static final Duration a = Duration.ofSeconds(10);
    public static final Duration b = Duration.ofMinutes(1);
    private boolean q = false;
    public boolean g = false;

    /* JADX WARN: Type inference failed for: r0v7, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [mko, java.lang.Object] */
    public eqv(ewg ewgVar, ele eleVar, apc apcVar, apc apcVar2, fos fosVar, emx emxVar, cfz cfzVar, lqz lqzVar, jzd jzdVar) {
        jdl jdlVar = jdl.a;
        this.h = jdlVar;
        this.i = new Object();
        this.j = jdlVar;
        jer b2 = eyf.b(ewgVar.c(), eyf.h(cfzVar));
        hwx.U(b2.g());
        jer f = eku.f(cfzVar);
        hwx.U(f.g());
        this.e = (lqc) b2.c();
        kyh kyhVar = (kyh) f.c();
        this.f = kyhVar;
        kyf kyfVar = eleVar.a((lqc) b2.c()).b;
        kyfVar = kyfVar == null ? kyf.r : kyfVar;
        kyfVar.getClass();
        Object a2 = apcVar.b.a();
        ((fma) apcVar.a.a()).getClass();
        jzd jzdVar2 = (jzd) apcVar.c.a();
        jzdVar2.getClass();
        this.k = new epl(kyfVar, kyhVar, (kqr) a2, jzdVar2);
        this.m = apcVar2;
        this.r = fosVar;
        this.l = emxVar;
        Executor executor = (Executor) lqzVar.a();
        this.o = executor;
        this.c = jzdVar;
        this.d = new epy(this, 5);
        jdl jdlVar2 = jdl.a;
        this.p = new cfm(new equ(1, jdlVar2, jdlVar2, jdlVar2));
        executor.execute(new cui(this, emxVar, 18));
    }

    public final cfk a() {
        if (!this.q) {
            this.p.o(this.k.a(), new epy(this, 6));
            this.q = true;
        }
        return this.p;
    }

    public final /* synthetic */ void b() {
        lpt lptVar;
        try {
            ((jni) ((jni) n.e()).j("com/google/android/apps/adm/integrations/spot/nearby/ProximityUiViewModel", "lambda$startWearAdvertismentRefresh$3", 229, "ProximityUiViewModel.java")).r("Restarting Finder advertising");
            fos fosVar = this.r;
            StartFinderAdvertisingRequest startFinderAdvertisingRequest = new StartFinderAdvertisingRequest();
            lqc lqcVar = this.e;
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            lpz lpzVar = lptVar.u;
            if (lpzVar == null) {
                lpzVar = lpz.e;
            }
            kyf kyfVar = lpzVar.b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            kxv kxvVar = kyfVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            startFinderAdvertisingRequest.a = kxvVar.a;
            fma.q(fosVar.a(startFinderAdvertisingRequest), 7L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            e = e;
            ((jni) ((jni) ((jni) n.g()).i(e)).j("com/google/android/apps/adm/integrations/spot/nearby/ProximityUiViewModel", "lambda$startWearAdvertismentRefresh$3", (char) 246, "ProximityUiViewModel.java")).r("Failed to restart Finder advertising");
        } catch (TimeoutException e2) {
            e = e2;
            ((jni) ((jni) ((jni) n.g()).i(e)).j("com/google/android/apps/adm/integrations/spot/nearby/ProximityUiViewModel", "lambda$startWearAdvertismentRefresh$3", (char) 246, "ProximityUiViewModel.java")).r("Failed to restart Finder advertising");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jyz] */
    @Override // defpackage.cgk
    public final void c() {
        d();
        this.o.execute(new dzw(this, 20));
        if (this.h.g()) {
            this.h.c().cancel(false);
        }
        this.k.d();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [jzb, java.lang.Object] */
    public final void d() {
        synchronized (this.i) {
            if (this.j.g()) {
                this.j.c().cancel(false);
                this.j = jdl.a;
            }
        }
    }

    public final void e(epk epkVar, eis eisVar) {
        int i;
        if (((Boolean) ((ilv) this.m.a).f().b(new dyv(this.f, 11)).e(false)).booleanValue()) {
            i = 4;
        } else if (eisVar == eis.IN_RANGE) {
            i = 3;
        } else if (this.g) {
            i = 2;
        } else {
            i = 1;
        }
        cfm cfmVar = this.p;
        jer b2 = epkVar.b.b(new ene(8));
        jer jerVar = epkVar.c;
        if (jerVar != null) {
            jer jerVar2 = epkVar.d;
            if (jerVar2 != null) {
                cfmVar.l(new equ(i, b2, jerVar, jerVar2));
                return;
            }
            throw new NullPointerException("Null bearingRads");
        }
        throw new NullPointerException("Null rangeMeters");
    }
}
