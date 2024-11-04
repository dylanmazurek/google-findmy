package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a;
import defpackage.atk;
import defpackage.brd;
import defpackage.brl;
import defpackage.bus;
import defpackage.but;
import defpackage.bve;
import defpackage.bvf;
import defpackage.bwe;
import defpackage.bwn;
import defpackage.bws;
import defpackage.bwu;
import defpackage.bzs;
import defpackage.cag;
import defpackage.ep;
import defpackage.fr;
import defpackage.fs;
import defpackage.ft;
import defpackage.ht;
import defpackage.hu;
import defpackage.jm;
import defpackage.ke;
import defpackage.kh;
import defpackage.kj;
import defpackage.kvu;
import defpackage.lj;
import defpackage.ln;
import defpackage.lo;
import defpackage.lr;
import defpackage.ls;
import defpackage.lt;
import defpackage.lu;
import defpackage.lv;
import defpackage.lw;
import defpackage.ly;
import defpackage.ma;
import defpackage.md;
import defpackage.me;
import defpackage.mf;
import defpackage.mg;
import defpackage.mh;
import defpackage.mj;
import defpackage.njz;
import defpackage.np;
import defpackage.ta;
import defpackage.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements bve {
    public static final /* synthetic */ int W = 0;
    public static final boolean a;
    private static final int[] aa = {R.attr.nestedScrollingEnabled};
    private static final float ab = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final Class[] ac;
    public static final boolean b;
    public static final Interpolator c;
    static final mf d;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public lo D;
    public int E;
    public lt F;
    public final int G;
    public float H;
    public float I;
    public final mg J;
    public kj K;
    public kh L;
    public final me M;
    public boolean N;
    public boolean O;
    public boolean P;
    public mj Q;
    public final int[] R;
    final List S;
    boolean T;
    bus U;
    public final atk V;
    private Runnable aA;
    private boolean aB;
    private int aC;
    private int aD;
    private final but aE;
    private fr aF;
    private njz aG;
    private final njz aH;
    private final float ad;
    private final ly ae;
    private final Rect af;
    private int ag;
    private boolean ah;
    private int ai;
    private final AccessibilityManager aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private VelocityTracker ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private final int at;
    private boolean au;
    private List av;
    private final int[] aw;
    private bvf ax;
    private final int[] ay;
    private final int[] az;
    public final lw e;
    ma f;
    public hu g;
    public jm h;
    boolean i;
    public final Rect j;
    public final RectF k;
    public lj l;
    public lr m;
    public final List n;
    public final ArrayList o;
    public final ArrayList p;
    public lu q;
    public boolean r;
    boolean s;
    boolean t;
    boolean u;
    public boolean v;
    public List w;
    public boolean x;
    boolean y;
    public EdgeEffect z;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        a = z;
        b = true;
        Class cls = Integer.TYPE;
        ac = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new cag(1);
        d = new mf();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void G(View view, Rect rect) {
        ls lsVar = (ls) view.getLayoutParams();
        Rect rect2 = lsVar.d;
        rect.set((view.getLeft() - rect2.left) - lsVar.leftMargin, (view.getTop() - rect2.top) - lsVar.topMargin, view.getRight() + rect2.right + lsVar.rightMargin, view.getBottom() + rect2.bottom + lsVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.z;
        float f2 = 0.0f;
        if (edgeEffect != null && brd.b(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.z.onRelease();
            } else {
                float f3 = -brd.c(this.z, -width, 1.0f - height);
                if (brd.b(this.z) == 0.0f) {
                    this.z.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.B;
            if (edgeEffect2 != null && brd.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.B.onRelease();
                } else {
                    float c2 = brd.c(this.B, width, height);
                    if (brd.b(this.B) == 0.0f) {
                        this.B.onRelease();
                    }
                    f2 = c2;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    private final void aA() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.x) {
            this.g.i();
            if (this.y) {
                this.m.cN();
            }
        }
        if (aI()) {
            this.g.f();
        } else {
            this.g.d();
        }
        boolean z4 = true;
        if (!this.N && !this.O) {
            z = false;
        } else {
            z = true;
        }
        me meVar = this.M;
        if (this.s && this.D != null && (((z3 = this.x) || z || this.m.u) && (!z3 || this.l.c))) {
            z2 = true;
        } else {
            z2 = false;
        }
        meVar.j = z2;
        if (!z2 || !z || this.x || !aI()) {
            z4 = false;
        }
        meVar.k = z4;
    }

    private final void aB() {
        boolean z;
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.z.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.C;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.C.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private final void aC(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof ls) {
            ls lsVar = (ls) layoutParams;
            if (!lsVar.e) {
                Rect rect = lsVar.d;
                this.j.left -= rect.left;
                this.j.right += rect.right;
                this.j.top -= rect.top;
                this.j.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        } else {
            view2 = null;
        }
        lr lrVar = this.m;
        Rect rect2 = this.j;
        boolean z2 = !this.s;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        lrVar.aY(this, view, rect2, z2, z);
    }

    private final void aD() {
        me meVar = this.M;
        meVar.m = -1L;
        meVar.l = -1;
        meVar.n = -1;
    }

    private final void aE() {
        VelocityTracker velocityTracker = this.ao;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        aa(0);
        aB();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aF(int i) {
        boolean X = this.m.X();
        int i2 = X;
        if (this.m.Y()) {
            i2 = (X ? 1 : 0) | 2;
        }
        ao(i2, i);
    }

    private final void aG() {
        md mdVar;
        this.J.d();
        lr lrVar = this.m;
        if (lrVar != null && (mdVar = lrVar.t) != null) {
            mdVar.f();
        }
    }

    private final boolean aH(MotionEvent motionEvent) {
        ArrayList arrayList = this.p;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lu luVar = (lu) this.p.get(i);
            if (luVar.l(motionEvent) && action != 3) {
                this.q = luVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aI() {
        if (this.D != null && this.m.cM()) {
            return true;
        }
        return false;
    }

    private final boolean aJ(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float b2 = brd.b(edgeEffect) * i2;
        double log = Math.log((Math.abs(-i) * 0.35f) / (this.ad * 0.015f));
        double d2 = ab;
        if (((float) (this.ad * 0.015f * Math.exp((d2 / ((-1.0d) + d2)) * log))) < b2) {
            return true;
        }
        return false;
    }

    private final void aK(Context context, String str, AttributeSet attributeSet, int i) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = String.valueOf(context.getPackageName()).concat(String.valueOf(trim));
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(lr.class);
                    try {
                        constructor = asSubclass.getConstructor(ac);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        objArr = null;
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    V((lr) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                }
            }
        }
    }

    public static final int aj(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && brd.b(edgeEffect) != 0.0f) {
            int round = Math.round(((-i2) / 4.0f) * brd.c(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i < 0 && edgeEffect2 != null && brd.b(edgeEffect2) != 0.0f) {
            float f = i2;
            int round2 = Math.round((f / 4.0f) * brd.c(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
        return i;
    }

    public static final long ak() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    private final int at(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.A;
        float f2 = 0.0f;
        if (edgeEffect != null && brd.b(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.A.onRelease();
            } else {
                float f3 = -brd.c(this.A, -height, width);
                if (brd.b(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && brd.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.C.onRelease();
                } else {
                    float c2 = brd.c(this.C, height, 1.0f - width);
                    if (brd.b(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f2 = c2;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    private final bvf au() {
        if (this.ax == null) {
            this.ax = new bvf(this);
        }
        return this.ax;
    }

    private final void av() {
        aE();
        W(0);
    }

    private final void aw() {
        View view;
        long j;
        int a2;
        np npVar;
        View j2;
        boolean z = true;
        this.M.b(1);
        F(this.M);
        this.M.i = false;
        Y();
        this.V.h();
        L();
        aA();
        mh mhVar = null;
        if (this.au && hasFocus() && this.l != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (j2 = j(view)) != null) {
            mhVar = g(j2);
        }
        if (mhVar == null) {
            aD();
        } else {
            me meVar = this.M;
            if (this.l.c) {
                j = mhVar.f;
            } else {
                j = -1;
            }
            meVar.m = j;
            if (this.x) {
                a2 = -1;
            } else if (mhVar.s()) {
                a2 = mhVar.e;
            } else {
                a2 = mhVar.a();
            }
            meVar.l = a2;
            me meVar2 = this.M;
            View view2 = mhVar.b;
            int id = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id = view2.getId();
                }
            }
            meVar2.n = id;
        }
        me meVar3 = this.M;
        if (!meVar3.j || !this.O) {
            z = false;
        }
        meVar3.h = z;
        this.O = false;
        this.N = false;
        meVar3.g = meVar3.k;
        meVar3.e = this.l.a();
        ay(this.aw);
        if (this.M.j) {
            int a3 = this.h.a();
            for (int i = 0; i < a3; i++) {
                mh h = h(this.h.d(i));
                if (!h.x() && (!h.q() || this.l.c)) {
                    lo.l(h);
                    this.V.g(h, lo.c(h));
                    if (this.M.h && h.v() && !h.s() && !h.x() && !h.q()) {
                        this.V.e(d(h), h);
                    }
                }
            }
        }
        if (this.M.k) {
            int b2 = this.h.b();
            for (int i2 = 0; i2 < b2; i2++) {
                mh h2 = h(this.h.e(i2));
                if (!h2.x() && h2.e == -1) {
                    h2.e = h2.d;
                }
            }
            me meVar4 = this.M;
            boolean z2 = meVar4.f;
            meVar4.f = false;
            this.m.o(this.e, meVar4);
            this.M.f = z2;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                mh h3 = h(this.h.d(i3));
                if (!h3.x() && ((npVar = (np) ((ta) this.V.b).get(h3)) == null || (npVar.b & 4) == 0)) {
                    lo.l(h3);
                    boolean n = h3.n(8192);
                    ln c2 = lo.c(h3);
                    if (n) {
                        Q(h3, c2);
                    } else {
                        atk atkVar = this.V;
                        np npVar2 = (np) ((ta) atkVar.b).get(h3);
                        if (npVar2 == null) {
                            Object obj = atkVar.b;
                            npVar2 = np.a();
                            ((ta) obj).put(h3, npVar2);
                        }
                        npVar2.b |= 2;
                        npVar2.c = c2;
                    }
                }
            }
            t();
        } else {
            t();
        }
        M();
        Z(false);
        this.M.d = 2;
    }

    private final void ax() {
        boolean z;
        Y();
        L();
        this.M.b(6);
        this.g.d();
        int a2 = this.l.a();
        me meVar = this.M;
        meVar.e = a2;
        meVar.c = 0;
        ma maVar = this.f;
        if (maVar != null) {
            int i = this.l.d;
            Parcelable parcelable = maVar.a;
            if (parcelable != null) {
                this.m.T(parcelable);
            }
            this.f = null;
        }
        me meVar2 = this.M;
        meVar2.g = false;
        this.m.o(this.e, meVar2);
        me meVar3 = this.M;
        meVar3.f = false;
        if (meVar3.j && this.D != null) {
            z = true;
        } else {
            z = false;
        }
        meVar3.j = z;
        meVar3.d = 4;
        M();
        Z(false);
    }

    private final void ay(int[] iArr) {
        int a2 = this.h.a();
        if (a2 != 0) {
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < a2; i3++) {
                mh h = h(this.h.d(i3));
                if (!h.x()) {
                    int b2 = h.b();
                    if (b2 < i2) {
                        i2 = b2;
                    }
                    if (b2 > i) {
                        i = b2;
                    }
                }
            }
            iArr[0] = i2;
            iArr[1] = i;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    private final void az(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.an) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.an = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.ar = x;
            this.ap = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.as = y;
            this.aq = y;
        }
    }

    public static mh h(View view) {
        if (view == null) {
            return null;
        }
        return ((ls) view.getLayoutParams()).c;
    }

    public static RecyclerView i(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView i2 = i(viewGroup.getChildAt(i));
                if (i2 != null) {
                    return i2;
                }
            }
            return null;
        }
        return null;
    }

    public static void s(mh mhVar) {
        WeakReference weakReference = mhVar.c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != mhVar.b) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            mhVar.c = null;
        }
    }

    public final void A(int i, int i2) {
        this.al++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.av;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ft) this.av.get(size)).b(this, i, i2);
                }
            }
        }
        this.al--;
    }

    public final void B() {
        if (this.C != null) {
            return;
        }
        EdgeEffect c2 = this.aF.c(this);
        this.C = c2;
        if (this.i) {
            c2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            c2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void C() {
        if (this.z != null) {
            return;
        }
        EdgeEffect c2 = this.aF.c(this);
        this.z = c2;
        if (this.i) {
            c2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            c2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void D() {
        if (this.B != null) {
            return;
        }
        EdgeEffect c2 = this.aF.c(this);
        this.B = c2;
        if (this.i) {
            c2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            c2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void E() {
        if (this.A != null) {
            return;
        }
        EdgeEffect c2 = this.aF.c(this);
        this.A = c2;
        if (this.i) {
            c2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            c2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void F(me meVar) {
        if (this.am == 2) {
            OverScroller overScroller = this.J.a;
            meVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            meVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            meVar.o = 0;
            meVar.p = 0;
        }
    }

    final void H() {
        this.C = null;
        this.A = null;
        this.B = null;
        this.z = null;
    }

    public final void I(int i) {
        if (this.m == null) {
            return;
        }
        W(2);
        this.m.U(i);
        awakenScrollBars();
    }

    final void J() {
        int b2 = this.h.b();
        for (int i = 0; i < b2; i++) {
            ((ls) this.h.e(i).getLayoutParams()).e = true;
        }
        lw lwVar = this.e;
        int size = lwVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ls lsVar = (ls) ((mh) lwVar.c.get(i2)).b.getLayoutParams();
            if (lsVar != null) {
                lsVar.e = true;
            }
        }
    }

    public final void K(int i, int i2, boolean z) {
        int i3;
        int b2 = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= b2) {
                break;
            }
            mh h = h(this.h.e(i4));
            if (h != null && !h.x()) {
                int i5 = h.d;
                if (i5 >= i3) {
                    h.h(-i2, z);
                    this.M.f = true;
                } else if (i5 >= i) {
                    h.c(8);
                    h.h(-i2, z);
                    h.d = i - 1;
                    this.M.f = true;
                }
            }
            i4++;
        }
        lw lwVar = this.e;
        int size = lwVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                mh mhVar = (mh) lwVar.c.get(size);
                if (mhVar != null) {
                    int i6 = mhVar.d;
                    if (i6 >= i3) {
                        mhVar.h(-i2, z);
                    } else if (i6 >= i) {
                        mhVar.c(8);
                        lwVar.i(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void L() {
        this.ak++;
    }

    final void M() {
        N(true);
    }

    public final void N(boolean z) {
        int i;
        int i2 = this.ak - 1;
        this.ak = i2;
        if (i2 <= 0) {
            this.ak = 0;
            if (z) {
                int i3 = this.ai;
                this.ai = 0;
                if (i3 != 0 && ag()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.S.size() - 1; size >= 0; size--) {
                    mh mhVar = (mh) this.S.get(size);
                    if (mhVar.b.getParent() == this && !mhVar.x() && (i = mhVar.o) != -1) {
                        mhVar.b.setImportantForAccessibility(i);
                        mhVar.o = -1;
                    }
                }
                this.S.clear();
            }
        }
    }

    public final void O() {
        if (!this.P && this.r) {
            Runnable runnable = this.aA;
            int[] iArr = bwn.a;
            postOnAnimation(runnable);
            this.P = true;
        }
    }

    public final void P(boolean z) {
        this.y = z | this.y;
        this.x = true;
        int b2 = this.h.b();
        for (int i = 0; i < b2; i++) {
            mh h = h(this.h.e(i));
            if (h != null && !h.x()) {
                h.c(6);
            }
        }
        J();
        lw lwVar = this.e;
        int size = lwVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            mh mhVar = (mh) lwVar.c.get(i2);
            if (mhVar != null) {
                mhVar.c(6);
                mhVar.B();
            }
        }
        lj ljVar = lwVar.f.l;
        if (ljVar != null && ljVar.c) {
            return;
        }
        lwVar.h();
    }

    public final void Q(mh mhVar, ln lnVar) {
        mhVar.j(0, 8192);
        if (this.M.h && mhVar.v() && !mhVar.s() && !mhVar.x()) {
            this.V.e(d(mhVar), mhVar);
        }
        this.V.g(mhVar, lnVar);
    }

    public final void R() {
        lo loVar = this.D;
        if (loVar != null) {
            loVar.g();
        }
        lr lrVar = this.m;
        if (lrVar != null) {
            lrVar.aL(this.e);
            this.m.aM(this.e);
        }
        this.e.d();
    }

    public final void S(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        mh mhVar;
        Y();
        L();
        Trace.beginSection("RV Scroll");
        F(this.M);
        if (i != 0) {
            i3 = this.m.d(i, this.e, this.M);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.m.e(i2, this.e, this.M);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        int a2 = this.h.a();
        for (int i5 = 0; i5 < a2; i5++) {
            View d2 = this.h.d(i5);
            mh g = g(d2);
            if (g != null && (mhVar = g.j) != null) {
                int left = d2.getLeft();
                int top = d2.getTop();
                View view = mhVar.b;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        M();
        Z(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void T(int i) {
        if (this.u) {
            return;
        }
        ab();
        lr lrVar = this.m;
        if (lrVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lrVar.U(i);
            awakenScrollBars();
        }
    }

    public final void U(lj ljVar) {
        suppressLayout(false);
        lj ljVar2 = this.l;
        if (ljVar2 != null) {
            ljVar2.r(this.ae);
            this.l.l(this);
        }
        R();
        this.g.i();
        lj ljVar3 = this.l;
        this.l = ljVar;
        if (ljVar != null) {
            ljVar.q(this.ae);
            ljVar.j(this);
        }
        lr lrVar = this.m;
        if (lrVar != null) {
            lrVar.bj();
        }
        lw lwVar = this.e;
        lj ljVar4 = this.l;
        lwVar.d();
        lwVar.f(ljVar3, true);
        kvu p = lwVar.p();
        if (ljVar3 != null) {
            p.b--;
        }
        if (p.b == 0) {
            for (int i = 0; i < ((SparseArray) p.a).size(); i++) {
                lv lvVar = (lv) ((SparseArray) p.a).valueAt(i);
                ArrayList arrayList = lvVar.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    brl.b(((mh) arrayList.get(i2)).b);
                }
                lvVar.a.clear();
            }
        }
        if (ljVar4 != null) {
            p.b++;
        }
        lwVar.e();
        this.M.f = true;
        P(false);
        requestLayout();
    }

    public final void V(lr lrVar) {
        if (lrVar == this.m) {
            return;
        }
        ab();
        if (this.m != null) {
            lo loVar = this.D;
            if (loVar != null) {
                loVar.g();
            }
            this.m.aL(this.e);
            this.m.aM(this.e);
            this.e.d();
            if (this.r) {
                this.m.bn(this);
            }
            this.m.aV(null);
            this.m = null;
        } else {
            this.e.d();
        }
        jm jmVar = this.h;
        jmVar.a.d();
        int size = jmVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            jmVar.e.F((View) jmVar.b.get(size));
            jmVar.b.remove(size);
        }
        njz njzVar = jmVar.e;
        int C = njzVar.C();
        for (int i = 0; i < C; i++) {
            View E = njzVar.E(i);
            ((RecyclerView) njzVar.a).x(E);
            E.clearAnimation();
        }
        ((RecyclerView) njzVar.a).removeAllViews();
        this.m = lrVar;
        if (lrVar != null) {
            if (lrVar.s == null) {
                this.m.aV(this);
                if (this.r) {
                    this.m.aE(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + lrVar + " is already attached to a RecyclerView:" + lrVar.s.k());
            }
        }
        this.e.n();
        requestLayout();
    }

    public final void W(int i) {
        if (i != this.am) {
            this.am = i;
            if (i != 2) {
                aG();
            }
            lr lrVar = this.m;
            if (lrVar != null) {
                lrVar.aJ(i);
            }
            List list = this.av;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((ft) this.av.get(size)).c(i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void X(int i) {
        if (this.u) {
            return;
        }
        lr lrVar = this.m;
        if (lrVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lrVar.al(this, i);
        }
    }

    public final void Y() {
        int i = this.ag + 1;
        this.ag = i;
        if (i == 1 && !this.u) {
            this.t = false;
        }
    }

    public final void Z(boolean z) {
        int i = this.ag;
        if (i <= 0) {
            this.ag = 1;
            i = 1;
        }
        if (!z && !this.u) {
            this.t = false;
        }
        if (i == 1) {
            if (z && this.t && !this.u && this.m != null && this.l != null) {
                y();
            }
            if (!this.u) {
                this.t = false;
            }
        }
        this.ag--;
    }

    public final void aa(int i) {
        au().c(i);
    }

    public final void ab() {
        W(0);
        aG();
    }

    public final boolean ad(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return au().g(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e8, code lost:            if (r1 < r12) goto L272;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0212 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ae(int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ae(int, int, int, int):boolean");
    }

    public final boolean af() {
        if (this.s && !this.x && !this.g.k()) {
            return false;
        }
        return true;
    }

    public final boolean ag() {
        AccessibilityManager accessibilityManager = this.aj;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean ah() {
        if (this.ak > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0113, code lost:            if (r3 == 0.0f) goto L104;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean ai(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ai(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void al(mh mhVar, int i) {
        if (ah()) {
            mhVar.o = i;
            this.S.add(mhVar);
        } else {
            mhVar.b.setImportantForAccessibility(i);
        }
    }

    public final void am(int i, int i2) {
        an(i, i2, false);
    }

    public final void an(int i, int i2, boolean z) {
        lr lrVar = this.m;
        if (lrVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.u) {
            int i3 = 0;
            if (true != lrVar.X()) {
                i = 0;
            }
            if (true != this.m.Y()) {
                i2 = 0;
            }
            if (i == 0) {
                if (i2 != 0) {
                    i = 0;
                } else {
                    return;
                }
            }
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                ao(i3, 1);
            }
            this.J.c(i, i2, Integer.MIN_VALUE, null);
        }
    }

    public final void ao(int i, int i2) {
        au().m(i, i2);
    }

    public final void ap(fs fsVar) {
        lr lrVar = this.m;
        if (lrVar != null) {
            lrVar.P("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.o.add(fsVar);
        J();
        requestLayout();
    }

    public final void aq(ft ftVar) {
        if (this.av == null) {
            this.av = new ArrayList();
        }
        this.av.add(ftVar);
    }

    public final void ar(fs fsVar) {
        boolean z;
        lr lrVar = this.m;
        if (lrVar != null) {
            lrVar.P("Cannot remove item decoration during a scroll  or layout");
        }
        this.o.remove(fsVar);
        if (this.o.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        J();
        requestLayout();
    }

    public final void as(ft ftVar) {
        List list = this.av;
        if (list != null) {
            list.remove(ftVar);
        }
    }

    public final int b(mh mhVar) {
        if (mhVar.n(524) || !mhVar.p()) {
            return -1;
        }
        hu huVar = this.g;
        int i = mhVar.d;
        int size = huVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ht htVar = (ht) huVar.a.get(i2);
            int i3 = htVar.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = htVar.b;
                        if (i4 == i) {
                            i = htVar.d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (htVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = htVar.b;
                    if (i5 <= i) {
                        int i6 = htVar.d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (htVar.b <= i) {
                i += htVar.d;
            }
        }
        return i;
    }

    public final int c() {
        return this.o.size();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ls) && this.m.s((ls) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        lr lrVar = this.m;
        if (lrVar != null && lrVar.X()) {
            return this.m.B(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        lr lrVar = this.m;
        if (lrVar != null && lrVar.X()) {
            return this.m.C(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        lr lrVar = this.m;
        if (lrVar != null && lrVar.X()) {
            return this.m.D(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        lr lrVar = this.m;
        if (lrVar != null && lrVar.Y()) {
            return this.m.E(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        lr lrVar = this.m;
        if (lrVar != null && lrVar.Y()) {
            return this.m.F(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        lr lrVar = this.m;
        if (lrVar != null && lrVar.Y()) {
            return this.m.G(this.M);
        }
        return 0;
    }

    final long d(mh mhVar) {
        if (this.l.c) {
            return mhVar.f;
        }
        return mhVar.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        lr lrVar = this.m;
        int i = 0;
        if (lrVar == null) {
            return false;
        }
        if (lrVar.Y()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 92 && keyCode != 93) {
                if (keyCode == 122 || keyCode == 123) {
                    boolean ab2 = lrVar.ab();
                    if (keyCode == 122) {
                        if (ab2) {
                            i = this.l.a();
                        }
                    } else if (!ab2) {
                        i = this.l.a();
                    }
                    X(i);
                    return true;
                }
            } else {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    am(0, measuredHeight);
                } else {
                    am(0, -measuredHeight);
                }
                return true;
            }
        } else if (lrVar.X()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 92 && keyCode2 != 93) {
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean ab3 = lrVar.ab();
                    if (keyCode2 == 122) {
                        if (ab3) {
                            i = this.l.a();
                        }
                    } else if (!ab3) {
                        i = this.l.a();
                    }
                    X(i);
                    return true;
                }
            } else {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    am(measuredWidth, 0);
                } else {
                    am(-measuredWidth, 0);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return au().d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return au().e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return au().f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return au().h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.o.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((fs) this.o.get(i3)).d(canvas);
        }
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.i) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.z;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.A;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.B;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.i) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.B;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.C;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.C;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (!z && (this.D == null || this.o.size() <= 0 || !this.D.j())) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final Rect e(View view) {
        ls lsVar = (ls) view.getLayoutParams();
        if (!lsVar.e) {
            return lsVar.d;
        }
        if (this.M.g && (lsVar.cC() || lsVar.c.q())) {
            return lsVar.d;
        }
        Rect rect = lsVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            this.j.set(0, 0, 0, 0);
            ((fs) this.o.get(i)).b(this.j, view, this, this.M);
            rect.left += this.j.left;
            rect.top += this.j.top;
            rect.right += this.j.right;
            rect.bottom += this.j.bottom;
        }
        lsVar.e = false;
        return rect;
    }

    public final mh f(int i) {
        mh mhVar = null;
        if (this.x) {
            return null;
        }
        int b2 = this.h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            mh h = h(this.h.e(i2));
            if (h != null && !h.s() && b(h) == i) {
                if (this.h.k(h.b)) {
                    mhVar = h;
                } else {
                    return h;
                }
            }
        }
        return mhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0065, code lost:            if (r3.findNextFocus(r13, r14, r0) == null) goto L171;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:            if (r3.findNextFocus(r13, r14, r0) != null) goto L156;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:            v();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:            if (j(r14) != null) goto L174;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:            Y();        r13.m.cH(r14, r15, r13.e, r13.M);        Z(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:            if (r13.j.right <= r13.af.left) goto L211;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:            if (r13.j.left >= r13.af.right) goto L218;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:            if (r13.j.bottom <= r13.af.top) goto L226;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017b, code lost:            if (r13.j.top >= r13.af.bottom) goto L233;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0194, code lost:            if (r2 > 0) goto L261;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b2, code lost:            if (r10 > 0) goto L261;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b5, code lost:            if (r2 < 0) goto L261;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b8, code lost:            if (r10 < 0) goto L261;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c1, code lost:            if ((r10 * r3) <= 0) goto L262;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ca, code lost:            if ((r10 * r3) >= 0) goto L262;     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final mh g(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException(a.ah(this, view, "View ", " is not a direct child of "));
        }
        return h(view);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        lr lrVar = this.m;
        if (lrVar != null) {
            return lrVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(k()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        lr lrVar = this.m;
        if (lrVar != null) {
            return lrVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(k()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.m != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return au().j();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return au().a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:            return r3;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.j(android.view.View):android.view.View");
    }

    public final String k() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ak = 0;
        boolean z = true;
        this.r = true;
        if (!this.s || isLayoutRequested()) {
            z = false;
        }
        this.s = z;
        this.e.e();
        lr lrVar = this.m;
        if (lrVar != null) {
            lrVar.aE(this);
        }
        this.P = false;
        if (b) {
            kj kjVar = (kj) kj.a.get();
            this.K = kjVar;
            if (kjVar == null) {
                this.K = new kj();
                int[] iArr = bwn.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                kj kjVar2 = this.K;
                kjVar2.e = 1.0E9f / f;
                kj.a.set(kjVar2);
            }
            this.K.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        kj kjVar;
        super.onDetachedFromWindow();
        lo loVar = this.D;
        if (loVar != null) {
            loVar.g();
        }
        ab();
        this.r = false;
        lr lrVar = this.m;
        if (lrVar != null) {
            lrVar.bn(this);
        }
        this.S.clear();
        removeCallbacks(this.aA);
        do {
        } while (np.a.a() != null);
        lw lwVar = this.e;
        for (int i = 0; i < lwVar.c.size(); i++) {
            brl.b(((mh) lwVar.c.get(i)).b);
        }
        lwVar.f(lwVar.f.l, false);
        Iterator a2 = new bwu(this, 1).a();
        while (a2.hasNext()) {
            brl.c((View) a2.next()).c();
        }
        if (b && (kjVar = this.K) != null) {
            kjVar.c.remove(this);
            this.K = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            ((fs) this.o.get(i)).c(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        char c2;
        float f2;
        int i;
        float y;
        float x;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.m != null && !this.u && motionEvent.getAction() == 8) {
            float f3 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.m.Y()) {
                    f = -motionEvent.getAxisValue(9);
                } else {
                    f = 0.0f;
                }
                if (this.m.X()) {
                    f3 = motionEvent.getAxisValue(10);
                    z = false;
                    c2 = 0;
                    float f4 = f3;
                    f3 = f;
                    f2 = f4;
                } else {
                    f3 = f;
                    f2 = 0.0f;
                    z = false;
                    c2 = 0;
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.m.Y()) {
                        f = -axisValue;
                    } else {
                        if (this.m.X()) {
                            f3 = axisValue;
                        }
                        f = 0.0f;
                    }
                    z = this.T;
                    c2 = 26;
                    float f42 = f3;
                    f3 = f;
                    f2 = f42;
                }
                f2 = 0.0f;
                z = false;
                c2 = 0;
            }
            float f5 = f3 * this.I;
            int i6 = (int) (f2 * this.H);
            int i7 = (int) f5;
            if (z) {
                OverScroller overScroller = this.J.a;
                an(i6 + (overScroller.getFinalX() - overScroller.getCurrX()), i7 + (overScroller.getFinalY() - overScroller.getCurrY()), true);
            } else {
                lr lrVar = this.m;
                if (lrVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.u) {
                    int[] iArr = this.R;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean X = lrVar.X();
                    boolean Y = this.m.Y();
                    if (Y) {
                        i = (X ? 1 : 0) | 2;
                    } else {
                        i = X ? 1 : 0;
                    }
                    if (motionEvent == null) {
                        y = getHeight() / 2.0f;
                    } else {
                        y = motionEvent.getY();
                    }
                    if (motionEvent == null) {
                        x = getWidth() / 2.0f;
                    } else {
                        x = motionEvent.getX();
                    }
                    int a2 = i6 - a(i6, y);
                    int at = i7 - at(i7, x);
                    ao(i, 1);
                    if (true != X) {
                        i2 = 0;
                    } else {
                        i2 = a2;
                    }
                    if (true != Y) {
                        i3 = 0;
                    } else {
                        i3 = at;
                    }
                    if (ad(i2, i3, this.R, this.ay, 1)) {
                        int[] iArr2 = this.R;
                        a2 -= iArr2[0];
                        at -= iArr2[1];
                    }
                    int i8 = at;
                    if (true != X) {
                        i4 = 0;
                    } else {
                        i4 = a2;
                    }
                    if (true != Y) {
                        i5 = 0;
                    } else {
                        i5 = i8;
                    }
                    ai(i4, i5, motionEvent, 1);
                    kj kjVar = this.K;
                    if (kjVar != null) {
                        if (a2 == 0) {
                            if (i8 != 0) {
                                a2 = 0;
                            }
                        }
                        kjVar.a(this, a2, i8);
                    }
                    aa(1);
                }
            }
            if (c2 != 0 && !z) {
                this.U.a(motionEvent, 26);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:            if (r0 != false) goto L135;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0191, code lost:            if (r9.am != 2) goto L173;     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        y();
        Trace.endSection();
        this.s = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        lr lrVar = this.m;
        if (lrVar == null) {
            w(i, i2);
            return;
        }
        boolean z = false;
        if (lrVar.Z()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m.bl(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aB = z;
            if (!z && this.l != null) {
                if (this.M.d == 1) {
                    aw();
                }
                this.m.aS(i, i2);
                this.M.i = true;
                ax();
                this.m.aU(i, i2);
                if (this.m.ad()) {
                    this.m.aS(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.M.i = true;
                    ax();
                    this.m.aU(i, i2);
                }
                this.aC = getMeasuredWidth();
                this.aD = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.v) {
            Y();
            L();
            aA();
            M();
            me meVar = this.M;
            if (meVar.k) {
                meVar.g = true;
            } else {
                this.g.d();
                this.M.g = false;
            }
            this.v = false;
            Z(false);
        } else if (this.M.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        lj ljVar = this.l;
        if (ljVar != null) {
            this.M.e = ljVar.a();
        } else {
            this.M.e = 0;
        }
        Y();
        this.m.bl(i, i2);
        Z(false);
        this.M.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (ah()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ma)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ma maVar = (ma) parcelable;
        this.f = maVar;
        super.onRestoreInstanceState(maVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        ma maVar = new ma(super.onSaveInstanceState());
        ma maVar2 = this.f;
        if (maVar2 != null) {
            maVar.a = maVar2.a;
        } else {
            lr lrVar = this.m;
            if (lrVar != null) {
                parcelable = lrVar.M();
            } else {
                parcelable = null;
            }
            maVar.a = parcelable;
        }
        return maVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0192, code lost:            if (r0 != 0) goto L209;     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void q(mh mhVar) {
        View view = mhVar.b;
        ViewParent parent = view.getParent();
        this.e.m(g(view));
        if (mhVar.u()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.h.f(view, -1, true);
            return;
        }
        jm jmVar = this.h;
        int D = jmVar.e.D(view);
        if (D >= 0) {
            jmVar.a.e(D);
            jmVar.i(view);
        } else {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
    }

    public final void r(String str) {
        if (ah()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(k()));
            }
            throw new IllegalStateException(str);
        }
        if (this.al > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(k())));
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        mh h = h(view);
        if (h != null) {
            if (h.u()) {
                h.g();
            } else if (!h.x()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + h + k());
            }
        }
        view.clearAnimation();
        x(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m.aX() && !ah() && view2 != null) {
            aC(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.aY(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            ((lu) this.p.get(i)).m();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ag == 0 && !this.u) {
            super.requestLayout();
        } else {
            this.t = true;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        lr lrVar = this.m;
        if (lrVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.u) {
            boolean X = lrVar.X();
            boolean Y = this.m.Y();
            if (!X) {
                if (Y) {
                    Y = true;
                } else {
                    return;
                }
            }
            if (true != X) {
                i = 0;
            }
            if (true != Y) {
                i2 = 0;
            }
            ai(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (ah()) {
            int i2 = 0;
            if (accessibilityEvent != null) {
                i = accessibilityEvent.getContentChangeTypes();
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.ai |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            H();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.s) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        au().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return au().l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        au().b();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.u) {
            r("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.u = false;
                if (this.t && this.m != null && this.l != null) {
                    requestLayout();
                }
                this.t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.u = true;
            this.ah = true;
            ab();
        }
    }

    final void t() {
        int b2 = this.h.b();
        for (int i = 0; i < b2; i++) {
            mh h = h(this.h.e(i));
            if (!h.x()) {
                h.d();
            }
        }
        lw lwVar = this.e;
        int size = lwVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((mh) lwVar.c.get(i2)).d();
        }
        int size2 = lwVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((mh) lwVar.a.get(i3)).d();
        }
        ArrayList arrayList = lwVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((mh) lwVar.b.get(i4)).d();
            }
        }
    }

    public final void u(int i, int i2) {
        EdgeEffect edgeEffect = this.z;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.z.onRelease();
            z = this.z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.B.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.C;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.C.onRelease();
            z |= this.C.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void v() {
        if (this.s && !this.x) {
            if (this.g.k()) {
                if (this.g.j(4) && !this.g.j(11)) {
                    Trace.beginSection("RV PartialInvalidate");
                    Y();
                    L();
                    this.g.f();
                    if (!this.t) {
                        int a2 = this.h.a();
                        int i = 0;
                        while (true) {
                            if (i < a2) {
                                mh h = h(this.h.d(i));
                                if (h != null && !h.x() && h.v()) {
                                    y();
                                    break;
                                }
                                i++;
                            } else {
                                this.g.c();
                                break;
                            }
                        }
                    }
                    Z(true);
                    M();
                    Trace.endSection();
                    return;
                }
                if (this.g.k()) {
                    Trace.beginSection("RV FullInvalidate");
                    y();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        y();
        Trace.endSection();
    }

    public final void w(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = bwn.a;
        setMeasuredDimension(lr.am(i, paddingLeft, getMinimumWidth()), lr.am(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void x(View view) {
        h(view);
        List list = this.w;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x030d, code lost:            if (r17.h.k(getFocusedChild()) != false) goto L383;     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void y() {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.y():void");
    }

    public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        au().i(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ae = new ly(this);
        this.e = new lw(this);
        this.V = new atk((char[]) null);
        this.j = new Rect();
        this.af = new Rect();
        this.k = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.ag = 0;
        this.x = false;
        this.y = false;
        this.ak = 0;
        this.al = 0;
        this.aF = d;
        this.D = new lo(null);
        this.am = 0;
        this.an = -1;
        this.H = Float.MIN_VALUE;
        this.I = Float.MIN_VALUE;
        this.au = true;
        this.J = new mg(this);
        this.L = b ? new kh() : null;
        this.M = new me();
        this.N = false;
        this.O = false;
        this.aG = new njz(this, null);
        this.P = false;
        this.aw = new int[2];
        this.ay = new int[2];
        this.az = new int[2];
        this.R = new int[2];
        this.S = new ArrayList();
        this.aA = new w(this, 17, null);
        this.aC = 0;
        this.aD = 0;
        this.aH = new njz(this, null);
        bzs bzsVar = new bzs(this, 1);
        this.aE = bzsVar;
        this.U = new bus(getContext(), bzsVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.E = viewConfiguration.getScaledTouchSlop();
        this.H = bws.a(viewConfiguration, context);
        this.I = bws.b(viewConfiguration, context);
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.at = viewConfiguration.getScaledMaximumFlingVelocity();
        this.ad = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.D.m = this.aG;
        this.g = new hu(new njz(this, null));
        this.h = new jm(new njz(this, null));
        if ((Build.VERSION.SDK_INT < 26 || bwe.a(this) == 0) && Build.VERSION.SDK_INT >= 26) {
            bwe.h(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.aj = (AccessibilityManager) getContext().getSystemService("accessibility");
        mj mjVar = new mj(this);
        this.Q = mjVar;
        bwn.q(this, mjVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ep.a, i, 0);
        bwn.p(this, context, ep.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.i = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                new ke(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.apps.adm.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.apps.adm.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.apps.adm.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(k()));
            }
        }
        obtainStyledAttributes.recycle();
        this.T = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        aK(context, string, attributeSet, i);
        int[] iArr = aa;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        bwn.p(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.google.android.apps.adm.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        lr lrVar = this.m;
        if (lrVar != null) {
            return lrVar.cG(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(k()));
    }
}
