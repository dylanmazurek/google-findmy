package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgk {
    public static final Executor a = new pt(4);
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static PendingIntent i;
    public final Context d;
    public Messenger e;
    public CloudMessagingMessengerCompat f;
    public final ixa g;
    private final ScheduledExecutorService j;
    public final ta c = new ta();
    private final Messenger k = new Messenger(new fgj(this, Looper.getMainLooper()));

    public fgk(Context context) {
        this.d = context;
        this.g = new ixa(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    private static synchronized String e() {
        String num;
        synchronized (fgk.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private static synchronized void f(Context context, Intent intent) {
        synchronized (fgk.class) {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = fqs.a(context, intent2, fqs.a);
            }
            intent.putExtra("app", i);
        }
    }

    public final fxs a(Bundle bundle) {
        String e = e();
        bym bymVar = new bym((int[]) null);
        synchronized (this.c) {
            this.c.put(e, bymVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.g.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", a.ag(e, "|ID|", "|"));
        intent.putExtra("google.messenger", this.k);
        if (this.e != null || this.f != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.e;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f.b(obtain);
                }
            } catch (RemoteException unused) {
            }
            ScheduledFuture<?> schedule = this.j.schedule(new eta(bymVar, 12), 30L, TimeUnit.SECONDS);
            ((fxs) bymVar.a).l(a, new fxw(this, e, schedule, 1));
            return (fxs) bymVar.a;
        }
        if (this.g.b() == 2) {
            this.d.sendBroadcast(intent);
        } else {
            this.d.startService(intent);
        }
        ScheduledFuture<?> schedule2 = this.j.schedule(new eta(bymVar, 12), 30L, TimeUnit.SECONDS);
        ((fxs) bymVar.a).l(a, new fxw(this, e, schedule2, 1));
        return (fxs) bymVar.a;
    }

    public final fxs b(Bundle bundle) {
        int i2 = 1;
        if (this.g.a() < 12000000) {
            if (this.g.b() != 0) {
                return a(bundle).b(a, new kqu(this, bundle, 1));
            }
            return fma.n(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        imr d = imr.d(this.d);
        return d.c(new fgi(d.a(), bundle)).a(a, new fqx(i2));
    }

    public final void c(String str, Bundle bundle) {
        synchronized (this.c) {
            bym bymVar = (bym) this.c.remove(str);
            if (bymVar == null) {
                Log.w("Rpc", a.ao(str, "Missing callback for "));
            } else {
                bymVar.s(bundle);
            }
        }
    }
}
