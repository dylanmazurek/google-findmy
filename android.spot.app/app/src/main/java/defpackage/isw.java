package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class isw extends FrameLayout {
    public final isr a;
    public final ist b;
    private final isq c;
    private MenuInflater d;

    public isw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(iyj.a(context, attributeSet, i, i2), attributeSet, i);
        ist istVar = new ist();
        this.b = istVar;
        Context context2 = getContext();
        ksr e = isa.e(context2, attributeSet, isx.b, i, i2, 13, 11);
        isq isqVar = new isq(context2, getClass(), a());
        this.c = isqVar;
        isr b = b(context2);
        this.a = b;
        b.setMinimumHeight(getSuggestedMinimumHeight());
        istVar.a = b;
        istVar.c = 1;
        b.z = istVar;
        isqVar.g(istVar);
        istVar.c(getContext(), isqVar);
        if (e.A(7)) {
            b.e(e.t(7));
        } else {
            b.e(b.g());
        }
        int o = e.o(6, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size));
        b.h = o;
        isp[] ispVarArr = b.e;
        if (ispVarArr != null) {
            for (isp ispVar : ispVarArr) {
                ispVar.p(o);
            }
        }
        if (e.A(13)) {
            int s = e.s(13, 0);
            isr isrVar = this.a;
            isrVar.j = s;
            isp[] ispVarArr2 = isrVar.e;
            if (ispVarArr2 != null) {
                for (isp ispVar2 : ispVarArr2) {
                    ispVar2.B(s);
                    ColorStateList colorStateList = isrVar.i;
                    if (colorStateList != null) {
                        ispVar2.C(colorStateList);
                    }
                }
            }
        }
        if (e.A(11)) {
            int s2 = e.s(11, 0);
            isr isrVar2 = this.a;
            isrVar2.k = s2;
            isp[] ispVarArr3 = isrVar2.e;
            if (ispVarArr3 != null) {
                for (isp ispVar3 : ispVarArr3) {
                    ispVar3.z(s2);
                    ColorStateList colorStateList2 = isrVar2.i;
                    if (colorStateList2 != null) {
                        ispVar3.C(colorStateList2);
                    }
                }
            }
        }
        boolean z = e.z(12, true);
        isr isrVar3 = this.a;
        isrVar3.l = z;
        isp[] ispVarArr4 = isrVar3.e;
        if (ispVarArr4 != null) {
            for (isp ispVar4 : ispVarArr4) {
                ispVar4.A(z);
            }
        }
        if (e.A(14)) {
            ColorStateList t = e.t(14);
            isr isrVar4 = this.a;
            isrVar4.i = t;
            isp[] ispVarArr5 = isrVar4.e;
            if (ispVarArr5 != null) {
                for (isp ispVar5 : ispVarArr5) {
                    ispVar5.C(t);
                }
            }
        }
        Drawable background = getBackground();
        ColorStateList b2 = iqh.b(background);
        if (background == null || b2 != null) {
            ivf ivfVar = new ivf(new ivl(ivl.c(context2, attributeSet, i, i2)));
            if (b2 != null) {
                ivfVar.L(b2);
            }
            ivfVar.I(context2);
            setBackground(ivfVar);
        }
        if (e.A(9)) {
            d(e.o(9, 0));
        }
        if (e.A(8)) {
            c(e.o(8, 0));
        }
        if (e.A(0)) {
            int o2 = e.o(0, 0);
            isr isrVar5 = this.a;
            isrVar5.r = o2;
            isp[] ispVarArr6 = isrVar5.e;
            if (ispVarArr6 != null) {
                for (isp ispVar6 : ispVarArr6) {
                    ispVar6.j(o2);
                }
            }
        }
        if (e.A(2)) {
            setElevation(e.o(2, 0));
        }
        bsc.g(getBackground().mutate(), hzc.ae(context2, e, 1));
        int q = e.q(15, -1);
        isr isrVar6 = this.a;
        if (isrVar6.c != q) {
            isrVar6.c = q;
            this.b.f(false);
        }
        int q2 = e.q(5, 0);
        isr isrVar7 = this.a;
        if (isrVar7.d != q2) {
            isrVar7.d = q2;
            this.b.f(false);
        }
        int s3 = e.s(4, 0);
        if (s3 != 0) {
            isr isrVar8 = this.a;
            isrVar8.n = s3;
            isp[] ispVarArr7 = isrVar8.e;
            if (ispVarArr7 != null) {
                for (isp ispVar7 : ispVarArr7) {
                    ispVar7.r(s3);
                }
            }
        } else {
            ColorStateList ae = hzc.ae(context2, e, 10);
            isr isrVar9 = this.a;
            isrVar9.m = ae;
            isp[] ispVarArr8 = isrVar9.e;
            if (ispVarArr8 != null) {
                for (isp ispVar8 : ispVarArr8) {
                    ispVar8.v(ae);
                }
            }
        }
        boolean z2 = e.z(16, true);
        isr isrVar10 = this.a;
        isrVar10.B = z2;
        isp[] ispVarArr9 = isrVar10.e;
        if (ispVarArr9 != null) {
            for (isp ispVar9 : ispVarArr9) {
                ispVar9.x(z2);
            }
        }
        int s4 = e.s(3, 0);
        if (s4 != 0) {
            isr isrVar11 = this.a;
            isrVar11.s = true;
            isp[] ispVarArr10 = isrVar11.e;
            if (ispVarArr10 != null) {
                for (isp ispVar10 : ispVarArr10) {
                    ispVar10.h(true);
                }
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(s4, isx.a);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            isr isrVar12 = this.a;
            isrVar12.t = dimensionPixelSize;
            isp[] ispVarArr11 = isrVar12.e;
            if (ispVarArr11 != null) {
                for (isp ispVar11 : ispVarArr11) {
                    ispVar11.m(dimensionPixelSize);
                }
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            isr isrVar13 = this.a;
            isrVar13.u = dimensionPixelSize2;
            isp[] ispVarArr12 = isrVar13.e;
            if (ispVarArr12 != null) {
                for (isp ispVar12 : ispVarArr12) {
                    ispVar12.i(dimensionPixelSize2);
                }
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            isr isrVar14 = this.a;
            isrVar14.v = dimensionPixelOffset;
            isp[] ispVarArr13 = isrVar14.e;
            if (ispVarArr13 != null) {
                for (isp ispVar13 : ispVarArr13) {
                    ispVar13.k(dimensionPixelOffset);
                }
            }
            ColorStateList i3 = hzc.i(context2, obtainStyledAttributes, 2);
            isr isrVar15 = this.a;
            isrVar15.y = i3;
            isp[] ispVarArr14 = isrVar15.e;
            if (ispVarArr14 != null) {
                for (isp ispVar14 : ispVarArr14) {
                    ispVar14.g(isrVar15.c());
                }
            }
            ivl ivlVar = new ivl(ivl.b(context2, obtainStyledAttributes.getResourceId(4, 0), 0));
            isr isrVar16 = this.a;
            isrVar16.w = ivlVar;
            isp[] ispVarArr15 = isrVar16.e;
            if (ispVarArr15 != null) {
                for (isp ispVar15 : ispVarArr15) {
                    ispVar15.g(isrVar16.c());
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (e.A(17)) {
            int s5 = e.s(17, 0);
            this.b.b = true;
            if (this.d == null) {
                this.d = new fo(getContext());
            }
            this.d.inflate(s5, this.c);
            ist istVar2 = this.b;
            istVar2.b = false;
            istVar2.f(true);
        }
        e.y();
        addView(this.a);
        this.c.b = new isu();
    }

    public abstract int a();

    protected abstract isr b(Context context);

    public final void c(int i) {
        isr isrVar = this.a;
        isrVar.q = i;
        isp[] ispVarArr = isrVar.e;
        if (ispVarArr != null) {
            for (isp ispVar : ispVarArr) {
                ispVar.t(i);
            }
        }
    }

    public final void d(int i) {
        isr isrVar = this.a;
        isrVar.p = i;
        isp[] ispVarArr = isrVar.e;
        if (ispVarArr != null) {
            for (isp ispVar : ispVarArr) {
                ispVar.u(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ivc.b(this);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof isv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        isv isvVar = (isv) parcelable;
        super.onRestoreInstanceState(isvVar.d);
        isq isqVar = this.c;
        SparseArray sparseParcelableArray = isvVar.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !isqVar.i.isEmpty()) {
            Iterator it = isqVar.i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                gt gtVar = (gt) weakReference.get();
                if (gtVar == null) {
                    isqVar.i.remove(weakReference);
                } else {
                    int a = gtVar.a();
                    if (a > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(a)) != null) {
                        gtVar.n(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable bL;
        isv isvVar = new isv(super.onSaveInstanceState());
        isvVar.a = new Bundle();
        Bundle bundle = isvVar.a;
        isq isqVar = this.c;
        if (!isqVar.i.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = isqVar.i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                gt gtVar = (gt) weakReference.get();
                if (gtVar == null) {
                    isqVar.i.remove(weakReference);
                } else {
                    int a = gtVar.a();
                    if (a > 0 && (bL = gtVar.bL()) != null) {
                        sparseArray.put(a, bL);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return isvVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ivc.a(this, f);
    }
}
