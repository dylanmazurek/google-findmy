package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crr extends cjj {
    public crr() {
        super(14, 15);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        String str;
        ckdVar.g("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        ckdVar.g("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        ckdVar.g("DROP TABLE `WorkSpec`");
        ckdVar.g("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        ckdVar.g("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            Object[] objArr2 = new Object[size];
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(ckl.a[3]);
            sb.append("WorkSpec SET ");
            for (String str2 : contentValues.keySet()) {
                if (i > 0) {
                    str = ",";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(str2);
                objArr2[i] = contentValues.get(str2);
                sb.append("=?");
                i++;
            }
            for (int i2 = size; i2 < size; i2++) {
                objArr2[i2] = objArr[i2 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            cks k = ((ckl) ckdVar).k(sb.toString());
            bzc.a(k, objArr2);
            k.a();
            return;
        }
        throw new IllegalArgumentException("Empty values");
    }
}
