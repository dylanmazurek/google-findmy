package defpackage;

import android.graphics.Canvas;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asz {
    public static final asz a = new asz();

    private asz() {
    }

    public final Canvas a(Surface surface) {
        Canvas lockHardwareCanvas;
        lockHardwareCanvas = surface.lockHardwareCanvas();
        return lockHardwareCanvas;
    }
}
