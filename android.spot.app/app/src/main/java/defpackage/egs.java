package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egs extends egu {
    public static final Intent a;

    static {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity").putExtra("open_fmdn", true);
        a = intent;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_android_device_information, viewGroup, false);
        inflate.findViewById(R.id.device_can_be_found_when_off_card).setOnClickListener(new efe(this, 4));
        return inflate;
    }
}
