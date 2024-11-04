package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioc extends cah {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public ioc(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.cah
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.cah
    public final void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            this.a.b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            this.a.b = false;
        }
    }

    @Override // defpackage.cah
    public final void c(int i) {
        njz njzVar = this.a.f;
        if (njzVar != null) {
            if (i != 0) {
                iwn.a().e(((iwh) njzVar.a).u);
            } else {
                iwn.a().f(((iwh) njzVar.a).u);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:            if (java.lang.Math.abs(r7.getLeft() - r6.b) >= java.lang.Math.round(r7.getWidth() * 0.5f)) goto L22;     */
    @Override // defpackage.cah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r9 = -1
            r6.c = r9
            r9 = 1
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            int r2 = r7.getWidth()
            if (r1 == 0) goto L2f
            int r3 = r7.getLayoutDirection()
            com.google.android.material.behavior.SwipeDismissBehavior r4 = r6.a
            int r4 = r4.c
            r5 = 2
            if (r4 != r5) goto L19
            goto L49
        L19:
            if (r4 != 0) goto L25
            if (r3 != r9) goto L22
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 < 0) goto L49
            goto L5d
        L22:
            if (r1 <= 0) goto L5d
            goto L49
        L25:
            if (r3 != r9) goto L2a
            if (r1 <= 0) goto L5d
            goto L49
        L2a:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 >= 0) goto L5d
            goto L49
        L2f:
            int r1 = r7.getLeft()
            int r3 = r6.b
            int r1 = r1 - r3
            int r3 = r7.getWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r3) goto L5d
        L49:
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 < 0) goto L58
            int r8 = r7.getLeft()
            int r0 = r6.b
            if (r8 >= r0) goto L56
            goto L58
        L56:
            int r0 = r0 + r2
            goto L60
        L58:
            int r8 = r6.b
            int r0 = r8 - r2
            goto L60
        L5d:
            int r0 = r6.b
            r9 = 0
        L60:
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            cai r8 = r8.a
            int r1 = r7.getTop()
            boolean r8 = r8.i(r0, r1)
            if (r8 == 0) goto L79
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            iod r0 = new iod
            r0.<init>(r8, r7, r9)
            r7.postOnAnimation(r0)
            return
        L79:
            if (r9 == 0) goto L84
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            njz r8 = r8.f
            if (r8 == 0) goto L84
            r8.i(r7)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioc.d(android.view.View, float, float):void");
    }

    @Override // defpackage.cah
    public final boolean e(View view, int i) {
        int i2 = this.c;
        if ((i2 == -1 || i2 == i) && this.a.u(view)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cah
    public final int f(View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.c;
        if (i2 == 0) {
            if (layoutDirection == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 == 1) {
            if (layoutDirection == 1) {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.b - view.getWidth();
                width2 = this.b;
            }
        } else {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.cah
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.cah
    public final void i(View view, int i, int i2) {
        float width = view.getWidth() * this.a.d;
        float width2 = view.getWidth() * this.a.e;
        float abs = Math.abs(i - this.b);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.v(1.0f - ((abs - width) / (width2 - width))));
        }
    }
}
