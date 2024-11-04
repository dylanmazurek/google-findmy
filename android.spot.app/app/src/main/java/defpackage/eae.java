package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eae extends cnf {
    static final /* synthetic */ mqr[] x;
    private final mpv A;
    private final mpv B;
    private final dzb y;
    private final boolean z;

    static {
        mpg mpgVar = new mpg(eae.class, "initialYValue", "getInitialYValue()I", 0);
        int i = mpo.a;
        x = new mqr[]{mpgVar, new mpg(eae.class, "terminalYValue", "getTerminalYValue()I", 0)};
    }

    public eae(String str, String str2, dzb dzbVar, boolean z) {
        this.y = dzbVar;
        this.z = z;
        z(str);
        z(str2);
        this.d = new ced();
        this.A = new mpv();
        this.B = new mpv();
    }

    @Override // defpackage.cnf, defpackage.cmd
    public final void b(cmn cmnVar) {
        int i;
        cnf.J(cmnVar);
        View view = cmnVar.b;
        view.getClass();
        int f = bsd.f(view);
        MaterialCardView j = this.y.a.j();
        if (j != null) {
            i = j.getHeight();
        } else {
            i = 0;
        }
        int g = i - this.y.a.g();
        if (g >= 0) {
            f += g;
        }
        this.B.b(x[1], Integer.valueOf(f));
        if (this.z) {
            View view2 = cmnVar.b;
            view2.getClass();
            view2.setVisibility(4);
            fma.bR(i(), new bco(view2, 18));
        }
    }

    @Override // defpackage.cnf, defpackage.cmd
    public final void c(cmn cmnVar) {
        cnf.J(cmnVar);
        View view = cmnVar.b;
        view.getClass();
        int f = bsd.f(view);
        this.A.b(x[0], Integer.valueOf(f));
    }

    @Override // defpackage.cnf
    public final Animator f(View view, cmn cmnVar, cmn cmnVar2) {
        Property property = View.TRANSLATION_Y;
        mqr[] mqrVarArr = x;
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) property, ((Number) this.B.a(mqrVarArr[1])).intValue() - ((Number) this.A.a(mqrVarArr[0])).intValue());
    }
}
