package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iwg extends FrameLayout {
    private static final View.OnTouchListener h = new iwf();
    public iwh a;
    ivl b;
    public int c;
    public final float d;
    public final int e;
    public Rect f;
    public boolean g;
    private final float i;
    private final int j;
    private ColorStateList k;
    private PorterDuff.Mode l;

    /* JADX INFO: Access modifiers changed from: protected */
    public iwg(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:            r1 = r0.j.getRootWindowInsets();     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onAttachedToWindow() {
        /*
            r3 = this;
            super.onAttachedToWindow()
            iwh r0 = r3.a
            if (r0 == 0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L22
            iwg r1 = r0.j
            android.view.WindowInsets r1 = defpackage.fr$$ExternalSyntheticApiModelOutline1.m(r1)
            if (r1 == 0) goto L22
            android.graphics.Insets r1 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m$1(r1)
            int r1 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m$3(r1)
            r0.q = r1
            r0.k()
        L22:
            defpackage.bvz.c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwg.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        iwh iwhVar = this.a;
        if (iwhVar != null) {
            iwn a = iwn.a();
            Object obj = a.a;
            njz njzVar = iwhVar.u;
            synchronized (obj) {
                z = true;
                if (!a.g(njzVar) && !a.h(njzVar)) {
                    z = false;
                }
            }
            if (z) {
                iwh.a.post(new ide(iwhVar, 15, null));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        iwh iwhVar = this.a;
        if (iwhVar != null && iwhVar.s) {
            iwhVar.j();
            iwhVar.s = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.j > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.j;
            if (measuredWidth > i3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.k != null) {
            drawable = bpu.i(drawable.mutate());
            bsc.g(drawable, this.k);
            bsc.h(drawable, this.l);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getBackground() != null) {
            Drawable i = bpu.i(getBackground().mutate());
            bsc.g(i, colorStateList);
            bsc.h(i, this.l);
            if (i != getBackground()) {
                super.setBackgroundDrawable(i);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.l = mode;
        if (getBackground() != null) {
            Drawable i = bpu.i(getBackground().mutate());
            bsc.h(i, mode);
            if (i != getBackground()) {
                super.setBackgroundDrawable(i);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.g && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            iwh iwhVar = this.a;
            if (iwhVar != null) {
                iwhVar.k();
            }
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = h;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public iwg(Context context, AttributeSet attributeSet) {
        super(iyj.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Drawable i;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iwi.a);
        if (obtainStyledAttributes.hasValue(6)) {
            bwb.l(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.b = new ivl(ivl.c(context2, attributeSet, 0, 0));
        }
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        this.i = f;
        setBackgroundTintList(hzc.i(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(a.h(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(h);
        setFocusable(true);
        if (getBackground() == null) {
            int f2 = iqg.f(iqg.c(this, R.attr.colorSurface), iqg.c(this, R.attr.colorOnSurface), f);
            ivl ivlVar = this.b;
            if (ivlVar != null) {
                String str = iwh.b;
                ivf ivfVar = new ivf(ivlVar);
                ivfVar.L(ColorStateList.valueOf(f2));
                gradientDrawable = ivfVar;
            } else {
                Resources resources = getResources();
                String str2 = iwh.b;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(f2);
                gradientDrawable = gradientDrawable2;
            }
            if (this.k != null) {
                i = bpu.i(gradientDrawable);
                bsc.g(i, this.k);
            } else {
                i = bpu.i(gradientDrawable);
            }
            setBackgroundDrawable(i);
        }
    }
}
