package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bib {
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final rm h = new rm();
    private final HashMap a = new HashMap(0, 0.75f);
    private final LinkedHashSet b = new LinkedHashSet();

    public final int a() {
        int i;
        synchronized (this.h) {
            i = this.c;
        }
        return i;
    }

    public final Object b(Object obj) {
        synchronized (this.h) {
            Object obj2 = this.a.get(obj);
            if (obj2 != null) {
                this.b.remove(obj);
                this.b.add(obj);
                this.f++;
                return obj2;
            }
            this.g++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:            throw new java.lang.IllegalStateException("map/keySet size inconsistency");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Lc1
            if (r6 == 0) goto Lc1
            rm r1 = r4.h
            monitor-enter(r1)
            int r2 = r4.d     // Catch: java.lang.Throwable -> Lbe
            int r2 = r2 + 1
            r4.d = r2     // Catch: java.lang.Throwable -> Lbe
            int r2 = r4.a()     // Catch: java.lang.Throwable -> Lbe
            int r2 = r2 + 1
            r4.c = r2     // Catch: java.lang.Throwable -> Lbe
            java.util.HashMap r2 = r4.a     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r6 = r2.put(r5, r6)     // Catch: java.lang.Throwable -> Lbe
            if (r6 == 0) goto L26
            int r2 = r4.a()     // Catch: java.lang.Throwable -> Lbe
            int r2 = r2 + (-1)
            r4.c = r2     // Catch: java.lang.Throwable -> Lbe
        L26:
            java.util.LinkedHashSet r2 = r4.b     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto L33
            java.util.LinkedHashSet r2 = r4.b     // Catch: java.lang.Throwable -> Lbe
            r2.remove(r5)     // Catch: java.lang.Throwable -> Lbe
        L33:
            java.util.LinkedHashSet r2 = r4.b     // Catch: java.lang.Throwable -> Lbe
            r2.add(r5)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r1)
        L39:
            rm r5 = r4.h
            monitor-enter(r5)
            int r1 = r4.a()     // Catch: java.lang.Throwable -> Lbb
            if (r1 < 0) goto Lb3
            java.util.HashMap r1 = r4.a     // Catch: java.lang.Throwable -> Lbb
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto L50
            int r1 = r4.a()     // Catch: java.lang.Throwable -> Lbb
            if (r1 != 0) goto Lb3
        L50:
            java.util.HashMap r1 = r4.a     // Catch: java.lang.Throwable -> Lbb
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            java.util.LinkedHashSet r2 = r4.b     // Catch: java.lang.Throwable -> Lbb
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r1 != r2) goto Lb3
            int r1 = r4.a()     // Catch: java.lang.Throwable -> Lbb
            r2 = 16
            if (r1 <= r2) goto La3
            java.util.HashMap r1 = r4.a     // Catch: java.lang.Throwable -> Lbb
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r1 != 0) goto La3
            java.util.LinkedHashSet r1 = r4.b     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r1 = defpackage.mkm.V(r1)     // Catch: java.lang.Throwable -> Lbb
            java.util.HashMap r2 = r4.a     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L9b
            java.util.HashMap r3 = r4.a     // Catch: java.lang.Throwable -> Lbb
            defpackage.mpp.h(r3)     // Catch: java.lang.Throwable -> Lbb
            r3.remove(r1)     // Catch: java.lang.Throwable -> Lbb
            java.util.LinkedHashSet r3 = r4.b     // Catch: java.lang.Throwable -> Lbb
            r3.remove(r1)     // Catch: java.lang.Throwable -> Lbb
            int r3 = r4.a()     // Catch: java.lang.Throwable -> Lbb
            r1.getClass()     // Catch: java.lang.Throwable -> Lbb
            int r3 = r3 + (-1)
            r4.c = r3     // Catch: java.lang.Throwable -> Lbb
            int r3 = r4.e     // Catch: java.lang.Throwable -> Lbb
            int r3 = r3 + 1
            r4.e = r3     // Catch: java.lang.Throwable -> Lbb
            goto La5
        L9b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "inconsistent state"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            throw r6     // Catch: java.lang.Throwable -> Lbb
        La3:
            r1 = r0
            r2 = r1
        La5:
            monitor-exit(r5)
            if (r1 != 0) goto Lac
            if (r2 == 0) goto Lab
            goto Lac
        Lab:
            return r6
        Lac:
            r1.getClass()
            r2.getClass()
            goto L39
        Lb3:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "map/keySet size inconsistency"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            throw r6     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        Lbe:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        Lc1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bib.c(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object d(Object obj) {
        Object remove;
        synchronized (this.h) {
            remove = this.a.remove(obj);
            this.b.remove(obj);
            if (remove != null) {
                this.c = a() - 1;
            }
        }
        return remove;
    }

    public final String toString() {
        int i;
        String str;
        synchronized (this.h) {
            int i2 = this.f;
            int i3 = this.g + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=16,hits=" + this.f + ",misses=" + this.g + ",hitRate=" + i + "%]";
        }
        return str;
    }
}
