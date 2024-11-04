package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixd extends cly {
    private final WeakReference a;
    private int c = 0;
    private int b = 0;

    public ixd(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.cly
    public final void c(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.B = this.c;
        }
    }

    @Override // defpackage.cly
    public final void d(int i, float f, int i2) {
        boolean z;
        boolean z2;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            if (i3 == 2 && this.b != 1) {
                z = false;
            } else {
                z = true;
            }
            if (i3 == 2 && this.b == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            tabLayout.m(i, f, z, z2, false);
        }
    }

    @Override // defpackage.cly
    public final void e(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null && tabLayout.a() != i && i < tabLayout.b()) {
            int i2 = this.c;
            boolean z = true;
            if (i2 != 0 && (i2 != 2 || this.b != 0)) {
                z = false;
            }
            tabLayout.k(tabLayout.c(i), z);
        }
    }
}
