package defpackage;

import android.database.Cursor;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crh {
    public static final /* synthetic */ int a = 0;

    static {
        cqc.a("Schedulers");
    }

    public static void a(hph hphVar, WorkDatabase workDatabase, List list) {
        cvv cvvVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        hph hphVar2;
        ArrayList arrayList;
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
        ArrayList arrayList2;
        int d12;
        cvv cvvVar2;
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
        cin cinVar2;
        int d15;
        int d16;
        int d17;
        int d18;
        int d19;
        int d20;
        int d21;
        int d22;
        int d23;
        int d24;
        int d25;
        int d26;
        int d27;
        int i6;
        boolean z6;
        String string2;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        if (list != null && list.size() != 0) {
            cvv B = workDatabase.B();
            workDatabase.m();
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    cin a2 = cin.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
                    ((cwn) B).a.l();
                    Cursor c = bwp.c(((cwn) B).a, a2);
                    try {
                        d15 = bwj.d(c, "id");
                        str6 = "id";
                        d16 = bwj.d(c, "state");
                        str5 = "state";
                        d17 = bwj.d(c, "worker_class_name");
                        str4 = "worker_class_name";
                        d18 = bwj.d(c, "input_merger_class_name");
                        str3 = "input_merger_class_name";
                        d19 = bwj.d(c, "input");
                        str2 = "input";
                        d20 = bwj.d(c, "output");
                        d21 = bwj.d(c, "initial_delay");
                        str = "initial_delay";
                        d22 = bwj.d(c, "interval_duration");
                        str12 = "interval_duration";
                        d23 = bwj.d(c, "flex_duration");
                        str11 = "flex_duration";
                        d24 = bwj.d(c, "run_attempt_count");
                        str10 = "run_attempt_count";
                        d25 = bwj.d(c, "backoff_policy");
                        str9 = "backoff_policy";
                        d26 = bwj.d(c, "backoff_delay_duration");
                        str8 = "backoff_delay_duration";
                        d27 = bwj.d(c, "last_enqueue_time");
                        str7 = "last_enqueue_time";
                        cinVar2 = a2;
                    } catch (Throwable th) {
                        th = th;
                        cinVar2 = a2;
                    }
                    try {
                        str18 = "minimum_retention_duration";
                        int d28 = bwj.d(c, "minimum_retention_duration");
                        str17 = "schedule_requested_at";
                        int d29 = bwj.d(c, "schedule_requested_at");
                        str16 = "run_in_foreground";
                        int d30 = bwj.d(c, "run_in_foreground");
                        str15 = "out_of_quota_policy";
                        int d31 = bwj.d(c, "out_of_quota_policy");
                        str14 = "period_count";
                        int d32 = bwj.d(c, "period_count");
                        int d33 = bwj.d(c, "generation");
                        str13 = "generation";
                        int d34 = bwj.d(c, "next_schedule_time_override");
                        int d35 = bwj.d(c, "next_schedule_time_override_generation");
                        int d36 = bwj.d(c, "stop_reason");
                        int d37 = bwj.d(c, "trace_tag");
                        int d38 = bwj.d(c, "required_network_type");
                        int d39 = bwj.d(c, "required_network_request");
                        int d40 = bwj.d(c, "requires_charging");
                        int d41 = bwj.d(c, "requires_device_idle");
                        int d42 = bwj.d(c, "requires_battery_not_low");
                        int d43 = bwj.d(c, "requires_storage_not_low");
                        int d44 = bwj.d(c, "trigger_content_update_delay");
                        int d45 = bwj.d(c, "trigger_max_content_delay");
                        int d46 = bwj.d(c, "content_uri_triggers");
                        int i11 = d33;
                        arrayList = new ArrayList(c.getCount());
                        while (c.moveToNext()) {
                            String string3 = c.getString(d15);
                            int y = bpl.y(c.getInt(d16));
                            String string4 = c.getString(d17);
                            String string5 = c.getString(d18);
                            cpn a3 = cpn.a(c.getBlob(d19));
                            cpn a4 = cpn.a(c.getBlob(d20));
                            long j = c.getLong(d21);
                            long j2 = c.getLong(d22);
                            long j3 = c.getLong(d23);
                            int i12 = c.getInt(d24);
                            int v = bpl.v(c.getInt(d25));
                            long j4 = c.getLong(d26);
                            long j5 = c.getLong(d27);
                            int i13 = d28;
                            long j6 = c.getLong(i13);
                            int i14 = d21;
                            int i15 = d29;
                            long j7 = c.getLong(i15);
                            d29 = i15;
                            int i16 = d30;
                            if (c.getInt(i16) != 0) {
                                d30 = i16;
                                i6 = d31;
                                z6 = true;
                            } else {
                                d30 = i16;
                                i6 = d31;
                                z6 = false;
                            }
                            int x = bpl.x(c.getInt(i6));
                            d31 = i6;
                            int i17 = d32;
                            int i18 = c.getInt(i17);
                            d32 = i17;
                            int i19 = i11;
                            int i20 = c.getInt(i19);
                            i11 = i19;
                            int i21 = d34;
                            long j8 = c.getLong(i21);
                            d34 = i21;
                            int i22 = d35;
                            int i23 = c.getInt(i22);
                            d35 = i22;
                            int i24 = d36;
                            int i25 = c.getInt(i24);
                            d36 = i24;
                            int i26 = d37;
                            if (c.isNull(i26)) {
                                d37 = i26;
                                string2 = null;
                            } else {
                                string2 = c.getString(i26);
                                d37 = i26;
                            }
                            int i27 = d38;
                            int w = bpl.w(c.getInt(i27));
                            d38 = i27;
                            int i28 = d39;
                            cxa n = bpl.n(c.getBlob(i28));
                            d39 = i28;
                            int i29 = d40;
                            if (c.getInt(i29) != 0) {
                                d40 = i29;
                                i7 = d41;
                                z7 = true;
                            } else {
                                d40 = i29;
                                i7 = d41;
                                z7 = false;
                            }
                            if (c.getInt(i7) != 0) {
                                d41 = i7;
                                i8 = d42;
                                z8 = true;
                            } else {
                                d41 = i7;
                                i8 = d42;
                                z8 = false;
                            }
                            if (c.getInt(i8) != 0) {
                                d42 = i8;
                                i9 = d43;
                                z9 = true;
                            } else {
                                d42 = i8;
                                i9 = d43;
                                z9 = false;
                            }
                            if (c.getInt(i9) != 0) {
                                d43 = i9;
                                i10 = d44;
                                z10 = true;
                            } else {
                                d43 = i9;
                                i10 = d44;
                                z10 = false;
                            }
                            long j9 = c.getLong(i10);
                            d44 = i10;
                            int i30 = d45;
                            long j10 = c.getLong(i30);
                            d45 = i30;
                            int i31 = d46;
                            d46 = i31;
                            arrayList.add(new cvu(string3, y, string4, string5, a3, a4, j, j2, j3, new cpl(n, w, z7, z8, z9, z10, j9, j10, bpl.o(c.getBlob(i31))), i12, v, j4, j5, j6, j7, z6, x, i18, i20, j8, i23, i25, string2));
                            d21 = i14;
                            d28 = i13;
                        }
                        c.close();
                        cinVar2.j();
                        hphVar2 = hphVar;
                        str19 = "output";
                        Object obj = hphVar2.b;
                        cvvVar = B;
                        b(cvvVar, arrayList);
                    } catch (Throwable th2) {
                        th = th2;
                        c.close();
                        cinVar2.j();
                        throw th;
                    }
                } else {
                    cvvVar = B;
                    str = "initial_delay";
                    str2 = "input";
                    str3 = "input_merger_class_name";
                    str4 = "worker_class_name";
                    str5 = "state";
                    str6 = "id";
                    str7 = "last_enqueue_time";
                    str8 = "backoff_delay_duration";
                    str9 = "backoff_policy";
                    str10 = "run_attempt_count";
                    str11 = "flex_duration";
                    str12 = "interval_duration";
                    str13 = "generation";
                    str14 = "period_count";
                    str15 = "out_of_quota_policy";
                    str16 = "run_in_foreground";
                    str17 = "schedule_requested_at";
                    str18 = "minimum_retention_duration";
                    str19 = "output";
                    hphVar2 = hphVar;
                    arrayList = null;
                }
                int i32 = hphVar2.a;
                cin a5 = cin.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                a5.e(1, i32);
                ((cwn) cvvVar).a.l();
                Cursor c2 = bwp.c(((cwn) cvvVar).a, a5);
                try {
                    d = bwj.d(c2, str6);
                    d2 = bwj.d(c2, str5);
                    d3 = bwj.d(c2, str4);
                    d4 = bwj.d(c2, str3);
                    d5 = bwj.d(c2, str2);
                    d6 = bwj.d(c2, str19);
                    d7 = bwj.d(c2, str);
                    d8 = bwj.d(c2, str12);
                    d9 = bwj.d(c2, str11);
                    d10 = bwj.d(c2, str10);
                    d11 = bwj.d(c2, str9);
                    arrayList2 = arrayList;
                    d12 = bwj.d(c2, str8);
                    cvvVar2 = cvvVar;
                    d13 = bwj.d(c2, str7);
                    d14 = bwj.d(c2, str18);
                    cinVar = a5;
                } catch (Throwable th3) {
                    th = th3;
                    cinVar = a5;
                }
                try {
                    int d47 = bwj.d(c2, str17);
                    int d48 = bwj.d(c2, str16);
                    int d49 = bwj.d(c2, str15);
                    int d50 = bwj.d(c2, str14);
                    int d51 = bwj.d(c2, str13);
                    int d52 = bwj.d(c2, "next_schedule_time_override");
                    int d53 = bwj.d(c2, "next_schedule_time_override_generation");
                    int d54 = bwj.d(c2, "stop_reason");
                    int d55 = bwj.d(c2, "trace_tag");
                    int d56 = bwj.d(c2, "required_network_type");
                    int d57 = bwj.d(c2, "required_network_request");
                    int d58 = bwj.d(c2, "requires_charging");
                    int d59 = bwj.d(c2, "requires_device_idle");
                    int d60 = bwj.d(c2, "requires_battery_not_low");
                    int d61 = bwj.d(c2, "requires_storage_not_low");
                    int d62 = bwj.d(c2, "trigger_content_update_delay");
                    int d63 = bwj.d(c2, "trigger_max_content_delay");
                    int d64 = bwj.d(c2, "content_uri_triggers");
                    int i33 = d14;
                    ArrayList arrayList3 = new ArrayList(c2.getCount());
                    while (c2.moveToNext()) {
                        String string6 = c2.getString(d);
                        int y2 = bpl.y(c2.getInt(d2));
                        String string7 = c2.getString(d3);
                        String string8 = c2.getString(d4);
                        cpn a6 = cpn.a(c2.getBlob(d5));
                        cpn a7 = cpn.a(c2.getBlob(d6));
                        long j11 = c2.getLong(d7);
                        long j12 = c2.getLong(d8);
                        long j13 = c2.getLong(d9);
                        int i34 = c2.getInt(d10);
                        int v2 = bpl.v(c2.getInt(d11));
                        long j14 = c2.getLong(d12);
                        long j15 = c2.getLong(d13);
                        int i35 = i33;
                        long j16 = c2.getLong(i35);
                        i33 = i35;
                        int i36 = d47;
                        long j17 = c2.getLong(i36);
                        d47 = i36;
                        int i37 = d48;
                        if (c2.getInt(i37) != 0) {
                            d48 = i37;
                            i = d49;
                            z = true;
                        } else {
                            d48 = i37;
                            i = d49;
                            z = false;
                        }
                        int x2 = bpl.x(c2.getInt(i));
                        d49 = i;
                        int i38 = d50;
                        int i39 = c2.getInt(i38);
                        d50 = i38;
                        int i40 = d51;
                        int i41 = c2.getInt(i40);
                        d51 = i40;
                        int i42 = d52;
                        long j18 = c2.getLong(i42);
                        d52 = i42;
                        int i43 = d53;
                        int i44 = c2.getInt(i43);
                        d53 = i43;
                        int i45 = d54;
                        int i46 = c2.getInt(i45);
                        d54 = i45;
                        int i47 = d55;
                        if (c2.isNull(i47)) {
                            d55 = i47;
                            string = null;
                        } else {
                            string = c2.getString(i47);
                            d55 = i47;
                        }
                        int i48 = d56;
                        int w2 = bpl.w(c2.getInt(i48));
                        d56 = i48;
                        int i49 = d57;
                        cxa n2 = bpl.n(c2.getBlob(i49));
                        d57 = i49;
                        int i50 = d58;
                        if (c2.getInt(i50) != 0) {
                            d58 = i50;
                            i2 = d59;
                            z2 = true;
                        } else {
                            d58 = i50;
                            i2 = d59;
                            z2 = false;
                        }
                        if (c2.getInt(i2) != 0) {
                            d59 = i2;
                            i3 = d60;
                            z3 = true;
                        } else {
                            d59 = i2;
                            i3 = d60;
                            z3 = false;
                        }
                        if (c2.getInt(i3) != 0) {
                            d60 = i3;
                            i4 = d61;
                            z4 = true;
                        } else {
                            d60 = i3;
                            i4 = d61;
                            z4 = false;
                        }
                        if (c2.getInt(i4) != 0) {
                            d61 = i4;
                            i5 = d62;
                            z5 = true;
                        } else {
                            d61 = i4;
                            i5 = d62;
                            z5 = false;
                        }
                        long j19 = c2.getLong(i5);
                        d62 = i5;
                        int i51 = d63;
                        long j20 = c2.getLong(i51);
                        d63 = i51;
                        int i52 = d64;
                        d64 = i52;
                        arrayList3.add(new cvu(string6, y2, string7, string8, a6, a7, j11, j12, j13, new cpl(n2, w2, z2, z3, z4, z5, j19, j20, bpl.o(c2.getBlob(i52))), i34, v2, j14, j15, j16, j17, z, x2, i39, i41, j18, i44, i46, string));
                    }
                    c2.close();
                    cinVar.j();
                    Object obj2 = hphVar.b;
                    b(cvvVar2, arrayList3);
                    if (arrayList2 != null) {
                        arrayList3.addAll(arrayList2);
                    }
                    List k = cvvVar2.k();
                    workDatabase.p();
                    workDatabase.n();
                    if (arrayList3.size() > 0) {
                        cvu[] cvuVarArr = (cvu[]) arrayList3.toArray(new cvu[arrayList3.size()]);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            crf crfVar = (crf) it.next();
                            if (crfVar.d()) {
                                crfVar.c(cvuVarArr);
                            }
                        }
                    }
                    if (k.size() > 0) {
                        cvu[] cvuVarArr2 = (cvu[]) k.toArray(new cvu[k.size()]);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            crf crfVar2 = (crf) it2.next();
                            if (!crfVar2.d()) {
                                crfVar2.c(cvuVarArr2);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c2.close();
                    cinVar.j();
                    throw th;
                }
            } catch (Throwable th5) {
                workDatabase.n();
                throw th5;
            }
        }
    }

    private static void b(cvv cvvVar, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cvvVar.l(((cvu) it.next()).b, currentTimeMillis);
            }
        }
    }
}
