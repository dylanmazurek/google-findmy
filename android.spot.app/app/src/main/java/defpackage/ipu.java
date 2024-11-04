package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipu extends ivf implements Drawable.Callback, bsi, irw {
    private static final int[] x = {R.attr.state_enabled};
    private static final ShapeDrawable y = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private float B;
    private ColorStateList C;
    private float D;
    private boolean E;
    private Drawable F;
    private ColorStateList G;
    private float H;
    private boolean I;
    private Drawable J;
    private ColorStateList K;
    private float L;
    private boolean M;
    private Drawable N;
    private ColorStateList O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private final Context T;
    private final Paint U;
    private final Paint.FontMetrics V;
    private final RectF W;
    private final PointF X;
    private final Path Y;
    private int Z;
    public float a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    private int af;
    private int ag;
    private ColorFilter ah;
    private PorterDuffColorFilter ai;
    private ColorStateList aj;
    private PorterDuff.Mode ak;
    private int[] al;
    private WeakReference am;
    private boolean an;
    public ColorStateList b;
    public CharSequence c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final irx k;
    public boolean l;
    public TextUtils.TruncateAt m;
    public boolean n;
    public int o;
    private ColorStateList z;

    private ipu(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.B = -1.0f;
        this.U = new Paint(1);
        this.V = new Paint.FontMetrics();
        this.W = new RectF();
        this.X = new PointF();
        this.Y = new Path();
        this.ag = 255;
        this.ak = PorterDuff.Mode.SRC_IN;
        this.am = new WeakReference(null);
        I(context);
        this.T = context;
        irx irxVar = new irx(this);
        this.k = irxVar;
        this.c = "";
        irxVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = x;
        setState(iArr);
        s(iArr);
        this.n = true;
        int i3 = iuv.b;
        y.setTint(-1);
    }

    private final float W() {
        Drawable drawable;
        if (this.ae) {
            drawable = this.N;
        } else {
            drawable = this.F;
        }
        float f = this.H;
        if (f <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f;
    }

    private final ColorFilter X() {
        ColorFilter colorFilter = this.ah;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.ai;
    }

    private final void Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            bpu.k(drawable, bpu.g(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.e) {
                if (drawable.isStateful()) {
                    drawable.setState(this.al);
                }
                bsc.g(drawable, this.K);
                return;
            }
            Drawable drawable2 = this.F;
            if (drawable == drawable2 && this.I) {
                bsc.g(drawable2, this.G);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private final void Z(Rect rect, RectF rectF) {
        Drawable drawable;
        rectF.setEmpty();
        if (!ae() && !ad()) {
            return;
        }
        float f = this.g + this.P;
        float W = W();
        if (bpu.g(this) == 0) {
            rectF.left = rect.left + f;
            rectF.right = rectF.left + W;
        } else {
            rectF.right = rect.right - f;
            rectF.left = rectF.right - W;
        }
        if (this.ae) {
            drawable = this.N;
        } else {
            drawable = this.F;
        }
        float f2 = this.H;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) Math.ceil(hwx.j(this.T, 24));
            if (drawable.getIntrinsicHeight() <= f2) {
                f2 = drawable.getIntrinsicHeight();
            }
        }
        rectF.top = rect.exactCenterY() - (f2 / 2.0f);
        rectF.bottom = rectF.top + f2;
    }

    private final boolean aa() {
        if (this.M && this.N != null && this.f) {
            return true;
        }
        return false;
    }

    private static boolean ab(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean ac(int[] r8, int[] r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipu.ac(int[], int[]):boolean");
    }

    private final boolean ad() {
        if (this.M && this.N != null && this.ae) {
            return true;
        }
        return false;
    }

    private final boolean ae() {
        if (this.E && this.F != null) {
            return true;
        }
        return false;
    }

    private final boolean af() {
        if (this.d && this.e != null) {
            return true;
        }
        return false;
    }

    private static final void ag(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ipu f(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipu.f(android.content.Context, android.util.AttributeSet, int, int):ipu");
    }

    public static boolean r(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final float a() {
        if (!ae() && !ad()) {
            return 0.0f;
        }
        return this.P + W() + this.Q;
    }

    public final float b() {
        if (af()) {
            return this.R + this.L + this.S;
        }
        return 0.0f;
    }

    public final float c() {
        if (this.an) {
            return u();
        }
        return this.B;
    }

    public final Drawable d() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return bpu.h(drawable);
        }
        return null;
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        int i3;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.ag) != 0) {
            if (i < 255) {
                float f = bounds.left;
                float f2 = bounds.top;
                float f3 = bounds.right;
                float f4 = bounds.bottom;
                int i4 = this.ag;
                if (Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = canvas.saveLayerAlpha(f, f2, f3, f4, i4);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f, f2, f3, f4, i4, 31);
                }
                i2 = saveLayerAlpha;
            } else {
                i2 = 0;
            }
            if (!this.an) {
                this.U.setColor(this.Z);
                this.U.setStyle(Paint.Style.FILL);
                this.W.set(bounds);
                canvas.drawRoundRect(this.W, c(), c(), this.U);
            }
            if (!this.an) {
                this.U.setColor(this.aa);
                this.U.setStyle(Paint.Style.FILL);
                this.U.setColorFilter(X());
                this.W.set(bounds);
                canvas.drawRoundRect(this.W, c(), c(), this.U);
            }
            if (this.an) {
                super.draw(canvas);
            }
            if (this.D > 0.0f && !this.an) {
                this.U.setColor(this.ac);
                this.U.setStyle(Paint.Style.STROKE);
                if (!this.an) {
                    this.U.setColorFilter(X());
                }
                this.W.set(bounds.left + (this.D / 2.0f), bounds.top + (this.D / 2.0f), bounds.right - (this.D / 2.0f), bounds.bottom - (this.D / 2.0f));
                float f5 = this.B - (this.D / 2.0f);
                canvas.drawRoundRect(this.W, f5, f5, this.U);
            }
            this.U.setColor(0);
            this.U.setStyle(Paint.Style.FILL);
            this.W.set(bounds);
            if (!this.an) {
                canvas.drawRoundRect(this.W, c(), c(), this.U);
            } else {
                F(new RectF(bounds), this.Y);
                Paint paint = this.U;
                Path path = this.Y;
                RectF B = B();
                ive iveVar = this.q;
                super.G(canvas, paint, path, iveVar.a, iveVar.b, B);
            }
            if (ae()) {
                Z(bounds, this.W);
                RectF rectF = this.W;
                float f6 = rectF.left;
                float f7 = rectF.top;
                canvas.translate(f6, f7);
                this.F.setBounds(0, 0, (int) this.W.width(), (int) this.W.height());
                this.F.draw(canvas);
                canvas.translate(-f6, -f7);
            }
            if (ad()) {
                Z(bounds, this.W);
                RectF rectF2 = this.W;
                float f8 = rectF2.left;
                float f9 = rectF2.top;
                canvas.translate(f8, f9);
                this.N.setBounds(0, 0, (int) this.W.width(), (int) this.W.height());
                this.N.draw(canvas);
                canvas.translate(-f8, -f9);
            }
            if (this.n && this.c != null) {
                PointF pointF = this.X;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.c != null) {
                    float a = this.g + a() + this.h;
                    if (bpu.g(this) == 0) {
                        pointF.x = bounds.left + a;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - a;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    this.k.a.getFontMetrics(this.V);
                    Paint.FontMetrics fontMetrics = this.V;
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF3 = this.W;
                rectF3.setEmpty();
                if (this.c != null) {
                    float a2 = this.g + a() + this.h;
                    float b = this.j + b() + this.i;
                    if (bpu.g(this) == 0) {
                        rectF3.left = bounds.left + a2;
                        rectF3.right = bounds.right - b;
                    } else {
                        rectF3.left = bounds.left + b;
                        rectF3.right = bounds.right - a2;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                irx irxVar = this.k;
                if (irxVar.f != null) {
                    irxVar.a.drawableState = getState();
                    irx irxVar2 = this.k;
                    irxVar2.f.c(this.T, irxVar2.a, irxVar2.b);
                }
                this.k.a.setTextAlign(align);
                if (Math.round(this.k.a(this.c.toString())) > Math.round(this.W.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int save = canvas.save();
                    canvas.clipRect(this.W);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence = this.c;
                if (z && this.m != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.k.a, this.W.width(), this.m);
                }
                CharSequence charSequence2 = charSequence;
                PointF pointF2 = this.X;
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF2.x, pointF2.y, this.k.a);
                if (z) {
                    canvas.restoreToCount(i3);
                }
            }
            if (af()) {
                RectF rectF4 = this.W;
                rectF4.setEmpty();
                if (af()) {
                    float f10 = this.j + this.S;
                    if (bpu.g(this) == 0) {
                        rectF4.right = bounds.right - f10;
                        rectF4.left = rectF4.right - this.L;
                    } else {
                        rectF4.left = bounds.left + f10;
                        rectF4.right = rectF4.left + this.L;
                    }
                    rectF4.top = bounds.exactCenterY() - (this.L / 2.0f);
                    rectF4.bottom = rectF4.top + this.L;
                }
                RectF rectF5 = this.W;
                float f11 = rectF5.left;
                float f12 = rectF5.top;
                canvas.translate(f11, f12);
                this.e.setBounds(0, 0, (int) this.W.width(), (int) this.W.height());
                int i5 = iuv.b;
                this.J.setBounds(this.e.getBounds());
                this.J.jumpToCurrentState();
                this.J.draw(canvas);
                canvas.translate(-f11, -f12);
            }
            if (this.ag < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    @Override // defpackage.irw
    public final void e() {
        i();
        invalidateSelf();
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ag;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.ah;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.g + a() + this.h + this.k.a(this.c.toString()) + this.i + b() + this.j), this.o);
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.an) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.B);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.B);
        }
        outline.setAlpha(this.ag / 255.0f);
    }

    public final ius h() {
        return this.k.f;
    }

    protected final void i() {
        ipt iptVar = (ipt) this.am.get();
        if (iptVar != null) {
            iptVar.f();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!ab(this.z) && !ab(this.A) && !ab(this.C)) {
            ius iusVar = this.k.f;
            if ((iusVar == null || (colorStateList = iusVar.j) == null || !colorStateList.isStateful()) && !aa() && !r(this.F) && !r(this.N) && !ab(this.aj)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void j(boolean z) {
        if (this.M != z) {
            boolean ad = ad();
            this.M = z;
            boolean ad2 = ad();
            if (ad != ad2) {
                if (ad2) {
                    Y(this.N);
                } else {
                    ag(this.N);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void k(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.F;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = bpu.h(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float a = a();
            if (drawable != null) {
                drawable4 = bpu.i(drawable).mutate();
            }
            this.F = drawable4;
            float a2 = a();
            ag(drawable2);
            if (ae()) {
                Y(this.F);
            }
            invalidateSelf();
            if (a != a2) {
                i();
            }
        }
    }

    public final void l(boolean z) {
        if (this.E != z) {
            boolean ae = ae();
            this.E = z;
            boolean ae2 = ae();
            if (ae != ae2) {
                if (ae2) {
                    Y(this.F);
                } else {
                    ag(this.F);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void m(boolean z) {
        if (this.d != z) {
            boolean af = af();
            this.d = z;
            boolean af2 = af();
            if (af != af2) {
                if (af2) {
                    Y(this.e);
                } else {
                    ag(this.e);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void n(ipt iptVar) {
        this.am = new WeakReference(iptVar);
    }

    public final void o(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.c, charSequence)) {
            this.c = charSequence;
            this.k.d = true;
            invalidateSelf();
            i();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ae()) {
            onLayoutDirectionChanged |= bpu.k(this.F, i);
        }
        if (ad()) {
            onLayoutDirectionChanged |= bpu.k(this.N, i);
        }
        if (af()) {
            onLayoutDirectionChanged |= bpu.k(this.e, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (ae()) {
            onLevelChange |= this.F.setLevel(i);
        }
        if (ad()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (af()) {
            onLevelChange |= this.e.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable, defpackage.irw
    public final boolean onStateChange(int[] iArr) {
        if (this.an) {
            super.onStateChange(iArr);
        }
        return ac(iArr, this.al);
    }

    public final void p(ius iusVar) {
        this.k.c(iusVar, this.T);
    }

    public final void q(int i) {
        p(new ius(this.T, i));
    }

    public final boolean s(int[] iArr) {
        if (!Arrays.equals(this.al, iArr)) {
            this.al = iArr;
            if (af()) {
                return ac(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.ag != i) {
            this.ag = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.ah != colorFilter) {
            this.ah = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.aj != colorStateList) {
            this.aj = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.ivf, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.ak != mode) {
            this.ak = mode;
            this.ai = iqh.c(this, this.aj, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (ae()) {
            visible |= this.F.setVisible(z, z2);
        }
        if (ad()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (af()) {
            visible |= this.e.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
