package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;
import defpackage.hzc;
import defpackage.ire;
import defpackage.irf;
import defpackage.ivf;
import defpackage.ivl;
import defpackage.ivm;
import defpackage.ivn;
import defpackage.ivw;
import defpackage.iyj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements ivw {
    public final RectF a;
    public ivf b;
    public ivl c;
    private final ivn d;
    private final RectF e;
    private final Paint f;
    private final Paint g;
    private final Path h;
    private ColorStateList i;
    private float j;
    private Path k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private final void e(int i, int i2) {
        this.a.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.d.a(this.c, this.a, this.h);
        this.k.rewind();
        this.k.addPath(this.h);
        this.e.set(0.0f, 0.0f, i, i2);
        this.k.addRect(this.e, Path.Direction.CCW);
    }

    private final boolean f() {
        if (this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private final boolean h() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final int a() {
        int i = this.q;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (h()) {
            return this.l;
        }
        return this.n;
    }

    public final int b() {
        int i;
        int i2;
        if (f()) {
            if (h() && (i2 = this.q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!h() && (i = this.p) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.l;
    }

    public final int c() {
        int i;
        int i2;
        if (f()) {
            if (h() && (i2 = this.p) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!h() && (i = this.q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    @Override // defpackage.ivw
    public final void cy(ivl ivlVar) {
        this.c = ivlVar;
        ivf ivfVar = this.b;
        if (ivfVar != null) {
            ivfVar.cy(ivlVar);
        }
        e(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public final int d() {
        int i = this.p;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (h()) {
            return this.n;
        }
        return this.l;
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - this.o;
    }

    @Override // android.view.View
    public final int getPaddingEnd() {
        return super.getPaddingEnd() - a();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - b();
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return super.getPaddingRight() - c();
    }

    @Override // android.view.View
    public final int getPaddingStart() {
        return super.getPaddingStart() - d();
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return super.getPaddingTop() - this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.g);
        if (this.i != null) {
            this.f.setStrokeWidth(this.j);
            int colorForState = this.i.getColorForState(getDrawableState(), this.i.getDefaultColor());
            if (this.j > 0.0f && colorForState != 0) {
                this.f.setColor(colorForState);
                canvas.drawPath(this.h, this.f);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.r && isLayoutDirectionResolved()) {
            this.r = true;
            if (!isPaddingRelative() && !f()) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + b(), i2 + this.m, i3 + c(), i4 + this.o);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + d(), i2 + this.m, i3 + a(), i4 + this.o);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.d = ivm.a;
        this.h = new Path();
        this.r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.a = new RectF();
        this.e = new RectF();
        this.k = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ire.a, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.i = hzc.i(context2, obtainStyledAttributes, 9);
        this.j = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.l = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.m = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.n = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.p = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.q = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.c = new ivl(ivl.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView));
        setOutlineProvider(new irf(this));
    }
}
