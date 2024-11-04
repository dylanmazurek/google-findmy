package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hw {
    public na a;
    private final View b;
    private na e;
    private na f;
    private int d = -1;
    private final ib c = ib.d();

    public hw(View view) {
        this.b = view;
    }

    public final void a() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT <= 21 || this.e != null) {
                if (this.f == null) {
                    this.f = new na();
                }
                na naVar = this.f;
                naVar.a();
                ColorStateList d = bwb.d(this.b);
                if (d != null) {
                    naVar.d = true;
                    naVar.a = d;
                }
                PorterDuff.Mode e = bwb.e(this.b);
                if (e != null) {
                    naVar.c = true;
                    naVar.b = e;
                }
                if (naVar.d || naVar.c) {
                    mn.g(background, naVar, this.b.getDrawableState());
                    return;
                }
            }
            na naVar2 = this.a;
            if (naVar2 != null) {
                mn.g(background, naVar2, this.b.getDrawableState());
                return;
            }
            na naVar3 = this.e;
            if (naVar3 != null) {
                mn.g(background, naVar3, this.b.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        boolean z = false;
        ksr F = ksr.F(this.b.getContext(), attributeSet, eb.y, i, 0);
        Object obj = F.b;
        View view = this.b;
        bwn.p(view, view.getContext(), eb.y, attributeSet, (TypedArray) obj, i, 0);
        try {
            if (F.A(0)) {
                this.d = F.s(0, -1);
                ColorStateList a = this.c.a(this.b.getContext(), this.d);
                if (a != null) {
                    d(a);
                }
            }
            if (F.A(1)) {
                bwn.s(this.b, F.t(1));
            }
            if (F.A(2)) {
                View view2 = this.b;
                bwb.k(view2, a.h(F.p(2, -1), null));
                if (Build.VERSION.SDK_INT == 21) {
                    Drawable background = view2.getBackground();
                    if (bwb.d(view2) != null || bwb.e(view2) != null) {
                        z = true;
                    }
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view2.getDrawableState());
                        }
                        view2.setBackground(background);
                    }
                }
            }
        } finally {
            F.y();
        }
    }

    public final void c(int i) {
        ColorStateList colorStateList;
        this.d = i;
        ib ibVar = this.c;
        if (ibVar != null) {
            colorStateList = ibVar.a(this.b.getContext(), i);
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new na();
            }
            na naVar = this.e;
            naVar.a = colorStateList;
            naVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
