package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fah {
    private static volatile fah a;
    private final Context b;

    private fah(Context context) {
        this.b = context;
    }

    public static fah a() {
        fah fahVar = a;
        if (fahVar != null) {
            return fahVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (fah.class) {
                if (a == null) {
                    a = new fah(context);
                }
            }
        }
    }

    public final faf c() {
        return new fag(this.b);
    }
}
