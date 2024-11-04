package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glg implements moh {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public glg(gli gliVar, gks gksVar, int i) {
        this.c = i;
        this.a = gksVar;
        this.b = gliVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        cji l;
        String d;
        int i = this.c;
        int i2 = 0;
        int i3 = 1;
        if (i != 0) {
            int i4 = 8;
            if (i != 1) {
                ddh ddhVar = (ddh) obj;
                ddhVar.getClass();
                ?? r13 = this.b;
                l = ddhVar.l("UPDATE OR REPLACE `gnp_accounts` SET `id` = ?,`account_specific_id` = ?,`account_type` = ?,`obfuscated_gaia_id` = ?,`actual_account_name` = ?,`actual_account_oid` = ?,`registration_status` = ?,`registration_id` = ?,`sync_sources` = ?,`representative_target_id` = ?,`sync_version` = ?,`last_registration_time_ms` = ?,`last_registration_request_hash` = ?,`first_registration_version` = ?,`internal_target_id` = ? WHERE `id` = ?");
                try {
                    for (goa goaVar : r13) {
                        l.e(1, goaVar.a);
                        String str = goaVar.b;
                        if (str == null) {
                            l.f(2);
                        } else {
                            l.g(2, str);
                        }
                        int i5 = goaVar.o;
                        if (i5 != 0) {
                            l.e(3, i5);
                            String str2 = goaVar.c;
                            if (str2 == null) {
                                l.f(4);
                            } else {
                                l.g(4, str2);
                            }
                            String str3 = goaVar.d;
                            if (str3 == null) {
                                l.f(5);
                            } else {
                                l.g(5, str3);
                            }
                            String str4 = goaVar.e;
                            if (str4 == null) {
                                l.f(6);
                            } else {
                                l.g(6, str4);
                            }
                            l.e(7, goaVar.f);
                            String str5 = goaVar.g;
                            if (str5 == null) {
                                l.f(i4);
                            } else {
                                l.g(i4, str5);
                            }
                            l.g(9, frx.A(goaVar.h));
                            String str6 = goaVar.i;
                            if (str6 == null) {
                                l.f(10);
                            } else {
                                l.g(10, str6);
                            }
                            l.e(11, goaVar.j);
                            l.e(12, goaVar.k);
                            l.e(13, goaVar.l);
                            l.e(14, goaVar.m);
                            String str7 = goaVar.n;
                            if (str7 == null) {
                                l.f(15);
                            } else {
                                l.g(15, str7);
                            }
                            l.e(16, goaVar.a);
                            l.k();
                            l.i();
                            i2 += bxd.b(ddhVar);
                            i4 = 8;
                        } else {
                            throw null;
                        }
                    }
                    l.h();
                    return Integer.valueOf(i2);
                } finally {
                }
            }
            ddh ddhVar2 = (ddh) obj;
            ddhVar2.getClass();
            Object obj2 = this.a;
            l = ddhVar2.l("UPDATE OR ABORT `chime_thread_states` SET `id` = ?,`thread_id` = ?,`last_updated_version` = ?,`read_state` = ?,`deletion_status` = ?,`count_behavior` = ?,`system_tray_behavior` = ?,`modified_timestamp` = ? WHERE `id` = ?");
            try {
                l.e(1, ((gks) obj2).a);
                String str8 = ((gks) obj2).b;
                if (str8 == null) {
                    l.f(2);
                } else {
                    l.g(2, str8);
                }
                l.e(3, ((gks) obj2).c);
                int i6 = ((gks) obj2).e;
                int i7 = i6 - 1;
                if (i6 != 0) {
                    l.e(4, i7);
                    int i8 = ((gks) obj2).f;
                    int i9 = i8 - 1;
                    if (i8 != 0) {
                        l.e(5, i9);
                        int i10 = ((gks) obj2).g;
                        int i11 = i10 - 1;
                        if (i10 != 0) {
                            l.e(6, i11);
                            int i12 = ((gks) obj2).h;
                            int i13 = i12 - 1;
                            if (i12 != 0) {
                                l.e(7, i13);
                                l.e(8, ((gks) obj2).d);
                                l.e(9, ((gks) obj2).a);
                                l.k();
                                l.h();
                                bxd.b(ddhVar2);
                                return null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            } finally {
            }
        }
        String str9 = null;
        l = ((ddh) obj).l((String) this.a);
        try {
            Object obj3 = this.b;
            int length = ((String[]) obj3).length;
            while (i2 < length) {
                String str10 = ((String[]) obj3)[i2];
                if (str10 == null) {
                    l.f(i3);
                } else {
                    l.g(i3, str10);
                }
                i3++;
                i2++;
            }
            int c = bxz.c(l, "id");
            int c2 = bxz.c(l, "thread_id");
            int c3 = bxz.c(l, "last_updated_version");
            int c4 = bxz.c(l, "read_state");
            int c5 = bxz.c(l, "deletion_status");
            int c6 = bxz.c(l, "count_behavior");
            int c7 = bxz.c(l, "system_tray_behavior");
            int c8 = bxz.c(l, "modified_timestamp");
            ArrayList arrayList = new ArrayList();
            while (l.k()) {
                long b = l.b(c);
                if (l.j(c2)) {
                    d = str9;
                } else {
                    d = l.d(c2);
                }
                arrayList.add(gks.b(b, d, l.b(c3), kzy.e((int) l.b(c4)), a.w((int) l.b(c5)), a.w((int) l.b(c6)), a.w((int) l.b(c7)), l.b(c8)));
                str9 = null;
            }
            return arrayList;
        } finally {
        }
    }

    public glg(gok gokVar, List list, int i) {
        this.c = i;
        this.b = list;
        this.a = gokVar;
    }

    public glg(String str, String[] strArr, int i) {
        this.c = i;
        this.a = str;
        this.b = strArr;
    }
}
