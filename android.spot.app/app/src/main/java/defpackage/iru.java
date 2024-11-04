package defpackage;

import android.os.Build;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iru {
    static final int a;
    public static boolean b;
    public static Constructor c;
    public static Object d;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
        } else {
            i = 0;
        }
        a = i;
    }
}
