package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.apps.adm.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class itq extends iua {
    public final TimeInterpolator c;
    public final itf d;
    public int e;
    public float f;
    public float g;
    cni h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = inc.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new ito(Float.class);
    private static final Property m = new itp(Float.class);

    public itq(Context context, itr itrVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = itrVar;
        this.c = hwx.h(context, R.attr.motionEasingStandardInterpolator, i);
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
        this.h = cniVar;
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<itq, Float>) l, 0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration(6000L);
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new itm(this));
        }
        if (this.o == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<itq, Float>) m, 0.0f, 1.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration(500L);
            this.o.addListener(new itn(this));
        }
        this.e = 0;
        ((ity) this.k.get(0)).c = this.d.c[0];
        this.g = 0.0f;
        this.n.start();
    }

    @Override // defpackage.iua
    public final void e() {
        this.h = null;
    }
}
