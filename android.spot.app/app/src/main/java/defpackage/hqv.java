package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hqv {
    public static hqv c(Activity activity) {
        return new hqs(new hmq(activity.getClass().getName()));
    }

    public abstract hmq a();

    public abstract void b();

    public final String d() {
        return a().a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hqv) {
            hqv hqvVar = (hqv) obj;
            if (d().equals(hqvVar.d())) {
                hqvVar.b();
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (d().hashCode() * 31) ^ 1231;
    }
}
