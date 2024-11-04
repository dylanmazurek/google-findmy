package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.adm.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kur extends ag {
    private kuq a;
    private ViewPager b;
    private ArrayList c;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.hostname_pager_fragment, viewGroup, false);
        this.c = this.m.getParcelableArrayList("configs_to_display");
        this.a = new kuq(this.A, this.c);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.pager);
        this.b = viewPager;
        kuq kuqVar = this.a;
        cob cobVar = viewPager.d;
        if (cobVar != null) {
            cobVar.f();
            viewPager.d.b(viewPager);
            for (int i = 0; i < viewPager.c.size(); i++) {
                coe coeVar = (coe) viewPager.c.get(i);
                cob cobVar2 = viewPager.d;
                int i2 = coeVar.b;
                cobVar2.c(coeVar.a);
            }
            viewPager.d.d();
            viewPager.c.clear();
            int i3 = 0;
            while (i3 < viewPager.getChildCount()) {
                if (!((cof) viewPager.getChildAt(i3).getLayoutParams()).a) {
                    viewPager.removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            viewPager.e = 0;
            viewPager.scrollTo(0, 0);
        }
        cob cobVar3 = viewPager.d;
        viewPager.d = kuqVar;
        viewPager.b = 0;
        if (viewPager.d != null) {
            if (viewPager.i == null) {
                viewPager.i = new coh(viewPager);
            }
            cob cobVar4 = viewPager.d;
            coh cohVar = viewPager.i;
            cobVar4.f();
            viewPager.j = false;
            boolean z = viewPager.m;
            viewPager.m = true;
            viewPager.b = viewPager.d.e();
            int i4 = viewPager.f;
            if (i4 >= 0) {
                cob cobVar5 = viewPager.d;
                Parcelable parcelable = viewPager.g;
                ClassLoader classLoader = viewPager.h;
                viewPager.h(i4, false, true);
                viewPager.f = -1;
                viewPager.g = null;
                viewPager.h = null;
            } else if (!z) {
                viewPager.e();
            } else {
                viewPager.requestLayout();
            }
        }
        List list = viewPager.o;
        if (list != null && !list.isEmpty()) {
            int size = viewPager.o.size();
            for (int i5 = 0; i5 < size; i5++) {
                iwt iwtVar = (iwt) viewPager.o.get(i5);
                TabLayout tabLayout = iwtVar.b;
                if (tabLayout.A == viewPager) {
                    tabLayout.l(kuqVar, iwtVar.a);
                }
            }
        }
        TabLayout tabLayout2 = (TabLayout) inflate.findViewById(R.id.sliding_tabs);
        if (tabLayout2.u != 0) {
            tabLayout2.u = 0;
            tabLayout2.g();
        }
        tabLayout2.n(this.b);
        return inflate;
    }
}
