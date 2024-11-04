package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggv implements ggt {
    public static final joo a = joo.m("GnpSdk");
    public final Context b;
    public final gvg c;
    private final Set d;
    private final gpx e;
    private final ghf f;

    public ggv(Context context, Set set, gpx gpxVar, ghf ghfVar, gvg gvgVar) {
        this.b = context;
        this.d = set;
        this.e = gpxVar;
        this.f = ghfVar;
        this.c = gvgVar;
    }

    @Override // defpackage.ggt
    public final boolean a(final JobParameters jobParameters, final JobService jobService) {
        final int jobId = jobParameters.getJobId();
        if (lss.c()) {
            this.f.c().a();
        }
        final PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskServiceHandlerImpl", "onStartJob", 63, "ScheduledTaskServiceHandlerImpl.java")).s("Job scheduled with NO extras. Job ID: '%d'", jobId);
            return false;
        }
        try {
            final String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
            gyp gypVar = null;
            if (!TextUtils.isEmpty(string)) {
                Iterator it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    gyp gypVar2 = (gyp) it.next();
                    if (string.equals(gypVar2.c())) {
                        gypVar = gypVar2;
                        break;
                    }
                }
            }
            if (gypVar == null) {
                ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskServiceHandlerImpl", "onStartJob", 80, "ScheduledTaskServiceHandlerImpl.java")).w("ChimeTask NOT found. Job ID: '%d', key: '%s'", jobId, string);
                return false;
            }
            extras.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", extras.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
            ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskServiceHandlerImpl", "onStartJob", 89, "ScheduledTaskServiceHandlerImpl.java")).w("Starting job execution. Job ID: '%d', key: '%s'", jobId, string);
            final gyp gypVar3 = gypVar;
            this.e.e(new Runnable() { // from class: ggu
                @Override // java.lang.Runnable
                public final void run() {
                    JobService jobService2 = jobService;
                    JobParameters jobParameters2 = jobParameters;
                    PersistableBundle persistableBundle = extras;
                    gyp gypVar4 = gypVar3;
                    ggv ggvVar = ggv.this;
                    boolean z = false;
                    try {
                        gfx b = gypVar4.b(new Bundle(persistableBundle));
                        ggvVar.c.a(ggvVar.b.getPackageName(), Build.VERSION.SDK_INT, false, gypVar4.c(), false, b.c());
                        int i = b.c;
                        int i2 = i - 1;
                        if (i != 0) {
                            String str = string;
                            int i3 = jobId;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    ((jol) ggv.a.k().j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskServiceHandlerImpl", "needsReschedule", 150, "ScheduledTaskServiceHandlerImpl.java")).w("Job finished with SUCCESS code. Job ID: '%d', key: '%s'", i3, str);
                                } else {
                                    ((jol) ((jol) ((jol) ggv.a.g()).i(b.b)).j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskServiceHandlerImpl", "needsReschedule", 142, "ScheduledTaskServiceHandlerImpl.java")).w("Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'", i3, new kwk(str));
                                }
                            } else {
                                ((jol) ((jol) ((jol) ggv.a.g()).i(b.b)).j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskServiceHandlerImpl", "needsReschedule", 136, "ScheduledTaskServiceHandlerImpl.java")).w("Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'", i3, new kwk(str));
                                z = true;
                            }
                            return;
                        }
                        throw null;
                    } finally {
                        jobService2.jobFinished(jobParameters2, false);
                    }
                }
            }, gnd.b(180000L));
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskServiceHandlerImpl", "onStartJob", 74, "ScheduledTaskServiceHandlerImpl.java")).s("Error retrieving handler key for Job. Job ID: '%d'", jobId);
            return false;
        }
    }

    @Override // defpackage.ggt
    public final void b() {
    }
}
