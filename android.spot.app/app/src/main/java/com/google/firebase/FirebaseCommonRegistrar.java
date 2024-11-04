package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.hwx;
import defpackage.knh;
import defpackage.kno;
import defpackage.kns;
import defpackage.knt;
import defpackage.knu;
import defpackage.koc;
import defpackage.kon;
import defpackage.kox;
import defpackage.kqh;
import defpackage.kqi;
import defpackage.kqk;
import defpackage.kql;
import defpackage.ktg;
import defpackage.kth;
import defpackage.kti;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        knt b = knu.b(kti.class);
        final int i = 2;
        final int i2 = 0;
        b.b(new koc(ktg.class, 2, 0));
        b.c = new kox(12);
        arrayList.add(b.a());
        kon konVar = new kon(kno.class, Executor.class);
        final int i3 = 1;
        knt kntVar = new knt(kqh.class, kqk.class, kql.class);
        kntVar.b(new koc(Context.class, 1, 0));
        kntVar.b(new koc(knh.class, 1, 0));
        kntVar.b(new koc(kqi.class, 2, 0));
        kntVar.b(new koc(kti.class, 1, 1));
        kntVar.b(new koc(konVar, 1, 0));
        kntVar.c = new kns(konVar, 2);
        arrayList.add(kntVar.a());
        arrayList.add(hwx.an("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(hwx.an("fire-core", "21.0.0_1p"));
        arrayList.add(hwx.an("device-name", a(Build.PRODUCT)));
        arrayList.add(hwx.an("device-model", a(Build.DEVICE)));
        arrayList.add(hwx.an("device-brand", a(Build.BRAND)));
        arrayList.add(hwx.ao("android-target-sdk", new kth() { // from class: knj
            @Override // defpackage.kth
            public final String a(Object obj) {
                int i4;
                int i5 = i3;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (Build.VERSION.SDK_INT >= 23 && context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (Build.VERSION.SDK_INT < 26 || !context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                    i4 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i4);
                }
                return "";
            }
        }));
        arrayList.add(hwx.ao("android-min-sdk", new kth() { // from class: knj
            @Override // defpackage.kth
            public final String a(Object obj) {
                int i4;
                int i5 = i2;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (Build.VERSION.SDK_INT >= 23 && context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (Build.VERSION.SDK_INT < 26 || !context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                    i4 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i4);
                }
                return "";
            }
        }));
        arrayList.add(hwx.ao("android-platform", new kth() { // from class: knj
            @Override // defpackage.kth
            public final String a(Object obj) {
                int i4;
                int i5 = i;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (Build.VERSION.SDK_INT >= 23 && context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (Build.VERSION.SDK_INT < 26 || !context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                    i4 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i4);
                }
                return "";
            }
        }));
        final int i4 = 3;
        arrayList.add(hwx.ao("android-installer", new kth() { // from class: knj
            @Override // defpackage.kth
            public final String a(Object obj) {
                int i42;
                int i5 = i4;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            Context context = (Context) obj;
                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                            if (installerPackageName == null) {
                                return "";
                            }
                            return FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        Context context2 = (Context) obj;
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            return "tv";
                        }
                        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            return "watch";
                        }
                        if (Build.VERSION.SDK_INT >= 23 && context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            return "auto";
                        }
                        if (Build.VERSION.SDK_INT < 26 || !context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            return "";
                        }
                        return "embedded";
                    }
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    if (applicationInfo == null) {
                        return "";
                    }
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                    i42 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i42);
                }
                return "";
            }
        }));
        return arrayList;
    }
}
