package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AndroidRuntimeException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itt extends itx {
    private static final ccw o = new its();
    public final itz a;
    public final ity b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final ccx p;
    private boolean q;
    private final ValueAnimator r;
    private final ccv s;

    public itt(Context context, itf itfVar, itz itzVar) {
        super(context, itfVar);
        this.q = false;
        this.a = itzVar;
        ity ityVar = new ity();
        this.b = ityVar;
        ityVar.h = true;
        ccx ccxVar = new ccx();
        this.p = ccxVar;
        ccxVar.b = 1.0d;
        ccxVar.c = false;
        ccxVar.d(50.0f);
        ccv ccvVar = new ccv(this, o);
        this.s = ccvVar;
        ccvVar.r = ccxVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.r = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new hhn(this, itfVar, 3));
        if (itfVar.b() && itfVar.j != 0) {
            valueAnimator.start();
        }
        h(1.0f);
    }

    public final float a(int i) {
        float f = i;
        if (f >= 1000.0f && f <= 9000.0f) {
            return 1.0f;
        }
        return 0.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // defpackage.itx
    public final boolean d(boolean z, boolean z2, boolean z3) {
        Context context = this.h;
        boolean d = super.d(z, z2, z3);
        float r = hzc.r(context.getContentResolver());
        if (r == 0.0f) {
            this.q = true;
        } else {
            this.q = false;
            this.p.d(50.0f / r);
        }
        return d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.a.h(canvas, getBounds(), e(), j(), i());
            this.b.f = f();
            this.l.setStyle(Paint.Style.FILL);
            this.l.setAntiAlias(true);
            ity ityVar = this.b;
            itf itfVar = this.i;
            ityVar.c = itfVar.c[0];
            int i = itfVar.g;
            if (i > 0) {
                if (!(this.a instanceof iuc)) {
                    i = (int) ((i * bpv.d(b(), 0.0f, 0.01f)) / 0.01f);
                }
                this.a.f(canvas, this.l, b(), 1.0f, this.i.d, this.m, i);
            } else {
                this.a.f(canvas, this.l, 0.0f, 1.0f, itfVar.d, this.m, 0);
            }
            this.a.e(canvas, this.l, this.b, this.m);
            this.a.d(canvas, this.l, this.i.c[0], this.m);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.itx, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.s.c();
        c(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float durationScale;
        float f = i;
        if (this.q) {
            float a = a(i);
            this.s.c();
            c(f / 10000.0f);
            this.b.e = a;
            invalidateSelf();
        } else {
            ccv ccvVar = this.s;
            ccvVar.h = b() * 10000.0f;
            ccvVar.i = true;
            ccv ccvVar2 = this.s;
            if (ccvVar2.l) {
                ccvVar2.s = f;
            } else {
                if (ccvVar2.r == null) {
                    ccvVar2.r = new ccx(f);
                }
                ccvVar2.r.c(f);
                ccx ccxVar = ccvVar2.r;
                if (ccxVar != null) {
                    double a2 = ccxVar.a();
                    float f2 = ccvVar2.m;
                    if (a2 <= 3.4028234663852886E38d) {
                        float f3 = ccvVar2.n;
                        if (a2 >= -3.4028234663852886E38d) {
                            double abs = Math.abs(ccvVar2.o * 0.75f);
                            ccxVar.d = abs;
                            ccxVar.e = abs * 62.5d;
                            if (ccm.a().b()) {
                                if (!ccvVar2.l) {
                                    ccvVar2.l = true;
                                    if (!ccvVar2.i) {
                                        ccvVar2.h = ccvVar2.k.a(ccvVar2.j);
                                    }
                                    float f4 = ccvVar2.h;
                                    float f5 = ccvVar2.m;
                                    if (f4 <= Float.MAX_VALUE) {
                                        float f6 = ccvVar2.n;
                                        if (f4 >= -3.4028235E38f) {
                                            ccm a3 = ccm.a();
                                            if (a3.b.size() == 0) {
                                                a3.h.C(a3.c);
                                                if (Build.VERSION.SDK_INT >= 33) {
                                                    durationScale = ValueAnimator.getDurationScale();
                                                    a3.f = durationScale;
                                                    if (a3.g == null) {
                                                        a3.g = new cck(a3);
                                                    }
                                                    final cck cckVar = a3.g;
                                                    if (cckVar.a == null) {
                                                        cckVar.a = new ValueAnimator.DurationScaleChangeListener() { // from class: ccj
                                                            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                                            public final void onChanged(float f7) {
                                                                cck.this.b.f = f7;
                                                            }
                                                        };
                                                        ValueAnimator.registerDurationScaleChangeListener(cckVar.a);
                                                    }
                                                }
                                            }
                                            if (!a3.b.contains(ccvVar2)) {
                                                a3.b.add(ccvVar2);
                                            }
                                        }
                                    }
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                            } else {
                                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                            }
                        } else {
                            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
                }
            }
        }
        return true;
    }
}
