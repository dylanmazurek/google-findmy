package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bzl;
import defpackage.hzc;
import defpackage.ih;
import defpackage.iqg;
import defpackage.isa;
import defpackage.ium;
import defpackage.iyj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialRadioButton extends ih {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && bzl.a(this) == null) {
            this.c = true;
            if (this.b == null) {
                int c = iqg.c(this, com.google.android.apps.adm.R.attr.colorControlActivated);
                int c2 = iqg.c(this, com.google.android.apps.adm.R.attr.colorOnSurface);
                int c3 = iqg.c(this, com.google.android.apps.adm.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{iqg.f(c3, c, 1.0f), iqg.f(c3, c2, 0.54f), iqg.f(c3, c2, 0.38f), iqg.f(c3, c2, 0.38f)});
            }
            bzl.c(this, this.b);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, com.google.android.apps.adm.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray a2 = isa.a(context2, attributeSet, ium.a, i, com.google.android.apps.adm.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (a2.hasValue(0)) {
            bzl.c(this, hzc.i(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }
}
