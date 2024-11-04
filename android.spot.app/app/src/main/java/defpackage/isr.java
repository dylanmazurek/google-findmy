package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class isr extends ViewGroup implements gv {
    public gh A;
    public boolean B;
    private final View.OnClickListener D;
    private final buf E;
    private final SparseArray F;
    private ColorStateList G;
    private final ColorStateList H;
    public final cmk b;
    public int c;
    public int d;
    public isp[] e;
    public int f;
    public int g;
    public int h;
    public ColorStateList i;
    public int j;
    public int k;
    public boolean l;
    public ColorStateList m;
    public int n;
    public final SparseArray o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public ivl w;
    public boolean x;
    public ColorStateList y;
    public ist z;
    private static final int[] a = {R.attr.state_checked};
    private static final int[] C = {-16842910};

    public isr(Context context) {
        super(context);
        this.E = new buh(5);
        this.F = new SparseArray(5);
        this.f = 0;
        this.g = 0;
        this.o = new SparseArray(5);
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.x = false;
        this.H = g();
        if (isInEditMode()) {
            this.b = null;
        } else {
            cmk cmkVar = new cmk(null);
            this.b = cmkVar;
            cmkVar.J(0);
            cmkVar.C(hzc.n(getContext(), com.google.android.apps.adm.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.apps.adm.R.integer.material_motion_duration_long_1)));
            cmkVar.D(hwx.h(getContext(), com.google.android.apps.adm.R.attr.motionEasingStandard, inc.b));
            cmkVar.e(new iry());
        }
        this.D = new ewu(this, 11, null);
        setImportantForAccessibility(1);
    }

    @Override // defpackage.gv
    public final void a(gh ghVar) {
        this.A = ghVar;
    }

    protected abstract isp b(Context context);

    public final Drawable c() {
        if (this.w != null && this.y != null) {
            ivf ivfVar = new ivf(this.w);
            ivfVar.L(this.y);
            return ivfVar;
        }
        return null;
    }

    public final void d() {
        inv invVar;
        removeAllViews();
        isp[] ispVarArr = this.e;
        if (ispVarArr != null) {
            for (isp ispVar : ispVarArr) {
                if (ispVar != null) {
                    this.E.b(ispVar);
                    ispVar.D(ispVar.e);
                    ispVar.f = null;
                    ispVar.g = 0.0f;
                    ispVar.a = false;
                }
            }
        }
        if (this.A.size() != 0) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.A.size(); i++) {
                hashSet.add(Integer.valueOf(this.A.getItem(i).getItemId()));
            }
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                int keyAt = this.o.keyAt(i2);
                if (!hashSet.contains(Integer.valueOf(keyAt))) {
                    this.o.delete(keyAt);
                }
            }
            this.e = new isp[this.A.size()];
            boolean f = f(this.c, this.A.f().size());
            for (int i3 = 0; i3 < this.A.size(); i3++) {
                this.z.b = true;
                this.A.getItem(i3).setCheckable(true);
                this.z.b = false;
                isp ispVar2 = (isp) this.E.a();
                if (ispVar2 == null) {
                    ispVar2 = b(getContext());
                }
                this.e[i3] = ispVar2;
                ispVar2.q(this.G);
                ispVar2.p(this.h);
                ispVar2.C(this.H);
                ispVar2.B(this.j);
                ispVar2.z(this.k);
                ispVar2.A(this.l);
                ispVar2.C(this.i);
                int i4 = this.p;
                if (i4 != -1) {
                    ispVar2.u(i4);
                }
                int i5 = this.q;
                if (i5 != -1) {
                    ispVar2.t(i5);
                }
                ispVar2.x(this.B);
                int i6 = this.r;
                if (i6 != -1) {
                    ispVar2.j(i6);
                }
                ispVar2.m(this.t);
                ispVar2.i(this.u);
                ispVar2.k(this.v);
                ispVar2.g(c());
                ispVar2.i = this.x;
                ispVar2.h(this.s);
                ispVar2.r(this.n);
                ispVar2.v(this.m);
                ispVar2.y(f);
                ispVar2.w(this.c);
                ispVar2.s(this.d);
                gj gjVar = (gj) this.A.getItem(i3);
                ispVar2.f(gjVar);
                int i7 = gjVar.a;
                ispVar2.setOnTouchListener((View.OnTouchListener) this.F.get(i7));
                ispVar2.setOnClickListener(this.D);
                int i8 = this.f;
                if (i8 != 0 && i7 == i8) {
                    this.g = i3;
                }
                int id = ispVar2.getId();
                if (id != -1 && (invVar = (inv) this.o.get(id)) != null) {
                    ispVar2.n(invVar);
                }
                addView(ispVar2);
            }
            int min = Math.min(this.A.size() - 1, this.g);
            this.g = min;
            this.A.getItem(min).setChecked(true);
            return;
        }
        this.f = 0;
        this.g = 0;
        this.e = null;
    }

    public final void e(ColorStateList colorStateList) {
        this.G = colorStateList;
        isp[] ispVarArr = this.e;
        if (ispVarArr != null) {
            for (isp ispVar : ispVarArr) {
                ispVar.q(colorStateList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
            return false;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final ColorStateList g() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            ColorStateList e = bqx.e(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(com.google.android.apps.adm.R.attr.colorPrimary, typedValue, true)) {
                int i = typedValue.data;
                int defaultColor = e.getDefaultColor();
                int[] iArr = C;
                return new ColorStateList(new int[][]{iArr, a, EMPTY_STATE_SET}, new int[]{e.getColorForState(iArr, defaultColor), i, defaultColor});
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new byn(accessibilityNodeInfo).v(bet.k(1, this.A.f().size(), 1));
    }
}
