package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gom implements moh {
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        String d;
        int i;
        ArrayList arrayList;
        String d2;
        String d3;
        String d4;
        String d5;
        String d6;
        String d7;
        cji l = ((ddh) obj).l("SELECT * FROM gnp_accounts");
        try {
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
            ArrayList arrayList2 = new ArrayList();
            while (l.k()) {
                long b = l.b(c);
                String str = null;
                if (l.j(c2)) {
                    i = c14;
                    arrayList = arrayList2;
                    d = null;
                } else {
                    d = l.d(c2);
                    i = c14;
                    arrayList = arrayList2;
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
                int i2 = c2;
                int i3 = c3;
                int b5 = (int) l.b(c13);
                int i4 = i;
                long b6 = l.b(i4);
                int i5 = c;
                int i6 = c15;
                if (!l.j(i6)) {
                    str = l.d(i6);
                }
                goa d8 = goa.d(b, d, B, d2, d3, d4, b2, d5, z, d7, b3, b4, b5, b6, str);
                arrayList2 = arrayList;
                arrayList2.add(d8);
                c15 = i6;
                c = i5;
                c3 = i3;
                c14 = i4;
                c2 = i2;
            }
            return arrayList2;
        } finally {
            l.h();
        }
    }
}
