package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.ar.core.ImageMetadata;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqp extends hqk implements hpg {
    private final hpd a;
    private final Context b;
    private final Executor c;
    private final hqh d;
    private final mko e;
    private final lqz f;
    private final mko g;
    private final mko h;

    public hqp(hpe hpeVar, Context context, Executor executor, hqh hqhVar, mko mkoVar, lqz lqzVar, mko mkoVar2, mko mkoVar3) {
        this.a = hpeVar.a(executor, lqzVar, null);
        this.b = context;
        this.c = executor;
        this.d = hqhVar;
        this.e = mkoVar;
        this.f = lqzVar;
        this.g = mkoVar2;
        this.h = mkoVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jyz k(final hqp hqpVar) {
        String processName;
        if (!((hqg) hqpVar.f.a()).b()) {
            return jyv.a;
        }
        Context context = hqpVar.b;
        lqz lqzVar = hqpVar.f;
        String packageName = context.getPackageName();
        String str = ((hqg) lqzVar.a()).a;
        String valueOf = String.valueOf(packageName);
        String valueOf2 = String.valueOf(str);
        processName = Application.getProcessName();
        if (!processName.equals(valueOf.concat(valueOf2))) {
            return jyv.a;
        }
        if (!((Boolean) hqpVar.g.a()).booleanValue()) {
            return jyv.a;
        }
        final List a = hqpVar.d.a(0, 0, ((SharedPreferences) hqpVar.e.a()).getString("lastExitProcessName", null), ((SharedPreferences) hqpVar.e.a()).getLong("lastExitTimestamp", -1L));
        if (a.isEmpty()) {
            return jyv.a;
        }
        nde ndeVar = (nde) hqpVar.h.a();
        ljh k = ndd.e.k();
        int i = ((jmi) a).c;
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        ndd nddVar = (ndd) ljnVar;
        nddVar.a |= 2;
        nddVar.d = i;
        if (!ljnVar.y()) {
            k.t();
        }
        ndd nddVar2 = (ndd) k.b;
        ndeVar.getClass();
        nddVar2.c = ndeVar;
        nddVar2.a |= 1;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < ndeVar.a.size(); i2++) {
            int t = mpp.t(ndeVar.a.e(i2));
            if (t == 0) {
                t = 1;
            }
            hashSet.add(Integer.valueOf(t - 1));
        }
        jmx it = ((jis) a).iterator();
        while (it.hasNext()) {
            ndc ndcVar = (ndc) it.next();
            int t2 = mpp.t(ndcVar.c);
            if (t2 == 0) {
                t2 = 1;
            }
            if (hashSet.contains(Integer.valueOf(t2 - 1))) {
                if (!k.b.y()) {
                    k.t();
                }
                ndd nddVar3 = (ndd) k.b;
                ndcVar.getClass();
                ljv ljvVar = nddVar3.b;
                if (!ljvVar.c()) {
                    nddVar3.b = ljn.p(ljvVar);
                }
                nddVar3.b.add(ndcVar);
            }
        }
        ndd nddVar4 = (ndd) k.q();
        hpd hpdVar = hqpVar.a;
        hoy a2 = hoz.a();
        ljh k2 = nfe.v.k();
        if (!k2.b.y()) {
            k2.t();
        }
        nfe nfeVar = (nfe) k2.b;
        nddVar4.getClass();
        nfeVar.m = nddVar4;
        nfeVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        a2.e((nfe) k2.q());
        return jwu.g(hpdVar.b(a2.a()), new jei() { // from class: hqm
            @Override // defpackage.jei
            public final Object a(Object obj) {
                hqp.this.m(a, (Void) obj);
                return null;
            }
        }, hqpVar.c);
    }

    @Override // defpackage.hpg
    public void Y() {
        o();
    }

    public /* synthetic */ jyz l() {
        return gad.b(this.b, new Runnable() { // from class: hqo
            @Override // java.lang.Runnable
            public final void run() {
                hqp.this.n();
            }
        });
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ java.lang.Void m(java.util.List r6, java.lang.Void r7) {
        /*
            r5 = this;
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            ndc r6 = (defpackage.ndc) r6
        L7:
            java.lang.String r0 = r6.b
            long r1 = r6.f
            mko r3 = r5.e
            java.lang.Object r3 = r3.a()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = "lastExitProcessName"
            android.content.SharedPreferences$Editor r0 = r3.putString(r4, r0)
            java.lang.String r3 = "lastExitTimestamp"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L49
            int r7 = r7 + 1
            r0 = 3
            if (r7 < r0) goto L7
            jnk r6 = defpackage.hmz.a
            jnx r6 = r6.g()
            jni r6 = (defpackage.jni) r6
            java.lang.String r7 = "updateLastRecordedAppExit"
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r1 = "com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl"
            java.lang.String r2 = "ApplicationExitMetricServiceImpl.java"
            jnx r6 = r6.j(r1, r7, r0, r2)
            jni r6 = (defpackage.jni) r6
            java.lang.String r7 = "Failed to persist most recent App Exit"
            r6.r(r7)
        L49:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqp.m(java.util.List, java.lang.Void):java.lang.Void");
    }

    public /* synthetic */ void n() {
        ivc.J(new jxc() { // from class: hql
            @Override // defpackage.jxc
            public final jyz a() {
                return hqp.k(hqp.this);
            }
        }, this.c);
    }

    public void o() {
        ivc.J(new jxc() { // from class: hqn
            @Override // defpackage.jxc
            public final jyz a() {
                return hqp.this.l();
            }
        }, this.c);
    }
}
