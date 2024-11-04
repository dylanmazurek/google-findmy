package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glf implements moh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public glf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        cji l;
        int i = this.b;
        if (i != 0) {
            int i2 = 7;
            if (i != 1) {
                ddh ddhVar = (ddh) obj;
                ddhVar.getClass();
                ?? r11 = this.a;
                l = ddhVar.l("INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    int size = r11.size();
                    Long[] lArr = new Long[size];
                    int i3 = 0;
                    while (i3 < size) {
                        goa goaVar = (goa) r11.get(i3);
                        l.e(1, goaVar.a);
                        String str = goaVar.b;
                        if (str == null) {
                            l.f(2);
                        } else {
                            l.g(2, str);
                        }
                        int i4 = goaVar.o;
                        if (i4 != 0) {
                            l.e(3, i4);
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
                            l.e(i2, goaVar.f);
                            String str5 = goaVar.g;
                            if (str5 == null) {
                                l.f(8);
                            } else {
                                l.g(8, str5);
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
                            l.k();
                            l.i();
                            lArr[i3] = Long.valueOf(bxd.c(ddhVar));
                            i3++;
                            i2 = 7;
                        } else {
                            throw null;
                        }
                    }
                    return lArr;
                } finally {
                }
            }
            ddh ddhVar2 = (ddh) obj;
            ddhVar2.getClass();
            Object obj2 = this.a;
            l = ddhVar2.l("INSERT OR IGNORE INTO `chime_thread_states` (`id`,`thread_id`,`last_updated_version`,`read_state`,`deletion_status`,`count_behavior`,`system_tray_behavior`,`modified_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)");
            try {
                l.e(1, ((gks) obj2).a);
                String str8 = ((gks) obj2).b;
                if (str8 == null) {
                    l.f(2);
                } else {
                    l.g(2, str8);
                }
                l.e(3, ((gks) obj2).c);
                int i5 = ((gks) obj2).e;
                int i6 = i5 - 1;
                if (i5 != 0) {
                    l.e(4, i6);
                    int i7 = ((gks) obj2).f;
                    int i8 = i7 - 1;
                    if (i7 != 0) {
                        l.e(5, i8);
                        int i9 = ((gks) obj2).g;
                        int i10 = i9 - 1;
                        if (i9 != 0) {
                            l.e(6, i10);
                            int i11 = ((gks) obj2).h;
                            int i12 = i11 - 1;
                            if (i11 != 0) {
                                l.e(7, i12);
                                l.e(8, ((gks) obj2).d);
                                l.k();
                                l.h();
                                return Long.valueOf(bxd.c(ddhVar2));
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
        Object obj3 = null;
        l = ((ddh) obj).l("SELECT * FROM chime_thread_states WHERE thread_id = ?");
        try {
            Object obj4 = this.a;
            if (obj4 == null) {
                l.f(1);
            } else {
                l.g(1, (String) obj4);
            }
            int c = bxz.c(l, "id");
            int c2 = bxz.c(l, "thread_id");
            int c3 = bxz.c(l, "last_updated_version");
            int c4 = bxz.c(l, "read_state");
            int c5 = bxz.c(l, "deletion_status");
            int c6 = bxz.c(l, "count_behavior");
            int c7 = bxz.c(l, "system_tray_behavior");
            int c8 = bxz.c(l, "modified_timestamp");
            if (l.k()) {
                long b = l.b(c);
                if (!l.j(c2)) {
                    obj3 = l.d(c2);
                }
                obj3 = gks.b(b, obj3, l.b(c3), kzy.e((int) l.b(c4)), a.w((int) l.b(c5)), a.w((int) l.b(c6)), a.w((int) l.b(c7)), l.b(c8));
            }
            return obj3;
        } finally {
        }
    }
}
