package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.google.android.apps.adm.devicepicker.DevicePickerSkeletonLoader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzq extends AnimatorListenerAdapter {
    final /* synthetic */ AnimatorSet a;
    final /* synthetic */ DevicePickerSkeletonLoader b;

    public dzq(DevicePickerSkeletonLoader devicePickerSkeletonLoader, AnimatorSet animatorSet) {
        this.a = animatorSet;
        this.b = devicePickerSkeletonLoader;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        DevicePickerSkeletonLoader devicePickerSkeletonLoader = this.b;
        if (devicePickerSkeletonLoader.j) {
            this.a.start();
        } else {
            devicePickerSkeletonLoader.i = jdl.a;
        }
    }
}
