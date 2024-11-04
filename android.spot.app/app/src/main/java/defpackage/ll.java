package defpackage;

import android.view.View;
import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ll {
    public static void a(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static final int b(rz rzVar, int i) {
        try {
            return td.a(rzVar.a, rzVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(rz rzVar, Object obj, int i) {
        int i2 = rzVar.c;
        if (i2 == 0) {
            return -1;
        }
        int b = b(rzVar, i);
        if (b < 0) {
            return b;
        }
        if (amr.i(obj, rzVar.b[b])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && rzVar.a[i3] == i) {
            if (amr.i(obj, rzVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b - 1; i4 >= 0 && rzVar.a[i4] == i; i4--) {
            if (amr.i(obj, rzVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final int d(rz rzVar) {
        return c(rzVar, null, 0);
    }

    public static final void e(rz rzVar, int i) {
        rzVar.a = new int[i];
        rzVar.b = new Object[i];
    }

    public static final void f(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void g(String str) {
        throw new IllegalStateException(str);
    }

    public static final void h(String str) {
        throw new IllegalStateException(str);
    }

    public static final int i(boolean z, boolean z2) {
        int i;
        if (true != z2) {
            i = 0;
        } else {
            i = 2;
        }
        return (z ? 1 : 0) | i;
    }
}
