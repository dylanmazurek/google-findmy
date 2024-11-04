package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoi extends hog implements hnt, hnl, hpg {
    final AtomicBoolean a = new AtomicBoolean();
    private final Context b;
    private final hnu c;
    private final Executor d;
    private final hot e;
    private final mko f;
    private final hpd g;
    private final AtomicBoolean h;
    private final hnq i;

    /* JADX WARN: Multi-variable type inference failed */
    public hoi(hpe hpeVar, Context context, hnu hnuVar, hnq hnqVar, jzd jzdVar, lqz lqzVar, hot hotVar, mko mkoVar, mko mkoVar2, Executor executor) {
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = hnqVar;
        this.g = hpeVar.a(executor, lqzVar, mkoVar2);
        this.b = context;
        this.c = hnuVar;
        this.d = Build.VERSION.SDK_INT < 31 ? executor : jzdVar;
        this.e = hotVar;
        this.f = mkoVar;
    }

    private final jyz Z(final ndf ndfVar) {
        return ivc.J(new jxc() { // from class: hoh
            @Override // defpackage.jxc
            public final jyz a() {
                return hoi.this.V(ndfVar, null);
            }
        }, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0388, code lost:            if ((r6 / r12) <= 3.472222222222222E-5d) goto L171;     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0099 A[Catch: all -> 0x0692, TryCatch #0 {, blocks: (B:9:0x0014, B:14:0x004d, B:17:0x0051, B:21:0x0057, B:22:0x0092, B:25:0x0120, B:234:0x0099, B:236:0x009f, B:238:0x00a7, B:240:0x00ac, B:242:0x00b2, B:243:0x00b4, B:245:0x00bb, B:246:0x00c4, B:248:0x00ca, B:249:0x00d3, B:251:0x00d9, B:252:0x00e2, B:254:0x00e8, B:255:0x00f1, B:257:0x00f7, B:258:0x00fc, B:260:0x0100, B:262:0x0104, B:264:0x010b, B:266:0x0111, B:267:0x011c, B:279:0x0062, B:280:0x0076, B:282:0x0036), top: B:8:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Type inference failed for: r0v32, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [mko, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ defpackage.jyz V(defpackage.ndf r19, defpackage.hmq r20) {
        /*
            Method dump skipped, instructions count: 1685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoi.V(ndf, hmq):jyz");
    }

    public jyz W() {
        if (!gad.d(this.b)) {
            return jyv.a;
        }
        try {
            hwx.U(this.a.getAndSet(false));
            return Z(ndf.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return ivc.D(e);
        }
    }

    public jyz X() {
        if (!gad.d(this.b)) {
            return jyv.a;
        }
        if (this.a.getAndSet(true)) {
            ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 141, "BatteryMetricServiceImpl.java")).r("App is already in the foreground.");
            return ivc.C();
        }
        return Z(ndf.BACKGROUND_TO_FOREGROUND);
    }

    @Override // defpackage.hpg
    public void Y() {
        this.i.a(this);
        this.c.a(this);
    }

    @Override // defpackage.hnt
    public void a(Activity activity, Bundle bundle) {
        if (!this.h.getAndSet(true)) {
            j(null);
        }
    }

    @Override // defpackage.hnl
    public void i(hmq hmqVar) {
        W();
    }

    @Override // defpackage.hnl
    public void j(hmq hmqVar) {
        if (!this.a.get()) {
            X();
        }
    }

    @Override // defpackage.hnt
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
