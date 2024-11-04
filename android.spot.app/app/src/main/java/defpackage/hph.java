package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hph {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public hph(lrs lrsVar) {
        this.d = bop.t(false);
        this.h = mtj.a;
        this.e = bop.t(true);
        this.b = new cqk();
        Object obj = lrsVar.a;
        this.g = obj == null ? cpp.a : obj;
        this.c = new bet((byte[]) null, (byte[]) null);
        this.a = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.f = new bop(null);
    }

    public hph(Context context, jer jerVar, String str, mko mkoVar) {
        int i;
        this.b = context;
        this.h = mkoVar;
        this.c = context.getPackageName();
        ActivityManager activityManager = hoa.a;
        this.d = hoa.c(context.getPackageName(), hoa.b());
        if (jerVar.g()) {
        }
        this.e = str;
        PackageManager packageManager = context.getPackageManager();
        int i2 = 3;
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        if (Build.VERSION.SDK_INT >= 23 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            i = 5;
        }
        this.a = i;
        this.f = new ksr(context, (byte[]) null);
        this.g = hwx.H(new hnn(this, i2));
    }
}
