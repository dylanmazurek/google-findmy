package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izc {
    private static final Map n = new HashMap();
    public final Context a;
    public boolean f;
    public final Intent g;
    public ServiceConnection k;
    public IInterface l;
    public final jck m;
    public final List c = new ArrayList();
    public final Set d = new HashSet();
    public final Object e = new Object();
    public final IBinder.DeathRecipient i = new IBinder.DeathRecipient() { // from class: iyw
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            izc izcVar = izc.this;
            iyz iyzVar = (iyz) izcVar.h.get();
            if (iyzVar != null) {
                iyzVar.a();
            } else {
                Iterator it = izcVar.c.iterator();
                while (it.hasNext()) {
                    ((iyv) it.next()).b(izcVar.a());
                }
                izcVar.c.clear();
            }
            synchronized (izcVar.e) {
                izcVar.b();
            }
        }
    };
    public final AtomicInteger j = new AtomicInteger(0);
    public final String b = "AppUpdateService";
    public final WeakReference h = new WeakReference(null);

    public izc(Context context, jck jckVar, Intent intent) {
        this.a = context;
        this.m = jckVar;
        this.g = intent;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.b).concat(" : Binder has died."));
    }

    public final void b() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((bym) it.next()).t(a());
        }
        this.d.clear();
    }

    public final void c(iyv iyvVar) {
        Handler handler;
        Map map = n;
        synchronized (map) {
            if (!map.containsKey(this.b)) {
                HandlerThread handlerThread = new HandlerThread(this.b, 10);
                handlerThread.start();
                map.put(this.b, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.b);
        }
        handler.post(iyvVar);
    }

    public final void e(bym bymVar) {
        synchronized (this.e) {
            this.d.remove(bymVar);
        }
        c(new iyy(this));
    }
}
