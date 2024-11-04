package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.aqg;
import defpackage.bop;
import defpackage.bpd;
import defpackage.cff;
import defpackage.cqc;
import defpackage.csb;
import defpackage.cui;
import defpackage.cus;
import defpackage.cut;
import defpackage.cuu;
import defpackage.cuv;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends cff implements cus {
    public static final String a = cqc.a("SystemFgService");
    cut b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        cut cutVar = new cut(getApplicationContext());
        this.b = cutVar;
        if (cutVar.h != null) {
            cqc.b();
            Log.e(cut.a, "A callback already exists.");
        } else {
            cutVar.h = this;
        }
    }

    @Override // defpackage.cus
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.cus
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.cus
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            cuv.a(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            cuu.a(this, i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.cus
    public final void d() {
        this.d = true;
        cqc.b();
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }

    @Override // defpackage.cff, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.cff, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            cqc.b();
            this.b.c();
            e();
            this.d = false;
        }
        if (intent != null) {
            cut cutVar = this.b;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                cqc.b();
                Objects.toString(intent);
                intent.toString();
                cutVar.i.e(new cui(cutVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 2));
                cutVar.b(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                cutVar.b(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                cqc.b();
                Objects.toString(intent);
                intent.toString();
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    csb csbVar = cutVar.b;
                    UUID fromString = UUID.fromString(stringExtra);
                    fromString.getClass();
                    Object obj = csbVar.h.f;
                    ?? r0 = csbVar.i.a;
                    r0.getClass();
                    bpd.f((bop) obj, "CancelWorkById", r0, new aqg(csbVar, fromString, 9, null));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                cqc.b();
                cus cusVar = cutVar.h;
                if (cusVar != null) {
                    cusVar.d();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
