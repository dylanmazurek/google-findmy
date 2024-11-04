package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ke extends fs implements lu {
    private static final int[] r = {R.attr.state_pressed};
    private static final int[] s = new int[0];
    private final Runnable D;
    private final ft E;
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public RecyclerView l;
    public final ValueAnimator p;
    public int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    public ke(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        this.q = 0;
        this.D = new w(this, 12, null);
        kc kcVar = new kc(this);
        this.E = kcVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i, drawable.getIntrinsicWidth());
        this.y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.t = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new kd(this));
        ofFloat.addUpdateListener(new bwy(this, 1));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.ar(this);
                RecyclerView recyclerView3 = this.l;
                recyclerView3.p.remove(this);
                if (recyclerView3.q == this) {
                    recyclerView3.q = null;
                }
                this.l.as(kcVar);
                o();
            }
            this.l = recyclerView;
            if (recyclerView != null) {
                recyclerView.ap(this);
                this.l.p.add(this);
                this.l.aq(kcVar);
            }
        }
    }

    private final void o() {
        this.l.removeCallbacks(this.D);
    }

    private final void p(int i) {
        o();
        this.l.postDelayed(this.D, i);
    }

    private final boolean q() {
        if (this.l.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    private static final int r(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // defpackage.fs
    public final void d(Canvas canvas) {
        if (this.j == this.l.getWidth() && this.k == this.l.getHeight()) {
            if (this.q != 0) {
                if (this.m) {
                    int i = this.j;
                    int i2 = this.u;
                    int i3 = i - i2;
                    int i4 = this.e;
                    int i5 = this.d;
                    int i6 = i4 - (i5 / 2);
                    this.b.setBounds(0, 0, i2, i5);
                    this.c.setBounds(0, 0, this.v, this.k);
                    float f = i6;
                    float f2 = -i6;
                    if (q()) {
                        this.c.draw(canvas);
                        canvas.translate(this.u, f);
                        canvas.scale(-1.0f, 1.0f);
                        this.b.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-this.u, f2);
                    } else {
                        canvas.translate(i3, 0.0f);
                        this.c.draw(canvas);
                        canvas.translate(0.0f, f);
                        this.b.draw(canvas);
                        canvas.translate(-i3, f2);
                    }
                }
                if (this.n) {
                    int i7 = this.k;
                    int i8 = this.y;
                    int i9 = this.h;
                    int i10 = this.g;
                    this.w.setBounds(0, 0, i10, i8);
                    this.x.setBounds(0, 0, this.j, this.z);
                    canvas.translate(0.0f, i7 - i8);
                    this.x.draw(canvas);
                    canvas.translate(i9 - (i10 / 2), 0.0f);
                    this.w.draw(canvas);
                    canvas.translate(-r4, -r0);
                    return;
                }
                return;
            }
            return;
        }
        this.j = this.l.getWidth();
        this.k = this.l.getHeight();
        h(0);
    }

    public final void g() {
        this.l.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            o();
        }
        if (i == 0) {
            g();
        } else {
            i();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            p(1200);
        } else if (i == 1) {
            p(1500);
        }
        this.o = i;
    }

    public final void i() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.p.setDuration(500L);
        this.p.setStartDelay(0L);
        this.p.start();
    }

    final boolean j(float f, float f2) {
        if (f2 >= this.k - this.y) {
            int i = this.h;
            int i2 = this.g / 2;
            if (f >= i - i2 && f <= i + i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    final boolean k(float f, float f2) {
        if (q()) {
            if (f > this.u) {
                return false;
            }
        } else if (f < this.j - this.u) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        if (f2 >= i - i2 && f2 <= i + i2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lu
    public final boolean l(MotionEvent motionEvent) {
        int i = this.o;
        if (i == 1) {
            boolean k = k(motionEvent.getX(), motionEvent.getY());
            boolean j = j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!k) {
                if (!j) {
                    return false;
                }
            } else if (!j) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
                h(2);
                return true;
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            h(2);
            return true;
        }
        if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.lu
    public final void n(MotionEvent motionEvent) {
        if (this.o != 0) {
            if (motionEvent.getAction() == 0) {
                boolean k = k(motionEvent.getX(), motionEvent.getY());
                boolean j = j(motionEvent.getX(), motionEvent.getY());
                if (!k) {
                    if (!j) {
                        return;
                    }
                } else if (!j) {
                    this.A = 2;
                    this.f = (int) motionEvent.getY();
                    h(2);
                    return;
                }
                this.A = 1;
                this.i = (int) motionEvent.getX();
                h(2);
                return;
            }
            if (motionEvent.getAction() == 1 && this.o == 2) {
                this.f = 0.0f;
                this.i = 0.0f;
                h(1);
                this.A = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.o == 2) {
                i();
                if (this.A == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.C;
                    int i = this.t;
                    iArr[0] = i;
                    int i2 = this.j - i;
                    iArr[1] = i2;
                    float max = Math.max(i, Math.min(i2, x));
                    if (Math.abs(this.h - max) >= 2.0f) {
                        int r2 = r(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                        if (r2 != 0) {
                            this.l.scrollBy(r2, 0);
                        }
                        this.i = max;
                    }
                }
                if (this.A == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.B;
                    int i3 = this.t;
                    iArr2[0] = i3;
                    int i4 = this.k - i3;
                    iArr2[1] = i4;
                    float max2 = Math.max(i3, Math.min(i4, y));
                    if (Math.abs(this.e - max2) >= 2.0f) {
                        int r3 = r(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                        if (r3 != 0) {
                            this.l.scrollBy(0, r3);
                        }
                        this.f = max2;
                    }
                }
            }
        }
    }

    @Override // defpackage.lu
    public final void m() {
    }
}
