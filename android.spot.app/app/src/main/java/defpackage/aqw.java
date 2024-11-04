package defpackage;

import android.graphics.Canvas;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqw {
    public static final aqw a = new aqw();

    private aqw() {
    }

    public final void a(Canvas canvas, boolean z) {
        if (!z) {
            canvas.disableZ();
        } else {
            canvas.enableZ();
        }
    }
}
