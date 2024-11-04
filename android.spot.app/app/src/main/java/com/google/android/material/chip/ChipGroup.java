package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.adm.R;
import defpackage.bet;
import defpackage.byn;
import defpackage.hrc;
import defpackage.ipv;
import defpackage.ipw;
import defpackage.ipx;
import defpackage.irg;
import defpackage.irm;
import defpackage.iro;
import defpackage.isa;
import defpackage.iyj;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChipGroup extends irm {
    public final irg a;
    private int f;
    private int g;
    private final int h;
    private final ipw i;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public final boolean a(int i) {
        if (getChildAt(i).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.a.c;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof ipv)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ipv();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ipv(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.h;
        if (i != -1) {
            irg irgVar = this.a;
            iro iroVar = (iro) irgVar.a.get(Integer.valueOf(i));
            if (iroVar != null && irgVar.b(iroVar)) {
                irgVar.a();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        byn bynVar = new byn(accessibilityNodeInfo);
        if (this.d) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof Chip) && a(i2)) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        int i3 = this.e;
        int i4 = 1;
        if (true != b()) {
            i4 = 2;
        }
        bynVar.v(bet.k(i3, i, i4));
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.i.a = onHierarchyChangeListener;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ipv(layoutParams);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i);
        irg irgVar = new irg();
        this.a = irgVar;
        this.i = new ipw(this);
        TypedArray a = isa.a(getContext(), attributeSet, ipx.b, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = a.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = a.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.f != dimensionPixelOffset2) {
            this.f = dimensionPixelOffset2;
            this.c = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = a.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.g != dimensionPixelOffset3) {
            this.g = dimensionPixelOffset3;
            this.b = dimensionPixelOffset3;
            requestLayout();
        }
        this.d = a.getBoolean(5, false);
        boolean z = a.getBoolean(6, false);
        if (irgVar.c != z) {
            irgVar.c = z;
            boolean isEmpty = irgVar.b.isEmpty();
            Iterator it = irgVar.a.values().iterator();
            while (it.hasNext()) {
                irgVar.c((iro) it.next(), false);
            }
            if (!isEmpty) {
                irgVar.a();
            }
        }
        this.a.d = a.getBoolean(4, false);
        this.h = a.getResourceId(0, -1);
        a.recycle();
        this.a.e = new hrc((byte[]) null);
        super.setOnHierarchyChangeListener(this.i);
        setImportantForAccessibility(1);
    }
}
