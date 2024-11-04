package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class col implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public col(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, drk] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, muf] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                cop copVar = (cop) this.a;
                copVar.h = false;
                copVar.s();
                return;
            case 1:
                ((ViewPager) this.a).j(0);
                ((ViewPager) this.a).e();
                return;
            case 2:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 3:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.s(null);
                    return;
                }
                return;
            case 4:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 5:
                csu csuVar = (csu) this.a;
                if (csuVar.e < 2) {
                    csuVar.e = 2;
                    cqc.b();
                    Context context = csuVar.a;
                    cvk cvkVar = csuVar.c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    csr.f(intent, cvkVar);
                    csuVar.g.execute(new csw(csuVar.d, intent, csuVar.b));
                    if (csuVar.d.d.e(csuVar.c.a)) {
                        cqc.b();
                        Context context2 = csuVar.a;
                        cvk cvkVar2 = csuVar.c;
                        csuVar.g.execute(new csw(csuVar.d, csr.d(context2, cvkVar2), csuVar.b));
                        return;
                    }
                    cqc.b();
                    return;
                }
                cqc.b();
                return;
            case 6:
                Object obj = this.a;
                csu csuVar2 = (csu) obj;
                if (csuVar2.e == 0) {
                    csuVar2.e = 1;
                    cqc.b();
                    cvk cvkVar3 = csuVar2.c;
                    Objects.toString(cvkVar3);
                    cvkVar3.toString();
                    csy csyVar = csuVar2.d;
                    if (csyVar.d.g(csuVar2.m)) {
                        csy csyVar2 = csuVar2.d;
                        cvk cvkVar4 = csuVar2.c;
                        cxm cxmVar = csyVar2.c;
                        synchronized (cxmVar.c) {
                            cqc.b();
                            Objects.toString(cvkVar4);
                            cxmVar.a(cvkVar4);
                            cri criVar = new cri(cxmVar, cvkVar4, 3, null);
                            cxmVar.a.put(cvkVar4, criVar);
                            cxmVar.b.put(cvkVar4, obj);
                            cxmVar.d.s(600000L, criVar);
                        }
                        return;
                    }
                    csuVar2.a();
                    return;
                }
                cqc.b();
                cvk cvkVar5 = csuVar2.c;
                Objects.toString(cvkVar5);
                cvkVar5.toString();
                return;
            case 7:
                cyt cytVar = (cyt) this.a;
                cyr cyrVar = cytVar.b;
                if (cyrVar == null) {
                    return;
                }
                Object obj2 = cyrVar.a;
                if (obj2 != null) {
                    cytVar.b(obj2);
                    return;
                } else {
                    cytVar.a(cyrVar.b);
                    return;
                }
            case 8:
                ?? r02 = this.a;
                ((dhd) r02).c.a(r02);
                return;
            case 9:
                ((dsl) this.a).cancel(true);
                return;
            case 10:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 11:
                break;
            case 12:
                dry dryVar = (dry) this.a;
                dryVar.d = dryVar.c();
                try {
                    Object obj3 = this.a;
                    ((dry) obj3).b.registerReceiver(((dry) obj3).f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    ((dry) this.a).e = true;
                    return;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    ((dry) this.a).e = false;
                    return;
                }
            case 13:
                if (!((dry) this.a).e) {
                    return;
                }
                ((dry) this.a).e = false;
                dry dryVar2 = (dry) this.a;
                dryVar2.b.unregisterReceiver(dryVar2.f);
                return;
            case 14:
                dry dryVar3 = (dry) this.a;
                boolean z = dryVar3.d;
                dryVar3.d = dryVar3.c();
                if (z != ((dry) this.a).d) {
                    Object obj4 = this.a;
                    dtq.h(new drx(obj4, ((dry) obj4).d, 0));
                    return;
                }
                return;
            case 15:
                Trace.beginSection("waitForSettings");
                dvi dviVar = (dvi) this.a;
                dviVar.g.a.getString("dummy", null);
                fyo.b((ContentResolver) dviVar.h.a, "dummy", "");
                ((dgg) dviVar.i.a).f();
                Trace.endSection();
                return;
            case 16:
                ((dvi) this.a).d.i(true);
                return;
            case 17:
                Object obj5 = this.a;
                synchronized (((dfq) obj5).d) {
                    ((dfq) obj5).i = true;
                    ((dfq) obj5).e = null;
                }
                return;
            case 18:
                if (lua.j()) {
                    dwn dwnVar = (dwn) this.a;
                    dwm dwmVar = new dwm(dwnVar);
                    if (a.o(dwnVar.f, jdl.a, jer.i(dwmVar))) {
                        dwnVar.a(dwmVar, "com.google.android.gms.findmydevice.spot.DEVICE_CHANGES", "com.google.android.gms.findmydevice.spot.permission.DEVICE_CHANGES");
                        dwnVar.a(dwmVar, "com.google.android.gms.findmydevice.spot.DEVICES_CONNECTION_CHANGE", "com.google.android.gms.findmydevice.spot.permission.DEVICE_CHANGES");
                        dwnVar.a(dwmVar, "com.google.android.gms.findmydevice.spot.OPT_IN_STATE_CHANGES", "com.google.android.gms.permission.INTERNAL_BROADCAST");
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((ewc) this.a).p();
                return;
            default:
                ijp.a(((dwm) this.a).a.c.d(), "Failed to update FMDN status", new Object[0]);
                return;
        }
        while (true) {
            Object obj6 = this.a;
            boolean z2 = ((dkb) obj6).c;
            try {
                ((dkb) obj6).c((dka) ((dkb) obj6).b.remove());
                djz djzVar = ((dkb) obj6).d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public /* synthetic */ col(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
