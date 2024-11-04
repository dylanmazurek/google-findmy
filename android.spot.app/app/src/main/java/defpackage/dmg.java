package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmg {
    static final int a;
    public final ActivityManager b;
    public float c;
    public final ddg d;

    static {
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            i = 4;
        } else {
            i = 1;
        }
        a = i;
    }

    public dmg(Context context) {
        this.c = a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.d = new ddg(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.c = 0.0f;
        }
    }
}
