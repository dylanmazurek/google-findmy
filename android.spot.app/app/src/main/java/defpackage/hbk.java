package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbk extends lj {
    public final jer a;
    public Object e;
    public jis g;
    public final frx h;
    private final gzf i;
    private final haw j;
    private final hjp k;
    private final ham l;
    private final hgw n;
    private final boolean o;
    private final int p;
    private final kqr r;
    private final List m = new ArrayList();
    private final frx s = new hbi(this);
    public boolean f = false;
    private final cfo q = new euc(this, 11);

    public hbk(hbh hbhVar, hbg hbgVar, hgw hgwVar, lnh lnhVar, hjp hjpVar, int i, ham hamVar, boolean z) {
        gzf gzfVar = hbhVar.a;
        gzfVar.getClass();
        this.i = gzfVar;
        frx frxVar = hbhVar.e;
        frxVar.getClass();
        this.h = frxVar;
        haw hawVar = hbhVar.b;
        hawVar.getClass();
        this.j = hawVar;
        this.a = hbhVar.d;
        this.k = hjpVar;
        this.l = hamVar;
        this.n = hgwVar;
        hiw hiwVar = hbhVar.c;
        hiwVar.getClass();
        lnhVar.getClass();
        this.r = new kqr(hawVar, hiwVar, lnhVar, hjpVar, new hgg(this, hbgVar, 1));
        this.p = i;
        this.o = z;
    }

    public static int b(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
        return dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start);
    }

    @Override // defpackage.lj
    public final int a() {
        return this.m.size();
    }

    public final void c() {
        if (this.f && this.o) {
            return;
        }
        ijs.c();
        ArrayList arrayList = new ArrayList(this.m);
        jis jisVar = this.g;
        jer jerVar = this.l.a;
        if (jerVar.g() && ((hao) jerVar.c()).c.g()) {
            jin jinVar = new jin();
            jin jinVar2 = new jin();
            int size = jisVar.size();
            for (int i = 0; i < size; i++) {
                Object obj = jisVar.get(i);
                if (((han) ((hao) this.l.a.c()).c.c()).a(obj) != null) {
                    jinVar.h(obj);
                } else {
                    jinVar2.h(obj);
                }
            }
            jin jinVar3 = new jin();
            jinVar3.j(jinVar.g());
            jinVar3.j(jinVar2.g());
            jisVar = jinVar3.g();
        }
        ArrayList arrayList2 = new ArrayList(jisVar);
        Object obj2 = this.e;
        if (obj2 != null) {
            arrayList2.remove(obj2);
        }
        ez a = fe.a(new hbj(arrayList, arrayList2));
        this.m.clear();
        this.m.addAll(arrayList2);
        a.a(new ew(this));
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        return new hbf(viewGroup, this.h, this.i, this.a, this.l, this.p, this.k, this.n);
    }

    @Override // defpackage.lj
    public final void j(RecyclerView recyclerView) {
        this.j.d(this.s);
        this.e = this.j.a();
        this.g = jis.o(this.j.b());
        jer jerVar = this.l.a;
        if (jerVar.g() && ((hao) jerVar.c()).c.g()) {
            jer jerVar2 = ((hao) this.l.a.c()).c;
            ham hamVar = this.l;
            ((cfk) jerVar2.c()).g(((hao) hamVar.a.c()).a, this.q);
        }
        c();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void k(mh mhVar, int i) {
        List list = this.m;
        hbf hbfVar = (hbf) mhVar;
        kqr kqrVar = this.r;
        Object obj = list.get(i);
        ecp ecpVar = new ecp(kqrVar, obj, 15, null);
        AccountParticle accountParticle = hbfVar.r;
        accountParticle.l = true;
        accountParticle.b(hbfVar.v);
        hbfVar.w = obj;
        hbfVar.r.m.i(obj, new hgj(hbfVar, 1));
        jer jerVar = hbfVar.s;
        hbfVar.r.setOnClickListener(ecpVar);
        hbfVar.r.j.setAlpha(1.0f);
        hbfVar.r.k.setAlpha(1.0f);
        AccountParticleDisc accountParticleDisc = hbfVar.r.i;
        accountParticleDisc.setAlpha(1.0f);
        accountParticleDisc.a.setColorFilter((ColorFilter) null);
        hbfVar.r.findViewById(R.id.og_account_deactivated_help_tooltip).setVisibility(8);
        jer jerVar2 = hbfVar.u;
        if (jerVar2.g() && ((hao) jerVar2.c()).c.g()) {
            ((cfk) ((hao) hbfVar.u.c()).c.c()).g(((hao) hbfVar.u.c()).a, hbfVar.t);
        }
    }

    @Override // defpackage.lj
    public final void l(RecyclerView recyclerView) {
        this.j.e(this.s);
        jer jerVar = this.l.a;
        if (jerVar.g() && ((hao) jerVar.c()).c.g()) {
            jer jerVar2 = ((hao) jerVar.c()).c;
            ((cfk) jerVar2.c()).j(this.q);
        }
        this.m.clear();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void n(mh mhVar) {
        hbf hbfVar = (hbf) mhVar;
        hbfVar.r.cU(hbfVar.v);
        hbfVar.r.l = false;
        jer jerVar = hbfVar.u;
        if (jerVar.g() && ((hao) jerVar.c()).c.g()) {
            ((cfk) ((hao) hbfVar.u.c()).c.c()).j(hbfVar.t);
        }
    }
}
