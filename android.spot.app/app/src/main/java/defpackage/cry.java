package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cry extends cik {
    public final /* synthetic */ WorkDatabase_Impl a;

    public cry(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
    }

    @Override // defpackage.cik
    public final cil a(ckd ckdVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new cjq("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new cjq("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new cjr("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new cjr("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new cjs("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new cjs("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        cjt cjtVar = new cjt("Dependency", hashMap, hashSet, hashSet2);
        cjt a = cjt.a(ckdVar, "Dependency");
        if (!byl.r(cjtVar, a)) {
            return new cil(false, a.ah(a, cjtVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap2 = new HashMap(32);
        hashMap2.put("id", new cjq("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new cjq("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new cjq("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new cjq("input_merger_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input", new cjq("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new cjq("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new cjq("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new cjq("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new cjq("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new cjq("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new cjq("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new cjq("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new cjq("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        hashMap2.put("minimum_retention_duration", new cjq("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new cjq("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new cjq("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new cjq("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new cjq("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new cjq("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("next_schedule_time_override", new cjq("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        hashMap2.put("next_schedule_time_override_generation", new cjq("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("stop_reason", new cjq("stop_reason", "INTEGER", true, 0, "-256", 1));
        hashMap2.put("trace_tag", new cjq("trace_tag", "TEXT", false, 0, null, 1));
        hashMap2.put("required_network_type", new cjq("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_request", new cjq("required_network_request", "BLOB", true, 0, "x''", 1));
        hashMap2.put("requires_charging", new cjq("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new cjq("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new cjq("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new cjq("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new cjq("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new cjq("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new cjq("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new cjs("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new cjs("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        cjt cjtVar2 = new cjt("WorkSpec", hashMap2, hashSet3, hashSet4);
        cjt a2 = cjt.a(ckdVar, "WorkSpec");
        if (!byl.r(cjtVar2, a2)) {
            return new cil(false, a.ah(a2, cjtVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new cjq("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new cjq("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new cjr("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new cjs("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        cjt cjtVar3 = new cjt("WorkTag", hashMap3, hashSet5, hashSet6);
        cjt a3 = cjt.a(ckdVar, "WorkTag");
        if (!byl.r(cjtVar3, a3)) {
            return new cil(false, a.ah(a3, cjtVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new cjq("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new cjq("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new cjq("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new cjr("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        cjt cjtVar4 = new cjt("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        cjt a4 = cjt.a(ckdVar, "SystemIdInfo");
        if (!byl.r(cjtVar4, a4)) {
            return new cil(false, a.ah(a4, cjtVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new cjq("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new cjq("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new cjr("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new cjs("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        cjt cjtVar5 = new cjt("WorkName", hashMap5, hashSet8, hashSet9);
        cjt a5 = cjt.a(ckdVar, "WorkName");
        if (!byl.r(cjtVar5, a5)) {
            return new cil(false, a.ah(a5, cjtVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new cjq("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new cjq("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new cjr("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        cjt cjtVar6 = new cjt("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        cjt a6 = cjt.a(ckdVar, "WorkProgress");
        if (!byl.r(cjtVar6, a6)) {
            return new cil(false, a.ah(a6, cjtVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new cjq("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new cjq("long_value", "INTEGER", false, 0, null, 1));
        cjt cjtVar7 = new cjt("Preference", hashMap7, new HashSet(0), new HashSet(0));
        cjt a7 = cjt.a(ckdVar, "Preference");
        if (!byl.r(cjtVar7, a7)) {
            return new cil(false, a.ah(a7, cjtVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n"));
        }
        return new cil(true, null);
    }

    @Override // defpackage.cik
    public final void b(ckd ckdVar) {
        ckdVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        ckdVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        ckdVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        ckdVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ckdVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ckdVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        ckdVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ckdVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        ckdVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ckdVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }
}
