package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iol extends cah {
    final /* synthetic */ BottomSheetBehavior a;

    public iol(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.cah
    public final void c(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.x) {
                bottomSheetBehavior.I(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:            if (r7 > r5.a.r) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:            if (java.lang.Math.abs(r6.getTop() - r5.a.u()) < java.lang.Math.abs(r6.getTop() - r5.a.r)) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:            if (java.lang.Math.abs(r7 - r8.r) < java.lang.Math.abs(r7 - r8.t)) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:            if (java.lang.Math.abs(r7 - r8.q) < java.lang.Math.abs(r7 - r8.t)) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:            if (r7 < java.lang.Math.abs(r7 - r8.t)) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:            if (java.lang.Math.abs(r7 - r2) < java.lang.Math.abs(r7 - r8.t)) goto L51;     */
    @Override // defpackage.cah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iol.d(android.view.View, float, float):void");
    }

    @Override // defpackage.cah
    public final boolean e(View view, int i) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.y;
        if (i2 == 1 || bottomSheetBehavior.G) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.F == i) {
            WeakReference weakReference = bottomSheetBehavior.E;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = this.a.C;
        if (weakReference2 == null || weakReference2.get() != view) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cah
    public final int f(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.cah
    public final int g(View view, int i) {
        return bpv.e(i, this.a.u(), h());
    }

    @Override // defpackage.cah
    public final int h() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior.M()) {
            return bottomSheetBehavior.B;
        }
        return bottomSheetBehavior.t;
    }

    @Override // defpackage.cah
    public final void i(View view, int i, int i2) {
        this.a.A(i2);
    }
}
