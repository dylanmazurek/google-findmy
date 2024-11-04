package defpackage;

import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eud extends eua {
    public BidiFormatter a;
    public TextView af;
    public TextView ag;
    public MaterialButton ah;
    public maf ai;
    public dhx aj;
    private lqd ak;
    public evo b;
    public ele c;
    public euf d;
    public ImageView e;

    public static eud d(lqd lqdVar) {
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        eud eudVar = new eud();
        eudVar.ak(bundle);
        return eudVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sharing_invitation_explanation, viewGroup, false);
        this.e = (ImageView) inflate.findViewById(R.id.device_icon);
        this.af = (TextView) inflate.findViewById(R.id.device_title);
        this.ag = (TextView) inflate.findViewById(R.id.device_manufacturer);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.continue_button);
        this.ah = materialButton;
        materialButton.setOnClickListener(new eub(this, 0));
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.sharing_invitation_toolbar);
        cs csVar = (cs) F();
        csVar.i(materialToolbar);
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        g.s();
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.sharing_invitation_scroll_view);
        euf eufVar = this.d;
        eufVar.getClass();
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new exo(nestedScrollView, new eta(eufVar, 3)));
        euf eufVar2 = this.d;
        eufVar2.b();
        eufVar2.c.g(O(), new euc(this, 1));
        ((cfk) this.aj.a).g(O(), new euc(this, 0));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.ak = eyf.g(A());
        this.ai.e(new etg(this, 2));
        lqd lqdVar = this.ak;
        euf eufVar = (euf) new ddh((cgq) this).q(euf.class);
        if (eufVar.d == null) {
            hwx.V(true, "ViewModel is already initialized");
            eufVar.d = lqdVar;
        }
        hwx.S(eufVar.d.equals(lqdVar), "The provided DeviceIdentifier %s is different than the one the ViewModel was first initialized with, %s", lqdVar, eufVar.d);
        this.d = eufVar;
    }
}
