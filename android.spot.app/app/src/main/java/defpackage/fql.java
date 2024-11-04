package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fql {
    static Integer d;
    public final List a;
    public Object b;
    public final Object c;

    public fql(View view) {
        this.a = new ArrayList();
        this.c = view;
    }

    public static final boolean g(int i, int i2) {
        if (i(i) && i(i2)) {
            return true;
        }
        return false;
    }

    private final int h(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (!((View) this.c).isLayoutRequested() && i2 == -2) {
            Context context = ((View) this.c).getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                bsc.q(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
        return 0;
    }

    private static final boolean i(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v0, types: [fqk, java.lang.Object] */
    public final void a(Object obj) {
        synchronized (this) {
            this.b = obj;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.c.a(it.next(), obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fqk, java.lang.Object] */
    public final void b(Object obj, jei jeiVar) {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.a.isEmpty();
            this.a.add(obj);
        }
        if (isEmpty) {
            return;
        }
        synchronized (this) {
            Object obj2 = this.b;
            if (obj2 != null) {
                this.c.a(obj, obj2);
            }
        }
        fma.o(null);
    }

    public final void c(Object obj, jei jeiVar) {
        synchronized (this) {
            this.a.remove(obj);
            if (!this.a.isEmpty()) {
                fma.o(true);
            }
        }
    }

    public final int d() {
        int i;
        View view = (View) this.c;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = ((View) this.c).getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return h(((View) this.c).getHeight(), i, paddingTop);
    }

    public final int e() {
        int i;
        View view = (View) this.c;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = ((View) this.c).getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return h(((View) this.c).getWidth(), i, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void f() {
        ViewTreeObserver viewTreeObserver = ((View) this.c).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.b);
        }
        this.b = null;
        this.a.clear();
    }

    public fql(fqk fqkVar) {
        this.a = new CopyOnWriteArrayList();
        this.c = fqkVar;
    }
}
