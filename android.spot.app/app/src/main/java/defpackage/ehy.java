package defpackage;

import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.view.DeviceDetailsFieldView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehy extends eic {
    public BidiFormatter a;
    public lqd af;
    public ImageView ag;
    public TextView ah;
    public TextView ai;
    public TextView aj;
    public TextView ak;
    public DeviceDetailsFieldView al;
    public dxf am;
    public dhx an;
    public lqz b;
    public Map c;
    public evo d;
    public eia e;

    public static ehy a(lqd lqdVar) {
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        ehy ehyVar = new ehy();
        ehyVar.ak(bundle);
        return ehyVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_details, viewGroup, false);
        this.ag = (ImageView) inflate.findViewById(R.id.device_details_device_icon);
        this.ah = (TextView) inflate.findViewById(R.id.device_details_device_name_title);
        this.ai = (TextView) inflate.findViewById(R.id.device_details_model);
        this.aj = (TextView) inflate.findViewById(R.id.device_details_imei);
        this.ak = (TextView) inflate.findViewById(R.id.device_details_activation_time);
        this.al = (DeviceDetailsFieldView) inflate.findViewById(R.id.device_name_field);
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.device_details_toolbar);
        cs csVar = (cs) F();
        csVar.i(materialToolbar);
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        g.s();
        ch g2 = csVar.g();
        g2.getClass();
        g2.i(R.string.device_details_headline);
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        Map map = this.c;
        lqf b = lqf.b(this.af.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        ehz ehzVar = (ehz) map.get(b);
        if (ehzVar != null) {
            jer c = ehzVar.c(this.af);
            jer d = ehzVar.d(this.af);
            jer b2 = ehzVar.b(this.af);
            jer a = ehzVar.a(this.af);
            if (c.g() || d.g() || b2.g() || a.g()) {
                f fVar = new f(G());
                if (c.g()) {
                    fVar.w(R.id.device_specific_header_fragment, (ag) c.c());
                }
                if (d.g()) {
                    fVar.w(R.id.device_specific_information_fragment, (ag) d.c());
                }
                if (b2.g()) {
                    fVar.w(R.id.device_specific_details_fragment, (ag) b2.c());
                }
                if (a.g()) {
                    K().findViewById(R.id.bottom_section_divider).setVisibility(0);
                    fVar.w(R.id.bottom_section_fragment, (ag) a.c());
                }
                fVar.b();
            }
        }
        ((cfk) this.an.a).g(O(), new egv(this, 5));
        this.e.a().g(O(), new egv(this, 6));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.af = (lqd) eyf.d(A()).d(new eft(2));
        this.e = (eia) new ddh((cgq) this).q(eia.class);
    }
}
