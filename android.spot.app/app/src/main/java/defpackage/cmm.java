package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmm {
    public static final boolean a;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        a = z;
    }
}
