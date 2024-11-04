package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csy implements cqs {
    public static final String a = cqc.a("SystemAlarmDispatcher");
    final Context b;
    public final cxm c;
    public final crd d;
    public final csb e;
    public final csr f;
    public final List g;
    public Intent h;
    public csx i;
    public final eld j;
    public final elo k;
    private final elo l;

    public csy(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        elo eloVar = new elo((char[]) null);
        this.l = eloVar;
        csb f = csb.f(context);
        this.e = f;
        Object obj = f.h.b;
        this.f = new csr(applicationContext, eloVar);
        this.c = new cxm((bet) f.h.c);
        crd crdVar = f.e;
        this.d = crdVar;
        eld eldVar = f.i;
        this.j = eldVar;
        this.k = new elo(crdVar, eldVar);
        crdVar.c(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.cqs
    public final void a(cvk cvkVar, boolean z) {
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        csr.f(intent, cvkVar);
        this.j.c.execute(new csw(this, intent, 0));
    }

    public final void b() {
        cqc.b();
        this.d.d(this);
        this.i = null;
    }

    public final void c() {
        e();
        PowerManager.WakeLock a2 = cxf.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.e.i.e(new csv(this));
        } finally {
            a2.release();
        }
    }

    public final void d(Intent intent, int i) {
        cqc.b();
        Objects.toString(intent);
        e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            cqc.b();
            Log.w(a, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            synchronized (this.g) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            boolean isEmpty = this.g.isEmpty();
            this.g.add(intent);
            if (isEmpty) {
                c();
            }
        }
    }
}
