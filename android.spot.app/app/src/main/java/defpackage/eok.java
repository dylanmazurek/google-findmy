package defpackage;

import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eok extends enx {
    public eod a;
    public MaterialButton b;
    public BidiFormatter c;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MaterialButton materialButton = (MaterialButton) layoutInflater.inflate(R.layout.device_details_remove_button_layout, viewGroup, false);
        this.b = materialButton;
        materialButton.setText(R.string.spot_device_details_relinquish_device);
        return this.b;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.a.a().g(O(), new egv(this, 18));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.a = eod.b(D(), eyf.g(A()));
    }
}
