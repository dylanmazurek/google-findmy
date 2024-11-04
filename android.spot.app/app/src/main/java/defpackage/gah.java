package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gah implements dnp {
    public static final /* synthetic */ int a = 0;
    private static final joo b = joo.m("FifeModelLoader");
    private final dnp c;
    private final ddg d;

    static {
        new diu("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", false, new dit() { // from class: gag
            @Override // defpackage.dit
            public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
                int i = gah.a;
                if (((Boolean) obj).booleanValue()) {
                    messageDigest.update(bArr);
                }
            }
        });
    }

    public gah(dnp dnpVar) {
        new jxw();
        this.c = dnpVar;
        this.d = new ddg(2000L);
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:            r9 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:            throw r9;     */
    @Override // defpackage.dnp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ defpackage.bso b(java.lang.Object r9, int r10, int r11, defpackage.div r12) {
        /*
            r8 = this;
            gaf r9 = (defpackage.gaf) r9
            java.lang.String r0 = "FifeModelLoader.beginSection"
            defpackage.bzo.e(r0)
            joo r0 = defpackage.gah.b     // Catch: java.lang.Throwable -> L75
            jnx r0 = r0.k()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "com/google/android/libraries/glide/fife/FifeModelLoader"
            java.lang.String r2 = "buildLoadData"
            java.lang.String r3 = "FifeModelLoader.java"
            r4 = 132(0x84, float:1.85E-43)
            jnx r0 = r0.j(r1, r2, r4, r3)     // Catch: java.lang.Throwable -> L75
            jol r0 = (defpackage.jol) r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "Loading fife model, model: %s, width: %d, height: %d"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L75
            r0.z(r1, r9, r2, r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "FifeModelLoader.buildGlideUrl"
            defpackage.bzo.e(r0)     // Catch: java.lang.Throwable -> L75
            ddg r0 = r8.d     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.f(r9, r10, r11)     // Catch: java.lang.Throwable -> L70
            dnf r0 = (defpackage.dnf) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L3b
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L75
            goto L66
        L3b:
            gaj r0 = r9.a     // Catch: java.lang.Throwable -> L70
            gak r1 = r9.b     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r1.b     // Catch: java.lang.Throwable -> L70
            int r4 = r0.b(r10)     // Catch: java.lang.Throwable -> L70
            int r5 = r0.b(r11)     // Catch: java.lang.Throwable -> L70
            int r1 = r0.b     // Catch: java.lang.Throwable -> L70
            int r1 = r0.c     // Catch: java.lang.Throwable -> L70
            int r0 = r0.d     // Catch: java.lang.Throwable -> L70
            r6 = -1
            r7 = -1
            r3 = 0
            java.lang.String r0 = defpackage.iac.b(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L70
            dng r1 = defpackage.dng.a     // Catch: java.lang.Throwable -> L70
            dnf r2 = new dnf     // Catch: java.lang.Throwable -> L70
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L70
            ddg r0 = r8.d     // Catch: java.lang.Throwable -> L70
            r0.g(r9, r10, r11, r2)     // Catch: java.lang.Throwable -> L70
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L75
            r0 = r2
        L66:
            dnp r9 = r8.c     // Catch: java.lang.Throwable -> L75
            bso r9 = r9.b(r0, r10, r11, r12)     // Catch: java.lang.Throwable -> L75
            android.os.Trace.endSection()
            return r9
        L70:
            r9 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L75
            throw r9     // Catch: java.lang.Throwable -> L75
        L75:
            r9 = move-exception
            android.os.Trace.endSection()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gah.b(java.lang.Object, int, int, div):bso");
    }
}
