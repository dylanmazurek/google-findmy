package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cu {
    public static LocaleList a(Object obj) {
        LocaleList applicationLocales;
        applicationLocales = ce$$ExternalSyntheticApiModelOutline0.m(obj).getApplicationLocales();
        return applicationLocales;
    }

    public static void b(Object obj, LocaleList localeList) {
        ce$$ExternalSyntheticApiModelOutline0.m(obj).setApplicationLocales(localeList);
    }

    public static Drawable c(Context context, int i) {
        return mn.e().c(context, i);
    }

    public static final int d(boolean z, int i, int i2) {
        if (!z && a.m(i, 2)) {
            return 1;
        }
        return moz.ac(i2, 1);
    }

    public static final long e(long j, boolean z, int i, float f) {
        int i2 = Integer.MAX_VALUE;
        if ((z || a.m(i, 2)) && bld.h(j)) {
            i2 = bld.b(j);
        }
        if (bld.d(j) != i2) {
            i2 = moz.ae(ct.c(f), bld.d(j), i2);
        }
        return bbb.e(0, i2, 0, bld.a(j));
    }
}
