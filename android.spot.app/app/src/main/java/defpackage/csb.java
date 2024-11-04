package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csb extends cql {
    public static final Object a;
    private static csb l;
    private static csb m;
    public Context b;
    public WorkDatabase c;
    public List d;
    public crd e;
    public boolean f = false;
    public BroadcastReceiver.PendingResult g;
    public hph h;
    public eld i;
    public bet j;
    public final nca k;
    private final msw n;

    static {
        cqc.a("WorkManagerImpl");
        l = null;
        m = null;
        a = new Object();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [mnb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public csb(Context context, final hph hphVar, eld eldVar, WorkDatabase workDatabase, final List list, crd crdVar, nca ncaVar) {
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && csa.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        cqc cqcVar = new cqc();
        synchronized (cqc.a) {
            if (cqc.b == null) {
                cqc.b = cqcVar;
            }
        }
        this.b = applicationContext;
        this.i = eldVar;
        this.c = workDatabase;
        this.e = crdVar;
        this.k = ncaVar;
        this.h = hphVar;
        this.d = list;
        eldVar.getClass();
        ?? r10 = eldVar.d;
        r10.getClass();
        msw m2 = msz.m(r10);
        this.n = m2;
        final WorkDatabase workDatabase2 = this.c;
        this.j = new bet(workDatabase2);
        crd crdVar2 = this.e;
        final ?? r7 = eldVar.a;
        crdVar2.c(new cqs() { // from class: crg
            @Override // defpackage.cqs
            public final void a(cvk cvkVar, boolean z) {
                r7.execute(new bxi(list, cvkVar, hphVar, workDatabase2, 3));
            }
        });
        this.i.e(new cwu(applicationContext, this));
        Context context2 = this.b;
        String str = crl.a;
        context2.getClass();
        if (cxc.a(context2, hphVar)) {
            cwn cwnVar = (cwn) workDatabase.B();
            bco bcoVar = new bco(new cwf(cwnVar, cin.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)), 9);
            mpp.q(m2, null, 0, new mxa(new ewm(mxc.a(moz.al(new ewm(new mwo(new cjd(cwnVar.a, new String[]{"workspec"}, bcoVar, null)), new crj(null), 4))), new crk(context2, null), 7), null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static csb f(Context context) {
        csb csbVar;
        Object obj = a;
        synchronized (obj) {
            synchronized (obj) {
                csbVar = l;
                if (csbVar == null) {
                    csbVar = m;
                }
            }
            return csbVar;
        }
        if (csbVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof cpi) {
                i(applicationContext, ((cpi) applicationContext).a());
                csbVar = f(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return csbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:            r8 = r21.getApplicationContext();     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:            if (defpackage.csb.m != null) goto L75;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:            r8.getClass();        r10 = new defpackage.eld(r22.e);        r1 = r8.getApplicationContext();        r1.getClass();        r2 = r10.a;        r2.getClass();        r4 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:            if (r8.getResources().getBoolean(com.google.android.apps.adm.R.bool.workmanager_test_configuration) == false) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:            r5 = new defpackage.cig(r1, androidx.work.impl.WorkDatabase.class, null);        r5.e = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:            r5.b = r2;        r5.a.add(new defpackage.cqr());        r5.b(defpackage.cqx.c);        r5.b(new defpackage.cre(r1, 2, 3));        r5.b(defpackage.cqy.c);        r5.b(defpackage.cqz.c);        r5.b(new defpackage.cre(r1, 5, 6));        r5.b(defpackage.cra.c);        r5.b(defpackage.crb.c);        r5.b(defpackage.crc.c);        r5.b(new defpackage.csc(r1));        r5.b(new defpackage.cre(r1, 10, 11));        r5.b(defpackage.cqt.c);        r5.b(defpackage.cqu.c);        r5.b(defpackage.cqv.c);        r5.b(defpackage.cqw.c);        r5.b(new defpackage.cre(r1, 21, 22));        r5.f = false;        r5.g = true;        r13 = (androidx.work.impl.WorkDatabase) r5.a();        r15 = r8.getApplicationContext();        r15.getClass();        r2 = r15.getApplicationContext();        r2.getClass();        r1 = new defpackage.cub(r2, r10);        r3 = r15.getApplicationContext();        r3.getClass();        r2 = new defpackage.cud(r3, r10);        r3 = r15.getApplicationContext();        r3.getClass();     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0144, code lost:            if (android.os.Build.VERSION.SDK_INT < 24) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0146, code lost:            r5 = new defpackage.cum(r3, r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0151, code lost:            r18 = r5;        r5 = r15.getApplicationContext();        r5.getClass();        r20 = new defpackage.nca(r15, r1, r2, r18, new defpackage.cup(r5, r10));        r14 = new defpackage.crd(r8.getApplicationContext(), r22, r10, r13);        r13.getClass();        r15 = new defpackage.crf[2];     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x017c, code lost:            if (android.os.Build.VERSION.SDK_INT < 23) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x017e, code lost:            r1 = new defpackage.ctc(r8, r13, r22);        defpackage.cxb.a(r8, androidx.work.impl.background.systemjob.SystemJobService.class, true);        defpackage.cqc.b();     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x018e, code lost:            r1 = (defpackage.crf) java.lang.Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(android.content.Context.class, defpackage.cph.class).newInstance(r8, r22.b);        defpackage.cqc.b();     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b1, code lost:            r4 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01b3, code lost:            defpackage.cqc.b();     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:            r5 = new defpackage.cuo(r3, r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:            r5 = defpackage.bwd.g(r1, androidx.work.impl.WorkDatabase.class, "androidx.work.workdb");        r5.d = new defpackage.crn(r1);     */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.content.Context r21, defpackage.hph r22) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csb.i(android.content.Context, hph):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.cql
    public final cqh a(String str) {
        Object obj = this.h.f;
        ?? r1 = this.i.a;
        r1.getClass();
        return bpd.f((bop) obj, "CancelWorkByName_".concat(str), r1, new aqg(str, this, 10));
    }

    @Override // defpackage.cql
    public final void b(List list) {
        if (!list.isEmpty()) {
            new crm(this, null, 2, list, null).g();
            return;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // defpackage.cql
    public final cqh c(String str, List list) {
        return new crm(this, str, 1, list).g();
    }

    public final void g() {
        synchronized (a) {
            this.f = true;
            BroadcastReceiver.PendingResult pendingResult = this.g;
            if (pendingResult != null) {
                pendingResult.finish();
                this.g = null;
            }
        }
    }

    public final void h() {
        Object obj = this.h.f;
        crz crzVar = new crz(this, 0);
        boolean f = bzo.f();
        if (f) {
            try {
                bzo.e("ReschedulingWork");
            } catch (Throwable th) {
                if (f) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        crzVar.a();
        if (f) {
            Trace.endSection();
        }
    }
}
