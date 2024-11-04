package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iof extends isr {
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final List G;
    public boolean a;

    public iof(Context context) {
        super(context);
        this.G = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.C = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.D = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.E = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.F = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // defpackage.isr
    protected final isp b(Context context) {
        return new ioe(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int i7 = i4 - i2;
                if (getLayoutDirection() == 1) {
                    int i8 = (i3 - i) - i5;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i7);
                } else {
                    childAt.layout(i5, 0, childAt.getMeasuredWidth() + i5, i7);
                }
                i5 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        gh ghVar = this.A;
        int size = View.MeasureSpec.getSize(i);
        int size2 = ghVar.f().size();
        int childCount = getChildCount();
        this.G.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i8 = 1;
        int i9 = 0;
        if (this.d == 0) {
            if (f(this.c, size2) && this.a) {
                View childAt = getChildAt(this.g);
                int i10 = this.F;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.E, Integer.MIN_VALUE), makeMeasureSpec);
                    i10 = Math.max(i10, childAt.getMeasuredWidth());
                }
                if (childAt.getVisibility() != 8) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                int i11 = size2 - i6;
                int min = Math.min(size - (this.D * i11), Math.min(i10, this.E));
                int i12 = size - min;
                if (i11 != 0) {
                    i8 = i11;
                }
                int min2 = Math.min(i12 / i8, this.C);
                int i13 = i12 - (i11 * min2);
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        if (i14 == this.g) {
                            i7 = min;
                        } else {
                            i7 = min2;
                        }
                        if (i13 > 0) {
                            i7++;
                            i13--;
                        }
                    } else {
                        i7 = 0;
                    }
                    this.G.add(Integer.valueOf(i7));
                }
            } else {
                if (size2 != 0) {
                    i8 = size2;
                }
                int min3 = Math.min(size / i8, this.E);
                int i15 = size - (size2 * min3);
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        if (i15 > 0) {
                            i5 = min3 + 1;
                            i15--;
                        } else {
                            i5 = min3;
                        }
                    } else {
                        i5 = 0;
                    }
                    this.G.add(Integer.valueOf(i5));
                }
            }
            i3 = 0;
            i4 = 0;
            while (i9 < childCount) {
                View childAt2 = getChildAt(i9);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.G.get(i9)).intValue(), 1073741824), makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    i3 += childAt2.getMeasuredWidth();
                    i4 = Math.max(i4, childAt2.getMeasuredHeight());
                }
                i9++;
            }
        } else {
            if (size2 == 0) {
                size2 = 1;
            }
            float f = size;
            float min4 = Math.min((size2 + 3) / 10.0f, 0.9f) * f;
            float f2 = size2;
            float f3 = f / f2;
            int round = Math.round(min4 / f2);
            int round2 = Math.round(f3);
            int i17 = 0;
            int i18 = 0;
            while (i9 < childCount) {
                View childAt3 = getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    i17 += childAt3.getMeasuredWidth();
                    i18 = Math.max(i18, childAt3.getMeasuredHeight());
                }
                i9++;
            }
            i3 = i17;
            i4 = i18;
        }
        setMeasuredDimension(i3, Math.max(i4, getSuggestedMinimumHeight()));
    }
}
