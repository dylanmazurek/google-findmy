package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcu extends fcl {
    private final fbs a;

    public fcu(fcn fcnVar) {
        super(fcnVar);
        this.a = new fbs();
    }

    @Override // defpackage.fcl
    protected final void a() {
        fbm h = h();
        if (h.e == null) {
            synchronized (h) {
                if (h.e == null) {
                    fbs fbsVar = new fbs();
                    PackageManager packageManager = h.b.getPackageManager();
                    String packageName = h.b.getPackageName();
                    fbsVar.c = packageName;
                    fbsVar.d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(h.b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("GAv4", a.ao(packageName, "Error retrieving package info: appName set to "));
                    }
                    fbsVar.a = packageName;
                    fbsVar.b = str;
                    h.e = fbsVar;
                }
            }
        }
        h.e.c(this.a);
        fdw p = p();
        String b = p.b();
        if (b != null) {
            this.a.a = b;
        }
        String c = p.c();
        if (c != null) {
            this.a.b = c;
        }
    }

    public final fbs b() {
        H();
        return this.a;
    }
}
