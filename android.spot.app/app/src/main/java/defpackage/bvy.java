package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvy {
    private final int a;
    private final Class b;
    private final int c;
    private final int d;

    public bvy(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean f(Boolean bool, Boolean bool2) {
        boolean z;
        boolean z2;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (bool2 != null && bool2.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return true;
        }
        return false;
    }

    private final boolean g() {
        if (Build.VERSION.SDK_INT >= this.c) {
            return true;
        }
        return false;
    }

    public abstract Object a(View view);

    public abstract void b(View view, Object obj);

    public boolean c(Object obj, Object obj2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object d(View view) {
        if (g()) {
            return a(view);
        }
        Object tag = view.getTag(this.a);
        if (this.b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void e(View view, Object obj) {
        if (g()) {
            b(view, obj);
        } else if (c(d(view), obj)) {
            bwn.j(view);
            view.setTag(this.a, obj);
            bwn.k(view, this.d);
        }
    }

    public bvy(int i, Class cls) {
        this(i, cls, 0, 28);
    }
}
