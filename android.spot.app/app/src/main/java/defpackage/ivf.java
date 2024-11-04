package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.adm.R;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ivf extends Drawable implements bsi, ivw {
    private static final String a = "ivf";
    private static final Paint b;
    static final ivl p;
    private final njz A;
    private final Matrix c;
    private final Path d;
    private final Path e;
    private final RectF f;
    private final RectF g;
    private final Region h;
    private final Region i;
    private ivl j;
    private ivl k;
    private final Paint l;
    private final Paint m;
    private final iux n;
    private final ivn o;
    public ive q;
    public final ivu[] r;
    public final ivu[] s;
    public final BitSet t;
    public boolean u;
    public int v;
    public boolean w;
    private PorterDuffColorFilter x;
    private PorterDuffColorFilter y;
    private final RectF z;

    static {
        ivj ivjVar = new ivj();
        iuu d = ivc.d(0);
        ivjVar.j(d);
        ivjVar.k(d);
        ivjVar.i(d);
        ivjVar.h(d);
        ivjVar.e(0.0f);
        p = new ivl(ivjVar);
        Paint paint = new Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public ivf() {
        this(new ivl());
    }

    public static ivf C(Context context) {
        return D(context, 0.0f, null);
    }

    public static ivf D(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(iqg.e(context, R.attr.colorSurface, a));
        }
        ivf ivfVar = new ivf();
        ivfVar.I(context);
        ivfVar.L(colorStateList);
        ivfVar.K(f);
        return ivfVar;
    }

    private final float a() {
        if (i()) {
            return this.m.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private static int b(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = x(colorForState);
            }
            this.v = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z) {
            int color = paint.getColor();
            int x = x(color);
            this.v = x;
            if (x != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(x, PorterDuff.Mode.SRC_IN);
            }
        }
        return porterDuffColorFilter;
    }

    private final RectF d() {
        this.g.set(B());
        RectF rectF = this.g;
        float a2 = a();
        rectF.inset(a2, a2);
        return this.g;
    }

    private final void e(RectF rectF, Path path) {
        F(rectF, path);
        if (this.q.k != 1.0f) {
            this.c.reset();
            Matrix matrix = this.c;
            float f = this.q.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.c);
        }
        path.computeBounds(this.z, true);
    }

    private final void f(Canvas canvas) {
        if (this.t.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.q.t != 0) {
            canvas.drawPath(this.d, this.n.e);
        }
        for (int i = 0; i < 4; i++) {
            this.r[i].c(this.n, this.q.s, canvas);
            this.s[i].c(this.n, this.q.s, canvas);
        }
        if (this.w) {
            int y = y();
            int z = z();
            canvas.translate(-y, -z);
            canvas.drawPath(this.d, b);
            canvas.translate(y, z);
        }
    }

    private final void h() {
        float w = w();
        this.q.s = (int) Math.ceil(0.75f * w);
        this.q.t = (int) Math.ceil(w * 0.25f);
        k();
        super.invalidateSelf();
    }

    private final boolean i() {
        if ((this.q.w == Paint.Style.FILL_AND_STROKE || this.q.w == Paint.Style.STROKE) && this.m.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    private final boolean j(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.q.e != null && color2 != (colorForState2 = this.q.e.getColorForState(iArr, (color2 = this.l.getColor())))) {
            this.l.setColor(colorForState2);
            z = true;
        }
        if (this.q.f != null && color != (colorForState = this.q.f.getColorForState(iArr, (color = this.m.getColor())))) {
            this.m.setColor(colorForState);
            return true;
        }
        return z;
    }

    private final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter = this.x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        ive iveVar = this.q;
        this.x = c(iveVar.h, iveVar.i, this.l, true);
        ive iveVar2 = this.q;
        ColorStateList colorStateList = iveVar2.g;
        this.y = c(null, iveVar2.i, this.m, false);
        boolean z = this.q.v;
        if (!Objects.equals(porterDuffColorFilter, this.x) || !Objects.equals(porterDuffColorFilter2, this.y)) {
            return true;
        }
        return false;
    }

    public final ColorStateList A() {
        return this.q.e;
    }

    public final RectF B() {
        this.f.set(getBounds());
        return this.f;
    }

    public final ivl E() {
        return this.q.a;
    }

    public final void F(RectF rectF, Path path) {
        ive iveVar = this.q;
        this.o.b(iveVar.a, iveVar.b, iveVar.l, rectF, this.A, path);
    }

    public final void G(Canvas canvas, Paint paint, Path path, ivl ivlVar, ivl ivlVar2, RectF rectF) {
        if (ivlVar.g(rectF)) {
            float i = hwx.i(ivlVar2.b.a(rectF), ivlVar.b.a(rectF), this.q.l);
            canvas.drawRoundRect(rectF, i, i, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void H(Canvas canvas) {
        G(canvas, this.m, this.e, this.j, this.k, d());
    }

    public final void I(Context context) {
        this.q.c = new iqi(context);
        h();
    }

    public final void J(float f) {
        cy(this.q.a.e(f));
    }

    public final void K(float f) {
        ive iveVar = this.q;
        if (iveVar.p != f) {
            iveVar.p = f;
            h();
        }
    }

    public final void L(ColorStateList colorStateList) {
        ive iveVar = this.q;
        if (iveVar.e != colorStateList) {
            iveVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void M(float f) {
        ive iveVar = this.q;
        if (iveVar.l != f) {
            iveVar.l = f;
            this.u = true;
            invalidateSelf();
        }
    }

    public final void N(float f) {
        ive iveVar = this.q;
        if (iveVar.o != f) {
            iveVar.o = f;
            h();
        }
    }

    public final void O(int i) {
        this.n.a(i);
        this.q.v = false;
        super.invalidateSelf();
    }

    public final void P(float f, int i) {
        S(f);
        R(ColorStateList.valueOf(i));
    }

    public final void Q(float f, ColorStateList colorStateList) {
        S(f);
        R(colorStateList);
    }

    public final void R(ColorStateList colorStateList) {
        ive iveVar = this.q;
        if (iveVar.f != colorStateList) {
            iveVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    public final void S(float f) {
        this.q.m = f;
        invalidateSelf();
    }

    public final boolean T() {
        if (this.q.a.g(B()) && this.q.b.g(B())) {
            return true;
        }
        return false;
    }

    public final void U() {
        ive iveVar = this.q;
        if (iveVar.r != 2) {
            iveVar.r = 2;
            super.invalidateSelf();
        }
    }

    public final void V() {
        ive iveVar = this.q;
        if (iveVar.u != 180) {
            iveVar.u = 180;
            super.invalidateSelf();
        }
    }

    @Override // defpackage.ivw
    public final void cy(ivl ivlVar) {
        this.q.a = ivlVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        this.l.setColorFilter(this.x);
        int alpha = this.l.getAlpha();
        this.l.setAlpha(b(alpha, this.q.n));
        this.m.setColorFilter(this.y);
        this.m.setStrokeWidth(this.q.m);
        int alpha2 = this.m.getAlpha();
        this.m.setAlpha(b(alpha2, this.q.n));
        if (this.u) {
            float f = -a();
            this.j = E().f(new ivd(f, 1));
            ivl f2 = this.q.b.f(new ivd(f, 0));
            this.k = f2;
            this.o.b(this.j, f2, this.q.l, d(), null, this.e);
            e(B(), this.d);
            this.u = false;
        }
        ive iveVar = this.q;
        int i2 = iveVar.r;
        if (i2 != 1 && iveVar.s > 0 && (i2 == 2 || (!T() && !this.d.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            canvas.translate(y(), z());
            if (!this.w) {
                f(canvas);
                canvas.restore();
            } else {
                float width = this.z.width() - getBounds().width();
                float height = this.z.height() - getBounds().height();
                int i3 = (int) width;
                if (i3 >= 0 && (i = (int) height) >= 0) {
                    int width2 = (int) this.z.width();
                    int i4 = this.q.s;
                    int height2 = (int) this.z.height();
                    int i5 = this.q.s;
                    Bitmap createBitmap = Bitmap.createBitmap(width2 + i4 + i4 + i3, height2 + i5 + i5 + i, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.q.s) - i3;
                    float f4 = (getBounds().top - this.q.s) - i;
                    canvas2.translate(-f3, -f4);
                    f(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
            }
        }
        if (this.q.w == Paint.Style.FILL_AND_STROKE || this.q.w == Paint.Style.FILL) {
            Paint paint = this.l;
            Path path = this.d;
            ive iveVar2 = this.q;
            G(canvas, paint, path, iveVar2.a, iveVar2.b, B());
        }
        if (i()) {
            H(canvas);
        }
        this.l.setAlpha(alpha);
        this.m.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.q.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.q.r == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), hwx.i(this.q.b.b.a(B()), u(), this.q.l));
        } else {
            e(B(), this.d);
            iqh.e(outline, this.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.q.j;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.h.set(getBounds());
        e(B(), this.d);
        this.i.setPath(this.d, this.h);
        this.h.op(this.i, Region.Op.DIFFERENCE);
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.u = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.q.h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ive iveVar = this.q;
        ColorStateList colorStateList2 = iveVar.g;
        ColorStateList colorStateList3 = iveVar.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.q.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.q = new ive(this.q);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.u = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.irw
    public boolean onStateChange(int[] iArr) {
        boolean j = j(iArr);
        boolean k = k();
        boolean z = true;
        if (!j && !k) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ive iveVar = this.q;
        if (iveVar.n != i) {
            iveVar.n = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.q.d = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.q.h = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ive iveVar = this.q;
        if (iveVar.i != mode) {
            iveVar.i = mode;
            k();
            super.invalidateSelf();
        }
    }

    public final float t() {
        return this.q.p;
    }

    public final float u() {
        return this.q.a.b.a(B());
    }

    public final float v() {
        return this.q.a.c.a(B());
    }

    public final float w() {
        float t = t();
        float f = this.q.q;
        return t + 0.0f;
    }

    public final int x(int i) {
        float w = w();
        ive iveVar = this.q;
        float f = w + iveVar.o;
        iqi iqiVar = iveVar.c;
        if (iqiVar != null) {
            return iqiVar.b(i, f);
        }
        return i;
    }

    public final int y() {
        ive iveVar = this.q;
        return (int) (iveVar.t * Math.sin(Math.toRadians(iveVar.u)));
    }

    public final int z() {
        ive iveVar = this.q;
        return (int) (iveVar.t * Math.cos(Math.toRadians(iveVar.u)));
    }

    public ivf(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new ivl(ivl.c(context, attributeSet, i, i2)));
    }

    public ivf(ive iveVar) {
        ivn ivnVar;
        this.r = new ivu[4];
        this.s = new ivu[4];
        this.t = new BitSet(8);
        this.c = new Matrix();
        this.d = new Path();
        this.e = new Path();
        this.f = new RectF();
        this.g = new RectF();
        this.h = new Region();
        this.i = new Region();
        Paint paint = new Paint(1);
        this.l = paint;
        Paint paint2 = new Paint(1);
        this.m = paint2;
        this.n = new iux();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ivnVar = ivm.a;
        } else {
            ivnVar = new ivn();
        }
        this.o = ivnVar;
        this.z = new RectF();
        this.w = true;
        this.q = iveVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k();
        j(getState());
        this.A = new njz(this, null);
    }

    public ivf(ivl ivlVar) {
        this(new ive(ivlVar));
    }
}
