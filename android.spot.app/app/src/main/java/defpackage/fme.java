package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fme {
    private static final fme a = new fme();
    private bym b = null;

    public static bym b(Context context) {
        return a.a(context);
    }

    public final synchronized bym a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new bym((Object) context);
        }
        return this.b;
    }
}
