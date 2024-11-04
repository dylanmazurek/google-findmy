package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyh extends AppCompatTextView {
    public iyh(Context context, AttributeSet attributeSet) {
        super(iyj.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (e(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iyi.b, R.attr.textViewStyle, 0);
            int c = c(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (c == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iyi.b, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    d(theme, resourceId);
                }
            }
        }
    }

    private static int c(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = hzc.h(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private final void d(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, iyi.a);
        int c = c(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (c >= 0) {
            brh.h(this, c);
        }
    }

    private static boolean e(Context context) {
        return hzc.q(context, com.google.android.apps.adm.R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (e(context)) {
            d(context.getTheme(), i);
        }
    }
}
