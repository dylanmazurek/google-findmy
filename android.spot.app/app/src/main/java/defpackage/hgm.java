package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgm extends eu {
    final /* synthetic */ hcy a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ hgp c;

    public hgm(hgp hgpVar, hcy hcyVar, RecyclerView recyclerView) {
        this.a = hcyVar;
        this.b = recyclerView;
        this.c = hgpVar;
    }

    @Override // defpackage.eu
    public final void d() {
        l();
    }

    @Override // defpackage.eu
    public final void e(int i, int i2) {
        l();
    }

    @Override // defpackage.eu
    public final void f(int i, int i2) {
        l();
    }

    public final void l() {
        int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.og_account_menu_top_cards_top_spacing);
        hcy hcyVar = this.a;
        imr imrVar = hcyVar.e;
        if (imrVar.a != 0) {
            jer b = hcyVar.b(((Integer) imrVar.e(0)).intValue());
            if (b.g()) {
                if (((hdg) b.c()).equals(hdg.ALWAYS_HIDE_DIVIDER_CARD)) {
                    dimensionPixelSize = 0;
                }
            }
        }
        this.b.setPadding(0, dimensionPixelSize, 0, 0);
    }
}
