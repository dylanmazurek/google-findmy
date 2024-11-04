package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class isy extends isp {
    public isy(Context context) {
        super(context);
    }

    @Override // defpackage.isp
    protected final int b() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // defpackage.isp
    protected final int c() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
