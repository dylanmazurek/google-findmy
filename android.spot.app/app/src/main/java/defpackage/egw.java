package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egw extends egy {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/factoryreset/AndroidDeviceDetailsFactoryResetButtonFragment");
    public lqd b;
    public MaterialButton c;
    public ebf d;
    private eia e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MaterialButton materialButton = (MaterialButton) layoutInflater.inflate(R.layout.device_details_remove_button_layout, viewGroup, false);
        this.c = materialButton;
        materialButton.setOnClickListener(new efe(this, 5));
        return this.c;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.e.a().g(O(), new egv(this, 0));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.b = eyf.g(A());
        this.e = (eia) new ddh((cgq) D()).q(eia.class);
    }
}
