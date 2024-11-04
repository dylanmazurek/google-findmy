package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gou extends BroadcastReceiver {
    public static final joo a = joo.m("GnpSdk");
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public abstract gov a(Context context);

    public abstract boolean b();

    public abstract void c(Context context);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        long j;
        long startElapsedRealtime;
        context.getClass();
        if (intent == null) {
            ((jol) ((jol) a.f()).i(new IllegalArgumentException())).r("Null Intent received.");
            return;
        }
        if (intent.hasExtra("fms") && amr.i(intent.getStringExtra("fms"), "1")) {
            ((jol) a.e()).r("Chime payload will be processed by Firebase service, returning.");
            return;
        }
        final long micros = TimeUnit.MILLISECONDS.toMicros(fma.i().toEpochMilli());
        hwx.J(true);
        if ((intent.getFlags() & 268435456) > 0) {
            j = 8500;
        } else {
            j = 58500;
        }
        gnd b2 = gnd.b(j);
        joo jooVar = a;
        ((jol) jooVar.e()).y("Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        try {
            gqq a2 = gqp.a(context);
            a2.getClass();
            a2.g().a(context);
            ((jol) jooVar.e()).r("Phenotype initialized.");
            a2.n();
            gnk gnkVar = new gnk(0);
            try {
                if (b()) {
                    if (!a2.e().h) {
                        c(context);
                    } else {
                        ((jol) jooVar.e()).r("BroadcastReceiver disabled by host app in GnpConfig");
                        mjo.r(gnkVar, null);
                        return;
                    }
                }
                final gov a3 = a(context);
                if (!a3.c(intent)) {
                    ((jol) jooVar.e()).u("Validation failed for action [%s].", intent.getAction());
                } else {
                    ((jol) jooVar.e()).u("Validation OK for action [%s].", intent.getAction());
                    gpx f = a2.f();
                    if (!frx.aK(context)) {
                        f.d(new Runnable() { // from class: gos
                            @Override // java.lang.Runnable
                            public final void run() {
                                jol jolVar = (jol) gou.a.e();
                                gov govVar = a3;
                                Intent intent2 = intent;
                                jolVar.u("Executing action in Service [%s].", intent2.getAction());
                                fzo.w(govVar, intent2, gnd.c(), micros);
                            }
                        });
                    } else {
                        mpn mpnVar = new mpn();
                        mpnVar.a = b2;
                        if (b.compareAndSet(false, true)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            startElapsedRealtime = Process.getStartElapsedRealtime();
                            long j2 = elapsedRealtime - startElapsedRealtime;
                            if (j2 <= luu.a.a().a()) {
                                mpnVar.a = b2.d(j2);
                            }
                        }
                        f.c(goAsync(), isOrderedBroadcast(), new got(intent, a3, mpnVar, micros, 0), (gnd) mpnVar.a);
                    }
                }
                mjo.r(gnkVar, null);
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
            } finally {
            }
        } catch (RuntimeException e) {
            ((jol) ((jol) a.g()).i(e)).r("BroadcastReceiver stopped");
        }
    }
}
