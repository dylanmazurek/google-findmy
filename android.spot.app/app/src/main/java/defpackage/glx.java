package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glx {
    public static final joo a = joo.m("GnpSdk");

    public static lct a(Intent intent) {
        return lct.b(intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", 0));
    }

    public static lgz b(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE");
        if (byteArrayExtra != null) {
            try {
                ljn m = ljn.m(lgz.f, byteArrayExtra, 0, byteArrayExtra.length, lja.a());
                ljn.A(m);
                return (lgz) m;
            } catch (ljy e) {
                ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/IntentExtrasHelper", "getThreadStateUpdate", (char) 161, "IntentExtrasHelper.java")).r("Unable to parse ThreadStateUpdate message");
            }
        }
        return lgz.f;
    }

    public static String c(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
    }

    public static String d(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.GROUP_ID");
    }

    public static String e(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.THREAD_ID");
    }

    public static int f(Intent intent) {
        return intent.getIntExtra("com.google.android.libraries.notifications.EVENT_TYPE", 0);
    }
}
