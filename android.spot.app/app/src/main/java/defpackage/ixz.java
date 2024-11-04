package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.adm.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixz extends hv {
    public final ky a;
    public final float b;
    public ColorStateList c;
    public final int d;
    public final ColorStateList e;
    private final AccessibilityManager f;
    private final Rect g;
    private final int h;

    public ixz(Context context, AttributeSet attributeSet) {
        super(iyj.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray a = isa.a(context2, attributeSet, iyb.a, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = a.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.h = resourceId;
        this.b = a.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (a.hasValue(2)) {
            this.c = ColorStateList.valueOf(a.getColor(2, 0));
        }
        this.d = a.getColor(4, 0);
        this.e = hzc.i(context2, a, 5);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        ky kyVar = new ky(context2, null, R.attr.listPopupWindowStyle);
        this.a = kyVar;
        kyVar.y();
        kyVar.l = this;
        kyVar.w();
        kyVar.e(getAdapter());
        kyVar.m = new hzy(this, 2);
        if (a.hasValue(6)) {
            setAdapter(new ixy(this, getContext(), resourceId, getResources().getStringArray(a.getResourceId(6, 0))));
        }
        a.recycle();
    }

    private final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            AccessibilityManager accessibilityManager2 = this.f;
            if (accessibilityManager2 != null && accessibilityManager2.isEnabled() && (enabledAccessibilityServiceList = this.f.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (e()) {
            this.a.m();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout d = d();
        if (d != null && d.k) {
            return d.d();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = d();
        if (d != null && d.k && super.getHint() == null && iqh.h()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.m();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout d = d();
            int i4 = 0;
            if (adapter != null && d != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.a.o()) + 15);
                int max = Math.max(0, min - 15);
                View view = null;
                int i5 = 0;
                while (max < min) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        i3 = itemViewType;
                    } else {
                        i3 = i4;
                    }
                    if (itemViewType != i4) {
                        view = null;
                    }
                    view = adapter.getView(max, view, d);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                    max++;
                    i4 = i3;
                }
                Drawable c = this.a.c();
                if (c != null) {
                    c.getPadding(this.g);
                    Rect rect = this.g;
                    i5 += rect.left + rect.right;
                }
                i4 = i5 + d.b.d.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (e()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ky kyVar = this.a;
        if (kyVar != null) {
            kyVar.f(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.n = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout d = d();
        if (d != null) {
            d.y();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (e()) {
            this.a.v();
        } else {
            super.showDropDown();
        }
    }
}
