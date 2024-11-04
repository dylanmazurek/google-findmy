package defpackage;

import android.view.contentcapture.ContentCaptureSession;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beg {
    public static void a(ContentCaptureSession contentCaptureSession, List list) {
        contentCaptureSession.notifyViewsAppeared(list);
    }

    public static final List b(bfh bfhVar) {
        return bfhVar.k(false, false);
    }

    public static final mol c(bfh bfhVar) {
        bfn bfnVar = bfd.a;
        return (mol) bej.b(bfhVar.c, bfd.e);
    }

    public static final float d(float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (f3 == f4) {
            f6 = 0.0f;
        } else {
            f6 = (f5 - f3) / (f4 - f3);
        }
        return f + ((f2 - f) * Math.max(0.0f, Math.min(1.0f, f6)));
    }

    public static final float e(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float d;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            d = fArr2[binarySearch];
        } else {
            int i = -(binarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f5 = 0.0f;
            if (i2 >= length) {
                float f6 = fArr[length];
                float f7 = fArr2[length];
                if (f6 == 0.0f) {
                    return 0.0f;
                }
                return f * (f7 / f6);
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f3 = fArr2[0];
                f4 = 0.0f;
            } else {
                float f8 = fArr[i2];
                f2 = fArr[i];
                f5 = fArr2[i2];
                f3 = fArr2[i];
                f4 = f8;
            }
            d = d(f5, f3, f4, f2, abs);
        }
        return signum * d;
    }
}
