package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sn {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final nd g;
    private final bet h;

    public sn() {
        this(6);
    }

    public static int e(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    protected static final void f(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    private final int g(Object obj, Object obj2) {
        int a = a(obj, obj2);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    protected int a(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    public final Object b(Object obj) {
        synchronized (this.g) {
            Object obj2 = ((LinkedHashMap) this.h.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object y;
        obj2.getClass();
        synchronized (this.g) {
            this.c++;
            this.b += g(obj, obj2);
            y = this.h.y(obj, obj2);
            if (y != null) {
                this.b -= g(obj, y);
            }
        }
        if (y != null) {
            f(obj, y);
        }
        d(this.a);
        return y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:            throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r6) {
        /*
            r5 = this;
        L0:
            nd r0 = r5.g
            monitor-enter(r0)
            int r1 = r5.b     // Catch: java.lang.Throwable -> L88
            if (r1 < 0) goto L80
            bet r1 = r5.h     // Catch: java.lang.Throwable -> L88
            boolean r1 = r1.z()     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L13
            int r1 = r5.b     // Catch: java.lang.Throwable -> L88
            if (r1 != 0) goto L80
        L13:
            int r1 = r5.b     // Catch: java.lang.Throwable -> L88
            if (r1 <= r6) goto L7e
            bet r1 = r5.h     // Catch: java.lang.Throwable -> L88
            boolean r1 = r1.z()     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L20
            goto L7e
        L20:
            bet r1 = r5.h     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L88
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L88
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L88
            r1.getClass()     // Catch: java.lang.Throwable -> L88
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L88
            r3 = 0
            if (r2 == 0) goto L41
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L88
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L3b
            goto L50
        L3b:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L88
            goto L50
        L41:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L88
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L88
            if (r2 != 0) goto L4c
            goto L50
        L4c:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L88
        L50:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L88
            if (r3 != 0) goto L56
            monitor-exit(r0)
            return
        L56:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L88
            bet r3 = r5.h     // Catch: java.lang.Throwable -> L88
            r1.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> L88
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L88
            r3.remove(r1)     // Catch: java.lang.Throwable -> L88
            int r3 = r5.b     // Catch: java.lang.Throwable -> L88
            int r4 = r5.g(r1, r2)     // Catch: java.lang.Throwable -> L88
            int r3 = r3 - r4
            r5.b = r3     // Catch: java.lang.Throwable -> L88
            int r3 = r5.d     // Catch: java.lang.Throwable -> L88
            int r3 = r3 + 1
            r5.d = r3     // Catch: java.lang.Throwable -> L88
            monitor-exit(r0)
            f(r1, r2)
            goto L0
        L7e:
            monitor-exit(r0)
            return
        L80:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L88
            throw r1     // Catch: java.lang.Throwable -> L88
        L88:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn.d(int):void");
    }

    public final String toString() {
        int i;
        String str;
        synchronized (this.g) {
            int i2 = this.e;
            int i3 = this.f + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + i + "%]";
        }
        return str;
    }

    public sn(int i) {
        this.a = i;
        this.h = new bet(0, (byte[]) null);
        this.g = new nd();
    }
}
