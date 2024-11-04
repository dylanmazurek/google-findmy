package defpackage;

import android.app.ActivityOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rk {
    public static ActivityOptions a() {
        ActivityOptions makeBasic;
        makeBasic = ActivityOptions.makeBasic();
        return makeBasic;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0055 -> B:10:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.auy r7, defpackage.mmx r8) {
        /*
            boolean r0 = r8 instanceof defpackage.xl
            if (r0 == 0) goto L13
            r0 = r8
            xl r0 = (defpackage.xl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xl r0 = new xl
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            auy r7 = r0.c
            defpackage.mjo.o(r8)
            goto L57
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.mjo.o(r8)
            auf r8 = r7.l()
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r5 = 0
        L40:
            if (r5 >= r2) goto L73
            java.lang.Object r6 = r8.get(r5)
            aum r6 = (defpackage.aum) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L70
        L4c:
            r0.c = r7
            r0.b = r4
            r8 = 3
            java.lang.Object r8 = r7.q(r8, r0)
            if (r8 == r1) goto L6f
        L57:
            auf r8 = (defpackage.auf) r8
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r5 = 0
        L60:
            if (r5 >= r2) goto L73
            java.lang.Object r6 = r8.get(r5)
            aum r6 = (defpackage.aum) r6
            boolean r6 = r6.d
            if (r6 != 0) goto L4c
            int r5 = r5 + 1
            goto L60
        L6f:
            return r1
        L70:
            int r5 = r5 + 1
            goto L40
        L73:
            mlh r7 = defpackage.mlh.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk.b(auy, mmx):java.lang.Object");
    }

    public static final bjy c() {
        return bka.a.a();
    }

    public static final bjx d() {
        return bka.a.a().a();
    }
}
