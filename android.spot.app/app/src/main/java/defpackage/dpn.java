package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpn {
    private static final dtk a = new dtj(new dtk() { // from class: dpm
        @Override // defpackage.dtk
        public final Object a() {
            Bitmap.Config config;
            boolean z = false;
            if (Build.VERSION.SDK_INT == 34) {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
                config = Bitmap.Config.HARDWARE;
                Bitmap copy = createBitmap.copy(config, false);
                createBitmap.recycle();
                if (copy == null) {
                    z = true;
                }
                if (copy != null) {
                    copy.recycle();
                }
            }
            return Boolean.valueOf(z);
        }
    });

    public static boolean a(BitmapFactory.Options options) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap.Config config2 = options.inPreferredConfig;
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                return ((Boolean) a.a()).booleanValue();
            }
            return false;
        }
        return false;
    }
}
