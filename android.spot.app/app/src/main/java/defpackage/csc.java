package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csc extends cjj {
    private final Context c;

    public csc(Context context) {
        super(9, 10);
        this.c = context;
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (true == sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            ckdVar.d();
            try {
                ckdVar.l(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                ckdVar.l(new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                ckdVar.h();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
        if (!sharedPreferences2.contains("next_job_scheduler_id") && !sharedPreferences2.contains("next_job_scheduler_id")) {
            return;
        }
        int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
        int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
        ckdVar.d();
        try {
            ckdVar.l(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
            ckdVar.l(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
            sharedPreferences2.edit().clear().apply();
            ckdVar.h();
        } finally {
        }
    }
}
