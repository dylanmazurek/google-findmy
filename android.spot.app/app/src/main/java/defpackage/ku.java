package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ku {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
        int maxAvailableHeight;
        maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i, z);
        return maxAvailableHeight;
    }

    public static String b(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(R.string.fingerprint_error_user_canceled);
                    case 11:
                        return context.getString(R.string.fingerprint_error_no_fingerprints);
                    case 12:
                        return context.getString(R.string.fingerprint_error_hw_not_present);
                    default:
                        Log.e("BiometricUtils", a.ae(i, "Unknown error code: "));
                        return context.getString(R.string.default_error_msg);
                }
            }
            return context.getString(R.string.fingerprint_error_lockout);
        }
        return context.getString(R.string.fingerprint_error_hw_not_available);
    }

    public static /* synthetic */ int c(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public static final float d(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (f7 < 0.0f) {
            return -f7;
        }
        return f7;
    }

    public static final boolean e(double d, arz arzVar, arz arzVar2) {
        if (Math.abs(arzVar.a(d) - arzVar2.a(d)) <= 0.001d) {
            return true;
        }
        return false;
    }
}
