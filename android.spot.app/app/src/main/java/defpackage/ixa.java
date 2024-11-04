package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixa {
    public int a;
    public int b;
    public final Object c;

    public ixa(Context context) {
        this.b = 0;
        this.c = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = fme.b((Context) this.c).y("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    public final synchronized int b() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        Object obj = this.c;
        PackageManager packageManager = ((Context) obj).getPackageManager();
        if (((Context) fme.b((Context) obj).a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!fma.w()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.b = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.b = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == fma.w()) {
            i2 = 2;
        }
        this.b = i2;
        return i2;
    }

    public final vp c(Object obj, int i) {
        vp vpVar = new vp(obj, vi.b);
        ((se) this.c).d(i, vpVar);
        return vpVar;
    }

    public ixa() {
        this.b = 300;
        this.c = new se((byte[]) null);
    }

    public ixa(TabLayout tabLayout) {
        this.c = new WeakReference(tabLayout);
    }
}
