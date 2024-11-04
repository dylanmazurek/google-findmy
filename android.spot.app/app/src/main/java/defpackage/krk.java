package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krk {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static krk c;

    private krk() {
    }

    public static krk b() {
        if (kne.a == null) {
            kne.a = new kne();
        }
        if (c == null) {
            c = new krk();
        }
        return c;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean c(kro kroVar) {
        if (TextUtils.isEmpty(kroVar.b)) {
            return true;
        }
        if (kroVar.e + kroVar.d < a() + a) {
            return true;
        }
        return false;
    }
}
