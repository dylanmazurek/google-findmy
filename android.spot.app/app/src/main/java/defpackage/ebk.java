package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebk extends ebn {
    public elo af;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_app_update_bottom_sheet, viewGroup, false);
        inflate.findViewById(R.id.update_app_button).setOnClickListener(new he(this, 10, null));
        return inflate;
    }

    @Override // defpackage.iow, defpackage.dq, defpackage.v
    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        if (z().getConfiguration().orientation == 2) {
            ((iov) a).a().e = z().getDimensionPixelSize(R.dimen.app_update_bottom_sheet_max_width);
        }
        a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ebj
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BottomSheetBehavior x = BottomSheetBehavior.x(((iov) dialogInterface).findViewById(R.id.design_bottom_sheet));
                x.H(3);
                x.w = true;
            }
        });
        return a;
    }
}
