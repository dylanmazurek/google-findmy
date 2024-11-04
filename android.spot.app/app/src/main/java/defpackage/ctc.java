package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctc implements crf {
    public static final /* synthetic */ int a = 0;
    private static final String b = cqc.a("SystemJobScheduler");
    private final Context c;
    private final JobScheduler d;
    private final ctb e;
    private final WorkDatabase f;
    private final hph g;

    public ctc(Context context, WorkDatabase workDatabase, hph hphVar) {
        JobScheduler a2 = cta.a(context);
        ctb ctbVar = new ctb(context);
        this.c = context;
        this.d = a2;
        this.e = ctbVar;
        this.f = workDatabase;
        this.g = hphVar;
    }

    public static cvk a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new cvk(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b2 = cta.b(jobScheduler);
        if (b2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b2.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b2) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            cqc.b();
            Log.e(b, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    private static List h(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> e = e(context, jobScheduler);
        if (e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : e) {
            cvk a2 = a(jobInfo);
            if (a2 != null && str.equals(a2.a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.crf
    public final void b(String str) {
        List h = h(this.c, this.d, str);
        if (h != null && !h.isEmpty()) {
            Iterator it = h.iterator();
            while (it.hasNext()) {
                f(this.d, ((Integer) it.next()).intValue());
            }
            cvf y = this.f.y();
            cvj cvjVar = (cvj) y;
            cvjVar.a.l();
            cks d = cvjVar.c.d();
            d.g(1, str);
            try {
                ((cvj) y).a.m();
                try {
                    d.a();
                    ((cvj) y).a.p();
                } finally {
                    ((cvj) y).a.n();
                }
            } finally {
                cvjVar.c.f(d);
            }
        }
    }

    @Override // defpackage.crf
    public final void c(cvu... cvuVarArr) {
        int o;
        WorkDatabase workDatabase;
        List h;
        int o2;
        bet betVar = new bet(this.f, (byte[]) null);
        for (cvu cvuVar : cvuVarArr) {
            this.f.m();
            try {
                cvu a2 = this.f.B().a(cvuVar.b);
                if (a2 == null) {
                    cqc.b();
                    Log.w(b, "Skipping scheduling " + cvuVar.b + " because it's no longer in the DB");
                    this.f.p();
                    workDatabase = this.f;
                } else if (a2.w != 1) {
                    cqc.b();
                    Log.w(b, "Skipping scheduling " + cvuVar.b + " because it is no longer enqueued");
                    this.f.p();
                    workDatabase = this.f;
                } else {
                    cvk b2 = cuv.b(cvuVar);
                    cve b3 = cte.b(this.f.y(), b2);
                    if (b3 != null) {
                        o = b3.c;
                    } else {
                        o = betVar.o();
                    }
                    if (b3 == null) {
                        this.f.y().a(ctf.b(b2, o));
                    }
                    g(cvuVar, o);
                    if (Build.VERSION.SDK_INT == 23 && (h = h(this.c, this.d, cvuVar.b)) != null) {
                        int indexOf = h.indexOf(Integer.valueOf(o));
                        if (indexOf >= 0) {
                            h.remove(indexOf);
                        }
                        if (!h.isEmpty()) {
                            o2 = ((Integer) h.get(0)).intValue();
                        } else {
                            o2 = betVar.o();
                        }
                        g(cvuVar, o2);
                    }
                    this.f.p();
                    workDatabase = this.f;
                }
                workDatabase.n();
            } catch (Throwable th) {
                this.f.n();
                throw th;
            }
        }
    }

    @Override // defpackage.crf
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0080, code lost:            if (android.os.Build.VERSION.SDK_INT < 26) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0085, code lost:            if (android.os.Build.VERSION.SDK_INT >= 24) goto L30;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.cvu r14, int r15) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctc.g(cvu, int):void");
    }
}
