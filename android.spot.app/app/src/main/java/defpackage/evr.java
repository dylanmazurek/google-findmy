package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evr implements cem, evq {
    public final ag a;
    public ViewGroup b;
    public final hpd c;
    private final lqz d;
    private View e;
    private final jfe f;

    public evr(ag agVar, lqz lqzVar, jfe jfeVar, hpd hpdVar) {
        this.a = agVar;
        this.d = lqzVar;
        this.f = jfeVar;
        this.c = hpdVar;
        agVar.ad.a(this);
    }

    private final be p() {
        return this.a.G();
    }

    @Override // defpackage.cem
    public final void cT(cfc cfcVar) {
        int i;
        ebf ebfVar = (ebf) this.d.a();
        if (p().f("map_overlay_fragment") == null) {
            i = 0;
        } else {
            i = 8;
        }
        ebfVar.h(i);
    }

    @Override // defpackage.cem
    public final void f() {
        ((ebf) this.d.a()).h(8);
    }

    @Override // defpackage.evq
    public final int g() {
        return fma.bw(this.a.F());
    }

    @Override // defpackage.evq
    public final int h() {
        return R.layout.adm_overview_fragment_land;
    }

    @Override // defpackage.evq
    public final BottomSheetBehavior i() {
        return null;
    }

    @Override // defpackage.evq
    public final MaterialCardView j() {
        return null;
    }

    @Override // defpackage.evq
    public final Closeable k() {
        return new fqr(1);
    }

    @Override // defpackage.evq
    public final void l() {
        ((ebf) this.d.a()).h(0);
        ag f = p().f("map_overlay_fragment");
        if (f != null) {
            f fVar = new f(p());
            fVar.k(f);
            fVar.b();
        }
        View view = this.e;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.evq
    public final void m(ag agVar) {
        ((ebf) this.d.a()).h(8);
        f fVar = new f(p());
        fVar.x();
        fVar.v();
        fVar.t(R.id.map_overlay_fragment, agVar, "map_overlay_fragment");
        fVar.b();
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // defpackage.evq
    public final void n(ag agVar) {
        f fVar = new f(p());
        fVar.w(R.id.bottom_sheet_fragment_container, agVar);
        fVar.r(null);
        fVar.h();
    }

    @Override // defpackage.evq
    public final void o() {
        MaterialButton materialButton = (MaterialButton) this.a.K().findViewById(R.id.back_button);
        materialButton.setVisibility(0);
        materialButton.setOnClickListener(new eub(this, 5));
        materialButton.b.setAutoMirrored(true);
        if (p().f("bottom_sheet_container") == null) {
            Object a = this.f.a();
            f fVar = new f(p());
            fVar.t(R.id.bottom_sheet_fragment_container, (ag) a, "bottom_sheet_container");
            fVar.b();
        }
        this.e = this.a.K().findViewById(R.id.map_overlay_fragment);
        ViewGroup viewGroup = (ViewGroup) this.a.K().findViewById(R.id.floating_buttons_container);
        this.b = viewGroup;
        bvm.b(viewGroup, new eta(this, 5));
        ag agVar = this.a;
        bwb.n(agVar.K(), new eys(iqg.c(agVar.K(), R.attr.colorSurfaceContainerLow)));
    }

    @Override // defpackage.cem
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void e() {
    }
}
