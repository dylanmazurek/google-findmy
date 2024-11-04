package defpackage;

import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ita implements ise {
    final /* synthetic */ NavigationRailView a;

    public ita(NavigationRailView navigationRailView) {
        this.a = navigationRailView;
    }

    @Override // defpackage.ise
    public final void a(View view, bya byaVar, isf isfVar) {
        int i;
        brq f = byaVar.f(7);
        NavigationRailView navigationRailView = this.a;
        if (navigationRailView.e(navigationRailView.c)) {
            isfVar.b += f.c;
        }
        NavigationRailView navigationRailView2 = this.a;
        if (navigationRailView2.e(navigationRailView2.d)) {
            isfVar.d += f.e;
        }
        NavigationRailView navigationRailView3 = this.a;
        if (navigationRailView3.e(navigationRailView3.e)) {
            int i2 = isfVar.a;
            if (hwx.o(view)) {
                i = f.d;
            } else {
                i = f.b;
            }
            isfVar.a = i2 + i;
        }
        isfVar.a(view);
    }
}
