package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class brj {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(int i);

    public abstract void b(Typeface typeface);

    public final void c(int i) {
        e().post(new bth(this, i, 1));
    }

    public final void d(Typeface typeface) {
        e().post(new bx(this, typeface, 13));
    }
}
