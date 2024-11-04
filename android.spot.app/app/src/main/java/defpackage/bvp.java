package defpackage;

import android.view.VelocityTracker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(VelocityTracker velocityTracker, int i) {
        float axisVelocity;
        axisVelocity = velocityTracker.getAxisVelocity(i);
        return axisVelocity;
    }

    static float b(VelocityTracker velocityTracker, int i, int i2) {
        float axisVelocity;
        axisVelocity = velocityTracker.getAxisVelocity(i, i2);
        return axisVelocity;
    }

    static boolean c(VelocityTracker velocityTracker, int i) {
        boolean isAxisSupported;
        isAxisSupported = velocityTracker.isAxisSupported(i);
        return isAxisSupported;
    }
}
