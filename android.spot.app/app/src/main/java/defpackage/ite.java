package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ite extends ProgressBar {
    public final itf a;
    public int b;
    public boolean c;
    public boolean d;
    public final int e;
    private final boolean f;
    private final int g;
    private final Runnable h;
    private final Runnable i;
    private final cni j;
    private final cni k;

    /* JADX INFO: Access modifiers changed from: protected */
    public ite(Context context, AttributeSet attributeSet, int i, int i2) {
        super(iyj.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.d = false;
        this.e = 4;
        this.h = new ide(this, 12, null);
        this.i = new ide(this, 13, null);
        this.j = new itc(this);
        this.k = new itd(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray a = isa.a(context2, attributeSet, iul.a, i, i2, new int[0]);
        a.getInt(7, -1);
        this.g = Math.min(a.getInt(5, -1), 1000);
        a.recycle();
        this.f = true;
    }

    private final itz h() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                return getIndeterminateDrawable().a;
            }
            return null;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract itf a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final itt getProgressDrawable() {
        return (itt) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final iub getIndeterminateDrawable() {
        return (iub) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (!this.f) {
            return;
        }
        ((itx) getCurrentDrawable()).k(g(), false, z);
    }

    public final void e() {
        if (this.g > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void f(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.b = i;
                this.c = false;
                this.d = true;
                if (getIndeterminateDrawable().isVisible() && hzc.r(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().b.c();
                    return;
                } else {
                    this.j.b(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    final boolean g() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.b(this.j);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(this.k);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().g(this.k);
        }
        if (g()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((itx) getCurrentDrawable()).m();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().n(this.k);
            getIndeterminateDrawable().b.e();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().n(this.k);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        int b;
        int a;
        itz h = h();
        if (h == null) {
            return;
        }
        if (h.b() < 0) {
            b = getDefaultSize(getSuggestedMinimumWidth(), i);
        } else {
            b = h.b() + getPaddingLeft() + getPaddingRight();
        }
        if (h.a() < 0) {
            a = getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            a = h.a() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(b, a);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        d(z);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((itx) currentDrawable).m();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((itx) currentDrawable2).k(g(), false, false);
        }
        if ((currentDrawable2 instanceof iub) && g()) {
            ((iub) currentDrawable2).b.d();
        }
        this.d = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof iub) {
                ((itx) drawable).m();
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        f(i, false);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof itt) {
                itt ittVar = (itt) drawable;
                ittVar.m();
                super.setProgressDrawable(ittVar);
                ittVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }
}
