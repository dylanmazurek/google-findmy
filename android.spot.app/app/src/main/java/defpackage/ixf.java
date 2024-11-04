package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.adm.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixf {
    public final TabLayout a;
    public final ViewPager2 b;
    public lj c;
    public boolean d;
    public ixd e;
    public iwv f;
    public eu g;

    public ixf(TabLayout tabLayout, ViewPager2 viewPager2) {
        this.a = tabLayout;
        this.b = viewPager2;
    }

    public final void a() {
        int i;
        this.a.i();
        lj ljVar = this.c;
        if (ljVar != null) {
            int a = ljVar.a();
            for (int i2 = 0; i2 < a; i2++) {
                iwz d = this.a.d();
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = R.string.adm_device_picker_family_devices_tab;
                    } else {
                        throw new IllegalStateException(a.ae(i2, "Trying to render tab in non-existing position "));
                    }
                } else {
                    i = R.string.adm_device_picker_user_devices_tab;
                }
                TabLayout tabLayout = d.f;
                if (tabLayout != null) {
                    d.c(tabLayout.getResources().getText(i));
                    this.a.f(d, false);
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            if (a > 0) {
                int min = Math.min(this.b.b, this.a.b() - 1);
                if (min != this.a.a()) {
                    TabLayout tabLayout2 = this.a;
                    tabLayout2.j(tabLayout2.c(min));
                }
            }
        }
    }
}
