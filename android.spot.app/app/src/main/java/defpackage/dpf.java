package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpf {
    public static final diu a = new diu("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", dii.c, diu.a);
    public static final diu b = new diu("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, diu.a);
    public static final diu c;
    public static final diu d;
    public static final dpe e;
    private static final Set h;
    private static final Queue i;
    public final List f;
    public final dlu g;
    private final dln j;
    private final DisplayMetrics k;
    private final dpo l = dpo.a();

    static {
        dpc dpcVar = dpc.a;
        c = new diu("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, diu.a);
        d = new diu("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, diu.a);
        h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new dpd();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        i = new ArrayDeque(0);
    }

    public dpf(List list, DisplayMetrics displayMetrics, dln dlnVar, dlu dluVar) {
        this.f = list;
        bsc.q(displayMetrics);
        this.k = displayMetrics;
        bsc.q(dlnVar);
        this.j = dlnVar;
        bsc.q(dluVar);
        this.g = dluVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    private static Bitmap d(dpq dpqVar, BitmapFactory.Options options, dpe dpeVar, dln dlnVar) {
        String str;
        Bitmap d2;
        if (!options.inJustDecodeBounds) {
            dpeVar.b();
            dpqVar.d();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str2 = options.outMimeType;
        dpx.c.lock();
        try {
            try {
                d2 = dpqVar.b(options);
            } catch (IllegalArgumentException e2) {
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    str = null;
                } else {
                    String str3 = " (" + bitmap.getAllocationByteCount() + ")";
                    str = "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str3;
                }
                IOException iOException = new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str2 + ", inBitmap: " + str, e2);
                if (options.inBitmap != null) {
                    try {
                        dlnVar.d(options.inBitmap);
                        options.inBitmap = null;
                        d2 = d(dpqVar, options, dpeVar, dlnVar);
                    } catch (IOException unused) {
                        throw iOException;
                    }
                } else {
                    throw iOException;
                }
            }
            return d2;
        } finally {
            dpx.c.unlock();
        }
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        synchronized (dpf.class) {
            Queue queue = i;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                g(options2);
                return options2;
            }
            return options;
        }
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean h(int i2) {
        if (i2 != 90 && i2 != 270) {
            return false;
        }
        return true;
    }

    private static boolean i(BitmapFactory.Options options) {
        if (options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity) {
            return true;
        }
        return false;
    }

    private static int[] j(dpq dpqVar, BitmapFactory.Options options, dpe dpeVar, dln dlnVar) {
        options.inJustDecodeBounds = true;
        d(dpqVar, options, dpeVar, dlnVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0282 A[Catch: all -> 0x03ae, TryCatch #4 {all -> 0x03ae, blocks: (B:30:0x024f, B:32:0x025b, B:33:0x028a, B:41:0x02cc, B:43:0x02d2, B:46:0x02db, B:48:0x02e3, B:49:0x02e5, B:52:0x02ed, B:54:0x02f3, B:56:0x02f9, B:58:0x02ff, B:60:0x0309, B:61:0x0312, B:62:0x030e, B:63:0x031a, B:65:0x031e, B:66:0x0329, B:68:0x0336, B:71:0x0392, B:73:0x0398, B:74:0x0345, B:75:0x0352, B:77:0x0382, B:78:0x0356, B:79:0x035a, B:80:0x0363, B:81:0x0367, B:82:0x0370, B:83:0x0379, B:84:0x037d, B:85:0x039d, B:90:0x0294, B:92:0x029a, B:93:0x02a4, B:95:0x0265, B:100:0x026b, B:102:0x0275, B:103:0x027a, B:105:0x0282, B:98:0x0286, B:106:0x0278), top: B:29:0x024f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dlf a(defpackage.dpq r26, int r27, int r28, defpackage.div r29, defpackage.dpe r30) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpf.a(dpq, int, int, div, dpe):dlf");
    }
}
