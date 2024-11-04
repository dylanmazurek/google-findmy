package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import defpackage.cff;
import defpackage.cqc;
import defpackage.csx;
import defpackage.csy;
import defpackage.cxf;
import defpackage.cxg;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends cff implements csx {
    private csy a;
    private boolean b;

    static {
        cqc.a("SystemAlarmService");
    }

    private final void b() {
        csy csyVar = new csy(this);
        this.a = csyVar;
        if (csyVar.i != null) {
            cqc.b();
            Log.e(csy.a, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            csyVar.i = this;
        }
    }

    @Override // defpackage.csx
    public final void a() {
        this.b = true;
        cqc.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (cxg.a) {
            linkedHashMap.putAll(cxg.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                cqc.b();
                Log.w(cxf.a, "WakeLock held for ".concat(String.valueOf(str)));
            }
        }
        stopSelf();
    }

    @Override // defpackage.cff, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.b = false;
    }

    @Override // defpackage.cff, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            cqc.b();
            this.a.b();
            b();
            this.b = false;
        }
        if (intent != null) {
            this.a.d(intent, i2);
            return 3;
        }
        return 3;
    }
}
