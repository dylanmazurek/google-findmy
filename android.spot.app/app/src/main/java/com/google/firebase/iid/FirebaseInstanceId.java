package com.google.firebase.iid;

import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.amr;
import defpackage.fgb;
import defpackage.fgk;
import defpackage.fma;
import defpackage.fmd;
import defpackage.fxi;
import defpackage.fxs;
import defpackage.fxv;
import defpackage.knh;
import defpackage.kpb;
import defpackage.kqr;
import defpackage.kqs;
import defpackage.kqv;
import defpackage.kqx;
import defpackage.kqz;
import defpackage.krd;
import defpackage.ktd;
import defpackage.kuv;
import defpackage.pt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceId {
    static ScheduledExecutorService a;
    public static kpb g;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern j = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor b;
    public final knh c;
    public final kqs d;
    public final kqr e;
    public final kuv h;
    private final krd k;
    private boolean l = false;
    public final List f = new ArrayList();

    public FirebaseInstanceId(knh knhVar, kqs kqsVar, Executor executor, Executor executor2, kqz kqzVar, kqz kqzVar2, krd krdVar) {
        if (amr.n(knhVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (g == null) {
                    g = new kpb(knhVar.a());
                }
            }
            this.c = knhVar;
            this.d = kqsVar;
            this.e = new kqr(knhVar, kqsVar, new fgk(knhVar.a()), kqzVar, kqzVar2, krdVar);
            this.b = executor2;
            this.h = new kuv(executor, (byte[]) null);
            this.k = krdVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static FirebaseInstanceId getInstance(knh knhVar) {
        j(knhVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) knhVar.e(FirebaseInstanceId.class);
        fma.aS(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static String i(String str) {
        if (!str.isEmpty() && !str.equalsIgnoreCase("fcm") && !str.equalsIgnoreCase("gcm")) {
            return str;
        }
        return "*";
    }

    public static void j(knh knhVar) {
        fma.aQ(knhVar.d().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        fma.aQ(knhVar.d().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        fma.aQ(knhVar.d().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        fma.aG(knhVar.d().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fma.aG(j.matcher(knhVar.d().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static final void p(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (a == null) {
                a = new ScheduledThreadPoolExecutor(1, new fmd("FirebaseInstanceId"));
            }
            a.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final fxs a(final String str, String str2) {
        final String i2 = i(str2);
        return fma.o(null).b(this.b, new fxi() { // from class: kqo
            @Override // defpackage.fxi
            public final Object a(fxs fxsVar) {
                FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.this;
                String e = firebaseInstanceId.e();
                String str3 = str;
                String str4 = i2;
                kqv c = firebaseInstanceId.c(str3, str4);
                if (!firebaseInstanceId.o(c)) {
                    return fma.o(new ktd(c.b));
                }
                return firebaseInstanceId.h.m(str3, str4, new kqp(firebaseInstanceId, e, str3, str4, c));
            }
        });
    }

    public final kqv b() {
        return c(amr.n(this.c), "*");
    }

    public final kqv c(String str, String str2) {
        return g.c(f(), str, str2);
    }

    public final Object d(fxs fxsVar) {
        try {
            return fma.q(fxsVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    k();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final String e() {
        try {
            g.i(this.c.g());
            fxs a2 = this.k.a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a2.l(new pt(6), new fgb(countDownLatch, 4));
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (a2.i()) {
                return (String) a2.e();
            }
            if (!((fxv) a2).c) {
                if (a2.h()) {
                    throw new IllegalStateException(a2.d());
                }
                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
            }
            throw new CancellationException("Task is already canceled");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String f() {
        if ("[DEFAULT]".equals(this.c.f())) {
            return "";
        }
        return this.c.g();
    }

    @Deprecated
    public final String g() {
        j(this.c);
        kqv b = b();
        if (o(b)) {
            m();
        }
        long j2 = kqv.a;
        if (b == null) {
            return null;
        }
        return b.b;
    }

    @Deprecated
    public final String h(String str, String str2) {
        j(this.c);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return (String) ((ktd) d(a(str, str2))).a;
        }
        throw new IOException("MAIN_THREAD");
    }

    final synchronized void k() {
        g.d();
    }

    public final synchronized void l(boolean z) {
        this.l = z;
    }

    final synchronized void m() {
        if (!this.l) {
            n(0L);
        }
    }

    public final synchronized void n(long j2) {
        p(new kqx(this, Math.min(Math.max(30L, j2 + j2), i)), j2);
        this.l = true;
    }

    public final boolean o(kqv kqvVar) {
        if (kqvVar != null) {
            kqs kqsVar = this.d;
            long j2 = kqvVar.d;
            String c = kqsVar.c();
            if (System.currentTimeMillis() <= j2 + kqv.a && c.equals(kqvVar.c)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
