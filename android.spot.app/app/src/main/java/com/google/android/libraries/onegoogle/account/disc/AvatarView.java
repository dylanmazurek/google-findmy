package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;
import defpackage.buc;
import defpackage.bwn;
import defpackage.cu;
import defpackage.eew;
import defpackage.gpm;
import defpackage.haf;
import defpackage.haj;
import defpackage.hog;
import defpackage.hwx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AvatarView extends AppCompatImageView {
    public final Paint a;
    public final Paint b;
    public Drawable c;
    public int d;
    public Drawable e;
    public float f;
    public buc g;
    public boolean h;
    public Runnable i;
    private final Paint j;
    private final Paint k;
    private final RectF l;
    private final Path m;
    private final Path n;
    private final int o;
    private final haf p;
    private float q;
    private Drawable r;
    private int s;
    private final RectF t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;

    public AvatarView(Context context) {
        this(context, null);
    }

    public static void b(float f, Drawable drawable) {
        boolean z = true;
        if (f != 1.0f && drawable != null && !(drawable instanceof haj)) {
            z = false;
        }
        hwx.V(z, "Scaling is not allowed when there is a ring drawable and it's not scalable.");
    }

    private static void k(Drawable drawable, Drawable drawable2, boolean z) {
        boolean z2 = true;
        if ((drawable != null || drawable2 != null) && !z) {
            z2 = false;
        }
        hwx.V(z2, "setting ring/badge is only allowed with allowDecorations");
    }

    private final void l(Canvas canvas) {
        if (!this.n.isEmpty()) {
            canvas.drawPath(this.n, this.j);
        }
    }

    private final void m() {
        if (getLayerType() != 2) {
            setLayerType(2, null);
        }
    }

    private final void n() {
        boolean z;
        float f;
        this.n.rewind();
        Rect rect = new Rect();
        if (Math.min(this.w, this.x) != Integer.MIN_VALUE && this.d != Integer.MIN_VALUE && !this.l.isEmpty() && this.q != 0.0f) {
            m();
            float a = a(this.d) * this.q;
            boolean z2 = true;
            if (this.d != Integer.MIN_VALUE && !this.l.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            hwx.U(z);
            int[] iArr = bwn.a;
            int layoutDirection = getLayoutDirection();
            float strokeWidth = this.l.left - (this.b.getStrokeWidth() / 2.0f);
            float strokeWidth2 = this.l.right + (this.b.getStrokeWidth() / 2.0f);
            float a2 = (a(this.d) / 2.0f) - this.o;
            if (layoutDirection == 1) {
                f = strokeWidth + a2;
            } else {
                f = strokeWidth2 - a2;
            }
            if (this.d == Integer.MIN_VALUE || this.l.isEmpty()) {
                z2 = false;
            }
            float f2 = a / 2.0f;
            hwx.U(z2);
            float strokeWidth3 = (this.l.bottom + (this.b.getStrokeWidth() / 2.0f)) - (a(this.d) / 2.0f);
            this.n.addCircle(f, strokeWidth3, (this.o * this.q) + f2, Path.Direction.CW);
            new RectF(f - f2, strokeWidth3 - f2, f + f2, strokeWidth3 + f2).round(rect);
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if (!this.m.isEmpty()) {
            this.m.rewind();
        }
        if (!this.n.isEmpty() && !this.l.isEmpty()) {
            this.m.addOval(this.l, Path.Direction.CW);
            Path path = this.m;
            path.op(path, this.n, Path.Op.DIFFERENCE);
        }
        invalidate();
    }

    private final void o(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE) {
            int min = Math.min(i, i2);
            int i4 = (min - i3) / 2;
            setPadding(i4, i4, (i + i4) - min, (i2 + i4) - min);
        }
    }

    private final void p(Drawable drawable, int i) {
        if (drawable != null && i != Integer.MIN_VALUE) {
            int d = this.p.d(this.d);
            m();
            Paint paint = this.k;
            Rect copyBounds = drawable.copyBounds();
            int strokeWidth = (d - i) - ((int) (paint.getStrokeWidth() / 2.0f));
            copyBounds.inset(strokeWidth, strokeWidth);
            this.t.set(copyBounds);
            invalidate();
        }
    }

    final int a(int i) {
        if (i > getResources().getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_medium_badge)) {
            return getResources().getDimensionPixelSize(R.dimen.og_apd_large_badge_size);
        }
        if (i > getResources().getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_badge)) {
            return getResources().getDimensionPixelSize(R.dimen.og_apd_medium_badge_size);
        }
        return getResources().getDimensionPixelSize(R.dimen.og_apd_small_badge_size);
    }

    public final void c(int i) {
        if (i != Integer.MIN_VALUE) {
            this.g.a(Integer.valueOf(this.p.d(i)));
        }
    }

    public final void d() {
        if (this.u) {
            return;
        }
        this.u = true;
        invalidate();
    }

    public final void e(int i) {
        int i2 = this.d;
        this.d = i;
        if (i2 == Integer.MIN_VALUE) {
            this.i.run();
        }
        o(this.w, this.x, i);
        j();
        c(i);
    }

    public final void f(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.r = drawable;
        k(this.e, drawable, this.u);
        Drawable drawable3 = this.r;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        n();
    }

    public final void g(boolean z) {
        this.v = z;
        invalidate();
    }

    public final void h(Drawable drawable) {
        b(this.f, drawable);
        k(drawable, this.r, this.u);
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        j();
    }

    public final void i(int i) {
        setTag(R.id.og_avatar_size_hint, Integer.valueOf(i));
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (!drawable.equals(this.r) && !drawable.equals(this.e)) {
            return;
        }
        invalidate();
    }

    public final void j() {
        int i;
        if (Math.min(this.w, this.x) != Integer.MIN_VALUE && (i = this.d) != Integer.MIN_VALUE) {
            float f = i;
            this.l.set(0.0f, 0.0f, f, f);
            float f2 = (int) ((r0 - this.d) / 2.0f);
            this.l.offset(f2, f2);
            this.l.inset(1.0f, 1.0f);
            int d = this.p.d(this.d);
            this.k.setStrokeWidth(d + d);
            if (this.e != null) {
                RectF rectF = new RectF(this.l);
                int c = this.p.c(this.d);
                int i2 = d + 1;
                float round = ((c - Math.round(this.f * c)) / 2) - (i2 + i2);
                rectF.inset(round, round);
                Rect rect = new Rect();
                rectF.roundOut(rect);
                this.e.setBounds(rect);
                p(this.e, this.s);
            }
        } else {
            this.l.setEmpty();
        }
        n();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        float f;
        int i;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            if (!this.t.isEmpty()) {
                canvas.drawArc(this.t, 0.0f, 360.0f, false, this.k);
            }
        }
        if (this.u && (i = this.d) != Integer.MIN_VALUE) {
            f = this.p.b(Math.round(this.f * this.p.c(i))) / this.d;
        } else {
            f = this.f;
        }
        float min = Math.min(this.w, this.x) / 2.0f;
        canvas.scale(f, f, min, min);
        super.onDraw(canvas);
        if (this.v) {
            if (!this.m.isEmpty()) {
                l(canvas);
                canvas.drawPath(this.m, this.b);
            } else if (!this.l.isEmpty()) {
                canvas.drawArc(this.l, 0.0f, 360.0f, false, this.b);
                l(canvas);
            }
            Drawable drawable2 = this.r;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                float height = (bounds.height() - this.b.getStrokeWidth()) / 2.0f;
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), height, this.a);
                this.r.draw(canvas);
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), height, this.b);
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.w = i;
        this.x = i2;
        o(i, i2, this.d);
        j();
        if (!this.h) {
            int min = Math.min(i, i2);
            if (this.u) {
                min = this.p.b(min);
            }
            if (((Integer) hog.F(this).e(0)).intValue() < min) {
                i(min);
            }
            e(min);
        }
    }

    void setBadgeScale(float f) {
        this.q = f;
        n();
    }

    void setCurrRingThickness(int i) {
        if (i == this.s) {
            return;
        }
        this.s = i;
        p(this.e, i);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.b = paint2;
        Paint paint3 = new Paint();
        this.j = paint3;
        Paint paint4 = new Paint();
        this.k = paint4;
        this.l = new RectF();
        this.m = new Path();
        this.n = new Path();
        this.o = getResources().getDimensionPixelSize(R.dimen.og_apd_badge_wrapper_padding);
        this.p = new haf(getResources());
        this.d = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.t = new RectF();
        this.f = 1.0f;
        this.g = new eew(3);
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.i = new gpm(2);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.og_border_ring_thickness));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setStyle(Paint.Style.FILL);
        paint4.setAntiAlias(true);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint4.setStyle(Paint.Style.STROKE);
        this.c = cu.c(context, R.drawable.disc_oval);
    }
}
