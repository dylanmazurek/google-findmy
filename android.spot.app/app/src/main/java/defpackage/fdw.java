package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdw extends fcl {
    protected String a;
    protected String b;
    protected boolean d;
    protected int e;
    public boolean f;
    public boolean g;

    public fdw(fcn fcnVar) {
        super(fcnVar);
    }

    @Override // defpackage.fcl
    protected final void a() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context f = f();
        try {
            applicationInfo = f.getPackageManager().getApplicationInfo(f.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            C("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            B("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
            fcn fcnVar = this.c;
            fdi bX = fma.bX(i, new gok(fcnVar), new fck(fcnVar));
            if (bX != null) {
                y("Loading global XML config values");
                String str = bX.a;
                if (str != null) {
                    this.b = str;
                    s("XML config - app name", str);
                }
                String str2 = bX.b;
                if (str2 != null) {
                    this.a = str2;
                    s("XML config - app version", str2);
                }
                String str3 = bX.c;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if ("verbose".equals(lowerCase)) {
                        i2 = 0;
                    } else if ("info".equals(lowerCase)) {
                        i2 = 1;
                    } else if ("warning".equals(lowerCase)) {
                        i2 = 2;
                    } else if ("error".equals(lowerCase)) {
                        i2 = 3;
                    } else {
                        i2 = -1;
                    }
                    if (i2 >= 0) {
                        z("XML config - log level", Integer.valueOf(i2));
                    }
                }
                int i3 = bX.d;
                if (i3 >= 0) {
                    this.e = i3;
                    this.d = true;
                    s("XML config - dispatch period (sec)", Integer.valueOf(i3));
                }
                int i4 = bX.e;
                if (i4 != -1) {
                    if (1 == i4) {
                        z = true;
                    }
                    this.g = z;
                    this.f = true;
                    s("XML config - dry run", Boolean.valueOf(z));
                }
            }
        }
    }

    public final String b() {
        H();
        return this.b;
    }

    public final String c() {
        H();
        return this.a;
    }
}
