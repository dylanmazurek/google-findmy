package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class itl extends iua {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new itj(Float.class);
    private static final Property m = new itk(Float.class);
    public final ced d;
    public final itf e;
    public int f;
    public float g;
    public float h;
    cni i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public itl(itr itrVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = itrVar;
        this.d = new ced();
    }

    @Override // defpackage.iua
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.iua
    public final void b(cni cniVar) {
        this.i = cniVar;
    }

    @Override // defpackage.iua
    public final void c() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.j.isVisible()) {
                this.o.start();
            } else {
                a();
            }
        }
    }

    @Override // defpackage.iua
    public final void d() {
        if (this.n == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<itl, Float>) l, 0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration(5400L);
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new ith(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<itl, Float>) m, 0.0f, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration(333L);
            this.o.setInterpolator(this.d);
            this.o.addListener(new iti(this));
        }
        this.f = 0;
        ((ity) this.k.get(0)).c = this.e.c[0];
        this.h = 0.0f;
        this.n.start();
    }

    @Override // defpackage.iua
    public final void e() {
        this.i = null;
    }
}
