package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cff extends Service implements cfc {
    private final ksr a = new ksr((cfc) this);

    @Override // defpackage.cfc
    public final cex N() {
        return (cex) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.m(cev.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.m(cev.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ksr ksrVar = this.a;
        ksrVar.m(cev.ON_STOP);
        ksrVar.m(cev.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @mkp
    public final void onStart(Intent intent, int i) {
        this.a.m(cev.ON_START);
        super.onStart(intent, i);
    }
}
