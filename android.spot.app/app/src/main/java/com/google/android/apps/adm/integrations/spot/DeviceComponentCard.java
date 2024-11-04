package com.google.android.apps.adm.integrations.spot;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.ejp;
import defpackage.ezs;
import defpackage.iqg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DeviceComponentCard extends MaterialCardView {
    public final ImageView g;
    public final TextView h;
    private final ImageView k;
    private final TextView l;

    public DeviceComponentCard(Context context) {
        this(context, null);
    }

    public final void c(boolean z) {
        int i;
        if (true != z) {
            i = R.attr.colorSurfaceDim;
        } else {
            i = R.attr.colorPrimaryContainer;
        }
        j(iqg.c(this, i));
    }

    public final void d(int i, int i2) {
        String string = getContext().getString(i2);
        this.g.setImageResource(i);
        this.g.setContentDescription(getContext().getString(R.string.spot_device_battery_level_content_description, string));
        this.g.setVisibility(0);
        this.h.setText(string);
        this.h.setVisibility(0);
    }

    public DeviceComponentCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewFilledStyle);
    }

    public DeviceComponentCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.device_component_card, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.component_icon);
        this.k = imageView;
        TextView textView = (TextView) inflate.findViewById(R.id.component_name);
        this.l = textView;
        this.g = (ImageView) inflate.findViewById(R.id.state_image);
        this.h = (TextView) inflate.findViewById(R.id.state_text);
        c(false);
        ezs ezsVar = new ezs(context.getTheme().obtainStyledAttributes(attributeSet, ejp.a, 0, 0));
        try {
            TypedArray typedArray = ezsVar.a;
            imageView.setImageResource(typedArray.getResourceId(1, 0));
            textView.setText(typedArray.getText(0));
            ezsVar.close();
        } catch (Throwable th) {
            try {
                ezsVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
