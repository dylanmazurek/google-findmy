package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzo extends eaa {
    public final boh a = new boh();
    public SwipeRefreshLayout af;
    public ViewPager2 ag;
    public dzx ah;
    public MaterialCardView ai;
    public ewf aj;
    public emz ak;
    public exa al;
    public dwo am;
    public dxf an;
    public cop ao;
    public dhx ap;
    public lqz b;
    public evo c;
    public ewq d;
    public ConstraintLayout e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object findViewById;
        boolean e = ltr.a.a().e();
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.adm_devicepicker_fragment, viewGroup, false);
        this.ai = (MaterialCardView) inflate.findViewById(R.id.suggested_action_card);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.device_picker_constraint_layout);
        this.e = constraintLayout;
        this.a.c(constraintLayout);
        this.ah = (dzx) new ddh((cgq) this).q(dzx.class);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.devices_swipe_refresh);
        this.af = swipeRefreshLayout;
        dzx dzxVar = this.ah;
        dzxVar.getClass();
        swipeRefreshLayout.j = new njz(dzxVar);
        swipeRefreshLayout.setEnabled(!e);
        View findViewById2 = inflate.findViewById(R.id.devices_drag_handle);
        if (true != e) {
            i = 8;
        }
        findViewById2.setVisibility(i);
        ((ViewStub) inflate.findViewById(R.id.device_picker_failure)).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: dzm
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                view.findViewById(R.id.try_again_button).setOnClickListener(new he(dzo.this, 8, null));
            }
        });
        if (!e) {
            duj dujVar = (duj) this.b.a();
            if (Build.VERSION.SDK_INT >= 28) {
                findViewById = bwg.b(inflate, R.id.toolbar);
            } else {
                findViewById = inflate.findViewById(R.id.toolbar);
                if (findViewById == null) {
                    throw new IllegalArgumentException("ID does not reference a View inside this View");
                }
            }
            MaterialToolbar materialToolbar = (MaterialToolbar) findViewById;
            materialToolbar.m(R.menu.toolbar_menu);
            MenuItem findItem = materialToolbar.f().findItem(R.id.selected_account_disc_item);
            cfc O = dujVar.b.O();
            findItem.setActionView(R.layout.selected_account_disc_toolbar);
            dujVar.a = (SelectedAccountDisc) findItem.getActionView().findViewById(R.id.selected_account_disc);
            O.N().a(dujVar);
        } else {
            inflate.findViewById(R.id.toolbar).setVisibility(8);
        }
        return inflate;
    }

    @Override // defpackage.ag
    public final void af() {
        Object obj;
        super.af();
        dwo dwoVar = this.am;
        if (lto.a.a().a() && !dwoVar.c) {
            ((jni) ((jni) dwo.a.d()).j("com/google/android/apps/adm/appupdate/AppUpdateHelperImpl", "maybeShowAppUpdateBottomSheet", 33, "AppUpdateHelperImpl.java")).r("Looking for updates.");
            kuv kuvVar = dwoVar.d;
            Object obj2 = kuvVar.a;
            Object obj3 = kuvVar.b;
            String packageName = ((Context) obj2).getPackageName();
            iym iymVar = (iym) obj3;
            int i = 1;
            if (iymVar.a == null) {
                iym.d.i("onError(%d)", -9);
                obj = fma.n(new iyp(-9));
            } else {
                bym bymVar = new bym((int[]) null);
                izc izcVar = iymVar.a;
                iyk iykVar = new iyk(iymVar, bymVar, packageName, bymVar);
                izcVar.c(new iyx(izcVar, iykVar.d, bymVar, iykVar));
                obj = bymVar.a;
            }
            ((fxs) obj).n(new kse(dwoVar, i));
        }
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.ah.a().g(O(), new qk(this, 11));
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.device_lists_tab);
        this.ag = (ViewPager2) view.findViewById(R.id.device_lists_pager);
        cop copVar = new cop(this);
        this.ao = copVar;
        ViewPager2 viewPager2 = this.ag;
        lj ljVar = viewPager2.e.l;
        clv clvVar = viewPager2.j;
        if (ljVar != null) {
            ljVar.r(((cpc) clvVar).b);
        }
        if (ljVar != null) {
            ljVar.r(viewPager2.i);
        }
        viewPager2.e.U(copVar);
        viewPager2.b = 0;
        viewPager2.d();
        cpc cpcVar = (cpc) viewPager2.j;
        cpcVar.d();
        copVar.q(cpcVar.b);
        copVar.q(viewPager2.i);
        ixf ixfVar = new ixf(tabLayout, this.ag);
        if (!ixfVar.d) {
            ixfVar.c = ixfVar.b.c();
            if (ixfVar.c != null) {
                ixfVar.d = true;
                ixfVar.e = new ixd(ixfVar.a);
                ixfVar.b.j(ixfVar.e);
                ixfVar.f = new ixe(ixfVar.b, 0);
                ixfVar.a.e(ixfVar.f);
                ixfVar.g = new ixc(ixfVar);
                ixfVar.c.q(ixfVar.g);
                ixfVar.a();
                ixfVar.a.p(ixfVar.b.b);
                tabLayout.e(new dzn(this));
                ((cfk) this.ap.a).g(O(), new qk(this, 12));
                this.al.h(4).g(O(), new qk(this, 13));
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle == null) {
            this.an.b(lnb.ACTION_DEVICES_PAGE_SHOWN, jdl.a);
        }
    }

    @Override // defpackage.ag
    public final void k() {
        super.k();
        this.aj.e(null);
        emz emzVar = this.ak;
        synchronized (emzVar.h) {
            if (emzVar.g) {
                return;
            }
            emzVar.g = true;
            emzVar.a();
            emzVar.c.execute(new dzw(emzVar, 9));
        }
    }

    @Override // defpackage.ag
    public final void l() {
        super.l();
        emz emzVar = this.ak;
        synchronized (emzVar.h) {
            emzVar.g = false;
            emzVar.b();
            emzVar.c.execute(new dzw(emzVar, 10));
        }
    }
}
