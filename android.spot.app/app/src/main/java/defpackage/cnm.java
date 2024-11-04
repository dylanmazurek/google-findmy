package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnm {
    static void a(Object obj) {
        ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
    }

    public static void b(Object obj, Object obj2) {
        ((AnimatedVectorDrawable) obj).registerAnimationCallback(fr$$ExternalSyntheticApiModelOutline0.m101m(obj2));
    }

    public static boolean c(Object obj, Object obj2) {
        boolean unregisterAnimationCallback;
        unregisterAnimationCallback = ((AnimatedVectorDrawable) obj).unregisterAnimationCallback(fr$$ExternalSyntheticApiModelOutline0.m101m(obj2));
        return unregisterAnimationCallback;
    }
}
