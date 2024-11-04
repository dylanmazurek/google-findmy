package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyv implements gyq {
    private static final joo a = joo.m("GnpSdk");
    private static final String b = String.format("JobScheduler returned RESULT_FAILURE. Did you forget to add [%s] to your app dependencies?", "java/com/google/android/libraries/notifications/entrypoints/scheduled");
    private final Context c;
    private final gnv d;
    private final hnu e;

    public gyv(Context context, gnv gnvVar, hnu hnuVar) {
        this.c = context;
        this.d = gnvVar;
        this.e = hnuVar;
    }

    private final void e(goa goaVar, int i, gyp gypVar, Bundle bundle, Long l) {
        boolean z;
        Long valueOf;
        if (gypVar.d() && gypVar.a() <= 0) {
            z = false;
        } else {
            z = true;
        }
        hwx.N(z, "Job is recurrying but does not have a period > 0, got: %s.", gypVar.a());
        PersistableBundle persistableBundle = new PersistableBundle(bundle.keySet().size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Integer) {
                    persistableBundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    persistableBundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    persistableBundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    persistableBundle.putString(str, (String) obj);
                } else if (obj instanceof String[]) {
                    persistableBundle.putStringArray(str, (String[]) obj);
                } else {
                    throw new IllegalArgumentException("Extra parameter types supported: Integer, Long, Double, String.Error for, key: [" + str + "] value: [" + obj.toString() + "].");
                }
            }
        }
        persistableBundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", gypVar.c());
        hnu hnuVar = this.e;
        if (goaVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(goaVar.a);
        }
        int d = hnuVar.d(valueOf, i);
        Context context = this.c;
        gnv gnvVar = this.d;
        boolean aF = frx.aF(context, "android.permission.RECEIVE_BOOT_COMPLETED");
        JobInfo.Builder extras = new JobInfo.Builder(d, new ComponentName(context, gnvVar.f)).setExtras(persistableBundle);
        gypVar.f();
        JobInfo.Builder persisted = extras.setRequiredNetworkType(1).setPersisted(aF);
        if (gypVar.d()) {
            persisted.setPeriodic(gypVar.a());
        } else if (l != null) {
            persisted.setMinimumLatency(l.longValue());
        }
        gypVar.e();
        try {
            if (((JobScheduler) this.c.getSystemService("jobscheduler")).schedule(persisted.build()) != 0) {
                ((jol) a.k().j("com/google/android/libraries/notifications/scheduled/impl/jobscheduler/ChimeTaskSchedulerApiImpl", "scheduleInternal", 214, "ChimeTaskSchedulerApiImpl.java")).z("Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.c.getApplicationContext().getPackageName(), Integer.valueOf(d), Integer.valueOf(i));
                return;
            }
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/scheduled/impl/jobscheduler/ChimeTaskSchedulerApiImpl", "scheduleInternal", 203, "ChimeTaskSchedulerApiImpl.java")).s("Failed to scheduled job %s", d);
        }
        ((jol) ((jol) a.g()).j("com/google/android/libraries/notifications/scheduled/impl/jobscheduler/ChimeTaskSchedulerApiImpl", "scheduleInternal", 206, "ChimeTaskSchedulerApiImpl.java")).z("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.c.getApplicationContext().getPackageName(), Integer.valueOf(d), Integer.valueOf(i));
        throw new gyo(b);
    }

    @Override // defpackage.gyq
    public final void a(goa goaVar, int i) {
        Long valueOf;
        if (goaVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(goaVar.a);
        }
        int d = this.e.d(valueOf, i);
        ((jol) a.k().j("com/google/android/libraries/notifications/scheduled/impl/jobscheduler/ChimeTaskSchedulerApiImpl", "cancel", 111, "ChimeTaskSchedulerApiImpl.java")).z("Cancelling a scheduled job for package [%s] with ID: %s, type: %s", this.c.getApplicationContext().getPackageName(), Integer.valueOf(d), Integer.valueOf(i));
        ((JobScheduler) this.c.getSystemService("jobscheduler")).cancel(d);
    }

    @Override // defpackage.gyq
    public final void b(goa goaVar, int i, gyp gypVar, Bundle bundle) {
        e(goaVar, i, gypVar, bundle, null);
    }

    @Override // defpackage.gyq
    public final void c(goa goaVar, int i, gyp gypVar, Bundle bundle, long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.N(z, "Scheduled job minimumLatencyMs must be > 0, got: %s.", j);
        e(goaVar, i, gypVar, bundle, Long.valueOf(j));
    }

    @Override // defpackage.gyq
    public final boolean d() {
        try {
            List<JobInfo> allPendingJobs = ((JobScheduler) this.c.getSystemService("jobscheduler")).getAllPendingJobs();
            if (allPendingJobs == null) {
                return false;
            }
            Iterator<JobInfo> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == this.e.d(null, 7)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/scheduled/impl/jobscheduler/ChimeTaskSchedulerApiImpl", "isScheduled", 'W', "ChimeTaskSchedulerApiImpl.java")).r("Failed to get all pending jobs");
            return false;
        }
    }
}
