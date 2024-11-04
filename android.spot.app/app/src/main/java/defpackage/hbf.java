package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbf extends mh {
    public final AccountParticle r;
    public final jer s;
    public final cfo t;
    public final jer u;
    public final hjp v;
    public Object w;

    public hbf(ViewGroup viewGroup, frx frxVar, gzf gzfVar, jer jerVar, final ham hamVar, int i, final hjp hjpVar, final hgw hgwVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_list_item, viewGroup, false));
        D(this.b, i, i);
        AccountParticle accountParticle = (AccountParticle) this.b.findViewById(R.id.account_list_item_particle);
        this.r = accountParticle;
        this.s = jerVar;
        this.u = hamVar.a;
        this.v = hjpVar;
        D(accountParticle, accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start), 0);
        accountParticle.i.r();
        accountParticle.i.g();
        accountParticle.i.s(gzfVar, frxVar);
        accountParticle.m = new nca(accountParticle, frxVar, hamVar);
        jer jerVar2 = hamVar.a;
        hac hacVar = null;
        if (jerVar2.g()) {
            jer jerVar3 = ((hao) jerVar2.c()).c;
            if (jerVar3.g()) {
                cfc cfcVar = ((hao) jerVar2.c()).a;
                hacVar = new hac(jis.q(new hey(accountParticle.getContext(), cfcVar, (han) jerVar3.c())), cfcVar);
            }
        }
        if (hacVar != null) {
            accountParticle.i.l(hacVar);
        }
        final ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(R.id.account_list_item_critical_alert_container);
        this.t = new cfo() { // from class: hbe
            @Override // defpackage.cfo
            public final void d(Object obj) {
                hbf hbfVar = hbf.this;
                if (hbfVar.w != null) {
                    jer jerVar4 = hbfVar.u;
                    if (jerVar4.g() && ((hao) jerVar4.c()).c.g()) {
                        ham hamVar2 = hamVar;
                        hjp hjpVar2 = hjpVar;
                        hgw hgwVar2 = hgwVar;
                        ViewGroup viewGroup3 = viewGroup2;
                        jer jerVar5 = ((hao) hbfVar.u.c()).c;
                        View view = hbfVar.b;
                        Object c = jerVar5.c();
                        Context context = view.getContext();
                        Object obj2 = hbfVar.w;
                        View view2 = hbfVar.b;
                        frx frxVar2 = hamVar2.b;
                        ((han) c).r(context, obj2, viewGroup3, hgwVar2, view2, hjpVar2, false);
                    }
                }
            }
        };
    }

    private static void D(View view, int i, int i2) {
        int[] iArr = bwn.a;
        view.setPaddingRelative(view.getPaddingStart() + i, view.getPaddingTop(), view.getPaddingEnd() + i2, view.getPaddingBottom());
    }
}
