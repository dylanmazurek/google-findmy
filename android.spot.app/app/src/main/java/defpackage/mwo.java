package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwo implements mwv {
    private final mol a;

    public mwo() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.mwv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.mww r6, defpackage.mmx r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.mwn
            if (r0 == 0) goto L13
            r0 = r7
            mwn r0 = (defpackage.mwn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mwn r0 = new mwn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            mzv r6 = r0.d
            defpackage.mjo.o(r7)     // Catch: java.lang.Throwable -> L29
            goto L52
        L29:
            r7 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.mjo.o(r7)
            mzv r7 = new mzv
            mnb r2 = r0.o()
            r7.<init>(r6, r2)
            r0.d = r7     // Catch: java.lang.Throwable -> L59
            r0.c = r3     // Catch: java.lang.Throwable -> L59
            mol r6 = r5.a     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L59
            mne r0 = defpackage.mne.a     // Catch: java.lang.Throwable -> L59
            if (r6 == r0) goto L4f
            mlh r6 = defpackage.mlh.a     // Catch: java.lang.Throwable -> L59
        L4f:
            if (r6 == r1) goto L58
            r6 = r7
        L52:
            r6.f()
            mlh r6 = defpackage.mlh.a
            return r6
        L58:
            return r1
        L59:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5d:
            r6.f()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwo.a(mww, mmx):java.lang.Object");
    }

    public mwo(mol molVar) {
        this.a = molVar;
    }
}
