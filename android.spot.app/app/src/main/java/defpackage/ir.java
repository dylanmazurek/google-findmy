package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ir extends ky implements it {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ iu d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(iu iuVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = iuVar;
        this.c = new Rect();
        this.l = iuVar;
        y();
        this.m = new hzy(this, 1);
    }

    public static /* synthetic */ void l(ir irVar) {
        super.v();
    }

    @Override // defpackage.it
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.ky, defpackage.it
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.it
    public final void h(int i) {
        this.s = i;
    }

    @Override // defpackage.it
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.it
    public final void k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean x = x();
        n();
        w();
        super.v();
        kb kbVar = this.e;
        kbVar.setChoiceMode(1);
        kbVar.setTextDirection(i);
        kbVar.setTextAlignment(i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        kb kbVar2 = this.e;
        if (x() && kbVar2 != null) {
            kbVar2.a = false;
            kbVar2.setSelection(selectedItemPosition);
            if (kbVar2.getChoiceMode() != 0) {
                kbVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!x && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            gy gyVar = new gy(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(gyVar);
            t(new iq(this, gyVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.SpinnerAdapter, android.widget.ListAdapter] */
    public final void n() {
        int i;
        int i2;
        Drawable c = c();
        if (c != null) {
            c.getPadding(this.d.d);
            if (nr.a(this.d)) {
                i = this.d.d.right;
            } else {
                i = -this.d.d.left;
            }
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        iu iuVar = this.d;
        int paddingLeft = iuVar.getPaddingLeft();
        int paddingRight = iuVar.getPaddingRight();
        int width = iuVar.getWidth();
        int i3 = iuVar.c;
        if (i3 == -2) {
            int i4 = (width - paddingLeft) - paddingRight;
            int a = iuVar.a(this.b, c());
            int i5 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a > i5) {
                a = i5;
            }
            r(Math.max(a, i4));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        if (nr.a(this.d)) {
            i2 = i + (((width - paddingRight) - this.f) - this.s);
        } else {
            i2 = i + paddingLeft + this.s;
        }
        this.g = i2;
    }
}
