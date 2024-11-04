package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import com.google.ar.core.ImageMetadata;
import defpackage.bop;
import defpackage.bos;
import defpackage.bwb;
import defpackage.bwn;
import defpackage.byi;
import defpackage.cah;
import defpackage.cai;
import defpackage.ced;
import defpackage.hzc;
import defpackage.inc;
import defpackage.ioi;
import defpackage.ioj;
import defpackage.iol;
import defpackage.iom;
import defpackage.ion;
import defpackage.iop;
import defpackage.ioq;
import defpackage.ipb;
import defpackage.ish;
import defpackage.isi;
import defpackage.ism;
import defpackage.ivf;
import defpackage.ivl;
import defpackage.nu;
import defpackage.oa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomSheetBehavior extends bop implements isi {
    int A;
    public int B;
    public WeakReference C;
    WeakReference D;
    public WeakReference E;
    public int F;
    public boolean G;
    final SparseIntArray H;
    ish I;
    private int J;
    private float K;
    private boolean L;
    private int M;
    private int N;
    private ColorStateList O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private ivl S;
    private boolean T;
    private final ioq U;
    private ValueAnimator V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    public boolean a;
    private boolean aa;
    private final float ab;
    private int ac;
    private final ArrayList ad;
    private VelocityTracker ae;
    private int af;
    private Map ag;
    private final cah ah;
    public int b;
    public int c;
    public ivf d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    public float s;
    public int t;
    float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public cai z;

    public BottomSheetBehavior() {
        this.J = 0;
        this.a = true;
        this.e = -1;
        this.f = -1;
        this.U = new ioq(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.W = true;
        this.y = 4;
        this.ab = 0.1f;
        this.ad = new ArrayList();
        this.af = -1;
        this.H = new SparseIntArray();
        this.ah = new iol(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:            r0 = r0.getRootWindowInsets();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float P() {
        /*
            r4 = this;
            ivf r0 = r4.d
            if (r0 == 0) goto L4b
            java.lang.ref.WeakReference r0 = r4.C
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L4b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L4b
            java.lang.ref.WeakReference r0 = r4.C
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r4.ab()
            if (r1 == 0) goto L4b
            android.view.WindowInsets r0 = defpackage.fr$$ExternalSyntheticApiModelOutline0.m109m(r0)
            if (r0 == 0) goto L4b
            ivf r1 = r4.d
            float r1 = r1.u()
            r2 = 0
            android.view.RoundedCorner r2 = defpackage.api$$ExternalSyntheticApiModelOutline0.m(r0, r2)
            float r1 = ad(r1, r2)
            ivf r2 = r4.d
            float r2 = r2.v()
            r3 = 1
            android.view.RoundedCorner r0 = defpackage.api$$ExternalSyntheticApiModelOutline0.m(r0, r3)
            float r0 = ad(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
        L4b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.P():float");
    }

    private final int Q() {
        int i;
        if (this.L) {
            return Math.min(Math.max(this.M, this.B - ((this.A * 9) / 16)), this.ac) + this.n;
        }
        if (!this.P && !this.h && (i = this.g) > 0) {
            return Math.max(this.c, i + this.N);
        }
        return this.c + this.n;
    }

    private final int R(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return this.r;
                }
                return this.B;
            }
            return this.t;
        }
        return u();
    }

    private final void S() {
        int Q = Q();
        if (this.a) {
            this.t = Math.max(this.B - Q, this.q);
        } else {
            this.t = this.B - Q;
        }
    }

    private final void T() {
        this.r = (int) (this.B * (1.0f - this.s));
    }

    private final void U(View view, int i) {
        if (view != null) {
            bwn.n(view, ImageMetadata.LENS_APERTURE);
            bwn.n(view, 262144);
            bwn.n(view, ImageMetadata.SHADING_MODE);
            int i2 = this.H.get(i, -1);
            if (i2 != -1) {
                bwn.n(view, i2);
                this.H.delete(i);
            }
        }
    }

    private final void V(View view, byi byiVar, int i) {
        bwn.o(view, byiVar, null, new iom(this, i));
    }

    private final void W() {
        this.F = -1;
        this.af = -1;
        VelocityTracker velocityTracker = this.ae;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ae = null;
        }
    }

    private final void X() {
        WeakReference weakReference = this.C;
        if (weakReference != null) {
            Y((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.D;
        if (weakReference2 != null) {
            Y((View) weakReference2.get(), 1);
        }
    }

    private final void Y(View view, int i) {
        int i2;
        boolean z;
        if (view != null) {
            U(view, i);
            int i3 = 6;
            if (!this.a && this.y != 6) {
                SparseIntArray sparseIntArray = this.H;
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                iom iomVar = new iom(this, 6);
                List h = bwn.h(view);
                int i4 = 0;
                while (true) {
                    if (i4 < h.size()) {
                        if (TextUtils.equals(string, ((byi) h.get(i4)).b())) {
                            i2 = ((byi) h.get(i4)).a();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = -1;
                        for (int i6 = 0; i6 < 32 && i5 == -1; i6++) {
                            i5 = bwn.a[i6];
                            boolean z2 = true;
                            for (int i7 = 0; i7 < h.size(); i7++) {
                                if (((byi) h.get(i7)).a() != i5) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (true != z2) {
                                i5 = -1;
                            }
                        }
                        i2 = i5;
                    }
                }
                if (i2 != -1) {
                    bwn.i(view, new byi(null, i2, string, iomVar, null));
                }
                sparseIntArray.put(i, i2);
            }
            if (this.v && this.y != 5) {
                V(view, byi.h, 5);
            }
            int i8 = this.y;
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 != 6) {
                        return;
                    }
                    V(view, byi.g, 4);
                    V(view, byi.f, 3);
                    return;
                }
                if (true == this.a) {
                    i3 = 3;
                }
                V(view, byi.f, i3);
                return;
            }
            if (true == this.a) {
                i3 = 4;
            }
            V(view, byi.g, i3);
        }
    }

    private final void Z(int i, boolean z) {
        boolean z2;
        ValueAnimator valueAnimator;
        if (i != 2) {
            if (this.y == 3 && (this.R || ab())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.T != z2 && this.d != null) {
                this.T = z2;
                float f = 1.0f;
                if (z && (valueAnimator = this.V) != null) {
                    if (valueAnimator.isRunning()) {
                        this.V.reverse();
                        return;
                    }
                    float f2 = this.d.q.l;
                    if (z2) {
                        f = P();
                    }
                    this.V.setFloatValues(f2, f);
                    this.V.start();
                    return;
                }
                ValueAnimator valueAnimator2 = this.V;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.V.cancel();
                }
                ivf ivfVar = this.d;
                if (this.T) {
                    f = P();
                }
                ivfVar.M(f);
            }
        }
    }

    private final void aa(boolean z) {
        WeakReference weakReference = this.C;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.ag == null) {
                        this.ag = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.C.get() && z) {
                        this.ag.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.ag = null;
                }
            }
        }
    }

    private final boolean ab() {
        WeakReference weakReference = this.C;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.C.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean ac() {
        if (this.z == null) {
            return false;
        }
        if (!this.x && this.y != 1) {
            return false;
        }
        return true;
    }

    private static final float ad(float f, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f2 = radius;
            if (f2 > 0.0f && f > 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    private static final int ae(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    public static BottomSheetBehavior x(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof bos) {
            bop bopVar = ((bos) layoutParams).a;
            if (bopVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) bopVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void A(int i) {
        float f;
        float f2;
        View view = (View) this.C.get();
        if (view != null && !this.ad.isEmpty()) {
            int i2 = this.t;
            if (i <= i2 && i2 != u()) {
                int i3 = this.t;
                f = i3 - i;
                f2 = i3 - u();
            } else {
                int i4 = this.t;
                f = i4 - i;
                f2 = this.B - i4;
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.ad.size(); i5++) {
                ((ion) this.ad.get(i5)).a(view, f3);
            }
        }
    }

    @Override // defpackage.isi
    public final void B() {
        ish ishVar = this.I;
        if (ishVar == null) {
            return;
        }
        nu nuVar = ishVar.f;
        ishVar.f = null;
        int i = 4;
        if (nuVar != null && Build.VERSION.SDK_INT >= 34) {
            if (this.v) {
                ish ishVar2 = this.I;
                ioi ioiVar = new ioi(this);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ishVar2.b, (Property<View, Float>) View.TRANSLATION_Y, ishVar2.b.getHeight() * ishVar2.b.getScaleY());
                ofFloat.setInterpolator(new ced());
                ofFloat.setDuration(inc.b(ishVar2.c, ishVar2.d, nuVar.a));
                ofFloat.addListener(new ism(ishVar2));
                ofFloat.addListener(ioiVar);
                ofFloat.start();
                return;
            }
            Animator a = this.I.a();
            a.setDuration(inc.b(r2.c, r2.d, nuVar.a));
            a.start();
            H(4);
            return;
        }
        if (true == this.v) {
            i = 5;
        }
        H(i);
    }

    public final void C(ion ionVar) {
        this.ad.remove(ionVar);
    }

    public final void D(View view) {
        WeakReference weakReference;
        if (view == null && (weakReference = this.D) != null) {
            U((View) weakReference.get(), 1);
            this.D = null;
        } else {
            this.D = new WeakReference(view);
            Y(view, 1);
        }
    }

    public final void E(int i) {
        if (i >= 0) {
            this.p = i;
            Z(this.y, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final void F(boolean z) {
        if (this.v != z) {
            this.v = z;
            if (!z && this.y == 5) {
                H(4);
            }
            X();
        }
    }

    public final void G(int i) {
        if (i == -1) {
            if (!this.L) {
                this.L = true;
            } else {
                return;
            }
        } else {
            if (!this.L && this.c == i) {
                return;
            }
            this.L = false;
            this.c = Math.max(0, i);
        }
        O();
    }

    public final void H(int i) {
        int i2;
        if (!this.v && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        if (i == 6 && this.a && R(6) <= this.q) {
            i2 = 3;
        } else {
            i2 = i;
        }
        WeakReference weakReference = this.C;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.C.get();
            oa oaVar = new oa(this, view, i2, 13);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(oaVar);
                return;
            } else {
                oaVar.run();
                return;
            }
        }
        I(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:            if (r8 == 4) goto L61;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(int r8) {
        /*
            r7 = this;
            int r0 = r7.y
            if (r0 != r8) goto L5
            goto L54
        L5:
            r7.y = r8
            r0 = 6
            r1 = 3
            r2 = 5
            r3 = 4
            if (r8 == r3) goto L18
            if (r8 == r1) goto L18
            if (r8 == r0) goto L18
            boolean r4 = r7.v
            if (r4 == 0) goto L18
            if (r8 != r2) goto L18
            r8 = 5
        L18:
            java.lang.ref.WeakReference r4 = r7.C
            if (r4 == 0) goto L54
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L54
            r5 = 0
            r6 = 1
            if (r8 != r1) goto L2c
            r7.aa(r6)
            goto L38
        L2c:
            if (r8 == r0) goto L33
            if (r8 == r2) goto L33
            if (r8 != r3) goto L38
            goto L34
        L33:
            r3 = r8
        L34:
            r7.aa(r5)
            r8 = r3
        L38:
            r7.Z(r8, r6)
        L3b:
            java.util.ArrayList r0 = r7.ad
            int r0 = r0.size()
            if (r5 >= r0) goto L51
            java.util.ArrayList r0 = r7.ad
            java.lang.Object r0 = r0.get(r5)
            ion r0 = (defpackage.ion) r0
            r0.b(r4, r8)
            int r5 = r5 + 1
            goto L3b
        L51:
            r7.X()
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.I(int):void");
    }

    @Override // defpackage.isi
    public final void J(nu nuVar) {
        ish ishVar = this.I;
        if (ishVar == null) {
            return;
        }
        ishVar.f = nuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:            if (r1.i(r3.getLeft(), r0) != false) goto L34;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.R(r4)
            cai r1 = r2.z
            if (r1 == 0) goto L3f
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.i(r3, r0)
            if (r3 == 0) goto L3f
            goto L31
        L15:
            int r5 = r3.getLeft()
            r1.d = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.g(r5, r0, r3, r3)
            if (r3 != 0) goto L31
            int r3 = r1.a
            if (r3 != 0) goto L3f
            android.view.View r3 = r1.d
            if (r3 == 0) goto L3f
            r3 = 0
            r1.d = r3
            goto L3f
        L31:
            r3 = 2
            r2.I(r3)
            r3 = 1
            r2.Z(r4, r3)
            ioq r3 = r2.U
            r3.a(r4)
            return
        L3f:
            r2.I(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.K(android.view.View, int, boolean):void");
    }

    @Override // defpackage.isi
    public final void L(nu nuVar) {
        ish ishVar = this.I;
        if (ishVar != null) {
            if (ishVar.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            nu nuVar2 = ishVar.f;
            ishVar.f = nuVar;
            if (nuVar2 != null) {
                ishVar.b(nuVar.a);
            }
        }
    }

    public final boolean M() {
        if (this.v) {
            return true;
        }
        return false;
    }

    public final boolean N(View view, float f) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * this.ab)) - this.t) / Q() > 0.5f) {
            return true;
        }
        return false;
    }

    public final void O() {
        View view;
        if (this.C != null) {
            S();
            if (this.y == 4 && (view = (View) this.C.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // defpackage.bop
    public final void a(bos bosVar) {
        this.C = null;
        this.z = null;
        this.I = null;
    }

    @Override // defpackage.bop
    public final void b() {
        this.C = null;
        this.z = null;
        this.I = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:            if (r4.getTop() <= r2.r) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:            if (java.lang.Math.abs(r3 - r2.q) < java.lang.Math.abs(r3 - r2.t)) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:            if (r3 < java.lang.Math.abs(r3 - r2.t)) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:            if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.t)) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:            if (java.lang.Math.abs(r3 - r2.r) < java.lang.Math.abs(r3 - r2.t)) goto L76;     */
    @Override // defpackage.bop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.u()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.I(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.E
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.aa
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.Z
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.a
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.r
            if (r3 <= r6) goto Lb0
        L32:
            r0 = 6
            goto Lb0
        L35:
            boolean r3 = r2.v
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.ae
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.K
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ae
            int r6 = r2.F
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.N(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.Z
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L75
            int r5 = r2.q
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.r
            if (r3 >= r1) goto L84
            int r6 = r2.t
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.a
            if (r3 == 0) goto L9a
        L98:
            r0 = 4
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.r
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.K(r4, r0, r3)
            r2.aa = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.bop
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        cai caiVar;
        if (view.isShown() && this.x) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                W();
                actionMasked = 0;
            }
            if (this.ae == null) {
                this.ae = VelocityTracker.obtain();
            }
            this.ae.addMovement(motionEvent);
            View view3 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.G = false;
                    this.F = -1;
                    if (this.Y) {
                        this.Y = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.af = (int) motionEvent.getY();
                if (this.y != 2) {
                    WeakReference weakReference = this.E;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.k(view2, x, this.af)) {
                        this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.G = true;
                    }
                }
                if (this.F == -1 && !coordinatorLayout.k(view, x, this.af)) {
                    z = true;
                } else {
                    z = false;
                }
                this.Y = z;
            }
            if (!this.Y && (caiVar = this.z) != null && caiVar.j(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.E;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked == 2 && view3 != null && !this.Y && this.y != 1 && !coordinatorLayout.k(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.z != null && (i = this.af) != -1) {
                if (Math.abs(i - motionEvent.getY()) > this.z.b) {
                    return true;
                }
            }
            return false;
        }
        this.Y = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    @Override // defpackage.bop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.bop
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        if (ac()) {
            this.z.e(motionEvent);
        }
        if (actionMasked == 0) {
            W();
        }
        if (this.ae == null) {
            this.ae = VelocityTracker.obtain();
        }
        this.ae.addMovement(motionEvent);
        if (ac() && actionMasked == 2 && !this.Y) {
            float abs = Math.abs(this.af - motionEvent.getY());
            cai caiVar = this.z;
            if (abs > caiVar.b) {
                caiVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        if (this.Y) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bop
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ae(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.e, marginLayoutParams.width), ae(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.bop
    public final boolean l(View view) {
        WeakReference weakReference = this.E;
        if (weakReference == null || view != weakReference.get() || this.y == 3 || this.X) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:            if (r2 == false) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0066, code lost:            if (r2 == false) goto L87;     */
    @Override // defpackage.bop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, int r8, int[] r9, int r10) {
        /*
            r4 = this;
            r5 = 1
            if (r10 != r5) goto L5
            goto L9a
        L5:
            java.lang.ref.WeakReference r10 = r4.E
            if (r10 == 0) goto L10
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            goto L11
        L10:
            r10 = 0
        L11:
            if (r7 != r10) goto L9a
            int r0 = r6.getTop()
            int r1 = r0 - r8
            if (r8 <= 0) goto L4f
            boolean r2 = r4.aa
            if (r2 != 0) goto L2b
            boolean r2 = r4.W
            if (r2 != 0) goto L2b
            if (r7 != r10) goto L2b
            boolean r7 = r7.canScrollVertically(r5)
            if (r7 != 0) goto L63
        L2b:
            int r7 = r4.u()
            if (r1 >= r7) goto L41
            int r7 = r4.u()
            int r0 = r0 - r7
            r9[r5] = r0
            int r7 = -r0
            defpackage.bwn.m(r6, r7)
            r7 = 3
            r4.I(r7)
            goto L8c
        L41:
            boolean r7 = r4.x
            if (r7 == 0) goto L9a
            r9[r5] = r8
            int r7 = -r8
            defpackage.bwn.m(r6, r7)
            r4.I(r5)
            goto L8c
        L4f:
            if (r8 >= 0) goto L8c
            r2 = -1
            boolean r2 = r7.canScrollVertically(r2)
            boolean r3 = r4.aa
            if (r3 != 0) goto L66
            boolean r3 = r4.W
            if (r3 != 0) goto L66
            if (r7 != r10) goto L66
            if (r2 != 0) goto L63
            goto L68
        L63:
            r4.X = r5
            return
        L66:
            if (r2 != 0) goto L8c
        L68:
            int r7 = r4.t
            if (r1 <= r7) goto L7f
            boolean r10 = r4.M()
            if (r10 == 0) goto L73
            goto L7f
        L73:
            int r0 = r0 - r7
            r9[r5] = r0
            int r7 = -r0
            defpackage.bwn.m(r6, r7)
            r7 = 4
            r4.I(r7)
            goto L8c
        L7f:
            boolean r7 = r4.x
            if (r7 == 0) goto L9a
            r9[r5] = r8
            int r7 = -r8
            defpackage.bwn.m(r6, r7)
            r4.I(r5)
        L8c:
            int r6 = r6.getTop()
            r4.A(r6)
            r4.Z = r8
            r4.aa = r5
            r5 = 0
            r4.X = r5
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.bop
    public final void o(View view, Parcelable parcelable) {
        iop iopVar = (iop) parcelable;
        int i = this.J;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = iopVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = iopVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.v = iopVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.w = iopVar.g;
            }
        }
        int i3 = iopVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.y = i2;
    }

    @Override // defpackage.bop
    public final Parcelable p(View view) {
        return new iop(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.bop
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.Z = 0;
        this.aa = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    public final int u() {
        int i;
        if (this.a) {
            return this.q;
        }
        int i2 = this.p;
        if (this.Q) {
            i = 0;
        } else {
            i = this.o;
        }
        return Math.max(i2, i);
    }

    public final int v() {
        if (this.L) {
            return -1;
        }
        return this.c;
    }

    final View w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (bwb.y(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View w = w(viewGroup.getChildAt(i));
                if (w != null) {
                    return w;
                }
            }
        }
        return null;
    }

    public final void y(ion ionVar) {
        if (!this.ad.contains(ionVar)) {
            this.ad.add(ionVar);
        }
    }

    @Override // defpackage.isi
    public final void z() {
        ish ishVar = this.I;
        if (ishVar != null) {
            if (ishVar.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            nu nuVar = ishVar.f;
            ishVar.f = null;
            if (nuVar != null) {
                Animator a = ishVar.a();
                a.setDuration(ishVar.e);
                a.start();
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = 0;
        this.a = true;
        this.e = -1;
        this.f = -1;
        this.U = new ioq(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.W = true;
        this.y = 4;
        this.ab = 0.1f;
        this.ad = new ArrayList();
        this.af = -1;
        this.H = new SparseIntArray();
        this.ah = new iol(this);
        this.N = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ipb.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.O = hzc.i(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.S = new ivl(ivl.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.S != null) {
            ivf ivfVar = new ivf(this.S);
            this.d = ivfVar;
            ivfVar.I(context);
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                this.d.L(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.d.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(P(), 1.0f);
        this.V = ofFloat;
        ofFloat.setDuration(500L);
        this.V.addUpdateListener(new ioj(this, 0));
        this.u = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && peekValue.data == -1) {
            G(peekValue.data);
        } else {
            G(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        F(obtainStyledAttributes.getBoolean(9, false));
        this.P = obtainStyledAttributes.getBoolean(14, false);
        boolean z = obtainStyledAttributes.getBoolean(7, true);
        if (this.a != z) {
            this.a = z;
            if (this.C != null) {
                S();
            }
            I((this.a && this.y == 6) ? 3 : this.y);
            Z(this.y, true);
            X();
        }
        this.w = obtainStyledAttributes.getBoolean(13, false);
        this.x = obtainStyledAttributes.getBoolean(4, true);
        this.W = obtainStyledAttributes.getBoolean(5, true);
        this.J = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.s = f;
            if (this.C != null) {
                T();
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                E(peekValue2.data);
            } else {
                E(obtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.b = obtainStyledAttributes.getInt(12, 500);
            this.h = obtainStyledAttributes.getBoolean(18, false);
            this.i = obtainStyledAttributes.getBoolean(19, false);
            this.j = obtainStyledAttributes.getBoolean(20, false);
            this.Q = obtainStyledAttributes.getBoolean(21, true);
            this.k = obtainStyledAttributes.getBoolean(15, false);
            this.l = obtainStyledAttributes.getBoolean(16, false);
            this.m = obtainStyledAttributes.getBoolean(17, false);
            this.R = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.K = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.bop
    public final void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
