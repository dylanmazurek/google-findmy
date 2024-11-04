package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsg {
    public static int a(Object obj) {
        int resId;
        resId = fr$$ExternalSyntheticApiModelOutline0.m102m(obj).getResId();
        return resId;
    }

    public static int b(Object obj) {
        int type;
        type = fr$$ExternalSyntheticApiModelOutline0.m102m(obj).getType();
        return type;
    }

    public static Uri c(Object obj) {
        Uri uri;
        uri = fr$$ExternalSyntheticApiModelOutline0.m102m(obj).getUri();
        return uri;
    }

    public static String d(Object obj) {
        String resPackage;
        resPackage = fr$$ExternalSyntheticApiModelOutline0.m102m(obj).getResPackage();
        return resPackage;
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] f(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    public static jer g(eul eulVar) {
        if (!eulVar.a.equals(euk.NO_LOCATION_AVAILABLE) && !eulVar.a.equals(euk.LOCATION_FETCH_ERROR)) {
            return jdl.a;
        }
        return jer.i(new ebz());
    }

    public static void h(eho ehoVar, lqd lqdVar) {
        ehoVar.a(lqdVar);
    }

    public static final boolean i(lqd lqdVar) {
        if (lqdVar != null) {
            lqf b = lqf.b(lqdVar.c);
            if (b == null) {
                b = lqf.UNRECOGNIZED;
            }
            if (b == lqf.SUPERVISED_ANDROID_DEVICE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final Intent j() {
        String str;
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 31) {
            str = "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity";
        } else {
            str = "com.google.android.gms.mdm.settings.AdmSettingsActivity";
        }
        intent.setClassName("com.google.android.gms", str);
        return intent;
    }
}
