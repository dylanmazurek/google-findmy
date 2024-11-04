package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwn implements cvv {
    public final cih a;
    public final chl b;
    public final chk c;
    public final cio d;
    public final cio e;
    public final cio f;
    public final cio g;
    public final cio h;
    private final cio i;
    private final cio j;
    private final cio k;
    private final cio l;
    private final cio m;
    private final cio n;
    private final cio o;

    public cwn(cih cihVar) {
        this.a = cihVar;
        this.b = new cwe(cihVar);
        this.c = new chk(cihVar);
        this.i = new cwg(cihVar);
        this.j = new cwh(cihVar);
        this.d = new cwi(cihVar);
        this.e = new cwj(cihVar);
        this.k = new cwk(cihVar);
        this.l = new cwl(cihVar);
        this.f = new cwm(cihVar);
        this.g = new cvw(cihVar);
        new cvx(cihVar);
        this.m = new cvy(cihVar);
        this.n = new cvz(cihVar);
        this.h = new cwa(cihVar);
        new cwb(cihVar);
        new cwc(cihVar);
        this.o = new cwd(cihVar);
    }

    @Override // defpackage.cvv
    public final cvu a(String str) {
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
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        cin a = cin.a("SELECT * FROM workspec WHERE id=?", 1);
        a.g(1, str);
        this.a.l();
        Cursor c = bwp.c(this.a, a);
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
            cvu cvuVar = null;
            String string = null;
            if (c.moveToFirst()) {
                String string2 = c.getString(d);
                int y = bpl.y(c.getInt(d2));
                String string3 = c.getString(d3);
                String string4 = c.getString(d4);
                cpn a2 = cpn.a(c.getBlob(d5));
                cpn a3 = cpn.a(c.getBlob(d6));
                long j = c.getLong(d7);
                long j2 = c.getLong(d8);
                long j3 = c.getLong(d9);
                int i6 = c.getInt(d10);
                int v = bpl.v(c.getInt(d11));
                long j4 = c.getLong(d12);
                long j5 = c.getLong(d13);
                long j6 = c.getLong(d14);
                long j7 = c.getLong(d15);
                if (c.getInt(d16) != 0) {
                    i = d17;
                    z = true;
                } else {
                    i = d17;
                    z = false;
                }
                int x = bpl.x(c.getInt(i));
                int i7 = c.getInt(d18);
                int i8 = c.getInt(d19);
                long j8 = c.getLong(d20);
                int i9 = c.getInt(d21);
                int i10 = c.getInt(d22);
                if (!c.isNull(d23)) {
                    string = c.getString(d23);
                }
                String str2 = string;
                int w = bpl.w(c.getInt(d24));
                cxa n = bpl.n(c.getBlob(d25));
                if (c.getInt(d26) != 0) {
                    i2 = d27;
                    z2 = true;
                } else {
                    i2 = d27;
                    z2 = false;
                }
                if (c.getInt(i2) != 0) {
                    i3 = d28;
                    z3 = true;
                } else {
                    i3 = d28;
                    z3 = false;
                }
                if (c.getInt(i3) != 0) {
                    i4 = d29;
                    z4 = true;
                } else {
                    i4 = d29;
                    z4 = false;
                }
                if (c.getInt(i4) != 0) {
                    i5 = d30;
                    z5 = true;
                } else {
                    i5 = d30;
                    z5 = false;
                }
                cvuVar = new cvu(string2, y, string3, string4, a2, a3, j, j2, j3, new cpl(n, w, z2, z3, z4, z5, c.getLong(i5), c.getLong(d31), bpl.o(c.getBlob(d32))), i6, v, j4, j5, j6, j7, z, x, i7, i8, j8, i9, i10, str2);
            }
            c.close();
            cinVar.j();
            return cvuVar;
        } catch (Throwable th2) {
            th = th2;
            c.close();
            cinVar.j();
            throw th;
        }
    }

    @Override // defpackage.cvv
    public final List b() {
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
        cih cihVar = this.a;
        cin a = cin.a("SELECT * FROM workspec WHERE state=1", 0);
        cihVar.l();
        Cursor c = bwp.c(this.a, a);
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
                int y = bpl.y(c.getInt(d2));
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
                arrayList.add(new cvu(string2, y, string3, string4, a2, a3, j, j2, j3, new cpl(n, w, z2, z3, z4, z5, j9, j10, bpl.o(c.getBlob(i26))), i7, v, j4, j5, j6, j7, z, x, i13, i15, j8, i18, i20, str));
                d = i9;
                i6 = i8;
            }
            c.close();
            cinVar.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c.close();
            cinVar.j();
            throw th;
        }
    }

    @Override // defpackage.cvv
    public final List c() {
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
        cih cihVar = this.a;
        cin a = cin.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        cihVar.l();
        Cursor c = bwp.c(this.a, a);
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
                int y = bpl.y(c.getInt(d2));
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
                arrayList.add(new cvu(string2, y, string3, string4, a2, a3, j, j2, j3, new cpl(n, w, z2, z3, z4, z5, j9, j10, bpl.o(c.getBlob(i26))), i7, v, j4, j5, j6, j7, z, x, i13, i15, j8, i18, i20, str));
                d = i9;
                i6 = i8;
            }
            c.close();
            cinVar.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c.close();
            cinVar.j();
            throw th;
        }
    }

    @Override // defpackage.cvv
    public final List d(String str) {
        cin a = cin.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        a.g(1, str);
        this.a.l();
        Cursor c = bwp.c(this.a, a);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(new cvt(c.getString(0), bpl.y(c.getInt(1))));
            }
            return arrayList;
        } finally {
            c.close();
            a.j();
        }
    }

    @Override // defpackage.cvv
    public final void e(String str) {
        this.a.l();
        cks d = this.i.d();
        d.g(1, str);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.i.f(d);
        }
    }

    @Override // defpackage.cvv
    public final void f(String str, int i) {
        this.a.l();
        cks d = this.m.d();
        d.g(1, str);
        d.e(2, i);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.m.f(d);
        }
    }

    @Override // defpackage.cvv
    public final void g(String str, long j) {
        this.a.l();
        cks d = this.l.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.l.f(d);
        }
    }

    @Override // defpackage.cvv
    public final void h(String str, cpn cpnVar) {
        this.a.l();
        cks d = this.k.d();
        d.c(1, box.h(cpnVar));
        d.g(2, str);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.k.f(d);
        }
    }

    @Override // defpackage.cvv
    public final void i(String str, int i) {
        this.a.l();
        long j = i;
        cks d = this.o.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.o.f(d);
        }
    }

    @Override // defpackage.cvv
    public final int j(String str) {
        Integer valueOf;
        cin a = cin.a("SELECT state FROM workspec WHERE id=?", 1);
        a.g(1, str);
        this.a.l();
        Cursor c = bwp.c(this.a, a);
        try {
            int i = 0;
            if (c.moveToFirst()) {
                if (c.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(c.getInt(0));
                }
                if (valueOf != null) {
                    i = bpl.y(valueOf.intValue());
                }
            }
            return i;
        } finally {
            c.close();
            a.j();
        }
    }

    @Override // defpackage.cvv
    public final List k() {
        cin cinVar;
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
        cin a = cin.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        a.e(1, 200L);
        this.a.l();
        Cursor c = bwp.c(this.a, a);
        try {
            int d = bwj.d(c, "id");
            int d2 = bwj.d(c, "state");
            int d3 = bwj.d(c, "worker_class_name");
            int d4 = bwj.d(c, "input_merger_class_name");
            int d5 = bwj.d(c, "input");
            int d6 = bwj.d(c, "output");
            int d7 = bwj.d(c, "initial_delay");
            int d8 = bwj.d(c, "interval_duration");
            int d9 = bwj.d(c, "flex_duration");
            int d10 = bwj.d(c, "run_attempt_count");
            int d11 = bwj.d(c, "backoff_policy");
            int d12 = bwj.d(c, "backoff_delay_duration");
            int d13 = bwj.d(c, "last_enqueue_time");
            int d14 = bwj.d(c, "minimum_retention_duration");
            cinVar = a;
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
                    int y = bpl.y(c.getInt(d2));
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
                    arrayList.add(new cvu(string2, y, string3, string4, a2, a3, j, j2, j3, new cpl(n, w, z2, z3, z4, z5, j9, j10, bpl.o(c.getBlob(i26))), i7, v, j4, j5, j6, j7, z, x, i13, i15, j8, i18, i20, str));
                    d = i9;
                    i6 = i8;
                }
                c.close();
                cinVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                cinVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cinVar = a;
        }
    }

    @Override // defpackage.cvv
    public final void l(String str, long j) {
        this.a.l();
        cks d = this.n.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.n.f(d);
        }
    }

    @Override // defpackage.cvv
    public final void m(int i, String str) {
        this.a.l();
        cks d = this.j.d();
        d.e(1, bpl.u(i));
        d.g(2, str);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.j.f(d);
        }
    }
}
