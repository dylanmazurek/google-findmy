package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcn extends mnp implements mol {
    Object a;
    Object b;
    int c;
    final /* synthetic */ mvy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcn(mvy mvyVar, mmx mmxVar) {
        super(2, mmxVar);
        this.d = mvyVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bcn) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:5:0x000a, B:6:0x002b, B:8:0x0033, B:9:0x001a, B:17:0x0015), top: B:2:0x0004 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:6:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            mne r0 = defpackage.mne.a
            int r1 = r4.c
            if (r1 == 0) goto L10
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.mjo.o(r5)     // Catch: java.lang.Throwable -> Le
            goto L2b
        Le:
            r5 = move-exception
            goto L4d
        L10:
            defpackage.mjo.o(r5)
            mvy r2 = r4.d
            mvq r5 = r2.A()     // Catch: java.lang.Throwable -> Le
            r1 = r5
        L1a:
            r4.a = r2     // Catch: java.lang.Throwable -> Le
            r4.b = r1     // Catch: java.lang.Throwable -> Le
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> Le
            r5 = r1
            mvq r5 = (defpackage.mvq) r5     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Throwable -> Le
            if (r5 != r0) goto L2b
            return r0
        L2b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Le
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r5 == 0) goto L46
            r5 = r1
            mvq r5 = (defpackage.mvq) r5     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Le
            mlh r5 = (defpackage.mlh) r5     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.bcp.b     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> Le
            defpackage.amy.h()     // Catch: java.lang.Throwable -> Le
            goto L1a
        L46:
            r5 = 0
            defpackage.moz.as(r2, r5)
            mlh r5 = defpackage.mlh.a
            return r5
        L4d:
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            defpackage.moz.as(r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new bcn(this.d, mmxVar);
    }
}
