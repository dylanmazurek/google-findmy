package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class due {
    private static final mkt a = mkm.a(3, bcf.p);

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return a.k(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return 9205357640488583168L;
    }

    public static final Handler b() {
        return (Handler) a.a();
    }
}
