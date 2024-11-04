package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gps implements gpd {
    private static final joo a = joo.m("GnpSdk");
    private final goj b;
    private final grt c;

    public gps(goj gojVar, grt grtVar) {
        this.b = gojVar;
        this.c = grtVar;
    }

    @Override // defpackage.gpd
    public final goa a(lfs lfsVar) {
        String join;
        String str;
        String str2;
        if (lfsVar == null) {
            return null;
        }
        if (lvp.d()) {
            if ((lfsVar.a & 2) != 0) {
                lgo lgoVar = lfsVar.c;
                if (lgoVar == null) {
                    lgoVar = lgo.c;
                }
                str2 = lgoVar.a;
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByRtid", 155, "AndroidPayloadsHelperImpl.java")).r("Representative target id in payload is empty, can't find account");
                return null;
            }
            for (goa goaVar : this.b.b()) {
                String str3 = goaVar.i;
                if (str3 != null && str3.equals(str2)) {
                    return goaVar;
                }
            }
            ((jol) ((jol) a.g()).j("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByRtid", 165, "AndroidPayloadsHelperImpl.java")).r("No accounts matching the notification payload RTID were found");
            return null;
        }
        String str4 = lfsVar.b;
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (goa goaVar2 : this.b.b()) {
            arrayList.add(String.valueOf(goaVar2.a));
            if (TextUtils.isEmpty(goaVar2.c) && !goaVar2.c()) {
                try {
                    str = this.c.c(goaVar2.b);
                } catch (Exception e) {
                    ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getObfuscatedGaiaId", 182, "AndroidPayloadsHelperImpl.java")).t("Failed to get the obfuscated account ID for account with ID [%s].", goaVar2.a);
                }
                if (TextUtils.isEmpty(str)) {
                    ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getObfuscatedGaiaId", 175, "AndroidPayloadsHelperImpl.java")).t("AuthUtil returned empty obfuscated account ID for account with ID [%s].", goaVar2.a);
                    str = null;
                }
                if (str != null) {
                    gnz gnzVar = new gnz(goaVar2);
                    gnzVar.a = str;
                    goaVar2 = gnzVar.a();
                    this.b.e(jis.q(goaVar2));
                }
            }
            if (str4.equals(goaVar2.c)) {
                return goaVar2;
            }
        }
        jol jolVar = (jol) ((jol) a.g()).j("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByObfuscatedGaiaId", 139, "AndroidPayloadsHelperImpl.java");
        if (arrayList.isEmpty()) {
            join = "None";
        } else {
            join = TextUtils.join(", ", arrayList);
        }
        jolVar.z("The recipient [%s] is not found in SDK's storage. Accounts IDs found: [%s] (%s)", str4, join, new kwk(Integer.valueOf(arrayList.size())));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:            if (r7.b == 0) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:            if (r0.a.isEmpty() == false) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:            r7 = r7.e;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0071, code lost:            if (r7 != null) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:            r7 = defpackage.lgv.e;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0075, code lost:            r7 = defpackage.a.w(r7.d);     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007b, code lost:            if (r7 != 0) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007e, code lost:            r1 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:            if ((r1 - 1) == 2) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:            return defpackage.gpr.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006c, code lost:            if (r7.b.isEmpty() != false) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:            if (r7.d.isEmpty() == false) goto L60;     */
    @Override // defpackage.gpd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gpr b(defpackage.lfs r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L4
            goto L8a
        L4:
            int r0 = r7.a
            r1 = r0 & 4
            if (r1 == 0) goto L1a
            lgf r7 = r7.d
            if (r7 != 0) goto L10
            lgf r7 = defpackage.lgf.s
        L10:
            java.lang.String r7 = r7.d
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L8a
            goto L87
        L1a:
            r0 = r0 & 8
            if (r0 == 0) goto L8a
            lgv r0 = r7.e
            if (r0 != 0) goto L24
            lgv r0 = defpackage.lgv.e
        L24:
            int r0 = r0.a
            int r0 = defpackage.a.G(r0)
            r1 = 1
            if (r0 != 0) goto L2e
            r0 = 1
        L2e:
            r2 = 2
            r3 = 6
            r4 = 4
            if (r0 == r2) goto L3e
            r5 = 3
            if (r0 == r5) goto L3e
            if (r0 == r4) goto L3e
            r5 = 5
            if (r0 == r5) goto L3e
            if (r0 != r3) goto L8a
            r0 = 6
        L3e:
            if (r0 != r3) goto L4f
            lgn r7 = r7.f
            if (r7 != 0) goto L46
            lgn r7 = defpackage.lgn.d
        L46:
            long r0 = r7.b
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L87
            goto L8a
        L4f:
            if (r0 == r4) goto L87
            boolean r0 = defpackage.lvp.d()
            if (r0 == 0) goto L66
            lgo r0 = r7.c
            if (r0 != 0) goto L5d
            lgo r0 = defpackage.lgo.c
        L5d:
            java.lang.String r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8a
            goto L6f
        L66:
            java.lang.String r0 = r7.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6f
            goto L8a
        L6f:
            lgv r7 = r7.e
            if (r7 != 0) goto L75
            lgv r7 = defpackage.lgv.e
        L75:
            int r7 = r7.d
            int r7 = defpackage.a.w(r7)
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            r1 = r7
        L7f:
            int r1 = r1 + (-1)
            if (r1 == r2) goto L84
            goto L87
        L84:
            gpr r7 = defpackage.gpr.c
            return r7
        L87:
            gpr r7 = defpackage.gpr.b
            return r7
        L8a:
            gpr r7 = defpackage.gpr.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gps.b(lfs):gpr");
    }
}
