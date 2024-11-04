package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cly {
    static long a(Animator animator) {
        long totalDuration;
        totalDuration = animator.getTotalDuration();
        return totalDuration;
    }

    static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    public void e(int i) {
        throw null;
    }

    public void c(int i) {
    }

    public void d(int i, float f, int i2) {
    }
}
