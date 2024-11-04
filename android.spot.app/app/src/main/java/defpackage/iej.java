package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iej extends ieq {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public iej(java.util.UUID r6, int r7, int r8, defpackage.lim r9) {
        /*
            r5 = this;
            boolean r0 = r9.z()
            if (r0 == 0) goto L9
            java.lang.String r9 = "[empty]"
            goto Ld
        L9:
            java.lang.String r9 = defpackage.iji.h(r9)
        Ld:
            java.util.Locale r0 = java.util.Locale.UK
            java.lang.String r1 = defpackage.hzc.d(r8)
            r2 = 1
            if (r7 != r2) goto L19
            java.lang.String r7 = "reading"
            goto L1b
        L19:
            java.lang.String r7 = "writing"
        L1b:
            java.lang.String r6 = defpackage.idy.a(r6)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r3[r2] = r7
            r7 = 2
            r3[r7] = r6
            r6 = 3
            r3[r6] = r9
            java.lang.String r6 = "GATT Error %s when %s characteristic %s, data: %s"
            java.lang.String r6 = java.lang.String.format(r0, r6, r3)
            r5.<init>(r6)
            r5.a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iej.<init>(java.util.UUID, int, int, lim):void");
    }

    @Override // defpackage.ieq
    public final ign a(String str) {
        return new igl(str, this);
    }
}
