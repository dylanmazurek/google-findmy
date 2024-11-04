package defpackage;

import android.graphics.Matrix;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ja {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface a(Typeface typeface, int i, boolean z) {
        Typeface create;
        create = Typeface.create(typeface, i, z);
        return create;
    }

    public static boolean b(int i) {
        if ((i & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(int i) {
        if (i == 255) {
            return true;
        }
        if (i != 32768) {
            if (i != 32783) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 28 || Build.VERSION.SDK_INT > 29) {
                return true;
            }
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean d(int i) {
        if ((i & 255) == 255) {
            return true;
        }
        return false;
    }

    public static final int e(float f, float[] fArr, int i) {
        if (f < 0.0f) {
            if (f >= -8.34465E-7f) {
                f = 0.0f;
            }
            f = Float.NaN;
        } else if (f > 1.0f) {
            if (f <= 1.0000008f) {
                f = 1.0f;
            }
            f = Float.NaN;
        }
        fArr[i] = f;
        if (Float.isNaN(f)) {
            return 0;
        }
        return 1;
    }

    public static final void f(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }
}
