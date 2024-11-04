package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyo {
    public static final fyv a;

    static {
        Uri uri = fyp.a;
        a = fyq.a();
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        Object obj;
        Long l;
        fyv fyvVar = a;
        fyv.d(contentResolver);
        synchronized (fyvVar) {
            fyvVar.b(contentResolver);
            obj = fyvVar.e;
            l = (Long) fyv.e(fyvVar.d, str, Long.valueOf(j));
        }
        if (l != null) {
            return l.longValue();
        }
        String a2 = fyvVar.a(contentResolver, str, null);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                l = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (fyvVar) {
            fyvVar.c(obj, fyvVar.d, str, l);
        }
        return j;
    }

    public static String b(ContentResolver contentResolver, String str, String str2) {
        return a.a(contentResolver, str, str2);
    }

    public static boolean c(ContentResolver contentResolver, String str, boolean z) {
        Object obj;
        Boolean bool;
        fyv fyvVar = a;
        fyv.d(contentResolver);
        synchronized (fyvVar) {
            fyvVar.b(contentResolver);
            obj = fyvVar.e;
            bool = (Boolean) fyv.e(fyvVar.b, str, Boolean.valueOf(z));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = fyvVar.a(contentResolver, str, null);
        if (a2 != null && !a2.isEmpty()) {
            if (fyp.c.matcher(a2).matches()) {
                z = true;
                bool = true;
            } else if (fyp.d.matcher(a2).matches()) {
                z = false;
                bool = false;
            } else {
                Log.w("Gservices", "attempt to read Gservices key " + str + " (value \"" + a2 + "\") as boolean");
            }
        }
        synchronized (fyvVar) {
            fyvVar.c(obj, fyvVar.b, str, bool);
        }
        return z;
    }
}
