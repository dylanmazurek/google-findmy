package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gon implements moh {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public gon(int i, String str, int i2) {
        this.c = i2;
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        cji l;
        String d;
        String d2;
        String d3;
        String d4;
        String d5;
        String d6;
        String d7;
        if (this.c != 0) {
            l = ((ddh) obj).l("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
            try {
                l.e(1, this.b);
                l.g(2, this.a);
                int c = bxz.c(l, "id");
                int c2 = bxz.c(l, "account_specific_id");
                int c3 = bxz.c(l, "account_type");
                int c4 = bxz.c(l, "obfuscated_gaia_id");
                int c5 = bxz.c(l, "actual_account_name");
                int c6 = bxz.c(l, "actual_account_oid");
                int c7 = bxz.c(l, "registration_status");
                int c8 = bxz.c(l, "registration_id");
                int c9 = bxz.c(l, "sync_sources");
                int c10 = bxz.c(l, "representative_target_id");
                int c11 = bxz.c(l, "sync_version");
                int c12 = bxz.c(l, "last_registration_time_ms");
                int c13 = bxz.c(l, "last_registration_request_hash");
                int c14 = bxz.c(l, "first_registration_version");
                int c15 = bxz.c(l, "internal_target_id");
                Object obj2 = null;
                if (l.k()) {
                    long b = l.b(c);
                    if (l.j(c2)) {
                        d = null;
                    } else {
                        d = l.d(c2);
                    }
                    int B = frx.B((int) l.b(c3));
                    if (l.j(c4)) {
                        d2 = null;
                    } else {
                        d2 = l.d(c4);
                    }
                    if (l.j(c5)) {
                        d3 = null;
                    } else {
                        d3 = l.d(c5);
                    }
                    if (l.j(c6)) {
                        d4 = null;
                    } else {
                        d4 = l.d(c6);
                    }
                    int b2 = (int) l.b(c7);
                    if (l.j(c8)) {
                        d5 = null;
                    } else {
                        d5 = l.d(c8);
                    }
                    if (l.j(c9)) {
                        d6 = null;
                    } else {
                        d6 = l.d(c9);
                    }
                    jjr z = frx.z(d6);
                    if (l.j(c10)) {
                        d7 = null;
                    } else {
                        d7 = l.d(c10);
                    }
                    long b3 = l.b(c11);
                    long b4 = l.b(c12);
                    int b5 = (int) l.b(c13);
                    long b6 = l.b(c14);
                    if (!l.j(c15)) {
                        obj2 = l.d(c15);
                    }
                    obj2 = goa.d(b, d, B, d2, d3, d4, b2, d5, z, d7, b3, b4, b5, b6, obj2);
                }
                return obj2;
            } finally {
            }
        }
        ddh ddhVar = (ddh) obj;
        l = ddhVar.l("DELETE FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
        try {
            l.e(1, this.b);
            l.g(2, this.a);
            l.k();
            return Integer.valueOf(bxd.b(ddhVar));
        } finally {
        }
    }
}
