package defpackage;

import android.app.job.JobParameters;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctf {
    public static int a(JobParameters jobParameters) {
        int stopReason;
        stopReason = jobParameters.getStopReason();
        int i = SystemJobService.a;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static final cve b(cvk cvkVar, int i) {
        return new cve(cvkVar.a, cvkVar.b, i);
    }
}
