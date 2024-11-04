package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eft implements jfe {
    private final /* synthetic */ int a;

    public /* synthetic */ eft(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:            if (r0.importance >= 400) goto L62;     */
    @Override // defpackage.jfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r6 = this;
            int r0 = r6.a
            r1 = 1
            java.lang.String r2 = "No device present in SpotRingingViewModel."
            java.lang.String r3 = "lambda$getDevice$2"
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L98;
                case 2: goto L95;
                case 3: goto L7b;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                case 7: goto L7a;
                case 8: goto L74;
                case 9: goto L6e;
                case 10: goto L69;
                case 11: goto L64;
                case 12: goto L49;
                case 13: goto L43;
                case 14: goto L34;
                case 15: goto L15;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L15:
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)     // Catch: java.lang.RuntimeException -> L26
            int r2 = r0.importance
            int r0 = r0.importance
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L2e
            goto L2f
        L26:
            r0 = move-exception
            java.lang.String r1 = "PhenotypeProcessReaper"
            java.lang.String r2 = "Failed to retrieve memory state, not killing process."
            android.util.Log.w(r1, r2, r0)
        L2e:
            r1 = 0
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L34:
            hgy r0 = new hgy
            r1 = 2
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            jzd r0 = defpackage.ivc.z(r0)
            return r0
        L43:
            nel r0 = new nel
            r0.<init>()
            return r0
        L49:
            boolean r0 = android.app.ActivityManager.isUserAMonkey()
            if (r0 == 0) goto L50
            goto L5f
        L50:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L5b
            boolean r1 = android.app.ActivityManager.isRunningInTestHarness()
            goto L5f
        L5b:
            boolean r1 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m159m$2()
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L64:
            jer r0 = defpackage.hry.a()
            return r0
        L69:
            java.util.concurrent.ThreadFactory r0 = defpackage.hog.Q()
            return r0
        L6e:
            hin r0 = new hin
            r0.<init>()
            return r0
        L74:
            hio r0 = new hio
            r0.<init>()
            return r0
        L7a:
            return r5
        L7b:
            jnk r0 = defpackage.elq.a
            jnx r0 = r0.f()
            jni r0 = (defpackage.jni) r0
            java.lang.String r1 = "com/google/android/apps/adm/integrations/spot/SpotRingingViewModelDelegate"
            r4 = 150(0x96, float:2.1E-43)
            java.lang.String r5 = "SpotRingingViewModelDelegate.java"
            jnx r0 = r0.j(r1, r3, r4, r5)
            jni r0 = (defpackage.jni) r0
            r0.r(r2)
            lqc r0 = defpackage.lqc.j
            return r0
        L95:
            lqd r0 = defpackage.lqd.d
            return r0
        L98:
            dzo r0 = new dzo
            r0.<init>()
            return r0
        L9e:
            jnk r0 = defpackage.efu.a
            jnx r0 = r0.f()
            jni r0 = (defpackage.jni) r0
            java.lang.String r1 = "com/google/android/apps/adm/integrations/android/AndroidRingingViewModelDelegate"
            r4 = 130(0x82, float:1.82E-43)
            java.lang.String r5 = "AndroidRingingViewModelDelegate.java"
            jnx r0 = r0.j(r1, r3, r4, r5)
            jni r0 = (defpackage.jni) r0
            r0.r(r2)
            lqc r0 = defpackage.lqc.j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eft.a():java.lang.Object");
    }
}
