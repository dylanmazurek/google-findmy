package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.bet;
import defpackage.bph;
import defpackage.cqc;
import defpackage.cqs;
import defpackage.crd;
import defpackage.csb;
import defpackage.ctd;
import defpackage.cte;
import defpackage.ctf;
import defpackage.cvk;
import defpackage.elo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements cqs {
    public static final /* synthetic */ int a = 0;
    private static final String b = cqc.a("SystemJobService");
    private csb c;
    private elo e;
    private final Map d = new HashMap();
    private final elo f = new elo((char[]) null);

    private static cvk b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new cvk(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.cqs
    public final void a(cvk cvkVar, boolean z) {
        JobParameters jobParameters;
        cqc.b();
        synchronized (this.d) {
            jobParameters = (JobParameters) this.d.remove(cvkVar);
        }
        this.f.G(cvkVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            csb f = csb.f(getApplicationContext());
            this.c = f;
            crd crdVar = f.e;
            this.e = new elo(crdVar, f.i);
            crdVar.c(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                cqc.b();
                Log.w(b, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        csb csbVar = this.c;
        if (csbVar != null) {
            csbVar.e.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        bph bphVar;
        if (this.c == null) {
            cqc.b();
            jobFinished(jobParameters, true);
            return false;
        }
        cvk b2 = b(jobParameters);
        if (b2 == null) {
            cqc.b();
            Log.e(b, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.d) {
            if (this.d.containsKey(b2)) {
                cqc.b();
                Objects.toString(b2);
                return false;
            }
            cqc.b();
            Objects.toString(b2);
            this.d.put(b2, jobParameters);
            if (Build.VERSION.SDK_INT >= 24) {
                bphVar = new bph();
                if (ctd.a(jobParameters) != null) {
                    Arrays.asList(ctd.a(jobParameters));
                }
                if (ctd.b(jobParameters) != null) {
                    Arrays.asList(ctd.b(jobParameters));
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    cte.a(jobParameters);
                }
            } else {
                bphVar = null;
            }
            this.e.I(this.f.H(b2), bphVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        if (this.c == null) {
            cqc.b();
            return true;
        }
        cvk b2 = b(jobParameters);
        if (b2 == null) {
            cqc.b();
            Log.e(b, "WorkSpec id not found!");
            return false;
        }
        cqc.b();
        Objects.toString(b2);
        b2.toString();
        synchronized (this.d) {
            this.d.remove(b2);
        }
        bet G = this.f.G(b2);
        if (G != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = ctf.a(jobParameters);
            } else {
                i = -512;
            }
            this.e.F(G, i);
        }
        crd crdVar = this.c.e;
        String str = b2.a;
        synchronized (crdVar.i) {
            contains = crdVar.g.contains(str);
        }
        if (!contains) {
            return true;
        }
        return false;
    }
}
