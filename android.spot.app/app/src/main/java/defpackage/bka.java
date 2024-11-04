package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bka {
    public static final bjz a;

    static {
        bjz bjvVar;
        if (Build.VERSION.SDK_INT >= 24) {
            bjvVar = new bjw();
        } else {
            bjvVar = new bjv();
        }
        a = bjvVar;
    }
}
