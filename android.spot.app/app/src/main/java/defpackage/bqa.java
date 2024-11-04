package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        Notification.Action.Builder authenticationRequired;
        authenticationRequired = builder.setAuthenticationRequired(z);
        return authenticationRequired;
    }

    static Notification.Builder b(Notification.Builder builder, int i) {
        Notification.Builder foregroundServiceBehavior;
        foregroundServiceBehavior = builder.setForegroundServiceBehavior(i);
        return foregroundServiceBehavior;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object c(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static Bitmap d(InputStream inputStream, BitmapFactory.Options options) {
        Bitmap.Config config;
        boolean z;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT == 34 && dpn.a(options)) {
            Bitmap.Config config4 = options.inPreferredConfig;
            config = Bitmap.Config.HARDWARE;
            if (config4 == config) {
                z = true;
            } else {
                z = false;
            }
            bsc.m(z);
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                if (decodeStream == null) {
                    config3 = Bitmap.Config.HARDWARE;
                } else {
                    try {
                        bitmap = e(decodeStream);
                        decodeStream.recycle();
                        config3 = Bitmap.Config.HARDWARE;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = decodeStream;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        config2 = Bitmap.Config.HARDWARE;
                        options.inPreferredConfig = config2;
                        throw th;
                    }
                }
                options.inPreferredConfig = config3;
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
    }

    public static Bitmap e(Bitmap bitmap) {
        Gainmap gainmap;
        Bitmap.Config config;
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        boolean z;
        float[] ratioMin;
        float[] ratioMax;
        float[] gamma;
        float[] epsilonSdr;
        float[] epsilonHdr;
        float displayRatioForFullHdr;
        float minDisplayRatioForHdrTransition;
        try {
            gainmap = bitmap.getGainmap();
            if (gainmap != null) {
                gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                    ColorMatrixColorFilter colorMatrixColorFilter = dpl.a;
                    gainmapContents2 = gainmap.getGainmapContents();
                    if (gainmapContents2.getConfig() == Bitmap.Config.ALPHA_8) {
                        if (gainmapContents2.getConfig() == Bitmap.Config.ALPHA_8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bsc.m(z);
                        Bitmap createBitmap = Bitmap.createBitmap(gainmapContents2.getWidth(), gainmapContents2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        paint.setColorFilter(dpl.a);
                        canvas.drawBitmap(gainmapContents2, 0.0f, 0.0f, paint);
                        canvas.setBitmap(null);
                        Gainmap gainmap2 = new Gainmap(createBitmap);
                        ratioMin = gainmap.getRatioMin();
                        gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                        ratioMax = gainmap.getRatioMax();
                        gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                        gamma = gainmap.getGamma();
                        gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                        epsilonSdr = gainmap.getEpsilonSdr();
                        gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                        epsilonHdr = gainmap.getEpsilonHdr();
                        gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                        displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
                        gainmap2.setDisplayRatioForFullHdr(displayRatioForFullHdr);
                        minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
                        gainmap2.setMinDisplayRatioForHdrTransition(minDisplayRatioForHdrTransition);
                        gainmap = gainmap2;
                    }
                    bitmap.setGainmap(gainmap);
                }
            }
            config = Bitmap.Config.HARDWARE;
            return bitmap.copy(config, false);
        } finally {
            bitmap.recycle();
        }
    }

    public static final int f(int i, ByteBuffer byteBuffer) {
        if (h(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static final short g(int i, ByteBuffer byteBuffer) {
        if (h(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static final boolean h(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() - i >= i2) {
            return true;
        }
        return false;
    }
}
