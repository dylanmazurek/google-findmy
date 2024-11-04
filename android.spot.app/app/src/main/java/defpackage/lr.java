package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lr {
    public int A;
    public int B;
    public int C;
    public int D;
    public final atk E;
    public final atk F;
    private final no a;
    private final no b;
    jm r;
    public RecyclerView s;
    public md t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public lr() {
        lp lpVar = new lp(this, 1);
        this.a = lpVar;
        lp lpVar2 = new lp(this, 0);
        this.b = lpVar2;
        this.E = new atk(lpVar);
        this.F = new atk(lpVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static int am(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:            if (r4 == 1073741824) goto L64;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int ao(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L20
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L20
            goto L2f
        L19:
            if (r6 < 0) goto L1e
        L1b:
            r4 = 1073741824(0x40000000, float:2.0)
            goto L31
        L1e:
            if (r6 != r0) goto L22
        L20:
            r6 = r3
            goto L31
        L22:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L2a
            goto L2c
        L2a:
            r4 = 0
            goto L20
        L2c:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L20
        L2f:
            r4 = 0
            r6 = 0
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.ao(int, int, int, int, boolean):int");
    }

    public static lq at(Context context, AttributeSet attributeSet, int i, int i2) {
        lq lqVar = new lq();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ep.a, i, i2);
        lqVar.a = obtainStyledAttributes.getInt(0, 1);
        lqVar.b = obtainStyledAttributes.getInt(10, 1);
        lqVar.c = obtainStyledAttributes.getBoolean(9, false);
        lqVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return lqVar;
    }

    public static final int ba(View view) {
        return ((ls) view.getLayoutParams()).d.bottom;
    }

    public static final int bb(View view) {
        Rect rect = ((ls) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bc(View view) {
        Rect rect = ((ls) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bd(View view) {
        return ((ls) view.getLayoutParams()).d.left;
    }

    public static final int be(View view) {
        return ((ls) view.getLayoutParams()).cB();
    }

    public static final int bf(View view) {
        return ((ls) view.getLayoutParams()).d.right;
    }

    public static final int bg(View view) {
        return ((ls) view.getLayoutParams()).d.top;
    }

    public static final void bi(View view, int i, int i2, int i3, int i4) {
        ls lsVar = (ls) view.getLayoutParams();
        Rect rect = lsVar.d;
        view.layout(i + rect.left + lsVar.leftMargin, i2 + rect.top + lsVar.topMargin, (i3 - rect.right) - lsVar.rightMargin, (i4 - rect.bottom) - lsVar.bottomMargin);
    }

    public static final int bo(View view) {
        return view.getBottom() + ba(view);
    }

    public static final int bp(View view) {
        return view.getLeft() - bd(view);
    }

    public static final int bq(View view) {
        return view.getRight() + bf(view);
    }

    public static final int br(View view) {
        return view.getTop() - bg(view);
    }

    private final void c(View view, int i, boolean z) {
        mh h = RecyclerView.h(view);
        if (!z && !h.s()) {
            this.s.V.i(h);
        } else {
            this.s.V.d(h);
        }
        ls lsVar = (ls) view.getLayoutParams();
        if (!h.y() && !h.t()) {
            if (view.getParent() == this.s) {
                int c = this.r.c(view);
                if (i == -1) {
                    i = this.r.a();
                }
                if (c != -1) {
                    if (c != i) {
                        lr lrVar = this.s.m;
                        View av = lrVar.av(c);
                        if (av != null) {
                            lrVar.aD(c);
                            ls lsVar2 = (ls) av.getLayoutParams();
                            mh h2 = RecyclerView.h(av);
                            if (h2.s()) {
                                lrVar.s.V.d(h2);
                            } else {
                                lrVar.s.V.i(h2);
                            }
                            lrVar.r.g(av, i, lsVar2, h2.s());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c + lrVar.s.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.k());
                }
            } else {
                this.r.f(view, i, false);
                lsVar.e = true;
                md mdVar = this.t;
                if (mdVar != null && mdVar.f && md.i(view) == mdVar.b) {
                    mdVar.g = view;
                }
            }
        } else {
            if (h.t()) {
                h.m();
            } else {
                h.f();
            }
            this.r.g(view, i, view.getLayoutParams(), false);
        }
        if (lsVar.f) {
            h.b.invalidate();
            lsVar.f = false;
        }
    }

    public void A(int i, int i2) {
        bk(i);
    }

    public int B(me meVar) {
        throw null;
    }

    public int C(me meVar) {
        throw null;
    }

    public int D(me meVar) {
        throw null;
    }

    public int E(me meVar) {
        throw null;
    }

    public int F(me meVar) {
        throw null;
    }

    public int G(me meVar) {
        throw null;
    }

    public Parcelable M() {
        throw null;
    }

    public View O(int i) {
        int an = an();
        for (int i2 = 0; i2 < an; i2++) {
            View av = av(i2);
            mh h = RecyclerView.h(av);
            if (h != null && h.b() == i && !h.x() && (this.s.M.g || !h.s())) {
                return av;
            }
        }
        return null;
    }

    public void P(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.r(str);
        }
    }

    public void S(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        lw lwVar = recyclerView.e;
        me meVar = recyclerView.M;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            lj ljVar = this.s.l;
            if (ljVar != null) {
                accessibilityEvent.setItemCount(ljVar.a());
            }
        }
    }

    public void T(Parcelable parcelable) {
        throw null;
    }

    public void U(int i) {
        throw null;
    }

    public boolean X() {
        throw null;
    }

    public boolean Y() {
        throw null;
    }

    public boolean Z() {
        throw null;
    }

    public final void aA(View view, int i) {
        c(view, i, false);
    }

    public final void aB(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.e(view));
        }
    }

    public final void aC(lw lwVar) {
        int an = an();
        while (true) {
            an--;
            if (an >= 0) {
                View av = av(an);
                mh h = RecyclerView.h(av);
                if (!h.x()) {
                    if (h.q() && !h.s() && !this.s.l.c) {
                        aP(an);
                        lwVar.k(h);
                    } else {
                        aD(an);
                        lwVar.l(av);
                        this.s.V.i(h);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void aD(int i) {
        av(i);
        this.r.h(i);
    }

    public final void aE(RecyclerView recyclerView) {
        this.v = true;
        aH(recyclerView);
    }

    public void aF(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aG(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aI(View view, byn bynVar) {
        mh h = RecyclerView.h(view);
        if (h != null && !h.s() && !this.r.k(h.b)) {
            RecyclerView recyclerView = this.s;
            cJ(recyclerView.e, recyclerView.M, view, bynVar);
        }
    }

    public final void aK() {
        int an = an();
        while (true) {
            an--;
            if (an >= 0) {
                this.r.j(an);
            } else {
                return;
            }
        }
    }

    public final void aL(lw lwVar) {
        int an = an();
        while (true) {
            an--;
            if (an >= 0) {
                if (!RecyclerView.h(av(an)).x()) {
                    aO(an, lwVar);
                }
            } else {
                return;
            }
        }
    }

    public final void aM(lw lwVar) {
        int size = lwVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((mh) lwVar.a.get(i)).b;
            mh h = RecyclerView.h(view);
            if (!h.x()) {
                h.k(false);
                if (h.u()) {
                    this.s.removeDetachedView(view, false);
                }
                lo loVar = this.s.D;
                if (loVar != null) {
                    loVar.f(h);
                }
                h.k(true);
                lwVar.g(view);
            }
        }
        lwVar.a.clear();
        ArrayList arrayList = lwVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aN(View view, lw lwVar) {
        jm jmVar = this.r;
        int i = jmVar.c;
        if (i != 1) {
            if (i != 2) {
                try {
                    jmVar.c = 1;
                    jmVar.d = view;
                    int D = jmVar.e.D(view);
                    if (D >= 0) {
                        if (jmVar.a.g(D)) {
                            jmVar.l(view);
                        }
                        jmVar.e.G(D);
                    }
                    jmVar.c = 0;
                    jmVar.d = null;
                    lwVar.j(view);
                    return;
                } catch (Throwable th) {
                    jmVar.c = 0;
                    jmVar.d = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void aO(int i, lw lwVar) {
        View av = av(i);
        aP(i);
        lwVar.j(av);
    }

    public final void aP(int i) {
        if (av(i) != null) {
            this.r.j(i);
        }
    }

    public final void aQ() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aR(RecyclerView recyclerView) {
        aS(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aS(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 == 0 && !RecyclerView.a) {
            this.D = 0;
        }
    }

    public final void aT(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public final void aU(int i, int i2) {
        int an = an();
        if (an != 0) {
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < an; i7++) {
                View av = av(i7);
                Rect rect = this.s.j;
                RecyclerView.G(av, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.s.j.set(i5, i6, i3, i4);
            cK(this.s.j, i, i2);
            return;
        }
        this.s.w(i, i2);
    }

    public final void aV(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.h;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void aW(md mdVar) {
        md mdVar2 = this.t;
        if (mdVar2 != null && mdVar != mdVar2 && mdVar2.f) {
            mdVar2.f();
        }
        this.t = mdVar;
        RecyclerView recyclerView = this.s;
        recyclerView.J.d();
        if (mdVar.h) {
            Log.w("RecyclerView", "An instance of " + mdVar.getClass().getSimpleName() + " was started more than once. Each instance of" + mdVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        mdVar.c = recyclerView;
        mdVar.d = this;
        int i = mdVar.b;
        if (i != -1) {
            RecyclerView recyclerView2 = mdVar.c;
            recyclerView2.M.a = i;
            mdVar.f = true;
            mdVar.e = true;
            mdVar.g = recyclerView2.m.O(mdVar.b);
            mdVar.c.J.b();
            mdVar.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final boolean aX() {
        md mdVar = this.t;
        if (mdVar != null && mdVar.f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:            if ((r5.bottom - r2) > r1) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:            if (r2 != 0) goto L98;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean aY(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.C
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.D
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            int r6 = r8.aq()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Laa
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L79
            goto Laf
        L79:
            int r13 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r3 = r8.C
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.D
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r5 = r8.s
            android.graphics.Rect r5 = r5.j
            android.support.v7.widget.RecyclerView.G(r11, r5)
            int r11 = r5.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Laf
            int r11 = r5.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Laf
            int r11 = r5.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Laf
            int r11 = r5.bottom
            int r11 = r11 - r2
            if (r11 <= r1) goto Laf
        Laa:
            if (r10 != 0) goto Lb0
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            return r0
        Lb0:
            r0 = r10
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r0, r2)
            goto Lba
        Lb7:
            r9.am(r0, r2)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.aY(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public boolean aZ(View view, int i, int i2, ls lsVar) {
        if (!view.isLayoutRequested() && this.w && a.j(view.getWidth(), i, lsVar.width) && a.j(view.getHeight(), i2, lsVar.height)) {
            return false;
        }
        return true;
    }

    public boolean ab() {
        return false;
    }

    public boolean ad() {
        return false;
    }

    public void al(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int an() {
        jm jmVar = this.r;
        if (jmVar != null) {
            return jmVar.a();
        }
        return 0;
    }

    public final int ap() {
        lj ljVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            ljVar = recyclerView.l;
        } else {
            ljVar = null;
        }
        if (ljVar != null) {
            return ljVar.a();
        }
        return 0;
    }

    public final int aq() {
        return this.s.getLayoutDirection();
    }

    public final int ar() {
        RecyclerView recyclerView = this.s;
        int[] iArr = bwn.a;
        return recyclerView.getMinimumHeight();
    }

    public final int as() {
        RecyclerView recyclerView = this.s;
        int[] iArr = bwn.a;
        return recyclerView.getMinimumWidth();
    }

    public final View au(View view) {
        View j;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (j = recyclerView.j(view)) == null || this.r.k(j)) {
            return null;
        }
        return j;
    }

    public final View av(int i) {
        jm jmVar = this.r;
        if (jmVar != null) {
            return jmVar.d(i);
        }
        return null;
    }

    public final View aw() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void ax(View view) {
        ay(view, -1);
    }

    public final void ay(View view, int i) {
        c(view, i, true);
    }

    public final void az(View view) {
        aA(view, -1);
    }

    public final void bh(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((ls) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void bl(int i, int i2) {
        this.s.w(i, i2);
    }

    public final void bm(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bn(RecyclerView recyclerView) {
        this.v = false;
        aj(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bs(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.bs(int, android.os.Bundle):boolean");
    }

    public int cE(lw lwVar, me meVar) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null && recyclerView.l != null && X()) {
            return this.s.l.a();
        }
        return 1;
    }

    public int cF(lw lwVar, me meVar) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null && recyclerView.l != null && Y()) {
            return this.s.l.a();
        }
        return 1;
    }

    public ls cG(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ls) {
            return new ls((ls) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ls((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ls(layoutParams);
    }

    public View cH(View view, int i, lw lwVar, me meVar) {
        return null;
    }

    public void cI(lw lwVar, me meVar, byn bynVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            bynVar.i(8192);
            bynVar.P(true);
            bynVar.ag();
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            bynVar.i(4096);
            bynVar.P(true);
            bynVar.ag();
        }
        bynVar.v(bet.k(cF(lwVar, meVar), cE(lwVar, meVar), 0));
    }

    public void cJ(lw lwVar, me meVar, View view, byn bynVar) {
        int i;
        int i2;
        if (Y()) {
            i = be(view);
        } else {
            i = 0;
        }
        if (X()) {
            i2 = be(view);
        } else {
            i2 = 0;
        }
        bynVar.w(bym.a(i, 1, i2, 1, false));
    }

    public void cK(Rect rect, int i, int i2) {
        aT(am(i, rect.width() + getPaddingLeft() + getPaddingRight(), as()), am(i2, rect.height() + getPaddingTop() + getPaddingBottom(), ar()));
    }

    public boolean cL(int i, Bundle bundle) {
        RecyclerView recyclerView = this.s;
        lw lwVar = recyclerView.e;
        me meVar = recyclerView.M;
        return bs(i, bundle);
    }

    public boolean cM() {
        return false;
    }

    public int d(int i, lw lwVar, me meVar) {
        throw null;
    }

    public int e(int i, lw lwVar, me meVar) {
        throw null;
    }

    public abstract ls f();

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int[] iArr = bwn.a;
            return recyclerView.getPaddingEnd();
        }
        return 0;
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int[] iArr = bwn.a;
            return recyclerView.getPaddingStart();
        }
        return 0;
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public ls h(Context context, AttributeSet attributeSet) {
        return new ls(context, attributeSet);
    }

    public void o(lw lwVar, me meVar) {
        throw null;
    }

    public boolean s(ls lsVar) {
        if (lsVar != null) {
            return true;
        }
        return false;
    }

    public void bj() {
    }

    public void cN() {
    }

    public void aH(RecyclerView recyclerView) {
    }

    public void aJ(int i) {
    }

    public void aj(RecyclerView recyclerView) {
    }

    public void bk(int i) {
    }

    public void p(me meVar) {
    }

    public void af(int i, kh khVar) {
    }

    public void w(int i, int i2) {
    }

    public void y(int i, int i2) {
    }

    public void z(int i, int i2) {
    }

    public void ae(int i, int i2, me meVar, kh khVar) {
    }
}
