package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jde {
    private static jde e;
    public Object a;
    public final Object b;
    public Object c;
    public Object d;

    public jde() {
        this.a = null;
        this.b = new HashMap();
        this.c = null;
        this.d = null;
    }

    public static synchronized jde c() {
        jde jdeVar;
        synchronized (jde.class) {
            if (e == null) {
                e = new jde(null);
            }
            jdeVar = e;
        }
        return jdeVar;
    }

    public final synchronized String a(Context context, Intent intent) {
        Object obj = this.d;
        if (obj != null) {
            return (String) obj;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    this.d = String.valueOf(context.getPackageName()).concat(String.valueOf(serviceInfo.name));
                } else {
                    this.d = serviceInfo.name;
                }
                return (String) this.d;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public final boolean b(Context context) {
        boolean z;
        if (this.a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.a = Boolean.valueOf(z);
        }
        ((Boolean) this.a).booleanValue();
        return ((Boolean) this.a).booleanValue();
    }

    private jde(byte[] bArr) {
        this.d = null;
        this.a = null;
        this.c = null;
        this.b = new ArrayDeque();
    }
}
