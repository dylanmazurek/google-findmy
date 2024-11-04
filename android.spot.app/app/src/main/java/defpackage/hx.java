package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hx extends Button implements cab {
    public final hw a;
    private final jb b;
    private atk c;

    public hx(Context context) {
        this(context, null);
    }

    private final atk c() {
        if (this.c == null) {
            this.c = new atk(this);
        }
        return this.c;
    }

    @Override // defpackage.cab
    public final void bJ(ColorStateList colorStateList) {
        this.b.m(colorStateList);
        this.b.e();
    }

    @Override // defpackage.cab
    public final void bK(PorterDuff.Mode mode) {
        this.b.n(mode);
        this.b.e();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.a();
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (nr.c) {
            return super.getAutoSizeMaxTextSize();
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            return jbVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (nr.c) {
            return super.getAutoSizeMinTextSize();
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            return jbVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (nr.c) {
            return super.getAutoSizeStepGranularity();
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            return jbVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (nr.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            return jbVar.q();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (nr.c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        jb jbVar = this.b;
        if (jbVar == null) {
            return 0;
        }
        return jbVar.d();
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return brh.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        jb jbVar = this.b;
        if (jbVar != null && !nr.c && jbVar.p()) {
            jbVar.f();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        cdf.p();
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (nr.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.j(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (nr.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.k(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (nr.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.l(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(brh.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        cdf.p();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (nr.c) {
            super.setTextSize(i, f);
            return;
        }
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.o(i, f);
        }
    }

    public hx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mz.a(context);
        mx.d(this, getContext());
        hw hwVar = new hw(this);
        this.a = hwVar;
        hwVar.b(attributeSet, i);
        jb jbVar = new jb(this);
        this.b = jbVar;
        jbVar.g(attributeSet, i);
        jbVar.e();
        c().p(attributeSet, i);
    }
}
