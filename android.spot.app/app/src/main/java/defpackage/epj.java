package defpackage;

import android.content.Context;
import android.os.Build;
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
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epj extends epf {
    public eoz a;
    public View af;
    public ConstraintLayout ag;
    public Button ah;
    public pf ai;
    public pf aj;
    public BidiFormatter ak;
    public emm al;
    public ele am;
    public evo an;
    public emx ao;
    public dxf ap;
    public ebf aq;
    public dhx ar;
    private lqd as;
    private ImageView at;
    private TextView au;
    public boolean b;
    public String c;
    public CollapsingToolbarLayout d;
    public View e;

    public static epj d(lqd lqdVar) {
        epj epjVar = new epj();
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        epjVar.ak(bundle);
        return epjVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        lqc d = this.a.d();
        kyf kyfVar = this.am.a(this.a.d()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        int ab = hwx.ab(kylVar.g);
        if (ab == 0) {
            ab = 1;
        }
        this.b = hqk.e(ab);
        this.c = this.a.d().g;
        View inflate = layoutInflater.inflate(R.layout.fragment_erase_device, viewGroup, false);
        cs csVar = (cs) F();
        csVar.i((Toolbar) inflate.findViewById(R.id.remove_device_toolbar));
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        g.s();
        ch g2 = csVar.g();
        g2.getClass();
        g2.i(R.string.spot_remove_device_title);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) inflate.findViewById(R.id.remove_device_collapsing_toolbar);
        this.d = collapsingToolbarLayout;
        collapsingToolbarLayout.e(T(R.string.spot_remove_device_title));
        this.e = inflate.findViewById(R.id.device_info_panel);
        this.at = (ImageView) inflate.findViewById(R.id.device_icon);
        this.au = (TextView) inflate.findViewById(R.id.device_name);
        this.af = inflate.findViewById(R.id.progress_bar_view);
        this.ag = (ConstraintLayout) inflate.findViewById(R.id.explanation_panel);
        Button button = (Button) inflate.findViewById(R.id.remove_device_button);
        this.ah = button;
        button.setOnClickListener(new eph(this, 0));
        TextView textView = (TextView) this.ag.a(R.id.info_p3_text);
        if (true != this.b) {
            i = R.string.spot_remove_device_text_p3_accessory;
        } else {
            i = R.string.spot_remove_device_text_p3_tag;
        }
        textView.setText(i);
        eyf.l(d, this.at);
        this.au.setText(this.ak.unicodeWrap(this.c));
        return inflate;
    }

    public final void aF(boolean z) {
        String str = this.c;
        Bundle bundle = new Bundle();
        bundle.putString("DEVICE_NAME_KEY", str);
        bundle.putBoolean("IS_DEVICE_NOT_NEARBY", z);
        epa epaVar = new epa();
        epaVar.ak(bundle);
        q(epaVar);
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.a.a().g(O(), new egv(this, 20));
        ((cfk) this.ar.a).g(O(), new epy(this, 1));
    }

    public final void e(lnb lnbVar, boolean z) {
        dxf dxfVar = this.ap;
        ljh k = lmu.i.k();
        ljh k2 = lmt.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        lmt lmtVar = (lmt) k2.b;
        lmtVar.a |= 1;
        lmtVar.b = z;
        if (!k.b.y()) {
            k.t();
        }
        lmu lmuVar = (lmu) k.b;
        lmt lmtVar2 = (lmt) k2.q();
        lmtVar2.getClass();
        lmuVar.g = lmtVar2;
        lmuVar.a |= 32;
        dxfVar.c(lnbVar, jer.i((lmu) k.q()), this.as);
    }

    @Override // defpackage.epf, defpackage.ag
    public final void f(Context context) {
        super.f(context);
        F().c().b(this, new epi(this));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        lqd g = eyf.g(A());
        this.as = g;
        this.a = eoz.b(this, g);
        this.al.b(new exw() { // from class: epg
            @Override // defpackage.exw
            public final void a(boolean z) {
                epj epjVar = epj.this;
                if (z) {
                    if (epjVar.ao.k == 3) {
                        String str = epjVar.c;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("DEVICE_NAME_KEY", str);
                        eor eorVar = new eor();
                        eorVar.ak(bundle2);
                        epjVar.q(eorVar);
                        return;
                    }
                    epjVar.o(true);
                    return;
                }
                epjVar.e(lnb.ERASE_DEVICE_ABORTED_PERMISSIONS_DENIED, false);
                epjVar.aF(false);
            }
        });
        int i = 7;
        this.ai = this.ao.a(this, new dyd(this, i));
        this.aj = this.ao.b(this, new dyd(this, 8));
        G().Q("CONFIRMATION_DIALOG_REQUEST_KEY", this, new ehe(this, 4));
        G().Q("FAILED_TO_UNPROVISION_DIALOG_REQUEST_KEY", this, new ehe(this, 5));
        G().Q("ENABLE_BLUETOOTH_DIALOG_REQUEST_KEY", this, new ehe(this, 6));
        G().Q("ENABLE_LOCATION_DIALOG_REQUEST_KEY", this, new ehe(this, i));
    }

    public final void o(boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < 31 && this.ao.h() == 3) {
                String str = this.c;
                Bundle bundle = new Bundle();
                bundle.putString("DEVICE_NAME_KEY", str);
                eot eotVar = new eot();
                eotVar.ak(bundle);
                q(eotVar);
                return;
            }
            p(true);
            return;
        }
        e(lnb.ERASE_DEVICE_ABORTED_BLUETOOTH_DISABLED, false);
        aF(false);
    }

    public final void p(boolean z) {
        if (z) {
            eoz eozVar = this.a;
            eozVar.e();
            eozVar.c = false;
            eozVar.a.c(eozVar.b, false);
            return;
        }
        e(lnb.ERASE_DEVICE_ABORTED_LOCATION_DISABLED, false);
        aF(false);
    }

    public final void q(v vVar) {
        vVar.cs(G(), "REMOVE_DEVICE_DIALOG");
    }
}
