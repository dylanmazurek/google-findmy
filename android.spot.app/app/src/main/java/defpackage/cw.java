package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cw {
    static final cv a = new cv(new pt(1));
    public static final int b = -100;
    public static bsy c = null;
    public static bsy d = null;
    private static Boolean i = null;
    public static boolean e = false;
    public static final rz f = new rz();
    public static final Object g = new Object();
    public static final Object h = new Object();

    public static void i(cw cwVar) {
        synchronized (g) {
            ry ryVar = new ry(f);
            while (ryVar.hasNext()) {
                cw cwVar2 = (cw) ((WeakReference) ryVar.next()).get();
                if (cwVar2 == cwVar || cwVar2 == null) {
                    ryVar.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(Context context) {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ds.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i = false;
            }
        }
        return i.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract ch b();

    public abstract View c(int i2);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract void o();

    public abstract void p(int i2);
}
