package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bpd {
    static int a(AppOpsManager appOpsManager, String str, String str2) {
        int noteProxyOp;
        noteProxyOp = appOpsManager.noteProxyOp(str, str2);
        return noteProxyOp;
    }

    public static int b(AppOpsManager appOpsManager, String str, String str2) {
        int noteProxyOpNoThrow;
        noteProxyOpNoThrow = appOpsManager.noteProxyOpNoThrow(str, str2);
        return noteProxyOpNoThrow;
    }

    public static Object c(Context context, Class cls) {
        Object systemService;
        systemService = context.getSystemService((Class<Object>) cls);
        return systemService;
    }

    public static String d(String str) {
        String permissionToOp;
        permissionToOp = AppOpsManager.permissionToOp(str);
        return permissionToOp;
    }

    public static int e(Context context, String str) {
        String str2;
        int s;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            str2 = d(str);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int myUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager b = bpe.b(context);
                s = bpe.a(b, str2, Binder.getCallingUid(), packageName);
                if (s == 0) {
                    s = bpe.a(b, str2, myUid, bpe.c(context));
                }
            } else {
                s = bop.s(context, str2, packageName);
            }
        } else {
            s = bop.s(context, str2, packageName);
        }
        if (s == 0) {
            return 0;
        }
        return -2;
    }

    public static cqh f(bop bopVar, String str, Executor executor, mnw mnwVar) {
        executor.getClass();
        return new cqi(bei.d(new icd(executor, str, mnwVar, new cfn(cqh.b), 1)));
    }
}
