package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huq {
    private static final kru d = kru.f('/').e();
    public static final hup a = new huo(1);
    public static final hup b = new huo(0);
    public static final hup c = new huo(2);

    public static List a(String str) {
        return hzc.K(d.d(str), new hkn(12));
    }

    public static void b(hup hupVar, lkp lkpVar) {
        String a2 = hupVar.a(lkpVar);
        String b2 = hupVar.b(lkpVar);
        if (a2.isEmpty() && !b2.isEmpty()) {
            hupVar.c(lkpVar, knc.a(b2));
        } else {
            hupVar.c(lkpVar, null);
        }
        hupVar.d(lkpVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x014b, code lost:            if (r1 == false) goto L90;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:            if (r0.equals("Attempt to do a synchronize operation on a null object") == false) goto L90;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:            if (java.util.regex.Pattern.matches("Conflicting default method implementations .+", r0) == false) goto L90;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:            if (java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", r0) == false) goto L90;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x008c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.jva c(defpackage.jva r6) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huq.c(jva):jva");
    }
}
