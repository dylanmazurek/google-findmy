package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evu implements cem, evq {
    public final ag a;
    public BottomSheetBehavior b;
    public final hpd d;
    private final lqz e;
    private View f;
    private CoordinatorLayout g;
    private View h;
    private final jfe i;
    public boolean c = false;
    private final ion j = new evt(this);
    private final ecu k = new ecu(this, 2, null);

    public evu(ag agVar, lqz lqzVar, jfe jfeVar, hpd hpdVar) {
        this.a = agVar;
        this.e = lqzVar;
        this.i = jfeVar;
        this.d = hpdVar;
        agVar.ad.a(this);
    }

    private final be s() {
        return this.a.G();
    }

    @Override // defpackage.cem
    public final void cT(cfc cfcVar) {
        int i;
        ebf ebfVar = (ebf) this.e.a();
        bso.e().booleanValue();
        if (true != r()) {
            i = 0;
        } else {
            i = 8;
        }
        ebfVar.h(i);
        View view = this.f;
        if (view != null) {
            view.addOnLayoutChangeListener(this.k);
        }
    }

    @Override // defpackage.cem
    public final void e() {
        p(!r());
    }

    @Override // defpackage.cem
    public final void f() {
        ((ebf) this.e.a()).h(8);
        View view = this.f;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.k);
        }
    }

    @Override // defpackage.evq
    public final int g() {
        return (int) (fma.bw(this.a.F()) * 0.6d);
    }

    @Override // defpackage.evq
    public final int h() {
        return R.layout.adm_overview_fragment;
    }

    @Override // defpackage.evq
    public final BottomSheetBehavior i() {
        return this.b;
    }

    @Override // defpackage.evq
    public final MaterialCardView j() {
        View view = this.f;
        if (view != null) {
            return (MaterialCardView) view.findViewById(R.id.container_bottom_sheet_card);
        }
        return null;
    }

    @Override // defpackage.evq
    public final Closeable k() {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f = fma.bw(this.a.F());
            p(false);
            this.c = true;
        }
        return new Closeable() { // from class: evs
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                evu evuVar = evu.this;
                if (evuVar.a.au() && evuVar.b != null) {
                    evuVar.p(!evuVar.r());
                    evuVar.b.f = evuVar.g();
                    evuVar.c = false;
                }
            }
        };
    }

    @Override // defpackage.evq
    public final void l() {
        ebf ebfVar = (ebf) this.e.a();
        bso.e().booleanValue();
        ebfVar.h(0);
        ag f = s().f("map_overlay_fragment");
        if (f != null) {
            f fVar = new f(s());
            fVar.k(f);
            fVar.b();
        }
        View view = this.h;
        if (view != null) {
            view.setVisibility(8);
        }
        p(true);
    }

    @Override // defpackage.evq
    public final void m(ag agVar) {
        ((ebf) this.e.a()).h(8);
        f fVar = new f(s());
        fVar.x();
        fVar.v();
        fVar.t(R.id.map_overlay_fragment, agVar, "map_overlay_fragment");
        fVar.b();
        View view = this.h;
        if (view != null) {
            view.setVisibility(0);
        }
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.H(3);
            p(false);
        }
    }

    @Override // defpackage.evq
    public final void n(ag agVar) {
        f fVar = new f(s());
        fVar.w(R.id.bottom_sheet_fragment_container, agVar);
        fVar.r(null);
        fVar.h();
    }

    @Override // defpackage.evq
    public final void o() {
        MaterialButton materialButton = (MaterialButton) this.a.K().findViewById(R.id.back_button);
        materialButton.setVisibility(0);
        materialButton.setOnClickListener(new eub(this, 6));
        materialButton.b.setAutoMirrored(true);
        if (s().f("bottom_sheet_container") == null) {
            Object a = this.i.a();
            f fVar = new f(s());
            fVar.t(R.id.bottom_sheet_fragment_container, (ag) a, "bottom_sheet_container");
            fVar.b();
        }
        this.g = (CoordinatorLayout) this.a.K().findViewById(R.id.container_map_and_bottom_sheet);
        View findViewById = this.a.K().findViewById(R.id.container_bottom_sheet);
        this.f = findViewById;
        if (findViewById != null) {
            BottomSheetBehavior x = BottomSheetBehavior.x(findViewById);
            this.b = x;
            x.H(3);
            this.b.y(this.j);
        }
        this.h = this.a.K().findViewById(R.id.map_overlay_fragment);
        this.a.K().findViewById(R.id.floating_buttons_container).addOnLayoutChangeListener(new ecu(this, 3, null));
        ag agVar = this.a;
        bwb.n(agVar.K(), new eys(iqg.c(agVar.K(), R.attr.colorSurfaceContainerLow)));
    }

    public final void p(boolean z) {
        View findViewById;
        int i;
        if (this.b != null && this.a.ad.b.a(cew.RESUMED)) {
            this.b.x = z;
        }
        View view = this.a.P;
        if (view != null && (findViewById = view.findViewById(R.id.bottom_sheet_drag_handle)) != null) {
            if (true != z) {
                i = 4;
            } else {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }

    public final void q() {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior != null) {
            int i = bottomSheetBehavior.y;
            if (i == 4) {
                hpd hpdVar = this.d;
                bso.f().intValue();
                hpdVar.e(null, Integer.valueOf(this.b.v()));
            } else {
                if (i == 3) {
                    if (this.f != null) {
                        hpd hpdVar2 = this.d;
                        bso.f().intValue();
                        hpdVar2.e(null, Integer.valueOf(this.f.getHeight()));
                        return;
                    }
                    return;
                }
                if (i == 6 && this.g != null) {
                    hpd hpdVar3 = this.d;
                    bso.f().intValue();
                    hpdVar3.e(null, Integer.valueOf((int) (this.b.s * this.g.getHeight())));
                }
            }
        }
    }

    public final boolean r() {
        if (s().f("map_overlay_fragment") != null) {
            return true;
        }
        return false;
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
}
