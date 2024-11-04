package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csv implements Runnable {
    final /* synthetic */ csy a;

    public csv(csy csyVar) {
        this.a = csyVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        csy csyVar;
        qq qqVar;
        List<bet> y;
        boolean z;
        synchronized (this.a.g) {
            csy csyVar2 = this.a;
            csyVar2.h = (Intent) csyVar2.g.get(0);
        }
        csy csyVar3 = this.a;
        Intent intent = csyVar3.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = csyVar3.h.getIntExtra("KEY_START_ID", 0);
            cqc.b();
            Objects.toString(this.a.h);
            PowerManager.WakeLock a = cxf.a(this.a.b, action + " (" + intExtra + ")");
            try {
                cqc.b();
                Objects.toString(a);
                a.acquire();
                csy csyVar4 = this.a;
                csr csrVar = csyVar4.f;
                Intent intent2 = csyVar4.h;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    cqc.b();
                    Objects.toString(intent2);
                    int i2 = cst.a;
                    Context context = csrVar.b;
                    bet betVar = new bet(csyVar4.e.k);
                    List<cvu> c = csyVar4.e.c.B().c();
                    int i3 = css.a;
                    Iterator it = c.iterator();
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it.hasNext()) {
                        cpl cplVar = ((cvu) it.next()).j;
                        z2 |= cplVar.e;
                        z3 |= cplVar.c;
                        z4 |= cplVar.f;
                        if (cplVar.j != 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z5 |= z;
                        if (z2 && z3 && z4 && z5) {
                            break;
                        }
                    }
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
                    context.sendBroadcast(intent3);
                    ArrayList arrayList = new ArrayList(c.size());
                    long currentTimeMillis = System.currentTimeMillis();
                    for (cvu cvuVar : c) {
                        if (currentTimeMillis >= cvuVar.a() && (!cvuVar.b() || betVar.q(cvuVar))) {
                            arrayList.add(cvuVar);
                        }
                    }
                    int size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        cvu cvuVar2 = (cvu) arrayList.get(i);
                        String str = cvuVar2.b;
                        Intent c2 = csr.c(context, cuv.b(cvuVar2));
                        cqc.b();
                        csyVar4.j.c.execute(new csw(csyVar4, c2, intExtra));
                    }
                } else if ("ACTION_RESCHEDULE".equals(action2)) {
                    cqc.b();
                    Objects.toString(intent2);
                    csyVar4.e.h();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                        if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                            cvk e = csr.e(intent2);
                            cqc.b();
                            Objects.toString(e);
                            e.toString();
                            WorkDatabase workDatabase = csyVar4.e.c;
                            workDatabase.m();
                            try {
                                cvu a2 = workDatabase.B().a(e.a);
                                if (a2 == null) {
                                    cqc.b();
                                    Log.w(csr.a, a.af(e, "Skipping scheduling ", " because it's no longer in the DB"));
                                } else if (bpe.h(a2.w)) {
                                    cqc.b();
                                    Log.w(csr.a, a.af(e, "Skipping scheduling ", "because it is finished."));
                                } else {
                                    long a3 = a2.a();
                                    if (!a2.b()) {
                                        cqc.b();
                                        Objects.toString(e);
                                        csq.b(csrVar.b, workDatabase, e, a3);
                                    } else {
                                        cqc.b();
                                        Objects.toString(e);
                                        csq.b(csrVar.b, workDatabase, e, a3);
                                        csyVar4.j.c.execute(new csw(csyVar4, csr.b(csrVar.b), intExtra));
                                    }
                                    workDatabase.p();
                                }
                            } finally {
                                workDatabase.n();
                            }
                        } else if ("ACTION_DELAY_MET".equals(action2)) {
                            synchronized (csrVar.d) {
                                cvk e2 = csr.e(intent2);
                                cqc.b();
                                Objects.toString(e2);
                                if (!csrVar.c.containsKey(e2)) {
                                    csu csuVar = new csu(csrVar.b, intExtra, csyVar4, csrVar.e.H(e2));
                                    csrVar.c.put(e2, csuVar);
                                    String str2 = csuVar.c.a;
                                    csuVar.h = cxf.a(csuVar.a, str2 + " (" + csuVar.b + ")");
                                    cqc.b();
                                    Objects.toString(csuVar.h);
                                    csuVar.h.acquire();
                                    cvu a4 = csuVar.d.e.c.B().a(str2);
                                    if (a4 == null) {
                                        csuVar.f.execute(new col(csuVar, 5, null));
                                    } else {
                                        boolean b = a4.b();
                                        csuVar.i = b;
                                        if (!b) {
                                            cqc.b();
                                            csuVar.f.execute(new col(csuVar, 6, null));
                                        } else {
                                            csuVar.k = ctr.a(csuVar.l, a4, csuVar.j, csuVar);
                                        }
                                    }
                                } else {
                                    cqc.b();
                                    Objects.toString(e2);
                                }
                            }
                        } else if ("ACTION_STOP_WORK".equals(action2)) {
                            Bundle extras2 = intent2.getExtras();
                            String string = extras2.getString("KEY_WORKSPEC_ID");
                            if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                                int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                                y = new ArrayList(1);
                                bet G = csrVar.e.G(new cvk(string, i4));
                                if (G != null) {
                                    y.add(G);
                                }
                            } else {
                                y = csrVar.e.y(string);
                            }
                            for (bet betVar2 : y) {
                                cqc.b();
                                bpi.f(csyVar4.k, betVar2);
                                Context context2 = csrVar.b;
                                WorkDatabase workDatabase2 = csyVar4.e.c;
                                Object obj = betVar2.a;
                                int i5 = csq.a;
                                cvf y2 = workDatabase2.y();
                                cve b2 = cte.b(y2, (cvk) obj);
                                if (b2 != null) {
                                    csq.a(context2, (cvk) obj, b2.c);
                                    cqc.b();
                                    Objects.toString(obj);
                                    String str3 = ((cvk) obj).a;
                                    int i6 = ((cvk) obj).b;
                                    ((cvj) y2).a.l();
                                    cks d = ((cvj) y2).b.d();
                                    d.g(1, str3);
                                    d.e(2, i6);
                                    try {
                                        ((cvj) y2).a.m();
                                        try {
                                            d.a();
                                            ((cvj) y2).a.p();
                                        } finally {
                                        }
                                    } finally {
                                        ((cvj) y2).b.f(d);
                                    }
                                }
                                csyVar4.a((cvk) betVar2.a, false);
                            }
                        } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                            cvk e3 = csr.e(intent2);
                            boolean z6 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                            cqc.b();
                            Objects.toString(intent2);
                            csrVar.a(e3, z6);
                        } else {
                            cqc.b();
                            String str4 = csr.a;
                            Objects.toString(intent2);
                            Log.w(str4, "Ignoring intent ".concat(String.valueOf(intent2)));
                        }
                    }
                    cqc.b();
                    Log.e(csr.a, "Invalid request for " + action2 + " , requires KEY_WORKSPEC_ID .");
                }
                cqc.b();
                Objects.toString(a);
                a.release();
                csyVar = this.a;
                qqVar = new qq(csyVar, 3);
            } catch (Throwable th) {
                try {
                    cqc.b();
                    Log.e(csy.a, "Unexpected error in onHandleIntent", th);
                    cqc.b();
                    Objects.toString(a);
                    a.release();
                    csyVar = this.a;
                    qqVar = new qq(csyVar, 3);
                } catch (Throwable th2) {
                    cqc.b();
                    Objects.toString(a);
                    a.release();
                    csy csyVar5 = this.a;
                    csyVar5.j.c.execute(new qq(csyVar5, 3));
                    throw th2;
                }
            }
            csyVar.j.c.execute(qqVar);
        }
    }
}
