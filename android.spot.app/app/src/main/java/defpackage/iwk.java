package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwk extends iwh {
    private static final int[] w = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public boolean v;
    private final AccessibilityManager x;

    private iwk(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static iwk o(View view, int i, int i2) {
        ViewGroup viewGroup;
        CharSequence text = view.getResources().getText(i);
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            int i3 = R.layout.design_layout_snackbar_include;
            if (resourceId != -1 && resourceId2 != -1) {
                i3 = R.layout.mtrl_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i3, viewGroup, false);
            iwk iwkVar = new iwk(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            iwkVar.p().a.setText(text);
            iwkVar.k = i2;
            return iwkVar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // defpackage.iwh
    public final int a() {
        int i;
        int recommendedTimeoutMillis;
        int i2 = this.k;
        if (i2 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (true != this.v) {
                i = 0;
            } else {
                i = 4;
            }
            recommendedTimeoutMillis = this.x.getRecommendedTimeoutMillis(i2, i | 3);
            return recommendedTimeoutMillis;
        }
        if (this.v && this.x.isTouchExplorationEnabled()) {
            return -2;
        }
        return i2;
    }

    public final SnackbarContentLayout p() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }
}
