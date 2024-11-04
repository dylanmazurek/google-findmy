package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cnf extends cmd {
    private static final String[] x = {"android:visibility:visibility", "android:visibility:parent"};
    public int w = 3;

    public static final void J(cmn cmnVar) {
        cmnVar.a.put("android:visibility:visibility", Integer.valueOf(cmnVar.b.getVisibility()));
        cmnVar.a.put("android:visibility:parent", cmnVar.b.getParent());
        int[] iArr = new int[2];
        cmnVar.b.getLocationOnScreen(iArr);
        cmnVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:            if (r8 == 0) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:            if (r0.e == null) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:            if (r0.c == 0) goto L39;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.cne K(defpackage.cmn r7, defpackage.cmn r8) {
        /*
            cne r0 = new cne
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L33
            java.util.Map r6 = r7.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r3
        L37:
            if (r8 == 0) goto L5a
            java.util.Map r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r3 = r8.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map r3 = r8.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r7 == 0) goto L81
            if (r8 == 0) goto L81
            int r7 = r0.c
            int r8 = r0.d
            if (r7 != r8) goto L6f
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 == r4) goto L95
        L6f:
            if (r7 == r8) goto L77
            if (r7 != 0) goto L74
            goto L92
        L74:
            if (r8 != 0) goto L95
            goto L87
        L77:
            android.view.ViewGroup r7 = r0.f
            if (r7 != 0) goto L7c
            goto L92
        L7c:
            android.view.ViewGroup r7 = r0.e
            if (r7 != 0) goto L95
            goto L87
        L81:
            if (r7 != 0) goto L8c
            int r7 = r0.d
            if (r7 != 0) goto L8c
        L87:
            r0.b = r2
        L89:
            r0.a = r2
            goto L95
        L8c:
            if (r8 != 0) goto L95
            int r7 = r0.c
            if (r7 != 0) goto L95
        L92:
            r0.b = r1
            goto L89
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnf.K(cmn, cmn):cne");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    @Override // defpackage.cmd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r21, defpackage.cmn r22, defpackage.cmn r23) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnf.a(android.view.ViewGroup, cmn, cmn):android.animation.Animator");
    }

    @Override // defpackage.cmd
    public void b(cmn cmnVar) {
        J(cmnVar);
    }

    @Override // defpackage.cmd
    public void c(cmn cmnVar) {
        J(cmnVar);
    }

    @Override // defpackage.cmd
    public final String[] d() {
        return x;
    }

    public Animator e(View view, cmn cmnVar) {
        return null;
    }

    public Animator f(View view, cmn cmnVar, cmn cmnVar2) {
        throw null;
    }

    @Override // defpackage.cmd
    public final boolean w(cmn cmnVar, cmn cmnVar2) {
        if (cmnVar == null && cmnVar2 == null) {
            return false;
        }
        if (cmnVar != null && cmnVar2 != null) {
            if (cmnVar2.a.containsKey("android:visibility:visibility") != cmnVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        cne K = K(cmnVar, cmnVar2);
        if (!K.a) {
            return false;
        }
        if (K.c != 0 && K.d != 0) {
            return false;
        }
        return true;
    }
}
