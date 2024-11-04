package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzl extends dzz {
    public dzi a;
    public boolean b;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.adm_devicepicker_device_list_fragment, viewGroup, false);
    }

    public final dzi a() {
        dzi dziVar = this.a;
        if (dziVar != null) {
            return dziVar;
        }
        mpd.b("devicePickerAdapter");
        return null;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        ((RecyclerView) view.findViewById(R.id.devices)).U(a());
        mpp.q(bsv.c(O()), null, 0, new dzk(this, (dzx) new ddh((cgq) D()).q(dzx.class), (mmx) null, 0), 3);
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.b = A().getBoolean("DISPLAY_ONLY_SUPERVISED_ACCOUNTS_ARG");
    }
}
