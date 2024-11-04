package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eol extends eny {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/devicedetails/SpotDeviceDetailsRemoveButtonFragment");
    public ebf af;
    public lqd b;
    public eoz c;
    public MaterialButton d;
    public ewg e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MaterialButton materialButton = (MaterialButton) layoutInflater.inflate(R.layout.device_details_remove_button_layout, viewGroup, false);
        this.d = materialButton;
        materialButton.setOnClickListener(new eph(this, 1));
        this.d.setText(R.string.spot_device_details_remove_device);
        return this.d;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.c.a().g(O(), new egv(this, 19));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        lqd g = eyf.g(A());
        this.b = g;
        this.c = eoz.b(this, g);
    }
}
