package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ho extends fx {
    hl h;
    public int i;
    public hm j;
    public hj k;
    public int l;
    public fiq m;
    final dm n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final SparseBooleanArray t;
    private njz u;

    public ho(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.n = new dm(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [gu] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.fx
    public final View b(gj gjVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = gjVar.getActionView();
        int i = 0;
        if (actionView == null || gjVar.m()) {
            if (view instanceof gu) {
                actionMenuItemView = (gu) view;
            } else {
                actionMenuItemView = (gu) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            }
            actionMenuItemView.f(gjVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            if (this.u == null) {
                this.u = new njz(this, null);
            }
            actionMenuItemView2.c = this.u;
            actionView = actionMenuItemView;
        }
        if (true == gjVar.o) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof hr)) {
            actionView.setLayoutParams(ActionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.gt
    public final Parcelable bL() {
        hn hnVar = new hn();
        hnVar.a = this.l;
        return hnVar;
    }

    @Override // defpackage.fx, defpackage.gt
    public final void c(Context context, gh ghVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = ghVar;
        Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.i = dd.e(context);
        int i = this.q;
        if (this.o) {
            if (this.h == null) {
                this.h = new hl(this, this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.h.getMeasuredWidth();
        } else {
            this.h = null;
        }
        this.r = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.fx, defpackage.gt
    public final void d(gh ghVar, boolean z) {
        p();
        gs gsVar = this.e;
        if (gsVar != null) {
            gsVar.a(ghVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fx, defpackage.gt
    public final void f(boolean z) {
        int i;
        gj gjVar;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            gh ghVar = this.c;
            if (ghVar != null) {
                ghVar.k();
                ArrayList f = this.c.f();
                int size = f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    gj gjVar2 = (gj) f.get(i2);
                    if (gjVar2.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof gu) {
                            gjVar = ((gu) childAt).a();
                        } else {
                            gjVar = null;
                        }
                        View b = b(gjVar2, childAt, viewGroup);
                        if (gjVar2 != gjVar) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.f).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.h) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        gh ghVar2 = this.c;
        if (ghVar2 != null) {
            ghVar2.k();
            ArrayList arrayList2 = ghVar2.d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bqj bqjVar = ((gj) arrayList2.get(i3)).p;
            }
        }
        gh ghVar3 = this.c;
        if (ghVar3 != null) {
            arrayList = ghVar3.e();
        }
        if (this.o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((gj) arrayList.get(0)).o;
            } else if (size3 > 0) {
                z2 = true;
            }
            if (z2) {
                if (this.h == null) {
                    this.h = new hl(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.h.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.h);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f;
                    hl hlVar = this.h;
                    hr n = ActionMenuView.n();
                    n.a = true;
                    actionMenuView.addView(hlVar, n);
                }
                ((ActionMenuView) this.f).b = this.o;
            }
        }
        hl hlVar2 = this.h;
        if (hlVar2 != null) {
            Object parent = hlVar2.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.h);
            }
        }
        ((ActionMenuView) this.f).b = this.o;
    }

    @Override // defpackage.fx, defpackage.gt
    public final boolean g() {
        ArrayList arrayList;
        int i;
        boolean z;
        boolean z2;
        gh ghVar = this.c;
        View view = null;
        if (ghVar != null) {
            arrayList = ghVar.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.i;
        int i3 = this.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            gj gjVar = (gj) arrayList.get(i4);
            if (gjVar.r()) {
                i5++;
            } else if (gjVar.q()) {
                i6++;
            } else {
                z3 = true;
            }
            if (this.s && gjVar.o) {
                i2 = 0;
            }
            i4++;
        }
        if (this.o && (z3 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            gj gjVar2 = (gj) arrayList.get(i8);
            if (gjVar2.r()) {
                View b = b(gjVar2, view, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = gjVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                gjVar2.k(z);
            } else if (gjVar2.q()) {
                int i11 = gjVar2.b;
                boolean z4 = sparseBooleanArray.get(i11);
                if ((i7 > 0 || z4) && i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    View b2 = b(gjVar2, view, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    if (i3 + i9 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                boolean z5 = z2;
                if (z5 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z4) {
                    sparseBooleanArray.put(i11, false);
                    for (int i12 = 0; i12 < i8; i12++) {
                        gj gjVar3 = (gj) arrayList.get(i12);
                        if (gjVar3.b == i11) {
                            if (gjVar3.o()) {
                                i7++;
                            }
                            gjVar3.k(false);
                        }
                    }
                }
                if (z5) {
                    i7--;
                }
                gjVar2.k(z5);
            } else {
                gjVar2.k(false);
                i8++;
                view = null;
                z = true;
            }
            i8++;
            view = null;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3, types: [gh] */
    @Override // defpackage.fx, defpackage.gt
    public final boolean h(ha haVar) {
        boolean z = false;
        if (!haVar.hasVisibleItems()) {
            return false;
        }
        ha haVar2 = haVar;
        while (true) {
            gh ghVar = haVar2.l;
            if (ghVar == this.c) {
                break;
            }
            haVar2 = (ha) ghVar;
        }
        gj gjVar = haVar2.m;
        ViewGroup viewGroup = (ViewGroup) this.f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                ?? childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof gu) && ((gu) childAt).a() == gjVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.l = haVar.m.a;
        int size = haVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = haVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        hj hjVar = new hj(this, this.b, haVar, view);
        this.k = hjVar;
        hjVar.d(z);
        if (this.k.h()) {
            gs gsVar = this.e;
            ha haVar3 = haVar;
            if (gsVar != null) {
                if (haVar == null) {
                    haVar3 = this.c;
                }
                gsVar.b(haVar3);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final void k(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean l() {
        Object obj;
        fiq fiqVar = this.m;
        if (fiqVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(fiqVar);
            this.m = null;
            return true;
        }
        hm hmVar = this.j;
        if (hmVar != null) {
            hmVar.b();
            return true;
        }
        return false;
    }

    public final boolean m() {
        hm hmVar = this.j;
        if (hmVar != null && hmVar.g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gt
    public final void n(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof hn) && (i = ((hn) parcelable).a) > 0 && (findItem = this.c.findItem(i)) != null) {
            h((ha) findItem.getSubMenu());
        }
    }

    public final boolean o() {
        gh ghVar;
        if (this.o && !m() && (ghVar = this.c) != null && this.f != null && this.m == null && !ghVar.e().isEmpty()) {
            this.m = new fiq(this, new hm(this, this.b, this.c, this.h), 1);
            ((View) this.f).post(this.m);
            return true;
        }
        return false;
    }

    public final void p() {
        l();
        s();
    }

    public final void q() {
        this.s = true;
    }

    public final void r() {
        this.o = true;
        this.p = true;
    }

    public final void s() {
        hj hjVar = this.k;
        if (hjVar != null) {
            hjVar.b();
        }
    }
}
