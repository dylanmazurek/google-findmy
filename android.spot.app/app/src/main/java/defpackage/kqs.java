package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqs {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public kqs(Context context) {
        this.a = context;
    }

    private final PackageInfo e(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseInstanceId", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void f() {
        PackageInfo e = e(this.a.getPackageName());
        if (e != null) {
            this.b = Integer.toString(e.versionCode);
            this.c = e.versionName;
        }
    }

    public final synchronized int a() {
        PackageInfo e;
        if (this.d == 0 && (e = e("com.google.android.gms")) != null) {
            this.d = e.versionCode;
        }
        return this.d;
    }

    public final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!fma.w()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            i2 = 2;
            this.e = i2;
            return i2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (true == fma.w()) {
            i2 = 2;
        }
        this.e = i2;
        return i2;
    }

    public final synchronized String c() {
        if (this.b == null) {
            f();
        }
        return this.b;
    }

    public final synchronized String d() {
        if (this.c == null) {
            f();
        }
        return this.c;
    }
}
