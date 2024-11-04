package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.apps.adm.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuj extends iua {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new iui(Float.class);
    public final Interpolator[] c;
    public final itf d;
    public int e;
    public boolean f;
    public float g;
    cni h;
    private ObjectAnimator l;
    private ObjectAnimator m;

    public iuj(Context context, iuk iukVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = iukVar;
        this.c = new Interpolator[]{bzy.b(context, R.anim.linear_indeterminate_line1_head_interpolator), bzy.b(context, R.anim.linear_indeterminate_line1_tail_interpolator), bzy.b(context, R.anim.linear_indeterminate_line2_head_interpolator), bzy.b(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.iua
    public final void a() {
        ObjectAnimator objectAnimator = this.l;
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
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            a();
            if (this.j.isVisible()) {
                this.m.setFloatValues(this.g, 1.0f);
                this.m.setDuration((1.0f - this.g) * 1800.0f);
                this.m.start();
            }
        }
    }

    @Override // defpackage.iua
    public final void d() {
        if (this.l == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<iuj, Float>) i, 0.0f, 1.0f);
            this.l = ofFloat;
            ofFloat.setDuration(1800L);
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new iug(this));
        }
        if (this.m == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<iuj, Float>) i, 1.0f);
            this.m = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.m.setInterpolator(null);
            this.m.addListener(new iuh(this));
        }
        this.e = 0;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ity) it.next()).c = this.d.c[0];
        }
        this.l.start();
    }

    @Override // defpackage.iua
    public final void e() {
        this.h = null;
    }
}
