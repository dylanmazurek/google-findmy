package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ib {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static ib b;
    private mn c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (ib.class) {
            b2 = mn.b(i, mode);
        }
        return b2;
    }

    public static synchronized ib d() {
        ib ibVar;
        synchronized (ib.class) {
            if (b == null) {
                f();
            }
            ibVar = b;
        }
        return ibVar;
    }

    public static synchronized void f() {
        synchronized (ib.class) {
            if (b == null) {
                ib ibVar = new ib();
                b = ibVar;
                ibVar.c = mn.e();
                b.c.h(new apv());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
