package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ih extends RadioButton implements cab {
    private final ia a;
    private final hw b;
    private final jb c;
    private atk d;

    public ih(Context context) {
        this(context, null);
    }

    private final atk c() {
        if (this.d == null) {
            this.d = new atk(this);
        }
        return this.d;
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        cdf.p();
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

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(cu.c(getContext(), i));
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
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        cdf.p();
        super.setFilters(inputFilterArr);
    }

    public ih(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ia iaVar = this.a;
        if (iaVar != null) {
            iaVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mz.a(context);
        mx.d(this, getContext());
        ia iaVar = new ia(this);
        this.a = iaVar;
        iaVar.b(attributeSet, i);
        hw hwVar = new hw(this);
        this.b = hwVar;
        hwVar.b(attributeSet, i);
        jb jbVar = new jb(this);
        this.c = jbVar;
        jbVar.g(attributeSet, i);
        c().p(attributeSet, i);
    }
}
