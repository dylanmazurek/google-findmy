package defpackage;

import android.graphics.Path;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzr {
    public static boolean a(ViewGroup viewGroup) {
        return viewGroup.getClipToPadding();
    }

    public static Path b(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }
}
