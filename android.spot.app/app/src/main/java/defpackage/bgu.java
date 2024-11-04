package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgu {
    public static final bgu a = new bgu();

    private bgu() {
    }

    public final boolean a(Canvas canvas, Path path) {
        boolean quickReject;
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    public final boolean b(Canvas canvas, RectF rectF) {
        boolean quickReject;
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }

    public final boolean c(Canvas canvas, float f, float f2, float f3, float f4) {
        boolean quickReject;
        quickReject = canvas.quickReject(f, f2, f3, f4);
        return quickReject;
    }
}
