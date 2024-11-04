package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hz extends CheckedTextView implements cab {
    private final hw a;
    private final jb b;
    private final hiz c;
    private atk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        mz.a(context);
        mx.d(this, getContext());
        jb jbVar = new jb(this);
        this.b = jbVar;
        jbVar.g(attributeSet, R.attr.checkedTextViewStyle);
        jbVar.e();
        hw hwVar = new hw(this);
        this.a = hwVar;
        hwVar.b(attributeSet, R.attr.checkedTextViewStyle);
        hiz hizVar = new hiz(this);
        this.c = hizVar;
        hizVar.c(attributeSet);
        c().p(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final atk c() {
        if (this.d == null) {
            this.d = new atk(this);
        }
        return this.d;
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.e();
        }
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.a();
        }
        hiz hizVar = this.c;
        if (hizVar != null) {
            hizVar.b();
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
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        cdf.p();
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(cu.c(getContext(), i));
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
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(brh.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jb jbVar = this.b;
        if (jbVar != null) {
            jbVar.h(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        hiz hizVar = this.c;
        if (hizVar != null) {
            if (hizVar.a) {
                hizVar.a = false;
            } else {
                hizVar.a = true;
                hizVar.b();
            }
        }
    }
}
