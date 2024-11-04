package defpackage;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egr extends egt {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/devicedetails/AndroidDeviceSpecificHeaderFragment");

    public static final void a(egr egrVar) {
        try {
            egrVar.as(bsg.j());
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) a.g()).i(e).j("com/google/android/apps/adm/integrations/android/devicedetails/AndroidDeviceSpecificHeaderFragment", "onCreateView$lambda$1$lambda$0", 36, "AndroidDeviceSpecificHeaderFragment.kt")).r("Failed to start FMD Settings Activity");
        }
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_android_device_details_header, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.find_my_device_settings);
        if (F().getPackageManager().resolveActivity(bsg.j(), 0) != null) {
            findViewById.setOnClickListener(new efe(this, 3));
        } else {
            findViewById.setVisibility(8);
        }
        return inflate;
    }
}
