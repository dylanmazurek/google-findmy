package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebz extends ebq {
    public hpd a;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_location_unavailable, viewGroup, false);
    }

    @Override // defpackage.ag
    public final void ad() {
        super.ad();
        aj E = E();
        E.getClass();
        E.getWindow().setStatusBarColor(0);
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        aj E = E();
        E.getClass();
        E.getWindow().setStatusBarColor(iqg.k(R.dimen.m3_sys_elevation_level1, y()));
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        Context x = x();
        x.getClass();
        view.setBackgroundColor(iqg.k(R.dimen.m3_sys_elevation_level1, x));
        mpp.q(bsv.c(O()), null, 0, new eau(this, (mmx) null, 5), 3);
    }
}
