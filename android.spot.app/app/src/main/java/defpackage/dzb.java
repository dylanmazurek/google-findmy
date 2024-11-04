package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzb extends dze {
    public evq a;
    public ewf b;
    public bso c;
    public ddg d;

    public static dzb a(lqd lqdVar) {
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        dzb dzbVar = new dzb();
        dzbVar.ak(bundle);
        return dzbVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.a.h(), viewGroup, false);
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.a.o();
        this.b.i().g(O(), new qk(this, 10));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [mko, java.lang.Object] */
    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        evq evuVar;
        int i;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        super.g(bundle);
        bso bsoVar = this.c;
        lqd g = eyf.g(((ag) bsoVar.c).A());
        Object obj = bsoVar.b;
        hiy hiyVar = new hiy(bsoVar, g, 1, null);
        if (ltr.a.a().f()) {
            bso bsoVar2 = (bso) obj;
            aj F = ((ag) bsoVar2.b).F();
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = F.getWindowManager().getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                i = bounds.right - bounds.left;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                F.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
            }
            if (i > ((ag) bsoVar2.b).z().getDimensionPixelSize(R.dimen.lanscape_layout_min_width)) {
                bso bsoVar3 = (bso) ((dhx) bsoVar2.c).a;
                evuVar = new evr((ag) ((lsi) bsoVar3.b).b, lsg.c(bsoVar3.c), hiyVar, (hpd) bsoVar3.a.a());
                this.a = evuVar;
            }
        }
        bso bsoVar4 = (bso) ((dhx) ((bso) obj).a).a;
        evuVar = new evu((ag) ((lsi) bsoVar4.b).b, lsg.c(bsoVar4.c), hiyVar, (hpd) bsoVar4.a.a());
        this.a = evuVar;
    }
}
