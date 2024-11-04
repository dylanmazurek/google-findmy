package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.boy;
import defpackage.bpl;
import defpackage.bwj;
import defpackage.bwp;
import defpackage.cin;
import defpackage.cpl;
import defpackage.cpn;
import defpackage.cqa;
import defpackage.cqc;
import defpackage.csb;
import defpackage.cvf;
import defpackage.cvl;
import defpackage.cvu;
import defpackage.cvv;
import defpackage.cwn;
import defpackage.cwo;
import defpackage.cxa;
import defpackage.cxv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final boy c() {
        cin cinVar;
        int d;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        cvf cvfVar;
        cvl cvlVar;
        cwo cwoVar;
        int i;
        boolean z;
        String string;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        csb f = csb.f(this.a);
        WorkDatabase workDatabase = f.c;
        workDatabase.getClass();
        cvv B = workDatabase.B();
        cvl z6 = workDatabase.z();
        cwo C = workDatabase.C();
        cvf y = workDatabase.y();
        Object obj = f.h.b;
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        cin a = cin.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        a.e(1, currentTimeMillis);
        cwn cwnVar = (cwn) B;
        cwnVar.a.l();
        Cursor c = bwp.c(cwnVar.a, a);
        try {
            d = bwj.d(c, "id");
            d2 = bwj.d(c, "state");
            d3 = bwj.d(c, "worker_class_name");
            d4 = bwj.d(c, "input_merger_class_name");
            d5 = bwj.d(c, "input");
            d6 = bwj.d(c, "output");
            d7 = bwj.d(c, "initial_delay");
            d8 = bwj.d(c, "interval_duration");
            d9 = bwj.d(c, "flex_duration");
            d10 = bwj.d(c, "run_attempt_count");
            d11 = bwj.d(c, "backoff_policy");
            d12 = bwj.d(c, "backoff_delay_duration");
            d13 = bwj.d(c, "last_enqueue_time");
            d14 = bwj.d(c, "minimum_retention_duration");
            cinVar = a;
        } catch (Throwable th) {
            th = th;
            cinVar = a;
        }
        try {
            int d15 = bwj.d(c, "schedule_requested_at");
            int d16 = bwj.d(c, "run_in_foreground");
            int d17 = bwj.d(c, "out_of_quota_policy");
            int d18 = bwj.d(c, "period_count");
            int d19 = bwj.d(c, "generation");
            int d20 = bwj.d(c, "next_schedule_time_override");
            int d21 = bwj.d(c, "next_schedule_time_override_generation");
            int d22 = bwj.d(c, "stop_reason");
            int d23 = bwj.d(c, "trace_tag");
            int d24 = bwj.d(c, "required_network_type");
            int d25 = bwj.d(c, "required_network_request");
            int d26 = bwj.d(c, "requires_charging");
            int d27 = bwj.d(c, "requires_device_idle");
            int d28 = bwj.d(c, "requires_battery_not_low");
            int d29 = bwj.d(c, "requires_storage_not_low");
            int d30 = bwj.d(c, "trigger_content_update_delay");
            int d31 = bwj.d(c, "trigger_max_content_delay");
            int d32 = bwj.d(c, "content_uri_triggers");
            int i6 = d14;
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                String string2 = c.getString(d);
                int y2 = bpl.y(c.getInt(d2));
                String string3 = c.getString(d3);
                String string4 = c.getString(d4);
                cpn a2 = cpn.a(c.getBlob(d5));
                cpn a3 = cpn.a(c.getBlob(d6));
                long j = c.getLong(d7);
                long j2 = c.getLong(d8);
                long j3 = c.getLong(d9);
                int i7 = c.getInt(d10);
                int v = bpl.v(c.getInt(d11));
                long j4 = c.getLong(d12);
                long j5 = c.getLong(d13);
                int i8 = i6;
                long j6 = c.getLong(i8);
                int i9 = d;
                int i10 = d15;
                long j7 = c.getLong(i10);
                d15 = i10;
                int i11 = d16;
                if (c.getInt(i11) != 0) {
                    d16 = i11;
                    i = d17;
                    z = true;
                } else {
                    d16 = i11;
                    i = d17;
                    z = false;
                }
                int x = bpl.x(c.getInt(i));
                d17 = i;
                int i12 = d18;
                int i13 = c.getInt(i12);
                d18 = i12;
                int i14 = d19;
                int i15 = c.getInt(i14);
                d19 = i14;
                int i16 = d20;
                long j8 = c.getLong(i16);
                d20 = i16;
                int i17 = d21;
                int i18 = c.getInt(i17);
                d21 = i17;
                int i19 = d22;
                int i20 = c.getInt(i19);
                d22 = i19;
                int i21 = d23;
                if (c.isNull(i21)) {
                    string = null;
                } else {
                    string = c.getString(i21);
                }
                String str = string;
                d23 = i21;
                int i22 = d24;
                int w = bpl.w(c.getInt(i22));
                d24 = i22;
                int i23 = d25;
                cxa n = bpl.n(c.getBlob(i23));
                d25 = i23;
                int i24 = d26;
                if (c.getInt(i24) != 0) {
                    d26 = i24;
                    i2 = d27;
                    z2 = true;
                } else {
                    d26 = i24;
                    i2 = d27;
                    z2 = false;
                }
                if (c.getInt(i2) != 0) {
                    d27 = i2;
                    i3 = d28;
                    z3 = true;
                } else {
                    d27 = i2;
                    i3 = d28;
                    z3 = false;
                }
                if (c.getInt(i3) != 0) {
                    d28 = i3;
                    i4 = d29;
                    z4 = true;
                } else {
                    d28 = i3;
                    i4 = d29;
                    z4 = false;
                }
                if (c.getInt(i4) != 0) {
                    d29 = i4;
                    i5 = d30;
                    z5 = true;
                } else {
                    d29 = i4;
                    i5 = d30;
                    z5 = false;
                }
                long j9 = c.getLong(i5);
                d30 = i5;
                int i25 = d31;
                long j10 = c.getLong(i25);
                d31 = i25;
                int i26 = d32;
                d32 = i26;
                arrayList.add(new cvu(string2, y2, string3, string4, a2, a3, j, j2, j3, new cpl(n, w, z2, z3, z4, z5, j9, j10, bpl.o(c.getBlob(i26))), i7, v, j4, j5, j6, j7, z, x, i13, i15, j8, i18, i20, str));
                d = i9;
                i6 = i8;
            }
            c.close();
            cinVar.j();
            List b = B.b();
            List k = B.k();
            if (!arrayList.isEmpty()) {
                cqc.b();
                int i27 = cxv.a;
                cqc.b();
                cvfVar = y;
                cvlVar = z6;
                cwoVar = C;
                cxv.a(cvlVar, cwoVar, cvfVar, arrayList);
            } else {
                cvfVar = y;
                cvlVar = z6;
                cwoVar = C;
            }
            if (!b.isEmpty()) {
                cqc.b();
                int i28 = cxv.a;
                cqc.b();
                cxv.a(cvlVar, cwoVar, cvfVar, b);
            }
            if (!k.isEmpty()) {
                cqc.b();
                int i29 = cxv.a;
                cqc.b();
                cxv.a(cvlVar, cwoVar, cvfVar, k);
            }
            return new cqa();
        } catch (Throwable th2) {
            th = th2;
            c.close();
            cinVar.j();
            throw th;
        }
    }
}
