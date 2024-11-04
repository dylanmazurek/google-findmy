package com.google.android.apps.adm.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;
import defpackage.ezu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DeviceDetailsFieldView extends ConstraintLayout {
    public final BidiFormatter i;
    public final ImageView j;
    public final TextView k;
    private final MaterialButton l;
    private final View m;
    private boolean n;
    private boolean o;
    private boolean p;

    public DeviceDetailsFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = false;
        this.o = false;
        this.p = false;
        this.i = BidiFormatter.getInstance();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ezu.a, 0, 0);
        try {
            View inflate = inflate(context, R.layout.device_details_field_view, this);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.device_details_field_icon);
            this.j = imageView;
            imageView.setImageResource(obtainStyledAttributes.getResourceId(2, 0));
            imageView.setContentDescription(obtainStyledAttributes.getString(3));
            ((TextView) inflate.findViewById(R.id.device_details_field_title)).setText(obtainStyledAttributes.getString(4));
            this.k = (TextView) inflate.findViewById(R.id.device_details_field_value);
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.device_details_field_button);
            this.l = materialButton;
            materialButton.setContentDescription(obtainStyledAttributes.getString(0));
            if (obtainStyledAttributes.hasValue(1)) {
                e(true);
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                materialButton.e(resourceId);
                materialButton.setTag(Integer.valueOf(resourceId));
            }
            this.m = inflate.findViewById(R.id.device_details_field_progress_indicator);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void e(boolean z) {
        int i = 4;
        if (z && !this.p) {
            i = 0;
        }
        this.l.setVisibility(i);
        this.n = z;
    }

    public final void f(boolean z) {
        this.p = z;
        if (z) {
            super.setClickable(false);
            this.l.setVisibility(4);
            this.m.setVisibility(0);
        } else {
            setClickable(this.o);
            e(this.n);
            this.m.setVisibility(4);
        }
    }

    public final void g(int i) {
        this.k.setText(i);
        this.k.setVisibility(0);
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (!this.p && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setClickable(z2);
        MaterialButton materialButton = this.l;
        if (this.p || !z) {
            z3 = false;
        }
        materialButton.setClickable(z3);
        this.o = z;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.l.setOnClickListener(onClickListener);
    }
}
