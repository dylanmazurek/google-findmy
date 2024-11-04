package com.google.android.apps.adm.integrations.spot.ringing;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.apps.adm.R;
import defpackage.bpm;
import defpackage.bqn;
import defpackage.bqo;
import defpackage.esg;
import defpackage.esh;
import defpackage.esi;
import defpackage.esj;
import defpackage.esl;
import defpackage.esm;
import defpackage.fma;
import defpackage.hwx;
import defpackage.hzq;
import defpackage.ibl;
import defpackage.ifi;
import defpackage.ifj;
import defpackage.ifo;
import defpackage.jdl;
import defpackage.jer;
import defpackage.jgo;
import defpackage.jis;
import defpackage.jni;
import defpackage.jnk;
import defpackage.jzd;
import defpackage.ktn;
import defpackage.kuv;
import defpackage.kxv;
import defpackage.kyf;
import defpackage.kyh;
import defpackage.kyl;
import defpackage.kzl;
import j$.time.Duration;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RingerService extends esg implements esm {
    private static final jnk g = jnk.l("com/google/android/apps/adm/integrations/spot/ringing/RingerService");
    private static final esl h = new esj();
    public Context d;
    public ktn f;
    private final esi i = new esi(this);
    public jer e = jdl.a;

    /* JADX WARN: Type inference failed for: r1v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [mko, java.lang.Object] */
    private final esh f(kyf kyfVar, ibl iblVar, kzl kzlVar, kyh kyhVar, Duration duration, ifi ifiVar) {
        String g2 = g(kyfVar);
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        esh eshVar = new esh(this, g2, kylVar.d, kyhVar);
        ktn ktnVar = this.f;
        long seconds = duration.getSeconds();
        jzd jzdVar = (jzd) ktnVar.b.a();
        jzdVar.getClass();
        Object a = ktnVar.c.a();
        Object a2 = ktnVar.a.a();
        ((fma) ktnVar.d.a()).getClass();
        kyfVar.getClass();
        eshVar.d = new ifo(jzdVar, (kuv) a, (kuv) a2, kyfVar, iblVar, seconds, kzlVar, kyhVar, eshVar);
        eshVar.c(jer.i(ifiVar));
        return eshVar;
    }

    private static String g(kyf kyfVar) {
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        return kxvVar.a;
    }

    private final void h() {
        ifj b;
        synchronized (this.a) {
            if (this.e.g() && ((b = ((esh) this.e.c()).b()) == ifj.STARTING || b == ifj.RINGING)) {
                ((esh) this.e.c()).d();
            }
        }
    }

    @Override // defpackage.eiq
    protected final Notification a() {
        PendingIntent pendingIntent;
        Notification b;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("spot-findmydevice-ringing", this.d.getString(R.string.spot_ringing_channel_name), 2);
            notificationChannel.setDescription(this.d.getString(R.string.spot_ringing_channel_description));
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent(this, (Class<?>) RingerService.class);
        intent.setAction("com.google.android.apps.adm.STOP_RINGING");
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, hzq.a(intent, 67108864), 67108864);
        Intent launchIntentForPackage = this.d.getPackageManager().getLaunchIntentForPackage(this.d.getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(this, 0, hzq.a(launchIntentForPackage, 201326592), 201326592);
        } else {
            ((jni) ((jni) g.g()).j("com/google/android/apps/adm/integrations/spot/ringing/RingerService", "createNotification", 212, "RingerService.java")).r("Open FMD intent is unexpectedly null.");
            pendingIntent = null;
        }
        synchronized (this.a) {
            hwx.U(this.e.g());
            bpm bpmVar = new bpm(this, "spot-findmydevice-ringing");
            bpmVar.i(getString(R.string.spot_ringing_notification_title, new Object[]{((esh) this.e.c()).b}));
            bpmVar.m(R.drawable.ic_notification_fmd);
            bpmVar.g = pendingIntent;
            bpmVar.f(0, getString(R.string.stop_ring), service);
            b = bpmVar.b();
        }
        return b;
    }

    @Override // defpackage.eiq
    protected final jis b() {
        return jis.q(16);
    }

    @Override // defpackage.eiq
    protected final boolean c() {
        boolean g2;
        synchronized (this.a) {
            g2 = this.e.g();
        }
        return g2;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ifi] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, ifi] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, esl] */
    @Override // defpackage.esm
    public final esl d(String str, kyh kyhVar, jer jerVar) {
        synchronized (this.a) {
            long j = 0;
            if (this.e.g() && ((esh) this.e.c()).f(str, kyhVar)) {
                ?? c = this.e.c();
                if (jerVar.g()) {
                    ifj b = ((esh) c).b();
                    if (b == ifj.RINGING) {
                        synchronized (((esh) c).h.a) {
                            j = Math.max(0L, ((esh) c).f - SystemClock.elapsedRealtime());
                        }
                    }
                    jerVar.c().a(b, j, jdl.a);
                    ((esh) c).c(jerVar);
                }
                return c;
            }
            if (jerVar.g()) {
                jerVar.c().a(ifj.STOPPED, 0L, jdl.a);
            }
            return h;
        }
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, esl] */
    @Override // defpackage.esm
    public final esl e(kyf kyfVar, ibl iblVar, kzl kzlVar, kyh kyhVar, Duration duration, ifi ifiVar) {
        boolean z;
        ?? c;
        synchronized (this.a) {
            if (!this.b) {
                this.b = true;
                startService(new Intent(this, getClass()));
            }
        }
        synchronized (this.a) {
            if (this.e.g()) {
                Object c2 = this.e.c();
                if (((esh) c2).f(g(kyfVar), kyhVar)) {
                    ((esh) c2).c(jer.i(ifiVar));
                } else {
                    h();
                    this.e = jer.i(f(kyfVar, iblVar, kzlVar, kyhVar, duration, ifiVar));
                }
            } else {
                this.e = jer.i(f(kyfVar, iblVar, kzlVar, kyhVar, duration, ifiVar));
            }
            Object c3 = this.e.c();
            synchronized (((esh) c3).h.a) {
                if (((esh) c3).d != null) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.U(z);
                ((ifo) ((esh) c3).d).e(true);
            }
            c = this.e.c();
        }
        return c;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.i;
    }

    @Override // defpackage.eiq, android.app.Service
    public final void onDestroy() {
        synchronized (this.a) {
            h();
            if (this.e.g()) {
                ((esh) this.e.c()).c(jdl.a);
                this.e = jdl.a;
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && "com.google.android.apps.adm.STOP_RINGING".equals(intent.getAction())) {
            h();
            return 1;
        }
        return 1;
    }

    @Override // defpackage.eiq, android.app.Service
    public final boolean onUnbind(Intent intent) {
        synchronized (this.a) {
            if (this.e.g()) {
                ((esh) this.e.c()).c(jdl.a);
            }
        }
        int i = 1;
        if (c()) {
            synchronized (this.a) {
                hwx.U(this.b);
                jis b = b();
                hwx.V(!b.isEmpty(), "A foreground service must specify at least one foreground service type.");
                if (!this.c) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        Notification a = a();
                        int intValue = ((Integer) Collection.EL.stream(b).reduce(0, new jgo(i))).intValue();
                        if (Build.VERSION.SDK_INT >= 34) {
                            bqo.a(this, 1, a, intValue);
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            bqn.a(this, 1, a, intValue);
                        } else {
                            startForeground(1, a);
                        }
                    } else {
                        startForeground(1, a());
                    }
                    this.c = true;
                }
            }
        }
        return true;
    }
}
