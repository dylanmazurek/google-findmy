package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.atk;
import defpackage.bnp;
import defpackage.brh;
import defpackage.cab;
import defpackage.cdf;
import defpackage.cu;
import defpackage.de;
import defpackage.hw;
import defpackage.jb;
import defpackage.jc;
import defpackage.jd;
import defpackage.je;
import defpackage.mx;
import defpackage.mz;
import defpackage.nr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements cab {
    private final hw a;
    private final jb b;
    private boolean c;
    private jc d;
    private final bnp e;
    private atk f;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private final atk c() {
        if (this.f == null) {
            this.f = new atk(this);
        }
        return this.f;
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

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        bnp bnpVar;
        if (Build.VERSION.SDK_INT < 28 && (bnpVar = this.e) != null) {
            return bnpVar.c();
        }
        return super.getTextClassifier();
    }

    final jc j() {
        jc jcVar;
        if (this.d == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                jcVar = new je(this);
            } else if (Build.VERSION.SDK_INT >= 28) {
                jcVar = new jd(this);
            } else if (Build.VERSION.SDK_INT >= 26) {
                jcVar = new jc(this);
            }
            this.d = jcVar;
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jb.s(this, onCreateInputConnection, editorInfo);
        de.d(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? cu.c(context, i) : null, i2 != 0 ? cu.c(context, i2) : null, i3 != 0 ? cu.c(context, i3) : null, i4 != 0 ? cu.c(context, i4) : null);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? cu.c(context, i) : null, i2 != 0 ? cu.c(context, i2) : null, i3 != 0 ? cu.c(context, i3) : null, i4 != 0 ? cu.c(context, i4) : null);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
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
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            j().a(i);
        } else {
            brh.f(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            j().b(i);
        } else {
            brh.g(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        brh.h(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        bnp bnpVar;
        if (Build.VERSION.SDK_INT < 28 && (bnpVar = this.e) != null) {
            bnpVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.c) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            if (getContext() != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        this.c = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            j().c(i, f);
        } else {
            brh.i(this, i, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mz.a(context);
        this.c = false;
        this.d = null;
        mx.d(this, getContext());
        hw hwVar = new hw(this);
        this.a = hwVar;
        hwVar.b(attributeSet, i);
        jb jbVar = new jb(this);
        this.b = jbVar;
        jbVar.g(attributeSet, i);
        jbVar.e();
        this.e = new bnp(this);
        c().p(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
    }
}
