package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqq {
    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    static File b(Context context) {
        return context.getCodeCacheDir();
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static void d(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 35) {
            bxd.a(window, z);
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        bxc.a(window, z);
    }
}
