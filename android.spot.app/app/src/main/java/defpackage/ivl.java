package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivl {
    public static final iva a = new ivh(0.5f);
    public final iva b;
    public final iva c;
    public final iva d;
    public final iva e;
    final ivc f;
    final ivc g;
    final ivc h;
    final ivc i;
    public final iuu j;
    public final iuu k;
    public final iuu l;
    public final iuu m;

    public ivl() {
        this.j = new ivi();
        this.k = new ivi();
        this.l = new ivi();
        this.m = new ivi();
        this.b = new iuy(0.0f);
        this.c = new iuy(0.0f);
        this.d = new iuy(0.0f);
        this.e = new iuy(0.0f);
        this.f = new ivc();
        this.g = new ivc();
        this.h = new ivc();
        this.i = new ivc();
    }

    public static iva a(TypedArray typedArray, int i, iva ivaVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            if (peekValue.type == 5) {
                return new iuy(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (peekValue.type == 6) {
                return new ivh(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ivaVar;
    }

    public static ivj b(Context context, int i, int i2) {
        return h(context, i, i2, new iuy(0.0f));
    }

    public static ivj c(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(context, attributeSet, i, i2, new iuy(0.0f));
    }

    public static ivj d(Context context, AttributeSet attributeSet, int i, int i2, iva ivaVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivg.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return h(context, resourceId, resourceId2, ivaVar);
    }

    private static ivj h(Context context, int i, int i2, iva ivaVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ivg.b);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            iva a2 = a(obtainStyledAttributes, 5, ivaVar);
            iva a3 = a(obtainStyledAttributes, 8, a2);
            iva a4 = a(obtainStyledAttributes, 9, a2);
            iva a5 = a(obtainStyledAttributes, 7, a2);
            iva a6 = a(obtainStyledAttributes, 6, a2);
            ivj ivjVar = new ivj();
            ivjVar.j(ivc.d(i4));
            ivjVar.a = a3;
            ivjVar.k(ivc.d(i5));
            ivjVar.b = a4;
            ivjVar.i(ivc.d(i6));
            ivjVar.c = a5;
            ivjVar.h(ivc.d(i7));
            ivjVar.d = a6;
            return ivjVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final ivl e(float f) {
        ivj ivjVar = new ivj(this);
        ivjVar.e(f);
        return new ivl(ivjVar);
    }

    public final ivl f(ivk ivkVar) {
        ivj ivjVar = new ivj(this);
        ivjVar.a = ivkVar.a(this.b);
        ivjVar.b = ivkVar.a(this.c);
        ivjVar.d = ivkVar.a(this.e);
        ivjVar.c = ivkVar.a(this.d);
        return new ivl(ivjVar);
    }

    public final boolean g(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.i.getClass().equals(ivc.class) && this.g.getClass().equals(ivc.class) && this.f.getClass().equals(ivc.class) && this.h.getClass().equals(ivc.class)) {
            z = true;
        } else {
            z = false;
        }
        float a2 = this.b.a(rectF);
        if (this.c.a(rectF) == a2 && this.e.a(rectF) == a2 && this.d.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.k instanceof ivi) && (this.j instanceof ivi) && (this.l instanceof ivi) && (this.m instanceof ivi)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    public ivl(ivj ivjVar) {
        this.j = ivjVar.i;
        this.k = ivjVar.j;
        this.l = ivjVar.k;
        this.m = ivjVar.l;
        this.b = ivjVar.a;
        this.c = ivjVar.b;
        this.d = ivjVar.c;
        this.e = ivjVar.d;
        this.f = ivjVar.e;
        this.g = ivjVar.f;
        this.h = ivjVar.g;
        this.i = ivjVar.h;
    }
}
