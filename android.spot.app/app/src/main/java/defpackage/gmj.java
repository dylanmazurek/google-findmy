package defpackage;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmj {
    public static final gmj a = new gmj();
    private static final joo b = joo.m("GnpSdk");

    private gmj() {
    }

    public static final int a(StatusBarNotification statusBarNotification) {
        String str;
        Integer e;
        statusBarNotification.getClass();
        Integer valueOf = Integer.valueOf(statusBarNotification.getNotification().extras.getInt("chime.account_name_hash"));
        Integer num = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        String tag = statusBarNotification.getTag();
        if (tag != null && (str = (String) moz.G(tag, new String[]{"::"}).get(0)) != null && (e = moz.e(str)) != null) {
            int intValue = e.intValue();
            if (intValue == -91843507) {
                intValue = -1;
            }
            num = Integer.valueOf(intValue);
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final int b(String str, String str2, int i) {
        return (str + ":e:" + i + ":a:" + str2).hashCode();
    }

    public static final gmi c(giu giuVar, ggk ggkVar) {
        String f;
        ggkVar.getClass();
        if (frx.R(ggkVar).length() > 0) {
            f = frx.R(ggkVar) + "::" + UUID.randomUUID();
        } else {
            String str = ggkVar.a;
            str.getClass();
            f = f(giuVar, str);
        }
        return new gmi(0, f);
    }

    public static final String d(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        Bundle bundle = statusBarNotification.getNotification().extras;
        bundle.getClass();
        return l(bundle, "chime.slot_key");
    }

    public static final String e(giu giuVar, String str) {
        str.getClass();
        String e = giuVar.e();
        if (e == null) {
            e = "Anonymous";
        }
        return e.hashCode() + "::SUMMARY::" + str;
    }

    public static final String f(giu giuVar, String str) {
        str.getClass();
        String e = giuVar.e();
        if (e == null) {
            e = "Anonymous";
        }
        return e.hashCode() + "::" + str;
    }

    public static final String g(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        Bundle bundle = statusBarNotification.getNotification().extras;
        bundle.getClass();
        String l = l(bundle, "chime.thread_id");
        if (l == null) {
            String tag = statusBarNotification.getTag();
            if (tag == null) {
                return null;
            }
            return (String) mkm.Y(moz.G(tag, new String[]{"::"}), 1);
        }
        return l;
    }

    public static final int h(giu giuVar) {
        String e = giuVar.e();
        if (e != null) {
            return e.hashCode();
        }
        return -1;
    }

    public static final gmi i(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        return new gmi(statusBarNotification.getId(), statusBarNotification.getTag());
    }

    public static final boolean j(StatusBarNotification statusBarNotification, giu giuVar) {
        statusBarNotification.getClass();
        if (a(statusBarNotification) == h(giuVar)) {
            return true;
        }
        return false;
    }

    public static final boolean k(StatusBarNotification statusBarNotification, giu giuVar, String str) {
        statusBarNotification.getClass();
        if (amr.i(g(statusBarNotification), str) && j(statusBarNotification, giuVar)) {
            return true;
        }
        return false;
    }

    private static final String l(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            ((jol) ((jol) b.g()).i(e)).r("Failed to get String from Bundle");
            return null;
        }
    }
}
