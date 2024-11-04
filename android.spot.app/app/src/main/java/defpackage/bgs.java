package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgs {
    public static final bgs a = new bgs();

    private bgs() {
    }

    public final boolean a(Canvas canvas, Path path) {
        boolean clipOutPath;
        clipOutPath = canvas.clipOutPath(path);
        return clipOutPath;
    }

    public final boolean b(Canvas canvas, Rect rect) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    public final boolean c(Canvas canvas, RectF rectF) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(rectF);
        return clipOutRect;
    }

    public final boolean d(Canvas canvas, float f, float f2, float f3, float f4) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(f, f2, f3, f4);
        return clipOutRect;
    }

    public final boolean e(Canvas canvas, int i, int i2, int i3, int i4) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(i, i2, i3, i4);
        return clipOutRect;
    }
}
