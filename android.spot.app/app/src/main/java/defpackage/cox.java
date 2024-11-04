package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cox extends cly {
    final /* synthetic */ ViewPager2 a;

    public cox(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.cly
    public final void e(int i) {
        this.a.clearFocus();
        if (this.a.hasFocus()) {
            this.a.e.requestFocus(2);
        }
    }
}
