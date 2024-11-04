package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqa extends hpy implements hpg, hnt, hnl {
    volatile hmq a;
    public final lqz b;
    public final mko d;
    public final mko e;
    public final ilv f;
    public final htm g;
    private final Executor i;
    private final hpd j;
    private final jer k;
    private final hnu l;
    private final hnq m;
    private final mko r;
    private final hot s;
    private final AtomicBoolean h = new AtomicBoolean();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public hqa(hpe hpeVar, Executor executor, lqz lqzVar, jer jerVar, hnu hnuVar, hnq hnqVar, hot hotVar, mko mkoVar, mko mkoVar2, mko mkoVar3, ilv ilvVar, htm htmVar) {
        this.b = lqzVar;
        this.k = jerVar;
        this.l = hnuVar;
        this.m = hnqVar;
        this.s = hotVar;
        this.j = hpeVar.a(jxv.a, lqzVar, null);
        this.i = executor;
        this.r = mkoVar;
        this.d = mkoVar2;
        this.e = mkoVar3;
        this.f = ilvVar;
        this.g = htmVar;
    }

    private final void p(int i, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        ivc.J(new hrs(this, atomicInteger, i, 1), this.i);
    }

    @Override // defpackage.hpg
    public final void Y() {
        if (this.k.g()) {
            ((hqf) ((mko) this.k.c()).a()).a();
        }
        this.l.a(this);
        this.m.a(this);
        p(3, this.n);
        ivc.J(new eli(this, 7), this.i);
    }

    @Override // defpackage.hnt
    public final void a(Activity activity, Bundle bundle) {
        ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 416, "CrashMetricServiceImpl.java")).r("onActivityCreated");
        if (!this.q.getAndSet(true)) {
            p(4, this.o);
        }
    }

    @Override // defpackage.hnt
    public final void d(Activity activity) {
        ivc.J(new eli(this, 8), this.i);
    }

    @Override // defpackage.hnt
    public final void f(Activity activity) {
        this.a = hmq.b(activity.getClass());
    }

    @Override // defpackage.hnl
    public final void i(hmq hmqVar) {
        this.a = null;
    }

    @Override // defpackage.hpy
    public final void k() {
        if (this.h.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new hpz(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:3|(1:5)(1:119)|6|(6:8|(3:10|(1:12)|13)(2:57|(3:59|(1:61)|62)(5:63|(2:65|(4:67|(1:69)|70|(3:72|(1:74)|75)(4:76|(4:78|(1:80)|81|(5:82|83|84|85|86))(0)|104|(3:106|(1:108)|109)(3:110|(1:112)|113))))|114|(1:116)|117))|14|(1:16)|17|(18:20|21|22|(1:24)(1:54)|25|(1:27)|28|30|(2:33|31)|34|35|(1:39)|40|(2:43|41)|44|(2:47|45)|48|(2:50|51)(1:53)))|118|21|22|(0)(0)|25|(0)|28|30|(1:31)|34|35|(2:37|39)|40|(1:41)|44|(1:45)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027d, code lost:            java.lang.Thread.currentThread().interrupt();     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021e A[Catch: all -> 0x027b, InterruptedException -> 0x027d, TryCatch #5 {InterruptedException -> 0x027d, all -> 0x027b, blocks: (B:22:0x0218, B:24:0x021e, B:25:0x0233, B:27:0x0248, B:28:0x024b, B:54:0x0229), top: B:21:0x0218 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0248 A[Catch: all -> 0x027b, InterruptedException -> 0x027d, TryCatch #5 {InterruptedException -> 0x027d, all -> 0x027b, blocks: (B:22:0x0218, B:24:0x021e, B:25:0x0233, B:27:0x0248, B:28:0x024b, B:54:0x0229), top: B:21:0x0218 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028c A[LOOP:0: B:31:0x0284->B:33:0x028c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c7 A[LOOP:1: B:41:0x02ae->B:43:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02be A[LOOP:2: B:45:0x02b6->B:47:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0229 A[Catch: all -> 0x027b, InterruptedException -> 0x027d, TryCatch #5 {InterruptedException -> 0x027d, all -> 0x027b, blocks: (B:22:0x0218, B:24:0x021e, B:25:0x0233, B:27:0x0248, B:28:0x024b, B:54:0x0229), top: B:21:0x0218 }] */
    /* JADX WARN: Type inference failed for: r0v39, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [jfe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.ner r25) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqa.l(ner):void");
    }

    public final boolean m() {
        return ((hpr) this.e.a()).a;
    }

    public final jyz n(int i, hpp hppVar) {
        return o(i, hppVar, hppVar.a / 100.0f);
    }

    public final jyz o(int i, hpp hppVar, float f) {
        if (!hppVar.b()) {
            return jyv.a;
        }
        hto b = this.s.b(f);
        if (b.b.nextFloat() < b.a) {
            hpd hpdVar = this.j;
            hoy a = hoz.a();
            ljh k = nfe.v.k();
            ljh k2 = nfc.d.k();
            float f2 = 1.0f / f;
            if (!k2.b.y()) {
                k2.t();
            }
            int i2 = (int) f2;
            ljn ljnVar = k2.b;
            nfc nfcVar = (nfc) ljnVar;
            nfcVar.a |= 2;
            nfcVar.c = i2;
            if (!ljnVar.y()) {
                k2.t();
            }
            nfc nfcVar2 = (nfc) k2.b;
            nfcVar2.b = i - 1;
            nfcVar2.a |= 1;
            if (!k.b.y()) {
                k.t();
            }
            nfe nfeVar = (nfe) k.b;
            nfc nfcVar3 = (nfc) k2.q();
            nfcVar3.getClass();
            nfeVar.r = nfcVar3;
            nfeVar.a |= 4194304;
            a.e((nfe) k.q());
            return hpdVar.b(a.a());
        }
        return jyv.a;
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.hnl
    public final /* synthetic */ void j(hmq hmqVar) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
