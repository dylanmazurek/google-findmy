package defpackage;

import android.app.job.JobParameters;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctd {
    public static Uri[] a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static String[] b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
