package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxj implements View.OnApplyWindowInsetsListener {
    final bxf a;
    private bya b;

    public bxj(View view, bxf bxfVar) {
        bya byaVar;
        bxs bxpVar;
        this.a = bxfVar;
        bya e = bwn.e(view);
        if (e != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                bxpVar = new bxr(e);
            } else if (Build.VERSION.SDK_INT >= 29) {
                bxpVar = new bxq(e);
            } else {
                bxpVar = new bxp(e);
            }
            byaVar = bxpVar.a();
        } else {
            byaVar = null;
        }
        this.b = byaVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = bya.n(windowInsets, view);
            return bxk.a(view, windowInsets);
        }
        bya n = bya.n(windowInsets, view);
        if (this.b == null) {
            this.b = bwn.e(view);
        }
        if (this.b == null) {
            this.b = n;
            return bxk.a(view, windowInsets);
        }
        bxf b = bxk.b(view);
        if (b != null && Objects.equals(b.a, windowInsets)) {
            return bxk.a(view, windowInsets);
        }
        bya byaVar = this.b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if (!n.f(i2).equals(byaVar.f(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return bxk.a(view, windowInsets);
        }
        bya byaVar2 = this.b;
        if ((i & 8) != 0) {
            if (n.f(8).e > byaVar2.f(8).e) {
                interpolator = bxk.a;
            } else {
                interpolator = bxk.b;
            }
        } else {
            interpolator = bxk.c;
        }
        lrs lrsVar = new lrs(i, interpolator, 160L);
        lrsVar.g(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(((bxn) lrsVar.a).i());
        brq f = n.f(i);
        brq f2 = byaVar2.f(i);
        bxe bxeVar = new bxe(brq.d(Math.min(f.b, f2.b), Math.min(f.c, f2.c), Math.min(f.d, f2.d), Math.min(f.e, f2.e)), brq.d(Math.max(f.b, f2.b), Math.max(f.c, f2.c), Math.max(f.d, f2.d), Math.max(f.e, f2.e)));
        bxk.e(view, lrsVar, windowInsets, false);
        duration.addUpdateListener(new bxg(lrsVar, n, byaVar2, i, view));
        duration.addListener(new bxh(lrsVar, view));
        bvm.b(view, new bxi(view, lrsVar, bxeVar, duration, 0));
        this.b = n;
        return bxk.a(view, windowInsets);
    }
}
