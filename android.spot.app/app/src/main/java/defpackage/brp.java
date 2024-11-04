package defpackage;

import android.graphics.Insets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brp {
    public static Insets a(int i, int i2, int i3, int i4) {
        Insets of;
        of = Insets.of(i, i2, i3, i4);
        return of;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0084 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r7, defpackage.cat r8, defpackage.mmx r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.can
            if (r0 == 0) goto L13
            r0 = r9
            can r0 = (defpackage.can) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            can r0 = new can
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.b
            java.lang.Object r8 = r0.a
            mpn r8 = (defpackage.mpn) r8
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L30
            goto L64
        L30:
            r9 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.a
            java.util.List r7 = (java.util.List) r7
            defpackage.mjo.o(r9)
            goto L5b
        L42:
            defpackage.mjo.o(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            cap r2 = new cap
            r5 = 0
            r2.<init>(r7, r9, r5)
            r0.a = r9
            r0.d = r4
            java.lang.Object r7 = r8.a(r2, r0)
            if (r7 == r1) goto L94
            r7 = r9
        L5b:
            mpn r8 = new mpn
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()
            moh r9 = (defpackage.moh) r9
            r0.a = r8     // Catch: java.lang.Throwable -> L30
            r0.b = r7     // Catch: java.lang.Throwable -> L30
            r0.d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L64
            return r1
        L7d:
            java.lang.Object r2 = r8.a
            if (r2 != 0) goto L84
            r8.a = r9
            goto L64
        L84:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            defpackage.mjo.l(r2, r9)
            goto L64
        L8a:
            java.lang.Object r7 = r8.a
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 != 0) goto L93
            mlh r7 = defpackage.mlh.a
            return r7
        L93:
            throw r7
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brp.b(java.util.List, cat, mmx):java.lang.Object");
    }
}
