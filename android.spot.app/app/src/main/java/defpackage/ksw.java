package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksw {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static fxg c;

    public static void a(Context context) {
        if (c == null) {
            fxg fxgVar = new fxg(context, "wake:com.google.firebase.iid.WakeLockHolder");
            c = fxgVar;
            fxgVar.d(true);
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            if (c != null && d(intent)) {
                c(intent, false);
                c.b();
            }
        }
    }

    public static void c(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
