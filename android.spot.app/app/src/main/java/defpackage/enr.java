package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enr {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/clientactions/FmdSpotPublicKeyProvider");
    private final kzx b;
    private final Object c = new Object();
    private volatile jer d = jdl.a;
    private final hnu e;

    public enr(hnu hnuVar, kzx kzxVar) {
        this.e = hnuVar;
        this.b = kzxVar;
    }

    private final void b() {
        kyy kyyVar = kyy.a;
        mbg mbgVar = kzy.f;
        if (mbgVar == null) {
            synchronized (kzy.class) {
                mbgVar = kzy.f;
                if (mbgVar == null) {
                    mbd a2 = mbg.a();
                    a2.d = mbf.UNARY;
                    a2.e = mbg.c("google.internal.spot.v1.SpotService", "GetServicePublicKey");
                    a2.b();
                    kyy kyyVar2 = kyy.a;
                    lja ljaVar = mkc.a;
                    a2.b = new mkb(kyyVar2);
                    a2.c = new mkb(kyz.c);
                    mbgVar = a2.a();
                    kzy.f = mbgVar;
                }
            }
        }
        kzx kzxVar = this.b;
        this.d = jer.i(iuu.o(mkj.a(kzxVar.a.a(mbgVar, kzxVar.b), kyyVar), new ene(5), jxv.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:            if ((((defpackage.enq) defpackage.ivc.M(r9.d.c())).b + java.util.concurrent.TimeUnit.HOURS.toMillis((int) defpackage.lye.a.a().a((android.content.Context) r9.e.a))) < defpackage.fma.i().toEpochMilli()) goto L10;     */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, jyz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jyz a() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            monitor-enter(r0)
            jer r1 = r9.d     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            if (r1 == 0) goto L4a
            jer r1 = r9.d     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            java.lang.Object r1 = r1.c()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            if (r1 == 0) goto L68
            jer r1 = r9.d     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            java.lang.Object r1 = r1.c()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            java.lang.Object r1 = defpackage.ivc.M(r1)     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            enq r1 = (defpackage.enq) r1     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            long r1 = r1.b     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            hnu r4 = r9.e     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            lye r5 = defpackage.lye.a     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            lyf r5 = r5.a()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            long r4 = r5.a(r4)     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            long r4 = (long) r5     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            long r3 = r3.toMillis(r4)     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            long r1 = r1 + r3
            j$.time.Instant r3 = defpackage.fma.i()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            long r3 = r3.toEpochMilli()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L68
        L4a:
            r9.b()     // Catch: java.lang.Throwable -> L4e java.util.concurrent.ExecutionException -> L50
            goto L68
        L4e:
            r1 = move-exception
            goto L70
        L50:
            r1 = move-exception
            r8 = r1
            jnk r1 = defpackage.enr.a     // Catch: java.lang.Throwable -> L4e
            jnx r2 = r1.g()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = "com/google/android/apps/adm/integrations/spot/clientactions/FmdSpotPublicKeyProvider"
            java.lang.String r5 = "getKeysInternal"
            java.lang.String r7 = "FmdSpotPublicKeyProvider.java"
            java.lang.String r3 = "Previous execution failed; trying again"
            r6 = 81
            defpackage.der.d(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4e
            r9.b()     // Catch: java.lang.Throwable -> L4e
        L68:
            jer r1 = r9.d     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r1.c()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return r1
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enr.a():jyz");
    }
}
