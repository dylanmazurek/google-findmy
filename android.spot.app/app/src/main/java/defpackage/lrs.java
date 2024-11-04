package defpackage;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrs {
    public Object a;

    public lrs() {
    }

    public final InputStream a() {
        Object obj = this.a;
        this.a = null;
        return (InputStream) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final jjm b() {
        ?? r0 = this.a;
        if (r0 == 0) {
            return jhn.a;
        }
        Set<Map.Entry> entrySet = r0.entrySet();
        if (entrySet.isEmpty()) {
            return jhn.a;
        }
        jiu jiuVar = new jiu(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            jis g = ((jin) entry.getValue()).g();
            jiuVar.d(key, g);
            i += ((jmi) g).c;
        }
        return new jit(jiuVar.b(), i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    final Map c() {
        ?? r0 = this.a;
        if (r0 == 0) {
            jha jhaVar = new jha();
            this.a = jhaVar;
            return jhaVar;
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    public final void d(Object obj, Object obj2) {
        hwx.B(obj, obj2);
        jig jigVar = (jig) c().get(obj);
        if (jigVar == null) {
            ?? r0 = this.a;
            jin jinVar = new jin();
            r0.put(obj, jinVar);
            jigVar = jinVar;
        }
        jigVar.d(obj2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    public final void e(Object obj, Iterable iterable) {
        if (obj != null) {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                jig jigVar = (jig) c().get(obj);
                if (jigVar == null) {
                    jigVar = new jin();
                    this.a.put(obj, jigVar);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    hwx.B(obj, next);
                    jigVar.d(next);
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null key in entry: null=".concat(hzc.Z(iterable)));
    }

    public final float f() {
        return ((bxn) this.a).g();
    }

    public final void g(float f) {
        ((bxn) this.a).j(f);
    }

    public lrs(InputStream inputStream) {
        this.a = inputStream;
    }

    public lrs(Object obj) {
        this.a = obj;
    }

    public lrs(byte[] bArr, char[] cArr) {
        this.a = null;
    }

    public lrs(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new bxm(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new bxk(i, interpolator, j);
        }
    }

    public lrs(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = SwipeDismissBehavior.v(0.1f);
        swipeDismissBehavior.e = SwipeDismissBehavior.v(0.6f);
        swipeDismissBehavior.c = 0;
    }

    public lrs(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new bxm(windowInsetsAnimation);
        }
    }
}
