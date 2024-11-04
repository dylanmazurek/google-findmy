package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;
import defpackage.ite;
import defpackage.itf;
import defpackage.itt;
import defpackage.iua;
import defpackage.iub;
import defpackage.iuc;
import defpackage.iuf;
import defpackage.iuj;
import defpackage.iuk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearProgressIndicator extends ite {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.ite
    public final /* synthetic */ itf a(Context context, AttributeSet attributeSet) {
        return new iuk(context, attributeSet);
    }

    @Override // defpackage.ite
    public final void f(int i, boolean z) {
        itf itfVar = this.a;
        if (itfVar != null && ((iuk) itfVar).k == 0 && isIndeterminate()) {
            return;
        }
        super.f(i, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ite, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        iuk iukVar = (iuk) this.a;
        boolean z2 = true;
        if (iukVar.l != 1 && ((getLayoutDirection() != 1 || ((iuk) this.a).l != 2) && (getLayoutDirection() != 0 || ((iuk) this.a).l != 3))) {
            z2 = false;
        }
        iukVar.m = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        iub indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        itt progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        iua iujVar;
        iuc iucVar = new iuc((iuk) this.a);
        Context context2 = getContext();
        iuk iukVar = (iuk) this.a;
        if (iukVar.k == 0) {
            iujVar = new iuf(iukVar);
        } else {
            iujVar = new iuj(context2, iukVar);
        }
        setIndeterminateDrawable(new iub(context2, iukVar, iucVar, iujVar));
        setProgressDrawable(new itt(getContext(), (iuk) this.a, iucVar));
    }
}
