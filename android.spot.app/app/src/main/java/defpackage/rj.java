package defpackage;

import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rj {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }

    public static final boolean c(auf aufVar, long j) {
        Object obj;
        List list = aufVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (a.n(((aum) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        aum aumVar = (aum) obj;
        if (aumVar != null && aumVar.d) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:            if (defpackage.lb.j(r11) != false) goto L47;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0062 -> B:10:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.auy r17, long r18, defpackage.mmx r20) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj.d(auy, long, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.auy r9, long r10, defpackage.mmx r12) {
        /*
            boolean r0 = r12 instanceof defpackage.xi
            if (r0 == 0) goto L13
            r0 = r12
            xi r0 = (defpackage.xi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xi r0 = new xi
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            mpn r9 = r0.d
            aum r10 = r0.c
            defpackage.mjo.o(r12)     // Catch: defpackage.aug -> L2d
            goto L9d
        L2d:
            r4 = r10
            goto L96
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.mjo.o(r12)
            auf r12 = r9.l()
            boolean r12 = c(r12, r10)
            if (r12 == 0) goto L46
            return r4
        L46:
            auf r12 = r9.l()
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L51:
            if (r5 >= r2) goto L66
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            aum r7 = (defpackage.aum) r7
            long r7 = r7.a
            boolean r7 = defpackage.a.n(r7, r10)
            if (r7 == 0) goto L63
            goto L67
        L63:
            int r5 = r5 + 1
            goto L51
        L66:
            r6 = r4
        L67:
            aum r6 = (defpackage.aum) r6
            if (r6 != 0) goto L6c
            return r4
        L6c:
            mpn r10 = new mpn
            r10.<init>()
            mpn r11 = new mpn
            r11.<init>()
            r11.a = r6
            bdi r12 = r9.m()
            long r7 = r12.c()
            xj r12 = new xj     // Catch: defpackage.aug -> L93
            r12.<init>(r11, r10, r4)     // Catch: defpackage.aug -> L93
            r0.c = r6     // Catch: defpackage.aug -> L93
            r0.d = r10     // Catch: defpackage.aug -> L93
            r0.b = r3     // Catch: defpackage.aug -> L93
            java.lang.Object r9 = r9.n(r7, r12, r0)     // Catch: defpackage.aug -> L93
            if (r9 == r1) goto L92
            goto L9d
        L92:
            return r1
        L93:
            r9 = r10
            r4 = r6
        L96:
            java.lang.Object r9 = r9.a
            aum r9 = (defpackage.aum) r9
            if (r9 == 0) goto L9d
            r4 = r9
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj.e(auy, long, mmx):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [moh] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(defpackage.auy r4, long r5, defpackage.moh r7, defpackage.mmx r8) {
        /*
            boolean r0 = r8 instanceof defpackage.xk
            if (r0 == 0) goto L13
            r0 = r8
            xk r0 = (defpackage.xk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xk r0 = new xk
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            auy r5 = r0.d
            defpackage.mjo.o(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.mjo.o(r8)
        L38:
            r0.d = r4
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = d(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            aum r8 = (defpackage.aum) r8
            if (r8 != 0) goto L4f
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L4f:
            boolean r5 = defpackage.lb.h(r8)
            if (r5 == 0) goto L5a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L5a:
            r7.a(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj.f(auy, long, moh, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(java.lang.Object r6, defpackage.bio r7, defpackage.biz r8) {
        /*
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 == 0) goto L8f
            r0 = 1
            boolean r1 = defpackage.a.m(r0, r0)
            r2 = 0
            if (r1 != 0) goto L13
            r1 = 2
            boolean r1 = defpackage.a.m(r0, r1)
            if (r1 == 0) goto L33
        L13:
            biz r1 = r7.a()
            boolean r1 = defpackage.amr.i(r1, r8)
            if (r1 != 0) goto L33
            biz r1 = defpackage.biz.c
            int r1 = r8.compareTo(r1)
            if (r1 < 0) goto L33
            biz r1 = r7.a()
            biz r3 = defpackage.biz.c
            int r1 = r1.compareTo(r3)
            if (r1 >= 0) goto L33
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            boolean r3 = defpackage.a.m(r0, r0)
            if (r3 != 0) goto L41
            r3 = 3
            boolean r3 = defpackage.a.m(r0, r3)
            if (r3 == 0) goto L4c
        L41:
            r7.c()
            boolean r3 = defpackage.a.m(r2, r2)
            if (r3 != 0) goto L4c
            r3 = 1
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 != 0) goto L53
            if (r1 == 0) goto L52
            goto L53
        L52:
            return r6
        L53:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L6e
            if (r3 == 0) goto L62
            boolean r7 = defpackage.a.m(r2, r0)
            if (r7 == 0) goto L62
            goto L63
        L62:
            r0 = 0
        L63:
            int r7 = defpackage.bhe.c(r1, r0)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L8f
        L6e:
            if (r1 == 0) goto L73
            int r8 = r8.g
            goto L79
        L73:
            biz r8 = r7.a()
            int r8 = r8.g
        L79:
            if (r3 == 0) goto L80
            boolean r7 = defpackage.a.m(r2, r0)
            goto L87
        L80:
            r7.c()
            boolean r7 = defpackage.a.m(r2, r0)
        L87:
            bji r0 = defpackage.bji.a
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r6 = r0.a(r6, r8, r7)
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj.g(java.lang.Object, bio, biz):java.lang.Object");
    }

    public static /* synthetic */ bio h(bym bymVar, bjn bjnVar, biz bizVar) {
        return new bid((String) bymVar.a, bjnVar, bizVar);
    }
}
