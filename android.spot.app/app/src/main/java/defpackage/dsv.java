package defpackage;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dsv extends dsy {
    private Animatable c;

    public dsv(ImageView imageView) {
        super(imageView);
    }

    private final void n(Object obj) {
        a(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.c = animatable;
            animatable.start();
            return;
        }
        this.c = null;
    }

    protected abstract void a(Object obj);

    public final void b() {
        ((ImageView) this.a).setImageDrawable(null);
    }

    @Override // defpackage.dsw
    public final void g(Object obj) {
        n(obj);
    }

    @Override // defpackage.dsq, defpackage.drk
    public final void i() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.dsq, defpackage.drk
    public final void j() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.dsq, defpackage.dsw
    public final void k() {
        this.b.f();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        n(null);
        b();
    }

    @Override // defpackage.dsq, defpackage.dsw
    public final void l() {
        n(null);
        b();
    }

    @Override // defpackage.dsq, defpackage.dsw
    public final void m() {
        n(null);
        b();
    }
}
