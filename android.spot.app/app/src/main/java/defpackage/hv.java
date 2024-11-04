package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hv extends AutoCompleteTextView implements cab {
    private static final int[] a = {R.attr.popupBackground};
    private final hw b;
    private final jb c;
    private final bfi d;

    public hv(Context context) {
        this(context, null);
    }

    @Override // defpackage.cab
    public final void bJ(ColorStateList colorStateList) {
        this.c.m(colorStateList);
        this.c.e();
    }

    @Override // defpackage.cab
    public final void bK(PorterDuff.Mode mode) {
        this.c.n(mode);
        this.c.e();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.a();
        }
        jb jbVar = this.c;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return brh.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        de.d(onCreateInputConnection, editorInfo, this);
        return this.d.o(onCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.c;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jb jbVar = this.c;
        if (jbVar != null) {
            jbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(brh.d(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(cu.c(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(bfi.n(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jb jbVar = this.c;
        if (jbVar != null) {
            jbVar.h(context, i);
        }
    }

    public hv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mz.a(context);
        mx.d(this, getContext());
        ksr F = ksr.F(getContext(), attributeSet, a, i, 0);
        if (F.A(0)) {
            setDropDownBackgroundDrawable(F.u(0));
        }
        F.y();
        hw hwVar = new hw(this);
        this.b = hwVar;
        hwVar.b(attributeSet, i);
        jb jbVar = new jb(this);
        this.c = jbVar;
        jbVar.g(attributeSet, i);
        jbVar.e();
        bfi bfiVar = new bfi(this);
        this.d = bfiVar;
        bfiVar.l(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (bfi.m(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener n = bfi.n(keyListener);
            if (n == keyListener) {
                return;
            }
            super.setKeyListener(n);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
