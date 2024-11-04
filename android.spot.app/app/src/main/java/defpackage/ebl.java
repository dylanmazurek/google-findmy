package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebl extends ebo implements dyf {
    public dyh a;
    public njz af;
    private hif ag;
    private int ah = 0;
    public evy b;
    public lqz c;
    public hid d;
    public hba e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_express_sign_in_auth, viewGroup, false);
        ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) inflate.findViewById(R.id.express_sign_in_layout);
        hio hioVar = new hio();
        this.ah = ((Integer) hioVar.e(y()).e(0)).intValue();
        hid hidVar = this.d;
        hik.a().a();
        hij a = hik.a();
        a.a = jer.i(new hnu(jis.q(y().getString(R.string.guest_sign_in))));
        a.b = jdl.a;
        a.c = jer.i(hioVar);
        expressSignInLayout.a(hidVar, new hig(new njz(this), a.a()));
        return inflate;
    }

    @Override // defpackage.ag
    public final void ab() {
        this.ad.c(this.e);
        super.ab();
    }

    @Override // defpackage.ag
    public final void ad() {
        this.a.f(this);
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        this.a.e(this);
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        bwb.n(view, new eys(this.ah));
        this.a.g(this);
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        String str;
        String str2;
        super.g(bundle);
        jer b = jer.h(this.b.b()).b(new dvh(10));
        if (b.g()) {
            hid hidVar = this.d;
            String str3 = (String) b.c();
            hif hifVar = new hif(hidVar);
            hifVar.c = str3;
            this.ag = hifVar;
            if (bundle != null) {
                str = bundle.getString(hif.a);
            } else {
                str = null;
            }
            if (str == null && (str2 = hifVar.c) != null) {
                str = str2;
            }
            hifVar.c = null;
            hifVar.b.a.a = str;
        }
        this.ad.a(this.e);
    }

    @Override // defpackage.dyf
    public final void i(njz njzVar) {
        this.af = njzVar;
    }

    @Override // defpackage.ag
    public final void j(Bundle bundle) {
        hif hifVar = this.ag;
        if (hifVar != null) {
            Object a = hifVar.b.b.a();
            if (a != null) {
                hhg hhgVar = hifVar.b.f;
                String str = hif.a;
                frx frxVar = hhgVar.c;
                bundle.putString(str, frx.aj(a));
                return;
            }
            bundle.remove(hif.a);
        }
    }
}
