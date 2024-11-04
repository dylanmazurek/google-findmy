package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwe extends chl {
    public cwe(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.chl
    protected final /* synthetic */ void c(cks cksVar, Object obj) {
        cvu cvuVar = (cvu) obj;
        cksVar.g(1, cvuVar.b);
        cksVar.e(2, bpl.u(cvuVar.w));
        cksVar.g(3, cvuVar.c);
        cksVar.g(4, cvuVar.d);
        cksVar.c(5, box.h(cvuVar.e));
        cksVar.c(6, box.h(cvuVar.f));
        cksVar.e(7, cvuVar.g);
        cksVar.e(8, cvuVar.h);
        cksVar.e(9, cvuVar.i);
        cksVar.e(10, cvuVar.k);
        cksVar.e(11, bpl.r(cvuVar.x));
        cksVar.e(12, cvuVar.l);
        cksVar.e(13, cvuVar.m);
        cksVar.e(14, cvuVar.n);
        cksVar.e(15, cvuVar.o);
        cksVar.e(16, cvuVar.p ? 1L : 0L);
        cksVar.e(17, bpl.t(cvuVar.y));
        cksVar.e(18, cvuVar.q);
        cksVar.e(19, cvuVar.r);
        cksVar.e(20, cvuVar.s);
        cksVar.e(21, cvuVar.t);
        cksVar.e(22, cvuVar.u);
        String str = cvuVar.v;
        if (str == null) {
            cksVar.f(23);
        } else {
            cksVar.g(23, str);
        }
        cpl cplVar = cvuVar.j;
        cksVar.e(24, bpl.s(cplVar.j));
        cksVar.c(25, bpl.p(cplVar.b));
        cksVar.e(26, cplVar.c ? 1L : 0L);
        cksVar.e(27, cplVar.d ? 1L : 0L);
        cksVar.e(28, cplVar.e ? 1L : 0L);
        cksVar.e(29, cplVar.f ? 1L : 0L);
        cksVar.e(30, cplVar.g);
        cksVar.e(31, cplVar.h);
        cksVar.c(32, bpl.q(cplVar.i));
    }
}
