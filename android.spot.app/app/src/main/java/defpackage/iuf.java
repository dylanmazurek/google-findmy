package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuf extends iua {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new iue(Float.class);
    public final ced a;
    public final itf b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public iuf(iuk iukVar) {
        super(3);
        this.c = 1;
        this.b = iukVar;
        this.a = new ced();
    }

    @Override // defpackage.iua
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.iua
    public final void d() {
        if (this.h == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<iuf, Float>) g, 0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(333L);
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new iud(this));
        }
        this.d = true;
        this.c = 1;
        for (ity ityVar : this.k) {
            itf itfVar = this.b;
            ityVar.c = itfVar.c[0];
            ityVar.d = itfVar.g / 2;
        }
        this.h.start();
    }

    @Override // defpackage.iua
    public final void c() {
    }

    @Override // defpackage.iua
    public final void e() {
    }

    @Override // defpackage.iua
    public final void b(cni cniVar) {
    }
}
