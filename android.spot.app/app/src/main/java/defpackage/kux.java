package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;
import com.google.frameworks.client.data.android.debug.HostnameOverrideView;
import com.google.frameworks.client.data.android.debug.ServiceOverrideView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kux extends mh {
    public final View r;

    public kux(View view, byte[] bArr) {
        super(view);
        this.r = (MaterialButton) view.findViewById(R.id.spot_category);
    }

    public kux(View view) {
        super(view);
        this.r = (TextView) view.findViewById(R.id.owner_name);
    }

    public kux(HostnameOverrideView hostnameOverrideView) {
        super(hostnameOverrideView);
        this.r = hostnameOverrideView;
    }

    public kux(ServiceOverrideView serviceOverrideView) {
        super(serviceOverrideView);
        this.r = serviceOverrideView;
    }
}
