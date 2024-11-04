package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Builder b(Notification.Builder builder, Icon icon) {
        Notification.Builder largeIcon;
        largeIcon = builder.setLargeIcon(icon);
        return largeIcon;
    }

    static Notification.Builder c(Notification.Builder builder, Object obj) {
        Notification.Builder smallIcon;
        smallIcon = builder.setSmallIcon(fr$$ExternalSyntheticApiModelOutline0.m102m(obj));
        return smallIcon;
    }

    public static float d(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static int e(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static int f(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
        float p = p(((i >> 16) & 255) / 255.0f);
        float p2 = p(((i >> 8) & 255) / 255.0f);
        float p3 = p((i & 255) / 255.0f);
        float p4 = p + ((p(((i2 >> 16) & 255) / 255.0f) - p) * f);
        float p5 = p2 + ((p(((i2 >> 8) & 255) / 255.0f) - p2) * f);
        float p6 = p3 + (f * (p((i2 & 255) / 255.0f) - p3));
        float q = q(p4) * 255.0f;
        float q2 = q(p5) * 255.0f;
        float q3 = q(p6) * 255.0f;
        return (Math.round(q) << 16) | (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(q2) << 8) | Math.round(q3);
    }

    public static dbr g(dep depVar, cyb cybVar) {
        return new dbr(n(depVar, cybVar, ddq.b));
    }

    public static dbs h(dep depVar, cyb cybVar) {
        return i(depVar, cybVar, true);
    }

    public static dbs i(dep depVar, cyb cybVar, boolean z) {
        float f;
        if (z) {
            f = dfb.a();
        } else {
            f = 1.0f;
        }
        return new dbs(o(depVar, f, cybVar, ddq.a));
    }

    public static dbt j(dep depVar, cyb cybVar, int i) {
        return new dbt(n(depVar, cybVar, new ddt(i)));
    }

    public static dbu k(dep depVar, cyb cybVar) {
        return new dbu(n(depVar, cybVar, ddq.c));
    }

    public static dbw l(dep depVar, cyb cybVar) {
        return new dbw(ddy.a(depVar, cybVar, dfb.a(), ddq.e, true));
    }

    public static dby m(dep depVar, cyb cybVar) {
        return new dby(o(depVar, dfb.a(), cybVar, deg.a));
    }

    public static List n(dep depVar, cyb cybVar, dem demVar) {
        return ddy.a(depVar, cybVar, 1.0f, demVar, false);
    }

    public static List o(dep depVar, float f, cyb cybVar, dem demVar) {
        return ddy.a(depVar, cybVar, f, demVar, false);
    }

    private static float p(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float q(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
