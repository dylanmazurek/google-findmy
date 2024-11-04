package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import defpackage.bon;
import defpackage.boo;
import defpackage.bop;
import defpackage.boq;
import defpackage.bor;
import defpackage.bos;
import defpackage.bot;
import defpackage.bou;
import defpackage.bov;
import defpackage.buf;
import defpackage.buh;
import defpackage.bvg;
import defpackage.bvh;
import defpackage.bvi;
import defpackage.bvj;
import defpackage.bvz;
import defpackage.bwb;
import defpackage.bwn;
import defpackage.bya;
import defpackage.dvf;
import defpackage.eld;
import defpackage.kg;
import defpackage.ta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements bvg, bvh {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    private static final buf i;
    public bya e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    public final eld h;
    private final List j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private final int[] n;
    private boolean o;
    private boolean p;
    private int[] q;
    private View r;
    private View s;
    private bot t;
    private boolean u;
    private Drawable v;
    private bvj w;
    private final bvi x;

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        a = str;
        d = new kg(9);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        i = new buh(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private final boolean A(int i2) {
        View view = this;
        while (true) {
            if (view != null) {
                if (view.isFocused()) {
                    break;
                }
                if (view instanceof ViewGroup) {
                    view = ((ViewGroup) view).getFocusedChild();
                } else {
                    view = null;
                }
            } else {
                view = null;
                break;
            }
        }
        t(this, view, 2, 1);
        int[] iArr = this.n;
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, 0, 0, i2, 1, iArr);
        h(view, 1);
        if (this.n[1] > 0) {
            return true;
        }
        return false;
    }

    private final boolean B(bop bopVar, View view, MotionEvent motionEvent, int i2) {
        if (i2 != 0) {
            return bopVar.g(this, view, motionEvent);
        }
        return bopVar.d(this, view, motionEvent);
    }

    private final boolean C(MotionEvent motionEvent, int i2) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            if (isChildrenDrawingOrderEnabled) {
                i3 = getChildDrawingOrder(childCount, i4);
            } else {
                i3 = i4;
            }
            list.add(getChildAt(i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            bos bosVar = (bos) view.getLayoutParams();
            bop bopVar = bosVar.a;
            if (z && actionMasked != 0) {
                if (bopVar != null) {
                    if (motionEvent2 == null) {
                        motionEvent2 = E(motionEvent);
                    }
                    B(bopVar, view, motionEvent2, i2);
                }
            } else {
                if (!z && bopVar != null && (z = B(bopVar, view, motionEvent, i2))) {
                    this.r = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i6 = 0; i6 < i5; i6++) {
                            View view2 = (View) list.get(i6);
                            bop bopVar2 = ((bos) view2.getLayoutParams()).a;
                            if (bopVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = E(motionEvent);
                                }
                                B(bopVar2, view2, motionEvent2, i2);
                            }
                        }
                    }
                }
                if (bosVar.a == null) {
                    bosVar.m = false;
                }
                boolean z2 = bosVar.m;
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    private static final void D(int i2, Rect rect, Rect rect2, bos bosVar, int i3, int i4) {
        int width;
        int height;
        int i5 = bosVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(s(bosVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i3;
            }
        } else {
            width -= i3 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i4;
            }
        } else {
            height -= i4 / 2;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private static final MotionEvent E(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private static final void F(View view, int i2) {
        bos bosVar = (bos) view.getLayoutParams();
        int i3 = bosVar.i;
        if (i3 != i2) {
            bwn.l(view, i2 - i3);
            bosVar.i = i2;
        }
    }

    private static final void G(View view, int i2) {
        bos bosVar = (bos) view.getLayoutParams();
        int i3 = bosVar.j;
        if (i3 != i2) {
            bwn.m(view, i2 - i3);
            bosVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final bos l(View view) {
        bos bosVar = (bos) view.getLayoutParams();
        if (!bosVar.b) {
            if (view instanceof boo) {
                bop a2 = ((boo) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                bosVar.b(a2);
                bosVar.b = true;
            } else {
                boq boqVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    boqVar = (boq) cls.getAnnotation(boq.class);
                    if (boqVar != null) {
                        break;
                    }
                }
                if (boqVar != null) {
                    try {
                        bosVar.b((bop) boqVar.a().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + boqVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                bosVar.b = true;
            }
        }
        return bosVar;
    }

    private final int n() {
        return p() - getHeight();
    }

    private final int o() {
        return -p();
    }

    private final int p() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            bos bosVar = (bos) childAt.getLayoutParams();
            i2 += childAt.getHeight() + bosVar.topMargin + bosVar.bottomMargin;
        }
        return i2;
    }

    private final int q(int i2) {
        int[] iArr = this.q;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int r() {
        return (int) (getHeight() * 0.1f);
    }

    private static int s(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        if ((i2 & 112) == 0) {
            return i2 | 48;
        }
        return i2;
    }

    private static int u(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect v() {
        Rect rect = (Rect) i.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    private final void w(bos bosVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + bosVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - bosVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + bosVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - bosVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private static void x(Rect rect) {
        rect.setEmpty();
        i.b(rect);
    }

    private final void y() {
        View view = this.r;
        if (view != null) {
            bop bopVar = ((bos) view.getLayoutParams()).a;
            if (bopVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                bopVar.g(this, this.r, obtain);
                obtain.recycle();
            }
            this.r = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((bos) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.o = false;
    }

    private final void z() {
        int[] iArr = bwn.a;
        if (getFitsSystemWindows()) {
            if (this.w == null) {
                this.w = new dvf(this, 1, null);
            }
            bwb.n(this, this.w);
            setSystemUiVisibility(1280);
            return;
        }
        bwb.n(this, null);
    }

    public final List a(View view) {
        eld eldVar = this.h;
        int i2 = ((ta) eldVar.b).d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ((ta) eldVar.b).f(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((ta) eldVar.b).c(i3));
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    public final void b(View view) {
        ArrayList g = this.h.g(view);
        if (g != null && !g.isEmpty()) {
            for (int i2 = 0; i2 < g.size(); i2++) {
                View view2 = (View) g.get(i2);
                bop bopVar = ((bos) view2.getLayoutParams()).a;
                if (bopVar != null) {
                    bopVar.i(this, view2, view);
                }
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                bov.a(this, view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof bos) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bvg
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        bop bopVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                bos bosVar = (bos) childAt.getLayoutParams();
                if (bosVar.d(i4) && (bopVar = bosVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bopVar.m(this, childAt, view, i3, iArr2, i4);
                    if (i2 > 0) {
                        min = Math.max(i5, this.l[0]);
                    } else {
                        min = Math.min(i5, this.l[0]);
                    }
                    i5 = min;
                    if (i3 > 0) {
                        min2 = Math.max(i6, this.l[1]);
                    } else {
                        min2 = Math.min(i6, this.l[1]);
                    }
                    i6 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode != 122) {
                                    if (keyCode == 123) {
                                        return A(n());
                                    }
                                    return dispatchKeyEvent;
                                }
                                return A(o());
                            }
                            return A(getHeight());
                        }
                        return A(-getHeight());
                    }
                    if (keyEvent.isShiftPressed()) {
                        return A(o());
                    }
                    return A(n());
                }
                if (keyEvent.isAltPressed()) {
                    return A(getHeight());
                }
                return A(r());
            }
            if (keyEvent.isAltPressed()) {
                return A(-getHeight());
            }
            return A(-r());
        }
        return dispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        bop bopVar = ((bos) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.bvg
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.m);
    }

    @Override // defpackage.bvh
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        bop bopVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                bos bosVar = (bos) childAt.getLayoutParams();
                if (bosVar.d(i6) && (bopVar = bosVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bopVar.n(this, childAt, i3, i4, i5, iArr2);
                    if (i4 > 0) {
                        min = Math.max(i7, this.l[0]);
                    } else {
                        min = Math.min(i7, this.l[0]);
                    }
                    i7 = min;
                    if (i5 > 0) {
                        min2 = Math.max(i8, this.l[1]);
                    } else {
                        min2 = Math.min(i8, this.l[1]);
                    }
                    i8 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.bvg
    public final void g(View view, View view2, int i2, int i3) {
        this.x.b(i2, i3);
        this.s = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            bos bosVar = (bos) getChildAt(i4).getLayoutParams();
            if (bosVar.d(i3)) {
                bop bopVar = bosVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new bos();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bos(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.x.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.bvg
    public final void h(View view, int i2) {
        this.x.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            bos bosVar = (bos) childAt.getLayoutParams();
            if (bosVar.d(i2)) {
                bop bopVar = bosVar.a;
                if (bopVar != null) {
                    bopVar.c(this, childAt, view, i2);
                }
                bosVar.c(i2, false);
                bosVar.a();
            }
        }
        this.s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r25) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i(int):void");
    }

    public final void j(View view, int i2) {
        Rect v;
        Rect v2;
        int i3;
        bos bosVar = (bos) view.getLayoutParams();
        View view2 = bosVar.k;
        if (view2 == null && bosVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            v = v();
            v2 = v();
            try {
                bov.a(this, view2, v);
                bos bosVar2 = (bos) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                D(i2, v, v2, bosVar2, measuredWidth, measuredHeight);
                w(bosVar2, v2, measuredWidth, measuredHeight);
                view.layout(v2.left, v2.top, v2.right, v2.bottom);
                return;
            } finally {
                x(v);
                x(v2);
            }
        }
        int i4 = bosVar.e;
        if (i4 >= 0) {
            bos bosVar3 = (bos) view.getLayoutParams();
            int absoluteGravity = Gravity.getAbsoluteGravity(u(bosVar3.c), i2);
            int i5 = absoluteGravity & 7;
            int i6 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i2 == 1) {
                i4 = width - i4;
            }
            int q = q(i4) - measuredWidth2;
            if (i5 != 1) {
                if (i5 == 5) {
                    q += measuredWidth2;
                }
            } else {
                q += measuredWidth2 / 2;
            }
            if (i6 != 16) {
                if (i6 != 80) {
                    i3 = 0;
                } else {
                    i3 = measuredHeight2;
                }
            } else {
                i3 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + bosVar3.leftMargin, Math.min(q, ((width - getPaddingRight()) - measuredWidth2) - bosVar3.rightMargin));
            int max2 = Math.max(getPaddingTop() + bosVar3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - bosVar3.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        bos bosVar4 = (bos) view.getLayoutParams();
        v = v();
        v.set(getPaddingLeft() + bosVar4.leftMargin, getPaddingTop() + bosVar4.topMargin, (getWidth() - getPaddingRight()) - bosVar4.rightMargin, (getHeight() - getPaddingBottom()) - bosVar4.bottomMargin);
        if (this.e != null) {
            int[] iArr = bwn.a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                v.left += this.e.b();
                v.top += this.e.d();
                v.right -= this.e.c();
                v.bottom -= this.e.a();
            }
        }
        v2 = v();
        Gravity.apply(s(bosVar4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), v, v2, i2);
        view.layout(v2.left, v2.top, v2.right, v2.bottom);
    }

    public final boolean k(View view, int i2, int i3) {
        Rect v = v();
        bov.a(this, view, v);
        try {
            return v.contains(i2, i3);
        } finally {
            x(v);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
        if (this.u) {
            if (this.t == null) {
                this.t = new bot(this, 0);
            }
            getViewTreeObserver().addOnPreDrawListener(this.t);
        }
        if (this.e == null) {
            int[] iArr = bwn.a;
            if (getFitsSystemWindows()) {
                bvz.c(this);
            }
        }
        this.p = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
        if (this.u && this.t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.t);
        }
        View view = this.s;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.p = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.f && this.v != null) {
            bya byaVar = this.e;
            if (byaVar != null) {
                i2 = byaVar.d();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.v.setBounds(0, 0, getWidth(), i2);
                this.v.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y();
            actionMasked = 0;
        }
        boolean C = C(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.r = null;
            y();
        }
        return C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        bop bopVar;
        int layoutDirection = getLayoutDirection();
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.j.get(i6);
            if (view.getVisibility() != 8 && ((bopVar = ((bos) view.getLayoutParams()).a) == null || !bopVar.e(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0352  */
    /* JADX WARN: Type inference failed for: r4v36, types: [buf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [buf, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                bos bosVar = (bos) childAt.getLayoutParams();
                if (bosVar.n) {
                    bop bopVar = bosVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        bop bopVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                bos bosVar = (bos) childAt.getLayoutParams();
                if (bosVar.n && (bopVar = bosVar.a) != null) {
                    z |= bopVar.l(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof bou)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bou bouVar = (bou) parcelable;
        super.onRestoreInstanceState(bouVar.d);
        SparseArray sparseArray = bouVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            bop bopVar = l(childAt).a;
            if (id != -1 && bopVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bopVar.o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable p;
        bou bouVar = new bou(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            bop bopVar = ((bos) childAt.getLayoutParams()).a;
            if (id != -1 && bopVar != null && (p = bopVar.p(childAt)) != null) {
                sparseArray.append(id, p);
            }
        }
        bouVar.a = sparseArray;
        return bouVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean C;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.r;
        boolean z = false;
        if (view != null) {
            bop bopVar = ((bos) view.getLayoutParams()).a;
            C = bopVar != null ? bopVar.g(this, this.r, motionEvent) : false;
        } else {
            C = C(motionEvent, 1);
            if (actionMasked != 0 && C) {
                z = true;
            }
        }
        if (this.r != null && actionMasked != 3) {
            if (z) {
                MotionEvent E = E(motionEvent);
                super.onTouchEvent(E);
                E.recycle();
            }
        } else {
            C |= super.onTouchEvent(motionEvent);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.r = null;
            y();
        }
        return C;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        bop bopVar = ((bos) view.getLayoutParams()).a;
        if (bopVar != null && bopVar.f(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.o) {
            if (this.r == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    bop bopVar = ((bos) childAt.getLayoutParams()).a;
                    if (bopVar != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        bopVar.d(this, childAt, motionEvent);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            y();
            this.o = true;
        }
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        Drawable drawable = this.v;
        if (drawable != null) {
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (drawable.isVisible() != z) {
                this.v.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.bvg
    public final boolean t(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                bos bosVar = (bos) childAt.getLayoutParams();
                bop bopVar = bosVar.a;
                if (bopVar != null) {
                    boolean q = bopVar.q(this, childAt, view, i2, i3);
                    z |= q;
                    bosVar.c(i3, q);
                } else {
                    bosVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.v) {
            return false;
        }
        return true;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof bos) {
            return new bos((bos) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new bos((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new bos(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        this.j = new ArrayList();
        this.h = new eld(null, null);
        this.k = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.n = new int[2];
        this.x = new bvi();
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bon.a, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bon.a, i2, 0);
        }
        if (i2 == 0) {
            bwn.p(this, context, bon.a, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            bwn.p(this, context, bon.a, attributeSet, obtainStyledAttributes, i2, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.q.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.q[i3] = (int) (r12[i3] * f);
            }
        }
        this.v = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        z();
        super.setOnHierarchyChangeListener(new bor(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
