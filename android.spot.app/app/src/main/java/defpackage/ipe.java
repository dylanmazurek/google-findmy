package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipe {
    private static final boolean r;
    public final MaterialButton a;
    public ivl b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean o;
    public int q;
    private LayerDrawable s;
    public boolean n = false;
    public boolean p = true;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT <= 22) {
            z = true;
        } else {
            z = false;
        }
        r = z;
    }

    public ipe(MaterialButton materialButton, ivl ivlVar) {
        this.a = materialButton;
        this.b = ivlVar;
    }

    private final ivf f(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (ivf) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    private final ivf g() {
        return f(true);
    }

    public final ivf a() {
        return f(false);
    }

    public final ivw b() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.s.getNumberOfLayers() > 2) {
                return (ivw) this.s.getDrawable(2);
            }
            return (ivw) this.s.getDrawable(1);
        }
        return null;
    }

    public final void c() {
        this.n = true;
        this.a.h(this.j);
        this.a.i(this.i);
    }

    public final void d(ivl ivlVar) {
        this.b = ivlVar;
        if (r && !this.n) {
            MaterialButton materialButton = this.a;
            int paddingStart = materialButton.getPaddingStart();
            int paddingTop = materialButton.getPaddingTop();
            int paddingEnd = materialButton.getPaddingEnd();
            int paddingBottom = materialButton.getPaddingBottom();
            e();
            this.a.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (a() != null) {
            a().cy(ivlVar);
        }
        if (g() != null) {
            g().cy(ivlVar);
        }
        if (b() != null) {
            b().cy(ivlVar);
        }
    }

    public final void e() {
        ivf ivfVar = new ivf(this.b);
        ivfVar.I(this.a.getContext());
        bsc.g(ivfVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            bsc.h(ivfVar, mode);
        }
        MaterialButton materialButton = this.a;
        ivfVar.Q(this.h, this.k);
        ivf ivfVar2 = new ivf(this.b);
        ivfVar2.setTint(0);
        ivfVar2.P(this.h, 0);
        ivf ivfVar3 = new ivf(this.b);
        this.m = ivfVar3;
        bsc.f(ivfVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(iuv.b(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{ivfVar2, ivfVar}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.f(rippleDrawable);
        ivf a = a();
        if (a != null) {
            a.K(this.q);
            a.setState(this.a.getDrawableState());
        }
    }
}
