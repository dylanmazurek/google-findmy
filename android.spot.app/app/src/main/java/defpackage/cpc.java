package defpackage;

import android.R;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpc extends clv {
    public final /* synthetic */ ViewPager2 a;
    public eu b;
    private final byz c = new cpa(this, 1);
    private final byz d = new cpa(this, 0);

    public cpc(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.clv
    public final boolean b(int i) {
        if (i != 8192 && i != 4096) {
            return false;
        }
        return true;
    }

    public final void c(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.g) {
            viewPager2.f(i, true);
        }
    }

    public final void d() {
        int a;
        int i;
        ViewPager2 viewPager2 = this.a;
        int i2 = R.id.accessibilityActionPageLeft;
        bwn.n(viewPager2, R.id.accessibilityActionPageLeft);
        bwn.n(viewPager2, R.id.accessibilityActionPageRight);
        bwn.n(viewPager2, R.id.accessibilityActionPageUp);
        bwn.n(viewPager2, R.id.accessibilityActionPageDown);
        if (this.a.c() != null && (a = this.a.c().a()) != 0) {
            ViewPager2 viewPager22 = this.a;
            if (viewPager22.g) {
                int i3 = a - 1;
                if (viewPager22.a() == 0) {
                    boolean h = this.a.h();
                    if (true != h) {
                        i = R.id.accessibilityActionPageRight;
                    } else {
                        i = R.id.accessibilityActionPageLeft;
                    }
                    if (true == h) {
                        i2 = R.id.accessibilityActionPageRight;
                    }
                    if (this.a.b < i3) {
                        bwn.o(viewPager2, new byi(i), null, this.c);
                    }
                    if (this.a.b > 0) {
                        bwn.o(viewPager2, new byi(i2), null, this.d);
                        return;
                    }
                    return;
                }
                if (this.a.b < i3) {
                    bwn.o(viewPager2, new byi(R.id.accessibilityActionPageDown), null, this.c);
                }
                if (this.a.b > 0) {
                    bwn.o(viewPager2, new byi(R.id.accessibilityActionPageUp), null, this.d);
                }
            }
        }
    }
}
