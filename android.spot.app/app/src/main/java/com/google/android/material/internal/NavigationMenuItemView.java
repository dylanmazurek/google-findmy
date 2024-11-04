package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.buk;
import defpackage.bwn;
import defpackage.gj;
import defpackage.gu;
import defpackage.in;
import defpackage.irn;
import defpackage.irp;
import defpackage.kn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends irn implements gu {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int i;
    private final CheckedTextView j;
    private FrameLayout k;
    private gj l;
    private final buk m;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.gu
    public final gj a() {
        return this.l;
    }

    @Override // defpackage.gu
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gu
    public final void f(gj gjVar) {
        int i;
        StateListDrawable stateListDrawable;
        this.l = gjVar;
        int i2 = gjVar.a;
        if (i2 > 0) {
            setId(i2);
        }
        int i3 = 1;
        if (true != gjVar.isVisible()) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.apps.adm.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean isCheckable = gjVar.isCheckable();
        refreshDrawableState();
        if (this.c != isCheckable) {
            this.c = isCheckable;
            this.m.e(this.j, 2048);
        }
        boolean isChecked = gjVar.isChecked();
        refreshDrawableState();
        this.j.setChecked(isChecked);
        CheckedTextView checkedTextView = this.j;
        Typeface typeface = checkedTextView.getTypeface();
        if (!isChecked || !this.d) {
            i3 = 0;
        }
        checkedTextView.setTypeface(typeface, i3);
        setEnabled(gjVar.isEnabled());
        this.j.setText(gjVar.d);
        Drawable icon = gjVar.getIcon();
        if (icon != null) {
            int i4 = this.i;
            icon.setBounds(0, 0, i4, i4);
        }
        this.j.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = gjVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(com.google.android.apps.adm.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(gjVar.l);
        in.b(this, gjVar.m);
        gj gjVar2 = this.l;
        if (gjVar2.d == null && gjVar2.getIcon() == null && this.l.getActionView() != null) {
            this.j.setVisibility(8);
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                kn knVar = (kn) frameLayout.getLayoutParams();
                knVar.width = -1;
                this.k.setLayoutParams(knVar);
                return;
            }
            return;
        }
        this.j.setVisibility(0);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            kn knVar2 = (kn) frameLayout2.getLayoutParams();
            knVar2.width = -2;
            this.k.setLayoutParams(knVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        gj gjVar = this.l;
        if (gjVar != null && gjVar.isCheckable() && gjVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        irp irpVar = new irp(this);
        this.m = irpVar;
        r(0);
        LayoutInflater.from(context).inflate(com.google.android.apps.adm.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.i = context.getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.apps.adm.R.id.design_menu_item_text);
        this.j = checkedTextView;
        bwn.q(checkedTextView, irpVar);
    }
}
