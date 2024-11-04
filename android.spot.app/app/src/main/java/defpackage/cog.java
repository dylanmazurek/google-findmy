package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cog extends buk {
    final /* synthetic */ ViewPager a;

    public cog(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        cob cobVar = this.a.d;
        if (cobVar != null && cobVar.e() > 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.buk
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        cob cobVar;
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() == 4096 && (cobVar = this.a.d) != null) {
            accessibilityEvent.setItemCount(cobVar.e());
            accessibilityEvent.setFromIndex(this.a.e);
            accessibilityEvent.setToIndex(this.a.e);
        }
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        super.c(view, bynVar);
        bynVar.t("androidx.viewpager.widget.ViewPager");
        bynVar.P(j());
        if (this.a.canScrollHorizontally(1)) {
            bynVar.i(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            bynVar.i(8192);
        }
    }

    @Override // defpackage.buk
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.a.canScrollHorizontally(-1)) {
                return false;
            }
            this.a.g(r2.e - 1);
            return true;
        }
        if (!this.a.canScrollHorizontally(1)) {
            return false;
        }
        ViewPager viewPager = this.a;
        viewPager.g(viewPager.e + 1);
        return true;
    }
}
