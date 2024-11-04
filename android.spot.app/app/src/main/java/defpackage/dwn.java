package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwn {
    public static final jnk a = jnk.l("com/google/android/apps/adm/app/SpotChangesHandler");
    public final ewc b;
    public final eim c;
    public final Executor d;
    public final Context e;
    public final AtomicReference f = new AtomicReference(jdl.a);
    public final ksr g;

    public dwn(ewc ewcVar, eim eimVar, ksr ksrVar, Executor executor, Context context) {
        this.b = ewcVar;
        this.c = eimVar;
        this.g = ksrVar;
        this.d = executor;
        this.e = context;
    }

    public final void a(BroadcastReceiver broadcastReceiver, String str, String str2) {
        ((jni) ((jni) a.c()).j("com/google/android/apps/adm/app/SpotChangesHandler", "registerReceiver", 139, "SpotChangesHandler.java")).u("Registering broadcast receiver for: %s", str);
        bqx.i(this.e, broadcastReceiver, new IntentFilter(str), str2, 2);
    }
}
