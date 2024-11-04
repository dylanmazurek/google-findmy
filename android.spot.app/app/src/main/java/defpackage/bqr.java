package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, int i) {
        int color;
        color = context.getColor(i);
        return color;
    }

    static Object b(Context context, Class cls) {
        Object systemService;
        systemService = context.getSystemService((Class<Object>) cls);
        return systemService;
    }

    static String c(Context context, Class cls) {
        String systemServiceName;
        systemServiceName = context.getSystemServiceName(cls);
        return systemServiceName;
    }

    public static int d(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(a.ae(i, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }
}
