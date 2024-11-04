package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlv implements dln {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final dlw b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public dlv(long j) {
        Bitmap.Config config;
        dmb dmbVar = new dmb();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = dmbVar;
        this.c = unmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000e, B:8:0x0012, B:9:0x0014, B:11:0x002b, B:13:0x0035, B:14:0x005b, B:16:0x005e, B:18:0x0073, B:21:0x007b, B:35:0x0086, B:38:0x008d, B:40:0x00a3, B:26:0x00a6, B:28:0x00b3, B:30:0x00c3, B:34:0x00c9, B:43:0x0038, B:51:0x004b, B:52:0x0050, B:53:0x0053, B:54:0x0056, B:55:0x0059, B:56:0x0008, B:58:0x00e0, B:59:0x00ed), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3 A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000e, B:8:0x0012, B:9:0x0014, B:11:0x002b, B:13:0x0035, B:14:0x005b, B:16:0x005e, B:18:0x0073, B:21:0x007b, B:35:0x0086, B:38:0x008d, B:40:0x00a3, B:26:0x00a6, B:28:0x00b3, B:30:0x00c3, B:34:0x00c9, B:43:0x0038, B:51:0x004b, B:52:0x0050, B:53:0x0053, B:54:0x0056, B:55:0x0059, B:56:0x0008, B:58:0x00e0, B:59:0x00ed), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000e, B:8:0x0012, B:9:0x0014, B:11:0x002b, B:13:0x0035, B:14:0x005b, B:16:0x005e, B:18:0x0073, B:21:0x007b, B:35:0x0086, B:38:0x008d, B:40:0x00a3, B:26:0x00a6, B:28:0x00b3, B:30:0x00c3, B:34:0x00c9, B:43:0x0038, B:51:0x004b, B:52:0x0050, B:53:0x0053, B:54:0x0056, B:55:0x0059, B:56:0x0008, B:58:0x00e0, B:59:0x00ed), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000e, B:8:0x0012, B:9:0x0014, B:11:0x002b, B:13:0x0035, B:14:0x005b, B:16:0x005e, B:18:0x0073, B:21:0x007b, B:35:0x0086, B:38:0x008d, B:40:0x00a3, B:26:0x00a6, B:28:0x00b3, B:30:0x00c3, B:34:0x00c9, B:43:0x0038, B:51:0x004b, B:52:0x0050, B:53:0x0053, B:54:0x0056, B:55:0x0059, B:56:0x0008, B:58:0x00e0, B:59:0x00ed), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[EDGE_INSN: B:42:0x00a6->B:26:0x00a6 BREAK  A[LOOP:0: B:15:0x005c->B:40:0x00a3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized android.graphics.Bitmap g(int r12, int r13, android.graphics.Bitmap.Config r14) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlv.g(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    private final synchronized void h(long j) {
        while (this.e > j) {
            dlw dlwVar = this.b;
            Bitmap bitmap = (Bitmap) ((dmb) dlwVar).g.b();
            if (bitmap != null) {
                ((dmb) dlwVar).c(Integer.valueOf(dtq.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    this.b.toString();
                }
                this.e = 0L;
                return;
            }
            this.e -= dtq.a(bitmap);
            this.i++;
            bitmap.recycle();
        }
    }

    @Override // defpackage.dln
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        if (g != null) {
            g.eraseColor(0);
            return g;
        }
        return f(i, i2, config);
    }

    @Override // defpackage.dln
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        if (g == null) {
            return f(i, i2, config);
        }
        return g;
    }

    @Override // defpackage.dln
    public final void c() {
        h(0L);
    }

    @Override // defpackage.dln
    public final synchronized void d(Bitmap bitmap) {
        int intValue;
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && dtq.a(bitmap) <= this.d && this.c.contains(bitmap.getConfig())) {
                        int a2 = dtq.a(bitmap);
                        dlw dlwVar = this.b;
                        dlz d = ((dmb) dlwVar).f.d(dtq.a(bitmap), bitmap.getConfig());
                        ((dmb) dlwVar).g.c(d, bitmap);
                        NavigableMap b = ((dmb) dlwVar).b(bitmap.getConfig());
                        Integer num = (Integer) b.get(Integer.valueOf(d.a));
                        Integer valueOf = Integer.valueOf(d.a);
                        if (num == null) {
                            intValue = 1;
                        } else {
                            intValue = num.intValue() + 1;
                        }
                        b.put(valueOf, Integer.valueOf(intValue));
                        this.h++;
                        this.e += a2;
                        h(this.d);
                        return;
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.dln
    public final void e(int i) {
        if (i < 40 && (Build.VERSION.SDK_INT < 23 || i < 20)) {
            if (i < 20 && i != 15) {
                return;
            }
            h(this.d >> 1);
            return;
        }
        c();
    }
}
