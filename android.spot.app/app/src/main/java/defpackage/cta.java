package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cta {
    public static final /* synthetic */ int a = 0;
    private static final String b = cqc.a("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        JobScheduler forNamespace;
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT >= 34) {
            forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
            forNamespace.getClass();
            return forNamespace;
        }
        return jobScheduler;
    }

    public static final List b(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable th) {
            String str = b;
            cqc.b();
            Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }
}
