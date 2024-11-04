package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgr {
    public static final aep a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:            r1 = r1.invoke(null, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:            if ((r1 instanceof defpackage.aep) == false) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:            r1 = (defpackage.aep) r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:            r1 = null;     */
    static {
        /*
            r0 = 0
            java.lang.Class<cfc> r1 = defpackage.cfc.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L34
            r1.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L34
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L34
            int r3 = r2.length     // Catch: java.lang.Throwable -> L34
            r4 = 0
        L1c:
            if (r4 >= r3) goto L29
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L34
            boolean r5 = r5 instanceof defpackage.mkp     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L26
        L24:
            r1 = r0
            goto L39
        L26:
            int r4 = r4 + 1
            goto L1c
        L29:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L34
            boolean r2 = r1 instanceof defpackage.aep     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L24
            aep r1 = (defpackage.aep) r1     // Catch: java.lang.Throwable -> L34
            goto L39
        L34:
            r1 = move-exception
            java.lang.Object r1 = defpackage.mjo.n(r1)
        L39:
            boolean r2 = r1 instanceof defpackage.mkx
            r3 = 1
            if (r3 != r2) goto L3f
            goto L40
        L3f:
            r0 = r1
        L40:
            aep r0 = (defpackage.aep) r0
            if (r0 != 0) goto L4c
            bcf r0 = defpackage.bcf.l
            agu r1 = new agu
            r1.<init>(r0)
            r0 = r1
        L4c:
            defpackage.cgr.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgr.<clinit>():void");
    }
}
