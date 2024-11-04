package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmh {
    private static final String a = "nmh";
    private static nmg b;

    private nmh() {
    }

    public static nmg a(Context context, nmd nmdVar) {
        nmg nmgVar;
        ServiceInfo serviceInfo;
        Bundle bundle;
        synchronized (nmh.class) {
            if (b == null) {
                boolean z = true;
                if (nmdVar != nmd.CRONET_SOURCE_PLATFORM && nmdVar != nmd.CRONET_SOURCE_PLAY_SERVICES) {
                    z = false;
                }
                try {
                    serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "android.net.http.MetaDataHolder"), 787072);
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo != null) {
                    bundle = serviceInfo.metaData;
                } else {
                    bundle = new Bundle();
                }
                if (bundle.getBoolean("android.net.http.EnableTelemetry", z) && Build.VERSION.SDK_INT >= 30) {
                    try {
                        b = new nnk();
                    } catch (Exception e) {
                        Log.e(a, "Exception creating an instance of CronetLoggerImpl", e);
                    }
                }
            }
            if (b == null) {
                b = new nnc();
            }
            nmgVar = b;
        }
        return nmgVar;
    }
}
