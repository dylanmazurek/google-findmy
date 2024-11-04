package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isz extends isr {
    public int C;
    public final FrameLayout.LayoutParams D;
    public int a;

    public isz(Context context) {
        super(context);
        this.a = -1;
        this.C = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.D = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        this.x = true;
        isp[] ispVarArr = this.e;
        if (ispVarArr != null) {
            for (isp ispVar : ispVarArr) {
                ispVar.i = true;
            }
        }
    }

    private final int h(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.a;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    private final int i(int i, int i2, int i3, View view) {
        int makeMeasureSpec;
        if (view == null) {
            makeMeasureSpec = h(i, i2, i3);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                i5++;
            }
            if (childAt != view) {
                i4 += j(childAt, i, makeMeasureSpec);
            }
        }
        return i4 + (Math.max(0, i5 - 1) * this.C);
    }

    private static final int j(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.measure(i, i2);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    @Override // defpackage.isr
    protected final isp b(Context context) {
        return new isy(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                i6 += childAt.getMeasuredHeight();
                i5++;
            }
        }
        if (i5 <= 1) {
            max = 0;
        } else {
            max = Math.max(0, Math.min((getMeasuredHeight() - i6) / (i5 - 1), this.C));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight = childAt2.getMeasuredHeight();
                childAt2.layout(0, i8, i3 - i, measuredHeight + i8);
                i8 += measuredHeight + max;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.A.f().size();
        if (size2 > 1 && f(this.c, size2)) {
            View childAt = getChildAt(this.g);
            if (childAt != null) {
                i4 = j(childAt, i, h(i, size, size2));
                size -= i4;
                size2--;
            } else {
                i4 = 0;
            }
            i3 = i4 + i(i, size, size2, childAt);
        } else {
            i3 = i(i, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(i3, i2, 0));
    }
}
