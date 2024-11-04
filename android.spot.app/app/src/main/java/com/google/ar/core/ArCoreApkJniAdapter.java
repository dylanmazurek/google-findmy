package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import defpackage.jcg;
import defpackage.jch;
import defpackage.jci;
import defpackage.jcz;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ArCoreApkJniAdapter {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(jcz.ERROR_INVALID_ARGUMENT.G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(jcz.ERROR_RESOURCE_EXHAUSTED.G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(jcz.UNAVAILABLE_ARCORE_NOT_INSTALLED.G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(jcz.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(jcz.UNAVAILABLE_APK_TOO_OLD.G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(jcz.UNAVAILABLE_SDK_TOO_OLD.G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(jcz.UNAVAILABLE_USER_DECLINED_INSTALLATION.G));
    }

    private ArCoreApkJniAdapter() {
    }

    private static int a(Throwable th) {
        Log.e("ARCore-ArCoreApkJniAdap", "Exception details:", th);
        Map map = b;
        Class<?> cls = th.getClass();
        if (map.containsKey(cls)) {
            return ((Integer) map.get(cls)).intValue();
        }
        return jcz.ERROR_FATAL.G;
    }

    static int checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        try {
            ArCoreApk arCoreApk = ArCoreApk.getInstance();
            synchronized (arCoreApk) {
                ArCoreApk.Availability availability2 = ((jci) arCoreApk).f;
                if ((availability2 == null || availability2.isUnknown()) && !((jci) arCoreApk).g) {
                    ((jci) arCoreApk).g = true;
                    ((jci) arCoreApk).b(context, new jcg((jci) arCoreApk));
                }
                availability = ((jci) arCoreApk).f;
                if (availability != null) {
                    if (!availability.isUnsupported()) {
                        ((jci) arCoreApk).f = null;
                    }
                } else if (((jci) arCoreApk).g) {
                    availability = ArCoreApk.Availability.UNKNOWN_CHECKING;
                } else {
                    Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                    availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                }
            }
            return availability.nativeCode;
        } catch (Throwable th) {
            a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    static void checkAvailabilityAsync(Context context, final long j, final long j2) {
        final Consumer consumer = new Consumer() { // from class: com.google.ar.core.ArCoreApkJniAdapter$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                long j3 = j;
                long j4 = j2;
                int i = ArCoreApkJniAdapter.a;
                ArCoreApkJniAdapter.nativeInvokeAvailabilityCallback(j3, j4, ((ArCoreApk.Availability) obj).nativeCode);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        try {
            ArCoreApk arCoreApk = ArCoreApk.getInstance();
            ((jci) arCoreApk).b(context, new jch((jci) arCoreApk, consumer));
        } catch (Throwable th) {
            a(th);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.ar.core.ArCoreApkJniAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Consumer consumer2 = Consumer.this;
                    int i = ArCoreApkJniAdapter.a;
                    consumer2.accept(ArCoreApk.Availability.UNKNOWN_ERROR);
                }
            });
        }
    }

    public static native void nativeInvokeAvailabilityCallback(long j, long j2, int i);

    static int requestInstall(Activity activity, boolean z, int[] iArr) {
        ArCoreApk.InstallBehavior installBehavior;
        ArCoreApk.UserMessageType userMessageType;
        try {
            ArCoreApk arCoreApk = ArCoreApk.getInstance();
            if (((jci) arCoreApk).e(activity)) {
                installBehavior = ArCoreApk.InstallBehavior.REQUIRED;
            } else {
                installBehavior = ArCoreApk.InstallBehavior.OPTIONAL;
            }
            if (((jci) arCoreApk).e(activity)) {
                userMessageType = ArCoreApk.UserMessageType.APPLICATION;
            } else {
                userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
            }
            iArr[0] = arCoreApk.requestInstall(activity, z, installBehavior, userMessageType).nativeCode;
            return jcz.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }

    static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return jcz.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }
}
