package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bss {
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            bsr.a.a(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bsr.a.a(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bsr.a.a(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bsr.a.a(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (amr.i("REL", str2)) {
            return false;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }
}
