package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esk implements ServiceConnection {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/ringing/RingerServiceConnection");
    public buc d;
    public final elo f;
    public final Object b = new Object();
    public jer c = jdl.a;
    public boolean e = false;

    public esk(buc bucVar, elo eloVar) {
        this.d = bucVar;
        this.f = eloVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        esi esiVar = (esi) iBinder;
        synchronized (this.b) {
            if (!this.e) {
                return;
            }
            jer i = jer.i(esiVar.a);
            this.c = i;
            this.d.a(i.c());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/spot/ringing/RingerServiceConnection", "onServiceDisconnected", 89, "RingerServiceConnection.java")).r("Unexpected onServiceDisconnected call for Ringer service.");
    }
}
