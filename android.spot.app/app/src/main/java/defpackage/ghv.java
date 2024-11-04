package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.apps.adm.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghv implements ghu {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;

    public ghv(Context context) {
        this.b = context;
    }

    static final Rect c(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        float f2 = width;
        int height = bitmap.getHeight();
        float f3 = height;
        float f4 = f2 / f3;
        if (f4 == f) {
            return new Rect(0, 0, width, height);
        }
        if (f4 > f) {
            int i = (int) (f * f3);
            int i2 = (width - i) / 2;
            return new Rect(i2, 0, i + i2, height);
        }
        int i3 = (height - ((int) (f2 * f))) / 2;
        return new Rect(0, i3, width, i3 + width);
    }

    static final Rect d(Bitmap bitmap) {
        return c(bitmap, 1.0f);
    }

    private static final void e(Canvas canvas, List list) {
        Paint paint = new Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        canvas.drawBitmap((Bitmap) list.get(0), d((Bitmap) list.get(0)), new Rect(0, 0, i, i), paint);
                        canvas.drawBitmap((Bitmap) list.get(1), d((Bitmap) list.get(1)), new Rect(i, 0, width, i), paint);
                        canvas.drawBitmap((Bitmap) list.get(2), d((Bitmap) list.get(2)), new Rect(0, i, i, width), paint);
                        canvas.drawBitmap((Bitmap) list.get(3), d((Bitmap) list.get(3)), new Rect(i, i, width, width), paint);
                        return;
                    }
                    canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
                    canvas.drawBitmap((Bitmap) list.get(1), d((Bitmap) list.get(1)), new Rect(i, 0, width, i), paint);
                    canvas.drawBitmap((Bitmap) list.get(2), d((Bitmap) list.get(2)), new Rect(i, i, width, width), paint);
                    return;
                }
                canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
                canvas.drawBitmap((Bitmap) list.get(1), c((Bitmap) list.get(1), 0.5f), new Rect(i, 0, width, width), paint);
                return;
            }
            canvas.drawBitmap((Bitmap) list.get(0), d((Bitmap) list.get(0)), new Rect(0, 0, width, width), paint);
            return;
        }
        ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "drawSquareAvatars", 107, "ChimeImageProcessorImpl.java")).r("Got empty list of avatars to merge.");
    }

    @Override // defpackage.ghu
    public final Bitmap a(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            e(canvas, list);
            Paint paint = new Paint();
            int width = canvas.getWidth();
            int i2 = width / 2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(width / 4);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            float f = i2;
            canvas.drawCircle(f, f, i2 + (r2 / 2), paint);
            return createBitmap;
        } catch (Exception e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getCircularAvatar", '8', "ChimeImageProcessorImpl.java")).r("Failed to create circular avatar.");
            return null;
        } catch (OutOfMemoryError e2) {
            ((jol) ((jol) ((jol) a.f()).i(e2)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getCircularAvatar", '5', "ChimeImageProcessorImpl.java")).r("Failed to allocate memory.");
            return null;
        }
    }

    @Override // defpackage.ghu
    public final Bitmap b(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        if (lvj.a.a().c() && list.size() == 1) {
            Bitmap bitmap = (Bitmap) list.get(0);
            if (bitmap.getWidth() == bitmap.getHeight()) {
                return bitmap;
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.notifications_avatar_separator_stroke_width);
            e(canvas, list);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimensionPixelSize);
            paint.setColor(-16777216);
            int width = canvas.getWidth();
            int i2 = width / 2;
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            float f = width;
                            float f2 = i2;
                            canvas.drawLine(f2, 0.0f, f2, f, paint);
                            canvas.drawLine(0.0f, f2, f, f2, paint);
                        } else {
                            float f3 = width;
                            float f4 = i2;
                            canvas.drawLine(f4, 0.0f, f4, f3, paint);
                            canvas.drawLine(f4, f4, f3, f4, paint);
                        }
                    } else {
                        float f5 = i2;
                        canvas.drawLine(f5, 0.0f, f5, width, paint);
                    }
                } else {
                    ((jol) a.k().j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "drawSquareAvatarSeparators", 178, "ChimeImageProcessorImpl.java")).r("Not adding any separators since there is only one image.");
                }
            } else {
                ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "drawSquareAvatarSeparators", 174, "ChimeImageProcessorImpl.java")).r("Got empty list of images to draw separator on.");
            }
            return createBitmap;
        } catch (Exception e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getSquareAvatar", '\\', "ChimeImageProcessorImpl.java")).r("Failed to create square avatar.");
            return null;
        } catch (OutOfMemoryError e2) {
            ((jol) ((jol) ((jol) a.f()).i(e2)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getSquareAvatar", 'Y', "ChimeImageProcessorImpl.java")).r("Failed to allocate memory.");
            return null;
        }
    }
}
