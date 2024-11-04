package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cow extends cly {
    final /* synthetic */ ViewPager2 a;

    public cow(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.cly
    public final void c(int i) {
        if (i == 0) {
            this.a.g();
        }
    }

    @Override // defpackage.cly
    public final void e(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.b != i) {
            viewPager2.b = i;
            ((cpc) viewPager2.j).d();
        }
    }
}
