package defpackage;

import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.apps.adm.R;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ci implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public ci(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.d = i;
        this.a = intent;
        this.b = context;
        this.c = pendingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v19, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, cfo] */
    /* JADX WARN: Type inference failed for: r2v33, types: [cfc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [cfc, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        kyx kyxVar;
        fxs b;
        Bundle bundle = null;
        int i = 0;
        boolean z = true;
        boolean z2 = true;
        switch (this.d) {
            case 0:
                co.a(((co) this.c).r, (View) this.a, (View) this.b);
                return;
            case 1:
                int i2 = j.e;
                ((ViewGroup) this.a).endViewTransition((View) this.b);
                Object obj = this.c;
                ((k) obj).a.a.g((by) obj);
                return;
            case 2:
                co.a(((co) this.c).f, (View) this.a, (View) this.b);
                return;
            case 3:
                boolean z3 = ((AtomicBoolean) this.b).get();
                ?? r1 = this.a;
                Object obj2 = this.c;
                if (z3) {
                    return;
                }
                try {
                    r1.a();
                    ((bmf) obj2).c(null);
                    return;
                } catch (Throwable th) {
                    ((bmf) obj2).d(th);
                    return;
                }
            case 4:
                boolean z4 = ((AtomicBoolean) this.b).get();
                ?? r12 = this.a;
                Object obj3 = this.c;
                if (z4) {
                    return;
                }
                try {
                    ((bmf) obj3).c(r12.a());
                    return;
                } catch (Throwable th2) {
                    ((bmf) obj3).d(th2);
                    return;
                }
            case 5:
                Object obj4 = this.b;
                ?? r13 = this.a;
                Object obj5 = this.c;
                try {
                    z = ((Boolean) r13.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (((crd) obj5).i) {
                    cvk a = ((csl) obj4).a();
                    String str = a.a;
                    if (((crd) obj5).b(str) == obj4) {
                        ((crd) obj5).a(str);
                    }
                    cqc.b();
                    obj5.getClass().getSimpleName();
                    Iterator it = ((crd) obj5).h.iterator();
                    while (it.hasNext()) {
                        ((cqs) it.next()).a(a, z);
                    }
                }
                return;
            case 6:
                ((crd) ((elo) this.a).a).g((bet) this.b);
                return;
            case 7:
                try {
                    boolean booleanExtra = ((Intent) this.a).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) this.a).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) this.a).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) this.a).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    cqc.b();
                    int i3 = ConstraintProxyUpdateReceiver.a;
                    cxb.a((Context) this.b, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    cxb.a((Context) this.b, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    cxb.a((Context) this.b, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    cxb.a((Context) this.b, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) this.c).finish();
                }
            case 8:
                cvv B = ((WorkDatabase) this.c).B();
                Object obj6 = this.a;
                cin a2 = cin.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                a2.g(1, (String) obj6);
                cwn cwnVar = (cwn) B;
                cwnVar.a.l();
                Cursor c = bwp.c(cwnVar.a, a2);
                try {
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        arrayList.add(c.getString(0));
                    }
                    c.close();
                    a2.j();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        bpn.k((csb) this.b, (String) it2.next());
                    }
                    return;
                } catch (Throwable th3) {
                    c.close();
                    a2.j();
                    throw th3;
                }
            case 9:
                eje ejeVar = new eje(z2 ? 1 : 0);
                ejg ejgVar = (ejg) this.c;
                ilv ilvVar = ejgVar.n;
                lqd lqdVar = (lqd) this.a;
                ilvVar.q(lqdVar, ejeVar, 3);
                if (ejgVar.n.o(lqdVar)) {
                    lpy lpyVar = (lpy) this.b;
                    if (lpyVar.a == 3) {
                        kyxVar = (kyx) lpyVar.b;
                    } else {
                        kyxVar = kyx.b;
                    }
                    if (kyxVar.a.size() == 0) {
                        ejgVar.p.m(R.string.location_error_general);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                Object obj7 = this.b;
                boolean g = ((jer) obj7).g();
                Object obj8 = this.c;
                if (g) {
                    emk emkVar = (emk) obj8;
                    lqd lqdVar2 = (lqd) this.a;
                    if (emkVar.f.n(lqdVar2)) {
                        emkVar.f.q(lqdVar2, new emh(obj7, i), 1);
                    }
                }
                ((emk) obj8).e.c(lua.d());
                return;
            case 11:
                ((fck) this.b).y("AnalyticsJobService processed last dispatch request");
                ((fdu) ((gok) this.a).b).b((JobParameters) this.c);
                return;
            case 12:
                CloudMessage cloudMessage = (CloudMessage) this.b;
                if (TextUtils.isEmpty(cloudMessage.b())) {
                    b = fma.o(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("google.message_id", cloudMessage.b());
                    Integer a3 = cloudMessage.a();
                    if (a3 != null) {
                        bundle2.putInt("google.product_id", a3.intValue());
                    }
                    Object obj9 = this.c;
                    bundle2.putBoolean("supports_message_handled", true);
                    b = imr.d((Context) obj9).b(2, bundle2);
                }
                b.l(new pt(3), new fgb(this.a, i));
                return;
            case 13:
                mjp mjpVar = (mjp) this.b;
                if (mjpVar.b > 0) {
                    Object obj10 = this.c;
                    Object obj11 = mjpVar.c;
                    if (obj11 != null) {
                        bundle = ((Bundle) obj11).getBundle((String) this.a);
                    }
                    ((fjj) obj10).d(bundle);
                }
                if (((mjp) this.b).b >= 2) {
                    ((fjj) this.c).i();
                }
                if (((mjp) this.b).b >= 3) {
                    ((fix) this.c).k();
                }
                if (((mjp) this.b).b >= 4) {
                    ((fjj) this.c).j();
                    return;
                }
                return;
            case 14:
                int i4 = gad.a;
                if (((AtomicBoolean) this.a).compareAndSet(false, true)) {
                    ((Context) this.b).unregisterReceiver((BroadcastReceiver) this.c);
                    return;
                }
                return;
            case 15:
                ?? r0 = this.a;
                Object obj12 = this.c;
                Object obj13 = this.b;
                int i5 = 8;
                try {
                    ((PowerManager.WakeLock) obj12).acquire(300000L);
                    r0.run();
                    return;
                } finally {
                    try {
                        ((PowerManager.WakeLock) obj12).release();
                    } catch (RuntimeException e) {
                        String str2 = "com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiService";
                        String str3 = "lambda$processNextTask$1";
                        char c2 = 'e';
                        ((jol) ((jol) ((jol) GnpExecutorApiService.a.g()).i(e)).j(str2, str3, c2, "GnpExecutorApiService.java")).r("WakeLock releasing failed, probably due to timeout passing.");
                    }
                    ijs.e(new gcb(obj13, i5));
                }
            case 16:
                ((AccountParticleDisc) this.c).i.a(this.a, (ImageView) this.b);
                return;
            case 17:
                Object obj14 = this.c;
                nhc nhcVar = (nhc) this.b;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(nhcVar.f((Bitmap) obj14));
                Map map = gzm.a;
                Object obj15 = this.a;
                map.put(obj15, bitmapDrawable);
                gzm.b.remove(obj15);
                nhcVar.j(bitmapDrawable, true);
                return;
            case 18:
                ijs.c();
                hiz hizVar = ((hcp) this.a).a;
                ?? r14 = this.b;
                ((cfk) hizVar.b).g(this.c, r14);
                return;
            case 19:
                ((hcu) this.b).e.g(this.c, new euc(this.a, 12));
                return;
            default:
                ((hia) this.c).d((hig) this.b, this.a);
                return;
        }
    }

    public ci(co coVar, View view, View view2, int i) {
        this.d = i;
        this.c = coVar;
        this.a = view;
        this.b = view2;
    }

    public /* synthetic */ ci(hcp hcpVar, cfc cfcVar, cfo cfoVar, int i) {
        this.d = i;
        this.a = hcpVar;
        this.c = cfcVar;
        this.b = cfoVar;
    }

    public /* synthetic */ ci(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ci(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ci(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ci(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public ci(mjp mjpVar, fjj fjjVar, int i) {
        this.d = i;
        this.c = fjjVar;
        this.a = "ConnectionlessLifecycleHelper";
        this.b = mjpVar;
    }
}
