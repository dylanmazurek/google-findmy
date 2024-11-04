package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.amr;
import defpackage.der;
import defpackage.faf;
import defpackage.fgk;
import defpackage.fma;
import defpackage.fmd;
import defpackage.fxs;
import defpackage.jxe;
import defpackage.knh;
import defpackage.kqf;
import defpackage.kqy;
import defpackage.kqz;
import defpackage.krd;
import defpackage.ksb;
import defpackage.ksc;
import defpackage.kse;
import defpackage.ksf;
import defpackage.ksg;
import defpackage.ksh;
import defpackage.ksj;
import defpackage.ksn;
import defpackage.ksp;
import defpackage.kss;
import defpackage.ktd;
import defpackage.kuv;
import defpackage.njz;
import defpackage.pt;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    static faf a;
    static ScheduledExecutorService b;
    private static final long j = TimeUnit.HOURS.toSeconds(8);
    private static ktd o;
    public final knh c;
    public final kqy d;
    public final Context e;
    public final ksh f;
    public final Executor g;
    public final Executor h;
    public final ksj i;
    private final ksg k;
    private final fxs l;
    private boolean m;
    private final Application.ActivityLifecycleCallbacks n;
    private final kuv p;

    public FirebaseMessaging(knh knhVar, kqy kqyVar, kqz kqzVar, kqz kqzVar2, krd krdVar, faf fafVar, kqf kqfVar) {
        ksj ksjVar = new ksj(knhVar.a());
        ksh kshVar = new ksh(knhVar, ksjVar, new fgk(knhVar.a()), kqzVar, kqzVar2, krdVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new fmd("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new fmd("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new fmd("Firebase-Messaging-File-Io"));
        int i = 0;
        this.m = false;
        a = fafVar;
        this.c = knhVar;
        this.d = kqyVar;
        this.k = new ksg(this, kqfVar);
        Context a2 = knhVar.a();
        this.e = a2;
        ksc kscVar = new ksc();
        this.n = kscVar;
        this.i = ksjVar;
        this.f = kshVar;
        this.p = new kuv(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        Context a3 = knhVar.a();
        if (a3 instanceof Application) {
            ((Application) a3).registerActivityLifecycleCallbacks(kscVar);
        } else {
            Log.w("FirebaseMessaging", der.c(a3, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (kqyVar != null) {
            kqyVar.c(new njz(this));
        }
        scheduledThreadPoolExecutor.execute(new jxe(this, 8));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new fmd("Firebase-Messaging-Topics-Io"));
        fxs l = fma.l(scheduledThreadPoolExecutor2, new kss(a2, scheduledThreadPoolExecutor2, this, ksjVar, kshVar, 0));
        this.l = l;
        l.o(scheduledThreadPoolExecutor, new kse(this, i));
        scheduledThreadPoolExecutor.execute(new jxe(this, 9));
    }

    public static synchronized FirebaseMessaging a() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(knh.b());
        }
        return firebaseMessaging;
    }

    static synchronized FirebaseMessaging getInstance(knh knhVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) knhVar.e(FirebaseMessaging.class);
            fma.aS(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static final void k(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new fmd("TAG"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public static synchronized ktd l(Context context) {
        ktd ktdVar;
        synchronized (FirebaseMessaging.class) {
            if (o == null) {
                o = new ktd(context);
            }
            ktdVar = o;
        }
        return ktdVar;
    }

    private final synchronized void m() {
        if (!this.m) {
            h(0L);
        }
    }

    final ksn b() {
        return l(this.e).a(d(), amr.n(this.c));
    }

    public final String c() {
        kqy kqyVar = this.d;
        if (kqyVar != null) {
            try {
                return (String) fma.p(kqyVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        ksn b2 = b();
        if (!j(b2)) {
            return b2.b;
        }
        knh knhVar = this.c;
        kuv kuvVar = this.p;
        String n = amr.n(knhVar);
        try {
            return (String) fma.p(kuvVar.k(n, new ksf(this, n, b2)));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final String d() {
        if ("[DEFAULT]".equals(this.c.f())) {
            return "";
        }
        return this.c.g();
    }

    public final void e(String str) {
        if ("[DEFAULT]".equals(this.c.f())) {
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            ksb.b(intent, this.e, new pt(8));
        }
    }

    public final synchronized void f(boolean z) {
        this.m = z;
    }

    public final void g() {
        kqy kqyVar = this.d;
        if (kqyVar != null) {
            kqyVar.b();
        } else if (j(b())) {
            m();
        }
    }

    public final synchronized void h(long j2) {
        k(new ksp(this, Math.min(Math.max(30L, j2 + j2), j)), j2);
        this.m = true;
    }

    public final boolean i() {
        return this.k.b();
    }

    final boolean j(ksn ksnVar) {
        if (ksnVar != null) {
            ksj ksjVar = this.i;
            long j2 = ksnVar.d;
            String c = ksjVar.c();
            if (System.currentTimeMillis() <= j2 + ksn.a && c.equals(ksnVar.c)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
