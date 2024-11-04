package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import defpackage.hv;
import defpackage.hx;
import defpackage.hy;
import defpackage.ih;
import defpackage.ipn;
import defpackage.ixz;
import defpackage.iyh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final hv a(Context context, AttributeSet attributeSet) {
        return new ixz(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final hx b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final hy c(Context context, AttributeSet attributeSet) {
        return new ipn(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ih d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new iyh(context, attributeSet);
    }
}
