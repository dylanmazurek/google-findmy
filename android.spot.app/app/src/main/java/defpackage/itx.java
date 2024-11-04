package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class itx extends Drawable implements Animatable {
    private static final Property a = new itw(Float.class);
    private ValueAnimator b;
    private ValueAnimator c;
    private float e;
    final Context h;
    final itf i;
    public List j;
    public boolean k;
    public int m;
    private final float d = -1.0f;
    final Paint l = new Paint();
    final hzc n = new hzc();

    public itx(Context context, itf itfVar) {
        this.h = context;
        this.i = itfVar;
        setAlpha(255);
    }

    private final void a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.k;
        this.k = true;
        valueAnimatorArr[0].end();
        this.k = z;
    }

    public boolean d(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z4;
        boolean c;
        if (this.b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<itx, Float>) a, 0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.setDuration(500L);
            this.b.setInterpolator(inc.b);
            ValueAnimator valueAnimator3 = this.b;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator3;
            valueAnimator3.addListener(new itu(this));
        }
        if (this.c == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<itx, Float>) a, 1.0f, 0.0f);
            this.c = ofFloat2;
            ofFloat2.setDuration(500L);
            this.c.setInterpolator(inc.b);
            ValueAnimator valueAnimator4 = this.c;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator4;
            valueAnimator4.addListener(new itv(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.b;
        } else {
            valueAnimator = this.c;
        }
        if (z) {
            valueAnimator2 = this.c;
        } else {
            valueAnimator2 = this.b;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                boolean z5 = this.k;
                this.k = true;
                valueAnimator2.cancel();
                this.k = z5;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                a(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        if (z && !super.setVisible(true, false)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            c = this.i.d();
        } else {
            c = this.i.c();
        }
        if (!c) {
            a(valueAnimator);
            return z4;
        }
        if (!z2 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float e() {
        if (!this.i.d() && !this.i.c()) {
            return 1.0f;
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float f() {
        float f = this.d;
        if (f > 0.0f) {
            return f;
        }
        if (!this.i.b() || this.i.j == 0) {
            return 0.0f;
        }
        float r = hzc.r(this.h.getContentResolver());
        if (r <= 0.0f) {
            return 0.0f;
        }
        itf itfVar = this.i;
        int i = (int) (((itfVar.h * 1000.0f) / itfVar.j) * r);
        float currentTimeMillis = ((float) (System.currentTimeMillis() % i)) / i;
        if (currentTimeMillis < 0.0f) {
            return (currentTimeMillis % 1.0f) + 1.0f;
        }
        return currentTimeMillis;
    }

    public final void g(cni cniVar) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (!this.j.contains(cniVar)) {
            this.j.add(cniVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(float f) {
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
    }

    public final boolean i() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (!j() && !i()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean k(boolean z, boolean z2, boolean z3) {
        float r = hzc.r(this.h.getContentResolver());
        boolean z4 = false;
        if (z3 && r > 0.0f) {
            z4 = true;
        }
        return d(z, z2, z4);
    }

    public final void m() {
        k(false, false, false);
    }

    public final void n(cni cniVar) {
        List list = this.j;
        if (list != null && list.contains(cniVar)) {
            this.j.remove(cniVar);
            if (this.j.isEmpty()) {
                this.j = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return k(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
