package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.card.MaterialCardView;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqf extends eqd {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/markaslost/MarkAsLostFragment");
    private TextView aA;
    private TextView aB;
    private jer aC = jdl.a;
    public CollapsingToolbarLayout af;
    public ConstraintLayout ag;
    public View ah;
    public Button ai;
    public Button aj;
    public MaterialCardView ak;
    public TextView al;
    public View am;
    public View an;
    public ebf ao;
    public maf ap;
    public dhx aq;
    private lqd ar;
    private ImageView as;
    private TextView at;
    private ImageView au;
    private TextView av;
    private TextView aw;
    private ImageView ax;
    private TextView ay;
    private ImageView az;
    public eqo b;
    public boolean c;
    public BidiFormatter d;
    public evo e;

    public static eqf d(lqd lqdVar) {
        eqf eqfVar = new eqf();
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        eqfVar.ak(bundle);
        return eqfVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mark_as_lost, viewGroup, false);
        cs csVar = (cs) F();
        csVar.i((Toolbar) inflate.findViewById(R.id.mark_as_lost_toolbar));
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        ch g2 = csVar.g();
        g2.getClass();
        g2.s();
        this.af = (CollapsingToolbarLayout) inflate.findViewById(R.id.mark_as_lost_collapsing_toolbar);
        this.ah = inflate.findViewById(R.id.device_info_panel);
        this.az = (ImageView) inflate.findViewById(R.id.device_icon);
        this.aA = (TextView) inflate.findViewById(R.id.device_name);
        this.an = inflate.findViewById(R.id.progress_bar_view);
        this.aB = (TextView) inflate.findViewById(R.id.progress_bar_text);
        MaterialCardView materialCardView = (MaterialCardView) inflate.findViewById(R.id.add_contact_info_card);
        this.ak = materialCardView;
        ((ImageView) materialCardView.findViewById(R.id.add_contact_info_button_arrow)).getDrawable().setAutoMirrored(true);
        this.al = (TextView) inflate.findViewById(R.id.add_contact_info_title);
        this.am = inflate.findViewById(R.id.optional_features_title);
        this.as = (ImageView) inflate.findViewById(R.id.info_p1_icon);
        this.at = (TextView) inflate.findViewById(R.id.info_p1_text);
        this.au = (ImageView) inflate.findViewById(R.id.info_p2_icon);
        this.av = (TextView) inflate.findViewById(R.id.info_p2_text);
        this.aw = (TextView) inflate.findViewById(R.id.info_p2_optional_subtext);
        this.ax = (ImageView) inflate.findViewById(R.id.info_p3_icon);
        this.ay = (TextView) inflate.findViewById(R.id.info_p3_text);
        this.ag = (ConstraintLayout) inflate.findViewById(R.id.info_text_panel);
        Button button = (Button) inflate.findViewById(R.id.mark_as_lost_button);
        this.ai = button;
        button.setOnClickListener(new eph(this, 2));
        Button button2 = (Button) inflate.findViewById(R.id.mark_as_found_button);
        this.aj = button2;
        int i = 3;
        button2.setOnClickListener(new eph(this, i));
        lqc d = this.b.d();
        eyf.l(d, this.az);
        this.aA.setText(this.d.unicodeWrap(d.g));
        ((cfk) this.aq.a).g(this, new epy(this, i));
        return inflate;
    }

    public final void aF(boolean z) {
        int i;
        this.as.setImageResource(R.drawable.gs_notifications_active_vd_theme_24);
        if (true != z) {
            i = R.string.youll_be_notified_text;
        } else {
            i = R.string.lost_reporter_will_be_notified_text;
        }
        this.at.setText(i);
        this.au.setVisibility(8);
        this.av.setVisibility(8);
        this.aw.setVisibility(8);
        this.ax.setVisibility(8);
        this.ay.setVisibility(8);
    }

    public final void aG(int i) {
        exu a2 = evj.a();
        a2.f(-2);
        jer i2 = jer.i(new evh(i, a2.e()));
        this.aC = i2;
        aH(i2);
    }

    public final void aH(jer jerVar) {
        if (jerVar.g()) {
            this.e.b(this, (evh) jerVar.c(), R.id.mark_as_lost_buttons_barrier);
        }
    }

    public final void aI(int i) {
        this.af.e("");
        this.aB.setText(i);
        this.an.setVisibility(0);
        this.ah.setVisibility(8);
        this.ag.setVisibility(8);
        this.ak.setVisibility(8);
        this.am.setVisibility(8);
        this.ai.setVisibility(8);
        this.aj.setVisibility(8);
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        eqo eqoVar = this.b;
        hwx.V(eqoVar.a.g(), "'initialize() should be called before using this object.");
        ((cfk) eqoVar.b.c()).g(O(), new epy(this, 4));
    }

    public final void e() {
        ((AppBarLayout) K().findViewById(R.id.mark_as_lost_app_bar_layout)).j(true, true);
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.ar = eyf.g(A());
        boolean z = true;
        this.ap.e(new etg(this, 1));
        H().Q("CONTACT_INFO_FRAGMENT_RESULT", this, new ehe(this, 10));
        eqo eqoVar = (eqo) new ddh((cgq) this).q(eqo.class);
        this.b = eqoVar;
        lqd lqdVar = this.ar;
        if (eqoVar.a.g()) {
            hwx.V(((ljn) eqoVar.a.c()).equals(lqdVar), "This class can only initialized for one device identifier");
        } else {
            eqoVar.a = jer.i(lqdVar);
            eqk eqkVar = eqoVar.d;
            hwx.U(eqkVar.a(lqdVar).g());
            cfk cfkVar = (cfk) Map.EL.computeIfAbsent(eqkVar.f, lqdVar, new eff(16));
            eqk eqkVar2 = eqoVar.d;
            cfk cfkVar2 = (cfk) Map.EL.computeIfAbsent(eqkVar2.g, lqdVar, new eff(15));
            eqoVar.b = jer.i(new cfm());
            ((cfm) eqoVar.b.c()).o(cfkVar, new eqn(eqoVar, cfkVar2, 0));
            ((cfm) eqoVar.b.c()).o(cfkVar2, new eqn(eqoVar, cfkVar, 2));
        }
        if (eyf.i(this.b.d()) != lqf.ANDROID_DEVICE) {
            z = false;
        }
        this.c = z;
    }

    public final void o() {
        if (this.aC.g()) {
            ((evh) this.aC.c()).a();
            this.aC = jdl.a;
        }
    }

    public final void p(kxz kxzVar, boolean z) {
        eqa a2 = eqa.a(this.ar, kxzVar, !this.c, z);
        ebf ebfVar = this.ao;
        ebb a3 = ebc.a();
        a3.b(true);
        ebfVar.k(a2, a3.a());
    }

    public final void q() {
        this.as.setImageResource(R.drawable.gs_notifications_active_vd_theme_24);
        this.at.setText(R.string.youll_be_notified_text);
        this.au.setImageResource(R.drawable.gs_lock_vd_theme_24);
        this.av.setText(R.string.mark_as_lost_android_text_p2);
        this.aw.setVisibility(0);
        this.aw.setText(R.string.mark_as_lost_android_subtext_p2);
        this.ax.setImageResource(R.drawable.gs_account_circle_vd_theme_24);
        this.ay.setText(R.string.mark_as_lost_android_text_p3);
    }
}
